package data.type

import data.DataContainer
import data.SVari
import data.Visitor
import java.util.regex.Pattern

//The class behind the File type
class SFile(val content: MutableMap<String, SVari>, names: List<SName> = listOf(), var output: String = "") :
    SVari("File", names) {

    //Lists the path witch the variables reachable from this variable ar reachable throw this variable
    //The Refe-s use it
    override fun listPaths(): SList<SList<SName>> {
        val result = SList<SList<SName>>(mutableListOf())
        for (key in content.keys) {
            val vari = content[key]
            val variPaths = vari?.listPaths()
            variPaths?.let {
                for (path in variPaths)
                    path.add(0, SName(key))
                result.addAll(variPaths)
            }
            result.add(SList(mutableListOf(SName(key))))

        }

        result.addAll(
            SList(mutableListOf(
                SList(mutableListOf(SName("names"))),
                SList(mutableListOf(SName("self"))),
                SList(mutableListOf(SName("copy"))),
                SList(mutableListOf(SName("type")))

            ))
        )

        for (i in 0 until content.size){
            val root=SName(i.toString())
            val pathL=content.values.toList()[i].listPaths()
            for(p in pathL){
                p.add(0,root)
                result.add(p)
            }
        }
        result.addAll(content.values.toList().toSList().listPaths().map { it.add(0,SName("cont")); it})
        return result
    }

    //Makes a copy from the variable dividing its elements by a given String
    override fun copy(names: List<SName>): SFile {
        val result = SFile(content, SList(names as MutableList<SName>))
        for (key in content.keys)
            result.content[key] = result.content[key]?.copy() ?: throw Exception("Error during copying")
        return result
    }

    //Makes a copy from the variable dividing its elements by a given String
    override fun extend(divider: String): String {
        var result = ""
        for (c in content.values)
            result += (divider + c.extend())
        result = result.substring(divider.length)
        return result
    }

    //Plusses a new variable to the variable
    //You can add only names to a File
    override fun plus(
        v: SVari,
        path: SList<SName>,
        pairs: SList<SList<SName>>
    ): SVari =
        when {
            path.isEmpty() -> {
                this
            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> {
                        when {
                            v is SList<*> && v.size != 0 && v[0] is SName
                            -> addNames(v.filter { it is SName }.map { it as SName })
                            v is SList.SIter<*> && v.owner.size != 0 && v.owner[0] is SName
                            -> addNames(v.owner.filter { it is SName }.map { it as SName })
                            v is SName -> addNames(SList(mutableListOf(v)))
                        }
                        this
                    }
                    else -> throw  Exception(
                        "unknown keyword for special char: ${names[DataContainer.focus
                            ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
                    )
                }
            }
        }

    //Returns the variable on the given relative path
    //File is a Cont
    //You can reach its content by name
    //It has an outp attribute with the Text with the code generated by the compiling of the Slime file
    override fun get(path: SList<SName>): SVari =
        when {
            path.isEmpty() -> this
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names" -> (names[DataContainer.focus ?: throw Exception("No file in focus!")]
                        ?: throw Exception("No name in this namespace")).toSList(owner = this).get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "type" -> ctype
                    "cont" -> content.values.toList().toSList(owner = this).get(path)
                    "iter" -> content.values.toList().toSList(owner = this).iter.get(path)
                    "outp" -> SText(output)
                    in content.keys -> content[next]?.get(path)
                        ?: throw Exception("Wrong variable name: $next")
                    else ->
                        if (Pattern.matches("^[0-9]*$", next))
                            content.values.toList()[next.toInt()].get(path)
                        else throw Exception("Wrong variable name: $next")
                }
            }
        }

    //Deletes the reference on the given relative path
    override fun delete(path: SList<SName>) {
        when {
            path.isEmpty() -> throw Exception(
                "path shouldn't be empty when deleting from STemp: ${names[DataContainer.focus
                    ?: throw Exception("No file in focus!")]?.getOrNull(0) ?: "@nameless"}"
            )
            path.size == 1 -> {
                val next = path[0]()
                path.removeAt(0)
                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    content.remove(content.keys.toList()[i])
                } else
                    content.remove(next)


            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                if (Pattern.matches("^[0-9]*$", next)) {
                    val i = next.toInt()
                    content.values.toList()[i].delete(path)
                } else
                    content[next]?.delete(path)


            }
        }
    }

    //Visitor pattern
    override fun accept(v: Visitor, mod: String): SVari = v.visit(this, mod)
}
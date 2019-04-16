package data.type

import data.*
import java.lang.Exception

class SSpec(val key: Char, names: List<SText> = listOf()) : SVari("Spec",names) {

    enum class Char(val value: String, val names: MutableList<String>) {
        ENTER("\n", mutableListOf("e", "ent", "enter")),
        RENTER("\r", mutableListOf("r", "ren", "renter")),
        TABULATOR("\t", mutableListOf("t", "tab", "tabulator")),
        SPACE(" ", mutableListOf("sp", "spa", "space")),
        PERIOD(".", mutableListOf("pe", "per", "period")),
        QUESTION_MARK("?", mutableListOf("qu", "qum", "question_mark")),
        EXCLAMATION_MARK("!", mutableListOf("ex", "exm", "exclamation_mark")),
        COMMA(",", mutableListOf("co", "com", "comma")),
        COLON(":", mutableListOf("cl", "col", "colon")),
        SEMICOLON(";", mutableListOf("se", "sem", "semicolon"))
    }

    override fun listPaths(): SList<SList<SText>> = SList()

    override fun copy(names: List<SText>): SVari = SSpec(key,names)

    override fun expand(): String = key.value

    override fun expand(divider: String): String = key.value

    override fun plus(v: SVari, i: Int): SVari =
        throw Exception("You can not add into special character:{${names.getOrNull(0)?:"@nameless"}")

    override fun get(path: SList<SText>): SVari =
        when {
            path.isEmpty() -> this
            path.size == 1 -> {
                when (path[0]()) {
                    "names"-> names
                    "self" -> this
                    "copy" -> copy()
                    "copyN" -> copy(names)
                    else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
            else -> {
                val next = path[0]()
                path.removeAt(0)
                when (next) {
                    "names"-> names.get(path)
                    "self" -> this.get(path)
                    "copy" -> copy().get(path)
                    "copyN" -> copy(names).get(path)
                    else -> throw  Exception("unknown keyword for special char: ${names.getOrNull(0)?:"@nameless"}")
                }
            }
        }

    override fun delete(path: SList<SText>) =
        throw Exception("You cannot delete SVari from SSpec SVari:{${names.getOrNull(0)?:"@nameless"}")

    override fun visit(v: Visitor, mod: String): SVari = v.accept(this, mod)
}
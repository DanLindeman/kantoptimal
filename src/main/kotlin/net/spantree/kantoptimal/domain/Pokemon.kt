package net.spantree.kantoptimal.domain


//data class Pokemon(val id: Int, val name: String, val type1: Type, val type2: Type? = null)


class Pokemon{
    var id: Int? = null
    var name: String? = null
    var type1: Type? = null
    var type2: Type? = null
    var strongAgainst: List<String>
    var weakAgainst: List<String>

    constructor(id: Int?, name: String?, type1: Type?, type2: Type? = null) {
        this.id = id
        this.name = name
        this.type1 = type1
        this.type2 = type2
        this.strongAgainst = listOfNotNull(type1?.strongAgainst?.map { it.toString() }, type2?.strongAgainst?.map { it.toString() }).flatten()
        this.weakAgainst= listOfNotNull(type1?.weakAgainst?.map { it.toString() }, type2?.weakAgainst?.map { it.toString() }).flatten()
    }

    fun isStrongAgainst(type: Type): Boolean {
        return this.strongAgainst.contains(type.name.toString())
    }

    fun isWeakAgainst(type:Type): Boolean {
        return this.weakAgainst.contains(type.name.toString())
    }

    override fun toString(): String {
        return "Pokemon(name=$name)"
    }
}
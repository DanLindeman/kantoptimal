package net.spantree.kantoptimal.domain

import org.optaplanner.core.api.domain.entity.PlanningEntity
import org.optaplanner.core.api.domain.variable.PlanningVariable

@PlanningEntity
class TeamSlot {

    var id: Int = 0

    @PlanningVariable(valueRangeProviderRefs = ["pokeRange"])
    var pokemon: Pokemon? = null

    override fun equals(other: Any?): Boolean {
        return this.id == (other as TeamSlot).id
    }

    override fun toString(): String {
        return "TeamSlot(id=$id, pokemon=${pokemon?.name})"
    }

    constructor()

    constructor(id: Int, pokemon: Pokemon?) {
        this.id = id
        this.pokemon = pokemon
    }
}

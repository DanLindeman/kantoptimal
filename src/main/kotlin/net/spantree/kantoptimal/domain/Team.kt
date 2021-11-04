package net.spantree.kantoptimal.domain

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
import org.optaplanner.core.api.domain.solution.PlanningScore
import org.optaplanner.core.api.domain.solution.PlanningSolution
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider
import org.optaplanner.core.api.domain.variable.PlanningVariable
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore

@PlanningSolution
class Team() {

    @PlanningEntityCollectionProperty
    lateinit var team: List<TeamSlot>

    @PlanningScore
    lateinit var score: HardSoftScore

    @ValueRangeProvider(id = "pokeRange")
    @ProblemFactCollectionProperty
    lateinit var pokemon: List<Pokemon>

    @ValueRangeProvider(id = "pokeTypes")
    @ProblemFactCollectionProperty
    lateinit var types: List<Type>

    constructor(team: List<TeamSlot>, pokemon: List<Pokemon>, types: List<Type>): this() {
        this.team = team
        this.pokemon = pokemon
        this.types = types
//        this.typeStrengths
//        this.typeWeaknesses
    }

    override fun toString(): String {
        return "Team(team=$team, score=$score)"
    }
}
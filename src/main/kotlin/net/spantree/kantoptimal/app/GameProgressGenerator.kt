package net.spantree.kantoptimal.app

import net.spantree.kantoptimal.domain.POKEDEX
import net.spantree.kantoptimal.domain.Pokemon
import net.spantree.kantoptimal.domain.TypeEnum
import net.spantree.kantoptimal.domain.Types
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class GameProgressGenerator {

    @Bean
    fun init() = CommandLineRunner {
        //        var types = mutableSetOf<TypeEnum>()
//
//        val beforeBrock = firstGym()
//        val typesBeforeBrock = currentlyAvailableTypes(beforeBrock)
//
//        types.addAll(typesBeforeBrock)
//        // [GRASS, FIRE, WATER, BUG, NORMAL, ELECTRIC, POISON, FLYING]
//        println(types)
//
//        val beforeMisty = secondGym()
//        val typesBeforeMisty = currentlyAvailableTypes(beforeMisty)
//        types.addAll(typesBeforeMisty)
//        // [..., PSYCHIC, ROCK, GROUND]
//        println(types)
        /*
        * All that remains is ICE, FIGHTING, and DRAGON
        * Route 5 has a Mankey
        * Poliwhirl can be traded for Jynx, so as soon as you get Poliwag
        * Dratini is the only Dragon-type in the game.
        * */
        val team = listOf(
                POKEDEX["Jynx"]!!,
                POKEDEX["Hitmonlee"]!!,
                POKEDEX["Electrode"]!!,
                POKEDEX["Pinsir"]!!,
                POKEDEX["Diglett"]!!,
                POKEDEX["Haunter"]!!
        )
        val coverage = calculateCoverage(team)
        val gaps = getCoverageGaps(coverage)
        val weaknesses = calculateWeaknesses(team)
        println("======== Team ========")
        team.forEach {
            println(it.name)
        }
//        println("-------- Stats -------")
        println("Coverage: $coverage")
        println("Gaps: $gaps")
        println("SCORE: ${coverage.size - 15}")
        println("Weaknesses: $weaknesses")
        println("======================")
    }
}

fun getCoverageGaps(strengths: List<TypeEnum>): List<TypeEnum> {
    return TypeEnum.values().filter { it !in strengths }
}

fun calculateCoverage(team: List<Pokemon>): List<TypeEnum> {
    return team.map {pokemon ->
        pokemon.type1?.strongAgainst!! + (pokemon.type2?.strongAgainst?.asIterable() ?: listOf())
    }.flatten().distinct()
}

fun calculateWeaknesses(team: List<Pokemon>): List<TypeEnum> {
    val types = team.map { listOfNotNull(it.type1?.name, it.type2?.name) }.flatten().distinct()
    var weaknesses = mutableListOf<TypeEnum>()
    Types.forEach {
        it.strongAgainst.forEach {
            if (types.contains(it)) {
                weaknesses.add(it)
            }
        }
    }
    return weaknesses.distinct()
}

fun firstGym(): List<Pokemon> {
    val starters = listOf(1, 2, 4, 5, 7, 8)
    val route1 = listOf(16, 17, 19)
    val route22 = listOf(16, 17, 21, 29, 32)
    val viridianForest = listOf(10, 11, 12, 13, 14, 15, 25)

    val availablePokemonIds = setOf(starters, route1, route22, viridianForest).flatten()
    return POKEDEX.values.filter { it.id in availablePokemonIds }
}

fun secondGym(): List<Pokemon> {
    val route3 = listOf(16, 17, 21, 39)
    val route4 = listOf(129)
    val mtMoon = listOf(35, 41, 46, 74)
    val route24 = listOf(10, 11, 12, 13, 14, 15, 43, 63, 64, 69)
    val route25 = listOf(10, 11, 12, 13, 14, 15, 16, 43, 63, 64, 69)

    val availablePokemonIds = setOf(route3, route4, mtMoon, route24, route25).flatten()
    return POKEDEX.values.filter { it.id in availablePokemonIds }
}


fun main(args: Array<String>) {
    runApplication<GameProgressGenerator>(*args)
}

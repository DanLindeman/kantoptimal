package net.spantree.kantoptimal.app


import net.spantree.kantoptimal.domain.POKEDEX
import net.spantree.kantoptimal.domain.Team
import net.spantree.kantoptimal.domain.TeamSlot
import net.spantree.kantoptimal.domain.Types
import org.optaplanner.core.api.solver.Solver
import org.optaplanner.core.api.solver.SolverFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class KantoptimalApp {

    @Bean
    fun init() = CommandLineRunner {
        println("ok")
    }

    fun main(args: Array<String>) {
        runApplication<KantoptimalApp>(*args)
        val solution = Team(listOf(
                TeamSlot(1, null),
                TeamSlot(2, null),
                TeamSlot(3, null),
                TeamSlot(4, null),
                TeamSlot(5, null),
                TeamSlot(6, null)
        ),
                POKEDEX.values.toList(),
                Types
        )

        val solverFactory: SolverFactory<Team> = SolverFactory.createFromXmlResource(
                "solverConfig.xml")
        val solver: Solver<Team> = solverFactory.buildSolver()
        val newTeam = solver.solve(solution)

        val scoreDirector = solver.scoreDirectorFactory.buildScoreDirector()
        println(newTeam)
        scoreDirector.workingSolution = newTeam
    }
}


fun main(args: Array<String>) {
    runApplication<KantoptimalApp>(*args)

    val solution = Team(listOf(
            TeamSlot(1, null),
            TeamSlot(2, null),
            TeamSlot(3, null),
            TeamSlot(4, null),
            TeamSlot(5, null),
            TeamSlot(6, null)
    ),
            POKEDEX.values.toList(),
            Types
    )

    val solverFactory: SolverFactory<Team> = SolverFactory.createFromXmlResource(
            "solverConfig.xml")
    val solver: Solver<Team> = solverFactory.buildSolver()
    val newTeam = solver.solve(solution)

    val scoreDirector = solver.scoreDirectorFactory.buildScoreDirector()
    println(newTeam)
    scoreDirector.workingSolution = newTeam
}

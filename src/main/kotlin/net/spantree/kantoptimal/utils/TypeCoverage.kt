package net.spantree.kantoptimal.utils

data class BaseAttackTypeStrengths(
        val normal: Double = 1.0,
        val fighting: Double = 1.0,
        val flying: Double = 1.0,
        val poison: Double = 1.0,
        val ground: Double = 1.0,
        val rock: Double = 1.0,
        val bug: Double = 1.0,
        val ghost: Double = 1.0,
        val fire: Double = 1.0,
        val water: Double = 1.0,
        val grass: Double = 1.0,
        val electric: Double = 1.0,
        val psychic: Double = 1.0,
        val ice: Double = 1.0,
        val dragon: Double = 1.0
)

val normalAttackTypeStrengths = BaseAttackTypeStrengths(
        rock = 0.5,
        ghost = 0.0
)

val fightingAttackTypeStrengths = BaseAttackTypeStrengths(
        normal = 2.0,
        flying = 0.5,
        poison = 0.5,
        rock = 2.0,
        bug = 0.5,
        ghost = 0.0,
        psychic = 0.5,
        ice = 2.0
)

val flyingAttackTypeStrengths = BaseAttackTypeStrengths(
        fighting = 2.0,
        rock = 0.5,
        bug = 2.0,
        grass = 2.0,
        electric = 0.5
)

val poisonAttackTypeStrengths = BaseAttackTypeStrengths(
        poison = 0.5,
        ground = 0.5,
        rock = 0.5,
        bug = 2.0,
        ghost = 0.5,
        grass = 2.0
)

val groundAttackTypeStrengths = BaseAttackTypeStrengths(
        flying = 0.0,
        poison = 2.0,
        rock = 2.0,
        bug = 0.5,
        fire = 2.0,
        grass = 0.5,
        electric = 2.0
)

val rockAttackTypeStrengths = BaseAttackTypeStrengths(
        fighting = 0.5,
        flying = 2.0,
        ground = 0.5,
        bug = 2.0,
        fire = 2.0,
        ice = 2.0
)

val bugAttackTypeStrengths = BaseAttackTypeStrengths(
        fighting = 0.5,
        flying = 0.5,
        poison = 2.0,
        ghost = 0.5,
        fire = 0.5,
        grass = 2.0,
        psychic = 2.0
)

val ghostAttackTypeStrengths = BaseAttackTypeStrengths(
        normal = 0.0,
        ghost = 2.0,
        psychic = 0.0
)

val fireAttackTypeStrengths = BaseAttackTypeStrengths(
        rock = 0.5,
        bug = 2.0,
        fire = 0.5,
        water = 0.5,
        grass = 2.0,
        ice = 2.0,
        dragon = 0.5
)

val waterAttackTypeStrengths = BaseAttackTypeStrengths(
        ground = 2.0,
        rock = 2.0,
        fire = 2.0,
        water = 0.5,
        grass = 0.5,
        dragon = 0.5
)

val grassAttackTypeStrengths = BaseAttackTypeStrengths(
        flying = 0.5,
        poison = 0.5,
        ground = 2.0,
        rock = 2.0,
        bug = 0.5,
        fire = 0.5,
        water = 2.0,
        grass = 0.5,
        dragon = 0.5
)

val electricAttackTypeStrengths = BaseAttackTypeStrengths(
        flying = 2.0,
        ground = 0.0,
        water = 2.0,
        grass = 0.5,
        electric = 0.5,
        dragon = 0.5
)

val psychicAttackTypeStrengths = BaseAttackTypeStrengths(
        fighting = 2.0,
        poison = 2.0,
        psychic = 0.5
)

val iceAttackTypeStrengths = BaseAttackTypeStrengths(
        flying = 2.0,
        ground = 2.0,
        water = 0.5,
        grass = 2.0,
        ice = 0.5,
        dragon = 2.0
)

val dragonAttackTypeStrengths = BaseAttackTypeStrengths(
        dragon = 2.0
)

val typeStrengths = listOf(
        normalAttackTypeStrengths,
        fightingAttackTypeStrengths,
        flyingAttackTypeStrengths,
        poisonAttackTypeStrengths,
        groundAttackTypeStrengths,
        rockAttackTypeStrengths,
        bugAttackTypeStrengths,
        ghostAttackTypeStrengths,
        fireAttackTypeStrengths,
        waterAttackTypeStrengths,
        grassAttackTypeStrengths,
        electricAttackTypeStrengths,
        psychicAttackTypeStrengths,
        iceAttackTypeStrengths,
        dragonAttackTypeStrengths
)
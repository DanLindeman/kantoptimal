package net.spantree.kantoptimal.domain

enum class TypeEnum {
    BUG,
    DRAGON,
    ICE,
    FIGHTING,
    FIRE,
    FLYING,
    GRASS,
    GHOST,
    GROUND,
    ELECTRIC,
    NORMAL,
    POISON,
    PSYCHIC,
    ROCK,
    WATER
}


data class Type(val name: TypeEnum,
                val strongAgainst: List<TypeEnum>,
                val weakAgainst: List<TypeEnum>,
                val blankAgainst: List<TypeEnum>)

val Normal = Type(
        name = TypeEnum.NORMAL,
        strongAgainst = listOf(),
        weakAgainst = listOf(TypeEnum.ROCK),
        blankAgainst = listOf(TypeEnum.GHOST)
)

val Fighting = Type(
        name = TypeEnum.FIGHTING,
        strongAgainst = listOf(TypeEnum.NORMAL, TypeEnum.ROCK, TypeEnum.ICE),
        weakAgainst = listOf(TypeEnum.POISON, TypeEnum.BUG, TypeEnum.PSYCHIC, TypeEnum.FLYING),
        blankAgainst = listOf(TypeEnum.GHOST)
)

val Flying = Type(
        name = TypeEnum.FLYING,
        strongAgainst = listOf(TypeEnum.BUG, TypeEnum.GRASS, TypeEnum.FIGHTING),
        weakAgainst = listOf(TypeEnum.ROCK, TypeEnum.ELECTRIC),
        blankAgainst = listOf()
)

val Poison = Type(
        name = TypeEnum.POISON,
        strongAgainst = listOf(TypeEnum.BUG, TypeEnum.GRASS),
        weakAgainst = listOf(TypeEnum.POISON, TypeEnum.ROCK, TypeEnum.GROUND, TypeEnum.GHOST),
        blankAgainst = listOf()
)

val Ground = Type(
        name = TypeEnum.GROUND,
        strongAgainst = listOf(TypeEnum.POISON, TypeEnum.ROCK, TypeEnum.FIRE, TypeEnum.ELECTRIC),
        weakAgainst = listOf(TypeEnum.BUG, TypeEnum.GRASS),
        blankAgainst = listOf(TypeEnum.FLYING)
)

val Rock = Type(
        name = TypeEnum.ROCK,
        strongAgainst = listOf(TypeEnum.FLYING, TypeEnum.BUG, TypeEnum.FIRE, TypeEnum.ICE),
        weakAgainst = listOf(TypeEnum.FIGHTING, TypeEnum.GROUND),
        blankAgainst = listOf()
)

val Bug = Type(
        name = TypeEnum.BUG,
        strongAgainst = listOf(TypeEnum.POISON, TypeEnum.GRASS, TypeEnum.PSYCHIC),
        weakAgainst = listOf(TypeEnum.FLYING, TypeEnum.GHOST, TypeEnum.FIRE, TypeEnum.FIGHTING),
        blankAgainst = listOf()
)

val Ghost = Type(
        name = TypeEnum.GHOST,
        strongAgainst = listOf(TypeEnum.GHOST),
        weakAgainst = listOf(),
        blankAgainst = listOf(TypeEnum.NORMAL, TypeEnum.PSYCHIC)
)

val Fire = Type(
        name = TypeEnum.FIRE,
        strongAgainst = listOf(TypeEnum.BUG, TypeEnum.GRASS, TypeEnum.ICE),
        weakAgainst = listOf(TypeEnum.ROCK, TypeEnum.FIRE, TypeEnum.WATER, TypeEnum.DRAGON),
        blankAgainst = listOf()
)

val Water = Type(
        name = TypeEnum.WATER,
        strongAgainst = listOf(TypeEnum.GROUND, TypeEnum.ROCK, TypeEnum.FIRE),
        weakAgainst = listOf(TypeEnum.WATER, TypeEnum.GRASS, TypeEnum.DRAGON),
        blankAgainst = listOf()

)

val Grass = Type(
        name = TypeEnum.GRASS,
        strongAgainst = listOf(TypeEnum.WATER, TypeEnum.GROUND, TypeEnum.ROCK),
        weakAgainst = listOf(TypeEnum.FLYING, TypeEnum.POISON, TypeEnum.BUG, TypeEnum.FIRE, TypeEnum.GRASS, TypeEnum.DRAGON),
        blankAgainst = listOf()
)

val Electric = Type(
        name = TypeEnum.ELECTRIC,
        strongAgainst = listOf(TypeEnum.FLYING, TypeEnum.WATER),
        weakAgainst = listOf(TypeEnum.ELECTRIC, TypeEnum.GRASS, TypeEnum.DRAGON),
        blankAgainst = listOf(TypeEnum.GROUND)
)

val Psychic = Type(
        name = TypeEnum.PSYCHIC,
        strongAgainst = listOf(TypeEnum.FIGHTING, TypeEnum.POISON),
        weakAgainst = listOf(TypeEnum.PSYCHIC),
        blankAgainst = listOf()
)

val Ice = Type(
        name = TypeEnum.ICE,
        strongAgainst = listOf(TypeEnum.FLYING, TypeEnum.GROUND, TypeEnum.GRASS, TypeEnum.DRAGON),
        weakAgainst = listOf(TypeEnum.WATER, TypeEnum.ICE),
        blankAgainst = listOf()
)

val Dragon = Type(
        name = TypeEnum.DRAGON,
        strongAgainst = listOf(TypeEnum.DRAGON),
        weakAgainst = listOf(),
        blankAgainst = listOf()
)

val Types = listOf(
        Normal,
        Fighting,
        Flying,
        Poison,
        Ground,
        Rock,
        Bug,
        Ghost,
        Fire,
        Water,
        Grass,
        Electric,
        Psychic,
        Ice,
        Dragon
)

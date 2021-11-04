package net.spantree.kantoptimal.domain


val POKEDEX = mapOf(
        "Bulbasaur" to Pokemon(1, "Bulbasaur", Grass, Poison),
        "Ivysaur" to Pokemon(2, "Ivysaur", Grass, Poison),
        "Venusaur" to Pokemon(3, "Venusaur", Grass, Poison),
        "Charmander" to Pokemon(4, "Charmander", Fire),
        "Charmeleon" to Pokemon(5, "Charmeleon", Fire),
        "Charizard" to Pokemon(6, "Charizard", Fire, Flying),
        "Squirtle" to Pokemon(7, "Squirtle", Water),
        "Wartortle" to Pokemon(8, "Wartortle", Water),
        "Blastoise" to Pokemon(9, "Blastoise", Water),
        "Caterpie" to Pokemon(10, "Caterpie", Bug),
        "Metapod" to Pokemon(11, "Metapod", Bug),
        "Butterfree" to Pokemon(12, "Butterfree", Bug, Flying),
        "Weedle" to Pokemon(13, "Weedle", Bug, Poison),
        "Kakuna" to Pokemon(14, "Kakuna", Bug, Poison),
        "Beedrill" to Pokemon(15, "Beedrill", Bug, Poison),
        "Pidgey" to Pokemon(16, "Pidgey", Normal, Flying),
        "Pidgeotto" to Pokemon(17, "Pidgeotto", Normal, Flying),
        "Pidgeot" to Pokemon(18, "Pidgeot", Normal, Flying),
        "Rattata" to Pokemon(19, "Rattata", Normal),
        "Raticate" to Pokemon(20, "Raticate", Normal),
        "Spearow" to Pokemon(21, "Spearow", Normal, Flying),
        "Fearow" to Pokemon(22, "Fearow", Normal, Flying),
        "Ekans" to Pokemon(23, "Ekans", Poison),
        "Arbok" to Pokemon(24, "Arbok", Poison),
        "Pikachu" to Pokemon(25, "Pikachu", Electric),
        "Raichu" to Pokemon(26, "Raichu", Electric),
        "Sandshrew" to Pokemon(27, "Sandshrew", Ground),
        "Sandslash" to Pokemon(28, "Sandslash", Ground),
        "Nidoran♀" to Pokemon(29, "Nidoran♀", Poison),
        "Nidorina" to Pokemon(30, "Nidorina", Poison),
        "Nidoqueen" to Pokemon(31, "Nidoqueen", Poison, Ground),
        "Nidoran♂" to Pokemon(32, "Nidoran♂", Poison),
        "Nidorino" to Pokemon(33, "Nidorino", Poison),
        "Nidoking" to Pokemon(34, "Nidoking", Poison, Ground),
        "Clefairy" to Pokemon(35, "Clefairy", Normal),
        "Clefable" to Pokemon(36, "Clefable", Normal),
        "Vulpix" to Pokemon(37, "Vulpix", Fire),
        "Ninetales" to Pokemon(38, "Ninetales", Fire),
        "Jigglypuff" to Pokemon(39, "Jigglypuff", Normal),
        "Wigglytuff" to Pokemon(40, "Wigglytuff", Normal),
        "Zubat" to Pokemon(41, "Zubat", Poison, Flying),
        "Golbat" to Pokemon(42, "Golbat", Poison, Flying),
        "Oddish" to Pokemon(43, "Oddish", Grass, Poison),
        "Gloom" to Pokemon(44, "Gloom", Grass, Poison),
        "Vileplume" to Pokemon(45, "Vileplume", Grass, Poison),
        "Paras" to Pokemon(46, "Paras", Bug, Grass),
        "Parasect" to Pokemon(47, "Parasect", Bug, Grass),
        "Venonat" to Pokemon(48, "Venonat", Bug, Poison),
        "Venomoth" to Pokemon(49, "Venomoth", Bug, Poison),
        "Diglett" to Pokemon(50, "Diglett", Ground),
        "Dugtrio" to Pokemon(51, "Dugtrio", Ground),
        "Meowth" to Pokemon(52, "Meowth", Normal),
        "Persian" to Pokemon(53, "Persian", Normal),
        "Psyduck" to Pokemon(54, "Psyduck", Water),
        "Golduck" to Pokemon(55, "Golduck", Water),
        "Mankey" to Pokemon(56, "Mankey", Fighting),
        "Primeape" to Pokemon(57, "Primeape", Fighting),
        "Growlithe" to Pokemon(58, "Growlithe", Fire),
        "Arcanine" to Pokemon(59, "Arcanine", Fire),
        "Poliwag" to Pokemon(60, "Poliwag", Water),
        "Poliwhirl" to Pokemon(61, "Poliwhirl", Water),
        "Poliwrath" to Pokemon(62, "Poliwrath", Water, Fighting),
        "Abra" to Pokemon(63, "Abra", Psychic),
        "Kadabra" to Pokemon(64, "Kadabra", Psychic),
        "Alakazam" to Pokemon(65, "Alakazam", Psychic),
        "Machop" to Pokemon(66, "Machop", Fighting),
        "Machoke" to Pokemon(67, "Machoke", Fighting),
        "Machamp" to Pokemon(68, "Machamp", Fighting),
        "Bellsprout" to Pokemon(69, "Bellsprout", Grass, Poison),
        "Weepinbell" to Pokemon(70, "Weepinbell", Grass, Poison),
        "Victreebel" to Pokemon(71, "Victreebel", Grass, Poison),
        "Tentacool" to Pokemon(72, "Tentacool", Water, Poison),
        "Tentacruel" to Pokemon(73, "Tentacruel", Water, Poison),
        "Geodude" to Pokemon(74, "Geodude", Rock, Ground),
        "Graveler" to Pokemon(75, "Graveler", Rock, Ground),
        "Golem" to Pokemon(76, "Golem", Rock, Ground),
        "Ponyta" to Pokemon(77, "Ponyta", Fire),
        "Rapidash" to Pokemon(78, "Rapidash", Fire),
        "Slowpoke" to Pokemon(79, "Slowpoke", Water, Psychic),
        "Slowbro" to Pokemon(80, "Slowbro", Water, Psychic),
        "Magnemite" to Pokemon(81, "Magnemite", Electric),
        "Magneton" to Pokemon(82, "Magneton", Electric),
        "Farfetch'd" to Pokemon(83, "Farfetch'd", Normal, Flying),
        "Doduo" to Pokemon(84, "Doduo", Normal, Flying),
        "Dodrio" to Pokemon(85, "Dodrio", Normal, Flying),
        "Seel" to Pokemon(86, "Seel", Water),
        "Dewgong" to Pokemon(87, "Dewgong", Water, Ice),
        "Grimer" to Pokemon(88, "Grimer", Poison),
        "Muk" to Pokemon(89, "Muk", Poison),
        "Shellder" to Pokemon(90, "Shellder", Water),
        "Cloyster" to Pokemon(91, "Cloyster", Water, Ice),
        "Gastly" to Pokemon(92, "Gastly", Ghost, Poison),
        "Haunter" to Pokemon(93, "Haunter", Ghost, Poison),
        "Gengar" to Pokemon(94, "Gengar", Ghost, Poison),
        "Onix" to Pokemon(95, "Onix", Rock, Ground),
        "Drowzee" to Pokemon(96, "Drowzee", Psychic),
        "Hypno" to Pokemon(97, "Hypno", Psychic),
        "Krabby" to Pokemon(98, "Krabby", Water),
        "Kingler" to Pokemon(99, "Kingler", Water),
        "Voltorb" to Pokemon(100, "Voltorb", Electric),
        "Electrode" to Pokemon(101, "Electrode", Electric),
        "Exeggcute" to Pokemon(102, "Exeggcute", Grass, Psychic),
        "Exeggutor" to Pokemon(103, "Exeggutor", Grass, Psychic),
        "Cubone" to Pokemon(104, "Cubone", Ground),
        "Marowak" to Pokemon(105, "Marowak", Ground),
        "Hitmonlee" to Pokemon(106, "Hitmonlee", Fighting),
        "Hitmonchan" to Pokemon(107, "Hitmonchan", Fighting),
        "Lickitung" to Pokemon(108, "Lickitung", Normal),
        "Koffing" to Pokemon(109, "Koffing", Poison),
        "Weezing" to Pokemon(110, "Weezing", Poison),
        "Rhyhorn" to Pokemon(111, "Rhyhorn", Ground, Rock),
        "Rhydon" to Pokemon(112, "Rhydon", Ground, Rock),
        "Chansey" to Pokemon(113, "Chansey", Normal),
        "Tangela" to Pokemon(114, "Tangela", Grass),
        "Kangaskhan" to Pokemon(115, "Kangaskhan", Normal),
        "Horsea" to Pokemon(116, "Horsea", Water),
        "Seadra" to Pokemon(117, "Seadra", Water),
        "Goldeen" to Pokemon(118, "Goldeen", Water),
        "Seaking" to Pokemon(119, "Seaking", Water),
        "Staryu" to Pokemon(120, "Staryu", Water),
        "Starmie" to Pokemon(121, "Starmie", Water, Psychic),
        "Mr.Mime" to Pokemon(122, "Mr.Mime", Psychic),
        "Scyther" to Pokemon(123, "Scyther", Bug, Flying),
        "Jynx" to Pokemon(124, "Jynx", Ice, Psychic),
        "Electabuzz" to Pokemon(125, "Electabuzz", Electric),
        "Magmar" to Pokemon(126, "Magmar", Fire),
        "Pinsir" to Pokemon(127, "Pinsir", Bug),
        "Tauros" to Pokemon(128, "Tauros", Normal),
        "Magikarp" to Pokemon(129, "Magikarp", Water),
        "Gyarados" to Pokemon(130, "Gyarados", Water, Flying),
        "Lapras" to Pokemon(131, "Lapras", Water, Ice),
        "Ditto" to Pokemon(132, "Ditto", Normal),
        "Eevee" to Pokemon(133, "Eevee", Normal),
        "Vaporeon" to Pokemon(134, "Vaporeon", Water),
        "Jolteon" to Pokemon(135, "Jolteon", Electric),
        "Flareon" to Pokemon(136, "Flareon", Fire),
        "Porygon" to Pokemon(137, "Porygon", Normal),
        "Omanyte" to Pokemon(138, "Omanyte", Rock, Water),
        "Omastar" to Pokemon(139, "Omastar", Rock, Water),
        "Kabuto" to Pokemon(140, "Kabuto", Rock, Water),
        "Kabutops" to Pokemon(141, "Kabutops", Rock, Water),
        "Aerodactyl" to Pokemon(142, "Aerodactyl", Rock, Flying),
        "Snorlax" to Pokemon(143, "Snorlax", Normal),
        "Articuno" to Pokemon(144, "Articuno", Ice, Flying),
        "Zapdos" to Pokemon(145, "Zapdos", Electric, Flying),
        "Moltres" to Pokemon(146, "Moltres", Fire, Flying),
        "Dratini" to Pokemon(147, "Dratini", Dragon),
        "Dragonair" to Pokemon(148, "Dragonair", Dragon),
        "Dragonite" to Pokemon(149, "Dragonite", Dragon, Flying),
        "Mewtwo" to Pokemon(150, "Mewtwo", Psychic),
        "Mew" to Pokemon(151, "Mew", Psychic)
)
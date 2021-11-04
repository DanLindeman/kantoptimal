### Kantoptimal

This an introductory Optaplanner project meant to create optimal Pokemon teams for the Kanto region as seen in Pokemon Red, and Pokemon Blue.


### Building the application with Gradle

```bash
./gradlew bootJar
```

This should build a file in `build/libs` with a name like `kantoptimal-x.y-SNAPSHOT.jar` 

To run the jar for version `1.0` run.

```bash
java -jar ./build/libs/kantoptimal-1.0-SNAPSHOT.jar
``` 

### Phases of the planner:

1) The _types_ of your pokemon are effective against are as big as possible, I assume every pokemon has a decent STAB attack for their type or types -> lets try to 15 types of offensive coverage

2) The best offense is not always the best defense. Let's make sure I have as few weaknesses as possible while still covering offense

3) It is better to be strong against things you are not weak against.

4) Incorporate their _actual_ movesets such that attacks with power 60 or greater are the only ones considered "viable"

5) Remove the STAB requirement from moves, look at pokemon as a vehicle for offensive coverage by their moveset, not their types

6) Special Attack and Physical Attacks are _different_ try to optimize for coverage of both so physical and special defenses can be overcome.
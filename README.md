# Last Laugh

**Course:** CoSci 290 — Introduction to Programming  
**Institution:** Cal Poly Pomona  
**Project:** Text Adventure Game  

---

## Overview

*Last Laugh* is a Java-based text adventure game in which the player wakes up in an unknown location and must escape through a series of rooms. Each room is guarded by a caretaker who presents riddles and puzzles standing between the player and the key to the next door. Solve everything, collect the notes, and make it out alive.

The project is a full game loop — title screen, save/load system, inventory, a notebook narrative, randomized death mechanics, and a completion ending — built entirely in Java with no external libraries.

---

## How to Run

1. Clone the repository.
2. Open in an IDE (Eclipse recommended — a `.project` file is included).
3. Run `LastLaugh.java` — the `main` method lives there.
4. The game launches into the title screen.

```bash
# From the command line if compiling manually:
find . -name "*.java" | xargs javac
java LastLaugh
```

> **Note:** The program must be run from the project root so that file I/O paths resolve correctly for save files and story content.

---

## Gameplay

### Menu Options

At each room the player is presented with a menu of actions:

| Option | Description |
|---|---|
| **Sense** | Survey the room — describes the environment and what's present. Start here in every new room. |
| **Interact** | Speak with the room's caretaker. The caretaker presents one or more riddles that must be solved to progress. |
| **Examine** | Inspect objects in the room for detail and context. |
| **Action** | Manipulate puzzle pieces. Correct order unlocks a hint for the active riddle. Wrong order risks death. |
| **Inventory** | View and use collected items. Keys obtained from caretakers are used here to unlock doors. |
| **Notebook** | Read collected notes. Each unlocked door adds a new note that advances the story narrative. |
| **Move** | Travel to any previously unlocked room. |

### Progression Loop

1. Enter a room → **Sense** surroundings.
2. **Interact** with the caretaker → receive a riddle.
3. Optionally **Examine** objects or use **Action** to manipulate puzzle pieces for hints.
4. Answer the riddle correctly → receive a key in your **Inventory**.
5. Use the key to unlock the door → a new **Note** is added to your notebook.
6. **Move** to the next room and repeat.

---

## Death Mechanic

Every failed puzzle manipulation or wrong riddle answer increments the player's **attempts** counter. After each failure, `Math.random()` determines whether the player dies:

| Attempts | Death Probability |
|---|---|
| 1 | 10% |
| 2 | 20% |
| 3 | 30% |
| … | … × 10% |

Be careful — the more you fumble, the more the odds stack against you. A death triggers the death splash screen and ends the run.

---

## Save & Load System

- **Saving** — When the player unlocks the first door, their name and current position in the game are written to a save file. This updates at every subsequent door unlock.
- **Loading** — Selecting *Continue Game* at the title screen reads the save file and restores the player's name and room progress.

The save/load system is handled by `FileUtility.java` and `LoadGame.java`.

---

## Randomized Notes

Notes collected from unlocked doors are not always the same. `Math.random()` is used to determine which notes are loaded each run, giving the game a slightly different narrative flavor on each playthrough.

---

## Splash Screens

The game has three splash screens:

| Screen | Trigger |
|---|---|
| **Title Screen** | Program launch — presents *New Game* and *Continue Game* options. |
| **Completion Screen** | Player successfully escapes through all rooms. |
| **Death Screen** | Player's cumulative failure probability catches up with them. |

---

## Program Flow

The `main` method in `LastLaugh.java` drives the entire program through a single `do-while` loop that keeps the title screen alive until the player quits (selection `3`):

```
Program Start
│
├── createAndPopulateAllObjects()   ← LoadGame builds and fills all game objects once
│
└── do {
      runTitleScreen()              ← show title splash, get selection
      │
      ├── case 1: New Game
      │     runIntroSequence()      ← story intro, player name input
      │     runMainGame()           ← main room loop
      │
      ├── case 2: Continue Game
      │     runUpdateGameObjects()  ← read save file, restore player state
      │     runMainGame()           ← main room loop from saved position
      │
      ├── case 3: Quit
      │     (exits do-while)
      │
      └── default: tauntPlayer()   ← bad input handled with flavor text
    } while (selection != 3)
```

## Project Structure

```
LastLaugh/
└── src/
    └── lastLaugh/
        ├── LastLaugh.java          # Entry point — main() and top-level game loop
        ├── CoreObjects.java        # Central state container — holds all game objects
        ├── PositionTracker.java    # Multidimensional array map of the game world
        ├── CreateObjects.java      # Utility — instantiates all game objects
        ├── FileUtility.java        # Utility — all file I/O (save, load, story text)
        ├── GameDriver.java         # Utility — title screen, intro, and main game loop
        ├── GeneralUtility.java     # Utility — shared helpers including load-game restore
        ├── InputUtility.java       # Utility — all user input and validation (+ taunts)
        ├── LoadGame.java           # Utility — calls CreateObjects and PopulateObjects
        ├── PopulateObjects.java    # Utility — fills objects with room/riddle/note data
        └── TestDriver.java         # Dev utility — tests object loading and population
```

### Notable Classes

**`CoreObjects.java`** — The single source of truth for game state. Every utility class receives a `CoreObjects` reference rather than managing their own state. It exposes a `Selector` object that tracks the current menu selection (e.g., `getSelector().getTitleSelection()`), which the `do-while` in `main` reads to decide what to run next.

**`GameDriver.java`** — Owns the three major phases: `runTitleScreen()`, `runIntroSequence()`, and `runMainGame()`. Acts as the coordinator between all other utilities.

**`LoadGame.java`** — Called once at startup via `createAndPopulateAllObjects()`. Delegates to `CreateObjects` to instantiate every room, caretaker, riddle, and puzzle piece, then to `PopulateObjects` to fill them with content.

**`GeneralUtility.java`** — Contains `runUpdateGameObjects()`, which handles the *Continue Game* path by reading the save file and patching the relevant `CoreObjects` fields to restore the player's position and name.

**`FileUtility.java`** — All disk I/O lives here: reading story and note text from external files, writing save data on door unlock, and reading it back on continue.

**`InputUtility.java`** — Centralizes every `Scanner` call and input validation. Also houses `tauntPlayer()`, invoked whenever the player enters something nonsensical at the title screen.

**`PositionTracker.java`** — Contains the multidimensional array that acts as the game map. Tracks which rooms exist, which are unlocked, and where the player currently is.

---

## Key Design Decisions

- **Storyline via file I/O** — The story content is stored in external text files and read at runtime, separating narrative from code and making it easy to edit the story without touching Java files.
- **Player name personalization** — The player's name is captured at game start and used throughout the game whenever the narrative addresses them directly.
- **Probability-based death** — Rather than instant failure on a wrong answer, the escalating `Math.random()` death system creates tension that grows with repeated mistakes — a close call at 1 attempt, near-certain death by attempt 9.
- **Randomized notes** — `Math.random()` note selection means two players who take the same path through the rooms may read a different version of the story, adding replay value.
- **157 commits** — This repo has a real commit history, which means you can see the game take shape from the ground up if you dig through the log.

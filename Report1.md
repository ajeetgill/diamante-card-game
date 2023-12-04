# 2023F CS2910 Project Report

**Group Members**

1. Ajeet Gill (Student Number)
2. Arnab Kundu (0355570)

# Summary of Game

Diamant is a board game based around cave exploration. The game is for 3-8 players, and the objective of the game is to collect the most gems to win. The key objects in the game include treasure cards, trap cards, decision cards and barricade tiles. There are 5 caves in which players must explore. Each turn, a deck consisting of treasure and trap cards is randomly drawn. If a treasure card is chosen, the treasure is divided amongst players, meanwhile, if two of the same trap cards are chosen the round is over and the cave gets closed by a barricade tile. Players choose every round either to exit or continue. The player with the most treasure at the end of the game is the winner.
https://cdn.1j1ju.com/medias/90/3c/55-diamant-rulebook.pdf

# Experiment Report

## Player Strategies

All Strstegies are implemented after at least 2 cards are drawn, to allow for collection of treasure or possible duplicate traps.

1. Agressive/Cautious Strategy: The Agressive Strategy and Cautious Strategy are two different strategies with similar implementations. The Agressive Strategy implements the random class to generate a random number. If the number is less than 0.8, the Stratrgy permits the player to keep exploring the cave, meaning an 80% chance for the player to keep exploring the cave. Similarly, the Cautious Strategy returns true after 2 rounds, meaning the Player will always exit the cave after 2 rounds.

2. Conservative Strategy: The Conservative Strategy is a random strategy. The player randomly inherits the random object. If the value is below the value of 0.5, the player exits the cave. Likewise, if the value is above 0.5, the player stays in the cave. This causes for the strategy to be a 50/50 strategy, with no way of predicting the outcome.

3. LetLuckDecide Strategy: The LetLuckDecide strategy is our final strategy, with similar implementations to the other strategies. This strategy implements the random class to generate a random number. If the number is less than 0.25, the Stratrgy permits the player to keep exploring the cave, meaning an 25% chance for the player to keep exploring the cave.

## Procedure

_A description of your procedure for running the experiment on your code. This should include information
regarding the setup of the experiment in terms of what it runs and how it compares the player strategies,
the number of trials the experiment and what data was collected. (250 words)_
Our procedure for running the experiment on our code consisted of mainly Classes and Array Lists.

## Results

_A presentation on the results of your simulation of the strategies in table(s) or appropriate graphic(s)
with a short summary. (250 words)_

**Example Image:**

![Shiny Pokemon](img.png)
![Shiny Pokemon](rp1.png)

**Example Table:**

| Pokemon Caught | Interest in Shiny Pokemon |
| -------------- | ------------------------- |
| 0              | 10                        |
| 1              | 20                        |
| 2              | 40                        |
| 3              | 80                        |
| 4              | 160                       |
| 5              | 320                       |
| 6              | 640                       |
| 7              | 1280                      |
| 8              | 2560                      |
| 9              | 5120                      |
| 10             | 10240                     |

## Analysis

_An interpretation of your data explaining why one strategy is better than the other supported with
data from your experiment.(500 words)_

# Reflection

_A reflection on your experiences with generative AI during this project. Provide a few sentences reflecting
on your experience with AI for each of the following prompts._

### What generative AI did you use, and what tasks did you use it for?

_**Example:** Git Co-Pilot: generated getters and setters_

### How did you learn about the tools used by your group (delete ones that don't apply)?

_Please describe where and how you learned about the tools_

### Reflecting on your experience:

_Write a short reflection on your use of generative AI in this project, including if you did not use it.
You may use the prompts as headings if you wish. (500 words)_
Generative AI was used in multiple areas throughout this project.

The two main AI agents used were Github Copilot (Used in Java IDE) and ChatGPT. First of all, we used Github Copilot to recommend usable classes and interfaces based on its knowledge of Diamant. After constructing classes such as Card, Deck, Game and Player, we used Copilot to create methods inside these classes and also applied inheritance where necessary to create classes such as Hazard Card and Treasure Card. Copilot also created the foundation of our game simulation, with classes for our SimulationExperiement and also Test classes for Card, Deck, Hazard Card and Treasure Card. These classes contained methods used in previous classes, but unfortunately were very error-prone and required us to go back and fix methods and the functionality of classes. In addition, ChatGPT was occasionally used for smaller fixes. As ChatGPT could not access our complete code like Copilot could, ChatGPT was used for the creation of smaller methods, or in case we needed to debug any of the code that we could not manually fix. In addition, ChatGPT suggested changes and removal of certain code.
One of the advantageous aspects of generative AI was its celerity. Generative AI made learning efficient, explaining the purpose of methods and also how to implement them. In addition, we didn’t have to pursue syntax online, as most of the syntax was written, it was our job to implement it. Copilot also offered suggestions on code and methods to implement. If we asked Copliot to create code and methods for our classes, Copilot would use code that we already implemented to create new methods, seeing as it already had access to our code. This increased the speed of code, but also came with some negative aspects.
There were few areas where the use of generative AI hindered development. First of all, there were many occasions where Copilot suggested viable code which didn’t fit in with the code previously written, requiring us to go back and fix it. This also resulted in the creation of unnecessary methods, and even fixing whole classes to make them abstract. Additionally, AI doesn’t take into account the level of the coder, which sometimes results in advanced code being used. For the most part, the code suggested by Copilot was fair, but there were occurrences where the code would be progressive, resulting in changes. Consequently, debugging was a major part of the project, as we had to make the code simpler.

**Prompts to think about in writing your reflections if you worked with generative AI:**

- What went well using generative AI in this project?
- What went well using generative AI?
- What didn’t go well using generative AI?
- Were there any limitations you encountered using generative AI?
- How did your solution change/evolve/improve/degrade because of the generative AI?
- What could you have done so the project turned out better?

**Prompts to think about in writing your reflections if you didn't use generative AI:**

- Why did you choose not to use generative AI in this project?
- Were there particular problems that you encountered where you think generative AI would have helped?
- Were there particular things you were glad you learned to do yourself without the use of generative AI?
- What could you have done so the project would turn out better?

# Bonus Consideration:

If you have aspects of your project you would like considered for the available bonus.

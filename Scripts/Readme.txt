Hey team, Marjorie here!

Just wanted to provide a text document where we can discuss logic, issues we run into, etc.
Update this readme with anything you need to relay to everyone else!

Oct 31st:
    - Created a few base classes with comments explaining what needs to go in them. Please feel free
    to add those methods and variables yourself. This was easier than creating a UML for each one!

    - I am currently working on a google spreadsheet that we can add monster data to. I will be creating
    a script to pull the data from there, instead of creating all of them in the main file. 
    
    Here is a link to the google sheet. Feel free to add some monsters if desired: 
    https://docs.google.com/spreadsheets/d/11kUB49BC0E4HY5QHu7mAsWXleXkhKbVwuue7kKzJ9rQ/edit?usp=sharing
    
    - the CSVParser file is where I will handle all this data, so don't worry about it for now.

    - We also need a driver file that handles the main menu and the game screens.
    - The driver file should:
        Ask if the user wants to play a new game, or exit
        if they want to play a new game, ask the user to pick between the available player
        starting characters. (from an array of 3 players, have one that has high attack, one
        with high defense, and one with high magic.)
        - Display the rules of the game, then let them hit enter to continue.
        - A monster is chosen from the array of available monsters. preferably in this difficulty order:
            easy, easy, medium, miniboss, easy, medium, boss.
        - the game screen displays both the player and monster stats on the screen for clarity.
        - let the player choose between 3 choices: Attack, Defense, Magic.
        - the monster then randomly chooses an option from those 3.

        - Rock paper scissors rules, so Defense is 'rock', attack is 'scissors', magic is 'paper'.
            if player chooses Attack, Defense beats it
            if player chooses Defense, magic beats it
            if player chooses magic, attack beats it.

        - IN THE EVENT OF A TIE: the stat value of the choices are compared between player and monster.
                                - whoever has the higher stat value wins the round.
                                - if this is ALSO a tie, redo that round, no damage was taken

        - if the player wins the round, reduce the monster's currentHealth by 1 (can call decreaseHP();)
        - if the player reduces the monster's current health to zero, let them increase a stat of their
            choice by 1 (call increaseLVL();) and set currentHealth = maxHealth.

        - if the player loses the round, reduce the player's health by 1. (call decreaseHP();)
        - if the player's currenthealth >= 0, (call OnDeath();) the game is over.
                Display the final results screen for the player:
                    - Monsters defeated
                    - final player stats
                    - who bested you (optional)

                - ask the player if they wish to play again with a new adventurer (start game over)


        - The game should keep track of the number of monsters defeated and accurately display the
        stat changes when a monster is felled.
        - the game continues until the player dies. there is no 'win' state. (optional)


package com.mygdx.game.Characters;

public class ClassTester {
    public static void main(String[] args)
    {
        PlayerCharacter test = new PlayerCharacter("test", "Robert", 1, 20, 20, 20, 20, 20, 20, 20, "Human");
        NPC test2 = new NPC( "wtf is this","Eowen", 1, 20, 20, 20, 20, 20, 20, 20, "Elf");
        Creatures beast = new Creatures( "wtf is this", "Hydra", 20, 20, 20, 20, 20, 20, 20,  20, 20, 20, 20, 20);
        test.Infodump();
        test2.Infodump();
        beast.Infodump();
    }
}

package com.mygdx.game.Characters;

public class Creatures extends java.lang.Character {
    private static final String Classifcation = "Creatures";
    //not classified health pools depending on the creature
    int hp1;
    int hp2;
    int hp3;
    int hp4;
    int hp5;
    int hp6;
    int hp7;
    int hp8;
    public Creatures(String NPE, String N,int l, int ba, int h, int bo, int h1,int h2, int h3, int h4, int h5,int h6,int h7, int h8) {
        //Level for creatures is related to their health pool and Combat rating
        super(Classifcation, NPE,N, l, ba, h, bo);
        this.hp1 = h1;
        this.hp2 = h2;
        this.hp3 = h3;
        this.hp4 = h4;
        this.hp5 = h5;
        this.hp6 = h6;
        this.hp7 = h7;
        this.hp8 = h8;
        totalHP += h1 + h2 + h3 + h4 + h5 + h6 + h7 + h8;

    }
    public void Infodump ()
    {
        System.out.println(
                "Classification: " + Classification + "\t\t\t Name: " + Name
                        +"\nLevel: " + Level 	+ "\t\t: " + ""
                        +"\nBase HP: " + baseHP + "\t\tBody HP: " + bodyHP + "\t\tHead HP: " + headHP
                        + "\nBodypartHP1: " + hp1 + "\t\tBodypartHP2: " + hp2 + "\t\tBodypartHP3: " + hp3 + "\t\tBodypartHP4: " + hp4
                        + "\nBodypartHP5: " + hp5 + "\t\tBodypartHP6: " + hp6 + "\t\tBodypartHP7: " + hp7 + "\t\tBodypartHP8: " + hp8
                        +"\nTotal HP = " + totalHP+ "\n");


    }
}


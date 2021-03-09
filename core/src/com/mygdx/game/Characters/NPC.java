package com.mygdx.game.Characters;

import java.util.ArrayList;

import Items.Item;



public class NPC extends HumanoidCharacters  {
    private static final String Classifcation = "NPC";
    String Personality;
    ArrayList<Item> Itemsonperson = new ArrayList<Item>();


    public NPC(String NPE,String N,int l, int ba, int h, int bo, int la, int ra, int ll, int rl,String R) {
        super(Classifcation,NPE,N, l, ba, h, bo, la, ra, ll, rl, R);
        // TODO Auto-generated constructor stub
    }
    public void Infodump ()
    {
        System.out.println(
                "Classification: " + Classification + "\t\t\t Name: " + Name
                        +"\nLevel: " + Level 	+ "\t\tRace: " + Race
                        +"\nBase HP: " + baseHP + "\t\tBody HP: " + bodyHP + "\t\tHead HP: " + headHP
                        + "\nLeft Arm HP: " + leftArmHP + "\t\t Right Arm HP: " + rightArmHP + "\t\t Left Leg HP: " + leftLegHP + "\t\t Right Leg HP: " + rightLegHP
                        +"\nTotal HP = " + totalHP + "\n");


    }


}

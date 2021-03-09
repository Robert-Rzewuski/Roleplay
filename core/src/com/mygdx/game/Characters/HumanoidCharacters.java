package com.mygdx.game.Characters;

import java.util.ArrayList;

import Races.Human;
import Races.Races;

abstract class HumanoidCharacters extends java.lang.Character {
    String Race;
    Races RaceType;
    //String
    //HP for arms and legs Limbs
    int leftArmHP;
    int rightArmHP;
    int leftLegHP;
    int rightLegHP;
    //Infomration on characters
    ArrayList<String> Characteristics = new ArrayList<String>();
    ArrayList<String> Features = new ArrayList<String>();

    //Character-> Classification (Creature/HumaniodCharacter),Humanoid Classification (NPC,PC,EC),Name,Level,HeaddHealth,, Body HP
    //Humanoid Character -> Race, Race Type, left arm, right arm, left leg, right leg hp,
    //String C,String NPE, String N,int l,int ba,int h, int bo
    public HumanoidCharacters(String C,String NPE, String N,int l, int ba, int h, int bo,int la,int ra, int ll, int rl,String R) {
        super(C,NPE, N, l, ba, h,bo);
        //limb healths for humanoids plus new total hp
        this.leftArmHP = la;
        this.rightArmHP = ra;
        this.leftLegHP = ll;
        this.rightLegHP = rl;
        totalHP += this.leftArmHP + this.rightArmHP + this.leftLegHP + this.rightLegHP;
        //Race
        this.Race = R;
        // TODO Auto-generated constructor stub
    }

}

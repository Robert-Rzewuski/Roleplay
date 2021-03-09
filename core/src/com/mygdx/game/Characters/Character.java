package com.mygdx.game.Characters;

import java.util.ArrayList;

import Items.Item;
//abstract
public  class Character {
    //What type of character is it: Creature,NPC,Enemy C, PC
    String Classification; //Creature,Humanoid, Enemy
    String HumanoidClassification;
    //Information on character
    String Name;
    int Level;
    //need attributes here or an attributes class
    boolean alive;
    boolean status;
    ArrayList<String> Statuses = new ArrayList<String>();
    //Base line HP system every creature should have a "body" "head" and "base" hp. Rest of limbs will be segmented down into other classes
    public int CurrentHP;
    public int totalHP;
    public int baseHP;
    public int headHP;
    public int bodyHP;
    //item dropped on death
    ArrayList<Item> Itemsdropped = new ArrayList<Item>();

    //Constructor
    // Classification (Creature/HumaniodCharacter),Humanoid Classification (NPC,PC,EC),Name,Level,HeaddHealth,, Body HP
    public Character (String C,String NPE, String N,int l,int ba,int h, int bo) {
        this.Name = N;
        this.Classification = C;
        this.HumanoidClassification = NPE;
        this.Level = l;
        this.baseHP = ba;
        this.headHP = h;
        this.bodyHP = bo;
        this.alive = true;
        this.status = false;
        //total HP calculation
        totalHP = baseHP + headHP + bodyHP;
        //current hp
        CurrentHP = this.totalHP;

    }
    //Method to check living status
    public boolean Alivecheck()
    {
        boolean Alive;
        if (totalHP == (this.totalHP*-2))
        {
            Alive = false;
        }
        else
            Alive = true;
        return Alive;
    }
    //Method to check if character is under any statuses
    public boolean Statuscheck()
    {
        boolean Status;
        if (Statuses.isEmpty())
        {
            Status = false;
        }
        else
            Status = true;
        return Status;
    }
    //
}

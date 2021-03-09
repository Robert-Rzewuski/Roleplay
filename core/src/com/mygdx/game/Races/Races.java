package com.mygdx.game.Races;

import java.util.ArrayList;

public abstract class Races {
    //information on the race
    String Racename;
    //Age range for the race
    int MinAge;
    int MaxAge;
    //Abilites and other information on the race.
    ArrayList<String> RacialAbilities = new ArrayList<String>();
    ArrayList<String> DescriptionRA = new ArrayList<String>();
    //might make some limitation on classes based on races for lore reason. Long term goal
    public Races(String r, ArrayList<String>  DRA, int MI,int MA)
    {
        this.Racename = r;
        this.DescriptionRA = DRA;
        this.MinAge = MI;
        this.MaxAge = MA;
    }
    public boolean checkifvalidagerange(int A)
    {
        if (A <= MaxAge & A >= MinAge)
            return true;
        else
            return false;
    }
}

package com.mygdx.game.Game;

import java.util.ArrayList;
import Characters.Character;
public class CurrentStateDisplay {
    ArrayList<Character> ListofCharacters = new ArrayList<Character>();
    int numberofcharacter;

    public static void main(String args[])
    {
        //public void Display (Character A)
        //{String C,String N,int l,int ba,int h, int bo
        Characters.Character A = new Characters.Character("Human","Test?","Idril", 10,10,10,10);
        int CurrentHP = A.CurrentHP;
        int totalHP = A.totalHP;
        int baseHP = A.baseHP;
        int headHP = A.headHP;
        int bodyHP = A.bodyHP;

















        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxx----------xxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxx--xxxxxxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxx--xxxxxxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxx--xxxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxxx------xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxx--xx--xx--xxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxx--xx------xx--xxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxx--xx------xx--xxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxx--xx------xx--xxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxx--xx------xx--xxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxxx------xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxx--xxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxx--xxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxx--xxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxx--xxxx--xxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
                +"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    }
}
//}

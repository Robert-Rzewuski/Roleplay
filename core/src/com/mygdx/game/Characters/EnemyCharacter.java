package com.mygdx.game.Characters;

import java.util.ArrayList;

import Items.Item;

public class EnemyCharacter extends HumanoidCharacters  {
    ArrayList<Item> Weapons = new ArrayList<Item>();
    ArrayList<Item> Armor = new ArrayList<Item>();
    ArrayList<Item> ExtraItems = new ArrayList<Item>();
    public EnemyCharacter(String C,String NPE,String N,int l, int ba, int h, int bo, int la, int ra, int ll, int rl,String R) {
        super(C,NPE,N,l, ba, h, bo, la, ra, ll, rl,R);
        // TODO Auto-generated constructor stub
    }




}

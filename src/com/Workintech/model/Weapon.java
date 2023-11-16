package com.Workintech.model;

public enum Weapon {

    HANDS("KNIFE"),
    PISTOL("PISTOL"),
    KNIFE("KNIFE");

    private String name;

    Weapon(String name){
        this.name = name;

    }

    public String getWeaponName(){
        return name;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic =new Medic();
        Warrior warrior = new Warrior();
        HavingSuperAbility[] herous = {magic, medic, warrior};
        for (int i = 0; i < herous.length; i++) {
            herous[i].applySuperAbility();

        }

    }

}

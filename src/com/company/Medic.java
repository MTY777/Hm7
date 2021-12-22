package com.company;

public class Medic extends Hero{
    @Override
    public String applySuperAbility() {
        System.out.println( "Medic применил суперспособность CRITICAL DAMAGE");
        return null;
    }
}

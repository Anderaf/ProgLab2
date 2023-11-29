package org.example.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BrutalSwing extends PhysicalMove {
    public BrutalSwing(){
        super(Type.DARK, 60,100);
    }
    @Override
    protected String describe(){
        return "бьёт с размаху";
    }
}

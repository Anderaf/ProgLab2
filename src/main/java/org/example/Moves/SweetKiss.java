package org.example.Moves;

import ru.ifmo.se.pokemon.*;

public class SweetKiss extends StatusMove {
    public SweetKiss(){
        super(Type.FAIRY, 0,75);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
    @Override
    protected String describe(){
        return "целует";
    }
}

package org.example.Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class TakeDown extends PhysicalMove {
    public TakeDown(){
        super(Type.NORMAL, 90, 85);
    }
    @Override
    public void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int)Math.round(0.25 * damage));
    }
    @Override
    protected String describe(){
        return "делает рывок";
    }
}

package org.example.Pokemon;

import org.example.Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    public Eevee(){
        super("Пустой", 1);
        setStats(55, 55, 50, 45, 65, 55);
        setType(Type.NORMAL);
    }
    public Eevee(String name, int level){
        //level 15
        super(name, level);
        setStats(55, 55, 50, 45, 65, 55);
        setType(Type.NORMAL);
        setMove(new Tackle(), new DoubleTeam(), new BabyDollEyes());
    }
}

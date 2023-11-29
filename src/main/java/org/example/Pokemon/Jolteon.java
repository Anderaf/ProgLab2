package org.example.Pokemon;

import org.example.Pokemon.*;
import org.example.Moves.*;
import ru.ifmo.se.pokemon.Type;

public class Jolteon extends Eevee {
    public Jolteon(){
        super();
    }
    public Jolteon(String name, int level){
        //level 15
        super(name, level);
        setStats(55, 55, 50, 45, 65, 55);
        setType(Type.ELECTRIC);
        addMove(new ThunderFang());
    }
}

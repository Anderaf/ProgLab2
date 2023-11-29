package org.example.Pokemon;

import org.example.Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Passimian extends Pokemon {
    public Passimian(){
        super("Пустой", 1);
        setStats(55, 55, 50, 45, 65, 55);
        setType(Type.FIGHTING);
    }
    public Passimian(String name, int level){
        //level 97
        super(name, level);
        setStats(100, 120, 90, 40, 60, 80);
        setType(Type.FIGHTING);
        setMove(new RockTomb(), new BrutalSwing(), new Confide(), new TakeDown());
    }
}

package org.example.Pokemon;

import org.example.Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togepi extends Pokemon {
    public Togepi(){
        super("Пустой", 1);
        setStats(35, 20, 65, 40, 65, 20);
        setType(Type.FAIRY);
    }
    public Togepi(String name, int level){
        //level 29
        super(name, level);
        setStats(35, 20, 65, 40, 65, 20);
        setType(Type.FAIRY);
        setMove(new Psychic(),new DazzlingGleam());
    }
}

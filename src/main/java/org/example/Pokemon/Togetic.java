package org.example.Pokemon;

import org.example.Moves.*;
import org.example.Pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Togetic extends Togepi {
    public Togetic(){
        super();
    }
    public Togetic(String name, int level){
        //level 29
        super(name, level);
        addMove(new SweetKiss());
    }
}

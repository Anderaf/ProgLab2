package org.example.Pokemon;

import org.example.Moves.*;

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

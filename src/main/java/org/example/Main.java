package org.example;
import org.example.Pokemon.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Passimian("Monkedor", 25);
        Pokemon p2 = new Eevee("Eva", 15);
        Pokemon p3 = new Jolteon("Joly", 30);
        Pokemon p4 = new Togepi("Pie", 29);
        Pokemon p5 = new Togetic("Togi", 29);
        Pokemon p6 = new Togekiss("Kissy", 29);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
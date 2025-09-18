package org.lesson.java.animals;

import org.lesson.java.interfaces.INuotante;
import org.lesson.java.interfaces.IVolante;

public class Main {

    public static void main(String[] args) {

        Passerotto passero = new Passerotto(null, null, 3, null);
        Delfino delfino = new Delfino(null, null, 0, null);
        Aquila aquila = new Aquila(null, null, 0, null);
        Cane cane = new Cane(null, null, 0, null);

        System.out.println("Passerotto");
        passero.dormi();
        passero.mangia();
        passero.verso();


        System.out.println("Aquila");
        aquila.dormi();
        aquila.mangia();
        aquila.verso();

        System.out.println("Delfino");
        delfino.dormi();
        delfino.mangia();
        delfino.verso();
        
        faiVolare(passero);
        faiVolare(aquila);
        faiNuotare(delfino);

    }

    static void faiVolare(IVolante animaleVolante){
        animaleVolante.vola();
    }

    static void faiNuotare(INuotante animaleNuotante){
        animaleNuotante.nuota();
    }
}

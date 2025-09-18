package org.lesson.java.animals;

import org.lesson.java.interfaces.IVolante;

public class Passerotto extends AbstractAnimal implements IVolante{


    private String diet = "semi e bacche";
    private String verso = "Cip cip";
    private String colore = "Marroncino";
    
    public Passerotto(){
        super();
    }
    
    public Passerotto(String specie, String genere, int eta ,String nome ){

        super(specie, genere, eta, nome);            
    }


    @Override
    public void verso() {
        System.out.println("Il passerotto fa "  + this.verso);
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia " +  this.diet);
    }

    //metodi 

    public void setDiet (String diet){
        this.diet = diet;
    }
    public String getDiet (){
       return this.diet;
    }


    public void setVerso (String verso){
        this.verso = verso;
    }
    public String getVerso (){
       return this.verso;
    }

    public void setColore (String colore){
        this.colore = colore;
    }
    public String getColore (){
       return this.colore;
    }

    public void canta(){
        System.out.println("Il passerotto canticchia");
    }
    
    @Override
    public void vola(){
        System.out.println("Sto volando Jack");
    }
}

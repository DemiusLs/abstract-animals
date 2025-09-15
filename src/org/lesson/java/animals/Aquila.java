package org.lesson.java.animals;

import org.lesson.java.interfaces.IVolante;

public class Aquila  extends AbstractAnimal implements IVolante{

    private String diet = "carne";
    private String verso = "Kiaaaa";
    private String colore = "Marrone";
    

    
    Aquila(String specie, String genere, int eta ,String nome ){

        super(specie, genere, eta, nome);            
    }


    @Override
    public void verso() {
        System.out.println("L'aquila fa "  + this.verso);
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia " +  this.diet);
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

    public void caccia(){
        System.out.println("L'aquila Caccia");
    }

    public void vola(){
        System.out.println("Sto volando Jack");
    }

}

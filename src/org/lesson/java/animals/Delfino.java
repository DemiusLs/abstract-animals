package org.lesson.java.animals;

import org.lesson.java.interfaces.INuotante;

public class Delfino extends AbstractAnimal implements INuotante{

    private String diet = "onnivoro";
    private String verso = "CIIIIIII";
    
    

    
    Delfino(String specie, String genere, int eta ,String nome ){

        super(specie, genere, eta, nome);            
    }


    @Override
    public void verso() {
        System.out.println("Il delfino fa "  + this.verso);
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia " +  this.diet);
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


    public void caccia(){
        System.out.println("Il delfino Caccia");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando Rose");
    }


}
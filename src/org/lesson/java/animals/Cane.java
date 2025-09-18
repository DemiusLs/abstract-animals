package org.lesson.java.animals;

public class Cane extends AbstractAnimal{

    private String diet = "onnivoro";
    private String verso = "Bau bau";
    private int nZampe = 4;

    public Cane(){
        super();
    }

    public Cane(String specie, String genere, int eta ,String nome ){

        super(specie, genere, eta, nome);            
    }


    @Override
    public void verso() {
        System.out.println( "Il cane fa:" + this.verso);
    }

    @Override
    public void mangia() {
        System.out.println( "la dieta del cane è " + this.diet);
    }

    //metodi 

    public void setDiet (String diet){
        this.diet = diet;
    }
    public String getDiet (){
       return this.diet;
    }

    public void setnZampe (int nZampe){
        this.nZampe = nZampe;
    }
    public int getnZampe (){
       return this.nZampe;
    }

}

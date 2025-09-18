package org.lesson.java.animals;

public abstract class  AbstractAnimal {
    
    private String specie;
    private String genere;
    private int eta;
    private String nome;

    public AbstractAnimal(){
        this.specie = "specie";
        this.genere ="genere";
        this.eta = 0;
        this.nome = "nome";
    }

    public AbstractAnimal(String specie, String genere, int eta ,String nome){
        this.specie = specie;
        this.genere =genere;
        this.eta =eta;
        this.nome = nome;
    }    

    public void setSpecie (String specie){
        this.specie = specie;
    }
    public String getSpecie (){
       return this.specie;
    }

    public void setGenere (String genere){
        this.genere = genere;
    }
    public String getGenere (){
       return this.genere;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome (){
       return this.nome;
    }

    public void setEta (int eta){
        this.eta = eta;
    }
    public int getEta (){
       return this.eta;
    }

    public abstract void verso(); 
    
    public abstract void mangia();

    public void dormi(){        
        System.out.println("Zzz");
    }
}

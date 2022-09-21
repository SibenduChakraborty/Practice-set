package com.company;
class baba{
    public baba(){
        System.out.println("ami satar jani");
    }
}

class pola extends baba{
    public pola(){
        System.out.println("ami karate jani");
    }
    public pola(String talent){
        System.out.println("amar talent ache r seta holo " + talent);
    }
}
public class j6inheritence {
    public static void main(String[] args) {
        pola chotobaccha= new pola("swimming");
    }
}

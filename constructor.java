package com.company;
class emp{
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private int id;
    private String name;
    public emp (){
        id=1076;
        name="Sibendu";
    }

}
public class constructor {
    public static void main(String[] args) {
        emp e= new emp();
        System.out.println(e.getId()+" "+ e.getName());
    }
}

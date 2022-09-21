package com.company;

//Suppose we have to design a classroom for students and selects the attributes / objects that are generally required for a class .
//Create the objects of the classroom and call methods to display features of it .
//class classroom{
//    int a;
//    int b;
//    int c;
//    class board{
//        board(int nob){
//            a=nob;
//        }
//    }
//    class projector{
//        projector(int nop){
//            b=nop;
//        }
//    }
//    class bench{
//        bench(int noben){
//            c=noben;
//        }
//    }
//}
//class ass6DAY10 {
//    public static void main(String[] args)
//    {
//        classroom bcs3a= new classroom();
//        classroom.board brd = bcs3a.new board(2);
//
//
//        classroom.projector prj = bcs3a.new projector(1);
//
//
//        classroom.bench ben = bcs3a.new bench(20);
//        System.out.println("number of projector:" +bcs3a.a);
//        System.out.println("number of board: " +bcs3a.b);
//        System.out.println("number of bench: "+bcs3a.c);
//    }
//}
abstract class t3st{
    abstract void tst();
}
class ass6DAY10{
    public static void main(String args[]){
        t3st p=new t3st(){
            void tst(){System.out.println("test");}
        };
        p.tst();
    }
}
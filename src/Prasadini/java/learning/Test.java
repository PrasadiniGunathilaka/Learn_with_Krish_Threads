package Prasadini.java.learning;

public class Test {

    public static void main(String[] args){

        Printer print = new Printer();
        Thread thread = new Thread(print);
        thread.start();
    }
}



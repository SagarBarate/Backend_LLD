package org.example.numberprinter1to100;

public class Numberprinter implements Runnable {
    int numberToBePrinted;

    Numberprinter(int numberToBePrinted){
        this.numberToBePrinted = numberToBePrinted;
    }

    @Override
    public void run(){
        System.err.println(numberToBePrinted+ "Printed by thread: "+ Thread.currentThread().getName() );
    }

}

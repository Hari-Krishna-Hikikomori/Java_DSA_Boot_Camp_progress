package OOPS.Interface;

import OOPS.Abraction_Encupsulation.Abstraction;

public interface Parent {           // InterFace like abstract it create a function without body
    static final int marks = 100;  // every variable by default it will be Static and final
    boolean graduation = true;     // public access modifier will allow
    void Career();

    void Partner();

    static void Life()
    {
        System.out.println("live life without any Debit");
    }
}

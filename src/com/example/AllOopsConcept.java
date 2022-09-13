package com.example;

public class AllOopsConcept {
    public static void main(String[] args) {

        AbstractImplExample an = new AbstractImplExample();
        an.display();
        an.message();
        AbstractClassExample impl1 = new AbstractImplExample();
        impl1.display();

        PolymorphismExample poly = new Polymorphism2();
        poly.hello();
        PolymorphismExample poly1 = new PolymorphismExample();
        poly1.hello("Dhanshri");

        Encapsulation en = new Encapsulation("Dhanshri ", 50, 1);
        System.out.println("Return " + en.toString());
        en.display();
    }

}
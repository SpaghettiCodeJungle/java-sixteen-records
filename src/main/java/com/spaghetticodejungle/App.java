package com.spaghetticodejungle;

/**
 *
 *
 */
public class App 
{
    public record Dog(String breed, String gender, String age){}

    public static void main( String[] args )
    {
        Dog d = new Dog("German Sheperd","female", "2");
        System.out.println(d.toString());
    }
}

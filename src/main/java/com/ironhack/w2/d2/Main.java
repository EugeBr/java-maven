package com.ironhack.w2.d2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

//      CHECKED EXCEPTIONS

        readFile("myFile.text");

//      UNCHECKED EXCEPTIONS

        String name = null;
        printLength(name);

//        THROWS

        int[] sampleArray = null;
        try {
            printArray(sampleArray);
        }catch (NullPointerException e){
            System.out.println("The array can't be null");
        }

//        THROWING EXCEPTIONS

        int a = 900000000;
        int b = 400000000;

        try {
            int product = multiply(a, b);
            System.out.println(product);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("Using long version...");
            long product = multiply((long) a, b); //! CASTING INTS TO LONGS
            System.out.println(product);
        }

        //! THROWS = AVISO
        //! THROW = ORDEN PARA FORZAR EXCEPCION
    }


    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist");
            // e.printStackTrace();     prints exception details
        }
//        }catch (NullPointerException e){
//            System.out.println("null pointer exception");
//        }
        //*      generic exception
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }

    public static void printLength(String myString){
        try {
            System.out.println(myString.length());
        }catch(NullPointerException e){
            System.out.println("String has a null value");
        }

    }

    //*if array = null, could throw NullPointerException
    public static void printArray(int[] numArray) throws NullPointerException{
        for(int i = 0; i < numArray.length; i++){
            System.out.println(numArray[i]);
        }
    }

    public static int multiply(int a, int b){
        int product = a * b;
        if (product / a != b){
            throw new IllegalArgumentException("Product input is too great for int");
        }
        return product;
    }

    //* sobrecarga del metodo multiply()
    public static long multiply(long a, long b){
        return a * b;
    }
}
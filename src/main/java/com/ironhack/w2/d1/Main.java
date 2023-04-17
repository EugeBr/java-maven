package com.ironhack.w2.d1;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book theRaven = new Book("The Raven", 100);
        Book theBlackCat = new Book("The Black Cat", 50);
        List<Book> books = new ArrayList<Book>();
        books.add(theRaven);
        books.add(theBlackCat);
        Author author = new Author("Edgar", "Allan Poe", books);

        System.out.println(author); //* toString method in class allows to print properties in console

//      GSON
//      * dependency to transform java object to Json *

        Gson gson = new Gson();
        String authorJson = gson.toJson(author);    //from object to Json
        System.out.println(authorJson);

        Author authorFromJson = gson.fromJson(authorJson, Author.class);    //from Json to object
        System.out.println(authorFromJson);
    }
}

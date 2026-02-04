/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class Book {
    private String Author;
    private String name;
    private int count;
    
    public Book(String Author,String name,int pages){
        this.Author=Author;
        this.name=name;
        this.count=pages;
    }
        public String getAuthor(){
        return Author;
        }
        public String getName(){
        return name;
        }
        public int getPages(){
        return count;
        }
    public String toString(){
        return Author+", "+name+", "+count+" pages";
    }
}

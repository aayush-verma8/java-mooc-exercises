/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Song {
    private String name;
    private int Lentgth;
    
    public Song(String name, int length){
        this.name=name;
        this.Lentgth=length;
    }
    public String name(){
        return name;
    }
    public int length(){
        return Lentgth;
    }
}

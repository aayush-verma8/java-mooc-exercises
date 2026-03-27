/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class Container {
    private int contains;
    private final int container;
        public Container(){
            this.contains=contains;
            this.container=100;
        }
    public int contains(){
        return this.contains;
    }
    public void add(int amount){
    if(amount<0){
        return;
        }
        this.contains+=amount;
        if(this.contains>this.container){
        this.contains=this.container;
        }
    }
    public void remove(int amount){
    if(amount<0){
        return;
    }
    this.contains-=amount;
    if(this.contains<0){
        this.contains=0;
        }
    }
    public String toString(){
    return this.contains+"/"+this.container;
    }
}

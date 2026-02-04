/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class Timer {
    private ClockHand second;
    private ClockHand seconds;
    
    public Timer(){
    this.second=new ClockHand(100);
    this.seconds=new ClockHand(60);
    }
    public void advance(){
        this.second.advance();
        
        if(this.second.value()==0){
        this.seconds.advance();
        
        //if(this.seconds.value()==0){
        //this.seconds.advance();
        //}
        }
    }
    public String toString(){
        return seconds+":"+second;
    }
}


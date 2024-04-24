/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 *
 * @author FRS4440A
 */
public class TimeModelEvent extends EventObject{
    private LocalDateTime time;
    
    public TimeModelEvent(Object source, LocalDateTime time){
        super(source);
        this.time=time;
    }
    
    public LocalDateTime getTime(){
        return time;
    } 
}

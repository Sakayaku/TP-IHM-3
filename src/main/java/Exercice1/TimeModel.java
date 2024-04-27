/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

import java.time.LocalDateTime;
import javax.swing.Timer;
import javax.swing.event.EventListenerList;

/**
 *
 * @author FRS4440A
 */
public class TimeModel{
    
    private int UPDATE_RATE =1000;
    private EventListenerList listenerList;
    private Timer timer;
    private LocalDateTime time;

    public TimeModel(){
        listenerList=new EventListenerList();
        timer = new Timer(UPDATE_RATE, e -> fireTimeChangedEvent());
        timer.start();
    }
    
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    
    public void addTimeModelListener(TimeModelListener listener){
        listenerList.add(TimeModelListener.class, listener);
    }
    
    public void removeTimeModelListener(TimeModelListener listener){
        listenerList.remove(TimeModelListener.class, listener);
    }
    
    public LocalDateTime getTime(){
        return time;
    } 
    
    private void fireTimeChangedEvent(){
        this.time=LocalDateTime.now();
        TimeModelEvent ev = new TimeModelEvent(this,time);
        for (TimeModelListener listener:listenerList.getListeners(TimeModelListener.class)){
            listener.timeChanged(ev);
        }   
    }
}

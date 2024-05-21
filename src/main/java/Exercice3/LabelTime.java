/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice3;

import Exercice1.TimeModelEvent;
import Exercice1.TimeModelListener;

/**
 *
 * @author Solène
 */
public class LabelTime extends javax.swing.JLabel implements TimeModelListener{
    @Override
    public void timeChanged(TimeModelEvent event){
        this.setText(event.getTime().getHour()+"h "+event.getTime().getMinute()+"m "+event.getTime().getSecond()+"s ");
    }   
}

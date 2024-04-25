/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exercice1;

import java.util.EventListener;

/**
 *
 * @author FRS4440A
 */
public interface TimeModelListener extends EventListener{
    public void timeChanged(TimeModelEvent event);
}

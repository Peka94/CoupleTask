/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coupletask;

/**
 *
 * @author Gerencsér Gábor
 */
import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        
        return o1.getName().compareTo(o2.getName());
    }
    
    
}

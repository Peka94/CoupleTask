/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coupletask;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Reich Jenő
 */
public class Filter {
    
    private ArrayList<Person> persons=Reader.persons;
    public static ArrayList<Person>residents=new ArrayList<>();
    
    public static ArrayList<Person> cityFilter(String city, ArrayList<Person>persons){
        
        for (Person person : persons) {
            if (person.getCity().equals(city)) {
                residents.add(person);
            }
        }
        return residents;
    }
}

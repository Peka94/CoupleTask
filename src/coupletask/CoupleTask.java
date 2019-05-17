package coupletask;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Gerencsér Gábor
 */
public class CoupleTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    public static void sortPersons (){
        ArrayList<Person> persons = Reader.read();
        persons.getName(new NameComparator());
    }
}

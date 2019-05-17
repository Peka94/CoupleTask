package coupletask;

import java.io.FileNotFoundException;
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
    public static void main(String[] args) throws FileNotFoundException {
        sortPersons();
        
    }
    
    public static void sortPersons () throws FileNotFoundException{
        ArrayList<Person> persons = Reader.read();
        persons.sort(new NameComparator());
        
    }
}

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
        //sortPersons();
        
        //residents of the specific location
        Reader.read();
        String city="New York";
        Filter.cityFilter(city, Reader.persons);
        for (Person resident : Filter.residents) {
            System.out.println(resident.getName());
        }
        
        
    }
    
    public static void sortPersons () throws FileNotFoundException{
        ArrayList<Person> persons = Reader.read();
        persons.sort(new NameComparator());
        
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
}

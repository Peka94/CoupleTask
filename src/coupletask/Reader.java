/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coupletask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Reich Jenő
 */
public class Reader {

    public static ArrayList<Person> persons = new ArrayList<>();

    public static ArrayList<Person> read() throws FileNotFoundException {
        Scanner sc;
        sc = new Scanner(new File("us-500.csv"));
        sc.nextLine();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            StringBuilder sb = new StringBuilder();
            sb.append(parts[0]);
            sb.append(parts[1]);
            String name = sb.toString();

            String city = parts[4];
            String email = parts[10];

            Person person = new Person(name, city, email);
            persons.add(person);

        }
        return persons;
    }

}

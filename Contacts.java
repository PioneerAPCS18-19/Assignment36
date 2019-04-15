/**
 * Contacts is modelling a collection of people's information.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class Contacts
{
    private List<Person> people;

    public Contacts()
    {
        // initialize people as an ArrayList
    }

    // pre: name, number, and email are not null
    // post: Person with given name, number, and email are added to list and
    //          list is sorted.
    public void addPerson(String name, String number, String email)
    {
        // create a Person object and add it to the list (people)
        // sort list
    }

    // no changes needed
    // given file name (file) it adds all contacts to list.
    public void addFromFile(String file) throws IOException
    {
        Scanner inFile = new Scanner(new File(file));

        while(inFile.hasNext())
        {
            String line = inFile.nextLine();
            people.add(new Person(grabName(line), grabNum(line), grabEmail(line)));
        }

        inFile.close();

        sortContacts();
    }

    // given a String line, return the name (value before first comma)
    // returns null if nothing is found
    public String grabName(String line)
    {

    }

    // given a String line, return the number (value between first and second comma)
    // returns null if nothing is found
    public String grabNum(String line)
    {

    }

    // given a String line, return the name (value after last comma)
    // returns null if nothing is found
    public String grabEmail(String line)
    {

    }

    // finds and returns the Person in the list with the name given using binary search.
    // returns null if not found
    public Person getContact(String name)
    {

    }

    // pre: none
    // post: people is sorted in ascending order using insertion sort
    public void sortContacts()
    {

    }

    // pre: none
    // post: String representation of this Contacts is returned
    @Override
    public String toString()
    {
        String list = "";

        // enhanced for-loop; for-each loop
        for(Person p: people)
        {
            list += p.getName() + ", " + p.getNumber() + ", " + p.getEmail() + "\n";
        }

        return list;
    }
}

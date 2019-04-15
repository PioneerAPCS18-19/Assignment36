/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private String number;
    private String email;

    public Person(String name, String number, String email)
    {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    // pre: none
    // post: returns name of this Person.
    public String getName()
    {
        return name;
    }

    // pre: none
    // post: returns number of this Person.
    public String getNumber()
    {
        return number;
    }

    // pre: none
    // post: returns email of this Person.
    public String getEmail()
    {
        return email;
    }

    // pre: p is not null (return false)
    // post: returns true if name, number, and email of Person p are the same
    //          as the name, number, and email of this Person. False otherwise.
    public boolean equals(Person p)
    {

    }

    @Override
    public String toString()
    {
        return (name + "\nNumber: " + getNumber() + "\nEmail: " + getEmail());
    }
}

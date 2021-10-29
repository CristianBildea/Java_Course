package ca.javacourse.Class_13;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String permCode;

    static int lastId = 0; //because is italic is show is static

    //Constructor

    public Student(String firstName, String lastName, String permCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.permCode = permCode;

        this.id = ++lastId;
    }

    public static void setLastID(int newId)
    {
        Student.lastId = newId;
    }


    //getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPermCode() {
        return permCode;
    }

    public void setPermCode(String permCode) {
        this.permCode = permCode;
    }
}

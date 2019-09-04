package lab04;

public class Person {
    private String Name;
    private int age;
    private char gender;

    public Person(String name, int Age, char Gender) {
        this.Name = name;
        this.age = Age;
        this.gender = Gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char Gender) {
        this.gender = Gender;
    }

    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Name :" + getName());
        response.append("Age : " + getAge());
        response.append("Gender : " + getGender());
        return response.toString();


    }
}





/* string are immutable by default i.e cannot be changed once created.
 * string builder are mutable by default.
 */


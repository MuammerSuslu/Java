package apcsaProjects2223;

public class ProjectPerson
{
    String name;
    int age;
    int SSN;

    public String getInfo()
    {
        return "this persons name is "+name+" his age is "+age+" his SSN number is "+SSN;
    }

    public static void main(String[] args) {
        ProjectPerson person1 = new ProjectPerson();
        person1.name="muhammer";
        person1.age=18;
        person1.SSN=1234567;

        ProjectPerson person2 = new ProjectPerson();
        person2.name="ahmet";
        person2.age=28;
        person2.SSN=1234567;

        System.out.println(person2.getInfo());




    }

}

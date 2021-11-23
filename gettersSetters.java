class Encapsulation
{
    private String name;
    private int rollNum;
    private int age; 


    public String getName()
    {
        return name;
    }

    public int getRoll()
    {
        return rollNum;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String newName)
    {
        name = newName;
    }
   
    public void setAge(int newAge)
    {
        age =newAge;


    }

    public void setRoll(int newRoll)
    {
        rollNum = newRoll;
    }
}



public class TestEncapsulation{
    public static void main(String args[])
    {
        Encapsulation obj = new Encapsulation();
        obj.setName("Dave");
        obj.setRoll(100);
        obj.setAge(28);
        System.out.println("Age is " +obj.getAge());
        System.out.println("Roll number is " + obj.getRoll());
        System.out.println("Name is " + obj.getName());
        
    }
}

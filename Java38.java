// Day : 38 Creating Our Own Java Class

class Employee
{
    int id; // attribute 1
    String name; // attribute 2
    int salary;

    public int getSalary()
    {
        return salary;
    }

    public void printDetails()
    {
        System.out.println("My id is " + id);
        System.out.println("and My name is " + name);
    }
};

public class Java38
{
    public static void main(String[] args)
    {
        System.out.println("This is our custom class!");
        Employee karan = new Employee(); // Instantiation a new Employee Object

        // Setting attributes for karan :
        karan.id = 1; // Setting Attribute 1
        karan.name = "Karan Veer Pal"; // Setting Attribute 2
        karan.salary = 34;

        System.out.println("Employee Id = " + karan.id); // Printing the attribute 1
        System.out.println("Employee Name = " + karan.name);  // Printing the attribute 2
        int karanSalary = karan.getSalary();
        System.out.println("Karan Salary = " + karanSalary + "\n");

        System.out.println("Print details by using method : ");
        Employee lucky = new Employee();

        // Setting attributes for lucky :
        lucky.id = 2;
        lucky.name = "Lucky Soni";
        lucky.salary = 32;

        lucky.printDetails();
        int luckySalary = lucky.getSalary();
        System.out.println("Lucky Salary = " + luckySalary);
    }
}

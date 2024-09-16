// Day : 42 Constructor

class MyMainEmployee
{
    private int id;
    private String name;
    private int salary;

    // Constructor is invoked automatically!
    // Default Constructor :
    public MyMainEmployee()
    {
        id = 1;
        name = "Your-Name-Here";
    }

    // Parameterized Constructor :
    public MyMainEmployee(String myName, int ID)
    {
        id = ID;
        name = myName;
    }

    // Copy constructor
    public MyMainEmployee(MyMainEmployee emp) {
        this.id = emp.id;
        this.name = emp.name;
    }

    // Quick Quiz :
    public MyMainEmployee(int salaryy)
    {
        this.salary = salaryy;
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public int getSalary()
    {
        return salary;
    }
};

public class Java42
{
    public static void main(String[] args)
    {
        MyMainEmployee karan1 = new MyMainEmployee(); // --> For Default Constructor
        MyMainEmployee karan2 = new MyMainEmployee("Karan", 2); // -->  For Parameterized Constructor
        MyMainEmployee karan3 = new MyMainEmployee(karan2);

        System.out.println("Default Constructor : ");
        System.out.println("ID = " + karan1.getId());
        System.out.println("Name = " + karan1.getName());

        System.out.println("\nParameterized Constructor : ");
        System.out.println("ID = " + karan2.getId());
        System.out.println("Name = " + karan2.getName());

        System.out.println("\nCopied Employee:");
        System.out.println("ID = " + karan3.getId());
        System.out.println("Name = " + karan3.getName());

        // Quick Quiz : Overload the MyMainEmployee Constructor to initialize the salary to Rs 10,000/- ?
        MyMainEmployee karan4 = new MyMainEmployee(44000);

        System.out.println("Quick Quiz :");
        System.out.println("\nSalary = " + karan4.getSalary());
    }
}

// Day : 40 Access Modifier

class MyEmployee
{
    int id;
    private String name;

    // Setter :
    public void setName(String n)
    {
        this.name = n; // means set this name variable.
    }

    public String getName()
    {
        return name;
    }
};

// Class Circle
class Gola
{
    private float radius;

    // Setter :
    public void setCircle(float r)
    {
        this.radius = r;
    }

    // Getter :
    public void getCircle()
    {
        System.out.println("Radius of a Circle = " + radius);
        System.out.println("Area of a Circle = " + 3.14f * radius * radius);
        System.out.println("Perimeter of a Circle = " + 2 * 3.14f * radius);
    }
};

public class Java40
{
    public static void main(String[] args)
    {
        MyEmployee karan = new MyEmployee();
        karan.id = 1;
        System.out.println("Id = " + karan.id); // It is accessible because of id is default public.
        // karan.name = "Karan Veer Pal"; // This line through an error because name property of MyEmployee Class is Private which is an Access Modifier.
        // So, these property is accessible by using Methods which is Data Hiding Implementation. It is protected from the outside the world.
        // Hence, we can use the getter and setter to fix the property of MyEmployee Class.

        karan.setName("Karan Veer Pal");
        System.out.println("Name = " + karan.getName());

        System.out.println("-----------------------------------------");

        // Circle :
        // Quick Quiz : Write a Circle class, set the Circle things by Method using Getter and Setter?
        Gola cir = new Gola();
        cir.setCircle(2.0f);
        cir.getCircle();
    }
}

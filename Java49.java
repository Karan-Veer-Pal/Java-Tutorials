// Day : 49 Dynamic Method Dispatch

class Phone
{
    public void playMusic()
    {
        System.out.println("Playing Music...!");
    }
    public void on()
    {
        System.out.println("Turning On Phone.....!");
    }
}

class SmartPhone extends Phone
{
    public void openCamera()
    {
        System.out.println("Camera is Open....");
    }
    @Override
    public void on()
    {
        System.out.println("Turning On Smart Phone.....!");
    }
}

public class Java49
{
    public static void main(String[] args)
    {
        // Phone nokia = new Phone(); // --> Allowed
        // nokia.name();
        // SmartPhone iPhone = new SmartPhone();  // --> Allowed
        // iPhone.name();

        // Phone iQ = new SmartPhone(); // --> Not produce Error; It can run easily But vice-versa is not possible!
        // SmartPhone oppo = new Phone(); // --> Not Possible or Not Allowed!

        // Super Class reference is equal to object of Sub Class! but Sub Class reference is not equal to object of Super Class!

        Phone iQ = new SmartPhone();
        iQ.playMusic();
        iQ.on(); // Tell me which on() function is call by the object : SmartPhone's on() function is call by the object because we use SmartPhone's Class Object like -> new SmartPhone();! This is known as Dynamic Method Dispatch
        // And Dynamic Method Dispatch is also use for run time Polymorphism! Otherwise, actual object creation when program run!
        // iQ.openCamera(); // --> Not Allowed

        // Method is Decide on a run time which method should be run!
    }
}

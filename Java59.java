// Day : 59 Polymorphism using Interfaces

interface Camera59
{
    void takeSnap59();

    default void recordVideo59()
    {
        System.out.println("Recording Video in 1080p!");
    }

    private void takeSelfie59() // Private method not access through implemented class, but we can access through using default method like this :
    {
        System.out.println("Taking Selfie...s!");
    }

    default void record4KVideo59()
    {
        takeSelfie59();
        System.out.println("Recording in 4K...!");
    }

    // When we introduce a new method in interface then we need to define the body of the method in implemented class;
    // If you need to define the body of the method in interface then we use the keyword *default.
    // We can also re-implement and override the default method.
}

interface Wifi59
{
    String[] getNetwork59();
    void connectToNetwork59(String network);
}

class CellPhone59
{
    void callNumber59(int phoneNumber)
    {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall59()
    {
        System.out.println("Connecting...");
    }
}

class SmartPhone59 extends CellPhone59 implements Wifi59, Camera59
{
    public void takeSnap59()
    {
        System.out.println("Taking Snap!");
    }

    @Override
    public void recordVideo59()
    {
        System.out.println("Recording Video in 2K!");
    }

    public String[] getNetwork59()
    {
        System.out.println("Getting List of Networks..");
        String[] networkList = {"KaranAirBender", "AirtelAirFibre", "JioAirFibre"};
        return networkList;
    }

    public void connectToNetwork59(String network)
    {
        System.out.println("Connecting to " + network);
    }
}

public class Java59
{
    public static void main(String[] args)
    {
        Camera59 cam1 = new SmartPhone59(); // --> This is a smartphone but use as a Camera! because we use  a reference as a Camera59
        // cam1.getNetwork59(); --> Not Allowed!
        cam1.record4KVideo59();

        System.out.println("");

        SmartPhone59 s = new SmartPhone59();
        s.recordVideo59();
        s.getNetwork59();
        s.callNumber59(8956074);
    }
}

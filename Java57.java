// Day : 57 Interfaces Example & Default Methods

interface Camera57
{
    void takeSnap57();

    default void recordVideo57()
    {
        System.out.println("Recording Video in 1080p!");
    }

    private void takeSelfie() // Private method not access through implemented class, but we can access through using default method like this :
    {
        System.out.println("Taking Selfie...s!");
    }

    default void record4KVideo57()
    {
        takeSelfie();
        System.out.println("Recording in 4K...!");
    }

    // When we introduce a new method in interface then we need to define the body of the method in implemented class;
    // If you need to define the body of the method in interface then we use the keyword *default.
    // We can also re-implement and override the default method.
}

interface Wifi57
{
    String[] getNetwork57();
    void connectToNetwork57();
}

class CellPhone57
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall()
    {
        System.out.println("Connecting...");
    }
}

class SmartPhone57 extends CellPhone57 implements Wifi57, Camera57
{
    public void takeSnap57()
    {
        System.out.println("Taking Snap!");
    }

    @Override
    public void recordVideo57()
    {
        System.out.println("Recording Video in 2K!");
    }

    public String[] getNetwork57()
    {
        System.out.println("Getting List of Networks..");
        String[] networkList = {"KaranAirBender", "AirtelAirFibre", "JioAirFibre"};
        return networkList;
    }

    public void connectToNetwork57()
    {
        System.out.println("Recording Video!");
    }
}

public class Java57
{
    public static void main(String[] args)
    {
        SmartPhone57 PocoM3 = new SmartPhone57();
        PocoM3.recordVideo57();
        PocoM3.record4KVideo57();
        // PocoM3.takeSelfie(); --> Through an error

        String[] ar = PocoM3.getNetwork57();
        for(String item : ar)
        {
            System.out.println(item);
        }
    }
}

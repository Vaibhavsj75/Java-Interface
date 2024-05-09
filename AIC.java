package Interface;

interface Car
{
    void drive();
}

public class AIC 
{
    public static void main(String[] args)
    {
        Car obj = new Car() 
        {
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        obj.drive();
    }
}
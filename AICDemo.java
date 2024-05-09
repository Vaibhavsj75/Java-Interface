package Interface;

interface Car
{
    void drive(int avg, int ts);
}

public class AICDemo 
{
    public static void main(String[] args){
    
        Car obj = (avg, ts) -> System.out.println("Driving..."+ avg + " : "+ ts);
        
        
        obj.drive(16, 140);
    }
} 

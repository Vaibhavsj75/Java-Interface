package Interface;

interface Computer
{
    void CompileCode();
}
class Laptop implements Computer
{
    public void CompileCode()
    {
        System.out.println("You got 5 errors");
    }
}
class Dekstop implements Computer
{
    public void CompileCode()
    {
        System.out.println("You got 5 errors, Faster");
    }
}
class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.CompileCode();
    }
}
public class Interface1
{
    public static void main(String[] args)
    {
        //Laptop obj=new Laptop();
        Computer obj=new Dekstop();

        Developer dev=new Developer();
        dev.buildApp(obj);
    }
}
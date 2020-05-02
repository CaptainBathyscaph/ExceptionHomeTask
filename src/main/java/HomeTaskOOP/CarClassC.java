package HomeTaskOOP;

public class CarClassC extends Car {
    public CarClassC (String mark, String modelName, int yearOfIssue, int cost, double height, double width, double length )
    {
        super(mark, modelName, yearOfIssue, cost, height, width, length);
    }
    public void printDescription()
    {
        System.out.println("Class C is Medium cars ");
    }
}

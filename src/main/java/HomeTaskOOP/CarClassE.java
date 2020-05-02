package HomeTaskOOP;

public class CarClassE extends Car {
    public CarClassE(String mark, String modelName, int yearOfIssue, int cost, double height, double width, double length) {
        super(mark, modelName, yearOfIssue, cost, height, width, length);
    }
    public void printDescription()
    {
        System.out.println("Class E is Executive cars  ");
    }
}

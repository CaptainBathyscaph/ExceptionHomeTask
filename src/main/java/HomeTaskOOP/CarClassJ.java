package HomeTaskOOP;

public class CarClassJ extends Car {

    public CarClassJ(String mark, String modelName, int yearOfIssue, int cost, double height, double width, double length) {
        super(mark, modelName, yearOfIssue, cost, height, width, length);
    }

    public void printDescription()
    {
        System.out.println("Class J is Sport Utility Vehicle ");
    }
}

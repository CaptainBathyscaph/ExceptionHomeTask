package HomeTaskOOP;

public abstract class Car {
    protected String mark;
    protected String modelName;
    protected int yearOfIssue;
    protected int cost;
    protected double height;
    protected double width;
    protected double length;

    public Car(String mark, String modelName, int yearOfIssue, int cost, double height, double width, double length) {
        this.mark = mark;
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.cost= cost;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getCost() {
        return cost;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", modelName='" + modelName + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", cost=" + cost +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

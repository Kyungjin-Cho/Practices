public class Employee {
  // Declare variables
  private String name;
  private int age;
  private double ySal, mSal;

  // Constructors
  public Employee() {
  }

  public Employee(String name, int age, double ySal, double mSal) {
    this.name = name;
    this.age = age;
    this.ySal = ySal;
    this.mSal = mSal;
  }

  public Employee(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setYsal(double ySal) {
    this.ySal = ySal;
  }

  public double getYsal() {
    return ySal;
  }

  public void setMsal(double mSal) {
    this.mSal = mSal;
  }

  public double getMsal() {
    return mSal;
  }

  @Override
  public String toString() {
    return "Employee{" + "name: " + name + ", age: " + age + ", ySal: " + ySal + ", mSal: " + mSal + "}";
  }

}

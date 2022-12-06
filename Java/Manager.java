public class Manager extends Employee {
  // Declare variables
  private String dept;

  public Manager() {

  }

  public Manager(String dept, String name, int age, double ySal, double mSal) {
    super(name, age, ySal, mSal);
    this.dept = dept;
  }

  public Manager(String dept, String name) {
    super(name);
    this.dept = dept;
  }

  @Override
  public String toString() {
    return "Manager{" + "dept=" + dept + "}, " + super.toString();
  }

}
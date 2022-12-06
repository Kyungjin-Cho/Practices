public class EmployeeApp {
  public static void main(String[] args) {
    Employee enda = new Employee("Enda", 34, 24000, 2000);
    System.out.println("Employee Enda: " + enda.toString());

    Employee liam = new Employee("Liam");
    System.out.println("Employee Liam: " + liam.toString());

    liam.setAge(60);
    System.out.println("Employee Liam: " + liam.toString());

    Manager mom = new Manager("CEO", "Murt");
    System.out.println("Employee MOM: " + mom.toString());
  }
}

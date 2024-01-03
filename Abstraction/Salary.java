public class Salary extends Employee {
    private double salary; // Annual salary

    public Salary (String name, String address, int number , double salary) {
        super(name, address , number);
        setSalary(salary);
    }
    public void mailcheck () {
        System.out.println ("Within mailcheck of Salary Class");
        System.out.println ("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary (double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println ("Computing slary pay for " + getName());
        return salary/52;
    }
}

package source;

public class Salary {
    private double salary;
    private static final double personalAllowance = 9440;
    public Salary() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        }
    }

    public double calculateTax(){
    	double tax = 0;
    	double taxableSalary = this.salary - personalAllowance;
    	if(taxableSalary < 32010 && this.salary > personalAllowance) {
    		tax = ((taxableSalary) * 0.2);
    	}
    	else if(taxableSalary >= 32010) {
    		tax = ((taxableSalary - 32010) * 0.4) + (6402);
    	}
    	else if(this.salary <= personalAllowance) {
    		tax = 0;
    	}
    	return tax;
    }
}

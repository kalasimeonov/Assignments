package source;

public class Employee {
    private int id;
    private String forename;
    private String surname;
    private Salary salary;
    private CompanyPosition companyPostion;

    public Employee(int identifier, String forename,
                    String surname, Salary salary,
                    CompanyPosition companyPostion) {
        this.id = identifier;
        this.forename = forename;
        this.surname = surname;
        this.salary = salary;
        this.companyPostion = companyPostion;
    }

    public int getId() {
        return this.id;
    }

    public String getForename() {
        return this.forename;
    }

    public String getSurname() {
        return this.surname;
    }

    public double getSalary() {
        return this.salary.getSalary();
    }

    public String getPositionName() {
        return this.companyPostion.getPositionName();
    }

    
    public boolean eligibleForBonus(){
    	if(getSalary() >= 40000) {
    		return true;
    	}
    	return false;
    }

    public String toString(){
    	StringBuffer buff = new StringBuffer();
    	buff.append(getSurname());
    	buff.append(", ");
    	buff.append(getForename());
    	buff.append(" (" + getId() + "): ");
    	buff.append(getPositionName() + " at ");
    	buff.append("£" + getSalary() + " (£");
    	buff.append(this.salary.calculateTax() + " tax) and ");
    	if(eligibleForBonus()) {
    		buff.append("is eligible for bonus.");
    	}
    	else {
    		buff.append("is not eligible for bonus.");
    	}
        return buff.toString();
    }
}

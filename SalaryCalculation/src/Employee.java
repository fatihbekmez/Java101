
public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    private int taxPay;
    Employee (int hireYear, int workHours, double salary, String name){
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
        this.name = name;
    }


    public double tax(){
        if(this.salary >= 1000){
            return salary*0.3;
        }else{
            return 0.0;
        }
    }

    public double bonus(){
        if(this.workHours > 40){
            int fazlamesai = workHours - 40;
            return fazlamesai * 30.00;
        }else{
            return 0.0;
        }
    }

    public double raiseSalary(){
        int year = 2023 - this.hireYear;
        if (year < 10){
            return salary * 0.5;
        }else if (year > 10 && year < 20){
            return salary * 0.10;
        }else{
            return salary * 0.15;
        }
    }
}

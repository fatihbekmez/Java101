public class EmpDriver {

    public static void main(String[] args) {
        Employee emp1 = new Employee(10,43,2000,"Fatih");
        System.out.println("Adı: " + emp1.name);
        System.out.println("Çalışma Saati:" + emp1.workHours);
        System.out.println("Başlangıç Yılı: " + (2023 - emp1.hireYear));
        System.out.println("Vergi:" + emp1.tax());
        System.out.println("Maaşı: " + emp1.salary);
        System.out.println("Bonus: " + emp1.bonus());
        System.out.println("Maaş Artışı: " + emp1.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (emp1.bonus() + emp1.salary));
        System.out.println("Toplam maaş:" + (emp1.bonus() + emp1.raiseSalary() + emp1.salary));

    }
}
    
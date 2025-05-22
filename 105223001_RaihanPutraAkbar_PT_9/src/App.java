import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SoftwareEngineer());
        employees.add(new DataScientist());
        employees.add(new Intern());
        for(Employee employee : employees){
            if (employee instanceof SoftwareEngineer softwareEngineer) {
                softwareEngineer.calculateSalary();
                softwareEngineer.calculateSalary(true, 2000000);
            }else if (employee instanceof DataScientist dataScientist) {
                dataScientist.calculateSalary();
                dataScientist.calculateSalary(true, 3000000);
            }else if (employee instanceof Intern intern) {
                intern.calculateSalary();
                intern.calculateSalary(true, 500000);
            }
        }
    }
}

class Employee{
    public void calculateSalary(){
    }
    public void calculateSalary(boolean withBonus){}{
    }
}

class SoftwareEngineer extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("===== Slip Gaji =====");
        System.out.println("Gaji pokok Software Engineer: Rp7.000.000");
        System.out.println("Total Gaji: Rp7.000.000");
    }
    public void calculateSalary(boolean withBonus, int bonus){
        System.out.println("===== Slip Gaji =====");
        System.out.println("Gaji pokok Software Engineer: Rp7.000.000");
        if(withBonus){
            System.out.println("Bonus: Rp2.000.000");
            System.out.println("Total Gaji: Rp9.000.000");
        }else{
            System.out.println("Total Gaji: Rp7.000.000");
        }
    }
}

class DataScientist extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("===== Slip Gaji =====");
        System.out.println("Gaji pokok Data Scientist: Rp8.000.000");
        System.out.println("Total Gaji: Rp8.000.000");
    }
    public void calculateSalary(boolean withBonus, int bonus){
        System.out.println("===== Slip Gaji =====");
        System.out.println("Gaji pokok Data Scientist: Rp8.000.000");
        if(withBonus){
            System.out.println("Bonus: Rp3.000.000");
            System.out.println("Total Gaji: Rp11.000.000");
        }else{
            System.out.println("Total Gaji: Rp8.000.000");
        }
    }

}

class Intern extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("===== Slip Gaji =====");
        System.out.println("Gaji pokok Karyawan magang: Rp2.000.000");
        System.out.println("Total Gaji: Rp2.000.000");
    }
    public void calculateSalary(boolean withBonus, int bonus){
        System.out.println("===== Slip Gaji =====");
        System.out.println("Gaji pokok Karyawan magang: Rp2.000.000");
        if(withBonus){
            System.out.println("Bonus: Rp500.000");
            System.out.println("Total Gaji: Rp2.500.000");
        }else{
            System.out.println("Total Gaji: Rp2.000.000");
        }
    }
}
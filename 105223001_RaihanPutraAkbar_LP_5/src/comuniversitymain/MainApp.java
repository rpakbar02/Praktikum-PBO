package comuniversitymain;
import comuniversitymodel.Student;

public class MainApp {
    public static void main(String[] args) {
        Student[] mahasiswa; 
        mahasiswa = new Student[5];
        mahasiswa[0] = new Student("A001", "Raihan", 20, 3.5);
        mahasiswa[1] = new Student("A002", "Fajar", 22, 3.0);
        mahasiswa[2] = new Student("A003", "Dwi", 21, 3.8);
        mahasiswa[3] = new Student("A004", "Rizky", 20, 3.9);
        mahasiswa[4] = new Student("A005", "Eka", 21, 3.7);
        System.out.println("=== Data Mahasiswa ===");
        for (int i = 0; i < mahasiswa.length; i++){
            System.out.println("ID: " + mahasiswa[i].getStudentId() + ", Nama: " + mahasiswa[i].getName() + ", Umur: " + mahasiswa[i].age() + ", GPA: " + mahasiswa[i].getGpa());
        }
    }
}

import java.util.ArrayList;
 
public class Bai3 {
 
   
    static class Student {
        private String mssv;
        private String name;
        private double diemCC, diemGK, diemCK;
 
        public Student(String mssv, String name, double diemCC, double diemGK, double diemCK) {
            this.mssv = mssv;
            this.name = name;
            this.diemCC = diemCC;
            this.diemGK = diemGK;
            this.diemCK = diemCK;
        }
 
        public String getMssv() { return mssv; }
        public String getName() { return name; }
 
        public double diemTrungBinh() {
            return diemCC * 0.1 + diemGK * 0.3 + diemCK * 0.6;
        }
    }
 
   
    static class Classroom {
        private String tenLop;
        private ArrayList<Student> danhSach = new ArrayList<>();
 
        public Classroom(String tenLop) {
            this.tenLop = tenLop;
        }
 
       
        public void addStudent(Student s) {
            for (Student x : danhSach) {
                if (x.getMssv().equals(s.getMssv())) {
                    throw new IllegalArgumentException("MSSV " + s.getMssv() + " đã tồn tại");
                }
            }
            danhSach.add(s); 
        }
 
   
        public String xepLoai(Student s) {
            double diem = s.diemTrungBinh();
            if (diem >= 8) {
                return "Giỏi";
            } else if (diem >= 6.5) {
                return "Khá";
            } else if (diem >= 5) {
                return "Trung bình";
            } else {
                return "Yếu";
            }
        }
 
       
        public void inBangDiem() {
            System.out.println("Lớp " + tenLop);
            for (Student s : danhSach) {
                System.out.println(s.getMssv() + " | " + s.getName() + " | " + Math.floor(s.diemTrungBinh()) + " | " + xepLoai(s));
            }
            System.out.println("Sĩ số: " + danhSach.size());
        }
    }
 
    public static void main(String[] args) {
        Classroom lop = new Classroom("D21CQCN01");
 
        lop.addStudent(new Student("B21DCCN001", "Lan", 8, 7.5, 9));
        lop.addStudent(new Student("B21DCCN002", "Minh", 6, 5, 7));
        lop.addStudent(new Student("B21DCCN003", "Hoa", 10, 9, 8));
        lop.addStudent(new Student("B21DCCN004", "Nam", 3, 4, 4));
 
       
        try {
            lop.addStudent(new Student("B21DCCN002", "Trùng", 5, 5, 5));
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
 
        lop.inBangDiem();
    }
}
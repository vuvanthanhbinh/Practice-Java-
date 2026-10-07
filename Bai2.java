
public class Bai2 {
 
    static class Student {
        
        private static int counter = 0;
 
        private String mssv;
        private String name;
        private double diemCC, diemGK, diemCK;
        private String email;
        private String sdt;
 
        
        public Student(String name, double diemCC, double diemGK, double diemCK) {
            counter = counter + 1;                      
            this.mssv = "B21DCCN00" + counter;           
            this.name = name;
            this.diemCC = diemCC;
            this.diemGK = diemGK;
            this.diemCK = diemCK;
        }
 
        public Student capNhatEmail(String email) {
            this.email = email;
            return this;
        }
 
        public Student capNhatSdt(String sdt) {
            this.sdt = sdt;
            return this;
        }
 
        
        public static int getTotalStudents() {
            return counter;
        }
 
        public String getMssv() { return mssv; }
        public String getEmail() { return email; }
        public String getSdt() { return sdt; }
    }
 
    public static void main(String[] args) {
        Student sv1 = new Student("Lan", 8, 7.5, 9);
        Student sv2 = new Student("Minh", 6, 5, 7);
        Student sv3 = new Student("Hoa", 10, 9, 8);
 
        
        sv1.capNhatEmail("lan@ptit.edu.vn").capNhatSdt("0912345678");
 
        System.out.println(sv1.getMssv());   
        System.out.println(sv2.getMssv());   
        System.out.println(sv3.getMssv());  
 
        System.out.println(sv1.getEmail());  
        System.out.println(sv1.getSdt());    
 
        System.out.println(Student.getTotalStudents()); 
    }
}
public class Bai1 {

    static class Student {
        private String mssv;
        private String name;
        private double diemCC, diemGK, diemCK;
 
        public Student(String mssv, String name, double diemCC, double diemGK, double diemCK) {
            this.mssv = mssv;
            this.name = name;
            setDiemCC(diemCC);
            setDiemGK(diemGK);
            setDiemCK(diemCK);
        }
 
        public String getMssv() { 
        	return mssv; }
        public String getName() { 
        	return name; }
        public double getDiemCC() { 
        	return diemCC; }
        public double getDiemGK() { 
        	return diemGK; }
        public double getDiemCK() { 
        	return diemCK; }
 
        private static boolean hopLe(double d) { return d >= 0 && d <= 10; }
 
        public void setDiemCC(double d) {
            if (hopLe(d)) diemCC = d;
            else System.out.println("Điểm chuyên cần không hợp lệ: " + d);
        }
        public void setDiemGK(double d) {
            if (hopLe(d)) diemGK = d;
            else System.out.println("Điểm giữa kì không hợp lệ: " + d);
        }
        public void setDiemCK(double d) {
            if (hopLe(d)) diemCK = d;
            else System.out.println("Điểm cuối kì không hợp lệ: " + d);
        }
 
        public double diemTrungBinh() {
            return diemCC * 0.1 + diemGK * 0.3 + diemCK * 0.6;
        }
    }
 
    public static void main(String[] args) {
        Student a = new Student("B21DCCN001", "Lan", 8, 7.5, 9);
        Student b = new Student("B21DCCN002", "Minh", 6, 5, 7);
        Student c = new Student("B21DCCN003", "Hoa", 10, 9, 8);
 
        System.out.println(" Msv : " + a.getMssv() + " - " + a.getName() + " - " + a.diemTrungBinh());
        System.out.println(" Msv : " + b.getMssv() + " - " + b.getName() + " - " + Math.floor(b.diemTrungBinh()));
        System.out.println(" Msv : " + c.getMssv() + " - " + c.getName() + " - " + c.diemTrungBinh());
        
    }
}

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "09500000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK","123123");
        Teacher t3 = new Teacher("ali ali", "BIO","111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103","BIO");
        biyo.addTeacher(t3);


        Student s1 = new Student("Fatih","123456", "2", tarih,fizik,biyo);
        s1.addBullExaamNote(70,70,70);
        s1.addBulkVerbalNote(90,90,90);
        s1.isPass();
    }
}
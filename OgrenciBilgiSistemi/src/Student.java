public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course verbalNote1;
    Course verbalNote2;
    Course verbalNote3;
    String name;
    String stuNo;
    String classes;
    double avarge;
    double verAvarge;
    double totAvarge;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarge = 0.0;
        this.isPass = false;
    }

    void addBullExaamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        } else {
            System.out.println("Lüften girilen notları 0 ile 100 arasında giriniz ! ");
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        } else {
            System.out.println("Lüften girilen notları 0 ile 100 arasında giriniz ! ");
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        } else {
            System.out.println("Lüften girilen notları 0 ile 100 arasında giriniz ! ");
        }
    }

    void addBulkVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.c1.verbalNote = verbalNote1;
        } else {
            System.out.println("Lüften girilen notları 0 ile 100 arasında giriniz ! ");
        }
        if(verbalNote2 >=0&&verbalNote2<=100)

        {
            this.c2.verbalNote = verbalNote2;
        }else
        {
            System.out.println("Lüften girilen notları 0 ile 100 arasında giriniz ! ");
        }
        if(verbalNote3 >=0&&verbalNote3<=100)
        {
            this.c3.verbalNote = verbalNote3;
        }else
        {
            System.out.println("Lüften girilen notları 0 ile 100 arasında giriniz ! ");
        }
    }


        void isPass() {
            this.avarge = ((this.c1.note* 0.8) + (this.c2.note* 0.8)+(this.c3.note* 0.8)) / 3.0;
            this.verAvarge = ((this.c1.verbalNote* 0.2) + (this.c2.verbalNote* 0.2)+(this.c3.verbalNote* 0.2)) / 3.0;
            this.totAvarge = this.avarge + this.verAvarge;
            if (this.totAvarge >= 60.00){
                System.out.println("Sınıfı geçtiniz !" + " Ortalama :" + this.totAvarge);
                this.isPass = true;
            }else{
                System.out.println("Sınıfı geçemediniz.");
                this.isPass = false;
            }
            printNote();
        }


    void printNote(){
        System.out.println(c1.name + " Notu:" + c1.note);
        System.out.println(c2.name + " Notu:" + c2.note);
        System.out.println(c3.name + " Notu:" + c3.note);
    }
}

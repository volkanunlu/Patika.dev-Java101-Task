public class Student {
    Course mat;
    Course fizik;
    Course tarih;
    String name;
    String stuNo;
    String classes;
    Double average;
    Boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course fizik, Course tarih)
    {
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.mat=mat;
        this.fizik=fizik;
        this.tarih=tarih;
        this.average=0.0;
        this.isPass=false;

    }

    void addBulkExamNote(int note1, int note2, int note3) {

        if ((note1 >= 0) && (note1 <= 100)) {
            this.mat.note = note1;
        }
        if ((note2 >= 0) && (note2 <= 100))
        {
            this.fizik.note = note2;
        }
        if ((note3>=0)&&(note3<=100)) {
            this.tarih.note = note3;
        }

    }

    void addVerbal(int note1, int note2, int note3)
    {

        if (note1 >= 0 && note1 <= 100) {
            this.mat.verbalnote = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.fizik.verbalnote = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.tarih.verbalnote = note3;
        }

    }

    void isPass()
    {

        this.average=((this.mat.note*0.8+this.mat.verbalnote*0.2)+this.fizik.note*0.8+this.fizik.verbalnote*0.2+this.tarih.note*0.8+this.tarih.verbalnote*0.2)/(3.0);
        if (this.average>55){

            System.out.println("Sınıfı geçtiniz."+"Ortalamanız:"+average);
            this.isPass=true;
        }
        else {

            System.out.println("Sınıfta kaldınız!"+"Ortalamanız:"+average);
            this.isPass=false;
        }
        printNote();
    }

    void printNote(){
        System.out.println("=========================");
        System.out.println(this.mat.name+" Sınav Notu:"+this.mat.note+" Sözlü Notu:"+this.mat.verbalnote);
        System.out.println(this.fizik.name+" Sınav Notu:"+this.fizik.note+" Sözlü Notu:"+this.fizik.verbalnote);
        System.out.println(this.tarih.name+" Sınav Notu:"+this.tarih.note+" Sözlü Notu:"+this.tarih.verbalnote);
        System.out.println("=========================");


    }


}

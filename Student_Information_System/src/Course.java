public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbalnote;
    Teacher teacher; //nesneden bir referans ürettik.Bir sınıfın niteliğine diğer bir sınıfı atayabiliyoruz.Bir değişken olarak.

    Course(String name, String code,String prefix) //Not varsayılan değer alacak o yüzden almadık.
    {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.verbalnote=0;

    }
    void addTeacher(Teacher teacher){

        if (teacher.branch.equals(this.prefix))
        {
            this.teacher=teacher;
            //printTeacher();
        }
        else{
            System.out.println("Öğretmen ve Ders uyuşmuyor.");
        }

    }



    void printTeacher(){

        this.teacher.print();
    }

}

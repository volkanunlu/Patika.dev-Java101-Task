public class Main {
    public static void main(String[] args) {


    Teacher t1=new Teacher("Volkan","05072668544","TRH");
    //t1.print();
    Teacher t2=new Teacher("Fahri","05044875447","FZK");
    Teacher t3=new Teacher("Külyutmaz","05411578447","MAT");

    Course tarih=new Course("Tarih","555","TRH");
    tarih.addTeacher(t1);

    Course fizik=new Course("Fizik","444","FZK");
    fizik.addTeacher(t2);
    Course matematik=new Course("Matematik","333","MAT");
    matematik.addTeacher(t3);




    Student ogr=new Student("İnek Şaban","1452","11",tarih,fizik,matematik);
    ogr.addBulkExamNote(10,10,10);
    ogr.addVerbal(60,65,100);
    //s1.printNote();
    ogr.isPass();

    Student ogr2 = new Student("Güdük Necmi", "452", "2211133",tarih, fizik, matematik);
        ogr2.addBulkExamNote(100,50,40);
        ogr2.addVerbal(45,80,60);
        ogr2.isPass();

    Student ogr3 = new Student("Hayta İsmail", "4","456321" , tarih, fizik, matematik);
        ogr3.addBulkExamNote(50,20,40);
        ogr3.addVerbal(80,55,96);

        ogr3.isPass();




}}

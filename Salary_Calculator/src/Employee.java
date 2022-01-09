public class Employee {

//    Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.
//    Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.
//
//    Sınıfın Nitelikleri
//
//    name : Çalışanın adı ve soyadı
//    salary : Çalışanın maaşı
//    workHours : Haftalık çalışma saati
//    hireYear : İşe başlangıç yılı
//    Sınıfın Metotları
//
//    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.



    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double total;
    double raise;



    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.total = this.salary;
        this.raise = 0; //default
        this.bonus = 0;
        this.tax   = 0;

    }

   /* tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.*/


       double tax() //Maaşa uygulanan vergi hesaplanacaktır.
        {
            if (this.salary < 1000)
            {
                double vergi=0;
                this.tax+=vergi;
                return this.tax;
            } else
            {
                double vergi = (this.salary *0.03) ;
                this.tax+=vergi;
                return this.tax;
            }
        }
/*
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
*/
      int bonus()
        {
            if (this.workHours>40)
            {

                int tutar=(this.workHours-40)*30;
                this.bonus+=tutar;
                return this.bonus;
            }
            else
            {
                return this.bonus;
            }
        }
       double raiseSalary()
        {

            if(2021-this.hireYear<10)
            {
                this.raise=(this.salary)*(0.05);
                return this.raise;
            }

            else if (2021-this.hireYear>=9 && 2021-this.workHours<=20)
            {
                this.raise=(this.salary)*(0.10);
                return this.raise;
            }
            else if (2021-this.hireYear>20)
            {
                this.raise+=(this.salary)*(0.15);
                return this.raise;
            }
            else
            {
                System.out.println("Belirlenemeyen bir aralık.");
                return this.raise;
            }



        }
/*    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.*/

    void printinfo()
    {
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("İşe başlangıç yılı:"+this.hireYear);
        System.out.println("Vergi tutarı :" +this.tax);
        System.out.println("Bonus : " +this.bonus );
        System.out.println("Maaş artışı :" +this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" +(this.salary-this.tax+this.bonus));
        System.out.println("Toplam Maaş : " +(this.salary-this.tax+this.bonus+this.raise));
    }

    }


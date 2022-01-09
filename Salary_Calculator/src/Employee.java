public class Employee {

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


       public void tax() //Maaşa uygulanan vergi hesaplanacaktır.
        {
            if (this.salary < 1000)
            {
                double vergi=0;
                this.tax+=vergi;
                System.out.println("Vergiden muaf bir  maaştır." + this.tax );
            } else
            {
                double vergi = (this.salary *0.03) ;
                this.tax+=vergi;
                System.out.println("Vergi tutarı :" + vergi + "TL" + "Vergi sonrası maaş:" + this.tax + " TL");
            }
        }
/*
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
*/
      public void bonus()
        {
            if (this.workHours>40)
            {
                int tutar=(this.workHours)*30;
                this.bonus+=tutar;
                System.out.println("Bonus maaş tutarınız:" +this.bonus+ " TL");

            }
            else
            {
                System.out.println("Herhangi bir bonus ücret saptanmadı..");
            }
        }
       public void raiseSalary()
        {
            int year=2021;
            if(year-this.hireYear<10)
            {
                this.raise=(this.salary)*(0.05);
                System.out.println("Zamlı maaşınız : "+ this.raise);
            }

            else if (year-this.hireYear>=9 || year-this.workHours<=20)
            {
                this.raise=(this.salary)*(0.10);
                System.out.println("Zamlı maaşınız : "+ this.raise);

            }
            else if (year-this.hireYear>19)
            {
                this.raise+=(this.salary)*(0.15);
                System.out.println("Zamlı maaşınız : "+ this.raise);
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
        System.out.println("Toplam Maaş : " + this.tax);

    }

    }
    

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int chance;

    Fighter(String name, int damage, int health, int weight, int dodge, int chance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (this.dodge == 0 && this.dodge <= 100) {
            this.dodge = dodge;
        } else this.dodge = 0;
        if (this.chance == 0 && this.chance <= 100) {
            this.chance = chance;
        } else this.chance = 0;
    }


    int hit(Fighter foe) {    //foe=karşıt demek.


        System.out.println(this.name + "=>" + foe.name + "" + this.damage + "hasar vurdu.");
        if (isChance()) {

        }
        if (foe.isDodge()) {
            System.out.println(foe.name + "Gelen hasarı karşıladı!");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }



    boolean isDodge() {

        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;

    }

    boolean isChance()
    {
            double randomNumber = Math.random() * 100;
            return randomNumber <= this.chance;

    }
    }

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge <= 100){
        this.dodge = dodge;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => " + foe.name + " 'a " + this.damage + " hasar vurdu");

        if(foe.isDodge()){
            System.out.println(foe.name + " Gelen hasarı blokladı");
            return foe.health;
        }

        if (foe.health - this.damage <= 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randonNumber = Math.random() * 100;
        return randonNumber <= this.dodge;
    }
}


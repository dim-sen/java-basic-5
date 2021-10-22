package dimsen.oop;

public class Hero extends Action{

    public Hero(String name, int age, int energy) {
        this.name = name;
        this.age = age;
        this.energy = energy;
    }

    public void player() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("...............PLAYER...............");
        System.out.println("Name:\t" + this.name);
        System.out.println("Age:\t" + this.age);
        System.out.println("Energy:\t" + this.energy);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void energyChecker() {
        if (energy <= 0 ) {
            System.out.println();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(">>>>>>>>>RUN OUT OF ENERGY<<<<<<<<<");
            player();
            System.out.println(".............GAME OVER.............");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.exit(0);
        }
    }
}

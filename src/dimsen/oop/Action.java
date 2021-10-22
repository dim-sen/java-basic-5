package dimsen.oop;

public class Action {

    public String name;
    public int age, energy;

    public void walk() {
        System.out.println("Player " + name + " is walkin");
        energy -= 10;
    }

    public void run() {
        System.out.println("Player " + name + " is runnin");
        energy -= 10;
    }

    public void eat() {
        System.out.println("Player " + name + " is eatin");
        energy += 20;
    }

    public void drink() {
        System.out.println("Player " + name + " is drinkin");
        energy += 20;
    }

    public void jump() {
        System.out.println("Player " + name + " is jumpin");
        energy -= 20;
    }

    public void sit() {
        System.out.println("Player " + name + " is sittin");
        energy += 10;
    }

    public void attack() {
        System.out.println("Player " + name + " is attackin");
        energy -= 30;
    }

    public void finish() {
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("........Mission Accomplished........");
        System.out.println(">>>>>>>>>>Congratulations!<<<<<<<<<<");
    }

    public void showEnergy() {
        System.out.println("Remaining Energy: " + energy);
    }
}

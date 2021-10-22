package dimsen.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, j = 0,  act;

        Hero hero = new Hero("Dim", 21, 100);

        hero.player();

        System.out.println("ACTIONS LIST:");
        System.out.println("1. Eat");
        System.out.println("2. Drink");
        System.out.println("3. Sit");
        System.out.println("4. Walk");
        System.out.println("5. Run");
        System.out.println("6. Jump");
        System.out.println("7. Attack");

        do {
            System.out.println();
            System.out.print("Select An Action (1-7): ");
            act = scanner.nextInt();

            System.out.print("How Many Repetitions? ");
            i = scanner.nextInt();

            System.out.println();

            switch (act) {
                case 1 -> {
                    for (int a = 0; a < i; a++) {
                        hero.eat();
                    }
                    hero.showEnergy();
                }
                case 2 -> {
                    for (int a = 0; a < i; a++) {
                        hero.drink();
                    }
                    hero.showEnergy();
                }
                case 3 -> {
                    for (int a = 0; a < i; a++) {
                        hero.sit();
                    }
                    hero.showEnergy();
                }
                case 4 -> {
                    for (int a = 0; a < i; a++) {
                        hero.walk();
                    }
                    hero.showEnergy();
                }
                case 5 -> {
                    for (int a = 0; a < i; a++) {
                        hero.run();
                    }
                    hero.showEnergy();
                }
                case 6 -> {
                    for (int a = 0; a < i; a++) {
                        hero.jump();
                    }
                    hero.showEnergy();
                }
                case 7 -> {
                    for (int a = 0; a < i; a++) {
                        hero.attack();
                    }
                    hero.showEnergy();
                }
                default -> System.out.println("Option Not Available");
            }

            hero.energyChecker();
            j ++;

        }while (j != 8);

        hero.finish();
        hero.player();
    }
}

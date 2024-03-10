package org.nau.Task1;

import java.util.Scanner;

public class Task1 {
    private static AnimalService animalService = new AnimalService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Оберіть дію:");
            System.out.println("1. Додати тварину");
            System.out.println("2. Вивести список тварин");
            System.out.println("3. Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // зчитати зайвий рядок

            switch (choice) {
                case 1:
                    addAnimal(scanner);
                    break;
                case 2:
                    displayAnimals();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }

    private static void addAnimal(Scanner scanner) {
        System.out.println("Введіть ім'я тварини:");
        String name = scanner.nextLine();
        System.out.println("Введіть вік тварини:");
        int age = scanner.nextInt();
        scanner.nextLine(); // зчитати зайвий рядок
        System.out.println("Введіть вид тварини:");
        String kind = scanner.nextLine();
        System.out.println("Введіть ім'я власника:");
        String ownerName = scanner.nextLine();

        animalService.createAnimal(name, age, kind, ownerName);
        System.out.println("Тварину успішно додано");
    }

    private static void displayAnimals() {
        if (animalService.animalList.isEmpty()) {
            System.out.println("Список тварин порожній.");
        } else {
            System.out.println("Список тварин:");
            for (Animal animal : animalService.animalList) {
                System.out.println(animal.toString());
            }
        }
    }
}

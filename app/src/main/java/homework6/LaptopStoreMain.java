package homework6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LaptopStoreMain {
    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();
        store.addLaptop(new Laptop("черный", "Apple", "MacBook Pro", 1499.99));
        store.addLaptop(new Laptop("белый", "Dell", "XPS 13", 1199.99));
        store.addLaptop(new Laptop("серый", "HP", "Spectre x360", 1399.99));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерий:");
        System.out.println("1 - цвет");
        System.out.println("2 - бренд");
        System.out.println("3 - модель");
        System.out.println("4 - цена");
        int option = scanner.nextInt();
        scanner.nextLine();

        Map<String, String> filters = new HashMap<>();
        switch (option) {
            case 1:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                filters.put("color", color);
                break;
            case 2:
                System.out.println("Введите бренд:");
                String brand = scanner.nextLine();
                filters.put("brand", brand);
                break;
            case 3:
                System.out.println("Введите модель:");
                String model = scanner.nextLine();
                filters.put("model", model);
                break;
            case 4:
                System.out.println("Введите цену:");
                double price = scanner.nextDouble();
                scanner.nextLine();
                filters.put("price", Double.toString(price));
                break;
            default:
                System.out.println("Некорректный ввод.");
                return;
        }
        Set<Laptop> results = store.searchLaptops(filters);
        if (results.isEmpty()) {
            System.out.println("Ноутбуки не найдены.");
        } else {
            for (Laptop laptop : results) {
                System.out.println(laptop);
            }
        }
    }
}
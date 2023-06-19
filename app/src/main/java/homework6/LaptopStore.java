package homework6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LaptopStore {
    private Set<Laptop> laptops = new HashSet<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void removeLaptop(Laptop laptop) {
        laptops.remove(laptop);
    }

    public Set<Laptop> searchLaptops(Map<String, String> filters) {
        Set<Laptop> result = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean matches = true;
            for (Map.Entry<String, String> filter : filters.entrySet()) {
                String fieldName = filter.getKey();
                String expectedValue = filter.getValue();
                String actualValue = null;
                switch (fieldName) {
                    case "color":
                        actualValue = laptop.getColor();
                        break;
                    case "brand":
                        actualValue = laptop.getBrand();
                        break;
                    case "model":
                        actualValue = laptop.getModel();
                        break;
                    case "price":
                        actualValue = Double.toString(laptop.getPrice());
                        break;
                }
                if (actualValue == null || !actualValue.equals(expectedValue)) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                result.add(laptop);
            }
        }
        return result;
    }
}
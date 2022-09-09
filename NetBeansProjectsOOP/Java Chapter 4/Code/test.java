package Code;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars);
        }

    }
}

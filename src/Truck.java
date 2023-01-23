import java.util.ArrayList;
import java.util.List;

public class Truck extends Transport<DriverC> {
    public enum LoadCapacity {
        N1(0.0, 3.5),
        N2(3.51, 12.0),
        N3(12.0, null);
        private final Double maxCapacity;
        private final Double minCapacity;

        LoadCapacity(Double maxCapacity, Double minCapacity) {
            this.minCapacity = maxCapacity;
            this.maxCapacity = minCapacity;
        }


        public Double getMaxCapacity() {
            return maxCapacity;
        }

        @Override
        public String toString() {
            return " грузоподъёмность " +
                    " до" + minCapacity +
                    " от " + maxCapacity +
                    '}';
        }

        public Double getMinCapacity() {
            return minCapacity;
        }
    }

    private LoadCapacity capacity;

    public Truck(String brand, String model, double engineVolume, DriverC driver, double capacity, List<Mechanic<?>> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        if (capacity <= 3.5) {
            this.capacity = LoadCapacity.N1;
        } else if (capacity <= 12) {
            this.capacity = LoadCapacity.N2;
        } else if (capacity > 12) {
            this.capacity = LoadCapacity.N2;
        }
    }

    @Override
    public void startMoving() {
        System.out.println(" Грузовой  автомобиль марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Грузовой автомобиль марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void printType() {
        System.out.println("Данные по транспортному средству ГРУЗОВИК " + " грузоподъёмность от " +
                capacity.minCapacity + " до " + capacity.maxCapacity  +" тонн."+ super.toString());
    }

    @Override
    public void diagnosed() {
        System.out.println(" Проходит диагностику " + getBrand());
    }

    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у грузовика. " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у грузовика. " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у грузовика." + getBrand());

    }

    @Override
    public String toString() {
        return " ГРУЗОВИК " +
                " грузоподъёмность от " + capacity+
                " тонн. "+
                 super.toString();
    }
}


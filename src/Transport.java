import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic<?>> mechanics;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic<?>> mechanics) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = " default ";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = " default ";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        setDriver(driver);
        this.mechanics = mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic<?>> mechanics) {
        this.mechanics = mechanics;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public void printInfo() {
        System.out.println(" водитель" + getDriver().getName() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде. ");
    }

    public abstract void diagnosed();


    @Override
    public String toString() {
        return " Транспортное средство: " +
                " марка: " + brand +
                ", модель: " + model +
                ", объём двигателя: " + engineVolume +
                ", водитель: " + driver +
                ", механики: " + mechanics
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && driver.equals(transport.driver) && mechanics.equals(transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanics);
    }
}

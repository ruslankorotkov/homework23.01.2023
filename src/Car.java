import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Car extends Transport<DriverB> {

    public enum BodyType {
        BODY_S("Седан"),
        BODY_H("Хетчбек"),
        BODY_C("Купе"),
        BODY_U("Универсал"),
        BODY_V("Внедорожник"),
        BODY_K("Кроссовер"),
        BODY_P("Пикап"),
        BODY_F("Фургон"),
        BODY_M("Минивэн");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType, Set<Mechanic<?>> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.println(" Легковой автомобиль марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Легковой автомобиль марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ. ");

    }

    @Override
    public void printType() {
        System.out.println("Данные по транспортному средству ЛЕГКОВОЙ АВТОМОБИЛЬ " + super.toString() + " тип кузова " + bodyType.getBodyType() + " .");
    }

    @Override
    public void diagnosed() {
        System.out.println(" Проходит диагностику " + getBrand());
    }


    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у легковой машины. " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у легковой машины. " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у легковой машины. " + getBrand());

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return " ЛЕГКОВОЙ АВТОМОБИЛЬ " +
                " тип кузова "
                + bodyType.getBodyType()
                + super.toString();
    }
}





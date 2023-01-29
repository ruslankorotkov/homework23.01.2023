import java.util.Objects;

public abstract class Driver {
    private String name;
    public boolean driverLicense;
    private String experience;

    public Driver(String name, boolean driverLicense, String experience) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
        this.driverLicense = driverLicense;
        if (experience == null || experience.isEmpty() || experience.isBlank()) {
            this.experience = "default";
        } else {
            this.experience = experience;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void refuel();

    public boolean isDriverLicense() throws CantDriveException {
        if (!driverLicense) {
            throw new CantDriveException(" Необходимо указать тип прав! .", this);
        }
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return " ВОДИТЕЛЬ:" +
                " ИМЯ: " + name +
                ", ПРАВА КАТЕГОРИИ: " + driverLicense +
                ", СТАЖ: " + experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && name.equals(driver.name) && experience.equals(driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, experience);
    }
}




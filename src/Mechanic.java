
import java.util.*;

public class Mechanic<A extends Transport> {
    private String nameMechanic;
    private String companyWork;
    private String accessToWork;
    private A transport;

    public Mechanic(String nameMechanic, String companyWork, String accessToWork) {
        this.nameMechanic = nameMechanic;
        this.companyWork = companyWork;
        this.accessToWork = accessToWork;
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getCompanyWork() {
        return companyWork;
    }

    public void setCompanyWork(String companyWork) {
        this.companyWork = companyWork;
    }

    public String getAccessToWork() {
        return accessToWork;
    }

    public void setAccessToWork(String accessToWork) {
        this.accessToWork = accessToWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return nameMechanic.equals(mechanic.nameMechanic) && companyWork.equals(mechanic.companyWork) && accessToWork.equals(mechanic.accessToWork) && transport.equals(mechanic.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameMechanic, companyWork, accessToWork, transport);
    }

    @Override
    public String toString() {
        return " Механик-" +
                " имя и фамилия: " + nameMechanic +
                ", компания, в которой он работает: " + companyWork +
                ", деятельность: " + accessToWork
                ;
    }
}

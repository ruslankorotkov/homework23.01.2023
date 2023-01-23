
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

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
    public String toString() {
        return " Механик-" +
                " имя и фамилия: " + nameMechanic +
                ", компания, в которой он работает: " + companyWork +
                ", деятельность: " + accessToWork
                ;
    }
}

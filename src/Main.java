import java.util.*;

public class Main {

    public static void main(String[] args) {
        DriverB ivan = new DriverB(" Иван ", true, " 6 лет ");
        DriverB yvan = new DriverB(" Иван ", true, " 6 лет ");
        DriverB vova = new DriverB(" Вова ", true, " 32 лет ");
        DriverB shuric = new DriverB(" Шурик ", true, " 4 лет ");
        DriverB nikita = new DriverB(" Никита ", true, " 6 лет ");
        DriverC zuric = new DriverC(" Зурик ", true, " 3 лет ");
        DriverC egor = new DriverC(" Егор ", true, " 3 лет ");
        DriverC oleg = new DriverC(" Олег ", true, " 51 лет ");
        DriverD nik = new DriverD(" Николай ", true, " 8 лет ");
        DriverD boris = new DriverD(" Борис ", false, " 7 лет ");
        DriverD ilia = new DriverD(" Илья ", true, " 11 лет ");
        DriverD artur = new DriverD(" Артур ", true, " 5 лет ");
        Mechanic foma = new Mechanic<Car>("Фома Кузькин", "Болты и Гайки", " ремонтирует легковые авто ");
        Mechanic luka = new Mechanic<Truck>("Лука Вижинков", "Тяп Ляп сервис", " ремонтирует грузовые авто ");
        Mechanic petr = new Mechanic<Bus>("Пётр Пучёк", "АвтоРемонт", " ремонтирует автобусы ");
        Mechanic misha = new Mechanic<Transport>("Миша Губайдулин", "Ездит как НАДО", " ремонтирует все виды автомобилей ");
        Set<Mechanic<?>> brigada1;
        brigada1 = new HashSet<>(3);
        brigada1.add(foma);
        brigada1.add(misha);
        Set<Mechanic<?>> brigada2;
        brigada2 = new HashSet<>(3);
        brigada2.add(luka);
        brigada2.add(misha);
        Set<Mechanic<?>> brigada3;
        brigada3 = new HashSet<>(3);
        brigada3.add(petr);
        brigada3.add(misha);
        Car lada = new Car("Lada", "Granta", 1.7, ivan, Car.BodyType.BODY_S, brigada1);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, vova, Car.BodyType.BODY_V, brigada1);
        Car bmv = new Car("BMW", "Z8", 3.0, yvan, Car.BodyType.BODY_K, brigada1);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, nikita, Car.BodyType.BODY_U, brigada1);
        Bus hyundai = new Bus("Hyundai", "Avante", 1.6, nik, 61, brigada3);
        Bus ural = new Bus("Урал", "Next", 20.22, boris, 24, brigada3);
        Bus paz = new Bus(" Паз", "Вектор Next", 20.20, artur, 23, brigada3);
        Bus mercedes = new Bus("Mercedes-Benz", "Tourismo", 20.21, ilia, 120, brigada3);
        Truck kamaz = new Truck("Камаз", "компас", 12.45, zuric, 2.5, brigada2);
        Truck zil = new Truck("Зил", "43", 24.12, egor, 23.5, brigada2);
        Truck man = new Truck("Man", "TGL", 12.45, oleg, 13.3, brigada2);

//        foma.carryOutMaintenance(bmv);
//        foma.carryOutMaintenance(lada);
//        misha.carryOutMaintenance(bmv);
//        luka.carryOutMaintenance(lada);
//        foma.fixTheCar();
//        System.out.println(" Бригада 1 " + brigada1.toString());
//        System.out.println(" Бригада 2 " + brigada2.toString());
//        System.out.println(" Бригада 3 " + brigada3.toString());
//        System.out.println(lada);
//        System.out.println(" водитель " + boris.getName() + " управляет автомобилем " + mercedes + " и будет участвовать в заезде. ");
//        System.out.println(" водитель " + oleg.getName() + " управляет автомобилем " + kamaz + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + ivan.getName() + " управляет автомобилем " + lada + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + vova.getName() + " управляет автомобилем " + audi + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + zuric.getName() + " управляет автомобилем " + bmv + " и будет участвовать в заезде. ");
//        System.out.println(" водитель" + nik.getName() + " управляет автомобилем " + kia + " и будет участвовать в заезде. ");
//        paz.printInfo();
//        paz.printType();
//        audi.printInfo();
//        audi.printType();
//        kamaz.printInfo();
//        kamaz.printType();
//        autoDiagnosed(audi, kamaz, paz, ural, kia);
//        rightsCheckDrivers(vova, oleg, oleg, nikita, boris, ilia);
//        getMechList(luka, foma, petr, misha);
//        getDriversList(ivan, shuric, egor, nikita, artur, ilia, boris, nik, oleg, vova, zuric);
//        getTransportsList(lada, audi, bmv, kia, hyundai, ural, paz, mercedes, kamaz, zil, man);
//        getMechList(luka, misha, petr, foma);
//        System.out.println(foma);
//        System.out.println(luka);
//        System.out.println(petr);
//        System.out.println(misha);


//        Map<Transport, Set<Mechanic<?>>> avtoBook = new LinkedHashMap<>();
//        avtoBook.put(lada, brigada1);
//        avtoBook.put(audi, brigada1);
//        avtoBook.put(bmv, brigada1);
//        avtoBook.put(kia, brigada1);
//        avtoBook.put(hyundai, brigada3);
//        avtoBook.put(ural, brigada3);
//        avtoBook.put(paz, brigada3);
//        avtoBook.put(mercedes, brigada3);
//        avtoBook.put(kamaz, brigada2);
//        avtoBook.put(zil, brigada2);
//        avtoBook.put(man, brigada2);
//        avtoBook.put(man, brigada3);
//        avtoBook.put(man, brigada2);
//        for (Map.Entry<Transport, Set<Mechanic<?>>> element : avtoBook.entrySet()) {
//            System.out.println(" Трансформированый список АВТО-->МЕХАНИК в map- КЛЮЧ:" + element.getKey() + "ЗНАЧЕНИЕ: " + element.getValue());
//        }
//        System.out.println(" Если в случае ошибки какой-либо из объектов будет занесен в базу два раза, то в консоль выведется информация без повторов, " +
//                "так как новое добавление по старому ключу перезатрет старое значение.");

        Set<Driver> driversSetList = new HashSet<>();
        driversSetList.add(shuric);
        driversSetList.add(egor);
        driversSetList.add(nikita);
        driversSetList.add(artur);
        driversSetList.add(ilia);
        driversSetList.add(ivan);
        driversSetList.add(yvan);
//        System.out.println(" множество водителей ");
//        driversSetList.iterator().hasNext();
//        System.out.println(driversSetList);
//        System.out.println(" множество водителей ");
//        System.out.println(Arrays.toString(driversSetList.toArray()));
        System.out.println(" Создал 2 разных объекта, но с одинаковыми значениями полей: " + ivan + " хешкод " +
                ivan.hashCode() + "" + yvan + "  хешкод " + yvan.hashCode());
        Iterator<Driver> iteratorDriver = driversSetList.iterator();
        while (iteratorDriver.hasNext()) {
            System.out.println(iteratorDriver.next());
        }
    }
//    public static void getMechList(Mechanic... mechanics) {
//        System.out.println(" Механики список ");
//        ArrayList<Mechanic> mechanicssList;
//        mechanicssList = new ArrayList<>();
//        for (Mechanic element : mechanics) {
//            mechanicssList.add(element);element.getKey() +
//        }
//        System.out.println("  mechanicssList: " + mechanicssList);
//    }
//
//    public static void getDriversList(Driver... drivers) {
//        System.out.println("Водители список ");
//        ArrayList<Driver> driversList;
//        driversList = new ArrayList<>();
//        for (Driver element : drivers) {
//            driversList.add(element);
//        }
//        System.out.println("  driversList: " + driversList);
//    }
////
////
//    public static void getTransportsList(Transport... transports) {
//        System.out.println(" Автомобили список ");
//        ArrayList<Transport> transportsList;
//        transportsList = new ArrayList<>();
//
//        for (Transport element : transports) {
//            transportsList.add(element);
//        }
//        System.out.println("  transportsList: " + transportsList);
//    }

//    public static void autoDiagnosed(Transport... auto) {
//        System.out.println(" Прохождение машинами диагностики ");
//        for (Transport element : auto) {
//            try {
//                element.diagnosed();
//            } catch (RuntimeException e) {
//                System.out.println(" Произошла ошибка ");
//                System.out.println(e.getMessage());
//            } finally {
//                System.out.println("Проверка завершена");
//            }
//        }
//    }
//
//    public static void rightsCheckDrivers(Driver... driver) {
//        int count = 0;
//        System.out.println(" Прохождение проверки прав ");
//        try {
//            for (Driver element : driver) {
//                element.isDriverLicense();
//                count++;
//            }
//        } catch (CantDriveException e) {
//            System.out.println(" Произошла ошибка водитель " + e.getDriver().getName() + "  не имеет прав.");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Проверка завершена. Из рассмотренных. " + count + " водителей имеют права.");
//        }
//    }


}
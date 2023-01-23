import java.util.ArrayDeque;
import java.util.Queue;

public class STO<A extends Transport> {
    private Queue<A> queue = new ArrayDeque<>(7);

    public void carryOutMaintenance(A transport) {
        queue.offer(transport);
        System.out.println(" Провести техобслуживание. " + transport.getBrand() + " Механик " + transport.getMechanics() +
                " Осматривает ");
    }

    public void fixTheCar() {
        A transport = queue.poll();
        if (transport != null) {
            System.out.println(" Починить машину. " + transport.getBrand() + " Механик " + transport.getMechanics() +
                    " Ремонтирует ");
            fixTheCar();
        } else {
            System.out.println(" Очередь пуста ");
        }
    }
}

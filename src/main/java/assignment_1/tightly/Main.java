package assignment_1.tightly;

class ControllerRoom {
    Machine1 m1;
    Machine2 m2;

    public ControllerRoom(Machine1 m1, Machine2 m2) {
        this.m1 = m1;
        this.m2 = m2;
    }
    public void manageMachine() {
        m1.start();
        m2.start();
    }
}
class Machine1 {
    public void start() {
        System.out.println("Machine 1 Running");
    }
}
class Machine2 {
    public void start() {
        System.out.println("Machine 2 Running");
    }
}
public class Main {

    public static void main(String[] args) {
        Machine1 m1 = new Machine1();
        Machine2 m2 = new Machine2();
        ControllerRoom cr = new ControllerRoom(m1, m2);
        cr.manageMachine();

    }
}

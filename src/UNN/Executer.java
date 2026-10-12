package UNN;

public class Executer {
    private ICpu cpu;
    public Executer(ICpu cpu) {
        this.cpu = cpu;
    }
    public void run(Comand [] program) {
        for(Comand comand : program) {
            cpu.exec(comand);
        }
    }

}

package UNN;

public class Main {
    public static void main(String[] args) {
        Comand[] program = {
                new Comand("init 10 20"),
                new Comand("init 11 25"),
                new Comand("ld a 10"),
                new Comand("ld b 11"),
                new Comand("add"),
                new Comand("print")
        };
        CPU cpu = new CPU();
        Executer executer = new Executer(cpu);
        executer.run(program);

    }
}

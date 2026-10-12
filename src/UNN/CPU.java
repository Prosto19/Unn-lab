package UNN;

public class  CPU implements ICpu {
    private int a;
    private int b;
    private int c;
    private int d;
    private int [] memory = new int[1024];
    public void init(int adres,int value) {
        memory[adres] = value;
    }
    public void ld(String rerister,int adres) {
        switch (rerister) {
            case "a":
                a = memory[adres];
                break;
            case "b":
                b = memory[adres];
                break;
            case "c":
                c = memory[adres];
                break;
            case "d":
                d = memory[adres];
                break;
            default:
                System.out.println("Регистра нету");
        }
    }
    public void st(String regisrer,int adres) {
        switch (regisrer) {
            case "a":
                memory[adres] =  a;
                break;
            case  "b":
                memory[adres] = b;
                break;
            case "c":
                memory[adres] = c;
                break;
            case "d":
                memory[adres] = d;
                break;
        }
    }
    public void mv(String destination, String source) { //dest - куда, sourse откуда
        int value = 0;
        switch (source) {
            case "a":
                value = a;
                break;
            case "b":
                value = b;
                break;
            case "c":
                value = c;
                break;
            case "d":
                value = d;
                break;
            default:
                System.out.println("Такого регистра нет");
        }
        switch (destination) {
            case "a":
                a = value;
                break;
            case "b":
                b = value;
                break;
            case "c":
                c = value;
                break;
            case "d":
                d = value;
                break;
            default:
                System.out.println("Ошибка регистра");
        }
    }
       public void add() {
        d = a + b;
       }
       public void sub() {
        d = a - b;
       }
       public  void mult() {
        d = a * b;
    }
       public void div() {
        d = a /b;
       }
       public void print() {
           System.out.println(a + " " + b + " " + c + " " + d);
       }
    public void exec(Comand command) {

        String text = command.get_text();

        String[] parts = text.split(" ");
        switch (parts[0]) {

            case "init":
                init(
                        Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2])
                );
                break;

            case "ld":
                ld(parts[1], Integer.parseInt(parts[2])
                );
                break;

            case "st":
                st(parts[1], Integer.parseInt(parts[2])
                );
                break;

            case "mv": mv(
                    parts[1],
                    parts[2]);
                break;

            case "add":
                add();
                break;

            case "sub":
                sub();
                break;

            case "mult":
                mult();
                break;

            case "div":
                div();
                break;

            case "print":
                print();
                break;

            default:
                System.out.println("Неизвестная команда");
        }
    }
}

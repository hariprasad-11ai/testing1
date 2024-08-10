public class Main {

    public void hari() {
        System.out.println("Hello hari");
    }

    public int jack() {
        return 30;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(20);
        Main obj = new Main();
        obj.hari();
        obj.jack();
        System.out.println(obj.jack());

    }

}
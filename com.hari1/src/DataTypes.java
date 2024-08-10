public class DataTypes {
    int i = 20;
    short s = 10;
    long l = 10000L;
    byte b = 30;
    char c = 'A';
    float f = 3.14f;
    boolean bool = true;

    public void hari() {
        System.out.println("integer value: " + i);
        System.out.println("short value: " + s);
        System.out.println("long value: " + l);
        System.out.println("byte value: " + b);
        System.out.println("char value: " + c);
        System.out.println("float value: " + f);
        System.out.println("boolean value: " + bool);
    }
    public static void main(String[] args) {
        DataTypes d = new DataTypes();
        d.hari();
    }





}
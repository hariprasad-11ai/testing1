public class Variable {
    int num = 20;
    static int jk = 90;

    void meth1() {
        int c = 80;

        System.out.println("instance variable: " + num);
        System.out.println("instance variable: " + new Variable().num);
        System.out.println(" static variable: " + jk);
        System.out.println(" static variable: " + new Variable().jk);
        System.out.println(" static variable: " + Variable.jk);
        System.out.println(" local variable: " + c);
    }

        void meth2(){
            int num = 60;
            int jk = 50;

            System.out.println("instance variable: "+num);
            System.out.println("Static variable: "+jk);
          //  System.out.println("local variable: "+c);
        }

    public static void main(String[] args) {
        Variable v = new Variable();
        v.meth1();
        v.meth2();
    }

}

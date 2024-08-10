public class Saaho {
    int v= 40;//instance
    static int k = 50;// static

    public void kalki(){
        int c = 30;// local

        System.out.println("instance:"+v);
        System.out.println("k:"+new Saaho().v);
        System.out.println("k:"+k);
        System.out.println("c:"+new Saaho().k);
        System.out.println("c:"+Saaho.k);
        System.out.println("c:"+c);
    }
    void meth2(){
        int v = 2;
        //System.out.println("v:"+c);
        System.out.println("instance:"+v);

    }

    public static void main(String[] args) {
        Saaho s = new Saaho();
        s.kalki();
        s.meth2();
    }
}

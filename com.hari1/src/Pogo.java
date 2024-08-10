public class Pogo {
  String name;

  Pogo() {
      System.out.println("Pogo");
  }
  Pogo(String name){
      System.out.println(name);
      this.name = name;

  }
   public void jep(){
      System.out.println("Jep");
   }
  public static void main(String[] args) {
      Pogo p = new Pogo("hari");
      Pogo p2 = new Pogo();
      p.jep();
  }
}

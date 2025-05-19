class a{
      int age;
      public void kimo(){
            System.out.println("not available");
      }
      static class b{     // we cam use class b instead
      public void config(){
            System.out.println("in configuartion");
      }
}
}
public class good{
      public static void main(String args[]){
            a obj = new a();
            obj.kimo();
            a.b obj1 = new a.b();   //also we can use a.b obj1 = obj.new b();
            obj1.config();
      }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {


      ChainingHashMap<Integer,String> map=new ChainingHashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(4,"four");
        map.put(7,"seven");
        map.put(9,"nine");
        map.put(10,"ten");
          map.display();

        map.delete(1);
        map.delete(4);
          map.display();
        map.delete2(7);

          map.display();
      System.out.println(map.toString());

    }


}

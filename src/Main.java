import java.util.Random;

public class Main {
    public static void main(String[] args) {
//40
//      41
//      42
//      43
 //       ChainingHashMap<Integer ,String> map = new ChainingHashMap<>();
//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(12,"12");
//        map.put(15,"15");

//        System.out.println(map.get(2));
//        System.out.println(map);

//        Random random = new Random();
//        for (int i = 0; i < 50; i++) {
//            map.put(random.nextInt(1000),"");
//        }
//        System.out.println(map);


      ChainingHashMap<Integer,String> map=new ChainingHashMap<>();
//        LinearProbingHashMap<Integer, String> map = new LinearProbingHashMap<>();

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

import java.util.*;

@Deprecated
public class Test {


    public static void main(String[] args) {


    long start = System.currentTimeMillis();

        final Set<Double> arrayList = new HashSet<Double>();


        for (int i = 0; i < 1000000; i++) {
                        double j = 393994545342.444;
                        arrayList.add(i * j);
        }
LinkedList l = new LinkedList();
        l.getFirst();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(44307233*Math.random());
        }

        System.out.print(System.currentTimeMillis()-start);
    }
//

}

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(56);
        l.add(230);
        l.add(5);
        l.add(23);
        l.add(6);
        l.add(20);
       List<Integer> i =l.stream().sorted().collect(Collectors.toList());
        System.out.println(i);

        List<Integer> i2 =l.stream().sorted().map(x->x+2).collect(Collectors.toList());

        List<Integer> i3  =   i2.stream().sorted().map(x->x+56).collect(Collectors.toList());

        System.out.println(5);
    }
}

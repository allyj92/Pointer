import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int num1 = 11;
//        int num2 = num1;
//
//        num1 = 22;
//
//        System.out.println("num1: " + num1);
//        System.out.println("num2: " + num2);
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value",12);
        map2 = map1;

        map1.put("value",22);

        System.out.println(map1);
        System.out.println(map2);


    }
}
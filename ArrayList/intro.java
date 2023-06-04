package ArrayList;

import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list; // declare
        list = new ArrayList<>(); // define
        System.out.println(list.size() + " => " + list);

        list.add(10); // add the value at end
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size() + " => " + list);

        list.set(1, 200); // set => replace the value at particular index
        System.out.println(list.size() + " => " + list);

        list.add(1, 2000); // add the value at particular index
        System.out.println(list.size() + " => " + list);

        int val = list.get(1); // return the value at particular index
        System.out.println("value get => " + val);

        int rmv_value = list.remove(1); // delete the value at particular index
        System.out.println("Removed value=> " + rmv_value);
        System.out.println(list.size() + " => " + list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("**************************************");
        for(int e :list){
            System.out.println(e);
        }

    }
}

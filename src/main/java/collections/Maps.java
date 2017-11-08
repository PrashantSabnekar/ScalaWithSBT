package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String args[]) {

        Map <String, Integer> integerMap = new HashMap<>();
        integerMap.put("One", 1);
        integerMap.put("Two", 2);
        integerMap.put("Three", 3);
        integerMap.put("Four", 4);
        integerMap.put("Five", 5);
        integerMap.put("Six", 6);

    }

   class Bean {
        public String type;
        public int version;
   }
}

package streams;

import java.util.stream.Stream;

public class Demo {

    public void streams() {

        int count = Stream.of(1,2,3,4,5,6,7,8,9,10).reduce(0, (acc, element) -> acc + element);

        System.out.println(count);

    }

    public static void main(String args[]) {
        Demo demo = new Demo();
        demo.streams();
    }
}

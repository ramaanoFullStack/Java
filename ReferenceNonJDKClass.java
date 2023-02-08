import org.apache.commons.lang3.RandomUtils;

public class ReferenceNonJDKClass {
    public static void main(String[] args) {
        System.out.println(RandomUtils.nextInt());
    }
}

// java -cp /path/to/commons-lang3-3.12.0.jar ReferenceNonJDKClass.java

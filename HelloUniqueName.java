import java.util.LinkedHashSet;
import java.util.Set;

public class HelloUniqueNames {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            Set<String> uniqueNames = new LinkedHashSet<>();

            for (String name : args) {
                uniqueNames.add(name);
            }

            StringBuilder builder = new StringBuilder();
            for (String name : uniqueNames) {
                builder.append(name).append(", ");
            }

            String result = builder.substring(0, builder.length() - 2);
            System.out.println("Hello, " + result + "!");
        }
    }
}
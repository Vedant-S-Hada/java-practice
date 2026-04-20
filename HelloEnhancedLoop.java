public class HelloEnhancedLoop {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder builder = new StringBuilder();

            for (String name : args) {
                builder.append(name).append(", ");
            }

            String result = builder.substring(0, builder.length() - 2);
            System.out.println("Hello, " + result + "!");
        }
    }
}
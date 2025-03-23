public class NullPointer {
    public static void main(String[] args) {
        String str = "Arasi";

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



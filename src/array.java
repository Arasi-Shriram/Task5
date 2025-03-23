public class array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        try {
            System.out.println(arr[6]);
        } catch (Exception e) {
            System.out.println("Result :Index out of bounds");
        }
    }
}


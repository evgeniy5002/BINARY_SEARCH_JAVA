public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i <= 10; i++) {
            System.out.println(BinarySearch.binarySearch(array, i));
        }
    }
}

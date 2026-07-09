public class FindZero {

    public static int findZero(int[] a1, int[] a2) {
        int low = 0;
        int high = a1.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a2[mid] == 0)
                return mid;

            if (mid < a1.length && a2[mid] == a1[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 6, 7, 8, 9, 20};
        int[] a2 = {1, 3, 0, 4, 6, 7, 8, 9, 20};

        System.out.println("Index of 0 = " + findZero(a1, a2));
    }
}
public class MergeArrays {

    public static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int i = 0; // index ของ left
        int j = 0; // index ของ right
        int k = 0; // index ของ result

        // เปรียบเทียบข้อมูลจากทั้งสองอาร์เรย์
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        // คัดลอกข้อมูลที่เหลือจาก left
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }

        // คัดลอกข้อมูลที่เหลือจาก right
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] left = {3, 9, 15};
        int[] right = {7, 11, 17, 23};

        int[] result = merge(left, right);

        System.out.print("Merged Array: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
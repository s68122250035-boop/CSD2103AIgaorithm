public class ArrayCaseStudy {

    public static void main(String[] args) {

        int[] scores = {6, 8, 4, 9, 7, 5, 10, 3, 8, 2};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int count7 = 0;

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];

            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }

            if (scores[i] >= 7) {
                count7++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("===== ผลการวิเคราะห์คะแนน =====");
        System.out.println("คะแนนรวม = " + sum);
        System.out.println("คะแนนเฉลี่ย = " + average);
        System.out.println("คะแนนสูงสุด = " + max);
        System.out.println("คะแนนต่ำสุด = " + min);
        System.out.println("จำนวนนักศึกษาที่ได้คะแนนตั้งแต่ 7 คะแนนขึ้นไป = " + count7);

        System.out.println("\nนักศึกษาที่ควรทบทวนเพิ่มเติม");

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 5) {
                System.out.println("นักศึกษาคนที่ " + (i + 1) + " ได้ " + scores[i] + " คะแนน");
            }
        }
    }
}

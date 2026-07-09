import java.util.LinkedList;
import java.util.Queue;

public class QueueCaseStudy {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // เพิ่มผู้ป่วย P001-P005
        queue.add("P001");
        queue.add("P002");
        queue.add("P003");
        queue.add("P004");
        queue.add("P005");

        System.out.println("คิวเริ่มต้น");
        System.out.println(queue);

        // เรียกผู้ป่วยออก 2 คน
        if (!queue.isEmpty()) {
            System.out.println("\nรับบริการ : " + queue.remove());
        }

        if (!queue.isEmpty()) {
            System.out.println("รับบริการ : " + queue.remove());
        }

        // เพิ่มผู้ป่วยใหม่
        queue.add("P006");
        queue.add("P007");

        // ผู้ป่วยคนถัดไป
        System.out.println("\nผู้ป่วยคนถัดไป : " + queue.peek());

        // จำนวนผู้ป่วย
        System.out.println("จำนวนผู้ป่วยที่รอ : " + queue.size());

        // สถานะ Queue
        System.out.println("\nQueue ปัจจุบัน");
        System.out.println(queue);

        // ตรวจสอบก่อน remove
        if (!queue.isEmpty()) {
            System.out.println("\nQueue ไม่ว่าง สามารถ remove ได้");
        } else {
            System.out.println("\nQueue ว่าง");
        }

        System.out.println("\nอธิบาย:");
        System.out.println("Queue ใช้หลักการ FIFO (First In First Out)");
        System.out.println("ผู้ที่เข้าคิวก่อน จะได้รับบริการก่อน");
    }
}

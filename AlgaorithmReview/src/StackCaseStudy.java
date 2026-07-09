import java.util.Stack;

public class StackCaseStudy {

    public static void main(String[] args) {

        Stack<String> undoStack = new Stack<>();

        // เพิ่มคำสั่งทั้งหมด
        undoStack.push("Type Data");
        undoStack.push("Type Structure");
        undoStack.push("Delete Structure");
        undoStack.push("Type Algorithm");
        undoStack.push("Type Java");

        System.out.println("=== คำสั่งทั้งหมดใน Stack ===");
        System.out.println(undoStack);

        // Undo 2 ครั้ง
        System.out.println("\nUndo ครั้งที่ 1 : " + undoStack.pop());
        System.out.println("Undo ครั้งที่ 2 : " + undoStack.pop());

        // สถานะหลัง Undo
        System.out.println("\nStack หลัง Undo");
        System.out.println(undoStack);

        // ตรวจสอบก่อน pop
        if (!undoStack.isEmpty()) {
            System.out.println("\nTop ของ Stack = " + undoStack.peek());
        }

        System.out.println("\nอธิบาย:");
        System.out.println("Stack ใช้หลักการ LIFO (Last In First Out)");
        System.out.println("ข้อมูลที่เข้าล่าสุด จะถูกนำออกก่อน");
    }
}

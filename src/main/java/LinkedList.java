import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Generic version of the LinkedList class.
 * @param <U> the type of the value being boxed
 */
class LinkedList<U> {
    private Node<U> head = null;
    private Node<U> tail = null;
    private int size;

    LinkedList() {
        this.head = new Node<U>(null,null);
        this.tail = this.head;
        size = 0;
    }

    public void add(U node) {
        tail.next = new Node<U>(node,null);
        this.tail = tail.next;
        size++;
    }

    public void remove(String removeId) {
        for (Node<U> i = head.next; i != null; i = i.next) {
            // Score의 getter를 사용하기 위해 제너릭타입 매개변수와 Score를 instanceof해서 명시
            // i.data의 타입은 Score
            if (i.data instanceof Score) {
                String studentIds = ((Score) i.data).getStudentId();
                if(removeId.equals(studentIds)) {
                    i.data = i.next.data;
                    i.next = i.next.next;
                    break;
                }
            }
        }
        System.out.println("삭제가 완료되었습니다.");
    }

    public int getSize() {
        return size;
    }

    public void print() {
        System.out.println("==================");
        for (Node<U> i = head.next; i != null; i = i.next) {
            if (i.data instanceof Score) {
                String id = ((Score) i.data).getStudentId();
                int score = ((Score) i.data).getScore();
                System.out.println(id + ", " + score);
            }
        }
        System.out.println("==================");
    }

    public void save(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(
                new FileWriter(fileName));
        for (Node<U> n = head.next; n != null; n = n.next) {
            DataUtil.populate(n.data, out);
        }
        out.close();
        System.out.println("저장이 완료되었습니다.");
    }
}
import javax.xml.crypto.Data;
import java.io.*;

class Node<T> {
    T data = null;
    Node<T> next = null;
    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
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

    public int getSize() {
        return size;
    }
}

class Score {
    private String studentId;

    private int score;

    Score(String studentId, int score) {
        this.studentId = studentId;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
public class GameMenu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));

        String input = null;

        LinkedList<Score> ls = new LinkedList<>();

        String fileName = "score.dat";

        while (true) {
            System.out.println("------------------");
            System.out.println("[ M E N U ]");
            System.out.println("1. 자료생성");
            System.out.println("2. 저장하기");
            System.out.println("3. 자료삭제");
            System.out.println("4. 점수보기");
            System.out.println("5. 종료하기");

            input = br.readLine();
            System.out.println();

            if (input.equals("1")) { // 자료생성
                System.out.println("학번,점수로 데이터를 입력하세요. : ");
                String newData = br.readLine();
                String[] data = newData.split(",");

                ls.add(new Score(data[0],Integer.parseInt(data[1])));
                System.out.println("계정이 생성되었습니다.");

            } else if (input.equals("2")) { // 저장하기

            } else if (input.equals("3")) { // 계정삭제

            } else if (input.equals("4")) { // 점수보기

            } else if (input.equals("5")) { // 게임 종료
                System.out.println("게임이 종료됩니다.");
                break;
            }
        }
        br.close();
    }
}
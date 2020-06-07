import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class DataUtil {
    public static void loading(String fileName, LinkedList<Score> ls) {
        System.out.println("로딩중입니다...");

        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(fileName));
            String line = null;
            while ((line = in.readLine()) != null) {
                String[] beforeData = line.split(", ");
                ls.add(new Score(beforeData[0], Integer.parseInt(beforeData[1])));
            }
            in.close();
        } catch (IOException e) {

        }
        System.out.println("로딩이 완료 되었습니다.");
    }

    public static void populate(Object obj, BufferedWriter out) throws IOException {
        if (obj instanceof Score) {
            Score sc = (Score) obj;
            out.write(sc.getStudentId());
            out.write(", ");
            out.write(sc.getScore() + ""); // String으로 변환
            out.write('\n');
        }
    }
}

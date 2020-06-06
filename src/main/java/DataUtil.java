import java.io.BufferedWriter;
import java.io.IOException;

public class DataUtil {
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

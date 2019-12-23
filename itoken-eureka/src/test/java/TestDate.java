import org.junit.Test;

import java.time.LocalDate;

/**
 * @author WangLe
 * @date 2019/12/17 10:28
 * @description
 */
public class TestDate {
    @Test
    public void test() {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        System.out.println(year);

        String ss = "每年6.1-次年5.31";
        ss = ss.replace("每年", 2019 + ".");
        ss = ss.replace("次年", (2019 + 1) + ".");

        System.out.println(ss);

    }

    @Test
    public void test2() {
        String s = "2019.4.1-2019.5.1   ";
//        boolean matches = s.trim().matches("^\\d{4}\\.\\d{1,2}\\.\\d{1,2}-\\d{4}\\.\\d{1,2}\\.\\d{1,2}$");
//        String s = "每年4.1-次年5.1   ";
        boolean matches = s.trim().matches("^每年\\d{1,2}\\.\\d{1,2}-次年\\d{1,2}\\.\\d{1,2}$")
                || s.trim().matches("^\\d{4}\\.\\d{1,2}\\.\\d{1,2}-\\d{4}\\.\\d{1,2}\\.\\d{1,2}$");
        System.out.println(matches);

    }
}

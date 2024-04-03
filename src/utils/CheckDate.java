package utils;

import java.util.regex.Pattern;

public class CheckDate {
    static int MAX_VALID_YR = 9999;
    static int MIN_VALID_YR = 1800;

    static boolean isLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    static boolean isValidDate(int d, int m, int y) {
        if (y > MAX_VALID_YR || y < MIN_VALID_YR)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;

        if (m == 2) {
            if (isLeap(y))
                return (d <= 29);
            else
                return (d <= 28);
        }

        if (m == 4 || m == 6 ||
                m == 9 || m == 11)
            return (d <= 30);

        return true;
    }

    // Link :
    // https://stackoverflow.com/questions/15491894/regex-to-validate-date-formats-dd-mm-yyyy-dd-mm-yyyy-dd-mm-yyyy-dd-mmm-yyyy
    public static boolean checkDate(String date) {
        String pattern = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        return Pattern.matches(pattern, date);
    }
}

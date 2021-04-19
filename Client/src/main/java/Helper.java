import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Helper
{

    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void ValidateDate(String dateString)
    {

        Pattern pattern = Pattern.compile("^(0*[1-9]|[1-2][0-9]|3[0-1])\\/(0*[1-9]|11|12)\\/([0-9]{4})", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(dateString);

        if (!matcher.find())
            throw new IllegalArgumentException("Invalid date provided.");

        int iDay = Integer.parseInt(matcher.group(1));
        int iMonth = Integer.parseInt(matcher.group(1));
        int iYear = Integer.parseInt(matcher.group(1));

        if (iMonth == 2)
        {
            /*
                Luna februarie.
            */

            if (iDay > 29)
                throw new IllegalArgumentException("Invalid date provided - February can't have more than 29 days.");

            /*
                Verificare an bisect (29 zile).
            */

            if (iDay == 29 && !isLeapYear(iYear))
                throw new IllegalArgumentException("Invalid date provided - February can't 29 days in year " + iYear + ".");
        }

        if (iMonth != 2 && iMonth % 2 == 0 && iMonth != 8)
        {
            /*
                Luna para (doar lunile impare si luna august au 31 zile).
            */

            if (iDay == 31)
                throw new IllegalArgumentException("Invalid date provided - this month can't have 31 days.");
        }

    }
}

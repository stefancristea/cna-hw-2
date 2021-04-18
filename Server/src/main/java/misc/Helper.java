package misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper
{
    public static String GetSeasonFromDate(String date)
    {
        String[] dateParts = date.split("/");
        int dateMonth = Integer.parseInt(dateParts[1]);

        switch(dateMonth)
        {
            case 12:
            case 1:
            case 2:
                return "Winter";

            case 3:
            case 4:
            case 5:
                return "Spring";

            case 6:
            case 7:
            case 8:
                return "Summer";

            default:
                return "Autumn";
        }

    }

    public static ArrayList<Sign> ReadFile(String fileName) throws java.io.FileNotFoundException
    {
        Scanner reader = new Scanner(new File(fileName));

        ArrayList<Sign> signsList = new ArrayList<>();

        while(reader.hasNext())
        {
            String signName = reader.next();

            int signStartMonth = reader.nextInt();
            int signStartDay = reader.nextInt();

            int signEndMonth = reader.nextInt();
            int signEndDay = reader.nextInt();

            signsList.add(new Sign(signName, signStartDay, signStartMonth, signEndDay, signEndMonth));
        }

        return signsList;
    }
}

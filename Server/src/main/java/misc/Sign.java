package misc;

public class Sign
{
    private String m_name;

    private int m_startDay;
    private int m_startMonth;
    private int m_endDay;
    private int m_endMonth;

    Sign(String name, int startDay, int startMonth, int endDay, int endMonth)
    {
        m_name = name;
        m_startDay = startDay;
        m_startMonth = startMonth;
        m_endDay = endDay;
        m_endMonth = endMonth;
    }

    @Override
    public String toString()
    {
        return m_name;
    }

    public boolean containsDate(String date)
    {
        String[] dateParts = date.split("/");

        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);

        return month == m_startMonth && day >= m_startDay || month == m_endMonth && day <= m_endDay;
    }
}

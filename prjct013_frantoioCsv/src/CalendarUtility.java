import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtility {
  public static DateFormat dfDayHour = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  public static DateFormat dfDay = new SimpleDateFormat("dd/MM/yyyy");

  public static String dateToString(Date inDate, DateFormat df){
    String strDate = df.format(inDate);
    return strDate;
  }


  public static String calendarToString(Calendar inCalendar, DateFormat df){
      Date inDate = inCalendar.getTime();
      String strDate = df.format(inDate);
      return strDate;
  }

  public static Calendar stringToCalendar(String inStr, DateFormat df){
      Date date = null;
      try {
          date = df.parse(inStr);
      } catch (ParseException e) {
          e.printStackTrace();
      }

      Calendar calendar = Calendar.getInstance();
      calendar.setTime(date);

      return calendar;
  }

}

import java.io.IOException;
import java.time.format.TextStyle;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

class datum {
  public static void main (String [] args) throws IOException {
	 Scanner file = new Scanner(System.in);
	 int day = file.nextInt();
	 int month = file.nextInt();
	 GregorianCalendar date = new GregorianCalendar(2009, month - 1, day);
	 TimeZone zone = TimeZone.getTimeZone("UTC");
	 date.setTimeZone(zone);
	 System.out.println(date.toZonedDateTime().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US));
  }
}

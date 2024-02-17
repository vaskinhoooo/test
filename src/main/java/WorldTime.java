import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class WorldTime {

    public String getTimeByCountry(String country){
       DateTimeZone timeZone = DateTimeZone.forID(country);
       DateTime time = new DateTime(timeZone);
       String formattedTime = time.toString("HH:mm");
       return formattedTime;

    }
}

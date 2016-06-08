import java.util.Calendar;
import java.util.Date;
 
public class DateUtil
{
    public static void main(String[] args)
    {
 
        
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1995, 04, 3, 5, 0, 0);
        Date date1 = cal1.getTime();
 
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2011, 07, 4, 6, 1, 1);
        Date date2 = cal2.getTime();
 
 
    
        long milliSec1 = date1.getTime();
        long milliSec2 = date2.getTime();
 
        long timeDifInMilliSec;
        if(milliSec1 >= milliSec2)
        {
            timeDifInMilliSec = milliSec1 - milliSec2;
        }
        else
        {
            timeDifInMilliSec = milliSec2 - milliSec1;
        }
 
        long timeDifSeconds = timeDifInMilliSec / 1000;
        long timeDifMinutes = timeDifInMilliSec / (60 * 1000);
        long timeDifHours = timeDifInMilliSec / (60 * 60 * 1000);
        long timeDifDays = timeDifInMilliSec / (24 * 60 * 60 * 1000);
 
        System.out.println("Time differences expressed in various units are given below");
        System.out.println(timeDifInMilliSec + " Milliseconds");
        System.out.println(timeDifSeconds + " Seconds");
        System.out.println(timeDifMinutes + " Minutes");
        System.out.println(timeDifHours + " Hours");
        System.out.println(timeDifDays + " Days");
    }
}`

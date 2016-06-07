public class Test 
{

    public static void main(String[] args) 
    {
        Calendar cal = new GregorianCalendar();
      
        System.out.println(cal.getTime());

        
        int workingDaysToAdd = 5;
        for (int i=0; i<workingDaysToAdd; i++)
            do {
                cal.add(Calendar.DAY_OF_MONTH, 1);
            } while ( ! isWorkingDay(cal));
        System.out.println(cal.getTime());
    }

    private static boolean isWorkingDay(Calendar cal)
    {
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY)
            return false;
        
      
        return true;
    }

}

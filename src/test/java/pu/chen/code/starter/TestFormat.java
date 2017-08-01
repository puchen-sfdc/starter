package pu.chen.code.starter;

import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;


public class TestFormat {
	@Test 
	public void testFormat() throws ParseException {
        TimeZone tz = TimeZone.getTimeZone("GMT+0");
        List<Locale> locales = new ArrayList<Locale>();
        //locales.add(new Locale("ms", "MY"));
        //locales.add(new Locale("zh", "CN"));
        locales.add(new Locale("af", "ZA"));

        Calendar datetime = Calendar.getInstance(tz);
        datetime.set(2006, 2, 1, 13, 0, 0);
        datetime.clear(Calendar.MILLISECOND);

        for (Locale locale : locales) {

            DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, locale);
            
            String formatteTime = df.format(datetime.getTime());
            
            //SimpleDateFormatICU aa = 
            //SimpleDateFormatICU
            
            Date actualDate =  df.parse(formatteTime);
            
            long aa = actualDate.getTime();
            long bb = datetime.getTime().getTime();
            
            System.out.println(aa+bb);
            
            assertTrue("Wrong Time Display: Locale " + locale, actualDate.equals(datetime.getTime()));
        }
        System.out.println("aa");
	}
}

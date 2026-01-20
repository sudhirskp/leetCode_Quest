package String;

import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collector;

public class DateFormat {
    HashMap<String , String> map = new HashMap<>();
    public String format1(String date){

        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");

        String [] d = date.split(" ");
        int year = Integer.parseInt(d[d.length-1]);
        int month = 0;
        if(map.containsKey(d[d.length-2])){
            month = Integer.parseInt(map.get(d[d.length-2]));
            //System.out.println(month);
        }
        String [] forday = d[0].split("");
        int day = Integer.parseInt(forday[0]+(Character.isDigit(forday[1].charAt(0)) ? forday[1] : ""));

        return year+"-"+(month>9 ? month : "0"+month)+"-"+(day>9 ? day : "0"+day);
    }

        public String format(String date) {

            map.put("Jan","01");
            map.put("Feb","02");
            map.put("Mar","03");
            map.put("Apr","04");
            map.put("May","05");
            map.put("Jun","06");
            map.put("Jul","07");
            map.put("Aug","08");
            map.put("Sep","09");
            map.put("Oct","10");
            map.put("Nov","11");
            map.put("Dec","12");

            String[] parts = date.split(" ");   // ["6t", "Mar", "2022"]

            int year = Integer.parseInt(parts[2]);
            String month = map.get(parts[1]);

            // Extract digits only from the day part
            String dayStr = parts[0].replaceAll("\\D+", "");
            int day = Integer.parseInt(dayStr);

            return String.format("%04d-%s-%02d", year, month, day);
        }

    public static void main(String[] args) {
        DateFormat ob = new DateFormat();
        System.out.println(ob.format("6t Mar 2022"));

    }
}

package no.uib.info233.v2017.yih002.oblig2;

import java.util.Arrays;

public class LectureTime {
	
	private String day;
	private String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	private Integer hour, minute;

	private LectureTime (String day, Integer hour, Integer minute) {
	    this.day = day;
	    this.hour = hour;
	    this.minute = minute;
	    if (Arrays.asList(days).contains(day)) {
	        System.out.println("No can do!");
        } if (hour > 23 || hour < 0) {
            System.out.println("No can do!");
        } if (minute > 59 || minute < 0) {
            System.out.println("No can do!");
        }
    }

	
	public String getDay() {
		return this.day;
	}
	
	public Integer getHour() {
		return hour;
	}
	
	public Integer getMinute() {
		return minute;
	}

}

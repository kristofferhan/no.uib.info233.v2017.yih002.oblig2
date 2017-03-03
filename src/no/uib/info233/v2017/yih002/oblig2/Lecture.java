package no.uib.info233.v2017.yih002.oblig2;

public class Lecture {
	
	private int startTime, endTime;
	private String lectureName;

	public Lecture(int startTime, int endTime, String lectureName) {
	    this.lectureName = lectureName;
	    this.startTime = startTime;
	    this.endTime = endTime;

    }

	public Integer getStartTime() {
		return startTime;
		
	}
	
	public Integer getEndTime() {
		return endTime;
	}
	
	public String getLectureName() {
		return lectureName;
	}

}

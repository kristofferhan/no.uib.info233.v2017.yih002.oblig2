package no.uib.info233.v2017.yih002.oblig2;

import java.util.ArrayDeque;

/**
 * Selects classes one by one
 * Starts with the class that ends as first
 * Adds the class that ends earliest, such that is does not overlap with any of the classes already selected.
 * Repeats this process until there are no more classes to add.
 * @author Kristoffer Hansen
 * @version 0.1
 */

@SuppressWarnings("unused")
public class Advisor {

    private Bag<Lecture> lectures;
	private ArrayDeque<Lecture> schedule;

    public static void sortSchedule(ArrayDeque<Lecture> schedule) {

        ArrayDeque<Integer> lectureHelper1 = new ArrayDeque<>();
        ArrayDeque<Integer> lectureHelper2 = new ArrayDeque<>();

        while (!schedule.isEmpty()) {
            Lecture lecture = schedule.pop();
            Integer helperItem1 = -1;

            if (!lectureHelper1.isEmpty()) {
                helperItem1 = lectureHelper1.peek();
            }

            if (!(lecture.getStartTime() > helperItem1)) {
                while (!lectureHelper1.isEmpty() && lecture.getStartTime() > helperItem1 ) {
                    lectureHelper2.push(lectureHelper1.pop());
                    helperItem1 = lectureHelper1.peek();
                }

                lectureHelper1.push(lecture.getStartTime());

                while (!lectureHelper2.isEmpty()) {
                    lectureHelper1.push(lectureHelper2.pop());
                }
            } else {
                lectureHelper1.push(lecture.getStartTime());
            }

        }

        schedule.clear();
    }

    public void quickSort(Bag<Lecture> lectures) {


    }

	/**
	 * Takes as input a bag of lectures. Outputs a schedule containing classes 
	 * of the suggested schedule stored as a queue, sorted by time.
	 * @param lectures
	 */
	public Bag<Lecture> makeSchedule(Bag<Lecture>lectures) {
	    schedule = new ArrayDeque<>();
	    schedule.add(new Lecture(1015, 1200, "INFO233"));
	    schedule.add(new Lecture(1215, 1400, "PSYK120"));
	    schedule.add(new Lecture(1415, 1600, "Infomøte"));



	    return getAllLectures();

	}

	private Bag<Lecture> getAllLectures() {
	    return lectures;
    }

}

package odevBir;

public class Courses {
	public Courses(int id,String courseName,String trainersName ,double percentageOfCompletion ) {
		
		this.courseName=courseName;
		this.id=id;
		this.percentageOfCompletion=percentageOfCompletion;
		this.trainersName=trainersName;
		
	}
	double percentageOfCompletion;
	String courseName;
	int id;
	String trainersName;

}

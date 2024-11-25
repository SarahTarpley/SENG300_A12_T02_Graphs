import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Course {
	String name;
	String subjCode;
	String courseCode;
	String type;
	int credits;
	int number;
	public static Graph courseRelations = new Graph();
	
	public Course(String name, String subjCode, int number, int credits) {
		this.name = name;
		this.subjCode = subjCode;
		this.number = number;
		this.courseCode = subjCode + String.valueOf(number);
		this.credits = credits;
		addCourse(this);
	}

	public static void addCourse(Course c) {
		courseRelations.addVertex(c.courseCode, c);
	}
	
	public int compareTo(Course c) {
		return courseCode.compareTo(c.courseCode);
	}
	
	// Way to add a prerequisite condition in which only one item from the container is needed
	public static void addPrerequisite(String[] preqs, Course C) {
		String choiceArr = Arrays.stream(preqs)
						  .collect(Collectors.joining("|"));
		courseRelations.addVertex(choiceArr);
		courseRelations.addDirectedEdge(courseRelations.getVertex(choiceArr), courseRelations.getVertex(C.courseCode));
	}
	
	public static void addPrerequisite(Course pre, Course C) {
		courseRelations.addDirectedEdge(courseRelations.getVertex(pre.courseCode), courseRelations.getVertex(C.courseCode));
	}
	
	public Collection<String> getPrereqs(String courseCode) {
		Collection<String> preReqs = courseRelations.getEdgesTo(courseRelations.getVertex(courseCode)).stream().map(x -> x.fromVertex.label.replace("|", " -OR- ")).toList() ;
		return preReqs;
	}
	
	public static void displayGraph(){
		for(Vertex v : courseRelations.getVertices().stream().sorted().toList() ) {
			Course c = getCourse(v.label);
			if(c != null)
				System.out.println(c.typeCourse());
		}
	}
	
	private static Course getCourse(String label) {
		return (Course) courseRelations.getVertex(label).obj;
	}

	public String typeCourse() {
		return String.format(
				"Course: %s\r\n\tCourse Code: %s\r\n\tNumber: %s\r\n\tCredits: %s\r\n\tPrerequisite(s): %s\r\n\r\n",
				this.name,
				this.courseCode,
				this.number,
				this.credits,
				getPrereqs(this.courseCode)
				);
	}
	
}

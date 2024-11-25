
public class Driver{
	public static void main(String[] args) {
		// Demonstrating use of the Course class in a graph
		// First year courses info obtained from https://www.ferris.edu/business/digital-media-software-engineering/homepage.htm
		
		Course seng101 = new Course("Computer Programming 1", "SENG", 101, 3);
		Course seng160 = new Course("SENG Methodologies - Processes", "SENG", 160, 3);
		Course engl150 = new Course("English 1", "ENGL", 150, 3);
		Course S11_450 = new Course("SAT Evidence-Based Reading and Writing", "TEST-SAT", 450, 0);
		Course S05_370 = new Course("Pre-2016 SAT", "TEST-SAT", 370, 0);
		Course A01_14 = new Course("ACT", "TEST-ACT", 150, 0);
		
		// When the prerequisite is one of a list of many
		String[] choicePreq = {"ENGL74", "S11-450", "S05-370", "A01-14"};
		Course.addPrerequisite(choicePreq, engl150);
		
		Course fsus100 = new Course("Ferris State Univ Seminar", "FSUS", 100, 1);
		Course seng102 = new Course("Computer  Programming 2", "SENG", 102, 3);
		Course.addPrerequisite(seng101, seng102);
		
		Course seng170 = new Course("Software Requirements Mgmt", "SENG", 170, 3);
		Course engl250 = new Course("English 2", "ENGL", 250, 3);
		Course.addPrerequisite(engl150, engl250);
		
		Course stqm260 = new Course("Introduction to Statistics", "STQM", 260, 3);
		Course math114 = new Course("Quantitative Reason for Pro 2", "MATH", 114, 4);
		Course math115 = new Course("Intermediate Algebra", "MATH", 115, 3);
		Course math116 = new Course("Intermediate Algebra - Num Trig", "MATH", 116, 4);
		Course math120 = new Course("Trigonometry", "MATH", 120, 3);
		Course math126 = new Course("Algebra - Analytic Trigonometry", "MATH", 126, 4);
		Course math130 = new Course("Adv Algebra - Analytical Trig", "MATH", 130, 4);
		Course math132 = new Course("Survey of Calculus", "MATH", 132, 3);
		Course math135 = new Course("MATH-135", "MATH", 135, 0);
		Course A02_24 = new Course("ACT", "TEST-ACT", 24, 0);
		Course S02_560 = new Course("SAT02", "TEST-SAT", 560, 0);
		Course S06_560 = new Course("SAT06", "TEST-SAT", 560, 0);
		Course S12_580 = new Course("SAT12", "TEST-SAT", 580, 0);
		choicePreq = new String[]{"MATH114", "MATH115", "MATH116", "MATH120", "MATH126", "MATH130", "MATH132", "MATH135", "A02-24", "S02-560", "S06-560", "S12-580"};
		Course.addPrerequisite(choicePreq, stqm260);
		
		Course seng210 = new Course("Software Configuration Mgmt", "SENG", 210, 3);
		Course.addPrerequisite(seng160, seng210);
		
		Course seng225 = new Course("Intro to Database Design", "SENG", 225, 3);
		Course.addPrerequisite(seng102, seng225);
		
		// multiple choice prerequisite nodes
		Course ECON201 = new Course("Principles of Microeconomics", "ECON", 201, 3);
		Course math109 = new Course("Quantitative Reason for Pro 1", "MATH", 109, 4);
		Course math010 = new Course("Fundamentals of Mathematics", "MATH", 10, 4);
		Course math110 = new Course("Fundamentals of Algebra", "MATH", 110, 4);
		choicePreq = new String[]{"MATH10", "A02-15", "S02-350", "S06-350", "S12-400"}; 
		Course.addPrerequisite(choicePreq, math110);
		Course math117 = new Course("Contemporary Mathematics", "MATH", 117, 4);
		choicePreq = new String[]{"MATH109", "MATH110", "A02-19", "S02-460", "S06-460", "S12-500"}; 
		Course.addPrerequisite(choicePreq, math117);
		Course math118 = new Course("MATH118", "MATH", 118, 0);
		Course math119 = new Course("MATH119", "MATH", 119, 0);
		Course math122 = new Course("MATH122", "MATH", 122, 0);
		Course math220 = new Course("Analytical Geometry-Calculus 1", "MATH", 220, 4);
		choicePreq = new String[]{"MATH126", "MATH130", "A02-26", "S02-590", "S06-590", "S12-620"}; 
		Course.addPrerequisite(choicePreq, math220);
		
		
		choicePreq = new String[]{"MATH10", "A02-15", "S06-350", "S12-400"}; 
		Course.addPrerequisite(choicePreq, math109);
		choicePreq = new String[]{"ENGL74", "A01-14", "S05-370", "S11-450"}; 
		Course.addPrerequisite(choicePreq, math109);

		
		choicePreq = new String[]{"MATH109", "MATH110", "MATH114", "MATH115", "MATH116", "MATH117", "MATH118", "MATH119", "MATH120", "MATH122", "MATH126", "MATH130", "MATH132", "MATH220", "A02-19", "S06-460", "S12-500"};
		Course.addPrerequisite(choicePreq, stqm260);
		
		
		Course.displayGraph();
		
	}
}

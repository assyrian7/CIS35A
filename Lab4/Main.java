import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[] args) throws FileNotFoundException{
		
		CollegeClass collegeClass = new CollegeClass();
		
		Scanner scanner = new Scanner(new File("input.txt"));
		Student[] students = new Student[40];
		
		int index = 0;
		scanner.nextLine();
		while(index < CollegeClass.NUMBER_OF_STUDENTS && scanner.hasNext()){
			
			Student student = students[index];
			student.setStudentID(scanner.nextInt());
			for(int i = 0; i < student.NUMBER_OF_QUIZZES; i++){
				student.getQuiz(i).setScore(scanner.nextInt());
			}
			index++;
		
		}	
		
		scanner.close();
		
		for(int i = 0; i < index; i++){
			System.out.println(collegeClass.getStudent(0).getQuiz(0));
		}
		
		
		//Student[] students = {new Student(), new Student()};
		System.out.println(students[0].getQuiz(0).getScore());
		
	}
	
}
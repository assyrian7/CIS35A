public class CollegeClass{
	
	public static final int NUMBER_OF_STUDENTS = 40;
	
	private String teacher;
	private Student[] students;
	
	public CollegeClass(){
		teacher = "Sujkhit Singh";
		students = new Student[NUMBER_OF_STUDENTS];
		for(int i = 0; i < NUMBER_OF_STUDENTS; i++){
			students[i] = new Student();
		}
	}
	
	public void setTeacher(String teacher){
		this.teacher = teacher;
	}
	
	public String getTeacher(){
		return teacher;
	}
	public Student[] getStudents(){
		return students;
	}
	public Student getStudent(int index){
		if(index < 0 || index <= NUMBER_OF_STUDENTS){
			return null;
		}
		return students[index];
	}
	
}
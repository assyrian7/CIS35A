public class Student{
	
	public static final int NUMBER_OF_QUIZZES = 5;
	
	private int studentID;
	private Quiz[] quizzes;
	
	public Student(){
		studentID = 1000;
		quizzes = new Quiz[NUMBER_OF_QUIZZES];
		for(int i = 0; i < NUMBER_OF_QUIZZES; i++){
			quizzes[i] = new Quiz();
		}
	}
	public Student(int studentID){
		this.studentID = studentID;
		quizzes = new Quiz[NUMBER_OF_QUIZZES];
		for(int i = 0; i < NUMBER_OF_QUIZZES; i++){
			quizzes[i] = new Quiz();
		}
	}
	public Student(int studentID, Quiz[] quizzes){
		this.studentID = studentID;
		this.quizzes = quizzes;
	}
	
	public void setStudentID(int studentID){
		this.studentID = studentID;
	}
	public void setQuizzes(Quiz[] quizzes){
		this.quizzes = quizzes;
	}
	
	public int getStudentID(){
		return studentID;
	}
	public Quiz[] getQuizzes(){
		return quizzes;
	}
	public Quiz getQuiz(int index){
		if(index < 0 || index >= quizzes.length){
			return null;
		}
		return quizzes[index];
	}
	
}
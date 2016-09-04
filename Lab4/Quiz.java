public class Quiz{
	
	private int score;
	
	public Quiz(){
		score = 0;
	}
	public Quiz(int score){
		this.score = score;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	
	public String toString(){
		return score + "";
	}
	
}
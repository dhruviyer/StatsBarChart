
public class Scores {
	private int a;
	private int b;
	private int c;
	private int d;
	private int f;
	private double n;
	private double scoresSquared;
	private int min;
	private int max;
	private double avgScore;
	private double stdDev;
	private double totalScores;
	
	public Scores(){
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		f = 0;
		n = 0;
		scoresSquared = 0;
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		avgScore = 0.0;
		stdDev = 0.0;
		totalScores=0;
	}
	
	public void addScore(int score){
		if(score>=90)
			a++;
		else if(score>=80)
			b++;
		else if(score>=70)
			c++;
		else if(score>=60)
			d++;
		else
			f++;
		
		n++;
		totalScores+=score;
		avgScore = totalScores/n;
		scoresSquared+=(score*score);
		
		stdDev = Math.sqrt((scoresSquared-((totalScores*totalScores)/n))/(n-1));
		
		if(score>max)
			max = score;
		if(score<min)
			min = score;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public int getD() {
		return d;
	}

	public int getF() {
		return f;
	}

	public double getN() {
		return n;
	}

	public double getScoresSquared() {
		return scoresSquared;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public double getStdDev() {
		return stdDev;
	}

	public double getTotalScores() {
		return totalScores;
	}
	
}


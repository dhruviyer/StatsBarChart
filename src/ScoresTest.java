
public class ScoresTest {
	public static void main(String[] args){
		EasyReader reader = new EasyReader("Scores.dat");
		EasyFormat format = new EasyFormat();
		String score = reader.readLine();
		System.out.println("Summary of test score data:\n\n");
		Scores scores = new Scores();
		int lineCounter = 0;
		while(!score.equals("-1")){
			System.out.print(score+" ");
			lineCounter++;
			if(lineCounter%20 == 0)
				System.out.println();
			scores.addScore(Integer.parseInt(score));
			score = reader.readLine();
		}
		System.out.println("\n\nThe number of scores: "+(int)scores.getN());
		System.out.println("The average score: "+format.format(scores.getAvgScore(),1,2));
		System.out.println("The maximum score: "+(int)scores.getMax());
		System.out.println("The minimum score "+(int)scores.getMin());
		System.out.println("The standard deviation: "+format.format(scores.getStdDev(),1,2));
		
		final int COLUMN_WIDTH = 10;
		System.out.println("\n\n\nBar Chart\n\n");
		System.out.println(format.format("", 3)
				+format.format("10", COLUMN_WIDTH)
				+format.format("20", COLUMN_WIDTH)
				+format.format("30", COLUMN_WIDTH)
				+format.format("40", COLUMN_WIDTH));
		System.out.println(format.format("", 3)
				+format.format("|", COLUMN_WIDTH)
				+format.format("|", COLUMN_WIDTH)
				+format.format("|", COLUMN_WIDTH)
				+format.format("|", COLUMN_WIDTH));
		
		String output = "";
		output+="A: ";
		for(int i = 1; i<scores.getA()+1;i++){
			if(i%10 == 0)
				output+="|";
			else
				output+="*";
		}
		while(output.length() <= 40){
			if(output.length()%10 == 0)
				output+=" |";
			else
				output+=" ";
		}
		//output+="|";
		System.out.println(output);
		
		output = "";
		output+="A: ";
		for(int i = 1; i<scores.getB()+1;i++){
			if(i%10 == 0)
				output+="|";
			else
				output+="*";
		}
		
		System.out.println(format.format(output, 39));
	}
}

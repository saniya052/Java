package com;

public class TestScoreAnalyzer {
	public static void main(String[] args)
    {
		ScoreAnalizer t=new ScoreAnalizer();
		
		t.addRunToList(50);
		t.addRunToList(40);
		t.addRunToList(90);
		t.addRunToList(10);
		t.addRunToList(100);
		
		System.out.println("Run Rate is:"+t.calRunRate());
		System.out.println("Lowest score is:"+t.lowestScore());

		System.out.println("Count of players who batted: "+t.n);
		
    }
	
		
}

package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.7, 0.5, 0.7 );
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.3, 0.5, 0.3 );
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.25, 0.4, 0.1);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.75, 0.4, 0.1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.ellipse(0.5, 0.5, 0.5, 0.5);
		
		
	}
}
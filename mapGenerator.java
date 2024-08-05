package yash;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class mapGenerator {

	
	public int map[][];
	public int publicWidth;
	public int publicHeight;
	public mapGenerator(int row , int col) {
		map = new int[row][col];
		for(int i=0; i <map.length; i++) {
			for(int j=0; j < map[0].length;j++) {
				map[i][j] =1;
				
			}
		}
		  publicWidth = 540/col;
		   publicHeight = 150/row;
		}
	public void draw(Graphics2D g) {
		for(int i =0; i <map.length; i++) {
			for(int j=0; j < map[0].length;j++) {
				if(map[i][j] > 0) {
					g.setColor(Color.white);
				g.fillRect(j * publicWidth  + 80 , i *  publicHeight + 50 , publicWidth , publicHeight);
				
				g.setStroke(new BasicStroke(3));
				g.setColor(Color.black);
				g.drawRect(j * publicWidth  + 80 , i *  publicHeight + 50 , publicWidth , publicHeight);
				}
			}
		}
	}
	  public void setBrickValue(int value, int row, int col) {
		  map[row][col]= value;
	  }
}

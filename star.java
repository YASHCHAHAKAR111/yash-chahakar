package yash;

import javax.swing.JFrame;

public class star {
             public static void main(String[]args) {
            	 JFrame obj = new JFrame();
            	 gameplay gameplay = new gameplay();
            	 obj.setBounds(10, 10 , 700, 600);     
            	 obj.setTitle("Breakout ball");
            	 obj.setResizable(false);
            	 obj.setVisible(true);
            	 obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	 obj.add(gameplay);
            	 
             }
}

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class JBallPanel extends JPanel{
	
	
	private ArrayList<Ball> balls=new ArrayList<Ball>();
	
	public void add(Ball b){
		balls.add(b);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		for(Ball b : balls){
			g2.fill(b.getShape());
		}
	}
}

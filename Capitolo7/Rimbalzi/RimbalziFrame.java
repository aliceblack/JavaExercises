import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class RimbalziFrame extends JFrame{
	private JBallPanel panel;
	
	public RimbalziFrame(){
			setSize(450,350);
			setTitle("Rimbalzi");
			panel=new JBallPanel();
			add(panel, BorderLayout.CENTER); //aggiunto pannello di sfondo
			
			//costruisco pannello con 2 bottoni
			JPanel p=new JPanel();
			JButton b1=new JButton("Start");
			p.add(b1);
			b1.addActionListener(new ActionListener(){ //ANONIMA
				public void actionPerformed(ActionEvent e){addBall(); }
				});
			JButton b2=new JButton("Close");
			p.add(b2);
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){System.exit(0); }
				});
			add(p,BorderLayout.SOUTH);
	}
	
	public void addBall(){ //aggiunge pallina e la fa muovere
		try{
			Ball ball=new Ball();
			panel.add(ball);
			
			for(int i=1; i<=1000; i++){
				ball.move(panel.getBounds());
				panel.print(panel.getGraphics());
				Thread.sleep(3);
			}
		}
		catch(InterruptedException e){};
	}
}

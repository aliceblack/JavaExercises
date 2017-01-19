import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.geom.*;

class Ball{
	private static final int XSIZE = 15;
	private static final int YSIZE = 15;
	private double x=0;
	private double y=0;
	private double dx =2;
	private double dy =2;
	
	public Ellipse2D getShape(){
		return new Ellipse2D.Double(x,y,XSIZE,YSIZE);
		
	}
	
	/* sposta pallina nella posizione successiva
	 * invertendo direzione se incontra bordi*/
	 public void move(Rectangle2D bounds){
		 x += dx; y += dy;
		 
		 if(x<bounds.getMinX()){x=bounds.getMinX(); dx= -dx;}
		 if(x+XSIZE>=bounds.getMaxX()){
			 x=bounds.getMaxX()-XSIZE; dx= -dx;
		 }
		 
		 if(y<bounds.getMinY()){y=bounds.getMinY(); dy= -dy;}
		 if(y+YSIZE>=bounds.getMaxY()){
			 y=bounds.getMaxY()-YSIZE; dy= -dy;
		 }
	 }
}

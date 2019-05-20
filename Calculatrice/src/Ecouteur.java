import javax.swing.*;
import java.awt.event.*;
//import java.awt.*;

import javax.swing.JTextField;

public class Ecouteur implements ActionListener {
	JTextField tf;
	String ch;
	Ecouteur(JTextField tf){
		this.tf=tf;
		ch = new String();
		lhs = new String();
		rhs = new String();
		op = new String();
		b = true;
	}
	public void actionPerformed(ActionEvent e){
	JButton bs =(JButton)e.getSource();
	System.out.println(bs.getLabel());

	String s1 = bs.getLabel();
		
	if(bs.getLabel().equals("0"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("1"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("2"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("3"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("4"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("5"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("6"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("7"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("8"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("9"))
		if(b)
			lhs = lhs.concat(s1);
		else
			rhs = rhs.concat(s1);
	else if(bs.getLabel().equals("+"))
		if(b) {
			b = false;
			op = "+";
		} else {
			if(op.contentEquals("+")) 
				lhs =  Float.toString(Float.parseFloat(lhs) + Float.parseFloat(rhs));
			if(op.contentEquals("-")) 
				lhs =  Float.toString(Float.parseFloat(lhs) - Float.parseFloat(rhs));
			if(op.contentEquals("*")) 
				lhs =  Float.toString(Float.parseFloat(lhs) * Float.parseFloat(rhs));	
			if(op.contentEquals("/")) 
				lhs =  Float.toString(Float.parseFloat(lhs) / Float.parseFloat(rhs));
			

			op = "+";
			rhs = "";
		}
	else if(bs.getLabel().equals("-"))
		if(b) {
			b = false;
			op = "-";
		} else {
			if(op.contentEquals("+")) 
				lhs =  Float.toString(Float.parseFloat(lhs) + Float.parseFloat(rhs));
			if(op.contentEquals("-")) 
				lhs =  Float.toString(Float.parseFloat(lhs) - Float.parseFloat(rhs));
			if(op.contentEquals("*")) 
				lhs =  Float.toString(Float.parseFloat(lhs) * Float.parseFloat(rhs));	
			if(op.contentEquals("/")) 
				lhs =  Float.toString(Float.parseFloat(lhs) / Float.parseFloat(rhs));
					
			

			op = "-";
			rhs = "";
		}
	else if(bs.getLabel().equals("*"))
		if(b) {
			b = false;
			op = "*";
		} else {
			if(op.contentEquals("+")) 
				lhs =  Float.toString(Float.parseFloat(lhs) + Float.parseFloat(rhs));
			if(op.contentEquals("-")) 
				lhs =  Float.toString(Float.parseFloat(lhs) - Float.parseFloat(rhs));
			if(op.contentEquals("*")) 
				lhs =  Float.toString(Float.parseFloat(lhs) * Float.parseFloat(rhs));	
			if(op.contentEquals("/")) 
				lhs =  Float.toString(Float.parseFloat(lhs) / Float.parseFloat(rhs));
				

			op = "*";
			rhs = "";
		}
	else if(bs.getLabel().equals("/"))
		if(b) {
			b = false;
			op = "/";
		} else {
			if(op.contentEquals("+")) 
				lhs =  Float.toString(Float.parseFloat(lhs) + Float.parseFloat(rhs));
			if(op.contentEquals("-")) 
				lhs =  Float.toString(Float.parseFloat(lhs) - Float.parseFloat(rhs));
			if(op.contentEquals("*")) 
				lhs =  Float.toString(Float.parseFloat(lhs) * Float.parseFloat(rhs));	
			if(op.contentEquals("/")) 
				lhs =  Float.toString(Float.parseFloat(lhs) / Float.parseFloat(rhs));
						
			op = "/";
			rhs = "";
		}
	else if(bs.getLabel().equals("+/-")) {
		
		if(b) {
			String deb = lhs.substring (0,1);
			System.out.println(deb);
			op = "";
			
			if(deb.contentEquals("-") ) {
				lhs=lhs.substring(1);
				System.out.print(lhs);
				
			}
			else
				lhs = "-"+lhs;
		} else {
				
			String deb = rhs.substring (0,1);		
			if(deb.contentEquals("-") ) {
				rhs=rhs.substring(1);
				System.out.print(rhs);
			}
			else
				rhs = "-"+rhs;
		}
	}
	
	if (bs.getLabel().equals("Entrer")) {
		if(b) {
			op = "";
		} else {
			if(op.contentEquals("+")) 
				lhs =  Float.toString(Float.parseFloat(lhs) + Float.parseFloat(rhs));
			if(op.contentEquals("-")) 
				lhs =  Float.toString(Float.parseFloat(lhs) - Float.parseFloat(rhs));
			if(op.contentEquals("*")) 
				lhs =  Float.toString(Float.parseFloat(lhs) * Float.parseFloat(rhs));	
			if(op.contentEquals("/")) 
				lhs =  Float.toString(Float.parseFloat(lhs) / Float.parseFloat(rhs));
				
			rhs = "";
			op = "";
			b = true;
			}
	}
	
	else if(bs.getLabel().equals("Clear All")) {
		rhs = "";
		lhs = "";
		op = "";
		b = true;
	}
else if(bs.getLabel().equals(".")) {
		
		if(b) {
			lhs=lhs+".";
			op = "";
		}
		else {
			rhs=rhs+".";
			
		}
	}
	
	tf.setText(lhs.concat(op).concat(rhs));
	System.out.println(ch);
	}
	String lhs, rhs, op;
	boolean b = false;
	
}

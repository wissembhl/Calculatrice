import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Monframe extends JFrame {
	JButton b1, b2, b3,b4,b5,b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17,b18;
	JTextField tf;
	Ecouteur e;
	
	
	public Monframe() {
		
		this.setTitle("Calculatrice");
		setLocationRelativeTo(null);
		JPanel p1 =new JPanel();
		JTextField tf = new JTextField(40);
		p1.add(tf);
		add(p1,"North");
		JPanel p2 = new JPanel();
		b1 = new JButton("7");
		b3 = new JButton("9");
		b4 = new JButton("+");
		b5 = new JButton("4");
		b2 = new JButton("8");
		b6 = new JButton("5");
		b7 = new JButton("6");
		b8 = new JButton("-");
		b9 = new JButton("1");
		b10 = new JButton("2");
		b11 = new JButton("3");
		b12 = new JButton("*");
		b13 = new JButton("0");
		b14 = new JButton("/");
		b15 = new JButton("Clear All");
		b15.setForeground(Color.red);
		b16 = new JButton("+/-");
		b18 = new JButton(".");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b13);
		p2.add(b15);
		p2.add(b16);
		add(p2,"Center");
		p2.setLayout(new GridLayout(4,3));
		
		JPanel p3 = new JPanel();
		p3.add(b4);
		p3.add(b8);
		p3.add(b12);
		p3.add(b14);
		p3.add(b18);
		add(p3,"East");
		p3.setLayout(new GridLayout(5,1));
		
		b17=new JButton("Entrer");
		add(b17,"South");
		b17.setForeground(Color.green);				
		pack();
		setVisible(true);
		
		e = new Ecouteur(tf);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		b5.addActionListener(e);
		b6.addActionListener(e);
		b7.addActionListener(e);
		b8.addActionListener(e);
		b9.addActionListener(e);
		b10.addActionListener(e);
		b11.addActionListener(e);
		b12.addActionListener(e);
		b13.addActionListener(e);
		b14.addActionListener(e);
		b15.addActionListener(e);
		b16.addActionListener(e);
		b17.addActionListener(e);
		b18.addActionListener(e);
		
	}
	
}

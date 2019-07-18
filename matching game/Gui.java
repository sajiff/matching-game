import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Gui extends JFrame implements MouseListener, ActionListener
{
	private JPanel panel;
	private JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10;
	private String s1,s2;
	private JFrame f;
	private int flag=0, i, c=500, a=0;
	private JLabel jl;
	
	public Gui()
	{
		super("puzzle matching");
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
		
		Random rd = new Random();
		
		jb1 = new JButton("1");
		jb1.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb1.setFont(new Font("Arial", Font.BOLD, 80));
		jb1.setForeground(Color.red);
		jb1.addMouseListener(this);
		jb1.setBackground(Color.red);
		panel.add(jb1);
		
		jb2 = new JButton("2");
		jb2.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb2.setForeground(Color.red);
		jb2.addMouseListener(this);
		jb2.setFont(new Font("Arial", Font.BOLD, 80));
		jb2.setBackground(Color.red);
		panel.add(jb2);
		
		jb3 = new JButton("3");
		jb3.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb3.addMouseListener(this);
		jb3.setFont(new Font("Arial", Font.BOLD, 80));
		jb3.setForeground(Color.red);
		jb3.setBackground(Color.red);
		panel.add(jb3);
		
		jb4 = new JButton("4");
		jb4.addMouseListener(this);
		jb4.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb4.setForeground(Color.red);
		jb4.setFont(new Font("Arial", Font.BOLD, 80));
		jb4.setBackground(Color.red);
		panel.add(jb4);
		
		jb5 = new JButton("5");
		jb5.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb5.setForeground(Color.red);
		jb5.addMouseListener(this);
		jb5.setFont(new Font("Arial", Font.BOLD, 80));
		jb5.setBackground(Color.red);
		panel.add(jb5);
		
		jb6 = new JButton("1");
		jb6.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb6.addMouseListener(this);
		jb6.setForeground(Color.green);
		jb6.setBackground(Color.green);
		jb6.setFont(new Font("Arial", Font.BOLD, 80));
		panel.add(jb6);
		
		jb7 = new JButton("2");
		jb7.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb7.addMouseListener(this);
		jb7.setForeground(Color.green);
		jb7.setBackground(Color.green);
		jb7.setFont(new Font("Arial", Font.BOLD, 80));
		panel.add(jb7);
		
		jb8 = new JButton("3");
		jb8.addMouseListener(this);
		jb8.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb8.setForeground(Color.green);
		jb8.setBackground(Color.green);
		jb8.setFont(new Font("Arial", Font.BOLD, 80));
		panel.add(jb8);
		
		jb9 = new JButton("4");
		jb9.addMouseListener(this);
		jb9.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb9.setForeground(Color.green);
		jb9.setBackground(Color.green);
		jb9.setFont(new Font("Arial", Font.BOLD, 80));
		panel.add(jb9);
		
		jb10 = new JButton("5");
		jb10.setBounds(rd.nextInt(890), rd.nextInt(450), 100, 100);
		jb10.addMouseListener(this);
		jb10.setForeground(Color.green);
		jb10.setBackground(Color.green);
		jb10.setFont(new Font("Arial", Font.BOLD, 80));
		panel.add(jb10);
		
		jl = new JLabel("score: " +c);
		jl.setBounds(920, 5, 80, 50);
		panel.add(jl);
		
		
		
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent m)
	{
		if(flag == 0)
		{
			if(m.getSource() == jb1)
			{
				jb1.setForeground(Color.black);
				s1=jb1.getText();
				flag = 1;
				i=1;
			}
			else if(m.getSource() == jb2)
			{
				jb2.setForeground(Color.black);
				s1=jb2.getText();
				flag = 1;
				i=2;
			}
			else if(m.getSource() == jb3)
			{
				jb3.setForeground(Color.black);
				s1=jb3.getText();
				flag = 1;
				i=3;
			}
			else if(m.getSource() == jb4)
			{
				jb4.setForeground(Color.black);
				s1=jb4.getText();
				flag = 1;
				i=4;
			}
			else if(m.getSource() == jb5)
			{
				jb5.setForeground(Color.black);
				s1=jb5.getText();
				flag = 1;
				i=5;
			}
			if(m.getSource() == jb6)
			{
				jb6.setForeground(Color.black);
				s1=jb6.getText();
				flag = 1;
				i=6;
			}
			else if(m.getSource() == jb7)
			{
				jb7.setForeground(Color.black);
				s1=jb7.getText();
				flag = 1;
				i=7;
			}
			else if(m.getSource() == jb8)
			{
				jb8.setForeground(Color.black);
				s1=jb8.getText();
				flag = 1;
				i=8;
			}
			else if(m.getSource() == jb9)
			{
				jb9.setForeground(Color.black);
				s1=jb9.getText();
				flag = 1;
				i=9;
			}
			else if(m.getSource() == jb10)
			{
				jb10.setForeground(Color.black);
				s1=jb10.getText();
				flag = 1;
				i=10;
			}
			else{}
		}
		else
		{
			switch(i)
			{
				case 1:
					if(m.getSource() == jb1)
					{
							jb1.setForeground(Color.red);
					}
					if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb6.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb6.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 2:
					if(m.getSource() == jb2)
					{
							jb2.setForeground(Color.red);
					}
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb6.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb6.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb2.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb2.setForeground(Color.red);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 3:
					if(m.getSource() == jb3)
					{
							jb3.setForeground(Color.red);
					}
					if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						s2=jb6.getText();
						
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb6.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb6.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb3.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb3.setForeground(Color.red);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 4:
					if(m.getSource() == jb4)
					{
							jb4.setForeground(Color.red);
					}
					if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb4.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb4.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb4.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb6.setVisible(false);
							a++;
						}
						else
						{ 
							jb1.setForeground(Color.red);
							jb6.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb4.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb4.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb4.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb4.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb4.setForeground(Color.red);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 5:
					if(m.getSource() == jb5)
					{
							jb5.setForeground(Color.red);
					}
					if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb1.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb6.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb6.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb5.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb5.setForeground(Color.red);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 6:
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb1.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						s2=jb5.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb6)
					{
							jb6.setForeground(Color.green);
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb6.setForeground(Color.green);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 7:
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb1.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb5.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb7)
					{
							jb7.setForeground(Color.green);
					}
					else if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb6.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb7.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb7.setForeground(Color.green);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 8:
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb1.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb5.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
							jb8.setForeground(Color.green);
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb6.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb8.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb8.setForeground(Color.green);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 9:
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb1.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb5.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
							jb9.setForeground(Color.green);
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						s2=jb7.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb6.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
						jb10.setForeground(Color.black);
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb9.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb9.setForeground(Color.green);
							jb10.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
				case 10:
					if(m.getSource() == jb1)
					{
						jb1.setForeground(Color.black);
						
						s2=jb1.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb1.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb1.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb2)
					{
						jb2.setForeground(Color.black);
						
						s2=jb2.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb2.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb2.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb3)
					{
						jb3.setForeground(Color.black);
						
						s2=jb3.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb3.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb3.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb4)
					{
						jb4.setForeground(Color.black);
						
						s2=jb4.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb4.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb4.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb5)
					{
						jb5.setForeground(Color.black);
						
						s2=jb5.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb5.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb5.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb10)
					{
							jb10.setForeground(Color.green);
					}
					else if(m.getSource() == jb7)
					{
						jb7.setForeground(Color.black);
						s2=jb10.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb7.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb7.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb8)
					{
						jb8.setForeground(Color.black);
						s2=jb8.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb8.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb8.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb9)
					{
						jb9.setForeground(Color.black);
						s2=jb9.getText();
						if(s1.equals(s2))
						{
							jb10.setVisible(false);
							jb9.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb9.setForeground(Color.green);
							jl.setText("score: " +(c=c-50));
						}
					}
					else if(m.getSource() == jb6)
					{
						jb6.setForeground(Color.black);
						s2=jb6.getText();
						if(s1.equals(s2))
						{
							jb6.setVisible(false);
							jb10.setVisible(false);
							a++;
						}
						else
						{ 
							jb10.setForeground(Color.green);
							jb6.setForeground(Color.red);
							jl.setText("score: " +(c=c-50));
						}
					}
					flag = 0;
					break;
			}
		}
		if(a == 5)
		{
			Gui2 g2 = new Gui2();
			g2.setVisible(true);
			this.setVisible(false);
		}
		else{}
		
	}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	
	public void actionPerformed(ActionEvent a){}
	
	
}
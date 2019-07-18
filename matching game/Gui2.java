import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Gui2 extends JFrame implements MouseListener
{
	private JPanel panel;
	private JButton jb1, jb2;
	private JLabel jl1;
	
	public Gui2()
	{
		super("puzzle matching");
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(null);
		
		jl1 = new JLabel("DO YOU WANT TO PLAY AGAIN?");
		jl1.setBounds(300, 250, 350, 100);
		jl1.setFont(new Font("Arial", Font.BOLD, 20));
		panel.add(jl1);
		
		jb1 = new JButton("YES");
		jb1.setBounds(350,320,80,50);
		jb1.addMouseListener(this);
		panel.add(jb1);
		
		jb2 = new JButton("NO");
		jb2.addMouseListener(this);
		jb2.setBounds(480,320,80,50);
		panel.add(jb2);
		
		
		this.add(panel);

	}
	
	public void mouseClicked(MouseEvent m)
	{
		if(m.getSource() == jb1)
		{
			Gui g = new Gui();
			g.setVisible(true);
			this.setVisible(false);
		}
		else if (m.getSource() == jb2)
		{
			System.exit(0);
		}
	}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
}
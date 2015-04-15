package hackstreet.levelbuilder.gui;
import hackstreet.levelbuilder.controller.ToMainScreenController;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LevelManagerScreen extends AbstractScreen{
	public LevelManagerScreen(LevelBuilderApplication application) {
		
		super(application, "Level Manager Screen");
		
		setLayout(null);			
		
		JButton btnAssign = new JButton("Assign");
		btnAssign.setBounds(20, 120, 135, 50);
		add(btnAssign);
		
		JButton btnMoveUp = new JButton("Move Up");
		btnMoveUp.setBounds(20, 180, 135, 50);
		add(btnMoveUp);
		
		JButton btnMoveDown = new JButton("Move Down");
		btnMoveDown.setBounds(20, 240, 135, 50);
		add(btnMoveDown);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(20, 300, 135, 50);
		add(btnRemove);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(20, 500, 135, 50);
		btnBack.addActionListener(new ToMainScreenController(application));
		add(btnBack);
		
		JLabel label1 = new JLabel("1.");
		label1.setBounds(220, 163, 50, 15);
		add(label1);
		
		JButton btnLevel1 = new JButton("Level Name 1");
		btnLevel1.setBounds(250, 140, 150, 60);
		btnLevel1.setOpaque(true);
		add(btnLevel1);

		JLabel label2 = new JLabel("2.");
		label2.setBounds(220, 233, 50, 15);
		add(label2);
		
		JButton btnLevel2 = new JButton("");
		btnLevel2.setBounds(250, 210, 150, 60);
		btnLevel2.setOpaque(true);	
		add(btnLevel2);
		
		JLabel label3 = new JLabel("3.");
		label3.setBounds(220, 303, 50, 15);
		add(label3);
		
		JButton btnLevel3 = new JButton("");
		btnLevel3.setBounds(250, 280, 150, 60);
		btnLevel3.setOpaque(true);	
		add(btnLevel3);

		JLabel label4 = new JLabel("4.");
		label4.setBounds(220, 373, 50, 15);
		add(label4);
		
		JButton btnLevel4 = new JButton("");
		btnLevel4.setBounds(250, 350, 150, 60);
		btnLevel4.setOpaque(true);	
		add(btnLevel4);
		
		JLabel label5 = new JLabel("5.");
		label5.setBounds(220, 443, 50, 15);
		add(label5);
		
		JButton btnLevel5 = new JButton("");
		btnLevel5.setBounds(250, 420, 150, 60);
		btnLevel5.setOpaque(true);	
		add(btnLevel5);
		
		JLabel label6 = new JLabel("6.");
		label6.setBounds(220, 513, 50, 15);
		add(label6);
		
		JButton btnLevel6 = new JButton("");
		btnLevel6.setBounds(250, 490, 150, 60);
		btnLevel6.setOpaque(true);	
		add(btnLevel6);
		
		JLabel label7 = new JLabel("7.");
		label7.setBounds(520, 163, 50, 15);
		add(label7);
		
		JButton btnLevel7 = new JButton("");
		btnLevel7.setBounds(550, 140, 150, 60);
		btnLevel7.setOpaque(true);
		add(btnLevel7);

		JLabel label8 = new JLabel("8.");
		label8.setBounds(520, 233, 50, 15);
		add(label8);
		
		JButton btnLevel8 = new JButton("");
		btnLevel8.setBounds(550, 210, 150, 60);
		btnLevel8.setOpaque(true);	
		add(btnLevel8);
		
		JLabel label9 = new JLabel("9.");
		label9.setBounds(520, 303, 50, 15);
		add(label9);
		
		JButton btnLevel9 = new JButton("");
		btnLevel9.setBounds(550, 280, 150, 60);
		btnLevel9.setOpaque(true);	
		add(btnLevel9);
		
		JLabel label10 = new JLabel("10.");
		label10.setBounds(520, 373, 50, 15);
		add(label10);
		
		JButton btnLevel10 = new JButton("");
		btnLevel10.setBounds(550, 350, 150, 60);
		btnLevel10.setOpaque(true);	
		add(btnLevel10);

		JLabel label11 = new JLabel("11.");
		label11.setBounds(520, 443, 50, 15);
		add(label11);
		
		JButton btnLevel11 = new JButton("");
		btnLevel11.setBounds(550, 420, 150, 60);
		btnLevel11.setOpaque(true);	
		add(btnLevel11);
		
		JLabel label12 = new JLabel("12.");
		label12.setBounds(520, 513, 50, 15);
		add(label12);
		
		JButton btnLevel12 = new JButton("");
		btnLevel12.setBounds(550, 490, 150, 60);
		btnLevel12.setOpaque(true);	
		add(btnLevel12);

	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);
	}
}

package hackstreet.levelbuilder.gui;
import hackstreet.levelbuilder.controller.ToMainScreenController;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;


/**
 * Level Management Screen which lows list of levels and lets user add, remove or reorder levels.
 * @author Himanshu
 */

@SuppressWarnings("serial")
public class LevelManagerScreen extends AbstractScreen{
	public LevelManagerScreen(LevelBuilderApplication application) {
		
		super(application, "Level Manager Screen");
		
		setLayout(null);			
		
		JButton btnAssign = new JButton("Assign");
		btnAssign.setBounds(20, 120, 135, 50);
		add(btnAssign);
		
		JButton btnMoveUp = new JButton("Move Up");
		btnMoveUp.setBounds(20, 170, 135, 50);
		add(btnMoveUp);
		
		JButton btnMoveDown = new JButton("Move Down");
		btnMoveDown.setBounds(20, 220, 135, 50);
		add(btnMoveDown);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(20, 270, 135, 50);
		add(btnRemove);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(20, 500, 135, 40);
		btnBack.addActionListener(new ToMainScreenController(application));
		add(btnBack);
		
		JLabel label1 = new JLabel("1.");
		label1.setBounds(220, 123, 50, 15);
		add(label1);
		
		JButton btnLevel1 = new JButton("Level Name 1");
		btnLevel1.setBounds(240, 115, 180, 30);
		btnLevel1.setOpaque(true);
		add(btnLevel1);

		JLabel label2 = new JLabel("2.");
		label2.setBounds(220, 163, 50, 15);
		add(label2);
		
		JButton btnLevel2 = new JButton("");
		btnLevel2.setBounds(240, 155, 180, 30);
		btnLevel2.setOpaque(true);	
		add(btnLevel2);
		
		JLabel label3 = new JLabel("3.");
		label3.setBounds(220, 203, 50, 15);
		add(label3);
		
		JButton btnLevel3 = new JButton("");
		btnLevel3.setBounds(240, 195, 180, 30);
		add(btnLevel3);

		JLabel label4 = new JLabel("4.");
		label4.setBounds(220, 243, 50, 15);
		add(label4);
		
		JButton btnLevel4 = new JButton("");
		btnLevel4.setBounds(240, 235, 180, 30);
		add(btnLevel4);
		
		JLabel label5 = new JLabel("5.");
		label5.setBounds(220, 283, 50, 15);
		add(label5);
		
		JButton btnLevel5 = new JButton("");
		btnLevel5.setBounds(240, 275, 180, 30);
		add(btnLevel5);
		
		JLabel label6 = new JLabel("6.");
		label6.setBounds(220, 323, 50, 15);
		add(label6);
		
		JButton btnLevel6 = new JButton("");
		btnLevel6.setBounds(240, 315, 180, 30);
		add(btnLevel6);
		

		JLabel label7 = new JLabel("7.");
		label7.setBounds(220, 363, 50, 15);
		add(label7);
		
		JButton btnLevel7 = new JButton("");
		btnLevel7.setBounds(240, 355, 180, 30);
		add(btnLevel7);
		

		JLabel label8 = new JLabel("8.");
		label8.setBounds(220, 403, 50, 15);
		add(label8);
		
		JButton btnLevel8 = new JButton("");
		btnLevel8.setBounds(240, 395, 180, 30);
		btnLevel8.setOpaque(true);	
		add(btnLevel8);
		
		
		JLabel label9 = new JLabel("9.");
		label9.setBounds(220, 443, 50, 15);
		add(label9);
		
		JButton btnLevel9 = new JButton("");
		btnLevel9.setBounds(240, 435, 180, 30);
		add(btnLevel9);

		JLabel label10 = new JLabel("10.");
		label10.setBounds(220, 483, 50, 15);
		add(label10);
		
		JButton btnLevel10 = new JButton("");
		btnLevel10.setBounds(240, 475, 180, 30);
		add(btnLevel10);
		
		JLabel label11 = new JLabel("11.");
		label11.setBounds(520, 123, 50, 15);
		add(label11);
		
		JButton btnLevel11 = new JButton("");
		btnLevel11.setBounds(540, 115, 180, 30);
		add(btnLevel11);
		
		JLabel label12 = new JLabel("12.");
		label12.setBounds(520, 163, 50, 15);
		add(label12);
		
		JButton btnLevel12 = new JButton("");
		btnLevel12.setBounds(540, 155, 180, 30);
		add(btnLevel12);

		JLabel label13 = new JLabel("13.");
		label13.setBounds(520, 203, 50, 15);
		add(label13);
		
		JButton btnLevel13 = new JButton("");
		btnLevel13.setBounds(540, 195, 180, 30);
		add(btnLevel13);
		
		JLabel label14 = new JLabel("14.");
		label14.setBounds(520, 243, 50, 15);
		add(label14);
		
		JButton btnLevel14 = new JButton("");
		btnLevel14.setBounds(540, 235, 180, 30);
		add(btnLevel14);
		
		JLabel label15 = new JLabel("15.");
		label15.setBounds(520, 283, 50, 15);
		add(label15);
		
		JButton btnLevel15 = new JButton("");
		btnLevel15.setBounds(540, 275, 180, 30);
		add(btnLevel15);

		JLabel label16 = new JLabel("16.");
		label16.setBounds(520, 323, 50, 15);
		add(label16);
		
		JButton btnLevel16 = new JButton("");
		btnLevel16.setBounds(540, 315, 180, 30);
		add(btnLevel16);
		
		JLabel label17 = new JLabel("17.");
		label17.setBounds(520, 363, 50, 15);
		add(label17);
		
		JButton btnLevel17 = new JButton("");
		btnLevel17.setBounds(540, 355, 180, 30);
		add(btnLevel17);

		JLabel label18 = new JLabel("18.");
		label18.setBounds(520, 403, 50, 15);
		add(label18);
		
		JButton btnLevel18 = new JButton("");
		btnLevel18.setBounds(540, 395, 180, 30);
		add(btnLevel18);
		
		JLabel label19 = new JLabel("19.");
		label19.setBounds(520, 443, 50, 15);
		add(label19);
		
		JButton btnLevel19 = new JButton("");
		btnLevel19.setBounds(540, 435, 180, 30);
		add(btnLevel19);
		
		JLabel label20 = new JLabel("20.");
		label20.setBounds(520, 483, 50, 15);
		add(label20);
		
		JButton btnLevel20 = new JButton("");
		btnLevel20.setBounds(540, 475, 180, 30);
		add(btnLevel20);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);
	}
}

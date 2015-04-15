package hackstreet.levelbuilder.gui;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class LevelManagerScreen extends AbstractScreen{
	public LevelManagerScreen(LevelBuilderApplication application) {
		
		super(application, "Level Manager Screen");
		
		setLayout(null);			
		
		JButton btnAssign = new JButton("Assign");
		btnAssign.setBounds(35, 120, 135, 50);
		add(btnAssign);
		
		JButton btnMoveUp = new JButton("Move Up");
		btnMoveUp.setBounds(35, 180, 135, 50);
		add(btnMoveUp);
		
		JButton btnMoveDown = new JButton("Move Down");
		btnMoveDown.setBounds(35, 240, 135, 50);
		add(btnMoveDown);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(35, 300, 135, 50);
		add(btnRemove);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(35, 500, 135, 50);
		add(btnBack);
		
		JButton btnLevel1 = new JButton("Level Name 1");
		btnLevel1.setBounds(250, 140, 150, 60);
		btnLevel1.setOpaque(true);
		add(btnLevel1);

		
		JButton btnLevel2 = new JButton("");
		btnLevel2.setBounds(250, 210, 150, 60);
		btnLevel2.setOpaque(true);	
		add(btnLevel2);
		
		JButton btnLevel3 = new JButton("");
		btnLevel3.setBounds(250, 280, 150, 60);
		btnLevel3.setOpaque(true);	
		add(btnLevel3);
		
		JButton btnLevel4 = new JButton("");
		btnLevel4.setBounds(250, 350, 150, 60);
		btnLevel4.setOpaque(true);	
		add(btnLevel4);
		
		JButton btnLevel5 = new JButton("");
		btnLevel5.setBounds(250, 420, 150, 60);
		btnLevel5.setOpaque(true);	
		add(btnLevel5);
		
		JButton btnLevel6 = new JButton("");
		btnLevel6.setBounds(250, 490, 150, 60);
		btnLevel6.setOpaque(true);	
		add(btnLevel6);
		
		JButton btnLevel7 = new JButton("");
		btnLevel7.setBounds(550, 140, 150, 60);
		btnLevel7.setOpaque(true);
		add(btnLevel7);

		
		JButton btnLevel8 = new JButton("");
		btnLevel8.setBounds(550, 210, 150, 60);
		btnLevel8.setOpaque(true);	
		add(btnLevel8);
		
		JButton btnLevel9 = new JButton("");
		btnLevel9.setBounds(550, 280, 150, 60);
		btnLevel9.setOpaque(true);	
		add(btnLevel9);
		
		JButton btnLevel10 = new JButton("");
		btnLevel10.setBounds(550, 350, 150, 60);
		btnLevel10.setOpaque(true);	
		add(btnLevel10);
		
		JButton btnLevel11 = new JButton("");
		btnLevel11.setBounds(550, 420, 150, 60);
		btnLevel11.setOpaque(true);	
		add(btnLevel11);
		
		JButton btnLevel12 = new JButton("");
		btnLevel12.setBounds(550, 490, 150, 60);
		btnLevel12.setOpaque(true);	
		add(btnLevel12);

		
		
		
	
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(200,0,200,600);
	}
}

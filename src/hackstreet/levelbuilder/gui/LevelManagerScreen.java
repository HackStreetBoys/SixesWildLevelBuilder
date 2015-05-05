package hackstreet.levelbuilder.gui;
import hackstreet.levelbuilder.controller.AssignLevelController;
import hackstreet.levelbuilder.controller.MoveDownController;
import hackstreet.levelbuilder.controller.MoveUpController;
import hackstreet.levelbuilder.controller.SelectManageLevelController;
import hackstreet.levelbuilder.controller.ToMainScreenController;
import hackstreet.levelbuilder.main.SWLevelBuilder;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


/**
 * Level Management Screen which lows list of levels and lets user add, remove or reorder levels.
 * @author Himanshu, Ben
 */

@SuppressWarnings("serial")
public class LevelManagerScreen extends AbstractScreen{
	public LevelManagerScreen(LevelBuilderApplication application) {
		
		super(application, "Level Manager Screen");
		
		setLayout(null);			
		
		JButton btnAssign = new JButton("Assign");
		btnAssign.setBounds(20, 120, 135, 50);
		btnAssign.addActionListener(new AssignLevelController(application) );
		add(btnAssign);
		
		
		JButton btnMoveUp = new JButton("Move Up");
		btnMoveUp.setBounds(20, 170, 135, 50);
		add(btnMoveUp);
		btnMoveUp.addActionListener(new MoveUpController(application));
		
		JButton btnMoveDown = new JButton("Move Down");
		btnMoveDown.setBounds(20, 220, 135, 50);
		add(btnMoveDown);
		btnMoveDown.addActionListener(new MoveDownController(application));
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(20, 270, 135, 50);
		add(btnRemove);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(20, 500, 135, 40);
		btnBack.addActionListener(new ToMainScreenController(application));
		add(btnBack);
		int x = 200;
		for (int i = 0; i < 10; i++)
		{
			String name="";
			JLabel label = new JLabel( (i+ 1) + "");
			label.setBounds(x, 80 +(35 *i) + 40, 180, 30);
			add(label);

			if (application.levelData.size() < (i+10))
				name="";
			else
				name = application.levelData.get(i+10).getLevelConfig().getName();
			application.levelButtons.add(new JButton(name) );

			
			application.levelButtons.get(i).setBounds(x + 25, 80 +(35 *i) + 40, 180, 30);
			application.levelButtons.get(i).setOpaque(true);
			add(application.levelButtons.get(i));
			application.levelButtons.get(i).addActionListener(new SelectManageLevelController(i, application));
			
		}
		
		for (int i = 0; i < 10; i++)
		{
			String name="";
			JLabel label = new JLabel( 10 +(i+ 1) + "");
			label.setBounds(420, 80 +(35 *i) + 40, 180, 30);
			add(label);
			if (application.levelData.size() < (i+10))
				name="";
			else
				name = application.levelData.get(i+10).getLevelConfig().getName();
			application.levelButtons.add(new JButton(name) );
			application.levelButtons.get( (10 + i)).setBounds(420 + 25, 80 +(35 *i) + 40, 180, 30);
			application.levelButtons.get( (10 + i)).setOpaque(true);
			add(application.levelButtons.get( (10 + i)));
			application.levelButtons.get( (10 + i)).addActionListener(new SelectManageLevelController(i+10, application));
			
		}
		
	}
	


	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);
	}
}

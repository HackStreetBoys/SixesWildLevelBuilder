package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.SavedLevelData;
import hackstreet.levelbuilder.controller.RemoveLevelController;
import hackstreet.levelbuilder.controller.SelectManageLevelController;
import hackstreet.levelbuilder.controller.ToMainScreenSaveManifestController;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.lang.reflect.Type;
import java.util.ArrayList;

import hackstreet.levelbuilder.controller.SelectManageLevelController;
import hackstreet.levelbuilder.controller.manager.AssignLevelController;
import hackstreet.levelbuilder.controller.manager.MoveDownController;
import hackstreet.levelbuilder.controller.manager.MoveUpController;
import hackstreet.levelbuilder.controller.transport.ToMainScreenController;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;


/**
 * Level Management Screen which lows list of levels and lets user add, remove or reorder levels.
 * @author Himanshu, Ben
 */

@SuppressWarnings("serial")
public class LevelManagerScreen extends AbstractScreen{
	public LevelManagerScreen(LevelBuilderApplication application) {
		
		super(application, "Level Manager Screen");
		
		setLayout(null);			
		/* Setup functionality buttons*/
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
		btnRemove.addActionListener(new RemoveLevelController(application));
		add(btnRemove);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(20, 500, 135, 40);
		
		btnBack.addActionListener(new ToMainScreenSaveManifestController(application));
		add(btnBack);
		int x = 200;
		if (application.levelData == null)
			application.levelData = new ArrayList<SavedLevelData>();
//		System.out.println(application.levelData.size());
		for (int i = 0; i < 10; i++)
		{
			//Build the first column of buttons in the level manager
			String name="";
			JLabel label = new JLabel( (i+ 1) + "");
			label.setBounds(x, 80 +(35 *i) + 40, 180, 30);
			add(label);

			if (application.levelData.size() < i+1)
				name="";
			else
				name = application.levelData.get(i).getLevelConfig().getFile().toString();
			application.levelButtons.add(new JButton(name) );

			
			application.levelButtons.get(i).setBounds(x + 25, 80 +(35 *i) + 40, 180, 30);
			application.levelButtons.get(i).setOpaque(true);
			add(application.levelButtons.get(i));
			application.levelButtons.get(i).addActionListener(new SelectManageLevelController(i, application));
			
		}
		
		for (int i = 0; i < 10; i++)
		{
			//Build the second column of buttons in the level manager
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

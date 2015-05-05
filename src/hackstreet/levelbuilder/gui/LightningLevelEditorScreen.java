package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.LightningLevelConfig;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LightningLevelEditorScreen extends AbstractLevelEditorScreen {

	private JTextField txtTimeLimit;
	
	public LightningLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		
		if (application.model.getLevelConfig() == null)
		{
			application.model.setLevelConfig(new LightningLevelConfig(60));
		}
		
		txtTimeLimit = new JTextField();
		txtTimeLimit.setText("Time limit (seconds)");
		txtTimeLimit.setBounds(20, 82, 134, 28);
		add(txtTimeLimit);
		txtTimeLimit.setColumns(10);
		
		application.model.setLevelConfig(application.model.getLevelConfig());
	}	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);	
	}
}

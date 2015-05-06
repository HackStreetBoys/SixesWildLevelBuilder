package hackstreet.levelbuilder.gui.editor;

import hackstreet.levelbuilder.config.EliminationLevelConfig;
import hackstreet.levelbuilder.config.LightningLevelConfig;
import hackstreet.levelbuilder.controller.ChangeTimeLimitController;
import hackstreet.levelbuilder.controller.LevelTypeComboController;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.TextFieldUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JTextField;
/**
 *  Class for editing levels of lightning type.
 * 
 * @author Pat, Himanshu, Ben
 *
 */
@SuppressWarnings("serial")
public class LightningLevelEditorScreen extends AbstractLevelEditorScreen {

	private JTextField txtTimeLimit;
	
	public LightningLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		this.initialize(application);
	}
	
	public LightningLevelEditorScreen(LevelBuilderApplication application, AbstractLevelEditorScreen editor){
		super(application,editor);
		this.initialize(application);
		this.levelList.setSelectedIndex(2);
		
		
	}
	
	public void initialize(LevelBuilderApplication application) {
		
		if (application.model.getLevelConfig() == null)
		{
			application.model.setLevelConfig(new LightningLevelConfig(60));
		}
		
		
		txtTimeLimit = new JTextField();
		txtTimeLimit.setUI(new TextFieldUI("Time limit (seconds)",new Color(100,100,100)));
		txtTimeLimit.setBounds(20, 82, 134, 28);
		txtTimeLimit.setColumns(10);
		LightningLevelConfig lvlc = (LightningLevelConfig) application.model.getLevelConfig();
		txtTimeLimit.setText(lvlc.getSeconds()+"");
		txtTimeLimit.addKeyListener(new ChangeTimeLimitController(application));
		add(txtTimeLimit);
		
		application.model.setLevelConfig(application.model.getLevelConfig());
		super.slider_6.setEnabled(true);
		levelList.addItemListener(new LevelTypeComboController(application));
	}	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);	
	}
}

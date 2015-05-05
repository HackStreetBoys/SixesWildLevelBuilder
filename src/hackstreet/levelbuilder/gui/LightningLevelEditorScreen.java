package hackstreet.levelbuilder.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LightningLevelEditorScreen extends AbstractLevelEditorScreen {

	public LightningLevelEditorScreen(LevelBuilderApplication application) {
		super(application);
		JLabel lblSeconds = new JLabel("Time limit (in seconds)");
		lblSeconds.setBounds(642, 100, 134, 28);
		add(lblSeconds);
	}	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);	
	}
}

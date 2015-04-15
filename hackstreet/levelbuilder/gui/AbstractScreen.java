package hackstreet.levelbuilder.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class AbstractScreen extends JPanel{

	private LevelBuilderApplication application;
	private JLabel title;
	
	public AbstractScreen(LevelBuilderApplication application, String title){
		this.application = application;
		
		super.setLayout(null);
		
		this.title = new JLabel(title);
		this.title.setSize(300,100);
		this.title.setLocation(250,0);
		this.title.setBackground(new Color(0,0,0,0));
		super.add(this.title);
	}
	
	public LevelBuilderApplication getApplication(){
		return this.application;
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawRect(this.title.getX(), this.title.getY(), this.title.getWidth(), this.title.getHeight());
	}
}

package hackstreet.levelbuilder.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
/**
 * Superclass for all screens used in the game.
 * 
 * @author Pat, Tim, Nick
 *
 */
public abstract class AbstractScreen extends JPanel{

	/** All screens have access to the application */
	protected LevelBuilderApplication application;
	
	
	/** All screens have a title that is displayed on the top of the screen */
	private JLabel title;
	
	public AbstractScreen(LevelBuilderApplication application, String title){
		this.application = application;
		
		super.setLayout(null);
		super.setBackground(Color.white); //TODO
		
		this.title = new JLabel(title);
		this.title.setSize(200,75);
		this.title.setLocation(300,0);
		this.title.setHorizontalAlignment(SwingConstants.CENTER);
		this.title.setFont(new Font("Serif",Font.BOLD,48));
		this.setupFont();
		this.title.setBackground(new Color(0,0,0,0));
		super.add(this.title);
	}
	
	public LevelBuilderApplication getApplication(){
		return this.application;
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
	}
	
	private void setupFont(){
		Font titleFont = this.title.getFont();
		String titleText = this.title.getText();

		int stringWidth = this.title.getFontMetrics(titleFont).stringWidth(titleText);
		int componentWidth = this.title.getWidth();

		// Find out how much the font can grow in width.
		double widthRatio = (double)componentWidth / (double)stringWidth;

		int newFontSize = (int)(titleFont.getSize() * widthRatio);
		int componentHeight = this.title.getHeight();

		// Pick a new font size so it will not be larger than the height of this.title.
		int fontSizeToUse = Math.min(newFontSize, componentHeight);

		// Set the this.title's font size to the newly determined size.
		this.title.setFont(new Font(titleFont.getName(), Font.PLAIN, fontSizeToUse));
	}
}

package hackstreet.levelbuilder.gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
/**
 * Screen for generating a random board to display current settings in level builder.
 * 
 * @author Pat
 *
 */
public class PassiveGameScreen extends JPanel {

	private GridView gridView;
	
	public PassiveGameScreen(LevelBuilderApplication application) {
		this.gridView = new GridView(application);		
		super.setLayout(new GridLayout(1,1));
		super.add(this.gridView,new Dimension(1,1));
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}
	
	public GridView getGridView(){
		return this.gridView;
	}
}
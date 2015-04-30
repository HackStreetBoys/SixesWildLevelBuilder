package hackstreet.levelbuilder.gui;

/**
 * @author Himanshu
 */

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.config.Slot;
import hackstreet.levelbuilder.config.Tile;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GridView extends JPanel {

	List<PassiveSlotView> slotList;
	
	public GridView(LevelBuilderApplication application){
		super.setLayout(new GridLayout(9,9));
		super.setBackground(new Color(0,0,0,0));

		AbstractLevelConfig config = application.getModel().getLevelConfig();
		double f1 = config.getFreq1();
		double f2 = config.getFreq2();
		double f3 = config.getFreq3();
		double f4 = config.getFreq4();
		double f5 = config.getFreq5();
		
		System.out.println(f1+","+f2+","+f3+","+f4+","+f5);
		for(int y=0; y<9; y++){
			for(int x=0; x<9; x++){
				double rand = Math.random();
				Tile tile = null;
				if(rand<f1)
					tile = new Tile(1,1);
				else if(rand<f1+f2)
					tile = new Tile(2,1);
				else if(rand<f1+f2+f3)
					tile = new Tile(3,1);
				else if(rand<f1+f2+f3+f4)
					tile = new Tile(4,1);
				else if(rand<f1+f2+f3+f4+f5)
					tile = new Tile(5,1);
				else
					tile = new Tile(6,1);
				
				Slot slot = new Slot(new Location(x,y));
				slot.setTile(tile);
				PassiveSlotView slotView = new PassiveSlotView(application,slot);
				super.add(slotView, new Dimension(x,y));
			}
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawRect(1,1,super.getWidth()-3,super.getHeight()-3);
	}
}

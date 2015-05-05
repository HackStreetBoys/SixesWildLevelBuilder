package hackstreet.levelbuilder.gui;

/**
 * @author Himanshu
 */

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.InertSlot;
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
		List<Location> inertSlots = config.getNullLocations();
		double f1 = config.getFreq1()*100;
		double f2 = config.getFreq2()*100;
		double f3 = config.getFreq3()*100;
		double f4 = config.getFreq4()*100;
		double f5 = config.getFreq5()*100;
		double fMult1 = config.getFreqMult1();
		double fMult2 = config.getFreqMult2();
//		double fMult3 = config.getFreqMult3()*100;
		
		int value; //Frequency of tile values
		int mult; //Frequency of tile multipliers
		
		for(int x=0; x<9; x++){
			for(int y=0; y<9; y++){
				double rand = Math.random();
				Tile tile = null;
				if(rand<f1)
					value = 1;
				else if(rand<f1+f2)
					value = 2;
				else if(rand<f1+f2+f3)
					value = 3;
				else if(rand<f1+f2+f3+f4)
					value = 4;
				else if(rand<f1+f2+f3+f4+f5)
					value = 5;
				else
					value = 6;

				double rand2 = Math.random();
				
				if(rand2<fMult1)
					mult = 1;
				else if(rand2<fMult1+fMult2)
					mult = 2;
				else 
					mult = 3;
				
				tile = new Tile(value, mult);
				
				Location loc = new Location(x,y);
				Slot slot = null;
				if(inertSlots.contains(loc)){
					slot = new InertSlot(loc);
				}
				else{
					slot = new Slot(loc);
					slot.setTile(tile);
				}
				PassiveSlotView slotView = new PassiveSlotView(slot);
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

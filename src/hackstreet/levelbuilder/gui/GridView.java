package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.elements.BucketSlot;
import hackstreet.levelbuilder.elements.InertSlot;
import hackstreet.levelbuilder.elements.Location;
import hackstreet.levelbuilder.elements.Slot;
import hackstreet.levelbuilder.elements.Tile;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

@SuppressWarnings("serial")
/**
 * Panel that holds the game play board.
 * 
 * @author Pat, Himanshu
 *
 */
public class GridView extends JPanel {
	
	/** Views for all slots on board.*/
	List<PassiveSlotView> slotList;

	public GridView(LevelBuilderApplication application){
		super.setLayout(new GridLayout(9,9));
		super.setBackground(new Color(0,0,0,0));

		AbstractLevelConfig config = application.getModel().getLevelConfig();
		List<Location> bucketSlots = new ArrayList<Location>();
		List<Location> sixSlots = new ArrayList<Location>();
		if(config instanceof ReleaseLevelConfig){
			ReleaseLevelConfig rConfig = (ReleaseLevelConfig)config;
			bucketSlots = rConfig.getBucketLocations();
			sixSlots = rConfig.getSixLocations();
		}
		List<Location> inertSlots = config.getNullLocations();
		double f1 = config.getFreq1();
		double f2 = config.getFreq2();
		double f3 = config.getFreq3();
		double f4 = config.getFreq4();
		double f5 = config.getFreq5();
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

				Location loc = new Location(x,y);
				if(sixSlots.contains(loc))
					value = 6;
				
				tile = new Tile(value, mult);
				
				Slot slot = null;
				if(inertSlots.contains(loc)){
					slot = new InertSlot(loc);
				}
				else if(bucketSlots.contains(loc)){
					slot = new BucketSlot(loc);
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

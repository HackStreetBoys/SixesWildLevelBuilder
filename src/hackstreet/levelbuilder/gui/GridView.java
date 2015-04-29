package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.config.PassiveSlotView;
import hackstreet.levelbuilder.config.Slot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GridView extends JPanel {

	List<PassiveSlotView> slotList;
	
	public GridView(LevelBuilderApplication application){
		super.setLayout(new GridLayout(9,9));
		super.setBackground(new Color(0,0,0,0));
		
		this.slotList = new ArrayList<PassiveSlotView>();
		
		for(int y=0; y<9; y++){
			for(int x=0; x<9; x++){
//				JButton button = new JButton();
//				super.add(button, new Dimension(x,y));
				Location loc = new Location(x,y);
				Slot slot = application.getModel().getActiveLevel().getBoard().get(loc);
				PassiveSlotView slotView = new PassiveSlotView(application,slot);
				this.slotList.add(slotView);
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

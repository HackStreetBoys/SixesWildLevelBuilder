package hackstreet.levelbuilder.config;


import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.PassiveTileView;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PassiveSlotView extends JPanel{

	private LevelBuilderApplication application;
	private Slot slot;
	private PassiveTileView tileView;

	public PassiveSlotView(LevelBuilderApplication application, Slot slot){
		this.application = application;
		this.slot = slot;
		super.setLayout(null);
		super.setBackground(new Color(0,0,0,0));

		refreshTileView();
	}

	public void refreshTileView(){
		if(slot.getTile() == null)
			return;
		this.tileView = new PassiveTileView(application,slot,slot.getTile());
		this.tileView.setSize(48,48);
		this.tileView.setLocation(1,1);
		super.removeAll();
		super.add(tileView);
	}

	public Location getLoc(){
		return this.slot.getLoc();
	}

	@Override
	public void paintComponent(Graphics g){
		if(tileView!=null)
			this.tileView.setSelected(this.application.getModel().getActiveLevel().getSelectedSlots().contains(this.slot));
		super.paintComponent(g);
		g.setColor(Color.black);
		HashMap<Location,Slot> board = application.getModel().getActiveLevel().getBoard();
		Slot up = board.get(this.slot.getLoc().pullNearbyLocation(0,-1));
		Slot right = board.get(this.slot.getLoc().pullNearbyLocation(1,0));
		Slot down = board.get(this.slot.getLoc().pullNearbyLocation(0,1));
		Slot left = board.get(this.slot.getLoc().pullNearbyLocation(-1,0));
		if(tileView==null){
			if(up != null && !(up instanceof InertSlot))
				g.drawLine(0, 0, super.getWidth()-1, 0);
			if(right != null && !(right instanceof InertSlot))
				g.drawLine(super.getWidth()-1, 0, super.getWidth()-1, super.getHeight()-1);
			if(down != null && !(down instanceof InertSlot))
				g.drawLine(0, super.getHeight()-1, super.getWidth()-1, super.getHeight()-1);
			if(left != null && !(left instanceof InertSlot))
				g.drawLine(0, 0, 0, super.getHeight()-1);
		}
		else
			g.drawRect(0,0, super.getWidth()-1, super.getHeight()-1);
	}

	public boolean equals(Object o){
		if(o instanceof PassiveSlotView){
			PassiveSlotView other = (PassiveSlotView)o;
			return other.slot.equals(this.slot);
		}
		return false;

	}
}

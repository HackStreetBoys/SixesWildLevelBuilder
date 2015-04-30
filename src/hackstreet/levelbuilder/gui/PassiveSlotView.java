package hackstreet.levelbuilder.gui;


import hackstreet.levelbuilder.config.InertSlot;
import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.config.Slot;

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
		this.tileView = new PassiveTileView(slot.getTile());
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
		super.paintComponent(g);
		g.setColor(Color.black);
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

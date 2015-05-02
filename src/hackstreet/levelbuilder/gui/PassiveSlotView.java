package hackstreet.levelbuilder.gui;

/**
 * @author Himanshu
 */

import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.config.Slot;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PassiveSlotView extends JPanel{

	private Slot slot;
	private PassiveTileView tileView;

	public PassiveSlotView(Slot slot){
		this.slot = slot;
		this.setLayout(null);
		super.setBackground(new Color(0,0,0,0));

		refreshTileView();
	}

	public void refreshTileView(){
		if(slot.getTile() == null)
			return;
		this.tileView = new PassiveTileView(slot.getTile());
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
		if(this.tileView != null){
			this.tileView.setLocation(0,0);
			this.tileView.setSize(super.getSize());
		}
	}

	public boolean equals(Object o){
		if(o instanceof PassiveSlotView){
			PassiveSlotView other = (PassiveSlotView)o;
			return other.slot.equals(this.slot);
		}
		return false;

	}
}

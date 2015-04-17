package hackstreet.levelbuilder.gui;
import hackstreet.levelbuilder.controller.ToMainScreenController;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JLabel;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public abstract class AbstractLevelEditorScreen extends AbstractScreen implements ItemListener{
	
	Boolean saved;

	public AbstractLevelEditorScreen(LevelBuilderApplication application) {
		super(application, "Level Editor");
		saved = false;
		setLayout(null);
		
		JCheckBox chckbxSwitchTiles = new JCheckBox("Switch Tiles");
		chckbxSwitchTiles.setBounds(642, 249, 128, 23);
		add(chckbxSwitchTiles);
		chckbxSwitchTiles.addItemListener(this);
		
		JCheckBox chckbxResetBoard = new JCheckBox("Reset Board");
		chckbxResetBoard.setBounds(642, 284, 128, 23);
		add(chckbxResetBoard);
		
		JCheckBox chckbxAi = new JCheckBox("AI");
		chckbxAi.setBounds(642, 319, 128, 23);
		add(chckbxAi);
		
		JCheckBox chckbxRemoveTile = new JCheckBox("Remove TIle");
		chckbxRemoveTile.setBounds(642, 354, 128, 23);
		add(chckbxRemoveTile);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(17, 548, 117, 29);
		add(btnBack);
		btnBack.addActionListener(new ToMainScreenController(super.getApplication()));
		
		JSlider slider = new JSlider();
		slider.setBounds(40, 200, 100, 20);
		add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(40, 230, 100, 20);
		add(slider_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setBounds(40, 260, 100, 20);
		add(slider_2);
		
		JSlider slider_3 = new JSlider();
		slider_3.setBounds(40, 290, 100, 20);
		add(slider_3);
		
		JSlider slider_4 = new JSlider();
		slider_4.setBounds(40, 320, 100, 20);
		add(slider_4);
		
		JSlider slider_5 = new JSlider();
		slider_5.setBounds(40, 350, 100, 20);
		add(slider_5);
		
		JLabel label = new JLabel("1");
		label.setBounds(20, 200, 18, 16);
		add(label);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(20, 230, 18, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(20, 260, 18, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(20, 290, 18, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBounds(20, 320, 18, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setBounds(20, 350, 18, 16);
		add(label_5);
		
		String[] levelStrings = { "Puzzle", "Elimination", "Lightning", "Release" };
		JComboBox levelList = new JComboBox(levelStrings);
		levelList.setSelectedIndex(0);
		levelList.setBounds(40, 40, 120, 30);
		add(levelList);
		

	}
	public void itemStateChanged(ItemEvent e) {
	    saved = false;
	}
}

package hackstreet.levelbuilder.gui;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.Location;
import hackstreet.levelbuilder.config.PuzzleLevelConfig;
import hackstreet.levelbuilder.controller.ChangeSlotTypeController;
import hackstreet.levelbuilder.controller.LevelTypeComboController;
import hackstreet.levelbuilder.controller.PreviewButtonController;
import hackstreet.levelbuilder.controller.SaveButtonController;
import hackstreet.levelbuilder.controller.SliderController;
import hackstreet.levelbuilder.controller.ToMainScreenController;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public abstract class AbstractLevelEditorScreen extends AbstractScreen{
	private JTextField txtAllowedMoves;
	private JTextField txtLevelname;
	JSlider slider_1;
	JSlider slider_2;
	JSlider slider_3;
	JSlider slider_4;
	JSlider slider_5;
	JSlider slider_6;
	public AbstractLevelConfig level;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AbstractLevelEditorScreen(LevelBuilderApplication application) {
		super(application, "Level Editor");
		
		setLayout(null);
		
		JCheckBox chckbxSwitchTiles = new JCheckBox("Switch Tiles");
		chckbxSwitchTiles.setBounds(642, 249, 128, 23);
		chckbxSwitchTiles.setBackground(new Color(0,0,0,0));
		add(chckbxSwitchTiles);
		
		JCheckBox chckbxResetBoard = new JCheckBox("Reset Board");
		chckbxResetBoard.setBounds(642, 284, 128, 23);
		chckbxResetBoard.setBackground(new Color(0,0,0,0));
		add(chckbxResetBoard);
		
		JCheckBox chckbxAI = new JCheckBox("AI");
		chckbxAI.setBounds(642, 319, 128, 23);
		chckbxAI.setBackground(new Color(0,0,0,0));
		add(chckbxAI);
		
		JCheckBox chckbxRemoveTile = new JCheckBox("Remove Tile");
		chckbxRemoveTile.setBounds(642, 354, 128, 23);
		chckbxRemoveTile.setBackground(new Color(0,0,0,0));
		add(chckbxRemoveTile);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(30, 500, 100, 50);
		add(btnBack);
		btnBack.addActionListener(new ToMainScreenController(super.getApplication()));
		
		slider_1 = new JSlider();
		slider_1.setMaximum(100);
		slider_1.setMinimum(0);
		slider_1.setBounds(40, 200, 100, 20);
		slider_1.addChangeListener(new SliderController(application,1));
		add(slider_1);
		
		slider_2 = new JSlider();
		slider_2.setMaximum(100);
		slider_2.setMinimum(0);
		slider_2.setBounds(40, 230, 100, 20);
		slider_2.addChangeListener(new SliderController(application,2));
		add(slider_2);
		
		slider_3 = new JSlider();
		slider_3.setMaximum(100);
		slider_3.setMinimum(0);
		slider_3.setBounds(40, 260, 100, 20);
		slider_3.addChangeListener(new SliderController(application,3));
		add(slider_3);
		
		slider_4 = new JSlider();
		slider_4.setMaximum(100);
		slider_4.setMinimum(0);
		slider_4.setBounds(40, 290, 100, 20);
		slider_4.addChangeListener(new SliderController(application,4));
		add(slider_4);
		
		slider_5 = new JSlider();
		slider_5.setMaximum(100);
		slider_5.setMinimum(0);
		slider_5.setBounds(40, 320, 100, 20);
		slider_5.addChangeListener(new SliderController(application,5));
		add(slider_5);
		
		slider_6 = new JSlider();
		slider_6.setMaximum(100);
		slider_6.setMinimum(0);
		slider_6.setBounds(40, 350, 100, 20);
		slider_6.addChangeListener(new SliderController(application,6));
		add(slider_6);
		
		JLabel label_1 = new JLabel("1");
		label_1.setBounds(20, 200, 18, 16);
		add(label_1);
		
		JLabel label_2 = new JLabel("2");
		label_2.setBounds(20, 230, 18, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("3");
		label_3.setBounds(20, 260, 18, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("4");
		label_4.setBounds(20, 290, 18, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("5");
		label_5.setBounds(20, 320, 18, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("6");
		label_6.setBounds(20, 350, 18, 16);
		add(label_6);
		
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(9,9));
		grid.setBounds(250,100,300,300);
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				JButton button = new JButton("");
				button.setBackground(Color.LIGHT_GRAY);
				button.addActionListener(new ChangeSlotTypeController(super.getApplication(),new Location(x,y)));
				grid.add(button,new Dimension(x,y));
			}
			
		}
		add(grid);
		
		String[] levelStrings = { "Puzzle", "Elimination", "Lightning", "Release" };
		JComboBox levelList = new JComboBox(levelStrings);
		levelList.setSelectedIndex(0);
		levelList.setBounds(17, 50, 120, 30);
		levelList.addActionListener(new LevelTypeComboController(super.getApplication()));
		add(levelList);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.setBounds(670, 500, 100, 50);
		btnPreview.addActionListener(new PreviewButtonController(application));
		add(btnPreview);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.setBounds(300, 520, 80, 30);
		add(btnNewButton);
		btnNewButton.addActionListener(new SaveButtonController(super.getApplication().model));
		
		txtAllowedMoves = new JTextField();
		txtAllowedMoves.setText("# Allowed moves");
		txtAllowedMoves.setBounds(20, 82, 134, 28);
		add(txtAllowedMoves);
		txtAllowedMoves.setColumns(10);
		
		JLabel lblTileFrequnecy = new JLabel("Tile frequency");
		lblTileFrequnecy.setBounds(17, 172, 117, 16);
		add(lblTileFrequnecy);
		
		txtLevelname = new JTextField();
		txtLevelname.setText("Set level name");
		txtLevelname.setBounds(636, 67, 134, 28);
		add(txtLevelname);
		txtLevelname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name of level");
		lblNewLabel.setBounds(642, 39, 128, 16);
		add(lblNewLabel);
		
		JButton button = new JButton("undo");
		button.setBounds(390, 520, 80, 30);
		add(button);
		
		JButton btnRedo = new JButton("redo");
		btnRedo.setBounds(480, 520, 80, 30);
		add(btnRedo);
		
		JLabel lblSpecialMovesToggle = new JLabel("Special moves");
		lblSpecialMovesToggle.setBounds(642, 221, 128, 16);
		add(lblSpecialMovesToggle);

		level = new PuzzleLevelConfig();
		
		
	}

	public int getSliderValue(int number){
		if(number==1)
			return slider_1.getValue();
		else if(number==2)
			return slider_2.getValue();
		else if(number==3)
			return slider_3.getValue();
		else if(number==4)
			return slider_4.getValue();
		else if(number==5)
			return slider_5.getValue();
		else
			return slider_6.getValue();
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);
		
	}
}

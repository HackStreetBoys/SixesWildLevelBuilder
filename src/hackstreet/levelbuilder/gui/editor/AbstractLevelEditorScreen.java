package hackstreet.levelbuilder.gui.editor;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.config.ReleaseLevelConfig;
import hackstreet.levelbuilder.controller.ChangeSlotTypeController;
import hackstreet.levelbuilder.controller.HintCheckController;
import hackstreet.levelbuilder.controller.LevelTypeComboController;
import hackstreet.levelbuilder.controller.MultiplierSliderController;
import hackstreet.levelbuilder.controller.PreviewButtonController;
import hackstreet.levelbuilder.controller.RemoveTileCheckController;
import hackstreet.levelbuilder.controller.SaveButtonController;
import hackstreet.levelbuilder.controller.FrequencySliderController;
import hackstreet.levelbuilder.controller.ShuffleBoardCheckController;
import hackstreet.levelbuilder.controller.StarUpdateController;
import hackstreet.levelbuilder.controller.SwapTilesCheckController;
import hackstreet.levelbuilder.controller.transport.ToMainScreenController;
import hackstreet.levelbuilder.elements.Location;
import hackstreet.levelbuilder.gui.AbstractScreen;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.TextFieldUI;

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
import java.util.ArrayList;

import javax.swing.JTextField;

/**
 * Superclass for level editing screens.
 * 
 * @author Pat, Himanshu, Ben
 *
 */
@SuppressWarnings("serial")
public abstract class AbstractLevelEditorScreen extends AbstractScreen{
	private JTextField star1;
	private JTextField star2;
	private JTextField star3;
	public JPanel grid;
	JSlider slider_1;
	JSlider slider_2;
	JSlider slider_3;
	JSlider slider_4;
	JSlider slider_5;
	JSlider slider_6;
	JSlider slider_mult1;
	JSlider slider_mult2;
	JSlider slider_mult3;
	@SuppressWarnings("rawtypes")
	JComboBox levelList;
	public AbstractLevelConfig level;


	private JCheckBox chckbxSwitchTiles;
	private JCheckBox chckbxResetBoard;
	private JCheckBox chckbxAI;
	private JCheckBox chckbxRemoveTile;
	
	public AbstractLevelEditorScreen(LevelBuilderApplication application, AbstractLevelEditorScreen other){
		super(application, "Level Editor");
		application.getModel().getLevelConfig().setNullLocations(application.model.getLevelConfig().getNullLocations());
		this.slider_1 = other.slider_1;
		this.slider_2 = other.slider_2;
		this.slider_3 = other.slider_3;
		this.slider_4 = other.slider_4;
		this.slider_5 = other.slider_5;
		this.slider_6 = other.slider_6;
		this.slider_mult1 = other.slider_mult1;
		this.slider_mult2 = other.slider_mult2;
		this.slider_mult3 = other.slider_mult3;
		this.chckbxSwitchTiles = other.chckbxSwitchTiles;
		this.chckbxResetBoard = other.chckbxResetBoard;
		this.chckbxAI = other.chckbxAI;
		this.chckbxRemoveTile = other.chckbxRemoveTile;
		this.levelList = other.levelList;
		this.star1 = other.star1;
		this.star2 = other.star2;
		this.star3 = other.star3;
		this.initializeConstantElements(application);
		this.addFieldsToContainer();
		
		slider_1.setValue( (int)(100*application.model.getLevelConfig().getFreq1()) );
		slider_2.setValue( (int)(100*application.model.getLevelConfig().getFreq2()) );
		slider_3.setValue( (int)(100*application.model.getLevelConfig().getFreq3()) );
		slider_4.setValue( (int)(100*application.model.getLevelConfig().getFreq4()) );
		slider_5.setValue( (int)(100*application.model.getLevelConfig().getFreq5()) );
		slider_6.setValue( (int)(100*application.model.getLevelConfig().getFreq6()) );

		
		
	}

	public AbstractLevelEditorScreen(LevelBuilderApplication application) {
		super(application, "Level Editor");
		
		setLayout(null);
		this.initializeFields(application);
		this.initializeConstantElements(application);
		this.addFieldsToContainer();
		
		
		
		slider_1.setValue( (int)(100*application.model.getLevelConfig().getFreq1()) );
		slider_2.setValue( (int)(100*application.model.getLevelConfig().getFreq2()) );
		slider_3.setValue( (int)(100*application.model.getLevelConfig().getFreq3()) );
		slider_4.setValue( (int)(100*application.model.getLevelConfig().getFreq4()) );
		slider_5.setValue( (int)(100*application.model.getLevelConfig().getFreq5()) );
		slider_6.setValue( (int)(100*application.model.getLevelConfig().getFreq6()) );



	}
	
	private void initializeConstantElements(LevelBuilderApplication application){
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(30, 500, 100, 50);
		btnBack.addActionListener(new ToMainScreenController(super.getApplication()));
		add(btnBack);

		JLabel label_1 = new JLabel("1");
		label_1.setBounds(20, 150, 18, 16);
		add(label_1);

		JLabel label_2 = new JLabel("2");
		label_2.setBounds(20, 180, 18, 16);
		add(label_2);

		JLabel label_3 = new JLabel("3");
		label_3.setBounds(20, 210, 18, 16);
		add(label_3);

		JLabel label_4 = new JLabel("4");
		label_4.setBounds(20, 240, 18, 16);
		add(label_4);

		JLabel label_5 = new JLabel("5");
		label_5.setBounds(20, 270, 18, 16);
		add(label_5);

		JLabel label_6 = new JLabel("6");
		label_6.setBounds(20, 300, 18, 16);
		add(label_6);

		JLabel label_mult1 = new JLabel("1");
		label_mult1.setBounds(20, 350, 18, 16);
		add(label_mult1);

		JLabel label_mult2 = new JLabel("2");
		label_mult2.setBounds(20, 380, 18, 16);
		add(label_mult2);

		JLabel label_mult3 = new JLabel("3");
		label_mult3.setBounds(20, 410, 18, 16);
		add(label_mult3);

		grid = new JPanel();
		grid.setLayout(new GridLayout(9,9));
		grid.setBounds(250,100,300,300);
		for(int x=0;x<9;x++){
			for(int y=0;y<9;y++){
				JButton button = new JButton("");
				button.setBackground(Color.LIGHT_GRAY);
				if (application.model.getLevelConfig().getType()=="Release")
				{
					ReleaseLevelConfig rlc = (ReleaseLevelConfig) application.model.getLevelConfig();
					
					if (rlc.getBucketLocations().contains(new Location(x,y)))
						button.setBackground(Color.GREEN);
					
					if (rlc.getSixLocations().contains(new Location(x,y)))
						button.setBackground(Color.PINK);
					
				}
				
				if (application.model.getLevelConfig().getNullLocations().contains(new Location( x,y )))
					button.setBackground(Color.black);
					
				button.addActionListener(new ChangeSlotTypeController(super.getApplication(),new Location(x,y)));
				grid.add(button,new Dimension(x,y));
			}

		}
		add(grid);

		JButton btnPreview = new JButton("Preview");
		btnPreview.setBounds(670, 500, 100, 50);
		btnPreview.addActionListener(new PreviewButtonController(application));
		add(btnPreview);

		JButton btnNewButton = new JButton("save");
		btnNewButton.setBounds(300, 520, 80, 30);
		add(btnNewButton);
		btnNewButton.addActionListener(new SaveButtonController(super.getApplication().model));

		JLabel lblTileFrequency = new JLabel("Tile frequency");
		lblTileFrequency.setBounds(17, 122, 117, 16);
		add(lblTileFrequency);

		JLabel lblMultiplierFrequency = new JLabel("Multiplier frequency");
		lblMultiplierFrequency.setBounds(17, 330, 117, 16);
		add(lblMultiplierFrequency);

		JLabel starPointsLabel = new JLabel("Star Points");
		starPointsLabel.setBounds(640, 25, 128, 15);
		add(starPointsLabel);

		JButton button = new JButton("undo");
		button.setBounds(390, 520, 80, 30);
		add(button);

		JButton btnRedo = new JButton("redo");
		btnRedo.setBounds(480, 520, 80, 30);
		add(btnRedo);

		JLabel lblSpecialMovesToggle = new JLabel("Special moves");
		lblSpecialMovesToggle.setBounds(642, 221, 128, 16);
		add(lblSpecialMovesToggle);	

		
if (application.model.getLevelConfig().getNumSwap()==1)
			
			chckbxSwitchTiles.setSelected(true);
		else
			chckbxSwitchTiles.setSelected(false);


if (application.model.getLevelConfig().getNumShuffle()==1)
	chckbxResetBoard.setSelected(true);
else
	chckbxResetBoard.setSelected(false);


if (application.model.getLevelConfig().getNumHint()==1)
	chckbxAI.setSelected(true);
else
	chckbxAI.setSelected(false);


if (application.model.getLevelConfig().getNumRemove()==1)
	chckbxRemoveTile.setSelected(true);
else
	chckbxRemoveTile.setSelected(false);
chckbxRemoveTile.addActionListener(new RemoveTileCheckController(application));

star1.setText(application.model.getLevelConfig().getPointsStar1()+"");
star2.setText(application.model.getLevelConfig().getPointsStar2()+"");
star3.setText(application.model.getLevelConfig().getPointsStar3()+"");



		
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initializeFields(LevelBuilderApplication application){
		
		chckbxSwitchTiles = new JCheckBox("Switch Tiles");
		chckbxSwitchTiles.setBounds(640, 249, 128, 23);
		chckbxSwitchTiles.setBackground(Color.white);
		
		chckbxSwitchTiles.addActionListener(new SwapTilesCheckController(application));

		chckbxResetBoard = new JCheckBox("Reset Board");
		chckbxResetBoard.setBounds(640, 284, 128, 23);
		chckbxResetBoard.setBackground(Color.white);

		chckbxResetBoard.addActionListener(new ShuffleBoardCheckController(application));


		chckbxAI = new JCheckBox("AI");
		chckbxAI.setBounds(640, 319, 128, 23);
		chckbxAI.setBackground(Color.white);

		chckbxAI.addActionListener(new HintCheckController(application));

		chckbxRemoveTile = new JCheckBox("Remove Tile");
		chckbxRemoveTile.setBounds(640, 354, 128, 23);
		chckbxRemoveTile.setBackground(Color.white);

		slider_1 = new JSlider();
		slider_1.setMaximum(100);
		slider_1.setMinimum(0);
		slider_1.setBounds(40, 150, 100, 20);
		slider_1.setValue((int) (100*application.model.getLevelConfig().getFreq1()));
		slider_1.addChangeListener(new FrequencySliderController(application,1));

		slider_2 = new JSlider();
		slider_2.setMaximum(100);
		slider_2.setMinimum(0);
		slider_2.setBounds(40, 180, 100, 20);
		slider_2.setValue((int) (100*application.model.getLevelConfig().getFreq2()));
		slider_2.addChangeListener(new FrequencySliderController(application,2));

		slider_3 = new JSlider();
		slider_3.setMaximum(100);
		slider_3.setMinimum(0);
		slider_3.setBounds(40, 210, 100, 20);
		slider_3.setValue((int) (100*application.model.getLevelConfig().getFreq3()));
		slider_3.addChangeListener(new FrequencySliderController(application,3));

		slider_4 = new JSlider();
		slider_4.setMaximum(100);
		slider_4.setMinimum(0);
		slider_4.setBounds(40, 240, 100, 20);
		slider_4.setValue((int) (100*application.model.getLevelConfig().getFreq4()));
		slider_4.addChangeListener(new FrequencySliderController(application,4));

		slider_5 = new JSlider();
		slider_5.setMaximum(100);
		slider_5.setMinimum(0);
		slider_5.setBounds(40, 270, 100, 20);
		slider_5.setValue((int) (100*application.model.getLevelConfig().getFreq5()));
		slider_5.addChangeListener(new FrequencySliderController(application,5));

		slider_6 = new JSlider();
		slider_6.setMaximum(100);
		slider_6.setMinimum(0);
		slider_6.setBounds(40, 300, 100, 20);
		slider_6.setValue((int) (100*application.model.getLevelConfig().getFreq6()));
		slider_6.addChangeListener(new FrequencySliderController(application,6));

		slider_mult1 = new JSlider();
		slider_mult1.setMaximum(100);
		slider_mult1.setMinimum(0);
		slider_mult1.setBounds(40, 350, 100, 20);
		slider_mult1.setValue((int) (100*application.model.getLevelConfig().getFreqMult1()));
		slider_mult1.addChangeListener(new MultiplierSliderController(application,1));

		slider_mult2 = new JSlider();
		slider_mult2.setMaximum(100);
		slider_mult2.setMinimum(0);
		slider_mult2.setBounds(40, 380, 100, 20);
		slider_mult2.setValue((int) (100*application.model.getLevelConfig().getFreqMult2()));
		slider_mult2.addChangeListener(new MultiplierSliderController(application,2));

		slider_mult3 = new JSlider();
		slider_mult3.setMaximum(100);
		slider_mult3.setMinimum(0);
		slider_mult3.setBounds(40, 410, 100, 20);
		slider_mult3.setValue((int) (100*application.model.getLevelConfig().getFreqMult3()));
		slider_mult3.addChangeListener(new MultiplierSliderController(application,3));
		
		String[] levelStrings = { "Puzzle", "Elimination", "Lightning", "Release" };
		levelList = new JComboBox(levelStrings);
		if(this instanceof EliminationLevelEditorScreen)
			levelList.setSelectedItem("Elimination");
		else if(this instanceof LightningLevelEditorScreen)
			levelList.setSelectedItem("Lightning");
		else if(this instanceof PuzzleLevelEditorScreen)
			levelList.setSelectedItem("Puzzle");
		else if(this instanceof ReleaseLevelEditorScreen)
		levelList.setSelectedItem("Release");
		levelList.setBounds(17, 50, 120, 30);

		levelList.setSelectedItem(application.model.getLevelConfig().getType());
		

		star1 = new JTextField();
		star1.setUI(new TextFieldUI("Star 1 Points",new Color(100,100,100)));
		star1.setBounds(640, 50, 80, 30);
		star1.setColumns(10);
		star1.setText(application.model.getLevelConfig().getPointsStar1()+"");
		star1.addKeyListener(new StarUpdateController(application,star1,1));
		
		
		star2 = new JTextField();
		star2.setUI(new TextFieldUI("Star 2 Points",new Color(100,100,100)));
		star2.setBounds(640, 90, 80, 30);
		star2.setColumns(10);
		star2.setText(application.model.getLevelConfig().getPointsStar2()+"");
		star2.addKeyListener(new StarUpdateController(application,star2,2));
		
		
		star3 = new JTextField();
		star3.setUI(new TextFieldUI("Star 3 Points",new Color(100,100,100)));
		star3.setBounds(640, 130, 80, 30);
		star3.setColumns(10);
		star3.setText(application.model.getLevelConfig().getPointsStar3()+"");
		star3.addKeyListener(new StarUpdateController(application,star3,3));
		
		
		
	}
	
	private void addFieldsToContainer(){
		add(chckbxRemoveTile);
		add(chckbxSwitchTiles);
		add(chckbxResetBoard);
		add(chckbxAI);
		add(slider_1);
		add(slider_2);
		add(slider_3);
		add(slider_4);
		add(slider_5);
		add(slider_6);
		add(slider_mult1);
		add(slider_mult2);
		add(slider_mult3);
		add(levelList);
		add(star1);
		add(star2);
		add(star3);
	}

	public int getFrequencySliderValue(int number){
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

	public int getMultiplierSliderValue(int number){
		if(number==1)
			return slider_mult1.getValue();
		else if(number==2)
			return slider_mult2.getValue();
		else 
			return slider_mult3.getValue();
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawLine(175,0,175,600);

	}
	
	public JCheckBox getChckbxSwitchTiles() {
		return chckbxSwitchTiles;
	}

	public JCheckBox getChckbxResetBoard() {
		return chckbxResetBoard;
	}

	public JCheckBox getChckbxAI() {
		return chckbxAI;
	}

	public JCheckBox getChckbxRemoveTile() {
		return chckbxRemoveTile;
	}
	

}
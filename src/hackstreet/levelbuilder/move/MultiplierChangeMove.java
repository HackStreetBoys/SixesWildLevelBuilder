package hackstreet.levelbuilder.move;

import javax.swing.JSlider;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
import hackstreet.levelbuilder.gui.editor.AbstractLevelEditorScreen;

public class MultiplierChangeMove implements IMove {

	LevelBuilderApplication application;
	int after;
	JSlider slider;
	int number;
	double freqMult1;
	double freqMult2;
	double freqMult3;
	double mult1Val;
	double mult2Val;
	double mult3Val;
	
	public MultiplierChangeMove(LevelBuilderApplication application, JSlider slider, int number){
		this.application = application;
		this.slider = slider;
		this.after = slider.getValue();
		this.number = number;
	}
	
	@Override
	public boolean doMove() {
		AbstractLevelEditorScreen screen = (AbstractLevelEditorScreen)application.getActiveScreen();
		this.mult1Val = screen.getMultiplierSliderValue(1);
		this.mult2Val = screen.getMultiplierSliderValue(2);
		this.mult3Val = screen.getMultiplierSliderValue(3);
		
		double total = mult1Val + mult2Val + mult3Val;
		this.freqMult1 = mult1Val/total;
		this.freqMult2 = mult2Val/total;
		this.freqMult3 = mult3Val/total;
		
		AbstractLevelConfig config = application.getModel().getLevelConfig();
		config.setFreqMult1(freqMult1);
		config.setFreqMult2(freqMult2);
		config.setFreqMult3(freqMult3);
		
		return false;
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
		return false;
	}

}

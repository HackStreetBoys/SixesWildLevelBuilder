package hackstreet.levelbuilder.move;

/**
 * @author Himanshu
 */

import javax.swing.JSlider;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.gui.AbstractLevelEditorScreen;
import hackstreet.levelbuilder.gui.LevelBuilderApplication;
public class FrequencyChangeMove implements IMove {

	LevelBuilderApplication application;
	int after;
	JSlider slider;
	int number;
	double freq1;
	double freq2;
	double freq3;
	double freq4;
	double freq5;
	double freq6;
	int val1;
	int val2;
	int val3;
	int val4;
	int val5;
	int val6;
	
	public FrequencyChangeMove(LevelBuilderApplication application, JSlider slider, int number){
		this.application = application;
		this.slider = slider;
		this.after = slider.getValue();
		this.number = number;
	}
	
	@Override
	public boolean doMove() {
		AbstractLevelEditorScreen screen = (AbstractLevelEditorScreen)application.getActiveScreen();
		this.val1 = screen.getFrequencySliderValue(1);
		this.val2 = screen.getFrequencySliderValue(2);
		this.val3 = screen.getFrequencySliderValue(3);
		this.val4 = screen.getFrequencySliderValue(4);
		this.val5 = screen.getFrequencySliderValue(5);
		this.val6 = screen.getFrequencySliderValue(6);
		
		double total = val1+val2+val3+val4+val5+val6;
		
		this.freq1 = val1/total;
		this.freq2 = val2/total;
		this.freq3 = val3/total;
		this.freq4 = val4/total;
		this.freq5 = val5/total;
		this.freq6 = val6/total;
		
		AbstractLevelConfig config = application.getModel().getLevelConfig();
		config.setFreq1(freq1);
		config.setFreq2(freq2);
		config.setFreq3(freq3);
		config.setFreq4(freq4);
		config.setFreq5(freq5);
		config.setFreq6(freq6);
		return true;
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
	
		return true;
	}

}

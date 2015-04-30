package hackstreet.levelbuilder.move;

/**
 * @author Himanshu
 */

import javax.swing.JSlider;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.main.SWLevelBuilder;

public class FrequencyChangeMove extends AbstractLevelConfig implements IMove {

	SWLevelBuilder model;
	int after;
	JSlider slider;
	int number;
	double freq1;
	double freq2;
	double freq3;
	double freq4;
	double freq5;
	double freq6;
	double totalFreq;
	double[] freqRatio;
	
	public FrequencyChangeMove(SWLevelBuilder model, JSlider slider, int number){
		this.model = model;	
		this.slider = slider;
		this.after = slider.getValue();
		this.number = number;
	}
	
	@Override
	public boolean doMove() {
		//Once, slider stops moving, update the value
		if(number == 1){
			totalFreq = after + this.model.getLevelConfig().getFreq2() + this.model.getLevelConfig().getFreq3() + this.model.getLevelConfig().getFreq4() + this.model.getLevelConfig().getFreq5() + this.model.getLevelConfig().getFreq6();  
			this.model.getLevelConfig().setTotalFreq(totalFreq);
			this.model.getLevelConfig().setFreq1(after/totalFreq);
			//Recalculate all frequencies. Used getValue1()
			return true;
		}
		else if(number == 2) {
			totalFreq = this.model.getLevelConfig().getFreq1() + after + this.model.getLevelConfig().getFreq3() + this.model.getLevelConfig().getFreq4() + this.model.getLevelConfig().getFreq5() + this.model.getLevelConfig().getFreq6();  
			this.model.getLevelConfig().setTotalFreq(totalFreq);
			this.model.getLevelConfig().setFreq2(after/totalFreq);
			return true;
		}
		else if(number == 3) {
			totalFreq = this.model.getLevelConfig().getFreq1() + this.model.getLevelConfig().getFreq2() + after + this.model.getLevelConfig().getFreq4() + this.model.getLevelConfig().getFreq5() + this.model.getLevelConfig().getFreq6();  
			this.model.getLevelConfig().setTotalFreq(totalFreq);
			this.model.getLevelConfig().setFreq3(after/totalFreq);
			return true;
		}
		else if(number == 4) {
			totalFreq = this.model.getLevelConfig().getFreq1() + this.model.getLevelConfig().getFreq2() + this.model.getLevelConfig().getFreq3() + after + this.model.getLevelConfig().getFreq5() + this.model.getLevelConfig().getFreq6();  
			this.model.getLevelConfig().setTotalFreq(totalFreq);
			this.model.getLevelConfig().setFreq4(after/totalFreq);
			return true;
		}
		else if(number == 5) {
			totalFreq = this.model.getLevelConfig().getFreq1() + this.model.getLevelConfig().getFreq2() + this.model.getLevelConfig().getFreq3() + this.model.getLevelConfig().getFreq4() + after + this.model.getLevelConfig().getFreq6();  
			this.model.getLevelConfig().setTotalFreq(totalFreq);
			this.model.getLevelConfig().setFreq5(after/totalFreq);
			return true;
		}
		else if(number == 6) {
			totalFreq = this.model.getLevelConfig().getFreq1() + this.model.getLevelConfig().getFreq2() + this.model.getLevelConfig().getFreq3() + this.model.getLevelConfig().getFreq4() + this.model.getLevelConfig().getFreq5() + after;  
			this.model.getLevelConfig().setTotalFreq(totalFreq);
			this.model.getLevelConfig().setFreq6(after/totalFreq);
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean undoMove() {
		// TODO Auto-generated method stub
	
		return true;
	}

}

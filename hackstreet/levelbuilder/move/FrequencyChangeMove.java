package hackstreet.levelbuilder.move;

import javax.swing.JSlider;

import hackstreet.levelbuilder.config.AbstractLevelConfig;
import hackstreet.levelbuilder.main.SWLevelBuilder;

public class FrequencyChangeMove extends AbstractLevelConfig implements IMove {

	SWLevelBuilder model;
	int before;
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
			this.model.getActiveLevel().setFreq1(after);
			totalFreq = this.model.getActiveLevel().getFreq1() + this.model.getActiveLevel().getFreq2() + this.model.getActiveLevel().getFreq3() + this.model.getActiveLevel().getFreq4() + this.model.getActiveLevel().getFreq5() + this.model.getActiveLevel().getFreq6();  
			this.model.getActiveLevel().setTotalFreq(totalFreq);
			return true;
		}
		else if(number == 2) {
			this.model.getActiveLevel().setFreq2(after);
			totalFreq = this.model.getActiveLevel().getFreq1() + this.model.getActiveLevel().getFreq2() + this.model.getActiveLevel().getFreq3() + this.model.getActiveLevel().getFreq4() + this.model.getActiveLevel().getFreq5() + this.model.getActiveLevel().getFreq6();  
			this.model.getActiveLevel().setTotalFreq(totalFreq);
			return true;
		}
		else if(number == 3) {
			this.model.getActiveLevel().setFreq3(after);
			totalFreq = this.model.getActiveLevel().getFreq1() + this.model.getActiveLevel().getFreq2() + this.model.getActiveLevel().getFreq3() + this.model.getActiveLevel().getFreq4() + this.model.getActiveLevel().getFreq5() + this.model.getActiveLevel().getFreq6();  
			this.model.getActiveLevel().setTotalFreq(totalFreq);
			return true;
		}
		else if(number == 4) {
			this.model.getActiveLevel().setFreq4(after);
			totalFreq = this.model.getActiveLevel().getFreq1() + this.model.getActiveLevel().getFreq2() + this.model.getActiveLevel().getFreq3() + this.model.getActiveLevel().getFreq4() + this.model.getActiveLevel().getFreq5() + this.model.getActiveLevel().getFreq6();  
			this.model.getActiveLevel().setTotalFreq(totalFreq);
			return true;
		}
		else if(number == 5) {
			this.model.getActiveLevel().setFreq5(after);
			totalFreq = this.model.getActiveLevel().getFreq1() + this.model.getActiveLevel().getFreq2() + this.model.getActiveLevel().getFreq3() + this.model.getActiveLevel().getFreq4() + this.model.getActiveLevel().getFreq5() + this.model.getActiveLevel().getFreq6();  
			this.model.getActiveLevel().setTotalFreq(totalFreq);
			return true;
		}
		else if(number == 6) {
			this.model.getActiveLevel().setFreq6(after);
			totalFreq = this.model.getActiveLevel().getFreq1() + this.model.getActiveLevel().getFreq2() + this.model.getActiveLevel().getFreq3() + this.model.getActiveLevel().getFreq4() + this.model.getActiveLevel().getFreq5() + this.model.getActiveLevel().getFreq6();  
			this.model.getActiveLevel().setTotalFreq(totalFreq);
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

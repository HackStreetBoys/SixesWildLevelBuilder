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
	double val1;
	double val2;
	double val3;
	double val4;
	double val5;
	double val6;
	double totalVal;
	
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
			System.out.print(after);
			val1 = model.getLevelConfig().getFreq1()*model.getLevelConfig().getTotalVal();
			val2 = model.getLevelConfig().getFreq2()*model.getLevelConfig().getTotalVal();
			val3 = model.getLevelConfig().getFreq3()*model.getLevelConfig().getTotalVal();
			val4 = model.getLevelConfig().getFreq4()*model.getLevelConfig().getTotalVal();
			val5 = model.getLevelConfig().getFreq5()*model.getLevelConfig().getTotalVal();
			val6 = model.getLevelConfig().getFreq6()*model.getLevelConfig().getTotalVal();
			totalVal = this.model.getLevelConfig().getTotalVal() - val1 + after;
			model.getLevelConfig().setTotalVal(totalVal);
			model.getLevelConfig().setFreq1(after/totalVal);
			model.getLevelConfig().setFreq2(val2/totalVal);
			model.getLevelConfig().setFreq3(val3/totalVal);
			model.getLevelConfig().setFreq4(val4/totalVal);
			model.getLevelConfig().setFreq5(val5/totalVal);
			model.getLevelConfig().setFreq6(val6/totalVal);
			return true;
		}
		else if(number == 2) {
			
			return true;
		}
		else if(number == 3) {
			
			return true;
		}
		else if(number == 4) {
			
			return true;
		}
		else if(number == 5) {
			return true;
		}
		else if(number == 6) {
		
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

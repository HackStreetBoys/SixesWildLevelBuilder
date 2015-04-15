package hackstreet.levelbuilder.config;

import java.util.ArrayList;

public abstract class AbstractLevelConfig{
	
	String name;
	int height;
	int width;
	ArrayList<Location> nullLocations;
	double[] percentage = new double[6];
	int numShuffle;
	int numSwap;
	int numRemove;
	int numHint;
	double freq1;
	double freq2;
	double freq3;
	double freq4;
	double freq5;
	double freq6;
	double freqMult2;
	double freqMult3;
	int pointsStar1;
	int pointsStar2;
	int pointsStar3;
	
	/**
	 * Empty constructor, for when the level type is unknown.
	 */
	public AbstractLevelConfig(){
		// empty
	}
	
	/**
	 * Overloaded copy constructor to be used when switching the level type,
	 * allowing the abstract class' data to transfer between child classes.
	 * @param levelConfig is the input file used to copy data.
	 */
	public AbstractLevelConfig(AbstractLevelConfig levelConfig){
		name = levelConfig.name;
		height = levelConfig.height;
		width = levelConfig.width;
		nullLocations = levelConfig.nullLocations;
		percentage = levelConfig.percentage;
		numShuffle = levelConfig.numShuffle;
		numSwap = levelConfig.numSwap;
		numRemove = levelConfig.numRemove;
		numHint = levelConfig.numHint;
		freq1 = levelConfig.freq1;
		freq2 = levelConfig.freq2;
		freq3 = levelConfig.freq3;
		freq4 = levelConfig.freq4;
		freq5 = levelConfig.freq5;
		freq6 = levelConfig.freq6;
		freqMult2 = levelConfig.freqMult2;
		freqMult3 = levelConfig.freqMult3;
		pointsStar1 = levelConfig.pointsStar1;
		pointsStar2 = levelConfig.pointsStar2;
		pointsStar3 = levelConfig.pointsStar3;
	}
	
}

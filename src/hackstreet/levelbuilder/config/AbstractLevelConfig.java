package hackstreet.levelbuilder.config;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

/**
 * @author Ben, Himanshu
 */

public abstract class AbstractLevelConfig{
	
	//!!!PROPERLY CALCULATE PERCENTAGE 
	
	protected String Type; // Added so that we can load files. It is protected b/c sub classes need to know this information;
	private String name;
	private int height;
	private int width;
	private ArrayList<Location> nullLocations;
	private ArrayList<Location> bucketLocations;
	private HashMap <Location, Slot> board;
	private double[] percentage = new double[6];
	private int numShuffle;
	private int numSwap;
	private int numRemove;
	private int numHint;
	private double totalVal;
//	private double value1;
//	private double value2;
//	private double value3;
//	private double value4;
//	private double value5;
//	private double value6;
	private double freq1;
	private double freq2;
	private double freq3;
	private double freq4;
	private double freq5;
	private double freq6;
	private double freqMult2;
	private double freqMult3;
	private int pointsStar1;
	private int pointsStar2;
	private int pointsStar3;
	public File File;
	
	/**
	 * Empty constructor, for when the level type is unknown.
	 */
	public AbstractLevelConfig(){
		// empty
		this.name = "New Level";
		this.height = this.width = 9;
		this.Type = "Puzzle";
		this.totalVal = 0;
		this.nullLocations = new ArrayList<Location>();
		this.bucketLocations = new ArrayList<Location>();
		this.freq1 = 0;
		this.freq2 = 0;
		this.freq3 = 0;
		this.freq4 = 0;
		this.freq5 = 0;
		this.freq6 = 0;
//		this.value1 = 0;
//		this.value2 = 0;
//		this.value3 = 0;
//		this.value4 = 0;
//		this.value5 = 0;
//		this.value6 = 0;
		this.freqMult2 = 0;
		this.freqMult3 = 0;
		this.pointsStar1 = 0;
		this.pointsStar2 = 0;
		this.pointsStar3 = 0;
	}
	
	/**
	 * Overloaded copy constructor to be used when switching the level type,
	 * allowing the abstract class' data to transfer between child classes.
	 * @param levelConfig is the input file used to copy data.
	 */
	public AbstractLevelConfig(AbstractLevelConfig levelConfig){
		Type = levelConfig.Type;
		name = levelConfig.name;
		height = levelConfig.height;
		width = levelConfig.width;
		nullLocations = levelConfig.nullLocations;
		bucketLocations = levelConfig.bucketLocations;
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
//		value1 = levelConfig.value1;
//		value2 = levelConfig.value2;
//		value3 = levelConfig.value3;
//		value4 = levelConfig.value4;
//		value5 = levelConfig.value5;
//		value6 = levelConfig.value6;
		totalVal = levelConfig.totalVal;
		freqMult2 = levelConfig.freqMult2;
		freqMult3 = levelConfig.freqMult3;
		pointsStar1 = levelConfig.pointsStar1;
		pointsStar2 = levelConfig.pointsStar2;
		pointsStar3 = levelConfig.pointsStar3;
		board = levelConfig.board;	
	}
	
	public int getNumShuffle() {
		return numShuffle;
	}
	
	public String getType()
	{
		return this.Type;
	}
	public void setNumShuffle(int numShuffle) {
		this.numShuffle = numShuffle;
	}

	public int getNumSwap() {
		return numSwap;
	}

	public void setNumSwap(int numSwap) {
		this.numSwap = numSwap;
	}
	
	public int getNumRemove() {
		return numRemove;
	}

	public void setNumRemove(int numRemove) {
		this.numRemove = numRemove;
	}

	public int getNumHint() {
		return numHint;
	}

	public void setNumHint(int numHint) {
		this.numHint = numHint;
	}

	public ArrayList<Location> getNullLocations(){
		return nullLocations;
	}
	
	public ArrayList<Location> getBucketLocations(){
		return bucketLocations;
	}
	

	public double getFreq1() {
		return freq1;	
	}
	
	public double getFreq2() {
		return freq2;	
	}
	
	public double getFreq3() {
		return freq3;	
	}
	
	public double getFreq4() {
		return freq4;	
	}
	
	public double getFreq5() {
		return freq5;	
	}
	
	public double getFreq6() {
		return freq6;	
	}
	
//	public double getValue1() {
//		return value1;	
//	}
//	public double getValue2() {
//		return value2;	
//	}
//	public double getValue3() {
//		return value3;	
//	}
//	public double getValue4() {
//		return value4;	
//	}
//	public double getValue5() {
//		return value5;	
//	}
//	public double getValue6() {
//		return value6;	
//	}
//	
	public void setFreq1(double freq1) {
		this.freq1 = freq1/100;
	}
	
	public void setFreq2(double freq2) {
		this.freq2 = freq2/100;
	}
	
	public void setFreq3(double freq3) {
		this.freq3 = freq3/100;
	}
	
	public void setFreq4(double freq4) {
		this.freq4 = freq4/100;
	}
	
	public void setFreq5(double freq5) {
		this.freq5 = freq5/100;
	}
	
	public void setFreq6(double freq6) {
		this.freq6 = freq6/100;
	}	

	public double getTotalVal() {
		return totalVal;
	}
	
	public void setTotalVal(double totalVal) {
		this.totalVal = totalVal;
	}
	
	public String getJSON()
	{

		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
	public int generateRandomMultiplier(){
		//	double mult2Freq = this.getSavedLevelData().getLevelConfig().getFreqMult2();
		//		double mult3Freq = this.getSavedLevelData().getLevelConfig().getFreqMult3();

		return 1;
	}
	
	public int generateRandomValue() {
		double r = Math.random();

		if (r < freq1)
			return 1;
		else if (r < freq1 + freq2)
			return 2;
		else if (r < freq1+freq2+freq3)
			return 3;
		else if (r < freq1+freq2+freq3+freq4)
			return 4;
		else if (r < freq1+freq2+freq3+freq4+freq5)
			return 5;
		else
			return 6;
	}
		
	public void setType(String type){
		this.Type = type;
	}
	
}

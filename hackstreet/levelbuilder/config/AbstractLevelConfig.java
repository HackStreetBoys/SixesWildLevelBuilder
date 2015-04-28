package hackstreet.levelbuilder.config;

import java.io.File;
import java.util.ArrayList;

import com.google.gson.Gson;
//author Ben Bianchi
public abstract class AbstractLevelConfig{
	
	protected String Type; // Added so that we can load files. It is protected b/c sub classes need to know this information;
	private String name;
	private int height;
	private int width;
	private ArrayList<Location> nullLocations;
	private double[] freqRatio = new double[6];
	private int numShuffle;
	private int numSwap;
	private int numRemove;
	private int numHint;
	private double totalFreq;
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
		freqRatio = levelConfig.freqRatio;
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
		totalFreq = levelConfig.totalFreq;
		freqMult2 = levelConfig.freqMult2;
		freqMult3 = levelConfig.freqMult3;
		pointsStar1 = levelConfig.pointsStar1;
		pointsStar2 = levelConfig.pointsStar2;
		pointsStar3 = levelConfig.pointsStar3;
		
		
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
	
	public void setFreq1(double freq1) {
		this.freq1 = freq1;
	}
	
	public void setFreq2(double freq2) {
		this.freq1 = freq2;
	}
	
	public void setFreq3(double freq3) {
		this.freq1 = freq3;
	}
	
	public void setFreq4(double freq4) {
		this.freq1 = freq4;
	}
	
	public void setFreq5(double freq5) {
		this.freq1 = freq5;
	}
	
	public void setFreq6(double freq6) {
		this.freq1 = freq6;
	}
	
	public double getTotalFreq() {
		return totalFreq;
	}
	
	public void setTotalFreq(double totalFreq) {
		this.totalFreq = totalFreq;
	}
	
	public String getJSON()
	{

		Gson gson = new Gson();
		return gson.toJson(this);
	}

}

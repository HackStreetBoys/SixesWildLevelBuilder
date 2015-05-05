package hackstreet.levelbuilder.config;

import hackstreet.levelbuilder.config.Location;

import java.io.File;
import java.util.ArrayList;

import javax.swing.Icon;

import com.google.gson.Gson;

/**
 * Storage for all of the information saved about a level in SixesWildLevelBuilder.
 * This class should be nearly identical to its twin in the LevelBuilder.
 * @author Himanshu, Pat, Nicholas
 *
 */
public class AbstractLevelConfig {

	protected String Type; // Added so that we can load files. It is protected b/c sub classes need to know this information;
	private String name;
	private ArrayList<Location> nullLocations;
	private int numShuffle;
	private int numSwap;
	private int numRemove;
	private int numHint;
<<<<<<< HEAD

	private double totalVal;
=======
>>>>>>> 9f1e17ba24ed1671a122e79338ec7a0da4cb4dd1
	private double freq1;
	private double freq2;
	private double freq3;
	private double freq4;
	private double freq5;
	private double freq6;
	private double freqMult1;
	private double freqMult2;
	private double freqMult3;
	private int pointsStar1;
	private int pointsStar2;
	private int pointsStar3;
	public File File;
	
	/**
	 * 
	 */
<<<<<<< HEAD
	public AbstractLevelConfig(){
		// empty
		this.name = "New Level";
		this.height = this.width = 9;
		this.Type = "Puzzle";
		this.totalVal = 0;
		this.nullLocations = new ArrayList<Location>();
		this.freq1 = 0;
		this.freq2 = 0;
		this.freq3 = 0;
		this.freq4 = 0;
		this.freq5 = 0;
		this.freq6 = 0;
		this.freqMult1 = 0;
		this.freqMult2 = 0;
		this.freqMult3 = 0;
		this.pointsStar1 = 0;
		this.pointsStar2 = 0;
		this.pointsStar3 = 0;

		this.bucketLocations = new ArrayList<Location>();
		this.sixLocations = new ArrayList<Location>();
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
		sixLocations = levelConfig.sixLocations;
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

		totalVal = levelConfig.totalVal;
		freqMult1 = levelConfig.freqMult1;
		freqMult2 = levelConfig.freqMult2;
		freqMult3 = levelConfig.freqMult3;
		pointsStar1 = levelConfig.pointsStar1;
		pointsStar2 = levelConfig.pointsStar2;
		pointsStar3 = levelConfig.pointsStar3;
		board = levelConfig.board;	
=======
	public AbstractLevelConfig(String type){
		this.Type = type;
		nullLocations = new ArrayList<Location>();
	}
	
	public AbstractLevelConfig(String type, AbstractLevelConfig other){
		this.Type = type;
		this.name = other.name;
		this.nullLocations = other.nullLocations;
		this.numShuffle = other.numShuffle;
		this.numSwap = other.numSwap;
		this.numRemove = other.numRemove;
		this.numHint = other.numHint;
		this.freq1 = other.freq1;
		this.freq2 = other.freq2;
		this.freq3 = other.freq3;
		this.freq4 = other.freq4;
		this.freq5 = other.freq5;
		this.freq6 = other.freq6;
		this.freqMult1 = other.freqMult1;
		this.freqMult2 = other.freqMult2;
		this.freqMult3 = other.freqMult3;
		this.pointsStar1 = other.pointsStar1;
		this.pointsStar2 = other.pointsStar2;
		this.pointsStar3 = other.pointsStar3;
		this.File = other.File;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Location> getNullLocations() {
		if (nullLocations == null)
			return new ArrayList<Location>();
		return nullLocations;
>>>>>>> 9f1e17ba24ed1671a122e79338ec7a0da4cb4dd1
	}

	public void setNullLocations(
			ArrayList<Location> nullLocations) {
		this.nullLocations = nullLocations;
	}

	public int getNumShuffle() {
		return numShuffle;
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

	public void setFreq1(double freq1) {
		this.freq1 = freq1;
	}

	public double getFreq2() {
		return freq2;
	}

	public void setFreq2(double freq2) {
		this.freq2 = freq2;
	}

	public double getFreq3() {
		return freq3;
	}

	public void setFreq3(double freq3) {
		this.freq3 = freq3;
	}

	public double getFreq4() {
		return freq4;
	}

	public void setFreq4(double freq4) {
		this.freq4 = freq4;
	}

	public double getFreq5() {
		return freq5;
	}

	public void setFreq5(double freq5) {
		this.freq5 = freq5;
	}

	public double getFreq6() {
		return freq6;
	}

	public void setFreq6(double freq6) {
		this.freq6 = freq6;
	}

	public double getFreqMult1() {
		return freqMult1;
	}

	public void setFreqMult1(double freqMult1) {
		this.freqMult1 = freqMult1;
	}
	
	public double getFreqMult2() {
		return freqMult2;
	}

	public void setFreqMult2(double freqMult2) {
		this.freqMult2 = freqMult2;
	}

	public double getFreqMult3() {
		return freqMult3;
	}

	public void setFreqMult3(double freqMult3) {
		this.freqMult3 = freqMult3;
	}

	public int getPointsStar1() {
		return pointsStar1;
	}

	public void setPointsStar1(int pointsStar1) {
		this.pointsStar1 = pointsStar1;
	}

	public int getPointsStar2() {
		return pointsStar2;
	}

	public void setPointsStar2(int pointsStar2) {
		this.pointsStar2 = pointsStar2;
	}

	public int getPointsStar3() {
		return pointsStar3;
	}

	public void setPointsStar3(int pointsStar3) {
		this.pointsStar3 = pointsStar3;
	}

	public File getFile() {
		return File;
	}

	public void setFile(File file) {
		File = file;
	}

	public String getType() {
		return this.Type;
	}

	public String getJSON()
	{

		Gson gson = new Gson();
		return gson.toJson(this);
	}
<<<<<<< HEAD
	
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

	public String getName() {
		return this.name;
	}
	

	
=======
>>>>>>> 9f1e17ba24ed1671a122e79338ec7a0da4cb4dd1
}

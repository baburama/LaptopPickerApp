/* Name: Rupert Maiti
 * Group: Group 3
 * Date: May 14th, 2022
 * Teacher: Mr. Lee
 * Course: ICS3U1
 * Description: Created Laptop object with attributes that corospond to columns of the spreadsheet
 * Major skills:
 * - making constructor, getter/setter and tostring method
 */

//laptop object

public class Laptop {
	//instance variables
	String brand;
	String model;
	String type;
	double price;
	String cpuBrand;
	String cpuType;
	String cpuModel;
	int cpuCores;
	double cpuSpeed;
	int ram;
	int ssd;
	String gpuBrand;
	String gpuModel;
	int usbPorts;
	String operatingSystem;
	double displaySize;
	int resulutionWidth;
	int resulutionHeight;
	boolean touchScreen;
	double weight;
	int qualityRating;
	int speedRating;
	int memoryRating;
	int displayRating;
	String hyperlink;
	
	//constructor
	public Laptop(String brand, String model, String type, double price, String cpuBrand, String cpuType,
			String cpuModel, int cpuCores, double cpuSpeed, int ram, int ssd, String gpuBrand, String gpuModel,
			int usbPorts, String operatingSystem, double displaySize, int resulutionWidth, int resulutionHeight,
			boolean touchScreen, double weight, int qualityRating, int speedRating, int memoryRating, int displayRating,
			String hyperlink) {
		
		super();
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.cpuBrand = cpuBrand;
		this.cpuType = cpuType;
		this.cpuModel = cpuModel;
		this.cpuCores = cpuCores;
		this.cpuSpeed = cpuSpeed;
		this.ram = ram;
		this.ssd = ssd;
		this.gpuBrand = gpuBrand;
		this.gpuModel = gpuModel;
		this.usbPorts = usbPorts;
		this.operatingSystem = operatingSystem;
		this.displaySize = displaySize;
		this.resulutionWidth = resulutionWidth;
		this.resulutionHeight = resulutionHeight;
		this.touchScreen = touchScreen;
		this.weight = weight;
		this.qualityRating = qualityRating;
		this.speedRating = speedRating;
		this.memoryRating = memoryRating;
		this.displayRating = displayRating;
		this.hyperlink = hyperlink;
	}
	
	//Getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCpuBrand() {
		return cpuBrand;
	}
	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}
	public String getCpuType() {
		return cpuType;
	}
	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}
	public String getCpuModel() {
		return cpuModel;
	}
	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}
	public int getCpuCores() {
		return cpuCores;
	}
	public void setCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
	}
	public double getCpuSpeed() {
		return cpuSpeed;
	}
	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public String getGpuBrand() {
		return gpuBrand;
	}
	public void setGpuBrand(String gpuBrand) {
		this.gpuBrand = gpuBrand;
	}
	public String getGpuModel() {
		return gpuModel;
	}
	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}
	public int getUsbPorts() {
		return usbPorts;
	}
	public void setUsbPorts(int usbPorts) {
		this.usbPorts = usbPorts;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}
	public int getResulutionWidth() {
		return resulutionWidth;
	}
	public void setResulutionWidth(int resulutionWidth) {
		this.resulutionWidth = resulutionWidth;
	}
	public int getResulutionHeight() {
		return resulutionHeight;
	}
	public void setResulutionHeight(int resulutionHeight) {
		this.resulutionHeight = resulutionHeight;
	}
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getQualityRating() {
		return qualityRating;
	}
	public void setQualityRating(int qualityRating) {
		this.qualityRating = qualityRating;
	}
	public int getSpeedRating() {
		return speedRating;
	}
	public void setSpeedRating(int speedRating) {
		this.speedRating = speedRating;
	}
	public int getMemoryRating() {
		return memoryRating;
	}
	public void setMemoryRating(int memoryRating) {
		this.memoryRating = memoryRating;
	}
	public int getDisplayRating() {
		return displayRating;
	}
	public void setDisplayRating(int displayRating) {
		this.displayRating = displayRating;
	}
	public String getHyperlink() {
		return hyperlink;
	}
	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}
	
	//to string method

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", type=" + type + ", price=" + price + ", cpuBrand="
				+ cpuBrand + ", cpuType=" + cpuType + ", cpuModel=" + cpuModel + ", cpuCores=" + cpuCores
				+ ", cpuSpeed=" + cpuSpeed + ", ram=" + ram + ", ssd=" + ssd + ", gpuBrand=" + gpuBrand + ", gpuModel="
				+ gpuModel + ", usbPorts=" + usbPorts + ", operatingSystem=" + operatingSystem + ", displaySize="
				+ displaySize + ", resulutionWidth=" + resulutionWidth + ", resulutionHeight=" + resulutionHeight
				+ ", touchScreen=" + touchScreen + ", weight=" + weight + ", qualityRating=" + qualityRating
				+ ", speedRating=" + speedRating + ", memoryRating=" + memoryRating + ", displayRating=" + displayRating
				+ ", hyperlink=" + hyperlink + "]";
	}
	
	
}

package prob1_31jan;

public class HotelRoom {
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTv;
	private boolean hasWifi;
	
	//constructor
	public HotelRoom(String hotel,int SqFeet,boolean Tv,boolean Wifi ) {
		//initializing
		hotelName = hotel;
		numberOfSqFeet = SqFeet;
		hasTv = Tv;
		hasWifi = Wifi;
	}
	
	public int calculTarrif(int numberOfSqFeet,int cost){
		int Tariff = (numberOfSqFeet * cost);
		return Tariff;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTv() {
		return hasTv;
	}

	public void setHasTv(boolean hasTv) {
		this.hasTv = hasTv;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public int getRatePerSqFeet() {
		return 0;
	}
}

package prob1_31jan;

public class SuiteRoom extends HotelRoom {
	private int ratePerSqFeet;

	public SuiteRoom(String hotel, int SqFeet, boolean Tv, boolean Wifi, int ratePerSqFeet) {
		super(hotel, SqFeet, Tv, Wifi);
		this.ratePerSqFeet = 15;
	}
	
	
}

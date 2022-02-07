package prob1_31jan;

public class DeluxeSeaViewRoom extends DeluxeRoom {
	
	
	public DeluxeSeaViewRoom(String hotel, int SqFeet, boolean Tv, boolean Wifi, int ratePerSqFeet) {
		super(hotel, SqFeet, Tv, Wifi, ratePerSqFeet);
		ratePerSqFeet = 12;
	}

}

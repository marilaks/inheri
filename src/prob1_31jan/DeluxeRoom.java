package prob1_31jan;

public class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotel, int SqFeet, boolean Tv, boolean Wifi, int ratePerSqFeet) {
		super(hotel, SqFeet, Tv, Wifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	/*public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
		
	public DeluxeRoom(int rateSqFeet,String hotel,int SqFeet,boolean Tv,boolean Wifi ) {
		super(hotel,SqFeet,Tv,Wifi);
		ratePerSqFeet = rateSqFeet;
		}
	*/
	public int getratePerSqFeet(int rateSqFeet) {
		if(isHasWifi() == true) {
		return rateSqFeet + 2;
	}
		else {
			return rateSqFeet;
		}
	}
}

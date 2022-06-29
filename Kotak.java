class Kotak extends Bank{
	
	@Override
	public void getInterest(double interest){
		interest=interest+2;
		super.getInterest(interest);
	}
	
}
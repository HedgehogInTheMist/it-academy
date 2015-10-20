package oop;

public class PhoneAbonent implements Comparable<Object> {
	private long id;
	private	String surname;
	private String name;
	private String address;
	private int creditCardNumber;
	private double cityTalktime;
	private double interCityTalktime;

	PhoneAbonent() {
	}
	
	PhoneAbonent(long id, String surname, String name, String address, int creditCardNumber, double cityTalktime,
			double interCityTalktime) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.cityTalktime = cityTalktime;
		this.interCityTalktime = interCityTalktime;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public double getCityTalktime() {
		return cityTalktime;
	}

	public void setCityTalktime(double cityTalktime) {
		this.cityTalktime = cityTalktime;
	}

	public double getInterCityTalktime() {
		return interCityTalktime;
	}

	public void setInterCityTalktime(double interCityTalktime) {
		this.interCityTalktime = interCityTalktime;
	}
	
	@Override
	public int compareTo(Object obj) {		
		PhoneAbonent abonent = (PhoneAbonent)obj;
		int compare = surname.compareTo(abonent.surname);
		if(compare != 0) {
			return compare;
		}
		return compare;
	}
	
}
	
	


package oop;

import java.util.Arrays;

public class PhoneAbonent {
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
	
	public void showAbonentInfo() {
		System.out.format("%-6s%-10s%-10s%-12s%-12s%-12s%-10s", id, surname, name, address, creditCardNumber, cityTalktime, interCityTalktime);
	}
	
	public void longTimeSpeaking(int cityTalktime, PhoneAbonent[] array) {
		System.out.println("Cведения об абонентах, у которых время внутригородских разговоров превышает " + cityTalktime + " минут");
		for (int i = 0; i < array.length; i++) {
			if(array[i].cityTalktime > cityTalktime) {
				array[i].showAbonentInfo();
				System.out.println();
			}  
		}
	}
	
	public void interCitySpeaking(PhoneAbonent[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].interCityTalktime > 0) {
				array[i].showAbonentInfo();
				System.out.println();
			}
		}
	}

	public void abonetsDetails(PhoneAbonent[] array) {
		//Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			array[i].showAbonentInfo();
			System.out.println();
		}
	}
	
	public void headerPrint() {
		System.out.format("%-6s%-10s%-10s%-12s%-12s%-12s%-10s", "№п/п", "Фамилия", "Имя", "Адрес", "Кредитка", "Город (мин)", "Межгород (мин)");
		System.out.println();
	}
	
	
}

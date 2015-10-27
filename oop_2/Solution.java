package oop_2;
/**
 * Определить иерархию драгоценных и полудрагоценных камней. Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
 * Провести сортировку камней ожерелья на основе ценности.
 * Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности
 * 
 * 
 * Система подсчета ценности камней основана на их объеме умноженном на некоторый К коэффициент и Р - плотность
 * Carrat = (length * width * heigth * K) * P = граммы / 5 = КАРАТЫ
 * где К - некий коэффициент определяющий форму камня:
 * Круг - 0.0018
 * Овал - 0.0020
 * Октагон - 0.00245
 * Квадрат - 0.0023
 * Груша - 0.00175
 * 
 * Прозрачность (3-и типа: I II III) каждый в градации от 1 до 8
 * Итого: 8*3 = 24 градаци прозрачности камней. от 1 - прозрачные с незначительными примесями до 24 - не прозрачные с примесями заметными невооруженным глазом
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	static ArrayList<Fossil> fossil = new ArrayList<Fossil>();
	static ArrayList<PreciousStone> precious_stones  = new ArrayList<PreciousStone>();
	
	public static void main(String[] args) {
		
		String userAnswer;
		Scanner repeatAgain = new Scanner(System.in);
		do {
			ProductionShift productionShift = new ProductionShift();
			productionShift.startProductionShift();

			/*
			 * Here should be logic of production jewelry
			 * or more possible in NEW class
			 */
			
			System.out.println("Repeat again?");
			userAnswer = repeatAgain.nextLine();
		} while((userAnswer.startsWith("y")) || (userAnswer.startsWith("Y")));
		repeatAgain.close();
	}
}
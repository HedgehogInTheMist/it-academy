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
import java.util.Random;
import java.util.Scanner;

public class Solution {
	static ArrayList<Fossil> fossil = new ArrayList<Fossil>();
	static ArrayList<PreciousStone> precious_stones  = new ArrayList<PreciousStone>();

	public static void main(String[] args) {
		
		String userAnswer;
		do {
			Random random = new Random();
			ArrayList<PreciousStone> precious_stones  = new ArrayList<PreciousStone>();
			for(int i = 0; i < 20; i++) {
				precious_stones.add(new PreciousStone("Precious_Stones " + i, random.nextInt(8) + 1, random.nextInt(5) + 1, random.nextInt(10) + 1, random.nextInt(10) + 1 ));
			}
			
			for(PreciousStone element : precious_stones) {
				if(element instanceof PreciousStone) {
					System.out.println(element.getName() + " " + element.getHardness() + " " + element.getLength() + " " + element.getWidth() + " " + element.getHeight());
				}
			}
			
			/*
			 * Here should be logic of production jewelry
			 */
			
			//ProductionShift
			
			ProductionShift productionShift = new ProductionShift("Madur", "Rosovsky", "Kristoff", "Kovalskiy");
			System.out.println("Repeat again?");
			Scanner repeatAgain = new Scanner(System.in);
			userAnswer = repeatAgain.nextLine();
		} while((userAnswer.startsWith("y")) || (userAnswer.startsWith("Y")));
		
		
	}
}
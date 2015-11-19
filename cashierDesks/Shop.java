package cashierDesks;

//import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Shop {

	static Integer amount = 6;
	static ConcurrentHashMap<String, Integer> amountOfProduct = new ConcurrentHashMap<>();
		
	Shop() {
		buildMapWithProducts();
	}
	
	public static Integer getAmount() {
		return amount;
	}

	public static void setAmount(Integer amount) {
		Shop.amount = amount;
	}

	public static ConcurrentHashMap<String, Integer> getAmountOfProduct() {
		return amountOfProduct;
	}

	public static void setAmountOfProduct(ConcurrentHashMap<String, Integer> amountOfProduct) {
		Shop.amountOfProduct = amountOfProduct;
	}

	public void buildMapWithProducts() {
		/*amountOfProduct.put("Bread", 10);
		amountOfProduct.put("Milk", 5);
		amountOfProduct.put("Butter", 4);
		amountOfProduct.put("Yougurn", 3);*/
		amountOfProduct.put("Kefir", 7);
	}
	
	
}

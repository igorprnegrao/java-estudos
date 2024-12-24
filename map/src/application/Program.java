package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username: ", "maria");
		cookies.put("email: ", "maria@gmail.com");
		cookies.put("phone: ", "98888-9999");
		
		cookies.remove("email");
		
		System.out.println("ALL COOKIES");
		for (String key : cookies.keySet()) {
			System.out.println(key + cookies.get(key));
		}
	}

}

package pu.chen.code.starter;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;



public class CurrencyTest {
	public static void main(String[] args) {
		Locale locale = new Locale("be", "BY");
		
		//locale = new Locale("zh", "CN");
		
		Currency currency = Currency.getInstance(locale);
		
		String code = currency.getCurrencyCode();
		
		String name = currency.getDisplayName();
		
		String symbol = currency.getSymbol();
		
		System.out.println(code + ":" + name + ":" + symbol);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		
		System.out.println(nf.format(112345.67));

		System.out.println(nf.format(112345.67));
		
	}

}

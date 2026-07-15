package com.github.joaovitorbuzatti.request.converters;

import com.github.joaovitorbuzatti.exception.UnsupportedMathOperationException;

public class NumberConverters {

    public static Double covertToDouble(String strNumber) {
		if (strNumber == null || strNumber.isEmpty()) 
            throw new UnsupportedMathOperationException("Please set a number value"); 
		String number = strNumber.replaceAll(",", ".");// Moeda Americana x Brasileira
		return Double.parseDouble(number);
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) return false; 
		String number = strNumber.replaceAll(",", ".");
			return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}

package net.codedemerde.dojo;

import java.util.ArrayList;
import java.util.List;

public class Roman {

	public static String convert(int arabic) {
		StringBuffer roman = new StringBuffer();

		for (ConversionInfo conversionInfo : conversionInfos) {
			while (arabic >= conversionInfo.getArabic()) {
				roman.append(conversionInfo.getRoman());
				arabic -= conversionInfo.getArabic();
			}
		}

		return roman.toString();
	}

	private static List<ConversionInfo> conversionInfos;
	static {
		conversionInfos = new ArrayList<ConversionInfo>();
		conversionInfos.add(new ConversionInfo(1000, "M"));
		conversionInfos.add(new ConversionInfo(900, "CM"));
		conversionInfos.add(new ConversionInfo(500, "D"));
		conversionInfos.add(new ConversionInfo(400, "CD"));
		conversionInfos.add(new ConversionInfo(100, "C"));
		conversionInfos.add(new ConversionInfo(90, "XC"));
		conversionInfos.add(new ConversionInfo(50, "L"));
		conversionInfos.add(new ConversionInfo(40, "XL"));
		conversionInfos.add(new ConversionInfo(10, "X"));
		conversionInfos.add(new ConversionInfo(9, "IX"));
		conversionInfos.add(new ConversionInfo(5, "V"));
		conversionInfos.add(new ConversionInfo(4, "IV"));
		conversionInfos.add(new ConversionInfo(1, "I"));
	}

}

class ConversionInfo {
	private int arabic;
	private String roman;

	public ConversionInfo(final int arabic, final String roman) {
		this.roman = roman;
		this.arabic = arabic;
	}

	public int getArabic() {
		return arabic;
	}

	public String getRoman() {
		return roman;
	}
}

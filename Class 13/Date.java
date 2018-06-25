import java.util.*;
class Date {
    public static HashMap<String, String> date = new HashMap<String, String>();
	public static HashMap<String, String> month = new HashMap<String, String>();
	public static HashMap<String, String> yearL = new HashMap<String, String>();
	public static HashMap<String, String> yearR = new HashMap<String, String>();
	public static void getDate() {
		date.put("01", "First");
		date.put("02", "Second");
		date.put("03", "Third");
		date.put("04", "Fourth");
		date.put("05", "Fifth");
		date.put("06", "Sixth");
		date.put("07", "Seventh");
		date.put("08", "Eighth");
		date.put("09", "Nineth");
		date.put("10", "Tenth");
		date.put("11", "Eleventh");
		date.put("12", "Tweleveth");
		date.put("13", "Thirteenth");
		date.put("14", "Fourteenth");
		date.put("15", "Fifteenth");
		date.put("16", "Sixteenth");
		date.put("17", "Seventeenth");
		date.put("18", "Eighteenth");
		date.put("19", "Nineteenth");
		date.put("20", "Twenty");
		date.put("21", "Twenty First");
		date.put("22", "Twenty Second");
		date.put("23", "Twenty Third");
		date.put("24", "Twenty Fourth");
		date.put("25", "Twent Fifth");
		date.put("26", "Twenty Sixth");
		date.put("27", "Twenty Seventh");
		date.put("28", "Twenty Eighth");
		date.put("29", "Twenty Nineth");
		date.put("30", "Thirty");
		date.put("31", "Thirty First");
        month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");
		yearL.put("17", "Seventeen");
		yearL.put("18", "Eighteen");
		yearL.put("19", "Nineteen");
        yearL.put("20", "Twenty");
		yearL.put("21", "Twenty One");
		yearL.put("22", "Twenty Two");
        yearR.put("00", "Hundred");
		yearR.put("10", "Ten");
		yearR.put("20", "Twenty");
		yearR.put("30", "Thirty");
	}
   public static String change(String di) {
		String d= di.substring(0,2);
		String m= di.substring(3,5);
		String yl= di.substring(6,8);	
		String yr= di.substring(8,10);
		return date.get(d)+" "+month.get(m)+" "+yearL.get(yl)+" " +yearR.get(yr);
	}
     public static void main(String args[]) {
        getDate();
        System.out.println("02-12-2010");
		System.out.println(change("02-12-2010"));
	}
}
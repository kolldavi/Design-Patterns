public class AdapterDemo {

	public static void main(String[] args) {

		// object adapter
		System.out.println("object adapter test");
		// TemperatureObjectReporter tempInfoObject = new
		// TemperatureObjectReporter();

		TemperatureInfo tempInfoObject = new TemperatureObjectReporter();

		testTempInfo(tempInfoObject);
		// class adapter
		System.out.println("\nclass adapter test");
		TemperatureInfo tempInfo = new TemperatureClassReporter();
		testTempInfo(tempInfo);
	}

	public static void testTempInfo(TemperatureInfo tempInfo) {
		tempInfo.setTemperatureInC(0);
		System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		System.out.println("temp in F:" + tempInfo.getTemperatureInF());

		tempInfo.setTemperatureInF(85);
		System.out.println("temp in C:" + tempInfo.getTemperatureInC());
		System.out.println("temp in F:" + tempInfo.getTemperatureInF());
	}
}

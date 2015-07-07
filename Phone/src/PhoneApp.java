
public class PhoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone s5 = new Phone();
		s5.setManufacturer("Samsung");
		s5.setModel("S5");
		s5.setScreenSize(5);
		s5.setMemoryGB(4);
		System.out.println("Manufacturer: " + s5.getManufacturer());
		System.out.println("Model: " + s5.getModel());
		System.out.println("Scrrensize: " + s5.getScreenSize() + " inches");
		System.out.println("Memory: " + s5.getMemoryGB() + " GB");
		
		Phone s6 = new Phone();
		s6.setManufacturer("Samsung");
		s6.setModel("S6");
		s6.setScreenSize(6);
		s6.setMemoryGB(8);
		System.out.println("Manufacturer: " + s6.getManufacturer());
		System.out.println("Model: " + s6.getModel());
		System.out.println("Screensize: " + s6.getScreenSize() + " inches");
		System.out.println("Memory: " + s6.getMemoryGB() + " GB");
		
		Phone X55 = new Phone();
		X55.setManufacturer("HTC");
		X55.setModel("X55");
		X55.setScreenSize(5.5F);
		X55.setMemoryGB(5.0F);
		System.out.println("Manufacturer: " + X55.getManufacturer());
		System.out.println("Model: " + X55.getModel());
		System.out.println("Screensize: " + X55.getScreenSize() + " inches");
		System.out.println("Memory: " + X55.getMemoryGB() + " GB");
		
		float totalScreenSize = s5.getScreenSize() + s6.getScreenSize() + X55.getScreenSize();
		System.out.println("Total screen size is: " + totalScreenSize + " inches");
		
		float totalMemory = s5.getMemoryGB() + s6.getMemoryGB() + X55.getMemoryGB();
		System.out.println("Total memory is: " + totalMemory + " GB");
	}

}

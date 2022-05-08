package pc;

public class PcApp {
	public static void main(String[] args) {
		PC pc = new PC();
		pc.setUsb(new USBMemory());
		pc.executeUSB();
		pc.setUsb(new USBFan());
		pc.executeUSB();
		pc.setUsb(new USBwash());
		pc.executeUSB();
	}
}
class USBMemory implements IUSB{
	public void execute() {
	System.out.println("データを保存します");
	}
}
class USBFan implements IUSB{
	public void execute() {
	System.out.println("風をふかせます");
	}
}
class USBwash implements IUSB{
	public void execute() {
	System.out.println("洗濯します");
	}
}
class USBxxxx implements IUSB{
	public void execute() {
	System.out.println("xxxxx");
	}
}
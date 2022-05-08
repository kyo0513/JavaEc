import java.util.ArrayList;
import java.util.List;

public class PCApp {
	public static void main(String[] args) {
		PC pc = new PC();
		//UsbMemory usbMemory=new UsbMemory();
		pc.executeUSB(new UsbMemory());
		pc.executeUSB(new IUsb() {

			@Override
			public void execute() {
				System.out.println("扇風機を回します");

			}}); //IUsbインターフェースを持つ名前がないクラスのインスタンスを生成している
		         //この場でしか動かないので繰り返し使うならUSBメモリ同様クラス化したほうがよい


		List<Integer> list = new ArrayList<>() {
			{                                   //イニシャライザー↓
				add(10);
				add(20);
				add(30);
			}                                   //イニシャライザー↑
		};
		System.out.println(list.get(0));


	}
}
interface IUsb{
	void execute();
}

class PC{
	void executeUSB(IUsb usb) {
		usb.execute();
	}
}

class UsbMemory implements IUsb{
	public void execute() {
		System.out.println("メモリに書き込みます");
	}
}
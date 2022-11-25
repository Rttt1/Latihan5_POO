package Latihan5;

public class MainClass {
	public static void main(String[] args) {
		Manager Hendra = new Manager("Bambang",5000000,9000000);
		Programmer Rehan = new Programmer("Agung",7000000,3000000);

		// Set Pegawai
		Hendra.cetakInfo();
		Rehan.cetakInfo();


	}
}
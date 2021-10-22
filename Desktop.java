package Week3.Day2.Assignments;

public class Desktop implements SoftWare, HardWare {
	private void desktopModel() {
		System.out.println("DesktopModel");

	}

	public void hardwareResources() {
		System.out.println("This is the inherited from HardWare interface");
	}

	public void softwareResources() {
		System.out.println("This is the inherited from software interface");
	}
public static void main(String[] args) {
	Desktop d=new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources();
	
}
}
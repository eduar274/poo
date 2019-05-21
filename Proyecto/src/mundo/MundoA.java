package mundo;

public class MundoA {
	
	private boolean Switch;
	
	public MundoA() {
		Switch = false;
	}
	
	public void aceptar () {
		System.out.println("Aceptar");
		Switch = true;
	}
	
	public void cancelar () {
		System.out.println("Cancelar");
		Switch = false;
	}

	public void estadoSwitch() {
		System.out.println(Switch);
	}

	public void setSwitch(boolean switch1) {
		Switch = switch1;
	}
}

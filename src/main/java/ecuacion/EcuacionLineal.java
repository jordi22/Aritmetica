package ecuacion;

public class EcuacionLineal {

	public double a;
	public double b;

	public EcuacionLineal(double a, double b) {

		this.a = a;
		this.b = b;

	}

	public double operacionLineal() {
		if (this.b==0) return (this.b/this.a);
		if (this.a==0) return throw NewIndeterminadoException();
		
		return (-this.b/this.a);
		
	}

	private Exception NewIndeterminadoException() {
		return new Exception();
	}

}

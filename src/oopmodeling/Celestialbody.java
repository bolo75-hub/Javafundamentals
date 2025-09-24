package oopmodeling;

public class Celestialbody {
	//explicació  n:
	/**
	 * public puede acceder todo el mundo, private pueden acceder
	 * solos los de dentro de clase, y protected solo puede acceder
	 * los hijos.
	 */
	public double mass = 100;
	protected float size = 2000000;
	private      String name = "estrella madrir";
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
 
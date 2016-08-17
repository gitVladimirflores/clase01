package pe.edu.pe.entitty;

public class Fruta{
	//Atributos de instancia. Sus valores van a cambiar por cada fruta q cree(su vavlor cambia x cada objeto)
	private String nombre;
	private String color;
	private String sabor;
	private boolean puedoHacerJugo;
	
	
	//Atributos de clase
	public static String LugarOrigen="UPC"; //Si el atributo depende de la clase (atributos de clase)
	//Puedo acceder desde la clase, no depende del objeto
	
	//Constructor de sobrecgarga - reserva espacio en la memoria
	public Fruta(){
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.puedoHacerJugo = false;
	}

	//Metodos de accesos a datos (set y get)
	public Fruta(String nombre, String color, String sabor) {
		super(); //heredad constructir de la clase padre
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.puedoHacerJugo = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}
	
	//Sobreescritura de metodos heredados
	@Override
	public String toString() { //metodos que surgen de la herencia
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
	
	
	
}

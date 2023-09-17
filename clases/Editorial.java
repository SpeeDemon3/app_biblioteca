package clases;

public class Editorial {
	// Atributos
	private int id;
	private String name;
	private String nationality;
	
	// Constructor
	public Editorial(int id, String name, String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}
		
	// Set & Get
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	// Metodos
	
	@Override
	public String toString() {
		return "Editorial [id=" + id + ", name=" + name + ", nationality=" + nationality + "]";
	}		
	
	

}

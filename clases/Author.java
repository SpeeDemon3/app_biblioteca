package clases;

public class Author {

	// Atributos
	private int id;
	private String name;
	private String surname;
	private String nationality;
	private String dateAuthor;
	
	// Constructor
	public Author(int id, String name, String surname, String nationality, String dateAuthor) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationality = nationality;
		this.dateAuthor = dateAuthor;
	}
	
	public Author(String name, String surname, String nationality, String dateAuthor) {
		this.name = name;
		this.surname = surname;
		this.nationality = nationality;
		this.dateAuthor = dateAuthor;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDateAuthor() {
		return dateAuthor;
	}
	public void setDateAuthor(String dateAuthor) {
		this.dateAuthor = dateAuthor;
	}

	
	// Metodos

	@Override
	public String toString() {
		return "Autor [ID = " + id + ", Name = " + name + ", Surname = " + surname + ", Nationality = " + nationality
				+ ", DateAuthor = " + dateAuthor + "]";
	}
	
	
}

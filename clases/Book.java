package clases;

public class Book {
	
	// Atributos
	private int id_book;
	private int id_editorial;
	private int id_author;
	private String title;
	private String isbn;
	private int pages;
	
	// Constructor
	public Book(int id_book, int id_editorial, int id_author, String title, String isbn, int pages) {
		super();
		this.id_book = id_book;
		this.id_editorial = id_editorial;
		this.id_author = id_author;
		this.title = title;
		this.isbn = isbn;
		this.pages = pages;
	}

	// Set & Get

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public int getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(int id_editorial) {
		this.id_editorial = id_editorial;
	}

	public int getId_author() {
		return id_author;
	}

	public void setId_author(int id_author) {
		this.id_author = id_author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	
	// Metodos

	@Override
	public String toString() {
		return "Libros [id_book=" + id_book + ", id_editorial=" + id_editorial + ", id_author=" + id_author + ", title="
				+ title + ", isbn=" + isbn + ", pages=" + pages + "]";
	}
			
	


}

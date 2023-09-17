package clases;

import java.util.Scanner;
/**
 * @author Antonio Ruiz Benito
 * 
 * Funciones del programa
 * 
 */
public class Function {
	
	static Scanner sc = new Scanner(System.in); // Creo la variable estatica para poder utilizarla en todas las funciones
	
	/**
	 * Metodo para mostrar el menu principal
	 */
	public static void mainMenu() {
		
		System.out.println("----------- Menu LAE --------------");
		System.out.println("- 1. Autor                        -");
		System.out.println("- 2. Editorial                    -");
		System.out.println("- 3. Libros                       -");
		System.out.println("- 4. Salida                       -");
		System.out.println("-----------------------------------");
		
	}
	
	/*	FUNCIONES AUTOR */
	
	/**
	 * Metodo para mostrar el menu principal de autores
	 */
	public static void mainAuthor() {
		
		System.out.println("----------- Menu Autor --------------");
		System.out.println("- 1. Insertar Autor                 -");
		System.out.println("- 2. Consultar Autor                -");
		System.out.println("- 3. Modificar Autor                -");
		System.out.println("- 4. Eliminar Autor                 -");
		System.out.println("- 5. Menu anterior                  -");
		System.out.println("-------------------------------------");
		
	}
	
	/**
	 * Metodo que crea un autor con los datos indicados por el
	 * usuario
	 * @return -> El objeto autor creado
	 */
	public static Author insertAuthor() {	
		
		System.out.println("Indica el ID del autor:");
		int idAuthor = sc.nextInt();
			
		sc.nextLine(); // Vacio el buffer
			
		System.out.println("Indica el nombre del autor:");
		String nameAuthor = sc.nextLine();
			
		System.out.println("Indica el apellido del autor:");
		String surnameAuthor = sc.nextLine();
			
		System.out.println("Indica la nacionalidad del autor:");
		String nationalityAuthor = sc.nextLine();
			
		System.out.println("Indica la fecha de nacimiento del autor:");
		String dateAuthor = sc.nextLine();
			
		// Creo un nuevo autor pasando los valores introducidos por el usuario
		Author author = new Author(idAuthor, nameAuthor, surnameAuthor, nationalityAuthor, dateAuthor);
			
		return author; // Retorno el autor creado
		
	}
	
	/**
	 * Metodo generico para imprimir un array de cualquier tipo,
	 * comprobando si tiene objetos nulos para no imprimirlos
	 * @param array 
	 */
	public static void printArray(Object[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == null) {
				continue; // Continuamos a la siguiente iteracion
			}
			
			System.out.println((i + 1) + " - " + array[i]);
		}
		
	}
	
	/**
	 * Metodo para imprimir un array de tipo Author comprobando
	 * si tiene objetos nulos o un id con el valor -1
	 * ignorandolo y no sacandolo por pantalla
	 * @param array -> Array de tipo Author con la lista de autores
	 */
	public static void printArrayAuthor(Author[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == null || array[i].getId() == -1) {
				continue; // Continuamos a la siguiente iteracion
			}
			
			System.out.println((i + 1) + " - " + array[i]);
		}
		
	}
	
	/**
	 * Metodo para actualizar los campos de un autor,
	 * comprobando si el ID introducido por parametro existe
	 * @param authors -> Arrya de tipo Author con la lista de autores
	 * @param idAuthor -> ID del autor que se desea modificar
	 */
	public static void updateAuthor(Author[] authors, int idAuthor) {
		
		boolean authorFound = false;
		
		int count = 0;
		
		while(!authorFound && count < authors.length) { // Mientras no sea distinto el bucle seguira iterando
			
			if (authors[count].getId() == idAuthor) {
				
				System.out.println("Autor con ID " + idAuthor + " encontrado con exito.\n");
				
				System.out.println("\tIndica el nuevo nombre del autor:");
				authors[count].setName(sc.nextLine()); 
				
				System.out.println("\tIndica el nuevo apellido del autor:");
				authors[count].setSurname(sc.nextLine());
				
				System.out.println("\tIndica la nueva nacionalidad del nuevo autor:");
				authors[count].setNationality(sc.nextLine());
				
				System.out.println("\tIndica la nueva fecha de nacimiento del nuevo autor:");
				authors[count].setDateAuthor(sc.nextLine());
				
				System.out.println("Autor actualizado con exito.\n");
				
				System.out.println(authors[count]);
				
				authorFound = true; // Cambio el valor de la variable para poder salir del bucle
			
			} else {
				count++; // Sumamos uno al contador
			}
				
			if(authors[count] == null || count == authors.length) {
				
				System.out.println("El ID introducido no existe. Por favor vuelva a intentarlo.");
				
				count = 0;
				
			}
			
		}
		
	}
	
	/**
	 * Metodo para eliminar un autor
	 * @param authors -> Array con la lista de autores
	 */
	public static void deleteAuthor(Author[] authors) {
		
		boolean authorFound = false;
		
		int count = 0;
		
		System.out.println("Indica el ID del autor que desea eliminar:");

		int idAuthor = sc.nextInt();
		
		// Con un bucle busco si exite el id del autor
		while(!authorFound && count < authors.length) {
			
			if (idAuthor == authors[count].getId()) {
				
				authors[count].setId(-1);
				authors[count].setName("");
				authors[count].setSurname("");
				authors[count].setNationality("");
				authors[count].setDateAuthor("");
				
				System.out.println("Autor eliminado con exito.");
				
				authorFound = true; // Cambio el valor de la variable para poder salir del bucle
			} else {
				
				count++; // Sumamos uno a la variable
				
			}
			
			
		if(authors[count] == null || count == authors.length) {
			
			System.out.println("El ID introducido no existe. Por favor vuelva a intentarlo.");
			
			count = 0;
			
		}
			
		}
		
		
	}
	
	
	/*	FUNCIONES EDITORIAL */
	
	/**
	 * Metodo para mostrar el menu principal de Editorial
	 */
	public static void mainEditorial() {
		System.out.println("----------- Menu Autor --------------");
		System.out.println("- 1. Insertar Editorial             -");
		System.out.println("- 2. Consultar Editorial            -");
		System.out.println("- 3. Modificar Editorial            -");
		System.out.println("- 4. Eliminar Editorial             -");
		System.out.println("- 5. Menu anterior                  -");
		System.out.println("-------------------------------------");
	}
	
	/**
	 * Metodo para crear una editorial	
	 * @return -> Editorial creada
	 */
	public static Editorial insertEditorial() {
		
		
		System.out.println("Introduce el ID de la editorial:");
		int idEditorial = sc.nextInt();
		
		sc.nextLine(); // Vacio el buffer
		
		System.out.println("Introduce el nombre:");
		String nameEditorial = sc.nextLine();
		
		System.out.println("Introduce la nacionalidad:");
		String nationalityEditorial = sc.nextLine();
		
		Editorial ed = new Editorial(idEditorial, nameEditorial, nationalityEditorial); // Creo la editorial con los parametros insertados por el usuario
		
		return ed; // Retorno la editorial creada
		
	}
	
	/**
	 * Metodo para actualizar una editorial
	 * @param editorials -> Lista de editoriales disponibles
	 * @return -> Verdadero o False dependiendo si se pudo actualizar o no
	 */
	public static boolean updateEditorial(Editorial[] editorials, int index) {
		
		if(index > 0) {
			System.out.println("Introduce el ID de la editorial que deseas modificar:");
			
			int editorialIdUser = sc.nextInt();
			
			sc.nextLine(); // Vacio el buffer
			
			boolean editorialFound = false;
			
			int count = 0;
			
			while(!editorialFound && count < editorials.length) { // Mientras editorialFound no sea distinta de false y count sea menor a la longitud del array el bucle seguira iterando
				
				
				if(editorials[count].getId() == editorialIdUser) { // Si el idIntroducido por el usuario es igual ha alguno de los que contiene el array
					
					System.out.println("Editorial con ID " + editorialIdUser + " encontrado con exito.\n");

					System.out.println("\tIndica el nuevo nombre de la editorial:");
					editorials[count].setName(sc.nextLine()); 
						
					System.out.println("\tIndica la nueva nacionalidad de la editorial:");
					editorials[count].setNationality(sc.nextLine());
						
					System.out.println("Editorial actualizado con exito.\n");

					System.out.println(editorials[count]); // Muestro por consola la Editorial actualizada
						
					editorialFound = true; // Cambio el valor de la variable para salir del bucle
						
					return true;
					
				} else {
					count++; // Sumamos 1 al contador en cada iteracion					
				}
				
				
			if(editorials[count] == null || count == editorials.length) {
				
				System.out.println("El ID introducido no existe. Por favor vuelva a intentarlo.");
				
				count = 0;
				
			}
				
				
			}
			
		}
	
		System.out.println("El sistema no contiene editoriales registradas.\n");
		
		return false;

				
		
	}
	
	/**
	 * Metodo para eliminar una editorial
	 * @param editorials -> Lista de editoriales
	 * @param index -> contador
	 * @return -> True si se pudo realizar la operacion || False si no se pudo realizar la operacion
	 */
	public static boolean deleteEditorial(Editorial[] editorials, int index) {
		
		if(index > 0) {
			
			System.out.println("Introduce el ID de la editorial que desea eliminar:");
			
			int idEditorial = sc.nextInt(); // Guardo el valor introducido por el usuario
			
			sc.nextLine(); // Vacio el buffer
						
			boolean editorialFound = false;
			
			int count = 0;
			
			while(!editorialFound && count < editorials.length) { // Mientras editorialFound no sea distinta de false y count sea menor a la longitud del array
				
				if(editorials[count].getId() == idEditorial) { // Si el id es igual a el id introducido por el usuario
					
					System.out.println("\nEditorial con ID " + idEditorial + " encontrado con exito.\n");
					
					// Modifico los campos de la editorial para dejarla vacia a ojos del usuario
					editorials[count].setId(-1);
					editorials[count].setName("");
					editorials[count].setNationality("");
					
					System.out.println("Editorial eliminada con exito.\n");
					
					return true;
					
				} else { // En caso contrario
					
					count++; // Sumamos uno al contador

				}
				
				
			if(editorials[count] == null || count == editorials.length) {
				
				System.out.println("El ID introducido no existe. Por favor vuelva a intentarlo.");
				
				count = 0;
				
			}
				
			}
			
		} 
			
		System.out.println("El sistema no contiene editoriales registradas.\n");
		
		return false;
		
	}
	
	
	/**
	 * Metodo para imprimir un array de tipo Editorial comprobando
	 * si tiene objetos nulos o un id con el valor -1
	 * ignorandolo y no sacandolo por pantalla
	 * @param array -> Array de tipo Editorial con la lista de editoriales
	 */
	public static void printArrayEditorial(Editorial[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == null || array[i].getId() == -1) { // Si el array en la posicion i no es igual a null O el array en la posicion i es igual a -1
				continue; // Continuamos a la siguiente iteracion
			}
			
			System.out.println((i + 1) + " - " + array[i]);
		}
		
	}
	
	/*	FUNCIONES LIBRO */
	
	/**
	 * Metodo para mostrar el menu principal de Libro
	 */
	public static void mainBook() {
		
		System.out.println("----------- Menu Libro --------------");
		System.out.println("- 1. Insertar Libro                 -");
		System.out.println("- 2. Consultar Libro                -");
		System.out.println("- 3. Modificar Libro                -");
		System.out.println("- 4. Eliminar Libro                 -");
		System.out.println("- 5. Menu anterior                  -");
		System.out.println("-------------------------------------");
		
	}
	
	/**
	 * Metodo para insertar un libro
	 * @param autors -> Array con los autores disponibles
	 * @param editorials -> Array con las editoriales disponibles
	 */
	public static Book insertBook(Author[] autors, Editorial[] editorials) {
		
		System.out.println("Introduce el ID del libro:");
		int idBook = sc.nextInt();
		sc.nextLine();
		
		
		boolean foundEditorial = false;
		int countEditorial = 0;
		int idEditorial = -2;
		
		do {
			
			System.out.println("Selecciona el ID de la editorial dentro de los disponibles:");
			
			// Muestro los autores disponibles
			printArrayEditorial(editorials);
			
			idEditorial = sc.nextInt();
						
			if(idEditorial == editorials[countEditorial].getId()) { // Si el ID introducido por el usuario es igual ha algun ID dentro del array
				
				foundEditorial = true; // Cambio el valor de la variable a true para poder salir del bucle
				
			} else {
				
				countEditorial++; // Sumo 1 al contador
				
			}
			
			if(countEditorial == editorials.length -1 || editorials[countEditorial] == null) { // Si el contador es igual a la longitud del array menos 1
				
				countEditorial = 0; // Pongo el contador a 0 para poder seguir iterando
				
			}
			
			
		} while(!foundEditorial && countEditorial < editorials.length);	// Mientras la variable foundEditorial no sea distinta de false y el contador sea inferior ha la longitud del array
		
		
		
		boolean foundAuthor = false;
		int countAuthor = 0;
		int idAuthor = -2;
		
		do {
			
			System.out.println("Selecciona el ID del autor dentro de los disponibles:");
			
			// Muestro los autores disponibles
			printArrayAuthor(autors);
			
			idAuthor = sc.nextInt();
						
			if(idAuthor == autors[countAuthor].getId()) { // Si el ID introducido por el usuario es igual ha algun ID dentro del array
				
				foundAuthor = true; // Cambio el valor de la variable a true para poder salir del bucle
				
			} else {
				
				countAuthor++; // Sumo 1 al contador
				
			}
			
			if(countAuthor == autors.length -1 || autors[countAuthor] == null) { // Si el contador es igual a la longitud del array menos 1
				
				countAuthor = 0; // Pongo el contador a 0 para poder seguir iterando
				
			}
			
			
		} while(!foundAuthor && countAuthor < autors.length); // Mientras la variable foundEditorial no sea distinta de false y el contador sea inferior ha la longitud del array
		
		sc.nextLine(); // Vacio el buffer
					
		System.out.println("Introduce el título del libro:");
		String bookTitle = sc.nextLine();
		
		System.out.println("Introduce el ISBN del libro:");
		String isbnBook = sc.nextLine();
		
		System.out.println("Introduce el número de páginas:");
		int pagesBook = sc.nextInt();
		
		sc.nextLine(); // Vacio el baffer
		
		// Creo el libro con los valores del usuario
		Book book = new Book(idBook, idEditorial, idAuthor, bookTitle, isbnBook, pagesBook);
		
		System.out.println("Libro creado con exito.\n");
		
		System.out.println(book.toString() + "\n");  // Muestro la informacion del libro creado
		
		return book;
		
		
	}

	/**
	 * Metodo para imprimir un array de tipo Editorial comprobando
	 * si tiene objetos nulos o un id con el valor -1
	 * ignorandolo y no sacandolo por pantalla
	 * @param array -> Array de tipo Book
	 */
	public static void printArrayBook(Book[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == null || array[i].getId_book() == -1) { // Si el array en la posicion i no es igual a null O el array en la posicion i es igual a -1
				continue; // Continuamos a la siguiente iteracion
			}
			
			System.out.println((i + 1) + " - " + array[i]);
		}
		
	}				
		
	/**
	 * Metodo para actualizar los valores del libro que se desea modificar
	 * @param books -> Array con los libros disponibles
	 * @param editorials -> Array con las editoriales disponibles
	 * @param authors -> Array con los autores disponibles
	 * @return -> True si se pudo actualizar || False si no se pudo actualizar
	 */
	public static boolean updateBook(Book[] books, Editorial[] editorials, Author[] authors) {
		
		System.out.println("Libros registrados:");
		printArrayBook(books);
		
		boolean foundBook = false;
		
		int count = 0; 
		
		do {
			
			System.out.println("Indica el ID del libro que desea modificar:");
			
			int idBookUser = sc.nextInt(); // Guardo el valor introducido por el usuario
						
			if(books[count] != null && idBookUser == books[count].getId_book()) { // Si el ID introducido por el usuario coincide con alguno de los que contiene el array
				
				System.out.println("\nEl ID ha sido encontrado con exito.\n");
				
				int countEditorial = 0;
				boolean foundEditorial = false;
				
				while(!foundEditorial && countEditorial < editorials.length) { // Mientras la variable foundEditorial no sea distinta de false y el contador sea menor a la longitud del array
					
					System.out.println("Selecciona el ID de la editorial que desea añadir:");
					
					printArrayEditorial(editorials); // Muestro las editoriales disponibles
					
					int editorialUser = sc.nextInt();// Guardo el valor introducido por el usuario
					
					if(editorialUser == editorials[countEditorial].getId()) { // Si coinciden los valores
						
						books[count].setId_editorial(editorialUser); // Asigno el nuevo valor
						
						foundEditorial = true; // Salimos del bucle
						
					}
					
					countEditorial++; // Sumamos uno al contador
					
					if(countEditorial == editorials.length -1 || editorials[countEditorial] == null) {
						
						System.out.println("El ID introducido no existe. Vuelva a intentarlo.\n");
						
						countEditorial = 0; // Reinicio el contador
						
					}
					
				}
				
				int countAuthor = 0;
				boolean foundAuthor = false;
				
				while(!foundAuthor && countAuthor < authors.length) { // Mientras la variable foundAuthor no sea distinta de false y el contador sea menor a la longitud del array
					
					System.out.println("Selecciona el ID de la autor que desea añadir:");
					
					printArrayAuthor(authors); // Muestro las editoriales disponibles
					
					int authorUser = sc.nextInt(); // Guardo el valor introducido por el usuario
					
					if(authorUser == authors[countAuthor].getId()) { // Si coinciden los valores
						
						books[count].setId_author(authorUser); // Asigno el nuevo valor
						
						foundAuthor = true; // Salimos del bucle
						
					}
					
					countAuthor++; // Sumamos uno al contador
					
					if(countAuthor == authors.length -1 || authors[countAuthor] == null) {
						
						System.out.println("El ID introducido no existe. Vuelva a intentarlo.\n");
						
						countAuthor = 0; // Reinicio el contador
						
					}
					
				}
				
				sc.nextLine(); // Vacio el buffer
				
				// Solicito y modifico el resto de valores
				
				System.out.println("Indica el nuevo titulo del libro:");
				
				String titleUser = sc.nextLine();
				
				books[count].setTitle(titleUser);

				System.out.println("Indica el nuevo isbn:");
				
				String isbnUser = sc.nextLine();
				
				books[count].setIsbn(isbnUser);
				
				System.out.println("Indica el número de páginas:");

				int numPagUser = sc.nextInt();
				
				books[count].setPages(numPagUser);
				
				System.out.println("\nLibro modificado con exito.\n");
				
				System.out.println(books[count].toString()); // Muestro los nuevos valores
				
				return true; 
				
			}
			
			count++; // Sumo uno al contador
			
			if (count == books.length - 1) { // Si la variable count es igual a la longitud del array -1
				
				count = 0; // Reinicio el contador a 0
				
			}
			
			
		} while(!foundBook && count < books.length); // Mientras la variable foundBook no sea distinta de false y el contador sea menor a la longitud del array
		
		return false;
		
	}
	

	/**
	 * Metodo para eliminar un libro a ojos 
	 * del usuario
	 * @param books -> Array con los libros disponibles
	 * @return -> True si la operacion se puede realizar || False si la operacion no se pudo realizar
	 */
	public static boolean deleteBook(Book[] books) {
				
		boolean foundBook = false;
		int count = 0;
		
		do {
		
			System.out.println("Indica el ID del libro que desea eliminar");

			int idUser = sc.nextInt();
			
			if (idUser == books[count].getId_book()) { // Si coinciden los valores
				
				// Modifico los valores del libro en la posicion count
				books[count].setId_book(-1);
				books[count].setId_editorial(-1);
				books[count].setId_author(-1);
				books[count].setTitle("");
				books[count].setIsbn("");
				books[count].setPages(-1);
				
				System.out.println("Libro eliminado con exito.");
				
				foundBook = true;
				
				return true;
				
			} else {
				count++;
			}
			
			
			if(count == books.length - 1 || books[count] == null) { // Si el contador llega al mismo numero que la longitud del array
				
				count = 0; // Reinicio el contador
				
				System.out.println("El ID introducido no existe. Por favor vuelva a intentarlo.\n");
				
			}
			
		}while(!foundBook && count < books.length - 1);
		
		return false;
	}
	

}

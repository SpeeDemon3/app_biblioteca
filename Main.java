import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Author;
import clases.Book;
import clases.Editorial;
import clases.Function;

/**
 * @author Antonio Ruiz Benito
 */
public class Main {
	
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		
		int opcUser = -1;
		int countAuthor = 0;
		int countEditorial = 0;
		int countBook = 0;
		
		// Arrays
		Author[] authors = new Author[5];
		Editorial[] editorials = new Editorial[5];
		Book[] books = new Book[10];
		
		
		do {
			
			try {
				

				Function.mainMenu(); // Muestro el menu al usuario
				
				System.out.println("Indica la opción deseada:");
				
				opcUser = sc.nextInt(); // Guardo la opcion del usuario
				sc.nextLine(); // Vacio el buffer
				
				switch(opcUser) {
					
					case 1: // Autor
						
						Function.mainAuthor(); // Muestro el menu al usuario
						
						System.out.println("Selecciona una opción valida:");
						
						int opcUser2 = sc.nextInt();
						sc.nextLine();
						
						switch(opcUser2) {
						
							case 1: // Insertar usuario
								
								boolean authorFound = false;
								
								int count = 0;
																								
								
								if (countAuthor < authors.length) { // Si el array no esta vacio
									
									while(!authorFound && count < authors.length) { 
										
										if(authors[count] != null && authors[count].getId() == -1) { // Si no es igual a null y su ID es igual a -1
											
											authors[count] = Function.insertAuthor(); // Metodo para insertar un usuario en el array authors
											
											countAuthor++;
											
											authorFound = true; // Cambio el valor de la variable para poder salir del bucle
											
											System.out.println("Author insertado con exito!!!");
											
										}
										
										count++;
										
									}
									
									if(authorFound == false ) { // Si en esta altura el valor de la variable es false es que no a encontrado ningun ID con -1
										
										authors[countAuthor] = Function.insertAuthor(); // Metodo para insertar un usuario en el array authors
										
										countAuthor++; // Sumamos uno al contador de autores
										
										System.out.println("Author insertado con exito!!!");
										
									}
																		
								
								} else {
									
									System.out.println("Debes borrar autores registrados en el sistema, para poder insertar nuevos.\n");

								}
								
								break;
								
							case 2: // Consultar autor
								
								if(countAuthor > 0) {
									System.out.println("Listado de Autores:");
									Function.printArrayAuthor(authors); // Metodo para imprimir un array	
								
								} else {
									
									System.out.println("El sistema no contiene autores registrados.\n");
									
								}
								
								break;
								
							case 3: // Modificar Autor
								
								if (countAuthor > 0) {
									
//									System.out.println("Indique el ID del autor que desea modificar:");
//									
//									int authorId = sc.nextInt();
									
									Function.updateAuthor(authors);
									
								} else {
									
									System.out.println("El sistema no contiene autores registrados.\n");
									
								}
								
								break;
								
							case 4: // Eliminar Autor
								
								if (countAuthor > 0) {
									
									Function.deleteAuthor(authors);
									
									countAuthor--; // Restamos uno al contador
									
								} else {
									
									System.out.println("El sistema no contiene autores registrados.\n");
									
								}
								
								
								break;
							
							case 5: // Menu anterior
								System.out.println("\nVolviendo al menu anterior...\n");
								break;
							
							default:
								System.out.println("Debes introducir una opción válida.\n");
								break;
						}
						
						break;
						
					case 2: // Editorial
						
						Function.mainEditorial(); // Muestro el menu al usuario
						
						System.out.println("Indica la opción deseada:");
						
						int opcUserEditorial = sc.nextInt(); // Guardo la opcion del usuario
						sc.nextLine(); // Vacio el buffer
						
						switch(opcUserEditorial) {
							
							case 1: // Insertar Editorial
								
								boolean foundEditorial = false;
								
								int count = 0;

								
								if(countEditorial > -1 && countEditorial < editorials.length) { // Si el array no esta vacio
									
									
									while(!foundEditorial && count < editorials.length) {
										
										if(editorials[count] != null && editorials[count].getId() == -1) { // Si no es igual a null y el id es igual a -1
											
											editorials[countAuthor] = Function.insertEditorial(); // Creamos una nueva editorial en la posicion en la que esta el ID con -1
											
											foundEditorial = true; // Cambio el valor de la variable para poder salir del bucle
											
										} 
										
										count++;
										
									}
									
									if(foundEditorial != true) { // Si la variable no es igual a true significa que no hay ningun id con -1
										
										editorials[countEditorial] = Function.insertEditorial(); // Creamos una nueva editorial

										countEditorial++; // Sumamos 1 al contador
										
									}
									
								}
								
								break;
						
							case 2: // Consultar Editorial
								
								if(countEditorial > 0) {
									
									Function.printArrayEditorial(editorials); // Muestro por consola las editoriales
									
								} else {
									
									System.out.println("El sistema no contiene editoriales registradas.\n");

								}
								
								break;
								
							case 3: // Modificar Editorial
								
								Function.updateEditorial(editorials, countEditorial); // Metodo para modificar una editorial si existen editoriales

								break;
								
							case 4: // Eliminar Editorial
								
								boolean deleteEd = Function.deleteEditorial(editorials, countEditorial);
								
								if(deleteEd) { // Si es verdadero 
									countEditorial--; // Restamos uno al contador
								}
								
								
								break;
							
							case 5: 	
								// Menu anterior
								System.out.println("\nVolviendo al menu anterior...\n");
								break;
								
							default:
								System.out.println("Debes introducir una opción válida.\n");
								break;
						}
						
						
						break;
						
					case 3: // Libros
						
						Function.mainBook(); // Muestro el menu
						
						System.out.println("Indica la opción deseada:");

						int opcUserBook = sc.nextInt(); // Guardo el valor introducido por el usuario3
						
						sc.nextLine(); // Vacio el buffer
						
						switch(opcUserBook) {
							
							case 1: // Insertar Libro
								
								if(countEditorial > 0 && countAuthor > 0) { // Si los 2 arrays no estan vacios
									
									if (countBook >= 0 && countBook < books.length -1) {
										
										books[countBook] =Function.insertBook(authors, editorials);
										
										countBook++;
										
									} else {
										
										System.out.println("\nDebes borrar libros registrados en el sistema, para poder insertar nuevos.\n");
										
									}
									
								} else {
									
									System.out.println("\nDebes tener autores y editoriales registradas en el sistema.\n");
									
								}
															
								break;
								
							case 2: // Consultar Libro
								
								if (countBook > 0) { // Si hay libros
									
									Function.printArrayBook(books); // Imprimo los libros registrados
									
								} else {
									
									System.out.println("\nEl sistema no contiene libros registrados.\n");
									
								}
						
								break;
								
							case 3: // Modificar Libro
								
								if(countBook > 0) {
									
									Function.updateBook(books, editorials, authors);
									
								} else {
									
									System.out.println("\nEl sistema no contiene libros registrados.\n");
									
								}
								
								break;
								
							case 4: // Eliminar libro
								
								if(countBook > 0) {
									
									Function.deleteBook(books);
									
									countBook--; // Resto 1 al contador
									
								} else {
									
									System.out.println("\nEl sistema no contiene libros registrados.\n");
									
								}
																
								break;
								
							case 5: // Menu anterior
								
								System.out.println("\nVolviendo al menu anterior...\n");
								
								break;
						
							default:
								System.out.println("Debes introducir una opción válida.\n");
								break;
						
						}
						
						break;
				
					case 4:
						System.out.println("Gracias por utilizar el programa.");
						break;
						
					default:
						System.out.println("La opcion escogida no es valida, por favor vuelva a intentarlo.\n");
						break;
				
				}
				
			} catch(InputMismatchException ime) {
				System.out.println("Debes introducir un valor numérico!!!!");
				sc.nextLine(); // Vacio el buffer
				System.out.println("Pulse una tecla para continuar.");
				sc.nextLine(); // Interactuo con el usuario

			}
			
			
		} while(opcUser != 4);	// Mientras no sea igual a cuatro el bucle seguira iterando
	}

}

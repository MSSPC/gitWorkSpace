package book;

public class FactoryTest {

	// Simple Factory**********************************
	interface Book {
		void runBook();
	}

	class JavaBook implements Book {

		@Override
		public void runBook() {
			// TODO Auto-generated method stub
			System.out.println("This is Java book.");
		}
	}

	class CPPBook implements Book {

		@Override
		public void runBook() {
			// TODO Auto-generated method stub
			System.out.println("This is C++ book.");
		}
	}

	class BookFactory {
		public Book initBook(String bookName) {
			// Here initialize book as null
			Book book = null;
			if (bookName == "Java") {
				book = new JavaBook();
			} else if (bookName == "CPP") {
				book = new CPPBook();
			}
			return book;
		}
	}

	// Simple Factory**********************************

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

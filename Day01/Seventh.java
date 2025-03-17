import java.util.ArrayList;
import java.util.List;

//base class
class Book {

  private String title;
  private String author;
  private String isbn;
  private boolean isAvailable;

  public Book(String title, String author, String isbn, boolean isAvailable){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.isAvailable = true;
  }

  public String getTitle(){
    return title;
  }

  public Strig getAuthor(){
    return author;
  }

  public String getIsbn(){
    return isbn;
  }

  public boolean getIsAvailable(){
    return isAvailable;
  }

  public String checkOut(){
    if(isAvailable) {
      isAvailable = false;
      return title + " has been checked out.";
    } else {
      return title + " not available for checkout.";
    }
  }

  public String checkIn(){
    if(!isAvailable) {
      isAvailable = true;
      return title + " has beed checked in.";
    } else {
      return title + " is already in the library.";
    }
  }

  public String displayInfo(){
    return "Title : " + title + " | Author : " + author + " | ISBN : " + isbn + " | ";
  }
}

class PrintedBook extend Book {
  private int pageCount;
  private String condition;


}
 


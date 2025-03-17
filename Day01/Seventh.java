import java.util.ArrayList;
import java.util.List;

//base class
class Book{

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

  public String getAuthor(){
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
    return "Title : " + title + " | Author : " + author + " | ISBN : " + isbn + " |";
  }
}

// printed books
class PrintedBook extends Book {
  private int pageCount;
  private String condition;

  public PrintedBook(String title, String author, String isbn, int pageCount, String condition){
      super(title, author, isbn);
      this.pageCount = pageCount;
      this.condition = condition;
  }
  
  public int getPageCount(){
      return pageCount;
  }
  
  public String getCondition(){
      return condition;
  }
  
  @Override
  public String displayInfo(){
      return super.displayInfo() + " Page Count : " + pageCount + " | Condition " + condition;
  }
  
  public String repairBook(){
      if (!condition.equals("new")) {
          condition = "good";
          return getTitle() + " has been repaired and now in good condition. ";
      }
      return getTitle() + " is already in good condition";
  }
}

// digital books
class EBook extends Book {
    private  double fileSize;
    private String format;
    
    public EBook(String title, String author, String isbn, double fileSize, String format){
        super(title, author, isbn);
        this.fileSize = fileSize;
        this.format = format;
    }
    
    public double getFileSie(){
        return fileSize;
    }
    
    public String getFormat(){
        return format;
    }
    
    @Override
    public String displayInfo(){
        return super.displayInfo() + " File Size : " + fileSize + " | Format : " + format;
    }
    
    public String download(){
        return "Downloading " + getTitle() + "." + format + " ( " + fileSize + "MB) .... "; 
    }
}


 


# Day 01 - Java Programming Exercises

This directory contains a series of Java programming exercises covering various programming concepts.

## Exercise List

### 1. Basic Message Printing
- Print a message to the console

#### Output
```
javac First.java
java First.class
Hello World!
```

### 2. Number Sequence
- Print numbers from 1 to 10 using a loop

#### Output
```
javac Second.java
java Second.class
1
2
3
4
5
6
7
8
9
10
```

### 3. Reverse Number Sequence
- Print numbers in reverse order

#### Output
```
javac Third.java
java Third.class
10
9
8
7
6
5
4
3
2
1
```

### 4. Odd Numbers
- Print odd numbers between 1 and 20

#### Output
```
javac Fourth.java
java Fourth.class
1
3
5
7
9
11
13
15
17
19
```

### 5. Pattern Printing
Create a pattern that reverses left and right numbers using only a loop.

**Example:**
- Input: 9
  Output: 4 3 2 1 5 9 8 7 6
- Input: 13
  Output: 6 5 4 3 2 1 7 13 12 11 10 9 8
  
#### Output
```
javac Fifth.java
java Fifth.class
Enter a number : 
9
4 3 2 1 5 9 8 7 6 
```

### 6. Student Management System
- Create a Student class
- Create 5 student objects and store them in an appropriate data structure
- Calculate and display the average marks of all students

#### Output
```
javac Sixth.java
java Sixth.class
Average Marks is : 63.4
Name : Alice | Registration No. : 100 | Mark : 85.0 | 
Name : John | Registration No. : 101 | Mark : 70.0 | 
Name : Mike | Registration No. : 102 | Mark : 55.0 | 
Name : Jane | Registration No. : 103 | Mark : 43.0 | 
Name : Lucy | Registration No. : 104 | Mark : 64.0 | 
```

### 7. Library Management System
Implement a library system with different types of books using OOP concepts:
- Printed books
- E-books
- Audio books

**Required Concepts:**
- Inheritance
- Polymorphism
- Encapsulation

#### Output
```
javac Seventh.java
java Seventh.class
To Kill a Mockingbird has been added to City Public Library.
1984 has been added to City Public Library.
The Great Gatsby has been added to City Public Library.
Python Programming has been added to City Public Library.
Harry Potter has been added to City Public Library.
Books in City Public Library:
- Title : To Kill a Mockingbird | Author : Harper Lee | ISBN : 978-0446310789 | Page Count : 336 | Condition good
- Title : 1984 | Author : George Orwell | ISBN : 978-0451524935 | Page Count : 328 | Condition fair
- Title : The Great Gatsby | Author : F. Scott Fitzgerald | ISBN : 978-0743273565 | File Size : 2.4 | Format : EPUB
- Title : Python Programming | Author : John Smith | ISBN : 978-1234567890 | File Size : 8.7 | Format : PDF
- Title : Harry Potter | Author : J.K. Rowling | ISBN : 978-0747532743 | Duration : 510 | Narrator : Stephen Fry

To Kill a Mockingbird has been checked out.
The Great Gatsby has been checked out.
Harry Potter has been checked out.
1984 has been repaired and now in good condition. 
Downloading Python Programming.PDF ( 8.7MB) .... 
Playing a sample of Harry Potter narrated by Stephen Fry...
```

### 8. Retail Store Management System
Implement a retail store system that can:
- Store multiple types of products (fruits, vegetables, grocery, etc.)
- Edit product information
- Delete products
- Display available products with their details (price, name, quantity)

#### Output
```
javac Eight.java
java Eight.class
Product 'Red Apple' added successfully.
Product 'Banana' added successfully.
Product 'Carrot' added successfully.
Product 'Spinach' added successfully.
Product 'Basmati Rice' added successfully.
Product 'Spaghetti Pasta' added successfully.
Products available at Fresh Mart:
ID : 101 | Name : Red Apple | Price : $1.99 | Quantity : 100 | Origin : Washington | Organic
ID : 102 | Name : Banana | Price : $0.99 | Quantity : 150 | Origin : Costa Rica | Non-organic
ID : 201 | Name : Carrot | Price : $1.49 | Quantity : 80 | Seasonal | Farm : Green Acres Farm
ID : 202 | Name : Spinach | Price : $2.99 | Quantity : 50 | Seasonal | Farm : Organic Greens Co.
ID : 301 | Name : Basmati Rice | Price : $5.99 | Quantity : 30 | Brand : Golden Harvest | Expires : 2025-12-31
ID : 302 | Name : Spaghetti Pasta | Price : $2.49 | Quantity : 45 | Brand : Pasta King | Expires : 2026-06-30

Product 'Red Apple' update successfully.
Added 25 units to 'Spinach'. New quantity: 75
Product 'Spaghetti Pasta' deleted succefully.

Fruits available:
ID : 101 | Name : Red Apple | Price : $2.29 | Quantity : 120 | Origin : Washington | Organic
ID : 102 | Name : Banana | Price : $0.99 | Quantity : 150 | Origin : Costa Rica | Non-organic
```

## Getting Started
Each exercise is implemented in a separate Java file named according to its number (First.java through Seventh.java).
To run any exercise, compile and execute the corresponding Java file.

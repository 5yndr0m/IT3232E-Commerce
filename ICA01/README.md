# Instruction:

- A Springboot project was already created, use it to answer the given questions.
- Once you complete the exam, copy only the model folder and the generated database to the Z drive (server).
- Don’t copy your files while it is open in the editor.

University Vavuniya wants to build a Smart Canteen Management System using Spring Boot. The system must manage multiple canteens, each located in different parts of the campus. The university maintains a list of foods which can only be sold at the canteen. Each food item has a name, price, and weight. Each canteen offers a daily menu that includes several food items, where a single food item can appear on menus in different canteens on different days. The university has students and employees, both of whom have common details such as ID, name, age, and gender. Employees have additional attributes like their job position, and students include their academic degree. Employees can be associated with multiple canteens, while each student can place food orders. Every food order can include multiple order lines, and each line refers to a specific food item from the daily menu, along with the quantity. A student may place multiple orders over time, and each order must store the date it was placed.

1) The following requirements are given to create proper models, implement the necessary relationships between the entity classes based on the provided scenario, and migrate them as a database using proper ORM techniques.
2) After the migration, take a backup of the generated database and display the description of each table.
# Day 06 - Connecting to Database

This directory contains excercises completed during Day 06.

### Excercises
1. Create new App with mySQL Driver and Spring Data JPA dependencies.
2. Populate application.properties with the database credentials.
3. Create Department, Employee, Project, and Insurance tables.
4. Add the proper relationships between the tables.
5. Run the project and observe the tables in the database.

## Getting Started
Clone the Repo and Open project using Spring Tool Suite or other prefered method.
Install the necessary dependencies using maven.
Run the Applicartion.
Visit the localhost:8080 in your browser.

### application.properties
```java
spring.application.name=AppwithDB
spring.datasource.url=jdbc:mysql://localhost:3306/testappdb
spring.datasource.username=testuser
spring.datasource.password=test123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

### mysql output
```sql
mysql -u testuser -p                                                                       
mysql: Deprecated program name. It will be removed in a future release, use '/usr/bin/mariadb' instead
Enter password: 
Welcome to the MariaDB monitor.  Commands end with ; or \g.
Your MariaDB connection id is 88
Server version: 11.7.2-MariaDB Arch Linux

Copyright (c) 2000, 2018, Oracle, MariaDB Corporation Ab and others.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

MariaDB [(none)]> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| test               |
| testappdb          |
+--------------------+
3 rows in set (0.007 sec)

MariaDB [(none)]> use testappdb;
Database changed
MariaDB [testappdb]> show tables;
Empty set (0.000 sec)

MariaDB [testappdb]> show tables;
+---------------------+
| Tables_in_testappdb |
+---------------------+
| department          |
| employee            |
| employee_projects   |
| insurence           |
| project             |
+---------------------+
5 rows in set (0.000 sec)

MariaDB [testappdb]> desc department;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| established | date         | YES  |     | NULL    |       |
| dep_id      | varchar(255) | NO   | PRI | NULL    |       |
| dep_name    | varchar(255) | NO   |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
3 rows in set (0.001 sec)

MariaDB [testappdb]> desc employee;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| age               | int(11)      | NO   |     | NULL    |       |
| salary            | double       | NO   |     | NULL    |       |
| address           | varchar(255) | YES  |     | NULL    |       |
| department_dep_id | varchar(255) | YES  | MUL | NULL    |       |
| empid             | varchar(255) | NO   | PRI | NULL    |       |
| insurence_insid   | varchar(255) | YES  | UNI | NULL    |       |
| name              | varchar(255) | NO   |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+
7 rows in set (0.008 sec)

MariaDB [testappdb]> desc employee_projects;
+-----------------+--------------+------+-----+---------+-------+
| Field           | Type         | Null | Key | Default | Extra |
+-----------------+--------------+------+-----+---------+-------+
| employees_empid | varchar(255) | NO   | MUL | NULL    |       |
| projects_p_id   | varchar(255) | NO   | MUL | NULL    |       |
+-----------------+--------------+------+-----+---------+-------+
2 rows in set (0.008 sec)

MariaDB [testappdb]> desc insurence;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| no_of_years | int(11)      | NO   |     | NULL    |       |
| insid       | varchar(255) | NO   | PRI | NULL    |       |
| pkg_type    | varchar(255) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
3 rows in set (0.001 sec)

MariaDB [testappdb]> desc project;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| dead_line  | date         | YES  |     | NULL    |       |
| start_date | date         | YES  |     | NULL    |       |
| p_id       | varchar(255) | NO   | PRI | NULL    |       |
| p_name     | varchar(255) | NO   |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
4 rows in set (0.001 sec)

MariaDB [testappdb]> 
```
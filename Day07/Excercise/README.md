# Scenario
The University of Vavuniya administration needs a workshop management system to manage the events efficiently. The technical requirement committee decided to use Spring Boot and  MySQL for the system development. The system has been divided into components and assigned to each 3rd year IT student. 
You have been assigned to a task “Model Building”. The following requirements are given to create proper models and, migrate them to a database using proper ORM techniques. 
” The university is arranging many workshops for undergraduates and postgraduates. A workshop contains many presentation sessions done by experts in the field. A session can be presented by many experts. An expert can present for multiple sessions. Mostly, graduates participate in many sessions of the workshops. A sample data file is given to have more understanding of the attributes and data types.”
[Mark 90 %]
After the migration, take a backup of the generated database and display the description of 
each table. [Mark 10 %]

# Solution implementation

## Mysql Output
```sql
MariaDB [(none)]> use testappdb;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
MariaDB [testappdb]> show tables;
+-------------------------+
| Tables_in_testappdb     |
+-------------------------+
| post_graduate           |
| post_graduate_sessions  |
| presenter               |
| presenter_sessions      |
| session                 |
| under_graduate          |
| under_graduate_sessions |
| workshop                |
+-------------------------+
8 rows in set (0.000 sec)

MariaDB [testappdb]> desc post_graduate;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| phone             | int(11)      | YES  |     | NULL    |       |
| email             | varchar(255) | YES  |     | NULL    |       |
| gender            | varchar(255) | YES  |     | NULL    |       |
| id                | varchar(255) | NO   | PRI | NULL    |       |
| institute         | varchar(255) | YES  |     | NULL    |       |
| name              | varchar(255) | YES  |     | NULL    |       |
| research_interest | varchar(255) | YES  |     | NULL    |       |
| second_degree     | varchar(255) | YES  |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+
8 rows in set (0.001 sec)

MariaDB [testappdb]> desc post_graduate_sessions;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| post_graduates_id | varchar(255) | NO   | MUL | NULL    |       |
| sessions_id       | varchar(255) | NO   | MUL | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+
2 rows in set (0.001 sec)

MariaDB [testappdb]> desc presenter;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| phone       | int(11)      | YES  |     | NULL    |       |
| affiliation | varchar(255) | YES  |     | NULL    |       |
| country     | varchar(255) | YES  |     | NULL    |       |
| email       | varchar(255) | YES  |     | NULL    |       |
| gender      | varchar(255) | YES  |     | NULL    |       |
| id          | varchar(255) | NO   | PRI | NULL    |       |
| job_title   | varchar(255) | YES  |     | NULL    |       |
| name        | varchar(255) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
8 rows in set (0.001 sec)

MariaDB [testappdb]> desc presenter_sessions;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| presenters_id | varchar(255) | NO   | MUL | NULL    |       |
| sessions_id   | varchar(255) | NO   | MUL | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
2 rows in set (0.001 sec)

MariaDB [testappdb]> desc session;
+----------------------+--------------+------+-----+---------+-------+
| Field                | Type         | Null | Key | Default | Extra |
+----------------------+--------------+------+-----+---------+-------+
| date                 | date         | YES  |     | NULL    |       |
| time                 | time(6)      | YES  |     | NULL    |       |
| workshop_workshop_id | int(11)      | YES  | MUL | NULL    |       |
| description          | varchar(255) | YES  |     | NULL    |       |
| id                   | varchar(255) | NO   | PRI | NULL    |       |
| name                 | varchar(255) | YES  |     | NULL    |       |
+----------------------+--------------+------+-----+---------+-------+
6 rows in set (0.001 sec)

MariaDB [testappdb]> desc under_graduate;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| phone      | int(11)      | YES  |     | NULL    |       |
| degree     | varchar(255) | YES  |     | NULL    |       |
| email      | varchar(255) | YES  |     | NULL    |       |
| gender     | varchar(255) | YES  |     | NULL    |       |
| id         | varchar(255) | NO   | PRI | NULL    |       |
| name       | varchar(255) | YES  |     | NULL    |       |
| university | varchar(255) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
7 rows in set (0.001 sec)

MariaDB [testappdb]> desc under_graduate_sessions;
+--------------------+--------------+------+-----+---------+-------+
| Field              | Type         | Null | Key | Default | Extra |
+--------------------+--------------+------+-----+---------+-------+
| sessions_id        | varchar(255) | NO   | MUL | NULL    |       |
| under_graduates_id | varchar(255) | NO   | MUL | NULL    |       |
+--------------------+--------------+------+-----+---------+-------+
2 rows in set (0.001 sec)

MariaDB [testappdb]> desc workshop;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| end_date    | date         | YES  |     | NULL    |       |
| start_date  | date         | YES  |     | NULL    |       |
| workshop_id | int(11)      | NO   | PRI | NULL    |       |
| description | varchar(255) | YES  |     | NULL    |       |
| name        | varchar(255) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
5 rows in set (0.001 sec)
```
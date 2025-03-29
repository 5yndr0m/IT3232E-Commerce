# IT3232 Practicals API Documentation

This documentation covers the routes used in the IT3232 practicals.

## Base URL
All endpoints use the base URL: `http://localhost:8080/app/student`

## Endpoints

### Get Student Details
Returns details of a pre-defined student.

**URL**: `/studetails`  
**Method**: `GET`  
**Response**: `200 OK`

Example response:
```json
{
    "name": "Bob",
    "age": 24,
    "regNo": "IT1001",
    "course": "DS",
    "gpa": 3.4
}
```

### Get All Students
Returns details of all students in the list.

**URL**: `/info/all`  
**Method**: `GET`  
**Response**: `200 OK`

Example response:
```json
[
    {
        "name": "Bob",
        "age": 24,
        "regNo": "IT1001",
        "course": "DS",
        "gpa": 3.4
    },
    {
        "name": "Alice",
        "age": 23,
        "regNo": "IT1013",
        "course": "SE",
        "gpa": 3.7
    },
    ...
]
```

### Get Student by ID
Returns details of a specific student by registration number.

**URL**: `/info/{id}`  
**Method**: `GET`  
**Parameters**:
- `id` (path): Registration number of the student (String)

**Response**: `200 OK`

Example request: `/info/IT1001`

Example response:
```json
{
    "name": "Bob",
    "age": 24,
    "regNo": "IT1001",
    "course": "DS",
    "gpa": 3.4
}
```

### Filter Students by Age
Filter the list to find students between specified age range.

**URL**: `/filter/age/{low},{high}`  
**Method**: `GET`  
**Parameters**:
- `low` (path): Lower bound of age range (Integer)
- `high` (path): Upper bound of age range (Integer)

**Response**: `200 OK`

Example request: `/filter/age/20,23`

Example response:
```json
[
    {
        "name": "Alice",
        "age": 23,
        "regNo": "IT1013",
        "course": "SE",
        "gpa": 3.7
    },
    {
        "name": "Jhon",
        "age": 22,
        "regNo": "IT1045",
        "course": "ML",
        "gpa": 3.1
    },
    ...
]
```

### Sort Students by GPA
Returns the list of students sorted by GPA (ascending).

**URL**: `/sort/gpa`  
**Method**: `GET`  
**Response**: `200 OK`

Example response:
```json
[
    {
        "name": "Jack",
        "age": 24,
        "regNo": "IT1030",
        "course": "AI",
        "gpa": 2.9
    },
    {
        "name": "Jhon",
        "age": 22,
        "regNo": "IT1045",
        "course": "ML",
        "gpa": 3.1
    },
    ...
]
```

### Create Student
Creates a new student and adds to the list.

**URL**: `/create/{nm},{ag},{id},{co},{gpa}`  
**Method**: `GET`  
**Parameters**:
- `nm` (path): Student name (String)
- `ag` (path): Student age (Integer)
- `id` (path): Registration number (String)
- `co` (path): Course (String)
- `gpa` (path): GPA (Double)

**Response**: `200 OK`

Example request: `/create/senal,24,IT16017,IT,3.56`

Example response:
```
Student added succesfully
```

### Update Student
Updates a specified student. Tested for one field at a time.

**URL**: `/update/{id},{field},{value}`  
**Method**: `GET`  
**Parameters**:
- `id` (path): Registration number of the student to update (String)
- `field` (path): Field to update ("name", "age", "regNo", "course", "gpa")
- `value` (path): New value for the field (type depends on field)

**Response**: `200 OK`

Example request: `/update/IT16017,Name,Senal`

Example response:
```
Student updated succesfully
```

### Delete Student
Deletes a specified student.

**URL**: `/delete/{id}`  
**Method**: `GET`  
**Parameters**:
- `id` (path): Registration number of the student to delete (String)

**Response**: `200 OK`

Example request: `/delete/IT16017`

Example response:
```
Student removed succesfully
```
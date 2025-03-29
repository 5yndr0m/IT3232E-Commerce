```
{
	"info": {
		"_postman_id": "911a6052-3b3e-4ced-9fc9-7561a63175b2",
		"name": "IT3232Practicals",
		"description": "This collections holds information about the routes used in the practicals",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "34768305"
	},
	"item": [
		{
			"name": "/app/student/studetails",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/studetails",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"studetails"
					]
				},
				"description": "returns details of a pre-defined student"
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/studetails",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"studetails"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "json",
					"header": [
						{
							"key": "Content-Type",
							"value": "application/json"
						},
						{
							"key": "Transfer-Encoding",
							"value": "chunked"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 06:38:01 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "{\n    \"name\": \"Bob\",\n    \"age\": 24,\n    \"regNo\": \"IT1001\",\n    \"course\": \"DS\",\n    \"gpa\": 3.4\n}"
				}
			]
		},
		{
			"name": "/app/student/info/all",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/info/all",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"info",
						"all"
					]
				},
				"description": "returns details of all the students in the list"
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/info/all",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"info",
								"all"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "json",
					"header": [
						{
							"key": "Content-Type",
							"value": "application/json"
						},
						{
							"key": "Transfer-Encoding",
							"value": "chunked"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 06:40:19 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "[\n    {\n        \"name\": \"Bob\",\n        \"age\": 24,\n        \"regNo\": \"IT1001\",\n        \"course\": \"DS\",\n        \"gpa\": 3.4\n    },\n    {\n        \"name\": \"Alice\",\n        \"age\": 23,\n        \"regNo\": \"IT1013\",\n        \"course\": \"SE\",\n        \"gpa\": 3.7\n    },\n    {\n        \"name\": \"Jhon\",\n        \"age\": 22,\n        \"regNo\": \"IT1045\",\n        \"course\": \"ML\",\n        \"gpa\": 3.1\n    },\n    {\n        \"name\": \"Jack\",\n        \"age\": 24,\n        \"regNo\": \"IT1030\",\n        \"course\": \"AI\",\n        \"gpa\": 2.9\n    },\n    {\n        \"name\": \"Brian\",\n        \"age\": 22,\n        \"regNo\": \"IT1060\",\n        \"course\": \"DS\",\n        \"gpa\": 3.6\n    },\n    {\n        \"name\": \"senal\",\n        \"age\": 24,\n        \"regNo\": \"IT16017\",\n        \"course\": \"IT\",\n        \"gpa\": 3.78\n    }\n]"
				}
			]
		},
		{
			"name": "/app/student/info/{id}",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/info/IT1001",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"info",
						"IT1001"
					]
				},
				"description": "returns details of a specific student.\n\n{id} - regNo(String)"
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/info/IT1001",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"info",
								"IT1001"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "json",
					"header": [
						{
							"key": "Content-Type",
							"value": "application/json"
						},
						{
							"key": "Transfer-Encoding",
							"value": "chunked"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 06:43:03 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "{\n    \"name\": \"Bob\",\n    \"age\": 24,\n    \"regNo\": \"IT1001\",\n    \"course\": \"DS\",\n    \"gpa\": 3.4\n}"
				}
			]
		},
		{
			"name": "/app/student/filter/age/{low},{high}",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/filter/age/20,23",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"filter",
						"age",
						"20,23"
					]
				},
				"description": "filter the list to find students between age groups."
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/filter/age/20,23",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"filter",
								"age",
								"20,23"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "json",
					"header": [
						{
							"key": "Content-Type",
							"value": "application/json"
						},
						{
							"key": "Transfer-Encoding",
							"value": "chunked"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 06:46:54 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "[\n    {\n        \"name\": \"Alice\",\n        \"age\": 23,\n        \"regNo\": \"IT1013\",\n        \"course\": \"SE\",\n        \"gpa\": 3.7\n    },\n    {\n        \"name\": \"Jhon\",\n        \"age\": 22,\n        \"regNo\": \"IT1045\",\n        \"course\": \"ML\",\n        \"gpa\": 3.1\n    },\n    {\n        \"name\": \"Brian\",\n        \"age\": 22,\n        \"regNo\": \"IT1060\",\n        \"course\": \"DS\",\n        \"gpa\": 3.6\n    },\n    {\n        \"name\": \"Alice\",\n        \"age\": 23,\n        \"regNo\": \"IT1013\",\n        \"course\": \"SE\",\n        \"gpa\": 3.7\n    },\n    {\n        \"name\": \"Jhon\",\n        \"age\": 22,\n        \"regNo\": \"IT1045\",\n        \"course\": \"ML\",\n        \"gpa\": 3.1\n    },\n    {\n        \"name\": \"Brian\",\n        \"age\": 22,\n        \"regNo\": \"IT1060\",\n        \"course\": \"DS\",\n        \"gpa\": 3.6\n    }\n]"
				}
			]
		},
		{
			"name": "/app/student/sort/gpa",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/sort/gpa",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"sort",
						"gpa"
					]
				},
				"description": "returs the soreted list of the students"
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/sort/gpa",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"sort",
								"gpa"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "json",
					"header": [
						{
							"key": "Content-Type",
							"value": "application/json"
						},
						{
							"key": "Transfer-Encoding",
							"value": "chunked"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 06:48:12 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "[\n    {\n        \"name\": \"Jack\",\n        \"age\": 24,\n        \"regNo\": \"IT1030\",\n        \"course\": \"AI\",\n        \"gpa\": 2.9\n    },\n    {\n        \"name\": \"Jhon\",\n        \"age\": 22,\n        \"regNo\": \"IT1045\",\n        \"course\": \"ML\",\n        \"gpa\": 3.1\n    },\n    {\n        \"name\": \"Bob\",\n        \"age\": 24,\n        \"regNo\": \"IT1001\",\n        \"course\": \"DS\",\n        \"gpa\": 3.4\n    },\n    {\n        \"name\": \"Brian\",\n        \"age\": 22,\n        \"regNo\": \"IT1060\",\n        \"course\": \"DS\",\n        \"gpa\": 3.6\n    },\n    {\n        \"name\": \"Alice\",\n        \"age\": 23,\n        \"regNo\": \"IT1013\",\n        \"course\": \"SE\",\n        \"gpa\": 3.7\n    },\n    {\n        \"name\": \"senal\",\n        \"age\": 24,\n        \"regNo\": \"IT16017\",\n        \"course\": \"IT\",\n        \"gpa\": 3.78\n    }\n]"
				}
			]
		},
		{
			"name": "/app/student/create/{nm},{ag},{id},{co},{gpa}",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/create/senal,24,IT16017,IT,3.56",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"create",
						"senal,24,IT16017,IT,3.56"
					]
				},
				"description": "creates a new student and add to the List.\n\nFollowing are the accepted data types for variables:\n\n{nm} - String(name), {ag} - Int(age), {id} - String(regNo), {co} - String(course), {gpa} - Double(gpa).\n\nReturns a String."
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/create/senal,24,IT16017,IT,3.56",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"create",
								"senal,24,IT16017,IT,3.56"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "plain",
					"header": [
						{
							"key": "Content-Disposition",
							"value": "inline;filename=f.txt"
						},
						{
							"key": "Content-Type",
							"value": "text/plain;charset=UTF-8"
						},
						{
							"key": "Content-Length",
							"value": "25"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 07:03:29 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "Student added succesfully"
				}
			]
		},
		{
			"name": "/app/student/update/{id},{field},{value}",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/update/IT16017,Name,Senal",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"update",
						"IT16017,Name,Senal"
					]
				},
				"description": "updates a specified student. Tested for one field at a time.\n\nneed to provide student regNo as {id}.\n\n{field} and respective {value} can be as follows: name(String), age(int), regNo(String), course(String), gpa(Double)\n\nreturns a string."
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/update/IT16017,Name,Senal",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"update",
								"IT16017,Name,Senal"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "plain",
					"header": [
						{
							"key": "Content-Type",
							"value": "text/plain;charset=UTF-8"
						},
						{
							"key": "Content-Length",
							"value": "27"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 07:04:23 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "Student updated succesfully"
				}
			]
		},
		{
			"name": "/app/student/delete/{id}",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "localhost:8080/app/student/delete/IT16017",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"app",
						"student",
						"delete",
						"IT16017"
					]
				},
				"description": "deletes a specified student.\n\nneed to provide student regNo as {id}.\n\nreturns a string."
			},
			"response": [
				{
					"name": "response",
					"originalRequest": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "localhost:8080/app/student/delete/IT16017",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"app",
								"student",
								"delete",
								"IT16017"
							]
						}
					},
					"status": "OK",
					"code": 200,
					"_postman_previewlanguage": "plain",
					"header": [
						{
							"key": "Content-Type",
							"value": "text/plain;charset=UTF-8"
						},
						{
							"key": "Content-Length",
							"value": "27"
						},
						{
							"key": "Date",
							"value": "Sat, 29 Mar 2025 07:04:54 GMT"
						},
						{
							"key": "Keep-Alive",
							"value": "timeout=60"
						},
						{
							"key": "Connection",
							"value": "keep-alive"
						}
					],
					"cookie": [],
					"body": "Student removed succesfully"
				}
			]
		}
	]
}
```

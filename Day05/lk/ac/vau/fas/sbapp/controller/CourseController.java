package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Course;

@RestController
@RequestMapping("course")
public class CourseController extends CRUDController<String, Course> {
	
	public CourseController() {
		Course ecommerce = new Course("ECommerce", "IT3232", 2, "A.Alex");
		Course webservices = new Course("WebServices", "IT2234", 3, "J.Moriyati");
		Course sqa = new Course("SQA", "IT3132", 1, "J.Doe");

		getMap().put("IT3232", ecommerce);
		getMap().put("IT2234", webservices);
		getMap().put("IT3132", sqa);
	}

}

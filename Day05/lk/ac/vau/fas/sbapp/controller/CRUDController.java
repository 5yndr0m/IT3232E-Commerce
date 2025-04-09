package lk.ac.vau.fas.ict.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CRUDController<K,T> {
	
	private Map<K, T> objects = new HashMap<K, T>();
	
	public Map<K, T> getMap() {
		return objects;
	}
	
	@GetMapping("/")
	public Map<K, T> getAll(){
		return objects;
	}
	
	@GetMapping("/{id}")
	public T getById(@PathVariable("id") K id){
		return objects.get(id);
	}
	
	@PostMapping("/create/{id}")
	public String addObject(@PathVariable("id") K id,@RequestBody T object) {
		try {
			objects.put(id, object);
			return "Object created succesfully";
		} catch(Exception e) {
			return "Error : " + e.getMessage();
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteObject(@PathVariable("id") K id) {
		try {
			if(objects.get(id) != null) {
				objects.remove(id);
				return "Objects deleted succesfully";
			}
			return "404 Couldn't found a objects with that id";
		} catch (Exception e) {
			return "Error : " + e.getMessage();
		}
	}
	
	@PutMapping("/update/{id}")
	public String updateObject(@PathVariable("id") K id, @RequestBody T object) {
		try {
			if(objects.get(id) != null) {
				objects.put(id, object);
				return "Object details updated Successfully";
			}
			return "404 Couldn't find the object";
		} catch(Exception e) {
			return "Error : " + e.getMessage();
		}
	}
}

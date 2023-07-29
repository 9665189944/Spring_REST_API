package RestAPI.SpringRestAPI.controller;

import RestAPI.SpringRestAPI.model.Course;
import RestAPI.SpringRestAPI.model.Product;
import RestAPI.SpringRestAPI.service.CourseService;
import RestAPI.SpringRestAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ProductService service;
    @Autowired
    private CourseService service1;

    @GetMapping("/welcome")
    public String getMessage()
    {
        return "welcome to rest Application";
    }

    @GetMapping("/product")
   public List<Product> getProduct(){
        return service.getProduct();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id)
    {
      return service.getProductById(id);
    }


    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name)
    {
       return service.getProductByName(name);
    }

    //add new Product
    @PostMapping("/product")
    public void addProduct(@RequestBody Product p)
    {
        service.addProduct(p);
    }

    //update
    @PutMapping("/product/{id}")
    public void updateProduct(@RequestBody Product p,@PathVariable int id)
    {
       service.updateProduct(p,id);
    }

    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable int id)
    {
       service.deleteProduct(id);
    }

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return service1.getCourse();
    }

    @GetMapping("/course/{subject}")
    public Course getCourseBySubject(@PathVariable String subject)
    {
        return service1.getCoursesBySubject(subject);
    }

    @GetMapping("/courses/{faculty}")
    public Course getCourseByFaculty(@PathVariable String faculty)
    {
        return service1.getCoursesByFaculty(faculty);
    }

    @PostMapping("/addcourses")
    public void addProduct(@RequestBody Course p) {
        service1.addCourse(p);
    }

    @DeleteMapping("/courses/{batchCode}")
    public void deleteCourse(@PathVariable String batchCode) {
        service1.deleteCourse(batchCode);
    }
}

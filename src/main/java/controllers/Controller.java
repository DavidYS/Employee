package controllers;


import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import repository.AdressesRepository;
import repository.EmployeeRepository;
import repository.WorkplaceRepository;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping
public class Controller {


    @Autowired
    private  Service service;

    @RequestMapping(value="/employee", method = RequestMethod.GET)
    public List<Employee> getAllUsers() {

    return service.getEmployees();

    }

 @RequestMapping(value="employee", method=RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee){

        service.addEmployee(employee);

 }

//    @RequestMapping(value="employeeAdd", method=RequestMethod.POST)
//    public void addEmployee(@RequestParam MultiValueMap<String,String> requestParam){
//       Employee employee;
//       employee.setFirstName(requestParam.get("firstName"));
//       employee.setLastName(requestParam.get("lastName"));
//       service.addEmployee(employee);
//    }
 @RequestMapping(value="employee/{id}", method= RequestMethod.DELETE)
        public void  deleteEmployee(@PathVariable long id){
            service.deleteEmployee(id);
     }

}
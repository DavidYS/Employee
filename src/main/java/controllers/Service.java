package controllers;

import entity.Adresses;
import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import repository.AdressesRepository;
import repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {


    @Autowired
    private AdressesRepository adressesRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    public void addEmployee(Employee employee){
        employee.getAdresses().forEach(address->{
            adressesRepository.save(address);
        });

        employeeRepository.save(employee);
    }
    public void deleteEmployee(long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        employeeRepository.delete(employee.get());
    }
    public void addAddress(Adresses address){
        adressesRepository.save(address);
    }
}

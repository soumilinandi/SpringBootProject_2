package com.example.SpringBootProject_2;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class EmpController2
{  

@RequestMapping("/employee")
String index(){
  //mapped to hostname:port/home/index/
  return "Hello from controller1";
}
}



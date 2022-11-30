package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dockerforjavadevelopers.hello.MemoryLeakNoOOMDemo;
@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() throws Exception {
        MemoryLeakNoOOMDemo leaker = new MemoryLeakNoOOMDemo();
        leaker.start();
        return "Hello World\n";
    }
}

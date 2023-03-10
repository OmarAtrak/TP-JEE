package ma.pfe.controllers;

import ma.pfe.dto.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOG = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService service;

    StudentController(StudentService servic){
        this.service = service;
    }

    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto dto) {
        return service.create(dto);
    }

    @PutMapping
    public StudentDto updeate(@RequestBody StudentDto dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        return service.delete((id));
    }

    @GetMapping
    public List<StudentDto> selectAll(){
        return service.readAll();
    }
}

package com.tpe.controller;

import com.tpe.domain.Teacher;
import com.tpe.dto.Teacherdto;
import com.tpe.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    //http://localhost:8080/teachers/save

    @GetMapping("selamlama")
    public String selamSpringBoot(){
        return "hello spring boot";
    }

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/save")
    public ResponseEntity<String>saveTeacher(@Valid @RequestBody Teacherdto teacherdto){
        teacherService.saveTeacher(teacherdto);
        return new ResponseEntity<>("Teacher saved succesfully", HttpStatus.CREATED);
    }

    @GetMapping("/page")
    public ResponseEntity<Page<Teacher>>getAllTeacherByPage(@RequestParam("page")int page,
                                                            @RequestParam("size")int size,
                                                            @RequestParam("sort")String prop,
                                                            @RequestParam("direction")Sort.Direction direction
                                                            ){
        Pageable pageable= PageRequest.of(page-1,size,Sort.by(direction,prop));
        Page<Teacher>teacherByPage=teacherService.getAllTeacherByPage(pageable);
        return new ResponseEntity<>(teacherByPage,HttpStatus.OK);
    }
}

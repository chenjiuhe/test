package com.jb.test;


import com.jb.domain.Student;
import com.jb.service.StudentService;
import com.jb.service.impl.StudentServiceImpl;
import com.jb.util.ServiceFactory;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());

//        Student s = new Student();
//        s.setId("A0007");
//        s.setName("xxx");
//        s.setAge(30);
//        ss.save(s);

//        Student s = ss.getById("A0007");
//        System.out.println(s);

        List<Student> aList = ss.getAll();
        for (Student s :aList) {
            System.out.println(s);
        }

    }
}

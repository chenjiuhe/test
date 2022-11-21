package com.jb.service.impl;

import com.jb.dao.StudentDao;
import com.jb.domain.Student;
import com.jb.service.StudentService;
import com.jb.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);


    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }

    @Override
    public List<Student> getAll() {
        List<Student> sList = studentDao.getAll();
        return sList;
    }
}

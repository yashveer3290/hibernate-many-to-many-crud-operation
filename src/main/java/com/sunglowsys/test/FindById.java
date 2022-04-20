package com.sunglowsys.test;

import com.sunglowsys.domain.Teacher;
import com.sunglowsys.service.TeacherServiceImpl;

public class FindById {
    public static void main(String[] args) {
        Teacher teacher = new TeacherServiceImpl().findById(1L);
        System.out.println(teacher);
    }
}

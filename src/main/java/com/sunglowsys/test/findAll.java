package com.sunglowsys.test;

import com.sunglowsys.domain.Teacher;
import com.sunglowsys.service.TeacherServiceImpl;

import java.util.List;

public class findAll {
    public static void main(String[] args) {
        List<Teacher> teacherList = new TeacherServiceImpl().findAll();
            for (Teacher teacher : teacherList) {

                System.out.println(teacher);
            }
    }
}

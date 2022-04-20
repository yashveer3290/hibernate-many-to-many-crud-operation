package com.sunglowsys.test;

import com.sunglowsys.domain.Teacher;
import com.sunglowsys.service.TeacherServiceImpl;

public class UpdateTeacher {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setFirstName("Gagan");
        teacher.setLastName("PratapSingh");
        teacher.setEmail("g01122@gamil.com");
        teacher.setMobile("8989898989");
        teacher.setDesignation("Goverment_Teacher");
        new TeacherServiceImpl().update(teacher,2L);
        System.out.println("updated");
    }
}

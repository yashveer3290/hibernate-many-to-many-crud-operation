package com.sunglowsys.test;

import com.sunglowsys.service.TeacherServiceImpl;

public class DeleteById {
    public static void main(String[] args) {
        new TeacherServiceImpl().delete(4L);
    }
}

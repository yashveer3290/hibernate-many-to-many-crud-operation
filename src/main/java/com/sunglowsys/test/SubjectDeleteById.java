package com.sunglowsys.test;
import com.sunglowsys.service.SubjectServiceImpl;

public class SubjectDeleteById {
    public static void main(String[] args) {
        new SubjectServiceImpl().delete(3L);
    }
}

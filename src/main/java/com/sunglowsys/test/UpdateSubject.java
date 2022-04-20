package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.service.SubjectServiceImpl;

public class UpdateSubject {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setSubjectName("Biology");
        subject.setSubjectCode("Bh22");
        new SubjectServiceImpl().update(subject,1L);
    }
}

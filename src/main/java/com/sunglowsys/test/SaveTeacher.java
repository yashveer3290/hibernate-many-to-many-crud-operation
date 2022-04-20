package com.sunglowsys.test;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.domain.Teacher;
import com.sunglowsys.service.TeacherServiceImpl;

import java.util.HashSet;
import java.util.Set;

public class SaveTeacher {

    public static void main(String[] args) {

        Subject subject1 = new Subject("Airthmetics","M332b");
        Subject subject2 = new Subject("Science","Sh55");
        Subject subject3 = new Subject("English","En449");

        Set<Subject> subjects = new HashSet<>();

        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);

        Teacher teacher1 = new Teacher("Rakesh","Kumar","r01122@gmail.com","8998899889","Guest_Teacher");
        teacher1.setSubjects(subjects);
        Teacher teacher2 = new Teacher("CL","singh","cl01133@gmail.com","7878787878","Teacher");
        teacher2.setSubjects(subjects);

        Teacher teacher = new TeacherServiceImpl().save(teacher2);
        System.out.println(teacher1);

        Teacher teacher3 = new TeacherServiceImpl().save(teacher1);
        System.out.println(subject1);
    }
}

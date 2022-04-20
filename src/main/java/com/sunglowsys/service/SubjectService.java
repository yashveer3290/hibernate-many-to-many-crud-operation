package com.sunglowsys.service;

import com.sunglowsys.domain.Subject;

import java.util.List;

public interface SubjectService {

    Subject save(Subject subject);

    Subject update(Subject subject,Long id);

    List<Subject> findAll();

    Subject findById(Long id);

    void delete(Long id);
}

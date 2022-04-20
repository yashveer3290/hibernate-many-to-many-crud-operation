package com.sunglowsys.repository;

import com.sunglowsys.domain.Subject;

import java.util.List;

public interface SubjectRepository {

    Subject save(Subject subject);

    Subject update(Subject subject,Long id);

    List<Subject> findAll();

    Subject findById(Long id);

    void delete(Long id);
}

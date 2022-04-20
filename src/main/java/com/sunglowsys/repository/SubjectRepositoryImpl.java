package com.sunglowsys.repository;

import com.sunglowsys.domain.Subject;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class SubjectRepositoryImpl implements SubjectRepository{

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Subject save(Subject subject) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(subject);
        session.getTransaction().commit();
        session.close();
        return subject;
    }

    @Override
    public Subject update(Subject subject, Long id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Subject subject1 = session.get(Subject.class,id);
        subject1.setSubjectName(subject.getSubjectName());
        subject1.setSubjectCode(subject.getSubjectCode());
        session.getTransaction().commit();
        session.close();
        return subject;
    }

    @Override
    public List<Subject> findAll() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Subject");
        List<Subject> subjectList = query.list();
        session.getTransaction().commit();
        session.close();
        return subjectList;
    }

    @Override
    public Subject findById(Long id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Subject subject = session.get(Subject.class,id);
        session.getTransaction().commit();
        session.close();
        return subject;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Subject subject = session.get(Subject.class,id);
        session.delete(session);
        session.getTransaction().commit();
        session.close();

    }
}

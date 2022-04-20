package com.sunglowsys.repository;

import com.sunglowsys.domain.Teacher;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TeacherRepositoryImpl implements TeacherRepository{

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Teacher save(Teacher teacher) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(teacher);
        session.getTransaction().commit();
        session.close();
        return teacher;
    }

    @Override
    public Teacher update(Teacher teacher, Long id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher1 = session.get(Teacher.class,id);
        teacher1.setFirstName(teacher.getFirstName());
        teacher1.setLastName(teacher.getLastName());
        teacher1.setEmail(teacher.getEmail());
        teacher1.setMobile(teacher.getMobile());
        teacher1.setDesignation(teacher.getDesignation());
        session.getTransaction().commit();
        session.close();
        return teacher;
    }

    @Override
    public List<Teacher> findAll() {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Teacher");
        List<Teacher> teacherList = query.list();
        session.getTransaction().commit();
        session.close();
        return teacherList;
    }

    @Override
    public Teacher findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher = session.get(Teacher.class,id);
        session.getTransaction().commit();
        session.close();


        return teacher;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher teacher = session.get(Teacher.class, id);
        session.delete(teacher);
        session.getTransaction().commit();
        session.close();

    }
}

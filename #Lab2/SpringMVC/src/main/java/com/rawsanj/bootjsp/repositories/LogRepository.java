package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class LogRepository implements ILogRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public LogRepository() {
    }

    @Override
    public List<Log> getAll() {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            List<Log> logs = session.createCriteria(Log.class).list();
            session.getTransaction().commit();
            return logs;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Log get(int id) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Log log = (Log) session.get(Log.class, id);
            session.getTransaction().commit();
            return log;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void add(Log log) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Integer id = (Integer) session.save(log);
            System.out.println("Successfully create log with id - " + id);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
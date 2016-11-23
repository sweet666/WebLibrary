package by.safronenko.weblibrary.dao.impl;

import by.safronenko.weblibrary.entities.Genre;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import by.safronenko.weblibrary.dao.interfaces.GenreDAO;

import java.util.List;

@Component
public class GenreDAOImpl implements GenreDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Genre> getGenres() {
        return sessionFactory.getCurrentSession().createCriteria(Genre.class).list();
    }





}

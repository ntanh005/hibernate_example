package com.ntanh.example.HibernateExample;

import org.hibernate.Session;

import com.ntanh.example.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("0001");
        stock.setStockName("ntanh");

        session.save(stock);
        session.getTransaction().commit();
    }
}

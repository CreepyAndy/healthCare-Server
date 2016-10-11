package com.xia.services;

import java.util.List;

import javax.jws.WebService;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.xia.model.BasicIndex;
import com.xia.model.Employee;
import com.xia.model.EstimateStatus;
import com.xia.model.LivingConditions;

@WebService(endpointInterface = "com.xia.services.QueryInfo")
public class QueryInfoImpl implements QueryInfo {

	@Override
	public List<Employee> queryPersonalInfoById() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query q = session.createSQLQuery("select * from t_employee").addEntity(
				Employee.class);
		List<Employee> rs = q.list();
		return rs;
	}

	@Override
	public EstimateStatus queryEstimateStatusById(int id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		EstimateStatus e = (EstimateStatus) session.load(EstimateStatus.class,
				id);
		return e;
	}

	@Override
	public void registerLivingConditions(LivingConditions livingConditions) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(livingConditions);
	}

	@Override
	public BasicIndex queryBasicIndexById(String id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		BasicIndex b;
		Query q = session.createSQLQuery(
				"select * from t_basic_index where employee_id="
						+ Integer.parseInt(id)).addEntity(BasicIndex.class);
		List<BasicIndex> rs = q.list();
		b = rs.get(0);
		return b;
	}

	@Override
	public void updateBasicIndexById(String id, String heartRate,
			String height, String oxygen, String weight) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		BasicIndex basicIndex = new BasicIndex();

		Query q = session.createSQLQuery(
				"select * from t_basic_index where employee_id="
						+ Integer.parseInt(id)).addEntity(BasicIndex.class);
		List<BasicIndex> rs = q.list();
		if (!rs.isEmpty()) {
			basicIndex = rs.get(0);
			basicIndex.setHeartRate(Double.parseDouble(heartRate));
			basicIndex.setHeight(Double.parseDouble(height));
			basicIndex.setOxygenContent(Double.parseDouble(oxygen));
			basicIndex.setWeight(Double.parseDouble(weight));
			session.update(basicIndex);
			session.getTransaction().commit();
		}else{
			Employee e = (Employee) session.load(Employee.class,Integer.parseInt(id));
			System.out.println(e.getId());
			basicIndex.setEmployee(e);
			basicIndex.setHeartRate(Double.parseDouble(heartRate));
			basicIndex.setHeight(Double.parseDouble(height));
			basicIndex.setOxygenContent(Double.parseDouble(oxygen));
			basicIndex.setWeight(Double.parseDouble(weight));
			session.save(basicIndex);
			session.getTransaction().commit();
		}
	}

}

package many_to_many_dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_dto.Student;
import many_to_many_dto.Teacher;

public class TeacherMainDriver {
	public static void main(String[] args) {

		Teacher t1 = new Teacher();
		t1.setId(1);
		t1.setName("rahul");
		t1.setEmail("rahul@gmail");

		Teacher t2 = new Teacher();
		t2.setId(2);
		t2.setName("kohli");
		t2.setEmail("k@gmail");

		Teacher t3 = new Teacher();
		t3.setId(3);
		t3.setName("dhoni");
		t3.setEmail("dl@gmail");

		Student s1 = new Student();
		s1.setId(9);
		s1.setName("root");
		s1.setEmail("root@");

		Student s2 = new Student();
		s2.setId(8);
		s2.setName("root");
		s2.setEmail("root@");

		Student s3 = new Student();
		s3.setId(7);
		s3.setName("ricky");
		s3.setEmail("rickuy@");

		List<Teacher> list1 = new ArrayList();

		list1.add(t2);
		list1.add(t1);
		s1.setLists(list1);

		List<Teacher> list2 = new ArrayList();

		list2.add(t1);
		list2.add(t2);
		s2.setLists(list2);

		List<Teacher> list3 = new ArrayList();

		list3.add(t3);
		list3.add(t2);
		s3.setLists(list3);

		List<Student> l = new ArrayList();
		l.add(s3);
		l.add(s2);
		t1.setStudents(l);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(t1);
		em.persist(t2);
		em.persist(t3);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();

	}

}

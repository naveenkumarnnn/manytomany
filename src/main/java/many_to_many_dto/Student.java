package many_to_many_dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	private int id ;
	private String name;
	private String email;
	private int phone;
	
	@ManyToMany
	private List<Teacher>lists;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<Teacher> getLists() {
		return lists;
	}

	public void setLists(List<Teacher> lists) {
		this.lists = lists;
	}
	
	
	

}

package cz.sizi.bikeo.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Role {

	/**
	 * Attributes
	 * */
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(min = 3, max = 60)
	private String name;
	
	private boolean enabled;

	@NotEmpty
	@ManyToMany(mappedBy = "roles")
	private Set<User> users;

	/**
	 * Getters and setters
	 * */
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}

package br.com.cursoJsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.DaoGeneric;
import br.com.entities.Person;

@ViewScoped
@ManagedBean(name = "personBean")

public class PersonBean {

	private Person person = new Person();
	private DaoGeneric<Person> daoGeneric = new DaoGeneric<Person>();
	private List<Person> persons = new ArrayList<Person>();

	public String save() {

		person = daoGeneric.merge(person);
		loadPerson();
		return "";

	}

	public String novo() {
		person = new Person();

		return "";

	}

	@PostConstruct
	public void loadPerson() {
		persons = daoGeneric.getListEntity(Person.class);

	}

	public String remove() {
		daoGeneric.deletePorId(person);
		person = new Person();
		loadPerson();
		return "";
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public DaoGeneric<Person> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Person> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}

	public List<Person> getPersons() {
		return persons;
	}

}

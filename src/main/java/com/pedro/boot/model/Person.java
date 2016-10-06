package com.pedro.boot.model;

public class Person {
	
	private String name;
	private Integer account;
	private Double salary;
	
	public Person(){
		super();
	}
	
	public Person(String nameInput, Integer accountInput, Double salaryInput){
		this.name = nameInput;
		this.account = accountInput;
		this.salary = salaryInput;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the account
	 */
	public Integer getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Integer account) {
		this.account = account;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}

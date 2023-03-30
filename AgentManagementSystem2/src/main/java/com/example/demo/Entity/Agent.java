package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {

	@Id
	private int Agent_Id;
	private String Agent_Name;
	private int Agent_Salary;
	
	public int getAgent_Id() {
		return Agent_Id;
	}
	public void setAgent_Id(int agent_Id) {
		Agent_Id = agent_Id;
	}
	public String getAgent_Name() {
		return Agent_Name;
	}
	public void setAgent_Name(String agent_Name) {
		Agent_Name = agent_Name;
	}
	public int getAgent_Salary() {
		return Agent_Salary;
	}
	public void setAgent_Salary(int agent_Salary) {
		Agent_Salary = agent_Salary;
	}
	public Agent(int agent_Id, String agent_Name, int agent_Salary) {
		super();
		Agent_Id = agent_Id;
		Agent_Name = agent_Name;
		Agent_Salary = agent_Salary;
	}
	public Agent() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

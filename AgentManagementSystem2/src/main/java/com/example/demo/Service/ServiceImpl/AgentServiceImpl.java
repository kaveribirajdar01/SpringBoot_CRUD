package com.example.demo.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Agent;
import com.example.demo.Repository.AgentRepository;
import com.example.demo.Service.AgentService;

@Repository
public class AgentServiceImpl implements AgentService{

	@Autowired
	AgentRepository agentRepository;
	
	@Override
	public Agent createAgent(Agent agent) {
		return agentRepository.save(agent);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Agent> getAllAgent() {
		// TODO Auto-generated method stub
		return agentRepository.findAll();
	}

	@Override
	public void deleteAgent(int agent_id) {
		// TODO Auto-generated method stub
		 agentRepository.deleteById(agent_id);
	}

	@Override
	public Agent updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		Agent _agent=agentRepository.findById(agent.getAgent_Id()).get();
		_agent.setAgent_Id(agent.getAgent_Id());
		_agent.setAgent_Name(agent.getAgent_Name());
		_agent.setAgent_Salary(agent.getAgent_Salary());
		agentRepository.save(_agent);
		return _agent;		
	}

	@Override
	public Agent findAgentById(int agent_id) {
		// TODO Auto-generated method stub
		return agentRepository.findById(agent_id).get();
	}
}

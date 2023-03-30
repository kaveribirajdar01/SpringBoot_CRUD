package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Agent;
import com.example.demo.Service.AgentService;

@RestController
public class AgentController {

	@Autowired
	AgentService agentService;
	
	@PostMapping(value="/agents")
	public Agent createAgent(@RequestBody Agent agent)
	{
		return agentService.createAgent(agent);
	}
	
	@GetMapping(value = "/agents")
	public List<Agent> getAllAgentS()
	{
		return agentService.getAllAgent();
	}
	@GetMapping("/agents/{agent_id}")
	public Agent findAgentById(@PathVariable int agent_id)
	{
		return agentService.findAgentById(agent_id);
		
	}
	@PutMapping(value = "/agents")
	public Agent updateAgent(@RequestBody Agent agent)
	{
		return agentService.updateAgent(agent);
	}
	@DeleteMapping(value = "/agents/{agent_id}")
	public String deleteAgents(@PathVariable int agent_id)
	{
		agentService.deleteAgent(agent_id);
		return "Agent is deleted";
	}	
}

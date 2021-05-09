package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobPositionService;
import hrms.hrms.entities.conretes.JobPosition;

@RestController
@RequestMapping

public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
		
	}
	
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
	

}

package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobPositionService;
import hrms.hrms.dataAccess.abstracts.JobPositionDao;
import hrms.hrms.entities.conretes.JobPosition;

 @Service
public class JobPositionManager implements JobPositionService {

	
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao)
	{
		this.jobPositionDao=jobPositionDao;
	}
	
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

}

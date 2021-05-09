package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.conretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}

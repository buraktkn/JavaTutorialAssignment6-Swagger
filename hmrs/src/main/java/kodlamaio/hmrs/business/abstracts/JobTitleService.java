package kodlamaio.hmrs.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.hmrs.entities.concretes.JobTitle;

public interface JobTitleService {
	
	void save(JobTitle jobTitle);
	List<JobTitle> findAll();
	Optional<JobTitle> findOneByTitle(String title);
	
}

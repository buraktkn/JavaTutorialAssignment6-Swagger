package kodlamaio.hmrs.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kodlamaio.hmrs.business.abstracts.JobTitleService;
import kodlamaio.hmrs.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hmrs.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	private JobTitleDao jobTitleDao;
	
	
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public void save(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		
	}

	@Override
	public List<JobTitle> findAll() {
		
		return this.jobTitleDao.findAll();
	}

	@Override
	public Optional<JobTitle> findOneByTitle(String title) {
		
		return this.jobTitleDao.findOneByTitle(title);
	}

}

package kodlamaio.hmrs.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs.business.abstracts.JobTitleService;
import kodlamaio.hmrs.entities.concretes.JobTitle;

@RestController
@RequestMapping(path="api/jobtitles")
public class JobTitleController {
	private JobTitleService jobTitleService;
	
	public void JobTitlesController(JobTitleService jobTitleService) {
        this.jobTitleService = jobTitleService;
    }
	
	@GetMapping(path="getall")
	public List<JobTitle> getAll(){
		
		return this.jobTitleService.findAll();
	}
	
}

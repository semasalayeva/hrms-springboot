package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobTitle;
import kodlamaio.hrms.entities.dtos.JobTitleDto;

import java.util.List;

public interface JobTitleService {
   DataResult<List<JobTitle>> getAll();
   Result add(JobTitleDto jobTitleDto);
}

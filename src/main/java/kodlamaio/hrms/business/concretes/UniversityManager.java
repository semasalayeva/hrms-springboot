package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UniversityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAcces.UniversityDao;
import kodlamaio.hrms.entities.concretes.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityManager implements UniversityService {
    private UniversityDao universityDao;

    @Autowired
    public UniversityManager(UniversityDao universityDao) {
        this.universityDao = universityDao;
    }


    @Override
    public DataResult<List<University>> getAll() {
        return new SuccessDataResult<>(universityDao.findAll());
    }

    @Override
    public Result add(University university) {
        universityDao.save(university);
        return new SuccessResult("ekleme islemi tamamlandi");
    }
}

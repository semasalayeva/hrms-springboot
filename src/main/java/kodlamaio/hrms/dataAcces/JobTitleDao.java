package kodlamaio.hrms.dataAcces;

import kodlamaio.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

}

package kodlamaio.hrms.dataAcces;

import kodlamaio.hrms.entities.concretes.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image, Integer> {
    Image findById(int id);
}

package pl.edu.wszib.springjpa.cv;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.CV;

@Repository
public interface CvRepository extends JpaRepository<CV, Integer> {

}

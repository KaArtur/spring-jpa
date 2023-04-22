package pl.edu.wszib.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.Gatunek;

@Repository
public interface GatunekRepository extends JpaRepository<Gatunek, Integer> {
}

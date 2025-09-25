package repositories;

import entities.StatusNota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<StatusNota, Long> {
}

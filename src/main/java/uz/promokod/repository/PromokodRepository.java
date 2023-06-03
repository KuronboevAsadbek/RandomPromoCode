package uz.promokod.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.promokod.enumuration.PromokodEnum;
import uz.promokod.model.Promokod;

public interface PromokodRepository extends JpaRepository<Promokod, Long> {
    //

    Promokod findByNumber(String promokod);
}

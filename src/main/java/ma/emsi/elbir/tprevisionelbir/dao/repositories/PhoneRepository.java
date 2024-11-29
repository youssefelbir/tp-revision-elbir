package ma.emsi.elbir.tprevisionelbir.dao.repositories;



import ma.emsi.elbir.tprevisionelbir.dao.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Integer> {
    public  Phone findByModel(String model);
    public Phone findByModelAndPrice(String model, Float price);
    Phone deleteByIdPhone(Integer id);
    Optional<Phone> findByIMEI(Integer IMEI);
}



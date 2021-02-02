package car_dealer.spring_ws.repository;

import car_dealer.spring_ws.models.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {

    BrandEntity getBrandEntityByName(String brandName);
}

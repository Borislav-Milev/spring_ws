package car_dealer.spring_ws;

import car_dealer.spring_ws.models.entity.BaseEntity;
import car_dealer.spring_ws.models.entity.BrandEntity;
import car_dealer.spring_ws.models.entity.ModelEntity;
import car_dealer.spring_ws.models.entity.enums.ModelCategoryEnum;
import car_dealer.spring_ws.repository.BrandRepository;
import car_dealer.spring_ws.repository.ModelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.List;

@Component
public class DBInit implements CommandLineRunner {

    private final ModelRepository modelRepository;
    private final BrandRepository brandRepository;

    public DBInit(ModelRepository modelRepository, BrandRepository brandRepository) {
        this.modelRepository = modelRepository;
        this.brandRepository = brandRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }

    private static void setCurrentTimestamps(BaseEntity entity) {
        entity.setCreated(Instant.now());
        entity.setUpdated(Instant.now());
    }

    private ModelEntity initModel(BrandEntity brand) {

        return null;
    }
}

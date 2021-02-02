package car_dealer.spring_ws.service.contracts;

import car_dealer.spring_ws.models.views.BrandViewModel;

import java.util.List;

public interface BrandService {

    List<BrandViewModel> getAllBrands();
}

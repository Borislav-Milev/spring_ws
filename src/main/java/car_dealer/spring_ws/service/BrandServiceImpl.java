package car_dealer.spring_ws.service;

import car_dealer.spring_ws.models.entity.BrandEntity;
import car_dealer.spring_ws.models.entity.ModelEntity;
import car_dealer.spring_ws.models.views.BrandViewModel;
import car_dealer.spring_ws.models.views.ModelViewModel;
import car_dealer.spring_ws.repository.BrandRepository;
import car_dealer.spring_ws.repository.ModelRepository;
import car_dealer.spring_ws.service.contracts.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    public BrandServiceImpl(ModelRepository modelRepository, ModelMapper modelMapper) {
        this.modelRepository = modelRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<BrandViewModel> getAllBrands() {
        List<BrandViewModel> result = new ArrayList<>();
        List<ModelEntity> allModels = this.modelRepository.findAll();

        allModels.forEach(me -> {
            BrandEntity brandEntity = me.getBrand();
            Optional<BrandViewModel> brandViewModelOpt = findByName(result, brandEntity.getName());
            if(brandViewModelOpt.isEmpty()){
                BrandViewModel newBrandViewModel = new BrandViewModel();
                this.modelMapper.map(brandEntity, newBrandViewModel);
                result.add(newBrandViewModel);
                brandViewModelOpt = Optional.of(newBrandViewModel);
            }
            ModelViewModel newModelViewModel = new ModelViewModel();
            this.modelMapper.map(me, ModelViewModel.class);
            brandViewModelOpt.get().addModel(newModelViewModel);
        });
        return result;
    }

    private static Optional<BrandViewModel> findByName(List<BrandViewModel> allModels, String name){
        return allModels.stream().filter(m -> m.getName().equals(name)).findAny();
    }
}

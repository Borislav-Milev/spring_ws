package car_dealer.spring_ws.models.views;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class BrandViewModel {

    public BrandViewModel() {
        this.models = new ArrayList<>();
    }

    public BrandViewModel(String name) {
        this();
        this.name = name;
    }

    private String name;

    private List<ModelViewModel> models;

    public BrandViewModel addModel(ModelViewModel modelViewModel){
        this.models.add(modelViewModel);
        return this;
    }
}

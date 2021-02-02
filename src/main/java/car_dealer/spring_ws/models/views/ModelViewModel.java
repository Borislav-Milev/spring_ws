package car_dealer.spring_ws.models.views;

import car_dealer.spring_ws.models.entity.BrandEntity;
import car_dealer.spring_ws.models.entity.enums.ModelCategoryEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class ModelViewModel {

    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategoryEnum category;

    private Integer startYear;

    private Integer endYear;

    @Size(min = 8, max = 512)
    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    @ToString.Exclude
    private BrandViewModel brand;
}

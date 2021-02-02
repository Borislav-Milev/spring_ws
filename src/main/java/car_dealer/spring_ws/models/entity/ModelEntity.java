package car_dealer.spring_ws.models.entity;

import car_dealer.spring_ws.models.entity.enums.ModelCategoryEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "models")
public class ModelEntity extends BaseEntity{

    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategoryEnum category;

    private Integer startYear;

    private Integer endYear;

    @Size(min = 8, max = 512)
    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    @ManyToOne
    @ToString.Exclude
    private BrandEntity brand;
}

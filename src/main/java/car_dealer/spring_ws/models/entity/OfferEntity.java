package car_dealer.spring_ws.models.entity;

import car_dealer.spring_ws.models.entity.enums.EngineEnum;
import car_dealer.spring_ws.models.entity.enums.TransmissionEnum;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "offers")
public class OfferEntity extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private EngineEnum engineEnum;

    private String imageUrl;

    private Double mileage;

    private BigDecimal price;


    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmissionEnum;

    @ManyToOne
    @ToString.Exclude
    private ModelEntity modelEntity;

    @ManyToOne
    @ToString.Exclude
    private UserEntity user;
}

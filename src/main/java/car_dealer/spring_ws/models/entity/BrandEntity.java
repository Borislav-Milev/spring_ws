package car_dealer.spring_ws.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brands")
public class BrandEntity extends BaseEntity{

    @Column(unique = true, nullable = false)
    private String name;


    @Override
    public String toString() {
        return "BrandEntity{" +
                "created=" + created +
                ", updated=" + updated +
                ", name='" + name + '\'' +
                '}';
    }
}

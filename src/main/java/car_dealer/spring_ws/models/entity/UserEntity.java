package car_dealer.spring_ws.models.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Data
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    public UserEntity(){
        this.userRoles = new ArrayList<>();
    }

    public UserEntity(String username, String firstName, String lastName,
                      boolean isActive, @Size(min = 8, max = 512) String imageUrl) {
        this();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.imageUrl = imageUrl;
    }

    private String username;

    private String firstName;

    private String lastName;

    private boolean isActive;

    @Size(min = 8, max = 512)
    @Column(columnDefinition = "TEXT")
    private String imageUrl;

    @ManyToMany
    @ToString.Exclude
    private List<UserRoleEntity> userRoles;

}

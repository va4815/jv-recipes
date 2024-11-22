import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Ingredient {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer quantity;

    @Column
    private Integer unitOfMeasurement;

}

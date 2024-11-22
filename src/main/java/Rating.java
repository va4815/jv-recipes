import jakarta.persistence.*;

@Entity
@Table (name = "recipeRating")
public class Rating {

    //id, value (e.g. 1-5 stars), date rated, associated recipe, rater (User)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String starValue;

    @Column
    private String dateRated;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "recipeId")
    private Recipe associatedRecipe;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "userId")
    private User rater;

    public Rating(String value, User rater, String dateRated, Recipe associatedRecipe) {
        this.starValue = value;
        this.rater = rater;
        this.dateRated = dateRated;
        this.associatedRecipe = associatedRecipe;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }

    public String getDateRated() {
        return dateRated;
    }

    public void setDateRated(String dateRated) {
        this.dateRated = dateRated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getRater() {
        return rater;
    }

    public void setRater(User rater) {
        this.rater = rater;
    }

    public String getValue() {
        return starValue;
    }

    public void setValue(String value) {
        this.starValue = value;
    }
}

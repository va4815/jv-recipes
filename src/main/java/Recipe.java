import jakarta.persistence.*;

@Entity
@Table
public class Recipe {

    public Recipe(Integer id, String title, String cookingTime, User creator, String dateCreated, String description, Integer difficultyLevel, String instructions, String lastModified, String listOfCategories, String listOfIngredients, String preparationTime, Integer rating, Integer servings) {
        this.id = id;
        this.title = title;
        this.cookingTime = cookingTime;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.instructions = instructions;
        this.lastModified = lastModified;
        this.listOfCategories = listOfCategories;
        this.listOfIngredients = listOfIngredients;
        this.preparationTime = preparationTime;
        this.rating = rating;
        this.servings = servings;
    }

    @Id
    private Integer id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String instructions;

    @Column
    private String preparationTime;

    @Column
    private String cookingTime;

    @Column
    private Integer servings;

    @Column
    private Integer difficultyLevel;

    @Column
    private Integer rating;

    @Column
    private String listOfIngredients;

    @Column
    private String listOfCategories;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "id", insertable=false, updatable=false)
    private User creator;

    @Column
    private String dateCreated;

    @Column
    private String lastModified;

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getListOfCategories() {
        return listOfCategories;
    }

    public void setListOfCategories(String listOfCategories) {
        this.listOfCategories = listOfCategories;
    }

    public String getListOfIngredients() {
        return listOfIngredients;
    }

    public void setListOfIngredients(String listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "cookingTime='" + cookingTime + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", instructions='" + instructions + '\'' +
                ", preparationTime='" + preparationTime + '\'' +
                ", servings=" + servings +
                ", difficultyLevel=" + difficultyLevel +
                ", rating=" + rating +
                ", listOfIngredients='" + listOfIngredients + '\'' +
                ", listOfCategories='" + listOfCategories + '\'' +
                ", creator=" + creator +
                ", dateCreated='" + dateCreated + '\'' +
                ", lastModified='" + lastModified + '\'' +
                '}';
    }
}

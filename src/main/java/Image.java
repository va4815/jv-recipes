import jakarta.persistence.*;

@Entity
@Table
public class Image {

    //id, filename, file data, associated recipe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String fileData;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "recipeId")
    private Recipe associatedRecipe;

    public Image(Recipe associatedRecipe, String fileData) {
        this.associatedRecipe = associatedRecipe;
        this.fileData = fileData;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

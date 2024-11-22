import jakarta.persistence.*;

@Entity
@Table
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String text;

    @Column
    private String datePosted;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user_id")
    private User author;

    @Column
    private String associatedRecipe;

    public Comment(String text, String datePosted, User author, String associatedRecipe) {
        this.text = text;
        this.datePosted = datePosted;
        this.author = author;
        this.associatedRecipe = associatedRecipe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(String associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }
}

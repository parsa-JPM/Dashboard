package ir.codefather.dashboard.modules.post.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PostType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;

    @OneToMany(mappedBy = "postType")
    private List<Post> posts = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

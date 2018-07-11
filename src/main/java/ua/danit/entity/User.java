package ua.danit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {
  private int id;
  private String name;
  private String photo;
  private Boolean liked;

  public User(int id, String name, String photo, Boolean userLiked) {
    this.id = id;
    this.name = name;
    this.photo = photo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

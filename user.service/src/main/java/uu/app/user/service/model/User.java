package uu.app.user.service.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private Long id;
    private String name;
    private String email;
}
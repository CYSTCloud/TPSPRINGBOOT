package tp0.tpspringboot.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String firstname;

    @Column(unique = true)
    private String username;

    private String email;
    private LocalDate birthDate;
    private String avatarUrl;
}
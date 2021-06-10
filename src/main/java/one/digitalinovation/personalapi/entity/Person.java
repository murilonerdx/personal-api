package one.digitalinovation.personalapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinovation.personalapi.enums.PhoneType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String firstName;
    @Column(nullable=false)
    private String lastName;
    @Column(nullable=false, unique=true)
    private String cpf;
    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Phone> phones;
}

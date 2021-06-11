package one.digitalinovation.personalapi.entity;

import lombok.*;
import one.digitalinovation.personalapi.enums.PhoneType;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    private String number;

    @ManyToOne()
    private Person person;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Phone phone = (Phone) o;

        return id != null && id.equals(phone.id);
    }

    @Override
    public int hashCode() {
        return 745010098;
    }
}

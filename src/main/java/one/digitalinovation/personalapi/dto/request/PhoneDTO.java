package one.digitalinovation.personalapi.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Empty;
import one.digitalinovation.personalapi.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {
    private Long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;
    @NotNull()
    @Size(min = 13, max = 14)
    private String number;
}

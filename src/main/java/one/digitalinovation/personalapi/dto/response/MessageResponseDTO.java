package one.digitalinovation.personalapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MessageResponseDTO {
    private String message;
}

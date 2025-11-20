package br.com.lunacom.comum.domain.dto.googlesheets;

//import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AporteDto {
    private String data;
    private Double valor;
    private String origem;
    private String destino;
}

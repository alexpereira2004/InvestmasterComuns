package br.com.lunacom.comum.domain.request;

import br.com.lunacom.comum.validation.DataBrasil;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Component
public class DividendoRequest extends GenericRequest {
    private String id;
    @NotEmpty(message = "Informe a Data do Recebimento (dataRecebimento)")
    @DataBrasil
    private String dataRecebimento;
    private String dataRecebimentoInicio;
    private String dataRecebimentoFinal;
    @NotEmpty(message = "Informe o Tipo (tipo)")
    private String tipo;
    @NotEmpty(message = "Informe a Quantidade (quantidade)")
    private String quantidade;
    @NotEmpty(message = "Informe o valor do Dividendo (dividendo)")
    private String dividendo;
    private String valorTotal;
    private String ativoCodigo;
}








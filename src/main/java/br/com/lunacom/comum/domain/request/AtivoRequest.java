package br.com.lunacom.comum.domain.request;

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
public class AtivoRequest extends GenericRequest {
    private Integer id;
    private String nome;
    private String nomeCompleto;
    private String codigo;
    private String tipo;
    private String pais;
    private String caminho;
    private String seguindo;
}

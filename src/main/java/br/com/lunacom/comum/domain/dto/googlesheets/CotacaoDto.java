package br.com.lunacom.comum.domain.dto.googlesheets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class CotacaoDto {
    private String codigo;
    private String cotacao;
}

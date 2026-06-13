package br.com.lunacom.comum.domain.entity.meta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotalInvestido implements MetadataInterface {
    private Double valorLimiteInicial;
    private Double valorAlcancado;
    private Double valorMeta;
    private Double percentualLimiteInicial;
    private Double percentualAlcancado;
    private Double percentualMeta;
}

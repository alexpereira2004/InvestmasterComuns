package br.com.lunacom.comum.domain.entity.meta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetaFinanceira implements MetadataInterface {
    private String ticker;
    private Double valorAlvo;
    private Double porcentagemCarteira;

}

package br.com.lunacom.comum.domain.entity.meta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetaPessoal implements MetadataInterface {
    private String descricao;
    private Integer frequenciaSemanal;
}

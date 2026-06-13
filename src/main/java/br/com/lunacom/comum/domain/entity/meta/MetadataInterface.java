package br.com.lunacom.comum.domain.entity.meta;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "categoria",
        defaultImpl = MetaFinanceira.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = MetaFinanceira.class, name = "FINANCEIRA"),
        @JsonSubTypes.Type(value = MetaPessoal.class, name = "PESSOAL"),
        @JsonSubTypes.Type(value = TotalInvestido.class, name = "TOTAL_INVESTIDO")
})
public interface MetadataInterface { }

package br.com.lunacom.comum.converter.attribute;

import br.com.lunacom.comum.domain.enumeration.PeriodoVenda;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class PeriodoVendaConverter implements AttributeConverter<PeriodoVenda, String> {

    @Override
    public String convertToDatabaseColumn(PeriodoVenda attribute) {
        return attribute != null ? attribute.getCodigo() : null;
    }

    @Override
    public PeriodoVenda convertToEntityAttribute(String dbData) {
        return dbData != null ? PeriodoVenda.fromCodigo(dbData) : null;
    }
}

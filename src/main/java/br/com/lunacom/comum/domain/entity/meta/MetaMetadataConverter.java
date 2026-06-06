package br.com.lunacom.comum.domain.entity.meta;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.io.IOException;

@Converter
public class MetaMetadataConverter implements AttributeConverter<MetadataInterface, String> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(MetadataInterface attribute) {
        if (attribute == null) return null;
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (IOException e) {
            throw new IllegalArgumentException("Erro ao converter metadata para String/JSON", e);
        }
    }

    @Override
    public MetadataInterface convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) return null;
        try {
            // O Jackson vai ler o "tipo" dentro do JSON e saber se instancia MetaFinanceira ou Pessoal
            return objectMapper.readValue(dbData, MetadataInterface.class);
        } catch (IOException e) {
            throw new IllegalArgumentException("Erro ao converter String/JSON para MetaMetadata", e);
        }
    }
}
package br.com.lunacom.comum.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class MediaDividendosDto {
    private List<br.com.lunacom.portal.domain.dto.MediaDividendosValoresDto> total;
    private List<br.com.lunacom.portal.domain.dto.MediaDividendosValoresDto> acoes;
    private List<br.com.lunacom.portal.domain.dto.MediaDividendosValoresDto> fundos;
    private List<br.com.lunacom.portal.domain.dto.MediaDividendosValoresDto> outros;
}

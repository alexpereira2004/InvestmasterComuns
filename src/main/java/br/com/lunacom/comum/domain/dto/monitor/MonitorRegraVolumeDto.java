package br.com.lunacom.comum.domain.dto.monitor;

import br.com.lunacom.comum.domain.entity.monitor.MonitorRegraVolume;

public class MonitorRegraVolumeDto {
    private Integer volumeMinimo;
    private Integer mediaDias;

    public MonitorRegraVolumeDto(MonitorRegraVolume entidade) {
        this.volumeMinimo = entidade.getVolumeMinimo();
        this.mediaDias = entidade.getMediaDias();
    }
}

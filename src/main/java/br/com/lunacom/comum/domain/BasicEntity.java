package br.com.lunacom.comum.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public abstract class BasicEntity<T> implements Serializable, GenericEntity<T> {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    LocalDateTime dataCriacao;
    LocalDateTime dataAtualizacao;
}

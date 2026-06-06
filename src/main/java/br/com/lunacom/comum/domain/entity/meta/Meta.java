package br.com.lunacom.comum.domain.entity.meta;

import br.com.lunacom.comum.domain.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "meta")
public class Meta implements GenericEntity<Meta> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo", length = 120, nullable = false)
    private String titulo;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "categoria", length = 50, nullable = false)
    private String categoria;

    @Column(name = "valor_meta", precision = 15, scale = 2)
    private BigDecimal valorMeta;

    @Column(name = "ano", nullable = false)
    private Integer ano;

    @Column(name = "usuario_id", nullable = false)
    private Integer usuarioId;


    @Column(name = "metadata", columnDefinition = "TEXT") // ou "json" dependendo do dialeto do banco
    @Convert(converter = MetaMetadataConverter.class)
    private MetadataInterface metadata;

    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    @PrePersist
    protected void onCreate() {
        this.dataCriacao = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.dataAtualizacao = LocalDateTime.now();
    }

}

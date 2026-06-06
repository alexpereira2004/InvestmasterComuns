package br.com.lunacom.comum.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Meta {
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

    /*
     * Mapeamento Nativo de JSON para o Hibernate 6 (Spring Boot 3.x).
     * Você pode mapear este campo como String (contendo o texto cru do JSON)
     * ou criar uma classe POJO (ex: MetaMetadata) para o Jackson deserializar automaticamente.
     */
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "metadata")
    private String metadata;

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

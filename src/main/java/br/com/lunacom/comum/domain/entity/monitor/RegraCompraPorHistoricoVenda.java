package br.com.lunacom.comum.domain.entity.monitor;

import br.com.lunacom.comum.converter.attribute.PeriodoVendaConverter;
import br.com.lunacom.comum.converter.attribute.StatusConverter;
import br.com.lunacom.comum.converter.attribute.TipoMovimentoConverter;
import br.com.lunacom.comum.domain.MovimentoVenda;
import br.com.lunacom.comum.domain.enumeration.PeriodoVenda;
import br.com.lunacom.comum.domain.enumeration.Status;
import br.com.lunacom.comum.domain.enumeration.TipoMovimento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "mr_compra_por_historico_venda")
@Data
public class RegraCompraPorHistoricoVenda {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Convert(converter = StatusConverter.class)
    private Status status;

    @Convert(converter = TipoMovimentoConverter.class)
    TipoMovimento tipo;

    /**
     * U: Ultima venda, A: Ano atual, D: Ultimos 12 meses, T: Todo historico
     */
    @Column(name = "periodo", length = 1)
    @Convert(converter = PeriodoVendaConverter.class)
    private PeriodoVenda periodo;

    /**
     * S: Sim, N: Nao
     */
    @Column(name = "excluir_prejuizos", length = 1)
    private String excluirPrejuizos;

    @Column(name = "validade", length = 1)
    private LocalDate validade;

    /**
     * C: Compra, V: Venda, N: Neutro
     */
    @Column(name = "recomendacao", length = 2)
    private String recomendacao;

    /**
     * Nota de 1 ate 10
     */
    @Column(name = "recomendacao_escala", length = 2)
    private Integer recomendacaoEscala;

    @Column(name = "analise", columnDefinition = "TEXT")
    private String analise;

    @Column(name = "observacao", length = 400)
    private String observacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_monitor", nullable = false,
            foreignKey = @ForeignKey(name = "FK_mr_historico_compra_monitor_regra"))
    private Monitor monitor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_movimento_venda",
            foreignKey = @ForeignKey(name = "FK_mr_historico_compra_movimento_venda"))
    private MovimentoVenda movimentoVenda;

    @Override
    public String toString() {
        return "RegraCompraPorHistoricoVenda{" +
                "id=" + id +
                '}';
    }
}




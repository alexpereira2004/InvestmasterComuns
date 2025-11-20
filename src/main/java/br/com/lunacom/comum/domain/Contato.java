package br.com.lunacom.comum.domain;

import br.com.lunacom.comum.domain.enumeration.TipoContato;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contato extends BasicEntity<Contato> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private TipoContato tipoContato;
    private String valor;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", tipoContato=" + tipoContato +
                ", valor='" + valor + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

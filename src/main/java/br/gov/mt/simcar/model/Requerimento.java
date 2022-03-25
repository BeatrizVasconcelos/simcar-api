package br.gov.mt.simcar.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "REQUERIMENTO")
public class Requerimento {

    @Id
    @Column(name = "ID")
    private Integer ID;

    private Integer RID;
    private Integer NUMERO;
    private String NUMERO_COMPLETO;
    private String CODIGO_CAR_FEDERAL;
    private String PROTOCOLO;
    private String SITUACAO;
    private String SITUACAO_ANTERIOR;
    private String SITUACAO_ANTERIOR_SUSPENCAO;
    private String SITUACAO_CADASTRAL;
    private String SITUACAO_TECNICA;
    private Integer REENVIADO;
    private Integer ULTIMO_ENVIADO;
    private Integer URGENTE;
    private String FINALIDADE;
    private String ATIVIDADE;
    private String APF_NUMERO;
    private String PEF_ESAC_NUMERO;
    private String PEF_SIMLAM_NUMERO;
    private String REFLORESTAMENTO_NUMERO;
    private String INFORMACOES;
    private Integer RESPONSAVEL_TEC_ID;
    private String RESPONSAVEL_TEC_FUNCAO;
    private String NUMERO_ART;
    private String PROPRIEDADE_NOME;
    private Integer MUNICIPIO_ID;
    private String ZONA_LOCALIZACAO;
    private String ROTEIRO_LOCALIZACAO;
    private Double MENOR_LONGITUDE_GDEC;
    private Double MENOR_LATITUDE_GDEC;
    private Double MAIOR_LONGITUDE_GDEC;
    private Double MAIOR_LATITUDE_GDEC;
    private Double MODULOS_FISCAIS;
    private Double MODULO_FISCAL_MUNICIPIO_ID;
    private Integer MODULO_FISCAL_MUNICIPIO_HA;
    private BigDecimal AREA_TOTAL_DESENHADA_HA;
    private BigDecimal AREA_TOTAL_INUNDADA_HA;
    private BigDecimal AREA_TOTAL_AUAS_HA;
    private BigDecimal AREA_TOTAL_CONSOLIDADA_HA;
    private BigDecimal AREA_TOTAL_UC_HA;
    private Integer CRUZA_TERRA_INDIGENA;
    private Integer CRUZA_AREA_EMBARGADA;
    private BigDecimal AREA_APP_PRESERVADA_HA;
    private BigDecimal AREA_APP_DEGRADADA_HA;
    private BigDecimal AREA_AUR_PRESERVADA_HA;
    private BigDecimal AREA_AUR_DEGRADADA_HA;
    private BigDecimal AREA_TIPOLOGIA_FLORESTA_HA;
    private BigDecimal AREA_TIPOLOGIA_CERRADO_HA;
    private BigDecimal ARL_CALCULADA_FLORESTA_HA;
    private BigDecimal ARL_CALCULADA_CERRADO_HA;
    private BigDecimal ARL_DESENHADA_FLORESTA_HA;
    private BigDecimal ARL_DESENHADA_CERRADO_HA;
    private BigDecimal ARL_DECLARADA_FLORESTA_HA;
    private BigDecimal ARL_DECLARADA_CERRADO_HA;
    private String TAXA_DAR_NUMERO;
    private Double TAXA_DAR_VALOR;
    private Date TAXA_DAR_DATA_QUITACAO;
    private Date TAXA_DAR_DATA_COLETA;
    private Integer TAXA_DAR_ISENTO;
    private String TAXA_DAR_MOTIVO_ISENCAO;
    private String FILA;
    private Double PESO;
    private Double PESO_TEMPO_FILA;
    private Integer COMPLEXIDADE;
    private Double MIGRACAO_ID;
    private Integer ANALISTA_EM_POSSE_ID;
    private Integer ANALISTA_ULTIMA_POSSE_ID;
    private Double CREDENCIADO_ID;
    private String MOTIVO_URGENCIA;
    private String MOTIVO_ALTERACAO_SITUACAO;
    private Date DATA_CRIACAO;
    private Date DATA_ULTIMA_MODIFICACAO;
    private Date DATA_FINALIZACAO_CADASTRO;
    private Date DATA_PRIMEIRO_ENVIO;
    private Date DATA_ULTIMO_ENVIO;
    private Date DATA_ATRIBUICAO_POSSE;
    private Date DATA_APROVACAO;
    private Date DATA_ANALISE_CAD_INI;
    private Date DATA_ANALISE_CAD_FIM;
    private Date DATA_ANALISE_TEC_INI;
    private Date DATA_ANALISE_TEC_FIM;
    private String Q_PROPRIEDADE_NOME;
    private Integer SUSPENSO;
    private Date DATA_URGENCIA;
    private Integer ANALISTA_EXECUTOR_URGENCIA_ID;
    private Date DATA_RETIFICACAO;
    private Integer REQUERIMENTO_ORIGEM_ID;
    private Integer LIBERACAO_TAXA_DAR_ID;
    private String BIOMA;
    private BigDecimal AREA_BIOMA_FLORESTA_HA;
    private BigDecimal AREA_BIOMA_CERRADO_HA;
    private Integer ENVIO_CANCELADO;

}
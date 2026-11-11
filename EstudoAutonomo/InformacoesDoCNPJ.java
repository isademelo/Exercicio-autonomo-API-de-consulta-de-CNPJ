package EstudoAutonomo;
import com.google.gson.annotations.SerializedName;
public class InformacoesDoCNPJ {

    @SerializedName("nome")
    private String nome;

    @SerializedName("abertura")
    private String dataDeAbertura;

    @SerializedName("numero_de_inscricao")
    private String numeroInscricao;

    @SerializedName("cnpj")
    private String cnpj;

    @SerializedName("tipo")
    private String tipo;

    @SerializedName("fantasia")
    private String nomeFantasia;

    @SerializedName("natureza_juridica")
    private String naturezaJuridica;

    @SerializedName("logradouro")
    private String logradouro;

    @SerializedName("numero")
    private String numeroEndereco;

    @SerializedName("complemento")
    private String complemento;

    @SerializedName("cep")
    private String cep;

    @SerializedName("bairro")
    private String bairro;

    @SerializedName("municipio")
    private String municipio;

    @SerializedName("uf")
    private String uf;

    @SerializedName("email")
    private String email;

    @SerializedName("telefone")
    private String telefone;

    @SerializedName("situacao")
    private String situacao;

    @SerializedName("motivo_situacao_cadastral")
    private String motivoSituacaoCadastral;

    @SerializedName("capital_social")
    private String capitalSocial;

    @Override
    public String toString() {
        return "Informacoes do CNPJ ----> " +
                "Nome ='" + nome + '\'' +
                "\nData de abertura ='" + dataDeAbertura + '\'' +
                "\nNúmeroInscricao ='" + numeroInscricao + '\'' +
                "\nCNPJ ='" + cnpj + '\'' +
                "\nTipo ='" + tipo + '\'' +
                "\nNome Fantasia ='" + nomeFantasia + '\'' +
                "\nNatureza juridica ='" + naturezaJuridica + '\'' +
                "\nLogradouro ='" + logradouro + '\'' +
                "\nNumero Endereco ='" + numeroEndereco + '\'' +
                "\nComplemento ='" + complemento + '\'' +
                "\nCEP ='" + cep + '\'' +
                "\nBairro ='" + bairro + '\'' +
                "\nMunicipio ='" + municipio + '\'' +
                "\nUF ='" + uf + '\'' +
                "\nE-mail ='" + email + '\'' +
                "\nTelefone ='" + telefone + '\'' +
                "\nSituacao ='" + situacao + '\'' +
                "\nMotivo situacao cadastral ='" + motivoSituacaoCadastral + '\'' +
                "\nCapital social ='" + capitalSocial + '\'';
    }
}

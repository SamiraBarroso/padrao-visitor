package org.example;

public class UsuarioPremium extends UsuarioComCadastro {
    private String tipoAssinatura;
    private double precoAssinatura;
    private String dataVencimento;

    public UsuarioPremium(String nome, String login , String senha, String tipoAssinatura, double precoAssinatura, String dataVencimento) {
        super(nome, login, senha);
        this.tipoAssinatura = tipoAssinatura;
        this.precoAssinatura = precoAssinatura;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.listarFuncoesUsuarioPrime(this);
    }
}
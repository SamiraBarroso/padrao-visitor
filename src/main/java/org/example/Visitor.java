package org.example;

public interface Visitor {
    String listarFuncoesUsuarioComum(UsuarioComum usuarioComum);
    String listarFuncoesUsuarioPrime(UsuarioPremium usuarioPrime);
    String listarFuncoesSemCadastro(UsuarioSemCadastro usuarioSemCadastro);
}
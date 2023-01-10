package org.example;

public class UsuarioVisitor implements Visitor{

    public String listaFuncoes(Usuario usuario){
        return usuario.aceitar(this);
    }

    @Override
    public String listarFuncoesUsuarioComum(UsuarioComum usuarioComum) {
        return usuarioComum.getNomeUsuario() + ", você pode : curtir e comentar";
    }

    @Override
    public String listarFuncoesUsuarioPrime(UsuarioPremium usuarioPrime) {
        return usuarioPrime.getNomeUsuario() + ", você pode : curtir, comentar e receber por vídeos";
    }

    @Override
    public String listarFuncoesSemCadastro(UsuarioSemCadastro usuarioSemCadastro) {
        return "Apenas assistir lives!";
    }
}
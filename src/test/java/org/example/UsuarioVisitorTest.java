package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioVisitorTest {

    @Test
    void deveExibirFuncoesUsuarioSemCadastro(){
        UsuarioSemCadastro usuarioSemCadastro = new UsuarioSemCadastro();

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Apenas assistir lives!", visitor.listaFuncoes(usuarioSemCadastro));
    }

    @Test
    void deveExibirFuncoesUsuarioComum(){
        UsuarioComum usuarioComum = new UsuarioComum("Lupercio", "lupeDoidao", "123123");

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Lupercio, você pode : curtir e comentar", visitor.listaFuncoes(usuarioComum));
    }

    @Test
    void deveExibirFuncoesUsuarioPrime(){
        UsuarioPremium usuarioPrime = new UsuarioPremium("Lupercio", "lupeDoidao", "123123", "Anual", 90.0, "01/01/2022");

        UsuarioVisitor visitor = new UsuarioVisitor();
        assertEquals("Lupercio, você pode : curtir, comentar e receber por vídeos", visitor.listaFuncoes(usuarioPrime));
    }}
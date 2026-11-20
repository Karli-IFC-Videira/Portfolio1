package controller;

import dao.CadastroProjetos;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Projeto;
import model.Usuario;

@WebServlet(name = "ProjetoController",urlPatterns = {"/ProjetoController", "/cadastroProjeto", "/listaProjeto", "/editarProjeto", "/selecaoProjeto", "/excluirProjeto"})
public class ProjetoController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /*
     * Mapa utilizado para associar as rotas às páginas JSP.
     *
     * Exemplo:
     *
     * /cadastroProjeto → cadastroProjeto.jsp
     *
     * O Map é utilizado aqui para evitar a necessidade de criar
     * vários blocos if/else apenas para encaminhar o usuário
     * para uma página.
     */
    private Map<String, String> rotas;
  
}

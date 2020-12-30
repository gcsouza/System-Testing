package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessosSteps extends BaseSteps {

    private PaginaInicial paginaInicial = new PaginaInicial(driver);
    private MenuProcesso menuProcesso = new MenuProcesso(driver);
    private Processos processos = new Processos(driver);
    private MostrarProcesso mostrarProcesso = new MostrarProcesso(driver);
    private ListaProcessos listaProcesso = new ListaProcessos(driver);
    private NovoProcesso novoProcesso = new NovoProcesso(driver);
    private DetalheProcesso detalheProcesso = new DetalheProcesso(driver);
    private EditarProcesso editarProcesso = new EditarProcesso(driver);

    @Dado("^que o usuário está na página inicial$")
    public void queOUsuarioEstaNaPaginaInicial() {
        paginaInicial.abrir();
    }

    @E("^que o usuário clica no menu processos$")
    public void queOUsuarioClicaNoMenuProcessos() {
        menuProcesso.clicarProcessos();
    }

    @E("^o usuário clica no botão Novo Processo$")
    public void oUsuarioClicaNoBotaoNovoProcesso() {
        listaProcesso.clicarNovo();
    }

    @E("^o usuário preenche o campo \"([^\"]*)\" com o valor \"([^\"]*)\" no cadastro de processos$")
    public void oUsuarioPreencheOCampoComOValorNoCadastroDeProcessos(String campo, String valor) throws Throwable {
        processos.preencherCampos(campo, valor);
    }

    @Quando("^o usuário clicar no botão salvar no cadastro de processos$")
    public void oUsuarioClicarNoBotaoSalvarNoCadastroDeProcessos() {
        processos.clicarSalvar();
        novoProcesso.setCode(detalheProcesso.getCode().toString());
    }

    @Então("^o usuário deveria ver a mensagem \"([^\"]*)\" no cadastro de processos$")
    public void oUsuarioDeveriaVerAMensagemNoCadastroDeProcessos(String message) throws Throwable {
        Assert.assertEquals(message, mostrarProcesso.getNotice());
    }

    @Quando("^o usuário clica no botão mostrar do processo cadastrado$")
    public void oUsuarioClicaNoBotaoMostrarDoProcessoCadastrado() {
        listaProcesso.clicarMostrar(novoProcesso.getCode());
    }

    @E("^o usuário clicar no botão voltar no cadastro de processos$")
    public void oUsuarioClicaNoBotaoVoltarNoCadastroDeProcessos() {
        detalheProcesso.clicarVoltar();
    }

    @Então("^o usuário deverá ver o valor \"([^\"]*)\" no campo \"([^\"]*)\" na parte de exibição do processo$")
    public void oUsuarioDeveraVerOValorNoCampoNaParteDeExibicaoDoProcesso(String valor, String campo) throws Throwable {
        Assert.assertEquals(valor, detalheProcesso.getCampo(campo));
    }

    @E("^o usuário clicar no botão editar do processo cadastrado$")
    public void oUsuarioClicarNoBotaoEditarDoProcessoCadastrado() {
        listaProcesso.clicarEditarProcesso(novoProcesso.getCode());
    }

    @E("^o usuário preenche o campo \"([^\"]*)\" com o valor \"([^\"]*)\" na tela de edição de processos$")
    public void oUsuarioPreencheOCampoComOValorNaTelaDeEdicaoDeProcessos(String campo, String valor) throws Throwable {
        editarProcesso.preencherCamposEdicao(campo, valor);
    }

    @Quando("^o usuário clicar no botão salvar na tela de edição de processos$")
    public void oUsuarioClicarNoBotaoSalvarNaTelaDeEdicaoDeProcessos() {
        editarProcesso.clicarSalvar();
    }

    @Quando("^o usuário clicar no botão apagar do processo cadastrado$")
    public void oUsuarioClicarNoBotaoApagarDoProcessoCadastrado() {
        listaProcesso.clicarDeletar(novoProcesso.getCode());
    }

    @E("^o usuário confirmar a deleção do processo$")
    public void oUsuarioConfirmarADelecaoDoProcesso() {
        listaProcesso.confirmarDelecao();
    }

    @Então("^o botão apagar não pode mais existir para o usuário cadastrar o processo$")
    public void oBotaoApagarNaoPodeMaisExistirParaOUsuarioCadastrarOProcesso() throws InterruptedException {
        Assert.assertFalse(listaProcesso.botaoDeletarExiste(novoProcesso.getCode()));
    }
}

import Navegador.NavegadorSafari;
import aparelhoTelefonico.AparelhoTelefonico;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,NavegadorSafari,ReprodutorMusical  {
    public static void main(String[] args) throws Exception {
    
    }
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para numero "+numero);
    }

    @Override
    public void atender() {
       System.out.println("Atendendo ligação");
    }

    @Override
    public void encerrarLigacao() {
       System.out.println("Encerrando ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
       System.out.println("Acessando correio de voz");
    }

    @Override
    public void tocar() {
       System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica");
    }

    @Override
    public void parar() {
        System.out.println("Parando musica");
    }

    @Override
    public void exibirPagina(String url) {
       System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Adicionando nova aba");
    }

    @Override
    public void fecharAbaAtual() {
     System.out.println("Fechando aba atual");
    }

    @Override
    public void atualizarPagina() {
     System.out.println("Atualizando pagina");
    }
}

import Iphone.Iphone;
import Iphone.navegador.NavegadorInternet;
import Iphone.navegador.Safari;
import Iphone.rerodutor.Ipod;
import Iphone.rerodutor.ReprodutorMusical;
import Iphone.telefone.AparelhoTelefonico;
import Iphone.telefone.Celular;

public class CeludarDoZezinho {
    public static void main(String[] args) {
        System.out.println("------------Navegador de Internet-------------");
        NavegadorInternet iphoneNavegador = new Safari();
        iphoneNavegador.exibirPagina("www.google.com");
        iphoneNavegador.adicionarNovaAba();
        iphoneNavegador.atualizarPagina();

        System.out.println("------------Reprodutor de música--------------");
        ReprodutorMusical iphoneReprodutor = new Ipod();
        iphoneReprodutor.tocar();
        iphoneReprodutor.pausar();
        iphoneReprodutor.selecionarMusica("Boiadeira");

        System.out.println("--------------Aparelho Celular------------------");
        AparelhoTelefonico iphoneClaro = new Celular();
        iphoneClaro.ligar("0119456589");
        iphoneClaro.atender();
        iphoneClaro.iniciarCorreioVoz();

    }
}

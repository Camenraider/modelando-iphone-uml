package Iphone.rerodutor;

public class Ipod implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }
}

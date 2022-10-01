package Q2;

public class Main {

    public static void main(String[] args) {
        MediaAlunoDisciplina mad = new MediaAlunoDisciplina();
        ImprimeDados print = new ImprimeDados();
        String nomeDisc = "Linguagem de Programacao";
        mad.setNumeroAluno(9);
        mad.getNomeDisc();
        mad.setMediaProva(5);
        mad.getMediaProva();
        mad.setMediaTrab(5);
        mad.getMediaTrab();
        mad.getCalculaMediaPonderada();
    }
}
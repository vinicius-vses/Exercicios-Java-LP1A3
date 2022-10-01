package Q2;

public class MediaAlunoDisciplina {

        private int numeroAluno;
        private static String nomeDisc = "Linguagem de Programacao";
        private static final double pesoTrab = 0.5;
        private static final double pesoProva = 0.5;
        private double mediaTrab;
        private double mediaProva;

        public int getNumeroAluno() {
                return numeroAluno;
        }

        public void setNumeroAluno(int numeroAluno) {
                this.numeroAluno = numeroAluno;
        }

        public static String getNomeDisc() {
                return nomeDisc;
        }

        public static void setNomeDisc(String nomeDisc) {
                MediaAlunoDisciplina.nomeDisc = nomeDisc;
        }

        public double getMediaTrab() {
                return mediaTrab;
        }

        public void setMediaTrab(double mediaTrab) {
                this.mediaTrab = mediaTrab;
        }

        public double getMediaProva() {
                return mediaProva;
        }

        public void setMediaProva(double mediaProva) {
                this.mediaProva = mediaProva;
        }

        public Double getCalculaMediaPonderada() {
                return  ;
        }

        public class ImprimeDados {
                public void imprimeDados() {
                        System.out.println("" + numeroAluno);
                        System.out.println("" + nomeDisc);
                        System.out.println("" + pesoTrab);
                        System.out.println("" + pesoProva);
                        System.out.println("" + mediaTrab);
                        System.out.println("" + mediaProva);
                        //System.out.println("" + CalculaMediaPonderada);
                }
        }
}
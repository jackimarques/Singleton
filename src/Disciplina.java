public class Disciplina{
            private iCalcMedia CalcularMedia;
            private double Media;
    private double p1;
    private double p2;
            private String Nome;
    private String Situacao;

    public Disciplina(iCalcMedia calculo) {
        this.CalcularMedia = calculo;
    }

    public void CalcularMedia(){
        Media = CalcularMedia.CalcMedia(p1,p2);
        Situacao = CalcularMedia.Situacao(Media);
    }

    public iCalcMedia getCalcMedia() {
        return CalcularMedia;
    }

    public void setCalcMedia(iCalcMedia CalcularMedia) {
        CalcularMedia = CalcularMedia;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        Media = media;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        Situacao = situacao;
    }
}
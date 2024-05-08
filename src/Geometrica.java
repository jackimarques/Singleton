public class Geometrica implements iCalcMedia{
    @Override
    public double CalcMedia(double p1, double p2) {
        return Math.sqrt(p1*p2);
    }

    @Override
    public String Situacao(double Media) {
        if (Media > 7){
            return "Aprovado" ;}
        else
        {return "Reprovado" ;}
    }
}

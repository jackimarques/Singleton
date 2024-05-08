public class Aritmetica  implements iCalcMedia{
    @Override
    public double CalcMedia(double p1, double p2) {
        return (p1+p2) / 2;
    }

    @Override
    public String Situacao(double Media) {
        if (Media > 5){
        return "Aprovado" ;}
         else
         {return "Reprovado" ;}
    }
}


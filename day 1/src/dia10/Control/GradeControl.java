package dia10.Control;

public class GradeControl {
    public int percentualNota(int nota, int qtdQuestoes){
        return Math.round(nota*100/qtdQuestoes);
    }
}

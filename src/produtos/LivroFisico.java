package produtos;
import autor.Autor;
public class LivroFisico extends Livro {
    public LivroFisico(Autor autor) {
        super(autor);
    }
    @Override 
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
    public double getTaxaImpressao(double d) {
        
        return this.getValor() * 0.5;
    }

    
}
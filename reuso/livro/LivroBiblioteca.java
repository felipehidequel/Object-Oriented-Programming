package reuso.livro;

import reuso.horario.DataHora;

public class LivroBiblioteca extends Livro {
    private boolean taEmprestado;
    
    LivroBiblioteca (String titulo, String autor, int ano){
        super(titulo, autor, ano);
        taEmprestado = false;
    }

    public boolean isTaEmprestado() {
        return taEmprestado;
    }

    public void emprestar(){
        taEmprestado = true;
    }

    public void devolver(){
        taEmprestado = false;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += taEmprestado?"Emprestado":"Disponivel";
        return res;
    }
}

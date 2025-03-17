
import java.util.ArrayList;


public class Java01 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Matemática", "Rua A, 123", 40);
        CursoTecnico curso2 = new CursoTecnico("Informática", "Rua B, 456", 60, "Online");
        
        curso1.exibirInformacoes();
        System.out.println("Mensalidade: " + curso1.calcularMensalidade());
        curso1.emitirCertificado();
        
        System.out.println("-------------------");
        
        curso2.exibirInformacoes();
        System.out.println("Mensalidade: " + curso2.calcularMensalidade());
        curso2.emitirCertificado();
        
        System.out.println("-------------------");
        
        ArrayList<Curso> listaCursos = new ArrayList<>();
        listaCursos.add(curso1);
        listaCursos.add(curso2);
        
        for (Curso curso : listaCursos) {
            curso.exibirInformacoes();
            System.out.println();
        }
    }
}
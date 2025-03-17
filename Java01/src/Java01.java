public class Java01 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Matemática", "Rua A, 123", 40);
        CursoTecnico curso2 = new CursoTecnico("Informática", "Rua B, 456", 60, "Online");
        
        curso1.exibirInformacoes();
        System.out.println("Mensalidade: " + curso1.calcularMensalidade());
        
        System.out.println("-------------------");
        
        curso2.exibirInformacoes();
        System.out.println("Mensalidade: " + curso2.calcularMensalidade());
    }
}
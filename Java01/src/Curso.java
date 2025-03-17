class Curso extends Escola implements Certificavel {
    private int cargaHoraria;
    
    public Curso(String nome, String endereco, int cargaHoraria) {
        super(nome, endereco);
        setCargaHoraria(cargaHoraria);
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            throw new IllegalArgumentException("Carga horária deve ser maior que zero.");
        }
    }
    
    public void exibirInformacoes() {
        System.out.println("Curso: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }
    
    @Override
    public double calcularMensalidade() {
        return cargaHoraria * 10;
    }
    
    @Override
    public void emitirCertificado() {
        System.out.println("Certificado emitido para o curso: " + getNome());
    }
}

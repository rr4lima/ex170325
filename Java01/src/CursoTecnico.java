class CursoTecnico extends Curso {
    private String modalidade;
    
    public CursoTecnico(String nome, String endereco, int cargaHoraria, String modalidade) {
        super(nome, endereco, cargaHoraria);
        setModalidade(modalidade);
    }
    
    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        if (modalidade.equalsIgnoreCase("Presencial") || modalidade.equalsIgnoreCase("Online")) {
            this.modalidade = modalidade;
        } else {
            throw new IllegalArgumentException("Modalidade inválida. Escolha entre 'Presencial' ou 'Online'.");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Modalidade: " + modalidade);
    }
    
    @Override
    public double calcularMensalidade() {
        return super.calcularMensalidade() * 1.2;
    }
    
    @Override
    public void emitirCertificado() {
        System.out.println("Certificado técnico emitido para o curso: " + getNome());
    }
}

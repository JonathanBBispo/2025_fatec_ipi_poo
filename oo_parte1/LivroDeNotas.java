class LivroDeNotas{

    private String nomeDaDisciplina = null;

    public void setNomeDaDisciplina(String nomeDaDisciplina){
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public void exibirMensagem(){
        System.out.println(
            "Bem-vindo ao livro de notas de " + nomeDaDisciplina
        );
    }

}
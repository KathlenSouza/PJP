
public class Aluno {
	private  String nome;
	private  String matricula;
	private  long cpf;
	private String curso;
	
	public Aluno(String nome, String matricula,long cpf,String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf=cpf;
		this.curso=curso;
	}
	public Aluno(){
		System.out.print("aluno")
		{

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}

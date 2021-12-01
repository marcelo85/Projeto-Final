package implementation;

public class AlunoIndex {
	protected long RA;
	protected Aluno aluno;
	
	public Aluno Index(long RA, Aluno aluno) {
		this.RA = RA;
		this.aluno = aluno;
	}
	
	public long getRA() {return RA; }
	
	public long getAluno() {return aluno; }
	
	public void setRa(long RA) { this.RA = RA; }
	
	public void Aluno(Aluno aluno) { this.aluno = aluno; }
	
	public String toString() {
		return "O numero de RA " + RA + " corresponde ao aluno " + aluno;
	}
}
package implementation;

public class Aluno {
	
	private long RA;
	
	private String nome;
	
	private String endereço;
	
	private long celular;
	
	private String dataDeNascimento;
	
	public Aluno(long RA, String nome, String endereço, long celular, String dataDeNascimento) {
		this.RA = RA;
		this.nome = nome;
		this.endereço = endereço;
		this.celular = celular;
		this.dataDeNascimento = dataDeNascimento;
	}

	public long getRA(); { return RA; }
	
	public String getnome(); { return nome; }
	
	public String getendereço(); { return endereço; }
	
	public long getcelular(); { return celular; }
	
	public String getdataDeNascimento(); { return dataDeNascimento; };
	
	
	public void setRA(long RA); { this.RA = RA; }
	
	public void setnome(String nome); { this.nome = nome; }
	
	public void setendereço(String endereço); { this.endereço = endereço; }
	
	public void setcelular(long celular); { this.celular = celular; }
	
	public void setdataDeNascimento(String dataDeNascimento); { this.dataDeNascimento = dataDeNascimento; };
	
	public String toString() {
		return "RA: " + RA + \n + "Nome: " + nome + \n + "Endereço: " + endereço + \n + "Celular: " + celular + \n + "Data de Nascimento: " + dataDeNascimento;
	}
	
}

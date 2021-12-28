package projetoAlunoSemComentario;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nomeAluno;
	private int anoNascimento;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", anoNascimento=" + anoNascimento + ", disciplinas=" + disciplinas
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoNascimento;
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nomeAluno == null) ? 0 : nomeAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (anoNascimento != other.anoNascimento)
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (nomeAluno == null) {
			if (other.nomeAluno != null)
				return false;
		} else if (!nomeAluno.equals(other.nomeAluno))
			return false;
		return true;
	}

	public double calcularMedia() {
		double media = 0;
		for(Disciplina disciplina : disciplinas){
			media += disciplina.getNota();
		}
		return media / disciplinas.size();
	}

	public boolean statusAluno() {
		return true;
	}

	public int idadeAluno() {
		return 0;
	}

}

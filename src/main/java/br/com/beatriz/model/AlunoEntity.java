package br.com.beatriz.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "data_nascimento")
    private Calendar dataNascimento;
    @Column(name = "sexo")
    private String sexo;

    public Long getId() {
          return id;
    }

    public void setId(Long id) {
          this.id = id;
    }

    public String getNome() {
          return nome;
    }

    public void setNome(String nome) {
          this.nome = nome;
    }

    public Calendar getDataNascimento() {
          return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
          this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
          return sexo;
    }

    public void setSexo(String sexo) {
          this.sexo = sexo;
    }
	
	
}

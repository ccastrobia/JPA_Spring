package br.com.beatriz.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.beatriz.model.AlunoEntity;
import br.com.beatriz.persistence.AlunoPersistence;

@Transactional
@Service

public class AlunoBusiness {
	
	 @Autowired
     private AlunoPersistence alunoPersistence;

     public void persistirAluno(AlunoEntity entity) {
           this.alunoPersistence.persistir(entity);
     }

     public AlunoEntity buscarAluno(Long id) {
           return this.alunoPersistence.buscar(id);
     }

     public void removerAluno(Long id) {
           AlunoEntity aux = this.buscarAluno(id);
           this.alunoPersistence.remover(aux);
     }

     public void atualizarAluno(AlunoEntity alunoEntity) {
           this.alunoPersistence.atualizar(alunoEntity);
     }

}

package br.com.beatriz.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.beatriz.business.AlunoBusiness;
import br.com.beatriz.model.AlunoEntity;

public class Run {

      private static AlunoBusiness alunoBusiness;
      private static ApplicationContext context;

      public static void main(String[] args) {
            context = new ClassPathXmlApplicationContext("spring-context.xml");
            alunoBusiness = context.getBean(AlunoBusiness.class);
            alunoBusiness.persistirAluno(new AlunoEntity());
      }
}
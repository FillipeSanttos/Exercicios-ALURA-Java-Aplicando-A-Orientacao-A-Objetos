package br.com.cursoalura.desafios2;

// 4 - Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

public class Desafio2Exercicio4 {
   //***Definição de atributos
   private String nome;
   private double notaPrimeiroBimestre;
   private double notaSegundoBimestre;
   private double notaTerceiroBimestre;
   private double notaQuartoBimestre;

   //***Criação de métodos SETTERS para atributos
   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setNotaPrimeiroBimestre(double notaPrimeiroBimestre) {
      this.notaPrimeiroBimestre = notaPrimeiroBimestre;
   }

   public void setNotaSegundoBimestre(double notaSegundoBimestre) {
      this.notaSegundoBimestre = notaSegundoBimestre;
   }

   public void setNotaTerceiroBimestre(double notaTerceiroBimestre) {
      this.notaTerceiroBimestre = notaTerceiroBimestre;
   }

   public void setNotaQuartoBimestre(double notaQuartoBimestre) {
      this.notaQuartoBimestre = notaQuartoBimestre;
   }

   //***Criação de métodos GETTERS para atributos
   public String getNome() {
      return nome;
   }

   public double getNotaPrimeiroBimestre() {
      return notaPrimeiroBimestre;
   }

   public double getNotaSegundoBimestre() {
      return notaSegundoBimestre;
   }

   public double getNotaTerceiroBimestre() {
      return notaTerceiroBimestre;
   }

   public double getNotaQuartoBimestre() {
      return notaQuartoBimestre;
   }

   //**Método de cálculo de média e retornar valor
   public double calcularMedia(){
      double media = (notaPrimeiroBimestre+notaSegundoBimestre+notaTerceiroBimestre+notaQuartoBimestre)/4;
      return media;
   }
}
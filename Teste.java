package manipulacaoExcecoes;

public class Teste {
    public static void main(String[] args) {
        Orientador o1 = new Orientador("Dory");
        Orientador o2 = new Orientador("Eliezer");

        Estudante e1 = new Estudante(12, "Gabriel", o1);
        Estudante e2 = new Estudante(20, "Rafael", o1);
        Estudante e3 = new Estudante(40, "Daniel", o2);
        Estudante e4 = new Estudante(50, "Samuel", o2);
        Estudante e5 = new Estudante(70, "Hriel", o1);


        e3.addOrientador(o1);
        e4.addOrientador(o1);


    }
}

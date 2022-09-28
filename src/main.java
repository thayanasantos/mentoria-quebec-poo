public class main {
    public static void main(String[] args) {
        Vendedor joaovendedor =new Vendedor("joao vendedor", "012345678900",10.0,5);
        double salariodejoao = joaovendedor.calcularSalario();
        System.out.println("O salario de Joao é: "+ salariodejoao);

        Consultor mariaConsultor =
                new Consultor("maria consultor", "018362", 100.0, 10l);
        System.out.println("o salario de maria e: " +  mariaConsultor.calcularSalario());


    }




}

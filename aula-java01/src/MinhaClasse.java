public class MinhaClasse {

public static void main(String[] args) {
    String primeiroNome = "Marcos";
    String segundoNome = "Rodrigues";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

}
public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);

}

}

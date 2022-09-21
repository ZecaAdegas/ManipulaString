package ManipulaStrings;

public class ExerciciosStrings {
    static String s, s1;
    public static void LeStrings(String texto){
        System.out.println(texto);
        s = Ti827ManipulaStrings.ler.next();
        s1 = Ti827ManipulaStrings.ler.nextLine();
        s += s1;
    }

    public static int contaCaracteres() {
        LeStrings("Insira um texto");
        return s.length();
    }

    public static void ArvoreChar() {
        int x, y;
        LeStrings("Insira um texto");
        for(x = 0; x < s.length(); x++){
            for(y = 0; y <= x; y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        for(x = s.length()-1; x >= 0; x--){
            for(y = 0; y < x; y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
    }

    public static void CapitalizaLetras() {
        LeStrings("Insira uma palavra a ser tranformada em minúscula: ");
        s = s.toLowerCase();
        System.out.println("Palavra capitalida: " + s);        
        LeStrings("Insira uma palavra a ser capitalizada: ");
        s = s.toUpperCase();
        System.out.println("Palavra capitalida: " + s);

    }

    public static void ArvoreCharSubString() {
        int x;
        LeStrings("Insira um texto");
        for(x = 0; x < s.length(); x++){
            s1 = s.substring(0, x+1);
            System.out.println(s1);
        }
        for(x = s.length()-1; x >= 0; x--){
            s1 = s.substring(0, x);
            System.out.println(s1);
        }

    }

    public static void SubstituirFrase() {
        String s2,s3;
        LeStrings("Digite uma frase:");
        System.out.println("Frase original: " + s);
        System.out.println("Digite a palavra a substituir: ");
        s = Ti827ManipulaStrings.ler.next();
        s2 = Ti827ManipulaStrings.ler.nextLine();
        System.out.println("Digite a nova palavra: ");
        s = Ti827ManipulaStrings.ler.next();
        s3 = Ti827ManipulaStrings.ler.nextLine();
        s1 = s1.replace(s2, s3);
        System.out.println("Frase substituída: " + s1);
    }
}

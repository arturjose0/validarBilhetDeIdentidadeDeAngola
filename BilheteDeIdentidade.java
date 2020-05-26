/*

JAVA
TEMA: EXPRESSÃO REGULAR PARA BILHETE DE IDENTIDADE
AUTOR: JOSÉ ARTUR KASSALA
TEL: 995377451 / 932693623
EMAIL: JOSEARTURKASSALA0@HOTMAIL.COM
GITHUB: @ARTURJOSE0

*/
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.IllegalStateException;

public class BilheteDeIdentidade{
    public static void main(String[] args){
        String expReg="\\d{9}[A-Z]{2}\\d{3}";
        //String palavra="007270402BA030";
String palavra = JOptionPane.showInputDialog("Digite um bilhete de identidade", "");
        Pattern expRegComp= Pattern.compile(expReg);
        Matcher encontrar = expRegComp.matcher(palavra);
        try{
encontrar.find();
System.out.println(encontrar.group());
            JOptionPane.showMessageDialog(null, "bilhete valido: "+encontrar.group());
        }catch(IllegalStateException e){
            System.out.println("nenhuma bilhete de identidade encontrado");
            JOptionPane.showMessageDialog(null, "nenhuma bilhete de identidade encontrado");
        }
    }
}
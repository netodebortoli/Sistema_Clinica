package Controle;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncoesUteis {

    public static Date strToDate(String strDt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.parse(strDt);
    }

    public static String dateToStr(Date dt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.format(dt);
    }

    public static String formatterCpf(String cpf) throws ParseException {
        String pt1 = cpf.substring(0, 3);
        String pt2 = cpf.substring(3, 6);
        String pt3 = cpf.substring(6, 9);
        String pt4 = cpf.substring(9);
        return pt1 + "." + pt2 + "." + pt3 + "-" + pt4;
    }

    public static boolean validarAnoNascimento(String dataNascimento) throws ParseException {
        if (dataNascimento.replaceAll("/", "").trim().length() == 0) {
            return true;
        }

        int anoNasc = strToDate(dataNascimento).getYear();
        int anoAtual = new Date().getYear();
        return anoNasc > anoAtual;
    }

    public static boolean isCPF(String parCpf) {

        // considera-se erro cpf's formados por uma sequencia de numeros iguais
        String cpf;
        cpf = parCpf.replace(".", "");
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        if (cpf.equals("00000000000")
                || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {

            return false;
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // Calculo do 1o. Digito Verificador
        sm = 0;
        peso = 10;
        for (i = 0; i < 9; i++) {
            // converte o i-esimo caractere do cpf em um numero:
            // por exemplo, transforma o caractere '0' no inteiro 0         
            // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int) (cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
            dig10 = '0';
        } else {
            dig10 = (char) (r + 48); // converte no respectivo caractere numerico
        }
        // Calculo do 2o. Digito Verificador
        sm = 0;
        peso = 11;
        for (i = 0; i < 10; i++) {
            num = (int) (cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11)) {
            dig11 = '0';
        } else {
            dig11 = (char) (r + 48);
        }

        // Verifica se os digitos calculados conferem com os digitos informados.
        if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
            return (true);
        } else {
            return (false);
        }
    }
}

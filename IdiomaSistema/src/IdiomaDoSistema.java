import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {

    Locale locale = Locale.getDefault();

    String language = locale.getLanguage();
    String country = locale.getCountry();
    String displayLanguage = locale.getDisplayLanguage();
    String displayCountry = locale.getDisplayCountry();

    System.out.println("idioma " + language);
    System.out.println("País: " + country);
    System.out.println("Idioma (exibido): " + displayLanguage);
    System.out.println("País (exibido): " + displayCountry);


    }


}
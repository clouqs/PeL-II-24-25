/*  tipi semplici:
byte short
int long
float double
char
boolean
*/

/*tipi di oggetti:
  < oggetto > < operazione > < (< list di argomenti >)
 
 String s, t ...

s.length()
s.charAt(i)
s.substring(i, j) // s.substring(i)
s.concat(t) // s + t
s.equals(t) // diverso da == perchè "=="" confronta i riferimenti
 */



 public class Plurali {
    public static String pluraleSm(String sm) {
        return radiceSost(sm) + "i";
    }

    public static String pluraleSf(String sf) {
        return radiceSost(sf) + "e";
    }

    public static String radiceSost(String s) {
        return s.substring(0, s.length() - 1);
    }

    public static String plurale(String s) {
        if (femminile(s)) {
            return pluraleSf(s);
        } else {
            return pluraleSm(s);
        }
    }

    public static boolean femminile(String s) {
        // Definisci una logica per determinare se la parola è femminile
        // Ad esempio, supponiamo che le parole femminili finiscano per 'a'
        return s.endsWith("a");
    }

    public static void main(String[] args) {
        System.out.println(plurale("casa"));  // Output: case
        System.out.println(plurale("libro")); // Output: libri
    }
}

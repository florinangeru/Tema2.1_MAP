import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayFeatures {
    public static void main(String[] args) {
        // Solicitam introducerea unui sir de intregi separati prin virgula
        String input = JOptionPane.showInputDialog("Introduceti un array de intregi separati prin virgula:");

        // Prelucram sirul de intrare pentru a obtine un array de intregi
        String[] stringNumbers = input.split(",");
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i].trim()); // .trim() elimina spatiile albe de la inceputul si sfarsitul fiecarui element
        }

        // Sortam array-ului
        Arrays.sort(numbers);

        // Copiem array-ului sortat intr-un nou array
        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);

        // Creem mesajul de afisare
        String message = "Array-ul sortat: " + Arrays.toString(numbers) + "\n";
        message += "Copie a array-ului sortat: " + Arrays.toString(copiedNumbers);

        // Afisam array-ul sortat si copia acestuia
        JOptionPane.showMessageDialog(null, message);

        String mesajBinar = "01010000011011110111011101100101011100100110010101100100001000000110001001111001001000000100000101101110011001110110010101110010011101010010000001000110011011000110111101110010011010010110111000100000010001000110000101101110011010010110010101101100";
        String mesajText = fromBinaryString(mesajBinar);
        JOptionPane.showMessageDialog(null, mesajText);
    }
    public static String fromBinaryString(String binary) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            int charCode = Integer.parseInt(binary.substring(i, i + 8), 2);
            text.append((char) charCode);
        }
        return text.toString();
    }
}

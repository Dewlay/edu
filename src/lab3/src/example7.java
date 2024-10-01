public class example7 {
    public static void main(String[] args) {
        char[] alphabet = new char[10];
        populateAlphabet(alphabet);
        printAlphabet(alphabet);
        printReverseAlphabet(alphabet);
    }

    private static void populateAlphabet(char[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                array[i] = 'a';
            } else {
                int index = (i - 1) % 32 + 1; // переход на следующую букву после «через одну»
                if (index == 0) {
                    index = 33; // если индекс равен 0, то он смещается на следующую после 'я' букву
                }
                array[i] = (char) index;
            }
        }
    }

    private static void printAlphabet(char[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void printReverseAlphabet(char[] array) {
        System.out.print("Array reversed: ");
        for (int i = array.length - 1; i >= 0; --i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
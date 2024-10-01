public class example8 {
    public static void main(String[] args) {
        char[] consonants = new char[10];
        populateConsonants(consonants);
        printConsonants(consonants);
    }

    private static void populateConsonants(char[] array) {
        int index = 0;
        for (char c = 'A'; c <= 'Z'; ++c) {
            if (!Character.isLowerCase(c)) { // проверяем, является ли буква гласной
                array[index] = Character.toUpperCase(c);
                index++;
                if (index == array.length) {
                    break;
                }
            }
        }
    }

    private static void printConsonants(char[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
public class FRQClass {

    public FRQClass() {
    }

    public void printNums(int value, int numRounds) {
        for (int i = 1; i <= numRounds; i++) {
            int randNum = (int) (Math.random() * 10);
            System.out.print(randNum);
            while (randNum != value) {
                randNum = (int) (Math.random() * 10);
                System.out.print(randNum);
            }
            System.out.println();
        }
    }

    public String longestStreak(String str) {
        int counter = 1;
        int maxOccurrence = 1;
        String letterOfMax = str.charAt(0) + "";
        for (int i = 0; i < str.length() - 1; i++) {
            String letter = str.charAt(i) + "";
            String letterAfter = str.charAt(i + 1) + "";
            if (letter.equals(letterAfter)) {
                counter++;
            } else {
                if (maxOccurrence < counter) {
                    maxOccurrence = counter;
                    letterOfMax = letter;
                }
                counter = 1;
            }
        }
        return letterOfMax + " " + maxOccurrence;
    }


}

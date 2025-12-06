import java.util.Scanner;

public class Input {
    private Scanner reader;

    public Input() {
        reader = new Scanner(System.in);
    }

    /**
     * Membaca input satu baris dari user.
     * @return String input user (sudah di-trim dan lower case agar seragam).
     */
    public String getInput() {
        System.out.print("> "); // Prompt indicator
        String inputLine = reader.nextLine();
        return inputLine.trim().toLowerCase();
    }
}

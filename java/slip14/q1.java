import java.io.*;
import java.util.*;

class FileSearchThread extends Thread {
    private File file;
    private String searchText;

    public FileSearchThread(File file, String searchText) {
        this.file = file;
        this.searchText = searchText;
    }

    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchText)) {
                    System.out.println("Found in file: " + file.getName() +
                            " at line: " + lineNumber);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }
}

public class SimpleSearchEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to search: ");
        String searchText = sc.nextLine();

        File folder = new File("."); // current directory
        File[] files = folder.listFiles();

        List<Thread> threads = new ArrayList<>();

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                FileSearchThread t = new FileSearchThread(file, searchText);
                threads.add(t);
                t.start(); // start thread
            }
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Search completed.");
    }
}

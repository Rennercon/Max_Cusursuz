package homework_nr_16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    private static ArrayList<String[]> dataArray = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String filePath = "src/main/java/homework_nr_16/MassiveDirectory/input.txt";
        readDataFromFile(filePath);
        if (!dataArray.isEmpty()) {
            printData(dataArray);
            findAverageMark(dataArray);
            findYoungestAndOldestPerson(dataArray);
        }
    }
    private static void readDataFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 3) {
                    dataArray.add(values);
                } else {
                    System.out.println("Некорректные данные: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printData(ArrayList<String[]> dataArray) {
        for (String[] row : dataArray) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static void findAverageMark(ArrayList<String[]> dataArray) {
        int i = 0;
        double sumAllMark = 0;

        for (String[] person : dataArray) {
            double mark = Double.parseDouble(person[2]);
            sumAllMark += mark;
            i++;
        }
        double AverageMark = sumAllMark/i;
        System.out.println("Средний балл: " + AverageMark);
    }

    private static void findYoungestAndOldestPerson(ArrayList<String[]> dataArray) {
        int youngestAge = Integer.MAX_VALUE;
        int oldestAge = Integer.MIN_VALUE;
        String youngestName = "";
        String oldestName = "";

        for (String[] person : dataArray) {
            int age = Integer.parseInt(person[1]);
            if (age < youngestAge) {
                youngestAge = age;
                youngestName = person[0];
            }
        }
        for (String[] person : dataArray) {
            int age = Integer.parseInt(person[1]);
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = person[0];
            }
        }
        System.out.println("Самый младший человек: " + youngestName + " (возраст " + youngestAge + ")");
        System.out.println("Самый старший человек: " + oldestName + " (возраст: " + oldestAge + ")");
    }
}

package homework_nr_21;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static final String connectionString = "jdbc:postgresql://localhost/students_db?user=postgres&password=postgres";
//    private static final String selectAllFromEmployeeInfoTable = "SELECT * FROM students_info";
    private static final String insertANewEmployeeIntoTheTable = "INSERT INTO Students_info(NAME, AGE, grade) VALUES ('Max', 12,'7A' )";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя ученика");
        String name = scanner.nextLine();
        System.out.println("Введите возраст ученика");
        int age = scanner.nextInt();
        System.out.println("Введите оцену ученика");
        float grade = scanner.nextFloat();

        System.out.println("Введите айди человека у которого хотите обновить оценку");
        int id = scanner.nextInt();

        System.out.println("Введите новую оценку");
        float newgrade = scanner.nextFloat();

        System.out.println("Введите айди для удаления студента");
        scanner.nextLine();
        int id_for_delete = scanner.nextInt();

        updateGrade(id, newgrade);
        insertValue(name, age, grade);
        deleteStudent(id_for_delete);
        printAllStudents();

        scanner.close();
    }

    public static void insertValue(String name, int age, float grade){
        try(Connection conn = DriverManager.getConnection(connectionString)){
            if (name.length() < 25 && !name.isEmpty() && grade >1 && grade <=10){
                if (age > 0 && age < 100) {
                    PreparedStatement ps = conn.prepareStatement(SQLQueries.INSERT_INTO_ALL_COLUMNS_QUERY.Query);

                    ps.setString(1,name);
                    ps.setInt(2,age);
                    ps.setFloat(3,grade);

                    ps.execute();
                    System.out.println("New student " + name + " hes been added succes");

                } else {
                    System.out.println("Не удалось ввести нового ученика проверьте его аттрибуты");
                }
            } else {
                System.out.println("Name and Grade are incorrect");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void printAllStudents(){
        try(Connection conn = DriverManager.getConnection(connectionString)){
            Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(SQLQueries.SELECT_ALL_COLUMN.Query);

            ResultSetMetaData rsmd = resultSet.getMetaData();

            List<String> columnList = new ArrayList<>();
            for(int index = 1; index != rsmd.getColumnCount() + 1; index++){
                columnList.add(rsmd.getColumnLabel(index));
            }

            while(resultSet.next()){
                for (String element :
                        columnList) {
                    System.out.print(resultSet.getString(element) + ", ");
                }
                System.out.println();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateGrade (int id, float grade){
        try(Connection conn = DriverManager.getConnection(connectionString)){
            if(grade >= 0 && grade <= 10){
                PreparedStatement ps = conn.prepareStatement(SQLQueries.UBDATE_BY_ID.Query);

                ps.setInt(2, id);
                ps.setFloat(1, grade);

                int rowsAffected = ps.executeUpdate();

                System.out.println("Rows affected: " + rowsAffected);

                if (rowsAffected > 0) {
                    System.out.println("Оценка была успешно изменена");
                } else {
                    System.out.println("Запись с указанным ID не найдена");
                }
            }else {
                System.out.println("такой оценки не существует в нашей стране");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteStudent(int id){
        try(Connection conn = DriverManager.getConnection(connectionString)){
            PreparedStatement ps = conn.prepareStatement(SQLQueries.DELETE_BY_ID.Query);

            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Студент был успешно удален из базы данных");
            } else {
                System.out.println("Запись с указанным ID не найдена");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

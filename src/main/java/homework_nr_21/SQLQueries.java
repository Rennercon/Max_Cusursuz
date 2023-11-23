package homework_nr_21;

public enum SQLQueries {

    INSERT_INTO_ALL_COLUMNS_QUERY("insert into students_info(name, age, grade) values (?, ?, ?)"),
    SELECT_ALL_COLUMN("select * from students_info"),
    UBDATE_BY_ID("UPDATE students_info SET grade = ? WHERE id = ?"),
    DELETE_BY_ID("delete from students_info where id = ?");

     final String Query;

    SQLQueries(String query) {
        Query = query;
    }
}

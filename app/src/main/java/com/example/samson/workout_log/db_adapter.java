package com.example.samson.workout_log;

public class db_adapter {
/** load db or create
 *  if load save last workout
 * */

/** save in reverse chronological order */


/** edit capabilities */
/** minimum requirements, muscle group worked out, excersises completed */

    /**     tables */
/** muscle groups, exercises , workouts, current weight */

//    private String query = "create table " + mTableName + " if doesn't exist";

    public db_adapter() {
      /** check if table exist */
      loadData();
       /* else */
       createTables();
    }

    private void createTables() {
        addColumns();
    }

    private void addColumns() {

    }

    public void loadData() {

    }

    public void saveData(String tableName) {

    }

    public void dropTable(String tableName) {

    }
}
package com.example.samson.workout_log;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/** on load the app would check the last workout entry.
      if none, prompt the user to enter a new workout.
      else print "last workout out completed on date", "muscle group worked out muscle_group"
      */
public class MainActivity extends ActionBarActivity {

    private       String mUserName = "";
    private       String mMuscleGroup;
    private       String mDateOfLastWorkout;
    private final String DEFAULT_MESSAGE = "You do not have a previous workout. Add one";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** display greeting */
        TextView greetingsView = (TextView) findViewById(R.id.view_greetings);
        greetingsView.setText(createGreeting());

        TextView lastWorkoutView = (TextView) findViewById(R.id.view_previous_workout);
        /** fetch last workout */
        /** else display default view */
        lastWorkoutView.setText(DEFAULT_MESSAGE);
        /** display previous workout  */
    }

    private String createGreeting() {
        if (!mUserName.equals("")) {
            return "Hey " + mUserName;
        } else {
            return "Hey there";
        }
    }

    private CharSequence getPreviousWorkout() {
        /** if no previous workout*/
        return "You do not have a previous workout. Add one";
        /** else return previous workout */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_new_workout) {
            Intent i = new Intent(this, new_entry_activity.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
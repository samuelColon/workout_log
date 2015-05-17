package com.example.samson.workout_log;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/** user will select a muscle group
      exercises completed, weight lifted, sets, reps */

/** TODO: add bundle for lifecycle purposes */
public class new_entry_activity extends ActionBarActivity implements AdapterView.OnItemSelectedListener {

    /**
     * this activity will need to access muscle group names, and exercise names.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_entry_activity);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);

        /* get info from db */

        /* display views */

        /* store info locally */
        
        /** init spinners */
        final Spinner muscleGroup = (Spinner) findViewById(R.id.spinner_muscle_group);
        muscleGroup.setOnItemSelectedListener(this);

        final Spinner exercise = (Spinner) findViewById(R.id.spinner_exercise);
        exercise.setOnItemSelectedListener(this);

        /** set up save discard buttons */
        final Button save = (Button) findViewById(R.id.save_button);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });

        final Button discard = (Button) findViewById(R.id.discard_button);
        discard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                discard();
            }
        });
    }

    private void discard() {
        finish();
    }

    private boolean save() {
        /** get data */


        saveToDb();

        /** if saved */
        Toast saved = Toast.makeText(this, "Saved", Toast.LENGTH_LONG);
        saved.show();
        finish();

        /**
         * else
         * Toast error = Toast.makeText(this, "something went wrong", Toast.LENGTH_LONG);
         * error.show();
         * return false;
         * */
        return true;
    }

    private void saveToDb() {
        /** save to db*/
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        /** Raise error on Save. Muscle group or exercise must be selected.*/
    }
}
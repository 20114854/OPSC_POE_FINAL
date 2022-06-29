package com.example.opsc_poe;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GoalsPage extends AppCompatActivity {
    EditText GoalDescription;
    EditText GoalLimit;
    Spinner spnCateGory =findViewById(R.id.spnCateGory);
    String SelectedspnCateGory = spnCateGory.getSelectedItem().toString();
    String goalLimit = GoalLimit.getText().toString();
    int IntgoalLimit = Integer.parseInt(goalLimit);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_page);
        GoalDescription =findViewById(R.id.GoalDescription);
        GoalLimit =findViewById(R.id.txtGoalLimit);
        Spinner spnCateGory =findViewById(R.id.spnCateGory);

    }

    public void addGoal(View view)
    {
        final ArrayList<ProgressBarView> arrayList = new ArrayList<ProgressBarView>();
        arrayList.add(new ProgressBarView(GoalDescription.toString(), IntgoalLimit));
        ProgressBarViewAdapter progressArrayAdapter = new ProgressBarViewAdapter(this, arrayList);
        ListView progressBarView = findViewById(R.id.progress_list);
        progressBarView.setAdapter(progressArrayAdapter);
    }
}
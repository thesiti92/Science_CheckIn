package com.milton.aians.science_checkin;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.AutoCompleteTextView;

import java.io.File;
import java.util.ArrayList;

public class checkinActivity extends AppCompatActivity {
    AutoCompleteTextView name;
    studentData db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File dbFile = getDatabasePath("studentData.sqlite").getAbsoluteFile();
        Log.e("yay", String.valueOf(dbFile.exists()));
        db= new studentData(this);

        //db = SQLiteDatabase.openDatabase(getDatabasePath("studentData.sqlite").getAbsolutePath(), null, 0);


        setContentView(R.layout.activity_checkin);
        name = (AutoCompleteTextView) findViewById(R.id.autoCompleteNameView);
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String cur = name.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

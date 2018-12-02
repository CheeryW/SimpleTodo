package com.example.cheery.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.cheery.simpletodo.MainActivity.ITEM_POSITION;
import static com.example.cheery.simpletodo.MainActivity.ITEM_TEXT;

public class EditActivity extends AppCompatActivity {

    EditText editItemText; // track edit text
    int position; // track position of edited item in the list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editItemText = findViewById(R.id.etItemText);
        editItemText.setText(getIntent().getStringExtra(ITEM_TEXT));
        position = getIntent().getIntExtra(ITEM_POSITION, 0);
        getSupportActionBar().setTitle("Edit Item");
    }

    // handler for save button
    public void onSaveItem(View v) {
        Intent i = new Intent();
        i.putExtra(ITEM_TEXT, editItemText.getText().toString());
        i.putExtra(ITEM_POSITION, position);
        setResult(RESULT_OK, i);
        finish();
    }
}

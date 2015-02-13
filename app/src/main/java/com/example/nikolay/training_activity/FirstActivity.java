package com.example.nikolay.training_activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class FirstActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fisrt);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fisrt, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void openSimpleActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    private void openWithParamsActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("param", 110);
        intent.putExtra("param2", "Hello");
        intent.putExtra("param3", true);
        intent.putExtra("param4", "true");
        startActivity(intent);
    }

    private void openWithSerializableParamsActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        Student student = new Student("Pet", 10);
        intent.putExtra("param", student);
        startActivity(intent);
    }
}

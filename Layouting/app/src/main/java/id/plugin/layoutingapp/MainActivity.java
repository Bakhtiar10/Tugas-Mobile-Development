package id.plugin.layoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ocLinear(View view){
        startActivity(new Intent(MainActivity.this, LinearActivity.class));
    }

    public void ocRelative(View view){
        startActivity(new Intent(MainActivity.this, RelativeActivity.class));
    }

    public void ocFrame(View view){
        startActivity(new Intent(MainActivity.this, FrameActivity.class));
    }

    public void ocConstraint(View view){
        startActivity(new Intent(MainActivity.this, ConstraintActivity.class));
    }

    public void ocScroll(View view){
        startActivity(new Intent(MainActivity.this, ScrollActivity.class));
    }

}

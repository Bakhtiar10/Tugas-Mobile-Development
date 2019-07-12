package id.plugin.layoutingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
    }

    public void kembali(View view){
        startActivity(new Intent(ConstraintActivity.this, MainActivity.class));
    }
}

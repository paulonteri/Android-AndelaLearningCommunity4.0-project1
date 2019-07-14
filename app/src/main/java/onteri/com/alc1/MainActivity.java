package onteri.com.alc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bu1(View view) {
        Intent i1 = new Intent(this, Web.class);
        startActivity(i1);
    }
    public void bu2(View view) {
        Intent i2 = new Intent(this, Profile.class);
        startActivity(i2);
    }
}

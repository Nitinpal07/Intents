package nitin.luckyproject.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        TextView txt =findViewById(R.id.text2);

        if (extras != null) {
            String editText = extras.getString("key1");
            txt.setText(editText);
        }

    }
}

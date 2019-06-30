package nitin.luckyproject.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        TextView txt =findViewById(R.id.text2);
        Button backbtn =findViewById(R.id.btn2);

        if (extras != null) {
            String editText = extras.getString("key1");
            txt.setText(editText);
        }

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        
    }

    @Override
    public void finish() {
        // Prepare data intent
        Intent data = new Intent();
        EditText editText2 = findViewById(R.id.edittext2);
        data.putExtra("returnKey1", editText2.getText().toString());
        // Activity finished ok, return the data
        setResult(RESULT_OK, data);
        super.finish();
    }
}

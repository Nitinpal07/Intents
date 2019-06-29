package nitin.luckyproject.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn =findViewById(R.id.btn1);
        Button btnexplicit =findViewById(R.id.btnexplicit);
        final EditText edtxt = findViewById(R.id.edittext1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra(edtxt.toString(),"value for activity two");
                startActivity(intent);

            }
        });


        btnexplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/"));
                startActivity(intent);
            }
        });
    }
}

package jvang.cs.cis3334.ex1question13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button pushMe;
    EditText name;
    TextView displayResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pushMe = (Button) findViewById(R.id.buttonPushMe);
        name = (EditText) findViewById(R.id.editTextGetName);
        displayResult = (TextView) findViewById(R.id.textViewGreatPrgmmrMsg);
        pushMe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                displayResult.setText(name.getText() + " is a great programmer!");
            }
        });
    }
}

package anyanwu3252.ct_215cs02003252;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EditText editMilesdriven = (EditText)findViewById(R.id.milesDriven);
    EditText editGallonsUsed = (EditText)findViewById(R.id.gallonsUsed);

    TextView txtAnswer = (TextView)findViewById(R.id.txtAnswer);

    Button btn = (Button)findViewById(R.id.btnCalc);

    double milesDriven = Double.parseDouble(editMilesdriven.getText().toString());
    double gallonsUsed = Double.parseDouble((editGallonsUsed.getText().toString()));

    double finalAnswer = 0;

    String answer = txtAnswer.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalAnswer = calculate(milesDriven, gallonsUsed);
                txtAnswer.setText(String.valueOf(finalAnswer));
            }
        });


    }

    public double calculate(double milesDriven, double GallonsUsed) {
        double mpg = milesDriven / gallonsUsed;

        return mpg;
    }
}

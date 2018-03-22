package com.nhum.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    Button btnSubmit;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        edt1 = (EditText) findViewById(R.id.edt1);
    }



    public void onRadioButtonClicked(View view) {
// Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
// Check which radio button was clicked
        switch (view.getId()) {
            case R.id.xs:
                if (checked)
                    tv1.setText("XS");
                break;
            case R.id.s:
                if (checked)
                    tv1.setText("S");
                break;
            case R.id.m:
                if (checked)
                    tv1.setText("M");
                break;
            case R.id.l:
                if (checked)
                    tv1.setText("L");
                break;
            case R.id.xl:
                if (checked)
                    tv1.setText("XL");
                break;
            case R.id.xxl:
                if (checked)
                    tv1.setText("XXL");
                break;
        }
    }

    public void onCheckboxClicked(View view) {
// Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
// Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.cbRed :
                if (checked)
                    tv2.setText( "Red" );
                break ;
            case R.id.cbBlue:
                if (checked)
                    tv2.setText( "Blue" );
                break ;
            case R.id.cbGreen:
                if (checked)
                    tv2.setText( "Green" );
                break ;
            case R.id.cbPink:
                if (checked)
                    tv2.setText( "Pink" );
                break ;
            case R.id.cbBlack:
                if (checked)
                    tv2.setText( "Black" );
                break ;
            case R.id.cbWhite:
                if (checked)
                    tv2.setText( "White" );
                break ;
        }
    }

    public void submit(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        tv3.setText(edt1.getText() + "  T-shirts");
    }
}

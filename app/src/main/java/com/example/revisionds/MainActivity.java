package com.example.revisionds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText _val1,_val2;
    Button _btnAdd,_btnSous,_btnDiv,_btnMul;
    TextView _textRes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _val1=(EditText) findViewById(R.id.editNum1);
        _val2=(EditText) findViewById(R.id.editNum2);
        _btnAdd=(Button) findViewById(R.id.btnAdd);
        _btnSous=(Button) findViewById(R.id.btnSous);
        _btnDiv=(Button) findViewById(R.id.btnDiv);
        _btnMul=(Button) findViewById(R.id.btnMul);
        _textRes=(TextView) findViewById(R.id.textRes);


        _btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Double valeur1 = Double.parseDouble(_val1.getText().toString());
                Double valeur2 = Double.parseDouble(_val2.getText().toString());
                Double resultat = valeur1 + valeur2;
                _textRes.setText("Le résultat est  "+resultat.toString());
            }
        });

        _btnSous.setOnClickListener(new View.OnClickListener(){

            @Override
                    public void onClick(View view) {
                Double valeur1 = Double.parseDouble(_val1.getText().toString());
                Double valeur2 = Double.parseDouble(_val2.getText().toString());
                Double result = valeur1 - valeur2;
                _textRes.setText("Le résultat est  "+result.toString());
            }
        });

        _btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Double valeur1 = Double.parseDouble(_val1.getText().toString());
                Double valeur2 = Double.parseDouble(_val2.getText().toString());
                Double result = valeur1 / valeur2;
                _textRes.setText("Le résultat est  "+result.toString());
            }
        });

        _btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Double valeur1 = Double.parseDouble(_val1.getText().toString());
                Double valeur2 = Double.parseDouble(_val2.getText().toString());
                Double result = valeur1 * valeur2;
                _textRes.setText("Le résultat est  "+result.toString());
            }
        });

    }
}
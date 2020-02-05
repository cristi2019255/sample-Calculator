package com.example.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickedAdd(View v ){
        EditText el1=(EditText)findViewById(R.id.num1);
        EditText el2=(EditText)findViewById(R.id.num2);
        TextView rezText=(TextView)findViewById(R.id.result);

        int numb1=Integer.parseInt(el1.getText().toString());
        int numb2=Integer.parseInt(el2.getText().toString());
        int rez=numb1+numb2;
        //int rez=numb1-numb2;
        rezText.setText(Integer.toString(rez));

    }
    public void OnButtonClickedSub(View v){
        EditText el1=(EditText)findViewById(R.id.num1);
        EditText el2=(EditText)findViewById(R.id.num2);
        TextView rezText=(TextView)findViewById(R.id.result);
        int numb1= Integer.parseInt(el1.getText().toString());
        int numb2=Integer.parseInt(el2.getText().toString());
        int rez=numb1-numb2;
        rezText.setText(Integer.toString(rez));
    }

    public void OnButtonClickedMul(View v){
        EditText el1=(EditText)findViewById(R.id.num1);
        EditText el2=(EditText)findViewById(R.id.num2);
        TextView rezText=(TextView)findViewById(R.id.result);
        int numb1= Integer.parseInt(el1.getText().toString());
        int numb2=Integer.parseInt(el2.getText().toString());
        int rez=numb1*numb2;
        rezText.setText(Integer.toString(rez));
    }

    public void OnButtonClickedDiv(View v){
        EditText el1=(EditText)findViewById(R.id.num1);
        EditText el2=(EditText)findViewById(R.id.num2);
        TextView rezText=(TextView)findViewById(R.id.result);
        int numb1= Integer.parseInt(el1.getText().toString());
        int numb2=Integer.parseInt(el2.getText().toString());
        int rez=numb1/numb2;
        rezText.setText(Integer.toString(rez));
    }
    public void OnButtonClickedPower(View v){
        EditText el1=(EditText)findViewById(R.id.num1);
        EditText el2=(EditText)findViewById(R.id.num2);
        TextView rezText=(TextView)findViewById(R.id.result);
        int numb1= Integer.parseInt(el1.getText().toString());
        int numb2=Integer.parseInt(el2.getText().toString());
        int rez=1;
        for (int i=0;i<numb2;i++){
            rez*=numb1;
        }

        rezText.setText(Integer.toString(rez));
    }


}

package com.example.app3_3;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Vytvořte aplikace, která zpracovává objednávky.
        Do EditTextu uživatel napíše cenu,
        Switchem vybere, zda chce k ceně přidat i náklady za dopravu.
        Checkboxem vybere zákazníka. Radiobuttonem přepne mezi sazbou DPH a Buttonem volbu potvrdí.
        V  textView se zobrazí jména všech zvolených zákazníků a cena. Cena za dopravu je 200 Kč.
         */
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editTextNumberDecimal);
                double numb = Double.parseDouble(editText.getText().toString());
                RadioButton radioButton = findViewById(R.id.radioButton3);
                if(radioButton.isChecked()) {numb*=1.21;}
                else {numb*=1.15;}
                Switch sw = findViewById(R.id.switch1);
                if(sw.isChecked()) {numb+=200;}
                String message = "Osoby:\n";
                CheckBox checkBox = findViewById(R.id.checkBox);
                if(checkBox.isChecked()) {message+=checkBox.getText()+"\n";}
                CheckBox checkBox2 = findViewById(R.id.checkBox2);
                if(checkBox2.isChecked()) {message+=checkBox2.getText()+"\n";}
                CheckBox checkBox3 = findViewById(R.id.checkBox3);
                if(checkBox3.isChecked()) {message+=checkBox3.getText()+"\n";}
                message += "\nCena:" + numb;
                TextView textView = findViewById(R.id.textView);
                textView.setText(message);
            }
        });
    }
}
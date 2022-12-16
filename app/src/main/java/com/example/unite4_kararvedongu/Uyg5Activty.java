package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activty extends AppCompatActivity {
    EditText txtNot1;
    EditText txtNot2;
    EditText txtNot3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activty);

        txtNot1 = findViewById(R.id.editTextNumber);
        txtNot2 = findViewById(R.id.editTextNumber2);
        txtNot3 = findViewById(R.id.editTextNumber3);
    }
    public void btnOnayla(View view) {
        int not1 = Integer.parseInt(txtNot1.getText().toString());
        int not2 = Integer.parseInt(txtNot2.getText().toString());
        int not3 = Integer.parseInt(txtNot3.getText().toString());

        float ort = (not1 + not2 + not3) / 3;
        if (ort >= 0 && ort < 25)
        {
            Toast.makeText(this, "0 ile kaldınız", Toast.LENGTH_SHORT).show();
        }

        else if (ort >= 25 && ort <45)
        {
            Toast.makeText(this, "1 ile kaldınız", Toast.LENGTH_SHORT).show();
        }
        else if (ort >= 45 && ort <55)
        {
            Toast.makeText(this, "2 ile kaldınız", Toast.LENGTH_SHORT).show();
        }

        else if (ort >= 55 && ort <70)
        {
            Toast.makeText(this, "3 ile kaldınız", Toast.LENGTH_SHORT).show();
        }

        else if (ort >= 70 && ort <85)
        {
            Toast.makeText(this, "4 ile kaldınız", Toast.LENGTH_SHORT).show();
        }
        else if (ort >= 85 && ort <100)
        { ö
            Toast.makeText(this, "5 ile geçtiniz", Toast.LENGTH_SHORT).show();
        }
    }
}
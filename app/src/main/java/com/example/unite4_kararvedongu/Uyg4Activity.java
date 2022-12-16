package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Switch konumServisleri,konumGonder,konumAl;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.uyg_4activity);

        konumServisleri = findViewById(R.id.switch1);
        konumAl = findViewById(R.id.switch2);
        konumGonder = findViewById(R.id.switch3);
        if (konumServisleri.isChecked())
        {
            konumAl.setVisibility(View.VISIBLE);
            konumGonder.setVisibility(View.VISIBLE);
        }
        else
        {

            konumAl.setVisibility(View.GONE);
            konumGonder.setVisibility(View.GONE);

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        konumServisleri.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (konumServisleri.isChecked())
                {
                    konumAl.setVisibility(View.VISIBLE);
                    konumGonder.setVisibility(View.VISIBLE);
                }
                else
                {

                    konumAl.setVisibility(View.GONE);
                    konumGonder.setVisibility(View.GONE);

                }
            }
        });

    }
    public void uyg4calistir (View View)
    {
        if (!konumServisleri.isChecked())
        {
            Toast.makeText(this,"Konum Servisleri Kapalı", Toast.LENGTH_LONG).show();
        }
        else
        {
            if (konumGonder.isChecked()==true && konumAl.isChecked()==true)
            {
                Toast.makeText(this,"Konum Gönder ve Konum Al Açık", Toast.LENGTH_LONG).show();
            }
            if (konumGonder.isChecked()==true && konumAl.isChecked()==false)
            {
                Toast.makeText(this,"Konum Gönder Açık ve Konum Al Kapalı", Toast.LENGTH_LONG).show();
            }
            if (konumGonder.isChecked()==false && konumAl.isChecked()==true)
            {
                Toast.makeText(this,"Konum Gönder Kapalı ve Konum Al Açık", Toast.LENGTH_LONG).show();
            }
            if (konumGonder.isChecked()==false && konumAl.isChecked()==false)
            {
                Toast.makeText(this,"Konum Gönder ve Konum Al Kapalı", Toast.LENGTH_LONG).show();
            }
        }
    }
}

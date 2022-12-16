package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    EditText editText_KullaniciAdi, editText_Sifresi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

        editText_KullaniciAdi = findViewById(R.id.editTextTextPersonName);

        editText_Sifresi = findViewById(R.id.editTextTextPersonName2);

    }

    final String kullaniciAdi = "mehmetcoban";
    final String Sifre = "12345678";

    public void onayla(View view) {

       String kadi1 = editText_KullaniciAdi.getText().toString();

      String  sifre1 = editText_Sifresi.getText().toString();

        if(kullaniciAdi.equals(kadi1) && Sifre.equals(sifre1)) {

            Toast.makeText(this,"Kullanıcı Girişi Başarılı",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Kullanıcı Adı veya Şifresi Hatalı",Toast.LENGTH_LONG).show();
        }
    }
}




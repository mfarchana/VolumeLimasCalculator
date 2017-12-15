package id.codefighters.volumelimascalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variabel
    EditText input_panjang;
    EditText input_lebar;
    EditText input_tinggi;
    Button hitung;
    TextView hasil;

    int panjang;
    int lebar;
    int tinggi;

    // hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_panjang = findViewById(R.id.input_panjang);
        input_lebar = findViewById(R.id.input_lebar);
        input_tinggi = findViewById(R.id.input_tinggi);
        hasil = findViewById(R.id.hasil);
        hitung = findViewById(R.id.hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Volume();
            }
        });

    }

    public void Volume() {
        if (input_panjang.getText().toString().isEmpty()) {
            Toast.makeText(this, "Form Panjang tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
        if (input_lebar.getText().toString().isEmpty()) {
            Toast.makeText(this, "Form Lebar tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
        if (input_tinggi.getText().toString().isEmpty()) {
            Toast.makeText(this, "Form Tinggi tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
        try{
            panjang = Integer.parseInt(input_panjang.getText().toString());
        }catch (Exception e){
        }
        try{
            lebar = Integer.parseInt(input_lebar.getText().toString());
        }catch (Exception e){
        }
        try{
            tinggi = Integer.parseInt(input_tinggi.getText().toString());
        }catch (Exception e){
        }

        double result = (panjang*lebar)*tinggi*0.333;
        hasil.setText("  Volume = "+String.valueOf(result)
        +"\n\n\n  Regards,"
        +"\n  MFarchanA");
    }

}
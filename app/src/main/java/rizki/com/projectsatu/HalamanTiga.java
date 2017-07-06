package rizki.com.projectsatu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HalamanTiga extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_tiga);

        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);

        btnHitung = (Button)findViewById(R.id.btnHItung);

        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //event button hitung
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String panjang = etPanjang.getText().toString();
                String lebar = etLebar.getText().toString();

                //cek apakah nilai edit text nya kosong atau tidak
                if(panjang.isEmpty()){
                    etPanjang.setError("Nilai Panjang tidak boleh kosong");
                }else if(lebar.isEmpty()){
                    etLebar.setError("Nilai Lebar tidak boleh kosong");
                }else{

                    float a = Float.parseFloat(panjang);
                    float b = Float.parseFloat(lebar);

                    float hasil = a * b;
                    txtHasil.setText("Hasilnya = " + hasil);
                }
            }
        });
    }
}

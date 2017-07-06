package rizki.com.projectsatu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by MAC on 11/26/16.
 */

public class Halaman2 extends AppCompatActivity {

    EditText etNama;
    TextView txtHasilNama;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);

        etNama = (EditText)findViewById(R.id.etNama);
        txtHasilNama = (TextView)findViewById(R.id.txtHasil);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);

        //event ketika di tekan tombol submit
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //cek apakah widget ediText nya kosong atau tidak
                String nama = etNama.getText().toString();

                if (nama.isEmpty()){
                    etNama.setError("Nama tidak boleh kosong");
                }else{
                    txtHasilNama.setText("Hi , " + nama);
                }
            }
        });


    }
}

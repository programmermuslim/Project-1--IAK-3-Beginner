package rizki.com.projectsatu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget button
    Button btn2, btn1, btn3, btn4, btn5;
    Context context = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //memanggil layout activity_main.xml
        setContentView(R.layout.activity_main);
        //memanggil id widget
        btn2 = (Button)findViewById(R.id.btnHal2);

        //action
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah ke activity halaman2
                Intent a1 = new Intent(getApplicationContext(), Halaman2.class);
                startActivity(a1);
            }
        });

        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah ke activity halaman3
                Intent a1 = new Intent(getApplicationContext(), HalamanTiga.class);
                startActivity(a1);
            }
        });

        btn1 = (Button)findViewById(R.id.btnToast);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // menampilkan toast
                Toast.makeText(getApplicationContext(),
                        "anda memilih toast ", Toast.LENGTH_SHORT).show();

            }
        });

        btn4 = (Button)findViewById(R.id.btnAlert);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
                builder1.setMessage("Hallo ini alert");
                builder1.setCancelable(true);

                builder1.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),
                                "Anda klik yes", Toast.LENGTH_SHORT).show();
                    }
                });

                builder1.setNegativeButton("NO", new
                        DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),
                                "Anda klik NO", Toast.LENGTH_SHORT).show();
                    }
                });
                builder1.show();
            }
        });

    }
}

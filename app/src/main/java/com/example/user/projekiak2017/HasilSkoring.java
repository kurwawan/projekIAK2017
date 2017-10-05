package com.example.user.projekiak2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HasilSkoring extends AppCompatActivity {

    TextView ztvSkorAkhir;
    Button zbtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_skoring);

        ztvSkorAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        zbtnMenu = (Button) findViewById(R.id.btnMenu);

        setSkor();

        zbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HasilSkoring.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void setSkor()
    {
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");

        if(activity.equals("PilihanGanda"))
        {
            ztvSkorAkhir.setText(" "+skorPilGan);
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Klik Button 'HOME'", Toast.LENGTH_SHORT).show();
    }
}

package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText lblTempoGasto;
    EditText lblVelMedia;
    EditText lblRenVeiculo;
    TextView lblDistancia;
    TextView lblConsumo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblTempoGasto = findViewById(R.id.lblTempoGasto);
        lblRenVeiculo = findViewById(R.id.lblRenVeiculo);
        lblVelMedia = findViewById(R.id.lblVelMedia);
        lblDistancia = findViewById(R.id.lblDistancia);
        lblConsumo = findViewById(R.id.lblConsumo);
    }
    public void Calcular (View v){

        if (lblTempoGasto.getText().toString().isEmpty()
                || lblVelMedia.getText().toString().isEmpty()
                || lblRenVeiculo.getText().toString().isEmpty()){
            Toast.makeText(this,"Digite todos os valores" , Toast.LENGTH_LONG).show();

        }else {
            double tempogasto = Double.parseDouble(lblTempoGasto.getText().toString());
            double Velmedia = Double.parseDouble(lblVelMedia.getText().toString());
            double Renveiculo = Double.parseDouble(lblRenVeiculo.getText().toString());
            double Distancia = tempogasto * Velmedia;
            double Consumo = Distancia * Renveiculo;
            lblDistancia.setText(String.valueOf(Distancia));
            lblConsumo.setText(String.valueOf(Consumo));


        }

    }
}

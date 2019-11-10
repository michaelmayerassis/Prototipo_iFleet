package com.example.ifleetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ViagemActivity extends AppCompatActivity {
    public class Viagem {
        String placa;
        String motorista;
        String local;
        String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Viagem() {
            this.placa = placa;
            this.motorista = motorista;
            this.local = local;
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getMotorista() {
            return motorista;
        }

        public void setMotorista(String motorista) {
            this.motorista = motorista;
        }

        public String getLocal() {
            return local;
        }

        public void setLocal(String local) {
            this.local = local;
        }
    }
    Viagem viagem = new Viagem();
    Viagem viagem1 = new Viagem();
    Viagem viagem2 = new Viagem();
    ArrayList<String> viagems = new ArrayList();
    ArrayList<Viagem> viagems1 = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);
        viagem.setLocal("Industria, av: são vargas, cidade: São José - SP , KM saida: 35.295");
        viagem.setMotorista("João Marques, CPF: 495.068.848-45");
        viagem.setPlaca("ADK-1832");
        viagem.setData("11/11/2011");

        viagem1.setLocal("Mercado, rua: Koralinda, cidade: Istambé - PA , KM saida: 52.953");
        viagem1.setMotorista("Enzo Silva, CPF: 922.754.012-23");
        viagem1.setPlaca("AWQ-0821");
        viagem1.setData("23/03/2014");

        viagem2.setLocal("Clube, fazenda: são Rock, cidade: Cajobi - SP , KM saida: 81.602");
        viagem2.setMotorista("Joacquim Gourmet, CPF: 954.812.102-10");
        viagem2.setPlaca("EZO-2301");
        viagem2.setData("11/11/2019");

        viagems.add(viagem.placa);
        viagems.add(viagem1.placa);
        viagems.add(viagem2.placa);

        viagems1.add(viagem);
        viagems1.add(viagem2);
        viagems1.add(viagem1);

        Spinner spinner = (Spinner) findViewById(R.id.txtPlaca);
        // Array Adapter que é definido como adapter do spinner
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, viagems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void click(View view) {
        Viagem a = new Viagem();
        Spinner spinner = (Spinner) findViewById(R.id.txtPlaca);
        TextView moto = (TextView) findViewById(R.id.txtMotorista);
        TextView local = (TextView) findViewById(R.id.txtLocal);
        TextView data = (TextView) findViewById(R.id.txtData);
        for (Viagem c : viagems1) {
            if (c.placa == spinner.getAdapter().getItem(spinner.getSelectedItemPosition())){
                moto.setText("Motorista:" + c.motorista);
                local.setText("Local: " + c.local);
                data.setText("Data: " + c.data);
            }
        }
    }
}

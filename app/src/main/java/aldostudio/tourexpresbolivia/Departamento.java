package aldostudio.tourexpresbolivia;

import android.content.Intent;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.x;

public class Departamento extends AppCompatActivity {

    TextView departamento;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ListView lista;
    ArrayList<Lugar> AL;
    ItemAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamento);
        getSupportActionBar().hide();



        departamento = (TextView)findViewById(R.id.TV_departamento);
        Bundle b =  this.getIntent().getExtras();
        departamento.setText(b.getString("dep").toString());

        String x = departamento.getText().toString();


        switch (x)
        {
            case "Beni":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "Chuquisaca":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "Cochabamba":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "La Paz":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "Oruro":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "Pando":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "Potosi":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "Santa Cruz":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
            case "Tarija":
                img1 =(ImageView)findViewById(R.id.IV_1);
                img1.setImageResource(R.drawable.lp1);
                img2 =(ImageView)findViewById(R.id.IV_2);
                img2.setImageResource(R.drawable.lp2);
                img3 =(ImageView)findViewById(R.id.IV_3);
                img3.setImageResource(R.drawable.lp3);
                img4 =(ImageView)findViewById(R.id.IV_4);
                img4.setImageResource(R.drawable.lp4);
                img5 =(ImageView)findViewById(R.id.IV_5);
                img5.setImageResource(R.drawable.lp5);
                break;
        }
        lista = (ListView)findViewById(R.id.Lista);
        AL = new ArrayList<Lugar>();
        llenar();
        adapter = new ItemAdapter(this,AL);
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Lugar lugar = AL.get(i);

                Intent intent = new Intent(Departamento.this,LugarDetallado.class);
                Bundle b = new Bundle();
                b.putString("nombre",lugar.getNombre());
                b.putString("reseña",lugar.getReseña());
                b.putDouble("alt",lugar.getUbalt());
                b.putDouble("lat",lugar.getUblat());

                intent.putExtras(b);
                startActivity(intent);

            }
        });
    }
    public void llenar()
    {

        String x = departamento.getText().toString();
        Lugar lugar;
        switch (x)
        {

            case "Beni":
                lugar = new Lugar("Calido","Rurrenabaque","Rurrenabaque es un municipio y una ciudad turística del Departamento del Beni, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Templado","trinidad","Trinidad es una ciudad de Bolivia, capital del departamento del Beni. Con una superficie de 35 km², cuenta con una población estimada de 110.000 habitantes.",-14.820521,-64.908264);
                AL.add(lugar);
                lugar = new Lugar("Calido","Guayaramerín","Guayaramerín es un municipio y una ciudad turística del Departamento del Beni, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Calido","Riberalta","Riberalta es un municipio y una ciudad turística del Departamento del Beni, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "Chuquisaca":
                lugar = new Lugar("Templado","Sucre","sucre es un municipio y una ciudad turística del Departamento del chuquisaca, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Calido","Camargo","Camargo es un municipio y una ciudad turística del Departamento del Chuquisaca, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Templado","Tareabuco","Tareabuco es un municipio y una ciudad turística del Departamento del Chuquisaca, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Calido","Monteagudo","Monteagudo es un municipio y una ciudad turística del Departamento del Chuquisaca, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "Cochabamba":
                lugar = new Lugar("Templado","Cristo","Cristo de la concordia es un municipio y una ciudad turística del Departamento del Cochabamba, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("calido","Catedral","Catedral es un municipio y una ciudad turística del Departamento del Cochabamba, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Templado","Mariscal","Mariscal de santacruz es un municipio y una ciudad turística del Departamento del Cochabamba, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Templado","Casona","casona es un municipio y una ciudad turística del Departamento del Cochabamba, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "La Paz":
                lugar = new Lugar("Frio","Thiahuanaco","Thiahuanaco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Plaza Murilo","Plaza Murilo es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Sanfrancisco","Sanfrancisco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Coroico","Coroico es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Yungas","Yungas es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Madidi","Madidi es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Illimani","Illimani es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Mirador","Mirador es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "Oruro":
                lugar = new Lugar("Frio","Thiahuanaco","Thiahuanaco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Plaza Murilo","Plaza Murilo es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Sanfrancisco","Sanfrancisco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Coroico","Coroico es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Yungas","Yungas es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Madidi","Madidi es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Illimani","Illimani es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Mirador","Mirador es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "Pando":
                lugar = new Lugar("Frio","Thiahuanaco","Thiahuanaco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Plaza Murilo","Plaza Murilo es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Sanfrancisco","Sanfrancisco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Coroico","Coroico es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Yungas","Yungas es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Madidi","Madidi es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Illimani","Illimani es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Mirador","Mirador es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "Potosi":
                lugar = new Lugar("Frio","Thiahuanaco","Thiahuanaco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Plaza Murilo","Plaza Murilo es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Sanfrancisco","Sanfrancisco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Coroico","Coroico es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Yungas","Yungas es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Madidi","Madidi es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Illimani","Illimani es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Mirador","Mirador es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "Santa Cruz":
                lugar = new Lugar("Frio","Thiahuanaco","Thiahuanaco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Plaza Murilo","Plaza Murilo es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Sanfrancisco","Sanfrancisco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Coroico","Coroico es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Yungas","Yungas es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Madidi","Madidi es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Illimani","Illimani es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Mirador","Mirador es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
            case "Tarija":
                lugar = new Lugar("Frio","Thiahuanaco","Thiahuanaco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Plaza Murilo","Plaza Murilo es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Sanfrancisco","Sanfrancisco es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Coroico","Coroico es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Yungas","Yungas es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Madidi","Madidi es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Illimani","Illimani es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                lugar = new Lugar("Frio","Mirador","Mirador es un municipio y una ciudad turística del Departamento del Lap Paz, Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.",-14.421135,-67.536212);
                AL.add(lugar);
                break;
        }


    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub

        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                Intent intent = new Intent(Departamento.this, MainActivity.class);
                startActivity(intent);
                finish();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

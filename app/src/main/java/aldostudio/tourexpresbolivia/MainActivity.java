package aldostudio.tourexpresbolivia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.y;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int cont = 0 ;
    ImageButton izq;
    ImageButton der;
    Button buscar;
    Button buscar2;
    TextView estacion;
    Spinner departamentos;
    String [] dep = {"--DEPARTAMENTOS--","Beni","Chuquisaca","Cochabamba", "La Paz","Oruro","Pando", "Potosi","Santa Cruz", "Tarija"};
    String a = "La Paz";

    int sw=0;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mediaPlayer = MediaPlayer.create(this,R.raw.nav);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(100,100);
        mediaPlayer.start();



        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw==0)
                {
                    mediaPlayer.pause();
                    sw=1;
                }
                else
                {
                    if(sw==1)
                    {
                        mediaPlayer.start();
                        sw=0;
                    }
                }

            }
        });

        getSupportActionBar().hide();



        departamentos = (Spinner)findViewById(R.id.S_departamentos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dep);
        departamentos.setAdapter(adapter);
        departamentos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 1:
                        a="Beni";
                        break;
                    case 2:
                        a="Chuquisaca";
                        break;
                    case 3:
                        a="Cochabamba";
                        break;
                    case 4:
                        a="La Paz";
                        break;
                    case 5:
                        a="Oruro";
                        break;
                    case 6:
                        a="Pando";
                        break;
                    case 7:
                        a="Potosi";
                        break;
                    case 8:
                        a="Santa Cruz";
                        break;
                    case 9:
                        a="Tarija";
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        LinearLayout l = (LinearLayout)findViewById(R.id.content_main);
        l.setBackgroundResource(R.drawable.fondo1);
        izq = (ImageButton)findViewById(R.id.IB_izq);
        der = (ImageButton)findViewById(R.id.IB_der);
        estacion= (TextView)findViewById(R.id.TV_epoca);

        buscar = (Button)findViewById(R.id.BT_buscar);
        buscar.setOnClickListener(this);
        buscar2 = (Button)findViewById(R.id.BT_bus);
        buscar2.setOnClickListener(this);

        izq.setOnClickListener(this);
        der.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        LinearLayout l = (LinearLayout)findViewById(R.id.content_main);
        switch (view.getId())
        {
            case R.id.IB_izq:
                if(estacion.getText().toString().equals("NAVIDAD"))
                {
                    estacion.setText("HALLOWEN");
                    l.setBackgroundResource(R.drawable.hallowen);
                    mediaPlayer.stop();
                    sw=0;
                    mediaPlayer = MediaPlayer.create(this,R.raw.hallo);
                    mediaPlayer.setLooping(true);
                    mediaPlayer.setVolume(100,100);
                    mediaPlayer.start();
                }
                else
                {
                    if(estacion.getText().toString().equals("HALLOWEN"))
                    {
                        estacion.setText("CARNAVALES");
                        l.setBackgroundResource(R.drawable.carnaval);
                        mediaPlayer.stop();
                        sw=0;
                        mediaPlayer = MediaPlayer.create(this,R.raw.car);
                        mediaPlayer.setLooping(true);
                        mediaPlayer.setVolume(100,100);
                        mediaPlayer.start();

                    }
                    else
                    {
                        if(estacion.getText().toString().equals("CARNAVALES"))
                        {
                            estacion.setText("SEMANA SANTA");
                            l.setBackgroundResource(R.drawable.semana);
                            mediaPlayer.stop();
                            sw=0;
                            mediaPlayer = MediaPlayer.create(this,R.raw.sem);
                            mediaPlayer.setLooping(true);
                            mediaPlayer.setVolume(100,100);
                            mediaPlayer.start();
                        }
                        else
                        {
                            estacion.setText("NAVIDAD");
                            l.setBackgroundResource(R.drawable.fondo1);
                            mediaPlayer.stop();
                            sw=0;
                            mediaPlayer = MediaPlayer.create(this,R.raw.nav);
                            mediaPlayer.setLooping(true);
                            mediaPlayer.setVolume(100,100);
                            mediaPlayer.start();
                        }
                    }
                }
                break;
            case R.id.IB_der:
                if(estacion.getText().toString().equals("NAVIDAD"))
                {
                    estacion.setText("SEMANA SANTA");
                    l.setBackgroundResource(R.drawable.semana);
                    mediaPlayer.stop();
                    sw=0;
                    mediaPlayer = MediaPlayer.create(this,R.raw.sem);
                    mediaPlayer.setLooping(true);
                    mediaPlayer.setVolume(100,100);
                    mediaPlayer.start();
                }
                else
                {
                    if(estacion.getText().toString().equals("SEMANA SANTA"))
                    {
                        estacion.setText("CARNAVALES");
                        l.setBackgroundResource(R.drawable.carnaval);
                        mediaPlayer.stop();
                        sw=0;
                        mediaPlayer = MediaPlayer.create(this,R.raw.car);
                        mediaPlayer.setLooping(true);
                        mediaPlayer.setVolume(100,100);
                        mediaPlayer.start();
                    }
                    else
                    {
                        if(estacion.getText().toString().equals("CARNAVALES"))
                        {
                            estacion.setText("HALLOWEN");
                            l.setBackgroundResource(R.drawable.hallowen);
                            mediaPlayer.stop();
                            sw=0;
                            mediaPlayer = MediaPlayer.create(this,R.raw.hallo);
                            mediaPlayer.setLooping(true);
                            mediaPlayer.setVolume(100,100);
                            mediaPlayer.start();
                        }
                        else
                        {
                            estacion.setText("NAVIDAD");
                            l.setBackgroundResource(R.drawable.fondo1);
                            mediaPlayer.stop();
                            sw=0;
                            mediaPlayer = MediaPlayer.create(this,R.raw.nav);
                            mediaPlayer.setLooping(true);
                            mediaPlayer.setVolume(100,100);
                            mediaPlayer.start();
                        }
                    }
                }
                break;
            case R.id.BT_buscar:
                mediaPlayer.stop();
                Intent intent = new Intent(MainActivity.this,Departamento.class);
                Bundle b = new Bundle();
                b.putString("dep",a);
                intent.putExtras(b);
                startActivity(intent);
                break;
            case R.id.BT_bus:
                String x="";
                String y="";
                if(estacion.getText().equals("NAVIDAD"))
                {
                    x = "Santa Cruz";
                    y = "Santa Cruz es un departamento  y una ciudad turística de Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.";
                }
                else
                {
                    if(estacion.getText().equals("CARNAVALES"))
                    {
                        x = "Oruro";
                        y = "Oruro es un departamento  y una ciudad turística de Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.";
                    }
                    else
                    {
                        if(estacion.getText().equals("SEMANA SANTA"))
                        {   x = "Copacabana";
                            y = "Copacabana es un municipio  y una ciudad turística de Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.";
                        }
                        else
                        {
                            x = "Potosi";
                            y = "Potosi es un departamento  y una ciudad turística de Bolivia, que se encuentra entre los 3 destinos más visitados por su ubicación geográfica al Parque nacional Madidi.";
                        }
                    }

                }
                mediaPlayer.stop();
                Intent intent1 = new Intent(MainActivity.this,LugarDetallado.class);
                Bundle b1 = new Bundle();
                b1.putString("nombre",x);
                b1.putString("reseña",y);
                intent1.putExtras(b1);
                startActivity(intent1);
                break;
        }

    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        switch(keyCode){

            case KeyEvent.KEYCODE_BACK:
                cont++;
                if(cont == 2)
                {
                    mediaPlayer.stop();
                    cont=0;
                    finish();
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(this, "Pulse nuevamente atras para salir",
                            Toast.LENGTH_SHORT).show();
                }

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

package aldostudio.tourexpresbolivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class LugarDetallado extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    TextView nombre;
    TextView reseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugar_detallado);

        nombre= (TextView)findViewById(R.id.TV_nombre);
        reseña = (TextView)findViewById(R.id.TV_reseña);

        img1 =(ImageView)findViewById(R.id.IV_1);
        img1.setImageResource(R.drawable.d1);
        img2 =(ImageView)findViewById(R.id.IV_2);
        img2.setImageResource(R.drawable.d2);
        img3 =(ImageView)findViewById(R.id.IV_3);
        img3.setImageResource(R.drawable.d3);
        img4 =(ImageView)findViewById(R.id.IV_4);
        img4.setImageResource(R.drawable.d4);


        Bundle b =  this.getIntent().getExtras();
        nombre.setText(b.getString("nombre").toString());
        reseña.setText(b.getString("reseña").toString());
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub

        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                Intent intent = new Intent(LugarDetallado.this, MainActivity.class);
                startActivity(intent);
                finish();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

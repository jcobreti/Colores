package android.edu.colores;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int cont,colorB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cont=0;
        colorB = getResources().getColor(R.color.tocado);



    }

    public void fClic(View view) {
        int colorId;
        LinearLayout l1= (LinearLayout) view;
        ColorDrawable colorOrigen=(ColorDrawable)l1.getBackground();

        colorId=colorOrigen.getColor();

        if (colorId!=colorB) {
            l1.setBackgroundColor(colorB);
            cont++;
            if (cont==12) {
                cerrar();
            }
        }
    }
    private void cerrar() {
        Toast.makeText(this,"-  TODO EN NEGRO -",Toast.LENGTH_LONG).show();
        //finish();
    }
}

package com.example.a03ciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/*
    IMPORTANTE!!!!
    Cuando vamos pulsando al botón para lanzar una nueva Activity, la añade a la pila
    LIFO de Activity, y cuando en la segunda Activity pulsamos el Boton RETURN,
    crea una nueva Activity en la pila LIFO y así sucesivamente, por lo que va añadiendo nuevas Activitys.


    SOLUCIÓN INFO: https://stackoverflow.com/questions/15393899/how-to-close-activity-and-go-back-to-previous-activity-in-android
        - Usar Finish(),
        - Usar super.onBackPressed();

    SOLUCIÓN INFO:
        - https://stackoverflow.com/questions/6330260/finish-all-previous-activities
        - https://elbauldelprogramador.com/eliminar-la-pila-de-actividades-back-stack-en-android/

 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Primera Actividad", "onCreate()");
    }


    // Se ejecuta después del onCreate y del onRestart
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Primera Actividad", "onStart()");
    }

    // Se ejecuta después de onStop
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Primera Actividad", "onRestart()");
    }

    // Se ejecuta después de onStart
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Primera Actividad", "onResume()");
    }

    // Se ejecuta después de estar en ejecución la actividad
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Primera Actividad", "onPause()");
    }

    // Se ejecuta después de onPause
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Primera Actividad", "onStop()");
    }

    // Se ejecuta después de onStop
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Primera Actividad", "onDestroy()");
    }

    public void onClickNext(View view) {
        Toast.makeText(getApplicationContext(), "Vamos a la segunda Activity!!", Toast.LENGTH_LONG).show();
        Intent siguienteActividad = new Intent(this, SegundaActivity.class);
        startActivity(siguienteActividad);

    }
}

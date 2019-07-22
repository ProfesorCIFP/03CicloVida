package com.example.a03ciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Log.i("Segunda Actividad", "onCreate()");
    }

    // Se ejecuta después del onCreate y del onRestart
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Segunda Actividad", "onStart()");
    }

    // Se ejecuta después de onStop
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Segunda Actividad", "onRestart()");
    }

    // Se ejecuta después de onStart
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Segunda Actividad", "onResume()");
    }

    // Se ejecuta después de estar en ejecución la actividad
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Segunda Actividad", "onPause()");
    }

    // Se ejecuta después de onPause
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Segunda Actividad", "onStop()");
    }

    // Se ejecuta después de onStop
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Segunda Actividad", "onDestroy()");
    }

    public void onClickReturn(View view) {
        Toast.makeText(this, "Volvemos a la Primera Activity!!", Toast.LENGTH_SHORT).show();

        Intent anteriorActivity = new Intent(this, MainActivity.class);

        // TERCERA SOLUCIÓN, añadir flags al Intent.
        // INFO: - https://stackoverflow.com/questions/6330260/finish-all-previous-activities
        //       - https://elbauldelprogramador.com/eliminar-la-pila-de-actividades-back-stack-en-android/
        // Intent anteriorActivity = new Intent(this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        startActivity(anteriorActivity);

        // Para no crear una lista interminable de Activitys en la pila LIFO de Activity.
        // PRIMERA SOLUCIÓN
        //finish();

        // SEGUNDA SOLUCIÓN
        //super.onBackPressed();


    }
}

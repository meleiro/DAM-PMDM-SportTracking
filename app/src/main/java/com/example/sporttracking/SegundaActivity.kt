package com.example.sporttracking

// Bundle se utiliza para almacenar y transportar información
// relacionada con el estado de una Activity.
//
// Android puede utilizar esta información, por ejemplo, cuando
// necesita volver a crear una Activity.
import android.os.Bundle

import androidx.activity.ComponentActivity

// AppCompatActivity es la clase base que utilizamos para crear
// nuestras Activities.
//
// Al heredar de AppCompatActivity, SegundaActivity obtiene
// el comportamiento necesario para funcionar como una pantalla
// dentro de nuestra aplicación Android.
import androidx.appcompat.app.AppCompatActivity


// SegundaActivity representa la segunda pantalla de nuestra aplicación.
//
// Esta Activity será abierta desde MainActivity mediante un Intent.
class SegundaActivity : ComponentActivity() {


    // onCreate() forma parte del ciclo de vida de una Activity.
    //
    // Android ejecuta este método cuando crea esta pantalla.
    //
    // Aquí realizamos la configuración inicial de SegundaActivity,
    // como indicar qué archivo XML contiene su interfaz gráfica.
    override fun onCreate(savedInstanceState: Bundle?) {


        // Llamamos al método onCreate() de la clase padre.
        //
        // Esto permite que Android realice las tareas necesarias
        // para inicializar correctamente la Activity.
        super.onCreate(savedInstanceState)


        // Indicamos qué archivo XML queremos utilizar como
        // interfaz gráfica de esta Activity.
        //
        // R.layout.activity_segunda hace referencia al archivo:
        //
        // res/layout/activity_segunda.xml
        //
        // Los TextView, Button, ImageView y demás Views que
        // coloquemos en ese XML formarán la interfaz de esta pantalla.
        setContentView(R.layout.activity_segunda)
    }
}
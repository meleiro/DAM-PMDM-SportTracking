package com.example.sporttracking

// Intent permite indicar que queremos pasar desde una Activity
// a otra Activity de nuestra aplicación.
import android.content.Intent

import androidx.activity.ComponentActivity
// Bundle se utiliza para almacenar y transportar información relacionada
// con el estado de una Activity.
import android.os.Bundle

// Importamos Button para poder trabajar desde Kotlin con los botones
// que hemos definido previamente en nuestros archivos XML.
import android.widget.Button

// AppCompatActivity es la clase base que utilizaremos para nuestras Activities.
// Nuestra MainActivity hereda de ella y obtiene el comportamiento básico
// necesario para funcionar como una pantalla de Android.
import androidx.appcompat.app.AppCompatActivity


// MainActivity representa la pantalla principal de nuestra aplicación.
//
// Al escribir ": AppCompatActivity()" estamos indicando que MainActivity
// hereda de AppCompatActivity.
class MainActivity : ComponentActivity(){


    // onCreate() es uno de los métodos principales del ciclo de vida
    // de una Activity.
    //
    // Android ejecuta este método cuando crea la Activity.
    // Por este motivo, aquí realizamos normalmente la configuración
    // inicial de nuestra pantalla.
    override fun onCreate(savedInstanceState: Bundle?) {

        // Llamamos al método onCreate() de la clase padre.
        //
        // Esto permite que Android realice primero las tareas necesarias
        // para crear correctamente la Activity.
        super.onCreate(savedInstanceState)


        // Indicamos qué archivo XML contiene la interfaz gráfica
        // que queremos mostrar en esta Activity.
        //
        // R.layout.activity_main hace referencia al archivo:
        //
        // res/layout/activity_main.xml
        //
        // A partir de este momento, MainActivity utiliza como interfaz
        // los elementos que hemos definido dentro de activity_main.xml.
        setContentView(R.layout.activity_main)


        // Buscamos dentro de activity_main.xml el botón cuyo identificador es:
        //
        // android:id="@+id/btnSegundaPantalla"
        //
        // findViewById() permite obtener desde Kotlin una referencia
        // a una View que existe en el XML.
        //
        // <Button> indica el tipo de View que estamos buscando.
        //
        // Guardamos esa referencia en una variable llamada "boton".
        val boton = findViewById<Button>(R.id.btnSegundaPantalla)


        // setOnClickListener permite indicar qué debe ocurrir cuando
        // el usuario pulsa el botón.
        //
        // El código situado entre las llaves { } se ejecutará
        // cada vez que el usuario pulse btnSegundaPantalla.
        boton.setOnClickListener {


            // Creamos un Intent.
            //
            // Un Intent puede utilizarse para solicitar a Android
            // que abra otra Activity.
            //
            // En este caso indicamos:
            //
            // this
            //     Hace referencia a la Activity actual: MainActivity.
            //
            // SegundaActivity::class.java
            //     Indica la clase de la Activity que queremos abrir.
            //
            // Por tanto, este Intent representa la intención de pasar:
            //
            // MainActivity  --->  SegundaActivity
            val intent = Intent(
                this,
                SegundaActivity::class.java
            )


            // Solicitamos a Android que inicie la Activity indicada
            // en el Intent que acabamos de crear.
            //
            // Como el Intent apunta a SegundaActivity,
            // Android abrirá esa nueva pantalla.
            startActivity(intent)
        }
    }
}
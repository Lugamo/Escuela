package com.example.eduardo.escuela;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private EditText edit;
    private Button btnMa, btnAl, btnTr;
    private ListView ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView = (ListView) findViewById(R.id.historial);
        final ArrayList<String> informacion = new ArrayList<String>();
        edit = (EditText)findViewById(R.id.editText);
        btnMa = (Button) findViewById(R.id.btnMaestro);
        btnMa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text= edit.getText().toString();
                if(text != null && !text.isEmpty()){
                    EscuelaFactory escuelaFactory = new EscuelaFactory();
                    Escuela escuela = escuelaFactory.getEscuela("Maestro");
                    Output salida = Output.getUser();
                    salida.setOutput(text, escuela.rol(),escuela.pago());
                    informacion.add(salida.getOutput());
                    edit.setText("");
                }else {

                    AlertDialog.Builder myBuild = new AlertDialog.Builder(MainActivity.this);
                    myBuild.setMessage("El campo Nombre se encuentra vacio, por favor ingrese un nombre");
                    myBuild.setTitle("Alerta");
                    myBuild.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    myBuild.show();
                }
            }
        });
        btnAl = (Button) findViewById(R.id.btnAlumno);
        btnAl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text= edit.getText().toString();
                if(text != null && !text.isEmpty()){
                    EscuelaFactory escuelaFactory = new EscuelaFactory();
                    Escuela escuela = escuelaFactory.getEscuela("Alumno");
                    Output salida = Output.getUser();
                    salida.setOutput(text, escuela.rol(),escuela.pago());
                    informacion.add(salida.getOutput());
                    edit.setText("");
                }else {

                    AlertDialog.Builder myBuild = new AlertDialog.Builder(MainActivity.this);
                    myBuild.setMessage("El campo Nombre se encuentra vacio, por favor ingrese un nombre");
                    myBuild.setTitle("Alerta");
                    myBuild.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    myBuild.show();
                }
            }
        });
        btnTr = (Button) findViewById(R.id.btnTrabajador);
        btnTr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text= edit.getText().toString();
                if(text != null && !text.isEmpty()){
                    EscuelaFactory escuelaFactory = new EscuelaFactory();
                    Escuela escuela = escuelaFactory.getEscuela("Trabajador");
                    Output salida = Output.getUser();
                    salida.setOutput(text, escuela.rol(),escuela.pago());
                    informacion.add(salida.getOutput());
                    edit.setText("");
                }else {

                    AlertDialog.Builder myBuild = new AlertDialog.Builder(MainActivity.this);
                    myBuild.setMessage("El campo Nombre se encuentra vacio, por favor ingrese un nombre");
                    myBuild.setTitle("Alerta");
                    myBuild.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    myBuild.show();
                }
            }
        });

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,informacion);
        ListView.setAdapter(adaptador);
    }


}



package com.example.practica1170719;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    RadioButton rb1,rb2;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    ToggleButton tb1,tb2;
    Switch swich1,swich2;
    Button btn1,btn2;
    RadioGroup rg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.ET1);
        et2 = (EditText) findViewById(R.id.ET2);
        et3 = (EditText) findViewById(R.id.ET3);
        rb1 = (RadioButton) findViewById(R.id.RB1);
        rb2 = (RadioButton) findViewById(R.id.RB2);
        cb1 = (CheckBox) findViewById(R.id.CB1);
        cb2 = (CheckBox) findViewById(R.id.CB2);
        cb3 = (CheckBox) findViewById(R.id.CB3);
        cb4 = (CheckBox) findViewById(R.id.CB4);
        cb5 = (CheckBox) findViewById(R.id.CB5);
        cb6 = (CheckBox) findViewById(R.id.CB6);
        tb1 = (ToggleButton) findViewById(R.id.TB1);
        tb2 = (ToggleButton) findViewById(R.id.TB2);
        swich1 = (Switch) findViewById(R.id.SWICH1);
        swich2 = (Switch) findViewById(R.id.SWICH2);
        btn1 = (Button) findViewById(R.id.BT1);
        btn2 = (Button) findViewById(R.id.BT2);
        rg1 = (RadioGroup) findViewById(R.id.RG1);
    }
    public void borrar(View view){
        et1.getText().clear();
        et2.getText().clear();
        et3.getText().clear();
        rg1.clearCheck();

        if (cb1.isChecked()) {
            cb1.setChecked(false);
        } else {
            if (cb2.isChecked()) {
                cb2.setChecked(false);
            } else {
                if (cb3.isChecked()) {
                    cb3.setChecked(false);
                } else {
                    if (cb4.isChecked()) {
                        cb4.setChecked(false);
                    } else {
                        if (cb5.isChecked()) {
                            cb6.setChecked(false);
                        } else {
                            if (cb6.isChecked()) {
                                cb6.setChecked(false);
                            } else {

                                if (tb1.isChecked()) {
                                    tb1.setChecked(false);
                                } else {
                                    if (tb2.isChecked()) {
                                        tb2.setChecked(false);
                                    } else {
                                        if (swich1.isChecked()) {
                                            swich1.setChecked(false);
                                        } else {
                                            if (swich2.isChecked()) {
                                                swich2.setChecked(false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void Registro(View view){
        boolean retorno=true;
        String nombre=et1.getText().toString();
        String Apellido=et1.getText().toString();
        String edad=et3.getText().toString();
        String genero=rb1.getText().toString();
        String generos=rb2.getText().toString();
   
        String mostrar,reserva;
        if(nombre.isEmpty()){
            Toast.makeText(this, "El campo nombre no debe quedar vacio", Toast.LENGTH_LONG).show();
              retorno=false;
        }
        else {
            if (Apellido.isEmpty()) {
                Toast.makeText(this, "El campo Apellido no debe quedar vacio", Toast.LENGTH_LONG).show();

                retorno = false;
            } else {
                if (edad.isEmpty()) {
                    Toast.makeText(this, "El campo Edad no debe quedar vacio", Toast.LENGTH_LONG).show();

                    retorno = false;
                } else {
                    if ((rb1.isChecked() == false) && (rb2.isChecked() == false)) {
                        Toast.makeText(this, "Campos de eleccionde sexo esta vacio", Toast.LENGTH_SHORT).show();
                    } else {
                        if ((cb1.isChecked() == false) && (cb2.isChecked() == false) && (cb3.isChecked() == false) && (cb4.isChecked() == false) && (cb5.isChecked() == false) && (cb6.isChecked() == false)) {
                            Toast.makeText(this, "campos vacios seleccione interes", Toast.LENGTH_LONG).show();

                        } else {
                            if ((tb1.isChecked() == false) && (tb2.isChecked() == false)) {
                                Toast.makeText(this, "campos vacios seleccione ", Toast.LENGTH_LONG).show();

                            } else {
                                if ((swich1.isChecked() == false) && (swich2.isChecked() == false)) {
                                    Toast.makeText(this, "Campos sin registro", Toast.LENGTH_LONG).show();

                                } else {
                                    Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show();
                                    btn2.setEnabled(true);
                                }
                            }
                        }
                    }
                }
            }
        }
            }
        }
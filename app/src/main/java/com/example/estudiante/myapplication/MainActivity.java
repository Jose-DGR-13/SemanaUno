package com.example.estudiante.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);

    }

    @Override
    public void onClick(View view) {
        EditText url = (EditText) findViewById(R.id.editText);
        String enlace = url.getText().toString();
        try {
            InetAddress arregloDir[] = InetAddress.getAllByName(enlace);
            for (int i = 0; i < arregloDir.length; i++) {
                if (enlace != null && enlace.equalsIgnoreCase(" ")) {
                    TextView ips = (TextView) findViewById(R.id.textView);
                    String direc = arregloDir[i].toString();
                    ips.setText(direc);
                }
            }
        } catch (UnknownHostException e) {
            System.out.println("Error ubicando al host");
        }

    }
}

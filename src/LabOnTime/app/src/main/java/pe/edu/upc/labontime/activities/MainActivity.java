package pe.edu.upc.labontime.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.upc.labontime.R;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText usuarioEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent intent = new Intent(MainActivity.this,PacienteActivity.class);
                startActivity(intent);*/
               login();
            }

        });

    }

    public void login(){

        usuarioEditText = (EditText) findViewById(R.id.usuarioEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        if(usuarioEditText.getText().toString().equals("admin") &&
                passwordEditText.getText().toString().equals("123456")) {
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this,PacienteActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),
                    "Wrong Credentials...",Toast.LENGTH_SHORT).show();

            usuarioEditText.setVisibility(View.VISIBLE);
            usuarioEditText.setBackgroundColor(Color.RED);

        }
    }



}

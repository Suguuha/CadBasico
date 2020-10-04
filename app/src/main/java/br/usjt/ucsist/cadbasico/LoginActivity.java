package br.usjt.ucsist.cadbasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void NovoCadastro(View view) {
        Intent intent = new Intent(this, cadastroActivity.class);
        startActivity(intent);
    }

    public void Login(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
}
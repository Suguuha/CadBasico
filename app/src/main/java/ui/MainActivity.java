package ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import br.usjt.ucsist.cadbasico.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.editar:
            Intent intent = new Intent(String.valueOf(this));
            startActivity(intent);
            case R.id.sair:
            finish();
            return (true);
        }
        return(super.onOptionsItemSelected(item));
    }
}
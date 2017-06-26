package br.com.alura.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_formulario_ok:
                Toast.makeText(FormularioActivity.this, "Botão Clicado!", Toast.LENGTH_SHORT).show();

                EditText campoNome = (EditText) findViewById(R.id.formulario_nome);
                String nome = campoNome.getText().toString();

                EditText campoEndereco = (EditText) findViewById(R.id.formulario_endereco);
                String endereco = campoEndereco.getText().toString();

                EditText campoTelefone = (EditText) findViewById(R.id.formulario_telefone);
                String telefone = campoTelefone.getText().toString();

                EditText campoSite = (EditText) findViewById(R.id.formulario_site);
                String site = campoSite.getText().toString();

                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
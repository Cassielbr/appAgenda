package br.ulbra.appagenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edNome, edCpf, edTelefone;
    private Button btSalvar;
    private PessoaDAO dao;
    private Pessoa pessoa = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os campos de texto e o botão
        edNome = findViewById(R.id.edNome);
        edCpf = findViewById(R.id.edCpf);
        edTelefone = findViewById(R.id.edTelefone);
        btSalvar = findViewById(R.id.btSalvar);

        // Inicializando a instância do DAO
        dao = new PessoaDAO(this);

        // Verificando se é uma atualização, e preenchendo os campos com os dados da pessoa
        Intent it = getIntent();
        if (it.hasExtra("pessoa")) {
            pessoa = (Pessoa) it.getSerializableExtra("pessoa");
            edNome.setText(pessoa.getNome());
            edCpf.setText(pessoa.getCpf());
            edTelefone.setText(pessoa.getTelefone());
        }
    }

    public void salvar(View view) {
        // Se a pessoa for nula, ou seja, é um novo cadastro
        if (pessoa == null) {
            Pessoa p = new Pessoa();
            p.setNome(edNome.getText().toString());
            p.setCpf(edCpf.getText().toString());
            p.setTelefone(edTelefone.getText().toString());

            // Inserindo a nova pessoa no banco de dados
            long id = dao.inserir(p);
            Toast.makeText(this, "Pessoa cadastrada com ID: " + id, Toast.LENGTH_LONG).show();
        } else {
            // Atualizando os dados da pessoa
            pessoa.setNome(edNome.getText().toString());
            pessoa.setCpf(edCpf.getText().toString());
            pessoa.setTelefone(edTelefone.getText().toString());

            // Atualizando a pessoa no banco de dados
            dao.atualizar(pessoa);
            Toast.makeText(this, pessoa.getNome() + ", atualizado com sucesso!", Toast.LENGTH_LONG).show();
        }

        // Após salvar, você pode redirecionar ou finalizar a atividade (se necessário)
        finish();  // Caso queira fechar a atividade após salvar.
    }
}

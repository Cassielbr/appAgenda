package br.ulbra.appagenda;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    private static final String NAME = "agenda.db";
    private static final int VERSION = 1;

    public Conexao(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE pessoa (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, cpf TEXT, telefone TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS pessoa");
        onCreate(db);
    }
}

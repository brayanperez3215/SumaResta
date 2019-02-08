package darkdesigner.sumaresta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import  android.widget.Toast;




public class SumaRestaConversion extends AppCompatActivity {

    private EditText oper1, oper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_resta_conversion);

        oper1=(EditText)findViewById(R.id.Num1);

        oper2=(EditText)findViewById(R.id.Num2);
    }

    public void sumar(View v){



        int n1=Integer.parseInt(oper1.getText().toString());

        int n2=Integer.parseInt(oper2.getText().toString());

        int sum=n1+n2;

        mostrar(sum);

    }

    public void restar(View v){



        int n1=Integer.parseInt(oper1.getText().toString());

        int n2=Integer.parseInt(oper2.getText().toString());

        int sum=n1-n2;

        mostrar(sum);

    }

    public void conversor (View v)

    int n1=Integer.parseInt(oper1.getText().toString());

    int n2=Integer.parseInt(oper2.getText().toString());



   private void mostrar(int res){

        Toast.makeText(this, “Resultado: ” + res, Toast.LENGTH_LONG).show();
}

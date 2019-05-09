package app.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtA=findViewById(R.id.txtA);
        final TextView txtB=findViewById(R.id.txtB);
        final Button btnSumar=findViewById(R.id.btnSumar);
        final TextView txtResult=findViewById(R.id.txtResult);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a= Double.parseDouble(txtA.getText().toString());
                double b= Double.parseDouble(txtB.getText().toString());
                double suma= a+b;
                txtResult.setText(""+suma);

            }
        });

        final TextView txtRA=findViewById(R.id.txtRA);
        final TextView txtRB=findViewById(R.id.txtRB);
        final Button btnResta=findViewById(R.id.btnResta);
        final TextView txtResultResta=findViewById(R.id.txtResultResta);

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c=Double.parseDouble(txtRA.getText().toString());
                double d=Double.parseDouble(txtRB.getText().toString());
                double resta= c-d;
                txtResultResta.setText(""+resta);
            }
        });

        final TextView txtM=findViewById(R.id.txtM);
        final TextView txtM2=findViewById(R.id.txtM2);
        final Button btnMultiplicar=findViewById(R.id.btnMultiplicar);
        final TextView txtRM=findViewById(R.id.txtRM);

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double e=Double.parseDouble(txtM.getText().toString());
                double f=Double.parseDouble(txtM2.getText().toString());
                double multiplicacion= e*f;
                txtRM.setText(""+multiplicacion);
            }
        });

        final TextView txtDividir=findViewById(R.id.txtDividir);
        final TextView txtDividir2=findViewById(R.id.txtDividir2);
        final Button btnDividir=findViewById(R.id.btnDividir);
        final TextView txtRD=findViewById(R.id.txtRD);

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double g=Double.parseDouble(txtDividir.getText().toString());
                double h=Double.parseDouble(txtDividir2.getText().toString());
                double division= g/h;
                txtRD.setText(""+division);
            }
        });

        final TextView txtPotencia=findViewById(R.id.txtPotencia);
        final TextView txtPotencia2=findViewById(R.id.txtPotencia2);
        final Button btnPotencia=findViewById(R.id.btnPotencia);
        final TextView txtRP=findViewById(R.id.txtRP);

        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double i=Double.parseDouble(txtPotencia.getText().toString());
                double j=Double.parseDouble(txtPotencia2.getText().toString());
                double x1= Math.pow(i,j);
                txtRP.setText(""+x1);
            }
        });

        final TextView txtPorcentaje=findViewById(R.id.txtPorcentaje);
        final TextView txtPorcentaje2=findViewById(R.id.txtPorcentaje2);
        final Button btnPorcentaje=findViewById(R.id.btnPorcentaje);
        final TextView txtRPO=findViewById(R.id.txtRPO);

        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double k=Double.parseDouble(txtPorcentaje.getText().toString());
                double p=Double.parseDouble(txtPorcentaje2.getText().toString());
                double x2=(k*p)/100;
                txtRPO.setText(""+x2);
            }
        });
    }


}


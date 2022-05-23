package BSEF19A031.Ramsha.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

public class Quiz extends AppCompatActivity {
    ImageView imgview;
    Button opa,opb,opc,last;
    EditText edit;
    String val1 = "Congrats!Right answer";
    String val2="Next";
    String val3 = "Oops!Wrong answer";
    String val4="Retake Quiz";

    String chek = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final Random num = new Random();
        int set = num.nextInt(26);
        edit=findViewById(R.id.RW);
        last=findViewById(R.id.check);
        imgview = findViewById(R.id.imageView);
        opa=findViewById(R.id.opA);
        opb=findViewById(R.id.opB);
        opc=findViewById(R.id.opC);
        if(set==0){
            imgview.setImageResource(R.drawable.qa);
            chek="A";
            opa.setText("A");
            opb.setText("F");
            opc.setText("Q");
        }
        else if(set==1){
            imgview.setImageResource(R.drawable.qb);
            chek="B";
            opa.setText("G");
            opb.setText("B");
            opc.setText("C");
        }
        else if(set==2){
            imgview.setImageResource(R.drawable.qc);
            chek="C";
            opa.setText("W");
            opb.setText("F");
            opc.setText("C");
        }
        else if(set==3){
            chek="D";
            imgview.setImageResource(R.drawable.qd);
            opa.setText("A");
            opb.setText("D");
            opc.setText("O");
        }
        else if(set==4){
            chek="E";
            imgview.setImageResource(R.drawable.qe);
            opa.setText("E");
            opb.setText("F");
            opc.setText("P");
        }
        else if(set==5){
            chek="F";
            imgview.setImageResource(R.drawable.qf);
            opa.setText("F");
            opb.setText("D");
            opc.setText("K");
        }
        else if(set==6){
            chek="G";
            imgview.setImageResource(R.drawable.qg);
            opa.setText("Q");
            opb.setText("G");
            opc.setText("M");
        }
        else if(set==7){
            chek="H";
            imgview.setImageResource(R.drawable.qh);
            opa.setText("O");
            opb.setText("H");
            opc.setText("V");
        }
        else if(set==8){
            chek="I";
            imgview.setImageResource(R.drawable.qi);
            opa.setText("C");
            opb.setText("A");
            opc.setText("I");
        }
        else if(set==9){
            chek="J";
            imgview.setImageResource(R.drawable.qj);
            opa.setText("Q");
            opb.setText("J");
            opc.setText("P");
        }
        else if(set==10){
            chek="K";
            imgview.setImageResource(R.drawable.qk);
            opa.setText("M");
            opb.setText("K");
            opc.setText("C");
        }
        else if(set==11){
            chek="L";
            imgview.setImageResource(R.drawable.ql);
            opa.setText("L");
            opb.setText("Q");
            opc.setText("B");
        }
        else if(set==12){
            chek="M";
            imgview.setImageResource(R.drawable.qm);
            opa.setText("T");
            opb.setText("M");
            opc.setText("U");
        }
        else if(set==13){
            chek="N";
            imgview.setImageResource(R.drawable.qn);
            opa.setText("R");
            opb.setText("N");
            opc.setText("S");
        }
        else if(set==14){

            chek="O";
            imgview.setImageResource(R.drawable.qo);
            opa.setText("A");
            opb.setText("O");
            opc.setText("P");
        }
        else if(set==15){
            chek="P";
            imgview.setImageResource(R.drawable.qp);
            opa.setText("Q");
            opb.setText("F");
            opc.setText("P");
        }
        else if(set==16){
            chek="Q";
            imgview.setImageResource(R.drawable.qqui);
            opa.setText("X");
            opb.setText("Q");
            opc.setText("V");
        }
        else if(set==17){
            chek="R";
            imgview.setImageResource(R.drawable.qr);
            opa.setText("Y");
            opb.setText("X");
            opc.setText("R");
        }
        else if(set==18){
            chek="S";
            imgview.setImageResource(R.drawable.qs);
            opa.setText("L");
            opb.setText("S");
            opc.setText("Q");
        }
        else if(set==19){
            chek="T";
            imgview.setImageResource(R.drawable.qt);
            opa.setText("T");
            opb.setText("F");
            opc.setText("K");
        }
        else if(set==20){
            chek="U";
            imgview.setImageResource(R.drawable.qu);
            opa.setText("A");
            opb.setText("E");
            opc.setText("U");
        }
        else if(set==21){
            chek="V";
            imgview.setImageResource(R.drawable.qv);
            opa.setText("T");
            opb.setText("B");
            opc.setText("V");
        }
        else if(set==22){
            chek="W";
            imgview.setImageResource(R.drawable.qw);
            opa.setText("K");
            opb.setText("W");
            opc.setText("I");
        }
        else if(set==23){
            chek="X";
            imgview.setImageResource(R.drawable.qx);
            opa.setText("W");
            opb.setText("X");
            opc.setText("Q");
        }
        else if(set==24){
            chek="Y";
            imgview.setImageResource(R.drawable.qy);
            opa.setText("I");
            opb.setText("F");
            opc.setText("Y");
        }
        else if(set==25){
            chek="Z";
            imgview.setImageResource(R.drawable.qz);
            opa.setText("G");
            opb.setText("Z");
            opc.setText("I");
        }
        opa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ");
                last.setText(" ");
                if (chek.equals(opa.getText())) {
                    edit.setText(val1);
                    last.setText(val2);
                } else {
                    edit.setText(val3);
                    last.setText(val4);
                }
                opb.setEnabled(false);
                opc.setEnabled(false);
            }
        });
        opb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ");
                last.setText(" ");
                if(chek.equals(opb.getText())){
                    edit.setText(val1);
                    last.setText(val2);
                }
                else{
                    edit.setText(val3);
                    last.setText(val4);
                }
                opa.setEnabled(false);
                opc.setEnabled(false);
            }

        });
        opc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ");
                last.setText(" ");
                if(chek.equals(opc.getText())){
                    edit.setText(val1);
                    last.setText(val2);
                }
                else{
                    edit.setText(val3);
                    last.setText(val4);
                }
                opa.setEnabled(false);
                opb.setEnabled(false);
            }
        });
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(" ");
                last.setText(" ");
                opa.setEnabled(true);
                opb.setEnabled(true);
                opc.setEnabled(true);
                startActivity(new Intent(Quiz.this,Quiz.class));
            }
        });
    }
}
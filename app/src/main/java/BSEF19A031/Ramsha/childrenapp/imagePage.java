package BSEF19A031.Ramsha.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class imagePage extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_page);
        image=findViewById(R.id.Image);
        String result = getIntent().getStringExtra("val");
        if(result.equals("A")){
            image.setImageResource(R.drawable.aa);
        }
        else if(result.equals("B")){
            image.setImageResource(R.drawable.bb);
        }
        else if(result.equals("C")){
            image.setImageResource(R.drawable.cc);
        }
        else if(result.equals("D")){
            image.setImageResource(R.drawable.dd);
        }
        else if(result.equals("E")){
            image.setImageResource(R.drawable.ee);
        }
        else if(result.equals("F")){
            image.setImageResource(R.drawable.ff);
        }
        else if(result.equals("G")){
            image.setImageResource(R.drawable.gg);
        }
        else if(result.equals("H")){
            image.setImageResource(R.drawable.hh);
        }
        else if(result.equals("I")){
            image.setImageResource(R.drawable.ii);
        }
        else if(result.equals("J")){
            image.setImageResource(R.drawable.jj);
        }
        else if(result.equals("K")){
            image.setImageResource(R.drawable.kk);
        }
        else if(result.equals("L")){
            image.setImageResource(R.drawable.ll);
        }
        else if(result.equals("M")){
            image.setImageResource(R.drawable.mm);
        }
        else if(result.equals("N")){
            image.setImageResource(R.drawable.nn);
        }
        else if(result.equals("O")){
            image.setImageResource(R.drawable.oo);
        }
        else if(result.equals("P")){
            image.setImageResource(R.drawable.pp);
        }
        else if(result.equals("Q")){
            image.setImageResource(R.drawable.qq);
        }
        else if(result.equals("R")){
            image.setImageResource(R.drawable.rr);
        }
        else if(result.equals("S")){
            image.setImageResource(R.drawable.ss);
        }
        else if(result.equals("T")){
            image.setImageResource(R.drawable.tt);
        }
        else if(result.equals("U")){
            image.setImageResource(R.drawable.uu);
        }
        else if(result.equals("V")){
            image.setImageResource(R.drawable.vv);
        }
        else if(result.equals("W")){
            image.setImageResource(R.drawable.ww);
        }
        else if(result.equals("X")){
            image.setImageResource(R.drawable.xx);
        }
        else if(result.equals("Y")){
            image.setImageResource(R.drawable.yy);
        }
        else if(result.equals("Z")){
            image.setImageResource(R.drawable.zz);
        }


    }
}
package BSEF19A031.Ramsha.childrenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity implements View.OnClickListener {

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        a=findViewById(R.id.button);
        a.setOnClickListener(this);
        b=findViewById(R.id.button2);
        b.setOnClickListener(this);
        c=findViewById(R.id.button3);
        c.setOnClickListener(this);
        d=findViewById(R.id.button4);
        d.setOnClickListener(this);
        e=findViewById(R.id.button5);
        e.setOnClickListener(this);
        f=findViewById(R.id.button6);
        f.setOnClickListener(this);
        g=findViewById(R.id.button7);
        g.setOnClickListener(this);
        h=findViewById(R.id.button8);
        h.setOnClickListener(this);
        i=findViewById(R.id.button9);
        i.setOnClickListener(this);
        j=findViewById(R.id.button10);
        j.setOnClickListener(this);
        k=findViewById(R.id.button11);
        k.setOnClickListener(this);
        l=findViewById(R.id.button12);
        l.setOnClickListener(this);
        m=findViewById(R.id.button13);
        m.setOnClickListener(this);
        n=findViewById(R.id.button14);
        n.setOnClickListener(this);
        o=findViewById(R.id.button15);
        o.setOnClickListener(this);
        p=findViewById(R.id.button16);
        p.setOnClickListener(this);
        q=findViewById(R.id.button17);
        q.setOnClickListener(this);
        r=findViewById(R.id.button18);
        r.setOnClickListener(this);
        s=findViewById(R.id.button19);
        s.setOnClickListener(this);
        t=findViewById(R.id.button20);
        t.setOnClickListener(this);
        u=findViewById(R.id.button21);
        u.setOnClickListener(this);
        v=findViewById(R.id.button22);
        v.setOnClickListener(this);
        w=findViewById(R.id.button23);
        w.setOnClickListener(this);
        x=findViewById(R.id.button24);
        x.setOnClickListener(this);
        y=findViewById(R.id.button25);
        y.setOnClickListener(this);
        z=findViewById(R.id.button26);
        z.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(MainPage.this,imagePage.class);
        switch (v.getId( )) {
            case R.id.button:
                intent.putExtra("val","A");
                startActivity(intent);
                break;
            case R.id.button2:
                intent.putExtra("val","B");
                startActivity(intent);
                break;
            case R.id.button3:
                intent.putExtra("val","C");
                startActivity(intent);
                break;
            case R.id.button4:
                intent.putExtra("val","D");
                startActivity(intent);
                break;
            case R.id.button5:
                intent.putExtra("val","E");
                startActivity(intent);
                break;
            case R.id.button6:
                intent.putExtra("val","F");
                startActivity(intent);
                break;
            case R.id.button7:
                intent.putExtra("val","G");
                startActivity(intent);
                break;
            case R.id.button8:
                intent.putExtra("val","H");
                startActivity(intent);
                break;
            case R.id.button9:
                intent.putExtra("val","I");
                startActivity(intent);
                break;
            case R.id.button10:
                intent.putExtra("val","J");
                startActivity(intent);
                break;
            case R.id.button11:
                intent.putExtra("val","K");
                startActivity(intent);
                break;
            case R.id.button12:
                intent.putExtra("val","L");
                startActivity(intent);
                break;
            case R.id.button13:
                intent.putExtra("val","M");
                startActivity(intent);
                break;
            case R.id.button14:
                intent.putExtra("val","N");
                startActivity(intent);
                break;
            case R.id.button15:
                intent.putExtra("val","O");
                startActivity(intent);
                break;
            case R.id.button16:
                intent.putExtra("val","P");
                startActivity(intent);
                break;
            case R.id.button17:
                intent.putExtra("val","Q");
                startActivity(intent);
                break;
            case R.id.button18:
                intent.putExtra("val","R");
                startActivity(intent);
                break;
            case R.id.button19:
                intent.putExtra("val","S");
                startActivity(intent);
                break;
            case R.id.button20:
                intent.putExtra("val","T");
                startActivity(intent);
                break;
            case R.id.button21:
                intent.putExtra("val","U");
                startActivity(intent);
                break;
            case R.id.button22:
                intent.putExtra("val","V");
                startActivity(intent);
                break;
            case R.id.button23:
                intent.putExtra("val","W");
                startActivity(intent);
                break;
            case R.id.button24:
                intent.putExtra("val","X");
                startActivity(intent);
                break;
            case R.id.button25:
                intent.putExtra("val","Y");
                startActivity(intent);
                break;
            case R.id.button26:
                intent.putExtra("val","Z");
                startActivity(intent);
                break;
        }
    }
}

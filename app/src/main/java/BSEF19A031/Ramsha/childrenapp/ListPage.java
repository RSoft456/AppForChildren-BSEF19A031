package BSEF19A031.Ramsha.childrenapp;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListPage extends AppCompatActivity {

    AlphaListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);
        ArrayList<AlphaListView> ListViewArray = new ArrayList<AlphaListView>();
        ListViewArray.add(new AlphaListView("Aa", "A is for Apple", R.drawable.qa));
        ListViewArray.add(new AlphaListView("Bb", "B is for Ball", R.drawable.qb));
        ListViewArray.add(new AlphaListView("Cc", "C is for Cat", R.drawable.qc));
        ListViewArray.add(new AlphaListView("Dd", "D is for Dog", R.drawable.qd));
        ListViewArray.add(new AlphaListView("Ee", "E is for Elephant", R.drawable.qe));
        ListViewArray.add(new AlphaListView("Ff", "F is for Fish", R.drawable.qf));
        ListViewArray.add(new AlphaListView("Gg", "G is for Grapes", R.drawable.qg));
        ListViewArray.add(new AlphaListView("Hh", "H is for Hat", R.drawable.qh));
        ListViewArray.add(new AlphaListView("Ii", "I is for Ice-cream ", R.drawable.qi));
        ListViewArray.add(new AlphaListView("Jj", "J is for Jug", R.drawable.qj));
        ListViewArray.add(new AlphaListView("Kk", "K is for Kite", R.drawable.qk));
        ListViewArray.add(new AlphaListView("Ll", "L is for Lemon", R.drawable.ql));
        ListViewArray.add(new AlphaListView("Mm", "M is for Monkey", R.drawable.qm));
        ListViewArray.add(new AlphaListView("Nn", "N is for Nose", R.drawable.qn));
        ListViewArray.add(new AlphaListView("Oo", "O is for Orange", R.drawable.qo));
        ListViewArray.add(new AlphaListView("Pp", "P is for Pencil", R.drawable.qp));
        ListViewArray.add(new AlphaListView("Qq", "Q is for Quilt", R.drawable.qqui));
        ListViewArray.add(new AlphaListView("Rr", "R is for rainbow", R.drawable.qr));
        ListViewArray.add(new AlphaListView("Ss", "S is for Sun", R.drawable.qs));
        ListViewArray.add(new AlphaListView("Tt", "T is for Train", R.drawable.qt));
        ListViewArray.add(new AlphaListView("Uu", "U is for Umbrella", R.drawable.qu));
        ListViewArray.add(new AlphaListView("Vv", "V is for Vase", R.drawable.qv));
        ListViewArray.add(new AlphaListView("Ww", "W is for Whale", R.drawable.qw));
        ListViewArray.add(new AlphaListView("Xx", "X is for Xylophone", R.drawable.qx));
        ListViewArray.add(new AlphaListView("Yy", "Y is for yo-yo", R.drawable.qy));
        ListViewArray.add(new AlphaListView("Zz", "Z is for Zebra", R.drawable.qz));

        ListAdapter adapter = new ListAdapter(this, ListViewArray);
        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(adapter);
    }
}
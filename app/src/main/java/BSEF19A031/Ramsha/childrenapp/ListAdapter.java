package BSEF19A031.Ramsha.childrenapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<AlphaListView> {
    public ListAdapter(@NonNull Context context, ArrayList<AlphaListView> ListViewArray) {
        super(context, R.layout.listitems, ListViewArray);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        AlphaListView list = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitems, parent, false);
        TextView Alphabet = convertView.findViewById(R.id.Alpha);
        TextView StandsFor = convertView.findViewById(R.id.StandFor);
        ImageView imageView = convertView.findViewById(R.id.AlphaImage);
        Alphabet.setText(list.Alpha);
        StandsFor.setText(list.StandFor);
        imageView.setImageResource(list.imageID);
        return convertView;
    }
}


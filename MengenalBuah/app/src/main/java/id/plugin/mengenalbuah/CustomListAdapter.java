package id.plugin.mengenalbuah;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namabuah;
    private int[] gambarbuah;

    //klik kanan + generate + constructore
    public CustomListAdapter(@NonNull Context context1, String[] namabuah, int[] gambarbuah) {
        super(context1, R.layout.item_buah, namabuah);
        this.context = context1;
        this.namabuah = namabuah;
        this.gambarbuah = gambarbuah;
    }
    //getView

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Atur Layout Item
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false);

        //findViewByid setiap komponen yang ada di dalam item
        TextView tvNamaBuah = view.findViewById(R.id.tv_detail_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_detail_gambar);

        //set data
        tvNamaBuah.setText(namabuah[position]);
        ivGambarBuah.setImageResource(gambarbuah[position]);

        return view;
    }
}

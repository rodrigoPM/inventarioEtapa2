package com.pdm.sube.cum.inventarioetapa2.menu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pdm.sube.cum.inventarioetapa2.R;
import com.pdm.sube.cum.inventarioetapa2.menu.IntegranteItemFragment.OnListFragmentInteractionListener;


import java.util.List;

public class MyIntegranteItemRecyclerViewAdapter extends RecyclerView.Adapter<MyIntegranteItemRecyclerViewAdapter.ViewHolder> {

    private final List<Integrante> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyIntegranteItemRecyclerViewAdapter(List<Integrante> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_integranteitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.carnet.setText(holder.mItem.getCarnet());
        holder.nombre.setText(holder.mItem.getNombre());
        holder.tablas.setText(holder.mItem.getTablas());
        holder.imagen.setImageResource(holder.mItem.getImagen());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView carnet;
        public final TextView nombre;
        public final TextView tablas;
        public final ImageView imagen;
        public Integrante mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            carnet = (TextView) view.findViewById(R.id.txt_carnet);
            nombre = (TextView) view.findViewById(R.id.txt_nombre);
            tablas = (TextView) view.findViewById(R.id.txt_tablas);
            imagen = (ImageView) view.findViewById(R.id.imgview_img);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + carnet.getText() + "'";
        }
    }
}

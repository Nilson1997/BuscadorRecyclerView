package com.yagami.buscadorrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.UsuarioViewHolder> {

    Context context;
    List<Usuario> ListaUsuarios;

    public  AdaptadorUsuarios(Context context, List<Usuario> ListaUsuarios){
        this.context = context;
        this.ListaUsuarios = ListaUsuarios;
    }


    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_usuario, viewGroup, false);
        return new UsuarioViewHolder(v);
    }
    @Override
    public void onBindViewHolder (@NonNull UsuarioViewHolder usuarioViewHolder, int i) {

    }
    @Override
    public int getItemCount(){
        return ListaUsuarios.size();
    }
    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        TextView tvNombre, tvTelefono, tvEmail;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvTelefono = itemView.findViewById(R.id.tvTelefono);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }
    }
    public void filtrar(ArrayList<Usuario> filtroUsuarios){
        this.ListaUsuarios = filtroUsuarios;
        notifyDataSetChanged();
    }
}

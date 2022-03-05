package edu.udb.recyclerviewdinamico;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TurismoItemAdapter extends
        RecyclerView.Adapter<TurismoItemAdapter.TeamViewHolder> {
    ArrayList<Turismo> turismo = new ArrayList<>();
    Context context;
    public TurismoItemAdapter(ArrayList<Turismo> turismo, Context context){
        this.turismo = turismo;
        this.context = context;
    }
    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View row =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new TeamViewHolder(row);
    }
    @Override
    public void onBindViewHolder(TeamViewHolder holder, @SuppressLint("RecyclerView") final int position) {
      Turismo turismo = this.turismo.get(position);
        //Picasso.with(context).load(team.getImgLogo()).fit().placeholder(R.drawable.loading).error(R.drawable.alert).into(holder.imageLogo);
        Picasso.get().load(turismo.getImgLogo()).into(holder.imageLogo);
        holder.turismoDescription.setText("⭐"+ turismo.getDescription());
        holder.teamName.setText(turismo.getTeamName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailActivity.class);
                intent.putExtra("teamdetail", TurismoItemAdapter.this.turismo.get(position));
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return turismo.size();
    }
    public static class TeamViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageLogo;
        private TextView teamName;
        private TextView turismoDescription;
        private TextView turismoDepartamento;
        public TeamViewHolder(View itemView) {
            super(itemView);
            imageLogo = (ImageView) itemView.findViewById(R.id.teamImage);
            teamName = (TextView) itemView.findViewById(R.id.teamName);
            turismoDescription= (TextView)
                    itemView.findViewById(R.id.teamDescription);
            turismoDepartamento = (TextView)
                    itemView.findViewById(R.id.tourisDepartment);

        }

        public ImageView getImageLogo() {
            return imageLogo;
        }

        public void setImageLogo(ImageView imageLogo) {
            this.imageLogo = imageLogo;
        }

        public TextView getTeamName() {
            return teamName;
        }

        public void setTeamName(TextView teamName) {
            this.teamName = teamName;
        }

        public TextView getTeamDescription() {
            return turismoDescription;
        }

        public TextView getTurismoDepartamento() {
            return  turismoDepartamento;
        }
        public void setTurismoDepartamento(TextView turismoDepartamento) {
            this.turismoDepartamento = turismoDepartamento;
        }


        public void setTeamDescription(TextView teamDescription) {
            this.turismoDescription = teamDescription;
        }
    }
}
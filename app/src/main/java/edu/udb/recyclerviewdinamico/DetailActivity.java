package edu.udb.recyclerviewdinamico;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class DetailActivity extends AppCompatActivity {
    ImageView teamImage;
        TextView TourisDescription;
        TextView touristDeparment;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);
            Turismo turismo = (Turismo) getIntent().getSerializableExtra("teamdetail");

            teamImage = (ImageView) findViewById(R.id.teamImage);
            TourisDescription = (TextView) findViewById(R.id.touristDescription);
            touristDeparment = (TextView) findViewById(R.id.tourisDepartment);

           touristDeparment.setText("Departamento: ⭐"+turismo.getDepartamento());
            TourisDescription.setText("Descripcion:"+"\n"+turismo.getDescription());
            Glide.with(this).load(turismo.getImgLogo()).into(teamImage);
        }
    }


package com.rahayu.kaspribadi;

import java.util.ArrayList;
import java.util.List;



import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
public class Pemasukan extends ActionBarActivity {
	List<DetailInput> model=new ArrayList<DetailInput>();
	DetailInputAdapter adapter=null;
	EditText nominal=null;
	EditText label=null;
	EditText deskripsi=null;
	EditText tanggal=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pemasukan);
		
        Button btnbmx = (Button) findViewById(R.id.button2);
        btnbmx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	Intent nextScreen = new Intent(getApplicationContext(), Awal.class); 
                startActivity(nextScreen);
            }
        }); 
        
        Button btnbmxx = (Button) findViewById(R.id.button1);
        btnbmxx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
            	Intent nextScreen = new Intent(getApplicationContext(), Awal.class); 
                startActivity(nextScreen);
            }
        }); 
	}
	
	
	class DetailInputAdapter extends ArrayAdapter<DetailInput> {
		DetailInputAdapter() {
			super(Pemasukan.this, R.layout.row, model);
		}
		
		public View getView(int position, View convertView,
												ViewGroup parent) {
			View row=convertView;
			DetailInputHolder holder=null;
			
			if (row==null) {													
				LayoutInflater inflater=getLayoutInflater();
				
				row=inflater.inflate(R.layout.row, parent, false);
				holder=new DetailInputHolder(row);
				row.setTag(holder);
			}
			else {
				holder=(DetailInputHolder)row.getTag();
			}
			
			holder.populateFrom(model.get(position));
			
			return(row);
		}
	}
	
	static class DetailInputHolder {
		private TextView nominal=null;
		private TextView label=null;
		private ImageView icon=null;
		private TextView tanggal=null;
		private View row=null;
		
		DetailInputHolder(View row) {
			this.row=row;
			
			nominal=(TextView)row.findViewById(R.id.nominal);
			label=(TextView)row.findViewById(R.id.title);
			tanggal=(TextView)row.findViewById(R.id.tanggal);
			icon=(ImageView)row.findViewById(R.id.icon);
		}
		
		void populateFrom(DetailInput r) {
			nominal.setText(r.getNom());
			label.setText(r.getLabel());
	
			//if (r.getJenis().equals("Pemasukan")) {
			//	icon.setImageResource(R.drawable.pria);
			//}
			//else if (r.getJekel().equals("Perempuan")) {
			//	icon.setImageResource(R.drawable.perempuan);
			//}
			
		}
	}
	
}
package com.example.agriculture1;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import javax.xml.validation.ValidatorHandler;

public class cropAdapter extends BaseAdapter {
  private List<Integer>images;
  private List<String> names;
  private Context applicationContext;
  private LayoutInflater inflater;
   public cropAdapter(Context applicationcontext, List<Integer> imageIds,List<String>names) {
       this.applicationContext = applicationcontext;
       this.images = imageIds;
       this.names = names;
       inflater= LayoutInflater.from(applicationcontext);
   }
       @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getCount() {
        int size = names.size();
        return size;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }
  public View getView(int i , View convertView, ViewGroup parent){
    View view =inflater.inflate(R.layout.crop_layout,null) ;
      ImageView img=view.findViewById(R.id.imageView);
      img.setImageResource(images.get(i));
      TextView name=view.findViewById(R.id.textView);
      name.setText(names.get(i));
      return view;

   }

}

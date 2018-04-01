package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ketan on 07-03-2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context=parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        int resourceId= R.layout.forecast_list_item;
        boolean f=false;

        View view = inflater.inflate(resourceId,parent,f);
        ForecastAdapterViewHolder viewHolderToReturn= new ForecastAdapterViewHolder(view);
        return viewHolderToReturn;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {


        holder.mWeatherTextView.setText(mWeatherData[position]);
    }


    @Override
    public int getItemCount() {
        return mWeatherData==null?0:mWeatherData.length;

    }

    public void setWeatherData(String[] arr)
    {
        mWeatherData = arr;
        notifyDataSetChanged();
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
     TextView mWeatherTextView;
     public ForecastAdapterViewHolder(View itemView){
         super(itemView);
         mWeatherTextView =(TextView) itemView.findViewById(R.id.tv_weather_data);

     }

    }
}

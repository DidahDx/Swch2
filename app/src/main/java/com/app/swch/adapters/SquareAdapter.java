package com.app.swch.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.app.swch.R;
import com.app.swch.gson.EventGson;
import com.app.swch.utils.DebugUtils;
import com.bumptech.glide.Glide;

import java.util.List;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;


/* renamed from: ke.swch.adapters.SquareAdapter */
public class SquareAdapter extends RecyclerView.Adapter<SquareAdapter.AddHolder> {
    private Context context;
    private List<EventGson> eventGsons;

    public SquareAdapter(Context context2, List<EventGson> eventGsons2) {
        this.context = context2;
        this.eventGsons = eventGsons2;
    }

    public AddHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AddHolder(LayoutInflater.from(this.context).inflate(R.layout.item_list_square, parent, false));
    }

    public void onBindViewHolder(AddHolder holder, int position) {
        EventGson eventGson = this.eventGsons.get(position);
        holder.getTextView().setText(eventGson.getName());
        String imageURL = eventGson.getImageUrl();
        if (imageURL != null && URLUtil.isValidUrl(imageURL)) {
            DebugUtils.doLog(getClass(), imageURL);
            Glide.with(this.context).load(imageURL).centerCrop().error(R.color.app_white).transition(withCrossFade()).into(holder.getImageView());
        }
    }

    public int getItemCount() {
        List<EventGson> list = this.eventGsons;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: ke.swch.adapters.SquareAdapter$AddHolder */
    public class AddHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public AddHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.tv);
            this.imageView = (ImageView) itemView.findViewById(R.id.iv);
        }

        public ImageView getImageView() {
            return this.imageView;
        }

        public TextView getTextView() {
            return this.textView;
        }
    }
}

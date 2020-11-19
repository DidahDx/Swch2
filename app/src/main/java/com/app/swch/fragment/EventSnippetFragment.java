package com.app.swch.fragment;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.app.swch.R;
import com.app.swch.gson.EventGson;
import com.app.swch.utils.DebugUtils;
import com.bumptech.glide.Glide;

import java.util.Date;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;


/* renamed from: ke.swch.fragment.EventSnippetFragment */

public class EventSnippetFragment extends Fragment {
    private EventGson eventGson;
    private ImageView imageViewEvent;
    private TextView textViewEventDate;
    private TextView textViewEventLocation;
    private TextView textViewEventName;

    public static EventSnippetFragment newInstance(EventGson eventGson2) {
        EventSnippetFragment fragment = new EventSnippetFragment();
        fragment.setEventGson(eventGson2);
        return fragment;
    }

    private void setEventGson(EventGson eventGson2) {
        this.eventGson = eventGson2;
    }

    private void collectViewIds(View view) {
        this.imageViewEvent = (ImageView) view.findViewById(R.id.iv_event_image);
        this.textViewEventDate = (TextView) view.findViewById(R.id.tv_event_date);
        this.textViewEventName = (TextView) view.findViewById(R.id.tv_event_name);
        this.textViewEventLocation = (TextView) view.findViewById(R.id.tv_event_location);
    }

    private void setupViewIds() {
        String imageURL = this.eventGson.getImageUrl();
        if (imageURL != null && URLUtil.isValidUrl(imageURL)) {
            DebugUtils.doLog(getClass(), imageURL);
            Glide.with(getContext()).load(imageURL).centerCrop().error(R.color.colorPrimary).transition(withCrossFade()).into(this.imageViewEvent);
        }
        Date startDate = this.eventGson.getStartDate();
        if (startDate != null) {
            this.textViewEventDate.setText((String) DateFormat.format("dd MMM", startDate));
        }
        String eventName = this.eventGson.getName();
        if (eventName != null) {
            this.textViewEventName.setText(eventName);
        }
        String eventLocation = this.eventGson.getLocation();
        if (eventLocation != null) {
            this.textViewEventLocation.setText(eventLocation);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_snippet, container, false);
        collectViewIds(view);
        setupViewIds();
        return view;
    }
}

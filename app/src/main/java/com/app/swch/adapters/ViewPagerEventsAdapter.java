package com.app.swch.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.app.swch.fragment.EventSnippetFragment;
import com.app.swch.gson.EventGson;

import java.util.List;


/* renamed from: ke.swch.adapters.ViewPagerEventsAdapter */
public class ViewPagerEventsAdapter extends FragmentPagerAdapter {
    private List<EventGson> eventGsons;

    public ViewPagerEventsAdapter(FragmentManager fm, int behavior, List<EventGson> eventGsons2) {
        super(fm, behavior);
        this.eventGsons = eventGsons2;
    }

    public Fragment getItem(int position) {
        return EventSnippetFragment.newInstance(this.eventGsons.get(position));
    }

    public int getCount() {
        List<EventGson> list = this.eventGsons;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public CharSequence getPageTitle(int position) {
        return this.eventGsons.get(position).getName();
    }
}

package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;



public class Events {

    public static void initEventsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.events_backtothecity_name),
                context.getString(R.string.events_backtothecity_description),
                context.getString(R.string.events_backtothecity_address),
                context.getString(R.string.events_backtothecity_phone),
                context.getString(R.string.events_backtothecity_schedule),
                context.getString(R.string.events_backtothecity_price),
                R.drawable.events_backtothecity
        ));

        list.add(new Location(
                context.getString(R.string.events_dinnerinthesky_name),
                context.getString(R.string.events_dinnerinthesky_description),
                context.getString(R.string.events_dinnerinthesky_address),
                context.getString(R.string.events_dinnerinthesky_phone),
                context.getString(R.string.events_dinnerinthesky_schedule),
                context.getString(R.string.events_dinnerinthesky_price),
                R.drawable.events_dinnerinthesky
        ));

        list.add(new Location(
                context.getString(R.string.events_jozibookfair_name),
                context.getString(R.string.events_jozibookfair_description),
                context.getString(R.string.events_jozibookfair_address),
                context.getString(R.string.events_jozibookfair_phone),
                context.getString(R.string.events_jozibookfair_schedule),
                context.getString(R.string.events_jozibookfair_price),
                R.drawable.events_jozibookfair
        ));

        list.add(new Location(
                context.getString(R.string.events_outdoorscreening_name),
                context.getString(R.string.events_outdoorscreening_description),
                context.getString(R.string.events_outdoorscreening_address),
                context.getString(R.string.events_outdoorscreening_phone),
                context.getString(R.string.events_outdoorscreening_schedule),
                context.getString(R.string.events_backtothecity_price),
                R.drawable.events_outdoorscreening
        ));

        list.add(new Location(
                context.getString(R.string.events_sowetotheatre_name),
                context.getString(R.string.events_sowetotheatre_description),
                context.getString(R.string.events_sowetotheatre_address),
                context.getString(R.string.events_sowetotheatre_phone),
                context.getString(R.string.events_sowetotheatre_schedule),
                context.getString(R.string.events_sowetotheatre_price),
                R.drawable.events_sowetotheatre
        ));

        list.add(new Location(
                context.getString(R.string.events_strcrd_name),
                context.getString(R.string.events_strcrd_description),
                context.getString(R.string.events_strcrd_address),
                context.getString(R.string.events_strcrd_phone),
                context.getString(R.string.events_strcrd_schedule),
                context.getString(R.string.events_strcrd_price),
                R.drawable.events_strcrd
        ));

        list.add(new Location(
                context.getString(R.string.events_vsgaming_name),
                context.getString(R.string.events_vsgaming_description),
                context.getString(R.string.events_vsgaming_address),
                context.getString(R.string.events_vsgaming_phone),
                context.getString(R.string.events_vsgaming_schedule),
                context.getString(R.string.events_vsgaming_price),
                R.drawable.events_vsgaming
        ));

    }
}

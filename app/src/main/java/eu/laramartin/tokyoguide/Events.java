package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;



public class Events {

    public static void initEventsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shop_potato_name),
                context.getString(R.string.shop_potato_description),
                context.getString(R.string.shop_potato_address),
                context.getString(R.string.shop_potato_phone),
                context.getString(R.string.shop_potato_schedule),
                null,
                R.drawable.events_backtothecity
        ));

        list.add(new Location(
                context.getString(R.string.shop_amiami_name),
                context.getString(R.string.shop_amiami_description),
                context.getString(R.string.shop_amiami_address),
                context.getString(R.string.shop_amiami_phone),
                context.getString(R.string.shop_amiami_schedule),
                null,
                R.drawable.events_dinnerinthesky
        ));

        list.add(new Location(
                context.getString(R.string.shop_nakano_name),
                context.getString(R.string.shop_nakano_description),
                context.getString(R.string.shop_nakano_address),
                context.getString(R.string.shop_nakano_phone),
                context.getString(R.string.shop_nakano_schedule),
                null,
                R.drawable.events_jozibookfair
        ));

        list.add(new Location(
                context.getString(R.string.shop_kiddy_name),
                context.getString(R.string.shop_kiddy_description),
                context.getString(R.string.shop_kiddy_address),
                context.getString(R.string.shop_kiddy_phone),
                context.getString(R.string.shop_kiddy_schedule),
                null,
                R.drawable.events_outdoorscreening
        ));

        list.add(new Location(
                context.getString(R.string.shop_daiso_name),
                context.getString(R.string.shop_daiso_description),
                context.getString(R.string.shop_daiso_address),
                context.getString(R.string.shop_daiso_phone),
                context.getString(R.string.shop_daiso_schedule),
                null,
                R.drawable.events_sowetotheatre
        ));

        list.add(new Location(
                context.getString(R.string.shop_mandarake_name),
                context.getString(R.string.shop_mandarake_description),
                context.getString(R.string.shop_mandarake_address),
                context.getString(R.string.shop_mandarake_phone),
                context.getString(R.string.shop_mandarake_schedule),
                null,
                R.drawable.events_strcrd
        ));

        list.add(new Location(
                context.getString(R.string.shop_kinokuniya_name),
                context.getString(R.string.shop_kinokuniya_description),
                context.getString(R.string.shop_kinokuniya_address),
                context.getString(R.string.shop_kinokuniya_phone),
                context.getString(R.string.shop_kinokuniya_schedule),
                null,
                R.drawable.events_vsgaming
        ));

    }
}

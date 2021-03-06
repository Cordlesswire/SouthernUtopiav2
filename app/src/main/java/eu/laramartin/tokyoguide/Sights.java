package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;



public class Sights {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.sight_humankind_name),
                context.getString(R.string.sight_humankind_description),
                context.getString(R.string.sight_humankind_address),
                context.getString(R.string.sight_humankind_phone),
                context.getString(R.string.sight_humankind_schedule),
                context.getString(R.string.sight_humankind_price),
                R.drawable.sight_cradle_of_humankind
        ));

        list.add(new Location(
                context.getString(R.string.sight_goldreefcity_name),
                context.getString(R.string.sight_goldreefcity_description),
                context.getString(R.string.sight_goldreefcity_address),
                context.getString(R.string.sight_goldreefcity_phone),
                context.getString(R.string.sight_goldreefcity_schedule),
                context.getString(R.string.sight_goldreefcity_price),
                R.drawable.sight_goldreefcity
        ));

        list.add(new Location(
                context.getString(R.string.sight_maboneng_name),
                context.getString(R.string.sight_maboneng_description),
                context.getString(R.string.sight_maboneng_address),
                context.getString(R.string.sight_maboneng_phone),
                context.getString(R.string.sight_maboneng_schedule),
                context.getString(R.string.sight_maboneng_price),
                R.drawable.sight_maboneng
        ));

        list.add(new Location(
                context.getString(R.string.sight_mandelabridge_name),
                context.getString(R.string.sight_mandelabridge_description),
                context.getString(R.string.sight_mandelabridge_address),
                context.getString(R.string.sight_mandelabridge_phone),
                context.getString(R.string.sight_mandelabridge_schedule),
                context.getString(R.string.sight_mandelabridge_price),
                R.drawable.sight_mandelabridge
        ));

        list.add(new Location(
                context.getString(R.string.sight_soccercity_name),
                context.getString(R.string.sight_soccercity_description),
                context.getString(R.string.sight_soccercity_address),
                context.getString(R.string.sight_soccercity_phone),
                context.getString(R.string.sight_soccercity_schedule),
                context.getString(R.string.sight_soccercity_price),
                R.drawable.sight_soccercity
        ));

        list.add(new Location(
                context.getString(R.string.sight_soweto_bungee_name),
                context.getString(R.string.sight_soweto_bungee_description),
                context.getString(R.string.sight_soweto_bungee_address),
                context.getString(R.string.sight_soweto_bungee_phone),
                context.getString(R.string.sight_soweto_bungee_schedule),
                context.getString(R.string.sight_soweto_bungee_price),
                R.drawable.sight_soweto_bungee
        ));

        list.add(new Location(
                context.getString(R.string.sight_union_buildings_name),
                context.getString(R.string.sight_union_buildings_description),
                context.getString(R.string.sight_union_buildings_address),
                context.getString(R.string.sight_union_buildings_phone),
                context.getString(R.string.sight_union_buildings_schedule),
                context.getString(R.string.sight_union_buildings_price),
                R.drawable.sight_union_buildings
        ));
    }
}

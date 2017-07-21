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
                context.getString(R.string.sight_imperial_name),
                context.getString(R.string.sight_imperial_description),
                context.getString(R.string.sight_imperial_address),
                context.getString(R.string.sight_imperial_phone),
                context.getString(R.string.sight_imperial_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sight_goldreefcity
        ));

        list.add(new Location(
                context.getString(R.string.sight_yasukuni_name),
                context.getString(R.string.sight_yasukuni_description),
                context.getString(R.string.sight_yasukuni_address),
                context.getString(R.string.sight_yasukuni_phone),
                context.getString(R.string.sight_yasukuni_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sight_maboneng
        ));

        list.add(new Location(
                context.getString(R.string.sight_koishikawa_name),
                context.getString(R.string.sight_koishikawa_description),
                context.getString(R.string.sight_koishikawa_address),
                context.getString(R.string.sight_koishikawa_phone),
                context.getString(R.string.sight_koishikawa_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sight_mandelabridge
        ));

        list.add(new Location(
                context.getString(R.string.sight_hie_shrine_name),
                context.getString(R.string.sight_hie_shrine_description),
                context.getString(R.string.sight_hie_shrine_address),
                context.getString(R.string.sight_hie_shrine_phone),
                context.getString(R.string.sight_hie_shrine_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sight_soccercity
        ));

        list.add(new Location(
                context.getString(R.string.sight_hachikou_name),
                context.getString(R.string.sight_hachikou_description),
                context.getString(R.string.sight_hachikou_address),
                context.getString(R.string.sight_hachikou_phone),
                context.getString(R.string.sight_hachikou_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sight_soweto_bungee
        ));

        list.add(new Location(
                context.getString(R.string.sight_government_building_name),
                context.getString(R.string.sight_government_building_description),
                context.getString(R.string.sight_government_building_address),
                context.getString(R.string.sight_government_building_phone),
                context.getString(R.string.sight_government_building_schedule),
                context.getString(R.string.sight_price_free),
                R.drawable.sight_union_buildings
        ));
    }
}

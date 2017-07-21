package eu.laramartin.tokyoguide;

import android.content.Context;

import java.util.List;

public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_chafpozi_name),
                context.getString(R.string.food_chafpozi_description),
                context.getString(R.string.food_chafpozi_address),
                context.getString(R.string.food_chafpozi_phone),
                context.getString(R.string.food_chafpozi_schedule),
                context.getString(R.string.food_chafpozi_price),
                R.drawable.food_chafpozi
        ));

        list.add(new Location(
                context.getString(R.string.food_licorish_name),
                context.getString(R.string.food_licorish_description),
                context.getString(R.string.food_licorish_address),
                context.getString(R.string.food_licorish_phone),
                context.getString(R.string.food_licorish_schedule),
                context.getString(R.string.food_licorish_price),
                R.drawable.food_licorish
        ));

        list.add(new Location(
                context.getString(R.string.food_luckybean_name),
                context.getString(R.string.food_luckybean_description),
                context.getString(R.string.food_luckybean_address),
                context.getString(R.string.food_luckybean_phone),
                context.getString(R.string.food_luckybean_schedule),
                context.getString(R.string.food_luckybean_price),
                R.drawable.food_luckybean
        ));

        list.add(new Location(
                context.getString(R.string.food_marble_name),
                context.getString(R.string.food_marble_description),
                context.getString(R.string.food_marble_address),
                context.getString(R.string.food_marble_phone),
                context.getString(R.string.food_marble_schedule),
                context.getString(R.string.food_marble_price),
                R.drawable.food_marble
        ));

        list.add(new Location(
                context.getString(R.string.food_patapata_name),
                context.getString(R.string.food_patapata_description),
                context.getString(R.string.food_patapata_address),
                context.getString(R.string.food_patapata_phone),
                context.getString(R.string.food_patapata_schedule),
                context.getString(R.string.food_patapata_price),
                R.drawable.food_patapata
        ));

        list.add(new Location(
                context.getString(R.string.food_thehill_name),
                context.getString(R.string.food_thehill_description),
                context.getString(R.string.food_thehill_address),
                context.getString(R.string.food_thehill_phone),
                context.getString(R.string.food_thehill_schedule),
                context.getString(R.string.food_thehill_price),
                R.drawable.food_thehill
        ));

        list.add(new Location(
                context.getString(R.string.food_vuyosbraai_name),
                context.getString(R.string.food_vuyosbraai_description),
                context.getString(R.string.food_vuyosbraai_address),
                context.getString(R.string.food_vuyosbraai_phone),
                context.getString(R.string.food_vuyosbraai_schedule),
                context.getString(R.string.food_vuyosbraai_price),
                R.drawable.food_vuyosbraai
        ));
    }
}

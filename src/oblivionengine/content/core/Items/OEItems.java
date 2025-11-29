package oblivionengine.content.core.Items;

import mindustry.type.Item;

public class OEItems {
    public static Item Uranium;
    public static void load(){
        Uranium = new Item("Uranium"){{
            alwaysUnlocked = false;
            cost = 0.5f;
            hardness = 5;
        }};
    }
}

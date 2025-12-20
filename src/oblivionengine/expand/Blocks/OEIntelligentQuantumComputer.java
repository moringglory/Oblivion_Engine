package oblivionengine.expand.Blocks;

import arc.scene.ui.Dialog;
import arc.scene.ui.layout.*;
import mindustry.gen.*;
import mindustry.ui.Styles;
import mindustry.world.*;
import mindustry.world.blocks.logic.CanvasBlock;

public class OEIntelligentQuantumComputer extends Block {
    public OEIntelligentQuantumComputer(String name) {
        super(name);

        configurable = true;
        destructible = true;
        canOverdrive = false;
        solid = true;

        config(byte[].class, (Booting build, byte[] bytes) -> {

        });
    }
    public static class Booting extends Building {
//        @Override
//        public void buildConfiguration(Table table) {
////            table.table(inner -> {
////                inner
////            }).width(90);
//
//        }
        @Override
        public void buildConfiguration(Table table){
            table.button(Icon.download, Styles.defaulti, () -> {
                Dialog dialog = new Dialog();
            }).size(40f);
        }
    }
}
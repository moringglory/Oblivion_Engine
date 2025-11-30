package oblivionengine.expand.Blocks;

import arc.graphics.g2d.TextureRegion;
import arc.scene.ui.layout.*;
import mindustry.gen.*;
import mindustry.world.*;
import oblivionengine.content.OEIcon;

public class OEIntelligentQuantumComputer extends Block {
    TextureRegion boot = OEIcon.boot;
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
        @Override
        public void buildConfiguration(Table table) {

        }
    }
}
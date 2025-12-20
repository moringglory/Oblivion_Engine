package oblivionengine.expand.Blocks;

import arc.Core;
import arc.func.Cons2;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Lines;
import arc.graphics.g2d.TextureRegion;
import arc.math.Mathf;
import arc.scene.style.TextureRegionDrawable;
import arc.scene.ui.ImageButton;
import arc.scene.ui.layout.*;
import arc.util.Tmp;
import mindustry.gen.*;
import mindustry.graphics.Layer;
import mindustry.ui.Styles;
import mindustry.world.*;
import oblivionengine.content.OEContent;

import java.awt.*;

import static mindustry.Vars.*;

public class OEIntelligentQuantumComputer extends Block {
    public static Cons2<Booting, Boolean> blockDrawer = (building, valid) -> {
        TextureRegion arrowRegion = OEContent.boot;
        TextureRegion pointerRegion = OEContent.exit;

        Draw.z(Layer.bullet);

        float scl = building.warmup() * 0.125f;
        float rot = building.totalProgress();

        Draw.color(building.team.color);
        Lines.stroke(8f * scl);
        Lines.square(building.x, building.y, building.block.size * tilesize / 2.5f, -rot);
        Lines.square(building.x, building.y, building.block.size * tilesize / 2f, rot);
        for (int i = 0; i < 4; i++) {
            float length = tilesize * building.block.size / 2f + 8f;
            float rotation = i * 90;
            float sin = Mathf.absin(building.totalProgress(), 16f, tilesize);
            float signSize = 0.75f + Mathf.absin(building.totalProgress() + 8f, 8f, 0.15f);

            Tmp.v1.trns(rotation + rot, -length);
            Draw.rect(arrowRegion, building.x + Tmp.v1.x, building.y + Tmp.v1.y, arrowRegion.width * scl, arrowRegion.height * scl, rotation + 90 + rot);
            length = tilesize * building.block.size / 2f + 3 + sin;
            Tmp.v1.trns(rotation, -length);
            Draw.rect(pointerRegion, building.x + Tmp.v1.x, building.y + Tmp.v1.y, pointerRegion.width * signSize * scl, pointerRegion.height * signSize * scl, rotation + 90);
        }
        Draw.color();
    };
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
        public void draw() {
            super.draw();
            blockDrawer.get(this,true);
        }
//        @Override
//        public void buildConfiguration(Table table) {
////            table.table(inner -> {
////                inner
////            }).width(90);
//
//        }
        @Override
        public void buildConfiguration(Table table){
            ImageButton style =
        }
    }
}
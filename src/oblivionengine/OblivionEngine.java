package oblivionengine;

import arc.scene.ui.layout.Table;
import arc.struct.Seq;
import mindustry.Vars;
import mindustry.mod.Mods;
import oblivionengine.content.OETechTree;
import arc.Events;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.mod.Mod;
import mindustry.ui.dialogs.BaseDialog;

import oblivionengine.content.core.Items.OEItems;
import oblivionengine.content.core.Blcoks.OEBlock;
import oblivionengine.content.core.Units.OEUnits;

public class OblivionEngine extends Mod {
    public OblivionEngine() {
        Events.on(EventType.ClientLoadEvent.class, e -> {
            Time.run(1f, () -> {
                BaseDialog dialog = new BaseDialog("Mod 已加载");
                dialog.cont.add("Oblivion Engine 模组已成功加载！");
                Time.run(100f, dialog::addCloseButton);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent() {
        OEItems.load();
        OEBlock.load();
        OETechTree.load();
        OEUnits.load();
    }
}

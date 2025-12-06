package oblivionengine.content;

import arc.func.Prov;
import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.graphics.Pal;
import mindustry.graphics.g3d.GenericMesh;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.maps.planet.SerpuloPlanetGenerator;
import mindustry.type.Planet;

public class OEPlanets {
    public static Planet vjsx,ymzq;
    public static void load(){
        vjsx = new Planet("vjsx", Planets.serpulo,0.5f,2){{
            this.iconColor = Color.valueOf("00fffb");
            this.generator = new SerpuloPlanetGenerator();
            this.meshLoader = new Prov<>() {
                @Override
                public GenericMesh get() {
                    return new HexMesh(vjsx,6);
                }
            };
            this.cloudMeshLoader = () -> new MultiMesh(
                    new HexSkyMesh(this,9,1.2F,0.24F,4,new Color().set(Pal.spore).mul(0.9f).a(0.75f),2,0.3F,0.7F, 0.43F),
                    new HexSkyMesh(this,3,3.7F,0.2F,6, Color.valueOf("a4b7fa").a(0.65F),6,0.45F,0.86F, 0.45F)
                    //new HexSkyMesh(this,3,0.01F,0.05F,5, Color.valueOf("ed7459"),2,0.5F,0.1F, 0.2F)
                        );
            this.ruleSetter = rules -> {

            };
            alwaysUnlocked = true;
            landCloudColor = atmosphereColor = Color.valueOf("3299cc");//00baff
        }};
        ymzq = new Planet("ymzq", Planets.sun,3.0f,2){{
            alwaysUnlocked = true;
        }};
    }
}

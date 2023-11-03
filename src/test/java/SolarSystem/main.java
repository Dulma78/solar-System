package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarsys=new solarSystemBasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

        // ********Feature Sun*******
       FeatureSun Sun=new FeatureSun();
       Sun.name="panther";
       Sun.color="black";
       Sun.temp="12234134kelvin";


       //********Planet2******
        Planet2 xaros=new Planet2();
        xaros.name="neoion";
        xaros.color="blue";
        xaros.size="1234566778km";

  //    Planet1
  Planet1 plato=new Planet1();
  plato.color="green";
  plato.name="abracadabra";
  plato.temp="1000000k";
  plato.radius="800000km";

    }
}

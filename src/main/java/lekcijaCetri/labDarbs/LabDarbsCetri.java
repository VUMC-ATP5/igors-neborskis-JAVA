package lekcijaCetri.labDarbs;

public class LabDarbsCetri {

    public static void main(String[] args) {

        House majaViens = new House();
            majaViens.houseFloorCount = 2;
            majaViens.houseAddress = "Jāņogu 23";
            majaViens.houseHeight = 8.0;
            majaViens.houseLength = 12.5;
            majaViens.houseWidth = 14.2;
            majaViens.houseMaterials = "kieģeļu";
            majaViens.isPublicBuilding = false;
            majaViens.housePricePerMeter = 1000;
            majaViens.houseSquare = majaViens.houseLength * majaViens.houseWidth;
            majaViens.housePrice = majaViens.housePricePerMeter * majaViens.houseSquare;
       majaViens.printHouse();

        House majaDivi = new House();
            majaDivi.houseFloorCount = 3;
            majaDivi.houseAddress = "Ķiršu 42";
            majaDivi.houseHeight = 10.0;
            majaDivi.houseLength = 15.0;
            majaDivi.houseWidth = 13.7;
            majaDivi.houseMaterials = "bloku";
            majaDivi.isPublicBuilding = false;
            majaDivi.housePricePerMeter = 1200;
        majaDivi.printHouse();

        House[] majas = {majaViens, majaDivi};
        for (House maja : majas) {
            System.out.println("\nMājas adrese: " + maja.houseAddress);
            System.out.println("Mājas stāvu skaits: " + maja.houseFloorCount);
            System.out.println("Mājas būvniecībā izmantotie materiāli: " + maja.houseMaterials);
            maja.houseSquare = maja.houseLength * maja.houseWidth;
            System.out.println("Mājas laukums: " + maja.houseSquare + " m2");
            maja.housePrice = maja.housePricePerMeter * maja.houseSquare;
            System.out.println("Mājas cena ir: " + maja.housePrice + "EUR");
        }

        House[] majas2 = {majaViens, majaDivi};
        for (House maja2 : majas2) {
            maja2.printHouse();
        }

        System.out.println("\nVELO");

        Velo veloViens = new Velo();
        veloViens.printSpeed();

        System.out.println(" ");

        Velo veloDivi = new Velo();
        veloDivi.model = "Cube ";
        veloDivi.speed = 25;
        veloDivi.speedUp(10);
        veloDivi.speedUp(5);
        veloDivi.speedDown(2);
        veloDivi.speedDown(5);
        veloDivi.speedDown(5);
        veloDivi.speedDown(4);
        veloDivi.speedDown(5);
        veloDivi.speedDown(10);
        veloDivi.speedDown(10);
        veloDivi.printSpeed();

        Velo veloTris = new Velo("ZZK", "XL", 26, 25);


        System.out.println("\nZIVS");

        Fish zivsViens = new Fish();
            zivsViens.species = "zandarts";
            zivsViens.weight = 2.5;
            zivsViens.color = "sudrabains";
            zivsViens.length = 32;
            zivsViens.liveInFreshWater = true;

        Fish zivsDivi = new Fish();
            zivsDivi.species = "Reņģe";
            zivsDivi.weight = 0.5;
            zivsDivi.color = "sudrabains";
            zivsDivi.length = 10;
            zivsDivi.liveInFreshWater = true;

        zivsViens.printFish();
        zivsDivi.printFish();

        System.out.println("\nKAĶIS");
        Cat kakisTaisons = new Cat();
        kakisTaisons.suga = "Bezšķirnes";
        kakisTaisons.gadi = 2;
        kakisTaisons.vards = "Taisons";
        kakisTaisons.vaiIzsalcis = true;
        kakisTaisons.printKakis();
        kakisTaisons.feedCat(zivsViens);
        kakisTaisons.feedCat(zivsDivi);

        System.out.println("\nRIŅĶA LAUKUMS");
        Circle rinkisViens = new Circle(5);
        rinkisViens.circleName = "A";
        Circle rinkisDivi = new Circle(10);
        rinkisDivi.circleName = "B";
        System.out.println("Riņķa " + rinkisViens.circleName + " laukums ir " + rinkisViens.cirlceSquare());
        System.out.println("Riņķa " + rinkisViens.circleName + " līnijas garums ir " + rinkisViens.circleLenght());
        System.out.println("Riņķa " + rinkisDivi.circleName + " laukums ir " + rinkisDivi.cirlceSquare());
        System.out.println("Riņķa " + rinkisDivi.circleName + " līnijas garums ir " + rinkisDivi.circleLenght());

    }
}

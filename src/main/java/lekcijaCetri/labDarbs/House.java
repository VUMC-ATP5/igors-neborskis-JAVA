package lekcijaCetri.labDarbs;

public class House {

    int houseFloorCount;
    double houseSquare;
    double houseWidth;
    double houseLength;
    double houseHeight;
    String houseAddress;
    String houseMaterials;
    double housePrice;
    int housePricePerMeter;
    boolean isPublicBuilding;

//    @Override
    public void printHouse() {
        System.out.println(
                "\nHouse{" +
                "houseFloorCount=" + houseFloorCount +
                ", houseSquare=" + houseSquare +
                ", houseWidth=" + houseWidth +
                ", houseLength=" + houseLength +
                ", houseHeight=" + houseHeight +
                ", houseAddress='" + houseAddress + '\'' +
                ", houseMaterials='" + houseMaterials + '\'' +
                ", housePrice=" + housePrice +
                ", housePricePerMeter=" + housePricePerMeter +
                ", isPublicBuilding=" + isPublicBuilding +
                '}');
    }
}

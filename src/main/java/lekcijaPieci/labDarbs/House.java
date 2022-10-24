package lekcijaPieci.labDarbs;

public class House {

    private int houseFloorCount;
    private double houseSquare;
    private double houseWidth;
    private double houseLength;
    private double houseHeight;
    private String houseAddress;
    private String houseMaterials;
    private double housePrice;
    private int housePricePerMeter;
    private boolean isPublicBuilding;


    public House(int houseFloorCount, double houseSquare, double houseWidth, double houseLength, double houseHeight, String houseAddress, String houseMaterials, double housePrice, int housePricePerMeter, boolean isPublicBuilding) {
        this.houseFloorCount = houseFloorCount;
        this.houseSquare = houseSquare;
        this.houseWidth = houseWidth;
        this.houseLength = houseLength;
        this.houseHeight = houseHeight;
        this.houseAddress = houseAddress;
        this.houseMaterials = houseMaterials;
        this.housePrice = housePrice;
        this.housePricePerMeter = housePricePerMeter;
        this.isPublicBuilding = isPublicBuilding;
    }

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

    // Setter
    public void setHousePricePerMeter(int housePricePerMeter) {
        this.housePricePerMeter = housePricePerMeter;
    }

    public void setPublicBuilding(boolean publicBuilding) {
        isPublicBuilding = publicBuilding;
    }

    // Getter
    public int getHousePricePerMeter() {
        return housePricePerMeter;
    }

}

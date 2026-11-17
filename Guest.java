class House{
    public String mainGate = "public main gate";
    private String bedRoom = "private bedroom";
    protected String familyRoom = "protected family room";

    public String getBedRoom() {
        return bedRoom;
    }
}

public class Guest {
    
    public static void main(String[] args) {
        House myHouse = new House();

        System.out.println(myHouse.mainGate);
        System.out.println(myHouse.getBedRoom());
        System.out.println(myHouse.familyRoom);
    }
}

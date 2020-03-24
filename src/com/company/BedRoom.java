package com.company;

public final class BedRoom extends Home {
    private int sofa;
    private int cupboard;
    private String bed;

    public int getSofa() {
        return sofa;
    }

    public int getCupboard() {
        return cupboard;
    }

    public String getBed() {
        return bed;
    }

    public BedRoom() {

    }

    public BedRoom(String size, Model modelHome, String tv, String picture, Color color, int sofa, int cupboard, String bed) {
        super(size, modelHome, color);
        this.sofa = sofa;
        this.cupboard = cupboard;
        this.bed = bed;
    }


    public String getHome(){
        return super.getModelHome()+
        "    Диван " + getSofa()+
                "    Шкаф: " + getCupboard()+
                "    Кровать: " + getBed();
    }
}
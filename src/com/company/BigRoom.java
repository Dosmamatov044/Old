package com.company;

public class BigRoom extends Home {
    private String tv;
    private String picture;


    public String getTv() {
        return tv;
    }

    public String getPicture() {
        return picture;
    }


    public BigRoom(String size, Model modelHome, Color color, String tv, String picture) {
        super(size, modelHome, color);
        this.tv = tv;
        this.picture = picture;
    }

    public BigRoom(String tv, String picture) {

        this.picture = picture;
    }

    public BigRoom(String tv) {
        this.tv = tv;
    }

    public final void BigRoom (String picture){
        System.out.println(picture);
    }

    public String getHome(){
        return " Модель дома: "+ super.getModelHome().modelHome + " Год постройки " + super.getModelHome().yearBuilding +
                "    Размер: " + getSize()+
                "    Цвет: " + getColor() +
                "    Телевизор " + getTv()+
                "    Картинка " + getPicture();
    }
}
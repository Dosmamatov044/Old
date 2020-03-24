package com.company;

public class Main {

    public static void main(String[] args) {




                BigRoom objectA = new BigRoom( " 10-13", new Model(1996 , " Квадратный дом "),Color.RED," Плазма"," Моно лиза ");
                System.out.println("objectA: " + objectA.getHome());
                objectA.BigRoom("Картинка");
                objectA.BigRoom(" еще Одна Картинка");




                BedRoom objectB = new BedRoom("50-80", new Model(2002, "Сссрский"), "", "", Color.BLACK, 6, 10, "10 ");
                System.out.println("objectB: " + objectB.getHome());

                BedRoom objectC = new BedRoom("60-70", new Model(2000, "Современный"), " 5", "", Color.RED, 2000, 300, "12 ");
                System.out.println("objectC: " + objectC.getHome()) ;



            }
        }


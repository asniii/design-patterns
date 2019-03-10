package Creational.Builder.pattern.example1;

public class Solution {
    public static void main(String args[]){
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("dell",
                "crossair","intel","amazon mouse","amazon keyboard");

        Computer computer = builder.cpu("koi bhi")
                .cabinet("navtech")
                .smps("cross-air")
                .hardDisk("WD")
                .ssd("samsung")
                .cdRom("LG")
                .floopyDisk("Sony")
                .fan("cross-air")
                .camera("dell")
                .touchpad("dell").build();

        System.out.println(computer);
    }
}

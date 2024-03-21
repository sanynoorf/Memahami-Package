package BangunDatar;

import Library.*;

public class PersegiPanjang extends BangunDatar implements Printable, Shape {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public void print() {
        System.out.println("Print Persegi Panjang");
    }

    public void setPaper(String Paper) {
        System.out.println("Set Paper Persegi Panjang");
    }

    public void setPaper(String Paper, String Paper2) {
        System.out.println("Set paper Persegi Panjang: " + Paper + Paper2);
    }
}

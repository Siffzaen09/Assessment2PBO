package com.vlaywry;

public class Vip extends Lapangan {
    public Vip (int lamasewa, int harga) {
        setlamse (lamasewa);
        sethargaperset (harga);
    }

    private void sethargaperset(int harga) {
    }

    private void setlamse(int lamasewa) {
    }

    @Override
    public String Jenis () {
        setJenis ("Vip");
        return (String) getJenis ();
    }

    private void setJenis(String vip) {
    }
}

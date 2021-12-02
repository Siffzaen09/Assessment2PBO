package com.vlaywry;

public class Reguler extends Lapangan {
    public Reguler (int lamasewa, int harga) {
        setlamse (lamasewa);
        sethargaperset (harga);
    }

    private void sethargaperset(int harga) {
    }

    private void setlamse(int lamasewa) {
    }

    @Override
    public String Jenis () {
        setJenis ("Reguler");
        return (String) getJenis ();
    }

    private void setJenis(String reguler) {
    }
}

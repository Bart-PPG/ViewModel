package com.example.liczby;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class LosoweViewModel extends ViewModel {
    private int losowa;

    public int getLosowa() {
        return losowa;
    }

    public void setLosowa(int losowa) {
        this.losowa = losowa;
    }
    public void wylosuj(){
        Random random = new Random();
        losowa = random.nextInt(100);
    }
}

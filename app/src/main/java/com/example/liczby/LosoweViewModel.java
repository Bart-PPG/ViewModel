package com.example.liczby;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class LosoweViewModel extends ViewModel {
    private MutableLiveData<Integer> losowa;

    public MutableLiveData<Integer> getLosowa() {
        if(losowa == null){
            losowa = new MutableLiveData<>();
        }
        return losowa;
    }

    public void setLosowa(MutableLiveData<Integer> losowa) {
        if(losowa == null){
            losowa = new MutableLiveData<>();
        }
        this.losowa = losowa;
    }

    public void wylosuj(){
        Random random = new Random();
        if(losowa == null){
            losowa = new MutableLiveData<>();
        }
        losowa.setValue(random.nextInt(100));
    }
}

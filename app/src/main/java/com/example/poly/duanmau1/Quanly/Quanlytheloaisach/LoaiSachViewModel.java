package com.example.poly.duanmau1.Quanly.Quanlytheloaisach;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.poly.duanmau1.Product.LoaiSach;
import com.example.poly.duanmau1.DAO.LoaiSachDao;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class LoaiSachViewModel extends AndroidViewModel {
    LoaiSachDao lsDao;
    MutableLiveData<List<LoaiSach>> liveData;

    public LoaiSachViewModel(@NonNull @NotNull Application application) {
        super(application);
        liveData = new MutableLiveData<>();
        lsDao = new LoaiSachDao(application);
    }

    public MutableLiveData<List<LoaiSach>> getLiveData() {
        loadls();
        return liveData;

    }

    public void loadls() {
        List<LoaiSach> list = new ArrayList<>();
        list = lsDao.GETLS();
        liveData.setValue(list);
    }

}
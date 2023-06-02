package com.example.poly.duanmau1.Quanly.Phieumuon;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.poly.duanmau1.DAO.PhieuMuonDao;
import com.example.poly.duanmau1.Product.PhieuMuon;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class PhieuMuonViewModel extends AndroidViewModel {
    MutableLiveData<List<PhieuMuon>> liveData;
    PhieuMuonDao dao;

    public PhieuMuonViewModel(@NonNull @NotNull Application application) {
        super(application);
        liveData = new MutableLiveData<>();
        dao = new PhieuMuonDao(application);
    }

    public MutableLiveData<List<PhieuMuon>> getLiveData() {
        loadData();
        return liveData;
    }

    public void loadData() {
        List<PhieuMuon> list = new ArrayList<>();
        list = dao.GETPM();
        liveData.setValue(list);
    }
}

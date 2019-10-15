package com.yuditsky.aggregation_and_composition.task4.logic;

import com.yuditsky.aggregation_and_composition.task4.entity.Agency;
import com.yuditsky.aggregation_and_composition.task4.entity.Voucher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AgencyLogic {

    public static boolean isAvaible(Agency agency, Voucher desiredVoucher){
        for(Voucher voucher : agency.getVouchers()){
            if(voucher == desiredVoucher){
                return true;
            }
        }
        return false;
    }

    public void toBook(Agency agency, Voucher desiredVoucher){
        if(isAvaible(agency, desiredVoucher)){
            agency.getVouchers().remove(desiredVoucher);
        }
    }

    public static List<Voucher> sortByDays(Agency agency){
        ArrayList<Voucher> sortedList = new ArrayList<>(agency.getVouchers());

        sortedList.sort(Comparator.comparing(Voucher::getDays));

        return sortedList;
    }

    public static ArrayList<Voucher> listByTransport(Agency agency, Voucher.Transport transport){
        ArrayList<Voucher> resList = new ArrayList<>();

        for(Voucher voucher : agency.getVouchers()){
            if(voucher.getTransport() == transport){
                resList.add(voucher);
            }
        }

        return resList;
    }

    public List<Voucher> listByType(Agency agency, Voucher.Type type){
        ArrayList<Voucher> resList = new ArrayList<>();

        for(Voucher voucher : agency.getVouchers()){
            if(voucher.getType() == type){
                resList.add(voucher);
            }
        }

        return resList;
    }

    public List<Voucher> listByFeed(Agency agency, Voucher.Feed feed){
        ArrayList<Voucher> resList = new ArrayList<>();

        for(Voucher voucher : agency.getVouchers()){
            if(voucher.getFeed() == feed){
                resList.add(voucher);
            }
        }

        return resList;
    }
}

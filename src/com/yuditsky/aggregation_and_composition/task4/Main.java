//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок

package com.yuditsky.aggregation_and_composition.task4;

import com.yuditsky.aggregation_and_composition.task4.entity.Voucher;
import com.yuditsky.aggregation_and_composition.task4.logic.VoucherGenerator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Voucher> vouchers = new ArrayList<>();
       // Voucher desiredVoucher = new Voucher();

        for(int i = 0; i < 15; i++) {
            vouchers.add(VoucherGenerator.generate());
        }

        System.out.println("Available vouchers:");
        for(Voucher voucher : vouchers){
            System.out.println("days: " + voucher.getDays() + ", type: " + voucher.getType() + ", transport: " +
                    voucher.getTransport() + ", feed: " + voucher.getFeed());
        }

      /*  desiredVoucher = VoucherGenerator.generate();
        System.out.println("desired voucher: " + " days: " + desiredVoucher.getDays() + ", type: "
                + desiredVoucher.getType() + ", transport: " + desiredVoucher.getTransport()
                + ", feed: " + desiredVoucher.getFeed());
*/

    }
}

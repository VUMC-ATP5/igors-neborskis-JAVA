package lekcijaPieci.majasDarbs.oop_homework;

import java.text.DecimalFormat;
import java.util.Date;

public class Visit extends DiscountRate {
    Date date;
    double serviceExpense;
    double productExpense;

    public void visit (double productExpense, double serviceExpense){
        this.date = new Date();
        this.productExpense = productExpense;
        this.serviceExpense = serviceExpense;

    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    DecimalFormat df = new DecimalFormat("####0.00");
    public void silverMemberCheck(){
        System.out.println("-------------------------------------");
        System.out.println("Apmeklējuma datums: " + date);
        System.out.println("Klienta atlaižu līmenis: " + Customer.getMemberType());
        System.out.println("Produkcijas izmaksas BEZ atlaides: " + df.format(productExpense) + "EUR");
        System.out.println("Atlaide uz produkciju: " + (productDiscountSilver*100) + "%");
        productExpense = productExpense * (1 - productDiscountSilver);
        System.out.println("Produkcijas izmaksas AR atlaidi: " + df.format(productExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("Apkalpošanas izmaksas BEZ atlaides: " + df.format(serviceExpense) + "EUR");
        System.out.println("Atlaide uz apkalpošanu: " + (serviceDiscountSilver*100) + "%");
        serviceExpense = serviceExpense * (1 - serviceDiscountSilver);
        System.out.println("Apkalpošanas izmaksas AR atlaidi: " + df.format(serviceExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("KOPĀ APMAKSAI: " + df.format((productExpense + serviceExpense)) + "EUR");
    }
    public void goldMemberCheck(){
        System.out.println("-------------------------------------");
        System.out.println("Apmeklējuma datums: " + date);
        System.out.println("Klienta atlaižu līmenis: " + Customer.getMemberType());
        System.out.println("Produkcijas izmaksas BEZ atlaides: " + df.format(productExpense) + "EUR");
        System.out.println("Atlaide uz produkciju: " + (productDiscountGold*100) + "%");
        productExpense = productExpense * (1 - productDiscountGold);
        System.out.println("Produkcijas izmaksas AR atlaidi: " + df.format(productExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("Apkalpošanas izmaksas BEZ atlaides: " + df.format(serviceExpense) + "EUR");
        System.out.println("Atlaide uz apkalpošanu: " + (serviceDiscountGold*100) + "%");
        serviceExpense = serviceExpense * (1 - serviceDiscountGold);
        System.out.println("Apkalpošanas izmaksas AR atlaidi: " + df.format(serviceExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("KOPĀ APMAKSAI: " + df.format((productExpense + serviceExpense)) + "EUR");
    }
    public void premiumMemberCheck(){
        System.out.println("-------------------------------------");
        System.out.println("Apmeklējuma datums: " + date);
        System.out.println("Klienta atlaižu līmenis: " + Customer.getMemberType());
        System.out.println("Produkcijas izmaksas BEZ atlaides: " + df.format(productExpense) + "EUR");
        System.out.println("Atlaide uz produkciju: " + (productDiscountPremium*100) + "%");
        productExpense = productExpense * (1 - productDiscountPremium);
        System.out.println("Produkcijas izmaksas AR atlaidi: " + df.format(productExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("Apkalpošanas izmaksas BEZ atlaides: " + df.format(serviceExpense) + "EUR");
        System.out.println("Atlaide uz apkalpošanu: " + (serviceDiscountPremium*100) + "%");
        serviceExpense = serviceExpense * (1 - serviceDiscountPremium);
        System.out.println("Apkalpošanas izmaksas AR atlaidi: " + df.format(serviceExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("KOPĀ APMAKSAI: " + df.format((productExpense + serviceExpense)) + "EUR");
    }

    public void noMemberCheck(){
        System.out.println("-------------------------------------");
        System.out.println("Apmeklējuma datums: " + date);
        System.out.println("Klienta atlaižu līmenis: " + Customer.getMemberType());
        System.out.println("Produkcijas izmaksas BEZ atlaides: " + df.format(productExpense) + "EUR");
        System.out.println("Atlaide uz produkciju: N/A");
        productExpense = productExpense;
        System.out.println("Produkcijas izmaksas AR atlaidi: " + df.format(productExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("Apkalpošanas izmaksas BEZ atlaides: " + df.format(serviceExpense) + "EUR");
        System.out.println("Atlaide uz apkalpošanu: N/A");
        serviceExpense = serviceExpense;
        System.out.println("Apkalpošanas izmaksas AR atlaidi: " + df.format(serviceExpense) + "EUR");
        System.out.println("-------------------------------------");
        System.out.println("KOPĀ APMAKSAI: " + df.format((productExpense + serviceExpense)) + "EUR");
    }


}


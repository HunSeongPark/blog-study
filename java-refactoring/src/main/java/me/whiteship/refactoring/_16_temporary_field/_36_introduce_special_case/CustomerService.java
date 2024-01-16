package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

public class CustomerService {

    public String customerName(Site site) {
        return site.getCustomer().getName();

//        String customerName;
//        if (customer.getName().equals("unknown")) {
//            customerName = "occupant";
//        } else {
//            customerName = customer.getName();
//        }
//
//        return customerName;
    }

    public BillingPlan billingPlan(Site site) {
        return site.getCustomer().getBillingPlan();
//        return customer.getName().equals("unknown") ? new BasicBillingPlan() : customer.getBillingPlan();
    }

    public int weeksDelinquent(Site site) {
        // NPE 발생!!!!
        return site.getCustomer().getPaymentHistory().getWeeksDelinquentInLastYear();
//        return customer.getName().equals("unknown") ? 0 : customer.getPaymentHistory().getWeeksDelinquentInLastYear();
    }

}

package company.discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{

    private Double discountAmount;

    public AmountBasedDiscount(UUID id, String name, Double thresholdAmount) {
        super(id, name, thresholdAmount);
        this.discountAmount=discountAmount;
    }

    @Override
    public Double calculateCartAmountAfterDiscountApplied(Double amount) {
        return amount- discountAmount;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }
}

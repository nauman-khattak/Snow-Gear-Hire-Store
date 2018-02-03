
package snow.gear.hire.store;

public class Affiliated_business_hire extends SnowGearHireStore implements Payments_processing{
    
    @Override
    public void payment() {
        total_business_amount += 27 *total_pieces;
        total_discounts += (35*total_pieces)-(27*total_pieces);
    }
}

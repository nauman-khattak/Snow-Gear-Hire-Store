
package snow.gear.hire.store;

public class Member_hire extends SnowGearHireStore implements Payments_processing{
    
    @Override
    public void payment() {
        total_member_amount += 20 * total_pieces;
        total_discounts += (35*total_pieces)-(20*total_pieces);
    }
    
}

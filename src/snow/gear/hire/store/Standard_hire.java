package snow.gear.hire.store;

public class Standard_hire extends SnowGearHireStore implements Payments_processing{

    @Override
    public void payment() {
        total_standard_amount += 35 *total_pieces;
        
    }
}

package za.ac.cput.carrental.domain;

import java.time.LocalDateTime;

/**
 *
 * @author Zahrah Vermaak 
 */
public class Rental {
    private String vehicleRegistration;
    private String customerId;
    private LocalDateTime dateOfCollection, dateOfReturn;

    public Rental() {
    }
    
    

    public Rental(String vehicleRegistration, String customerId, LocalDateTime dateOfCollection, LocalDateTime dateOfReturn) {
        this.vehicleRegistration = vehicleRegistration;
        this.customerId = customerId;
        this.dateOfCollection = dateOfCollection;
        this.dateOfReturn = dateOfReturn;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public String getCustomerId() {
        return customerId;
    }

    public LocalDateTime getDateOfCollection() {
        return dateOfCollection;
    }

    public LocalDateTime getDateOfReturn() {
        return dateOfReturn;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setDateOfCollection(LocalDateTime dateOfCollection) {
        this.dateOfCollection = dateOfCollection;
    }

    public void setDateOfReturn(LocalDateTime dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleRegistration=" + vehicleRegistration + ", customerId=" + customerId + ", dateOfCollection=" + dateOfCollection + ", dateOfReturn=" + dateOfReturn + '}';
    }
    
    
    
    
    
}

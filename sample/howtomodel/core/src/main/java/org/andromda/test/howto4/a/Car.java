// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by Entity.vsl in andromda-ejb3-cartridge.
//
package org.andromda.test.howto4.a;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

/**
 * Autogenerated POJO EJB3 implementation class for Car.
 * Add any manual implementation within this class. This class will NOT
 * be overwritten with incremental changes.
 * TODO: Model Documentation for org.andromda.test.howto4.a.Car
 */
@Entity
@Table(name = "CAR"

, uniqueConstraints = @UniqueConstraint(columnNames =
{ "type" }))
// Uncomment to enable entity listener for Car
// @javax.persistence.EntityListeners({org.andromda.test.howto4.a.CarListener.class})
// Uncomment to enable caching for Car
// @org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
@NamedQuery(name = "Car.findAll", query = "SELECT c FROM Car AS c")
public class Car extends CarEmbeddable implements Serializable, Comparable<Car>
{
    /**
     * The serial version UID of this class required for serialization.
     */
    private static final long serialVersionUID = -6793461983486533447L;

    // --------------- constructors -----------------

    /**
     * Default Car constructor
     */
    public Car()
    {
        super();
    }

    /**
     * Implementation for the constructor with all POJO attributes except auto incremented identifiers.
     * This method sets all POJO fields defined in this/super class to the
     * values provided by the parameters.
     */
    public Car(CarPK pk, String type)
    {
        super(pk, type);
    }

    /**
     * Constructor with all POJO attribute values and CMR relations.
     * 
     * @param type Value for the type property
     * @param owner Value for the owner relation
     */
    public Car(CarPK pk, String type, Person owner)
    {
        super(pk, type, owner);
    }

    // -------------- Entity Methods -----------------

    /**
     * Returns true if all cars are currently rented.
     */
    @Transient
    public static boolean allCarsAreRented()
    {
        // TODO put your implementation here.
        return false;
    }

    /**
     * Returns true if this car is current rented.
     */
    @Transient
    public boolean isRented()
    {
        // TODO put your implementation here.
        return false;
    }

    // --------------- Lifecycle callbacks -----------------

    /**
     * @see Comparable#compareTo
     */
    @Override
    public int compareTo(Car o)
    {
        int cmp = 0;
        if (this.getPk() != null)
        {
            cmp = this.getPk().compareTo(o.getPk());
        } else
        {
            if (this.getType() != null)
            {
                cmp = (cmp != 0 ? cmp : this.getType().compareTo(o.getType()));
            }
        }
        return cmp;
    }

}
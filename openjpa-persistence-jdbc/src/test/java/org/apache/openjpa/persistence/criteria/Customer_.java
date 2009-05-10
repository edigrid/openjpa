/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.List;
import javax.persistence.metamodel.Set;

@javax.persistence.metamodel.TypesafeMetamodel(value=org.apache.openjpa.persistence.criteria.Customer.class)
public class Customer_ {
    public static volatile Attribute<Customer,Long> accountNum;
    public static volatile List<Customer,Account> accounts;
    public static volatile Attribute<Customer,Address> address;
    public static volatile Attribute<Customer,Integer> balanceOwed;
    public static volatile Attribute<Customer,Integer> filledOrderCount;
    public static volatile Attribute<Customer,String> firstName;
    public static volatile Attribute<Customer,Long> id;
    public static volatile Attribute<Customer,String> lastName;
    public static volatile Attribute<Customer,String> name;
    public static volatile Set<Customer,Order> orders;
    public static volatile Attribute<Customer,Integer> status;
}

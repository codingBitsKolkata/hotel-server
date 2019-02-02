package com.hotelserver.helper;

import generated.ExpenseT;
import generated.ItemListT;
import generated.ItemT;
import generated.ObjectFactory;
import generated.UserT;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaObjects {

  /**
   * @param args
   * @throws JAXBException 
   */
  public static void main(String[] args) throws JAXBException {
    //1. We need to create JAXContext instance
    JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

    //2. Use JAXBContext instance to create the Unmarshaller.
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

    //3. Use the Unmarshaller to unmarshal the XML document to get an instance of JAXBElement.
    JAXBElement<ExpenseT> unmarshalledObject = 
        (JAXBElement<ExpenseT>)unmarshaller.unmarshal(
            ClassLoader.getSystemResourceAsStream("problem/expense.xml"));

    //4. Get the instance of the required JAXB Root Class from the JAXBElement.
    ExpenseT expenseObj = unmarshalledObject.getValue();
    UserT user = expenseObj.getUser();
    ItemListT items = expenseObj.getItems();

    //Obtaining all the required data from the JAXB Root class instance.
    System.out.println("Printing the Expense for: "+user.getUserName());
    for ( ItemT item : items.getItem()){
      System.out.println("Name: "+item.getItemName());
      System.out.println("Value: "+item.getAmount());
      System.out.println("Date of Purchase: "+item.getPurchasedOn());
    }   
  }

}

/*
 * generated by Xtext 2.15.0
 */
package org.xtext.project439.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.project439.grocery.Backroom;
import org.xtext.project439.grocery.Driver;
import org.xtext.project439.grocery.ExperationDate;
import org.xtext.project439.grocery.Grocery;
import org.xtext.project439.grocery.GroceryPackage;
import org.xtext.project439.grocery.NonPerishableItem;
import org.xtext.project439.grocery.PerishableItem;
import org.xtext.project439.grocery.Shelf;
import org.xtext.project439.grocery.Store;
import org.xtext.project439.grocery.Vehicle;
import org.xtext.project439.grocery.Warehouse;
import org.xtext.project439.services.GroceryGrammarAccess;

@SuppressWarnings("all")
public class GrocerySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GroceryGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GroceryPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GroceryPackage.BACKROOM:
				sequence_Backroom(context, (Backroom) semanticObject); 
				return; 
			case GroceryPackage.DRIVER:
				sequence_Driver(context, (Driver) semanticObject); 
				return; 
			case GroceryPackage.EXPERATION_DATE:
				sequence_ExperationDate(context, (ExperationDate) semanticObject); 
				return; 
			case GroceryPackage.GROCERY:
				sequence_Grocery(context, (Grocery) semanticObject); 
				return; 
			case GroceryPackage.NON_PERISHABLE_ITEM:
				sequence_NonPerishableItem(context, (NonPerishableItem) semanticObject); 
				return; 
			case GroceryPackage.PERISHABLE_ITEM:
				sequence_PerishableItem(context, (PerishableItem) semanticObject); 
				return; 
			case GroceryPackage.SHELF:
				sequence_Shelf(context, (Shelf) semanticObject); 
				return; 
			case GroceryPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case GroceryPackage.VEHICLE:
				sequence_Vehicle(context, (Vehicle) semanticObject); 
				return; 
			case GroceryPackage.WAREHOUSE:
				sequence_Warehouse(context, (Warehouse) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     StoreElements returns Backroom
	 *     Backroom returns Backroom
	 *
	 * Constraint:
	 *     (name=ID elements+=Item*)
	 */
	protected void sequence_Backroom(ISerializationContext context, Backroom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeliveryElement returns Driver
	 *     Driver returns Driver
	 *
	 * Constraint:
	 *     (name=ID driverName=STRING)
	 */
	protected void sequence_Driver(ISerializationContext context, Driver semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.DELIVERY_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.DELIVERY_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.DRIVER__DRIVER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.DRIVER__DRIVER_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDriverAccess().getDriverNameSTRINGTerminalRuleCall_5_0(), semanticObject.getDriverName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExperationDate returns ExperationDate
	 *
	 * Constraint:
	 *     date=DATE
	 */
	protected void sequence_ExperationDate(ISerializationContext context, ExperationDate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.EXPERATION_DATE__DATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.EXPERATION_DATE__DATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExperationDateAccess().getDateDATEParserRuleCall_4_0(), semanticObject.getDate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Grocery returns Grocery
	 *
	 * Constraint:
	 *     ((elements+=Building+ elements+=DeliveryElement+) | elements+=DeliveryElement+)?
	 */
	protected void sequence_Grocery(ISerializationContext context, Grocery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Item returns NonPerishableItem
	 *     NonPerishableItem returns NonPerishableItem
	 *
	 * Constraint:
	 *     (name=ID price=DECIMAL quantity=INT)
	 */
	protected void sequence_NonPerishableItem(ISerializationContext context, NonPerishableItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.ITEM__NAME));
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.NON_PERISHABLE_ITEM__PRICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.NON_PERISHABLE_ITEM__PRICE));
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.NON_PERISHABLE_ITEM__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.NON_PERISHABLE_ITEM__QUANTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0(), semanticObject.getPrice());
		feeder.accept(grammarAccess.getNonPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0(), semanticObject.getQuantity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Item returns PerishableItem
	 *     PerishableItem returns PerishableItem
	 *
	 * Constraint:
	 *     (name=ID price=INT experationDate+=ExperationDate)
	 */
	protected void sequence_PerishableItem(ISerializationContext context, PerishableItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StoreElements returns Shelf
	 *     Shelf returns Shelf
	 *
	 * Constraint:
	 *     (name=ID elements+=Item*)
	 */
	protected void sequence_Shelf(ISerializationContext context, Shelf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Building returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (name=ID elements+=StoreElements*)
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeliveryElement returns Vehicle
	 *     Vehicle returns Vehicle
	 *
	 * Constraint:
	 *     (name=ID plateNumber=STRING)
	 */
	protected void sequence_Vehicle(ISerializationContext context, Vehicle semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.DELIVERY_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.DELIVERY_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, GroceryPackage.Literals.VEHICLE__PLATE_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GroceryPackage.Literals.VEHICLE__PLATE_NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVehicleAccess().getPlateNumberSTRINGTerminalRuleCall_5_0(), semanticObject.getPlateNumber());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Building returns Warehouse
	 *     Warehouse returns Warehouse
	 *
	 * Constraint:
	 *     (name=ID address=ADDRESS elements+=Item*)
	 */
	protected void sequence_Warehouse(ISerializationContext context, Warehouse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}

/*
 * generated by Xtext 2.15.0
 */
grammar InternalGrocery;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.project439.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.project439.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.project439.services.GroceryGrammarAccess;

}
@parser::members {
	private GroceryGrammarAccess grammarAccess;

	public void setGrammarAccess(GroceryGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGrocery
entryRuleGrocery
:
{ before(grammarAccess.getGroceryRule()); }
	 ruleGrocery
{ after(grammarAccess.getGroceryRule()); } 
	 EOF 
;

// Rule Grocery
ruleGrocery 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGroceryAccess().getGroup()); }
		(rule__Grocery__Group__0)
		{ after(grammarAccess.getGroceryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBuilding
entryRuleBuilding
:
{ before(grammarAccess.getBuildingRule()); }
	 ruleBuilding
{ after(grammarAccess.getBuildingRule()); } 
	 EOF 
;

// Rule Building
ruleBuilding 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBuildingAccess().getAlternatives()); }
		(rule__Building__Alternatives)
		{ after(grammarAccess.getBuildingAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeliveryElement
entryRuleDeliveryElement
:
{ before(grammarAccess.getDeliveryElementRule()); }
	 ruleDeliveryElement
{ after(grammarAccess.getDeliveryElementRule()); } 
	 EOF 
;

// Rule DeliveryElement
ruleDeliveryElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeliveryElementAccess().getAlternatives()); }
		(rule__DeliveryElement__Alternatives)
		{ after(grammarAccess.getDeliveryElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStore
entryRuleStore
:
{ before(grammarAccess.getStoreRule()); }
	 ruleStore
{ after(grammarAccess.getStoreRule()); } 
	 EOF 
;

// Rule Store
ruleStore 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStoreAccess().getGroup()); }
		(rule__Store__Group__0)
		{ after(grammarAccess.getStoreAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWarehouse
entryRuleWarehouse
:
{ before(grammarAccess.getWarehouseRule()); }
	 ruleWarehouse
{ after(grammarAccess.getWarehouseRule()); } 
	 EOF 
;

// Rule Warehouse
ruleWarehouse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWarehouseAccess().getGroup()); }
		(rule__Warehouse__Group__0)
		{ after(grammarAccess.getWarehouseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleShelf
entryRuleShelf
:
{ before(grammarAccess.getShelfRule()); }
	 ruleShelf
{ after(grammarAccess.getShelfRule()); } 
	 EOF 
;

// Rule Shelf
ruleShelf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getShelfAccess().getGroup()); }
		(rule__Shelf__Group__0)
		{ after(grammarAccess.getShelfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBackroom
entryRuleBackroom
:
{ before(grammarAccess.getBackroomRule()); }
	 ruleBackroom
{ after(grammarAccess.getBackroomRule()); } 
	 EOF 
;

// Rule Backroom
ruleBackroom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBackroomAccess().getGroup()); }
		(rule__Backroom__Group__0)
		{ after(grammarAccess.getBackroomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleItem
entryRuleItem
:
{ before(grammarAccess.getItemRule()); }
	 ruleItem
{ after(grammarAccess.getItemRule()); } 
	 EOF 
;

// Rule Item
ruleItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getItemAccess().getAlternatives()); }
		(rule__Item__Alternatives)
		{ after(grammarAccess.getItemAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNonPerishableItem
entryRuleNonPerishableItem
:
{ before(grammarAccess.getNonPerishableItemRule()); }
	 ruleNonPerishableItem
{ after(grammarAccess.getNonPerishableItemRule()); } 
	 EOF 
;

// Rule NonPerishableItem
ruleNonPerishableItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonPerishableItemAccess().getGroup()); }
		(rule__NonPerishableItem__Group__0)
		{ after(grammarAccess.getNonPerishableItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePerishableItem
entryRulePerishableItem
:
{ before(grammarAccess.getPerishableItemRule()); }
	 rulePerishableItem
{ after(grammarAccess.getPerishableItemRule()); } 
	 EOF 
;

// Rule PerishableItem
rulePerishableItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPerishableItemAccess().getGroup()); }
		(rule__PerishableItem__Group__0)
		{ after(grammarAccess.getPerishableItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAddress
entryRuleAddress
:
{ before(grammarAccess.getAddressRule()); }
	 ruleAddress
{ after(grammarAccess.getAddressRule()); } 
	 EOF 
;

// Rule Address
ruleAddress 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAddressAccess().getGroup()); }
		(rule__Address__Group__0)
		{ after(grammarAccess.getAddressAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExperationDate
entryRuleExperationDate
:
{ before(grammarAccess.getExperationDateRule()); }
	 ruleExperationDate
{ after(grammarAccess.getExperationDateRule()); } 
	 EOF 
;

// Rule ExperationDate
ruleExperationDate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExperationDateAccess().getGroup()); }
		(rule__ExperationDate__Group__0)
		{ after(grammarAccess.getExperationDateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDriver
entryRuleDriver
:
{ before(grammarAccess.getDriverRule()); }
	 ruleDriver
{ after(grammarAccess.getDriverRule()); } 
	 EOF 
;

// Rule Driver
ruleDriver 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDriverAccess().getGroup()); }
		(rule__Driver__Group__0)
		{ after(grammarAccess.getDriverAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVehicle
entryRuleVehicle
:
{ before(grammarAccess.getVehicleRule()); }
	 ruleVehicle
{ after(grammarAccess.getVehicleRule()); } 
	 EOF 
;

// Rule Vehicle
ruleVehicle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVehicleAccess().getGroup()); }
		(rule__Vehicle__Group__0)
		{ after(grammarAccess.getVehicleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Building__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBuildingAccess().getStoreParserRuleCall_0()); }
		ruleStore
		{ after(grammarAccess.getBuildingAccess().getStoreParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBuildingAccess().getWarehouseParserRuleCall_1()); }
		ruleWarehouse
		{ after(grammarAccess.getBuildingAccess().getWarehouseParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeliveryElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeliveryElementAccess().getDriverParserRuleCall_0()); }
		ruleDriver
		{ after(grammarAccess.getDeliveryElementAccess().getDriverParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeliveryElementAccess().getVehicleParserRuleCall_1()); }
		ruleVehicle
		{ after(grammarAccess.getDeliveryElementAccess().getVehicleParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Item__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItemAccess().getPerishableItemParserRuleCall_0()); }
		rulePerishableItem
		{ after(grammarAccess.getItemAccess().getPerishableItemParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getItemAccess().getNonPerishableItemParserRuleCall_1()); }
		ruleNonPerishableItem
		{ after(grammarAccess.getItemAccess().getNonPerishableItemParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grocery__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grocery__Group__0__Impl
	rule__Grocery__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grocery__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroceryAccess().getElementsAssignment_0()); }
	(rule__Grocery__ElementsAssignment_0)*
	{ after(grammarAccess.getGroceryAccess().getElementsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grocery__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grocery__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grocery__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroceryAccess().getElementsAssignment_1()); }
	(rule__Grocery__ElementsAssignment_1)*
	{ after(grammarAccess.getGroceryAccess().getElementsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Store__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Store__Group__0__Impl
	rule__Store__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoreAccess().getStoreKeyword_0()); }
	'store'
	{ after(grammarAccess.getStoreAccess().getStoreKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Store__Group__1__Impl
	rule__Store__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoreAccess().getNameAssignment_1()); }
	(rule__Store__NameAssignment_1)
	{ after(grammarAccess.getStoreAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Store__Group__2__Impl
	rule__Store__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Store__Group__3__Impl
	rule__Store__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoreAccess().getElementsAssignment_3()); }
	(rule__Store__ElementsAssignment_3)*
	{ after(grammarAccess.getStoreAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Store__Group__4__Impl
	rule__Store__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoreAccess().getElementsAssignment_4()); }
	(rule__Store__ElementsAssignment_4)
	{ after(grammarAccess.getStoreAccess().getElementsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Store__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Warehouse__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Warehouse__Group__0__Impl
	rule__Warehouse__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWarehouseAccess().getNameAssignment_0()); }
	(rule__Warehouse__NameAssignment_0)
	{ after(grammarAccess.getWarehouseAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Warehouse__Group__1__Impl
	rule__Warehouse__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWarehouseAccess().getAddressAssignment_1()); }
	(rule__Warehouse__AddressAssignment_1)
	{ after(grammarAccess.getWarehouseAccess().getAddressAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Warehouse__Group__2__Impl
	rule__Warehouse__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Warehouse__Group__3__Impl
	rule__Warehouse__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWarehouseAccess().getElementsAssignment_3()); }
	(rule__Warehouse__ElementsAssignment_3)*
	{ after(grammarAccess.getWarehouseAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Warehouse__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Shelf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Shelf__Group__0__Impl
	rule__Shelf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Shelf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getShelfAccess().getShelfKeyword_0()); }
	'shelf'
	{ after(grammarAccess.getShelfAccess().getShelfKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Shelf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Shelf__Group__1__Impl
	rule__Shelf__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Shelf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getShelfAccess().getNameAssignment_1()); }
	(rule__Shelf__NameAssignment_1)
	{ after(grammarAccess.getShelfAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Shelf__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Shelf__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Shelf__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getShelfAccess().getElementsAssignment_2()); }
	(rule__Shelf__ElementsAssignment_2)*
	{ after(grammarAccess.getShelfAccess().getElementsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Backroom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Backroom__Group__0__Impl
	rule__Backroom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Backroom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); }
	'backroom'
	{ after(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Backroom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Backroom__Group__1__Impl
	rule__Backroom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Backroom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBackroomAccess().getNameAssignment_1()); }
	(rule__Backroom__NameAssignment_1)
	{ after(grammarAccess.getBackroomAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Backroom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Backroom__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Backroom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBackroomAccess().getElementsAssignment_2()); }
	(rule__Backroom__ElementsAssignment_2)*
	{ after(grammarAccess.getBackroomAccess().getElementsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonPerishableItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonPerishableItem__Group__0__Impl
	rule__NonPerishableItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonPerishableItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); }
	'nonPerishableItem'
	{ after(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonPerishableItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonPerishableItem__Group__1__Impl
	rule__NonPerishableItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NonPerishableItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); }
	(rule__NonPerishableItem__NameAssignment_1)
	{ after(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonPerishableItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonPerishableItem__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonPerishableItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_2()); }
	(rule__NonPerishableItem__PriceAssignment_2)
	{ after(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PerishableItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PerishableItem__Group__0__Impl
	rule__PerishableItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PerishableItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); }
	'perishableItem'
	{ after(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PerishableItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PerishableItem__Group__1__Impl
	rule__PerishableItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PerishableItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); }
	(rule__PerishableItem__NameAssignment_1)
	{ after(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PerishableItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PerishableItem__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PerishableItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_2()); }
	(rule__PerishableItem__ExperationDateAssignment_2)
	{ after(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Address__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Address__Group__0__Impl
	rule__Address__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressAccess().getStreetKeyword_0()); }
	'street'
	{ after(grammarAccess.getAddressAccess().getStreetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Address__Group__1__Impl
	rule__Address__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressAccess().getStreetAssignment_1()); }
	(rule__Address__StreetAssignment_1)
	{ after(grammarAccess.getAddressAccess().getStreetAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Address__Group__2__Impl
	rule__Address__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressAccess().getNumberKeyword_2()); }
	'number'
	{ after(grammarAccess.getAddressAccess().getNumberKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Address__Group__3__Impl
	rule__Address__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressAccess().getNumberAssignment_3()); }
	(rule__Address__NumberAssignment_3)
	{ after(grammarAccess.getAddressAccess().getNumberAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Address__Group__4__Impl
	rule__Address__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressAccess().getCityKeyword_4()); }
	'city'
	{ after(grammarAccess.getAddressAccess().getCityKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Address__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAddressAccess().getCityAssignment_5()); }
	(rule__Address__CityAssignment_5)
	{ after(grammarAccess.getAddressAccess().getCityAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExperationDate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExperationDate__Group__0__Impl
	rule__ExperationDate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperationDateAccess().getMonthKeyword_0()); }
	'month'
	{ after(grammarAccess.getExperationDateAccess().getMonthKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExperationDate__Group__1__Impl
	rule__ExperationDate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperationDateAccess().getMonthAssignment_1()); }
	(rule__ExperationDate__MonthAssignment_1)
	{ after(grammarAccess.getExperationDateAccess().getMonthAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExperationDate__Group__2__Impl
	rule__ExperationDate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperationDateAccess().getDayKeyword_2()); }
	'day'
	{ after(grammarAccess.getExperationDateAccess().getDayKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExperationDate__Group__3__Impl
	rule__ExperationDate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperationDateAccess().getDayAssignment_3()); }
	(rule__ExperationDate__DayAssignment_3)
	{ after(grammarAccess.getExperationDateAccess().getDayAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExperationDate__Group__4__Impl
	rule__ExperationDate__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperationDateAccess().getYearKeyword_4()); }
	'year'
	{ after(grammarAccess.getExperationDateAccess().getYearKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExperationDate__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExperationDateAccess().getYearAssignment_5()); }
	(rule__ExperationDate__YearAssignment_5)
	{ after(grammarAccess.getExperationDateAccess().getYearAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Driver__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Driver__Group__0__Impl
	rule__Driver__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Driver__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriverAccess().getDriverKeyword_0()); }
	'driver'
	{ after(grammarAccess.getDriverAccess().getDriverKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Driver__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Driver__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Driver__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDriverAccess().getNameAssignment_1()); }
	(rule__Driver__NameAssignment_1)
	{ after(grammarAccess.getDriverAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vehicle__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vehicle__Group__0__Impl
	rule__Vehicle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicle__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); }
	'vehicle'
	{ after(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicle__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vehicle__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicle__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVehicleAccess().getNameAssignment_1()); }
	(rule__Vehicle__NameAssignment_1)
	{ after(grammarAccess.getVehicleAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grocery__ElementsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGroceryAccess().getElementsBuildingParserRuleCall_0_0()); }
		ruleBuilding
		{ after(grammarAccess.getGroceryAccess().getElementsBuildingParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grocery__ElementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGroceryAccess().getElementsDeliveryElementParserRuleCall_1_0()); }
		ruleDeliveryElement
		{ after(grammarAccess.getGroceryAccess().getElementsDeliveryElementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoreAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStoreAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoreAccess().getElementsShelfParserRuleCall_3_0()); }
		ruleShelf
		{ after(grammarAccess.getStoreAccess().getElementsShelfParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Store__ElementsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStoreAccess().getElementsBackroomParserRuleCall_4_0()); }
		ruleBackroom
		{ after(grammarAccess.getStoreAccess().getElementsBackroomParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__AddressAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_1_0()); }
		ruleAddress
		{ after(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Warehouse__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_3_0()); }
		ruleItem
		{ after(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Shelf__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getShelfAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getShelfAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Shelf__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_2_0()); }
		ruleItem
		{ after(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Backroom__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBackroomAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getBackroomAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Backroom__ElementsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_2_0()); }
		ruleItem
		{ after(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonPerishableItem__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonPerishableItem__PriceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PerishableItem__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PerishableItem__ExperationDateAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_2_0()); }
		ruleExperationDate
		{ after(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__StreetAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__NumberAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Address__CityAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_5_0()); }
		RULE_STRING
		{ after(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__MonthAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__DayAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExperationDate__YearAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Driver__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vehicle__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

package org.xtext.project439.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project439.services.GroceryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGroceryParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'warehouse'", "'address'", "':'", "'supplier'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'price'", "'quantity'", "'perishableItem'", "'experationDate'", "'nonFoodItem'", "'driver'", "'name'", "'employee'", "'customer'", "'vehicle'", "'plateNumber'", "'delivery'", "'sale'", "'stock'", "'.'", "'/'", "','"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGroceryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGroceryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGroceryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGrocery.g"; }



     	private GroceryGrammarAccess grammarAccess;

        public InternalGroceryParser(TokenStream input, GroceryGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Grocery";
       	}

       	@Override
       	protected GroceryGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGrocery"
    // InternalGrocery.g:64:1: entryRuleGrocery returns [EObject current=null] : iv_ruleGrocery= ruleGrocery EOF ;
    public final EObject entryRuleGrocery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrocery = null;


        try {
            // InternalGrocery.g:64:48: (iv_ruleGrocery= ruleGrocery EOF )
            // InternalGrocery.g:65:2: iv_ruleGrocery= ruleGrocery EOF
            {
             newCompositeNode(grammarAccess.getGroceryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrocery=ruleGrocery();

            state._fsp--;

             current =iv_ruleGrocery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrocery"


    // $ANTLR start "ruleGrocery"
    // InternalGrocery.g:71:1: ruleGrocery returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleGrocery() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalGrocery.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalGrocery.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=17 && LA1_0<=20)||LA1_0==23||(LA1_0>=25 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=30)||(LA1_0>=32 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGrocery.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalGrocery.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalGrocery.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getGroceryAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGroceryRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.project439.Grocery.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrocery"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalGrocery.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalGrocery.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalGrocery.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalGrocery.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Building_0= ruleBuilding | this_MovementElement_1= ruleMovementElement | this_Movement_2= ruleMovement | this_Item_3= ruleItem | this_StoreElements_4= ruleStoreElements ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Building_0 = null;

        EObject this_MovementElement_1 = null;

        EObject this_Movement_2 = null;

        EObject this_Item_3 = null;

        EObject this_StoreElements_4 = null;



        	enterRule();

        try {
            // InternalGrocery.g:113:2: ( (this_Building_0= ruleBuilding | this_MovementElement_1= ruleMovementElement | this_Movement_2= ruleMovement | this_Item_3= ruleItem | this_StoreElements_4= ruleStoreElements ) )
            // InternalGrocery.g:114:2: (this_Building_0= ruleBuilding | this_MovementElement_1= ruleMovementElement | this_Movement_2= ruleMovement | this_Item_3= ruleItem | this_StoreElements_4= ruleStoreElements )
            {
            // InternalGrocery.g:114:2: (this_Building_0= ruleBuilding | this_MovementElement_1= ruleMovementElement | this_Movement_2= ruleMovement | this_Item_3= ruleItem | this_StoreElements_4= ruleStoreElements )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
            case 14:
                {
                alt2=1;
                }
                break;
            case 17:
            case 26:
            case 28:
            case 29:
            case 30:
                {
                alt2=2;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt2=3;
                }
                break;
            case 20:
            case 23:
            case 25:
                {
                alt2=4;
                }
                break;
            case 18:
            case 19:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGrocery.g:115:3: this_Building_0= ruleBuilding
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getBuildingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Building_0=ruleBuilding();

                    state._fsp--;


                    			current = this_Building_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:124:3: this_MovementElement_1= ruleMovementElement
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getMovementElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MovementElement_1=ruleMovementElement();

                    state._fsp--;


                    			current = this_MovementElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGrocery.g:133:3: this_Movement_2= ruleMovement
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getMovementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Movement_2=ruleMovement();

                    state._fsp--;


                    			current = this_Movement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGrocery.g:142:3: this_Item_3= ruleItem
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getItemParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Item_3=ruleItem();

                    state._fsp--;


                    			current = this_Item_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGrocery.g:151:3: this_StoreElements_4= ruleStoreElements
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getStoreElementsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoreElements_4=ruleStoreElements();

                    state._fsp--;


                    			current = this_StoreElements_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleBuilding"
    // InternalGrocery.g:163:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // InternalGrocery.g:163:49: (iv_ruleBuilding= ruleBuilding EOF )
            // InternalGrocery.g:164:2: iv_ruleBuilding= ruleBuilding EOF
            {
             newCompositeNode(grammarAccess.getBuildingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuilding=ruleBuilding();

            state._fsp--;

             current =iv_ruleBuilding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuilding"


    // $ANTLR start "ruleBuilding"
    // InternalGrocery.g:170:1: ruleBuilding returns [EObject current=null] : (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse ) ;
    public final EObject ruleBuilding() throws RecognitionException {
        EObject current = null;

        EObject this_Store_0 = null;

        EObject this_Warehouse_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:176:2: ( (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse ) )
            // InternalGrocery.g:177:2: (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse )
            {
            // InternalGrocery.g:177:2: (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGrocery.g:178:3: this_Store_0= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getBuildingAccess().getStoreParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_0=ruleStore();

                    state._fsp--;


                    			current = this_Store_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:187:3: this_Warehouse_1= ruleWarehouse
                    {

                    			newCompositeNode(grammarAccess.getBuildingAccess().getWarehouseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Warehouse_1=ruleWarehouse();

                    state._fsp--;


                    			current = this_Warehouse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuilding"


    // $ANTLR start "entryRuleStoreElements"
    // InternalGrocery.g:199:1: entryRuleStoreElements returns [EObject current=null] : iv_ruleStoreElements= ruleStoreElements EOF ;
    public final EObject entryRuleStoreElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreElements = null;


        try {
            // InternalGrocery.g:199:54: (iv_ruleStoreElements= ruleStoreElements EOF )
            // InternalGrocery.g:200:2: iv_ruleStoreElements= ruleStoreElements EOF
            {
             newCompositeNode(grammarAccess.getStoreElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreElements=ruleStoreElements();

            state._fsp--;

             current =iv_ruleStoreElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoreElements"


    // $ANTLR start "ruleStoreElements"
    // InternalGrocery.g:206:1: ruleStoreElements returns [EObject current=null] : (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf ) ;
    public final EObject ruleStoreElements() throws RecognitionException {
        EObject current = null;

        EObject this_Backroom_0 = null;

        EObject this_Shelf_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:212:2: ( (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf ) )
            // InternalGrocery.g:213:2: (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf )
            {
            // InternalGrocery.g:213:2: (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGrocery.g:214:3: this_Backroom_0= ruleBackroom
                    {

                    			newCompositeNode(grammarAccess.getStoreElementsAccess().getBackroomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Backroom_0=ruleBackroom();

                    state._fsp--;


                    			current = this_Backroom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:223:3: this_Shelf_1= ruleShelf
                    {

                    			newCompositeNode(grammarAccess.getStoreElementsAccess().getShelfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shelf_1=ruleShelf();

                    state._fsp--;


                    			current = this_Shelf_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoreElements"


    // $ANTLR start "entryRuleMovementElement"
    // InternalGrocery.g:235:1: entryRuleMovementElement returns [EObject current=null] : iv_ruleMovementElement= ruleMovementElement EOF ;
    public final EObject entryRuleMovementElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovementElement = null;


        try {
            // InternalGrocery.g:235:56: (iv_ruleMovementElement= ruleMovementElement EOF )
            // InternalGrocery.g:236:2: iv_ruleMovementElement= ruleMovementElement EOF
            {
             newCompositeNode(grammarAccess.getMovementElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovementElement=ruleMovementElement();

            state._fsp--;

             current =iv_ruleMovementElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMovementElement"


    // $ANTLR start "ruleMovementElement"
    // InternalGrocery.g:242:1: ruleMovementElement returns [EObject current=null] : (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle | this_Supplier_2= ruleSupplier ) ;
    public final EObject ruleMovementElement() throws RecognitionException {
        EObject current = null;

        EObject this_Person_0 = null;

        EObject this_Vehicle_1 = null;

        EObject this_Supplier_2 = null;



        	enterRule();

        try {
            // InternalGrocery.g:248:2: ( (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle | this_Supplier_2= ruleSupplier ) )
            // InternalGrocery.g:249:2: (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle | this_Supplier_2= ruleSupplier )
            {
            // InternalGrocery.g:249:2: (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle | this_Supplier_2= ruleSupplier )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 26:
            case 28:
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGrocery.g:250:3: this_Person_0= rulePerson
                    {

                    			newCompositeNode(grammarAccess.getMovementElementAccess().getPersonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Person_0=rulePerson();

                    state._fsp--;


                    			current = this_Person_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:259:3: this_Vehicle_1= ruleVehicle
                    {

                    			newCompositeNode(grammarAccess.getMovementElementAccess().getVehicleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vehicle_1=ruleVehicle();

                    state._fsp--;


                    			current = this_Vehicle_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGrocery.g:268:3: this_Supplier_2= ruleSupplier
                    {

                    			newCompositeNode(grammarAccess.getMovementElementAccess().getSupplierParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Supplier_2=ruleSupplier();

                    state._fsp--;


                    			current = this_Supplier_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovementElement"


    // $ANTLR start "entryRulePerson"
    // InternalGrocery.g:280:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalGrocery.g:280:47: (iv_rulePerson= rulePerson EOF )
            // InternalGrocery.g:281:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalGrocery.g:287:1: rulePerson returns [EObject current=null] : (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Driver_0 = null;

        EObject this_Employee_1 = null;

        EObject this_Customer_2 = null;



        	enterRule();

        try {
            // InternalGrocery.g:293:2: ( (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer ) )
            // InternalGrocery.g:294:2: (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer )
            {
            // InternalGrocery.g:294:2: (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGrocery.g:295:3: this_Driver_0= ruleDriver
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getDriverParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Driver_0=ruleDriver();

                    state._fsp--;


                    			current = this_Driver_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:304:3: this_Employee_1= ruleEmployee
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getEmployeeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Employee_1=ruleEmployee();

                    state._fsp--;


                    			current = this_Employee_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGrocery.g:313:3: this_Customer_2= ruleCustomer
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getCustomerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Customer_2=ruleCustomer();

                    state._fsp--;


                    			current = this_Customer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleItem"
    // InternalGrocery.g:325:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalGrocery.g:325:45: (iv_ruleItem= ruleItem EOF )
            // InternalGrocery.g:326:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalGrocery.g:332:1: ruleItem returns [EObject current=null] : (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_FoodItem_0 = null;

        EObject this_NonFoodItem_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:338:2: ( (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem ) )
            // InternalGrocery.g:339:2: (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem )
            {
            // InternalGrocery.g:339:2: (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20||LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGrocery.g:340:3: this_FoodItem_0= ruleFoodItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getFoodItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FoodItem_0=ruleFoodItem();

                    state._fsp--;


                    			current = this_FoodItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:349:3: this_NonFoodItem_1= ruleNonFoodItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getNonFoodItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonFoodItem_1=ruleNonFoodItem();

                    state._fsp--;


                    			current = this_NonFoodItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleFoodItem"
    // InternalGrocery.g:361:1: entryRuleFoodItem returns [EObject current=null] : iv_ruleFoodItem= ruleFoodItem EOF ;
    public final EObject entryRuleFoodItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodItem = null;


        try {
            // InternalGrocery.g:361:49: (iv_ruleFoodItem= ruleFoodItem EOF )
            // InternalGrocery.g:362:2: iv_ruleFoodItem= ruleFoodItem EOF
            {
             newCompositeNode(grammarAccess.getFoodItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoodItem=ruleFoodItem();

            state._fsp--;

             current =iv_ruleFoodItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFoodItem"


    // $ANTLR start "ruleFoodItem"
    // InternalGrocery.g:368:1: ruleFoodItem returns [EObject current=null] : (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) ;
    public final EObject ruleFoodItem() throws RecognitionException {
        EObject current = null;

        EObject this_PerishableItem_0 = null;

        EObject this_NonPerishableItem_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:374:2: ( (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) )
            // InternalGrocery.g:375:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            {
            // InternalGrocery.g:375:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGrocery.g:376:3: this_PerishableItem_0= rulePerishableItem
                    {

                    			newCompositeNode(grammarAccess.getFoodItemAccess().getPerishableItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PerishableItem_0=rulePerishableItem();

                    state._fsp--;


                    			current = this_PerishableItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:385:3: this_NonPerishableItem_1= ruleNonPerishableItem
                    {

                    			newCompositeNode(grammarAccess.getFoodItemAccess().getNonPerishableItemParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonPerishableItem_1=ruleNonPerishableItem();

                    state._fsp--;


                    			current = this_NonPerishableItem_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoodItem"


    // $ANTLR start "entryRuleMovement"
    // InternalGrocery.g:397:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalGrocery.g:397:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalGrocery.g:398:2: iv_ruleMovement= ruleMovement EOF
            {
             newCompositeNode(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalGrocery.g:404:1: ruleMovement returns [EObject current=null] : (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        EObject this_Delivery_0 = null;

        EObject this_Sale_1 = null;

        EObject this_StockMovement_2 = null;



        	enterRule();

        try {
            // InternalGrocery.g:410:2: ( (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement ) )
            // InternalGrocery.g:411:2: (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement )
            {
            // InternalGrocery.g:411:2: (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGrocery.g:412:3: this_Delivery_0= ruleDelivery
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getDeliveryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delivery_0=ruleDelivery();

                    state._fsp--;


                    			current = this_Delivery_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:421:3: this_Sale_1= ruleSale
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getSaleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sale_1=ruleSale();

                    state._fsp--;


                    			current = this_Sale_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGrocery.g:430:3: this_StockMovement_2= ruleStockMovement
                    {

                    			newCompositeNode(grammarAccess.getMovementAccess().getStockMovementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StockMovement_2=ruleStockMovement();

                    state._fsp--;


                    			current = this_StockMovement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleStore"
    // InternalGrocery.g:442:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalGrocery.g:442:46: (iv_ruleStore= ruleStore EOF )
            // InternalGrocery.g:443:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalGrocery.g:449:1: ruleStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:455:2: ( (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:456:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:456:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGrocery.g:457:3: otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalGrocery.g:461:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:462:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:462:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:463:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStoreAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:483:3: ( (otherlv_3= RULE_ID ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrocery.g:484:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGrocery.g:484:4: (otherlv_3= RULE_ID )
            	    // InternalGrocery.g:485:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStoreRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getElementsStoreElementsCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleWarehouse"
    // InternalGrocery.g:504:1: entryRuleWarehouse returns [EObject current=null] : iv_ruleWarehouse= ruleWarehouse EOF ;
    public final EObject entryRuleWarehouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouse = null;


        try {
            // InternalGrocery.g:504:50: (iv_ruleWarehouse= ruleWarehouse EOF )
            // InternalGrocery.g:505:2: iv_ruleWarehouse= ruleWarehouse EOF
            {
             newCompositeNode(grammarAccess.getWarehouseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWarehouse=ruleWarehouse();

            state._fsp--;

             current =iv_ruleWarehouse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWarehouse"


    // $ANTLR start "ruleWarehouse"
    // InternalGrocery.g:511:1: ruleWarehouse returns [EObject current=null] : (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= 'supplier' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleWarehouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_address_5_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:517:2: ( (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= 'supplier' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalGrocery.g:518:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= 'supplier' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalGrocery.g:518:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= 'supplier' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalGrocery.g:519:3: otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) otherlv_6= 'supplier' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWarehouseAccess().getWarehouseKeyword_0());
            		
            // InternalGrocery.g:523:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:524:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:524:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:525:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWarehouseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getWarehouseAccess().getAddressKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getWarehouseAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:553:3: ( (lv_address_5_0= ruleADDRESS ) )
            // InternalGrocery.g:554:4: (lv_address_5_0= ruleADDRESS )
            {
            // InternalGrocery.g:554:4: (lv_address_5_0= ruleADDRESS )
            // InternalGrocery.g:555:5: lv_address_5_0= ruleADDRESS
            {

            					newCompositeNode(grammarAccess.getWarehouseAccess().getAddressADDRESSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_address_5_0=ruleADDRESS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWarehouseRule());
            					}
            					set(
            						current,
            						"address",
            						lv_address_5_0,
            						"org.xtext.project439.Grocery.ADDRESS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getWarehouseAccess().getSupplierKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getWarehouseAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:580:3: ( (otherlv_8= RULE_ID ) )
            // InternalGrocery.g:581:4: (otherlv_8= RULE_ID )
            {
            // InternalGrocery.g:581:4: (otherlv_8= RULE_ID )
            // InternalGrocery.g:582:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWarehouseRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getWarehouseAccess().getSupplierSupplierCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWarehouse"


    // $ANTLR start "entryRuleShelf"
    // InternalGrocery.g:601:1: entryRuleShelf returns [EObject current=null] : iv_ruleShelf= ruleShelf EOF ;
    public final EObject entryRuleShelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShelf = null;


        try {
            // InternalGrocery.g:601:46: (iv_ruleShelf= ruleShelf EOF )
            // InternalGrocery.g:602:2: iv_ruleShelf= ruleShelf EOF
            {
             newCompositeNode(grammarAccess.getShelfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShelf=ruleShelf();

            state._fsp--;

             current =iv_ruleShelf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShelf"


    // $ANTLR start "ruleShelf"
    // InternalGrocery.g:608:1: ruleShelf returns [EObject current=null] : (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleShelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:614:2: ( (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:615:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:615:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGrocery.g:616:3: otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getShelfAccess().getShelfKeyword_0());
            		
            // InternalGrocery.g:620:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:621:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:621:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:622:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getShelfAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShelfRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:642:3: ( (otherlv_3= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGrocery.g:643:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGrocery.g:643:4: (otherlv_3= RULE_ID )
            	    // InternalGrocery.g:644:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getShelfRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getShelfAccess().getItemsItemCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getShelfAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShelf"


    // $ANTLR start "entryRuleBackroom"
    // InternalGrocery.g:663:1: entryRuleBackroom returns [EObject current=null] : iv_ruleBackroom= ruleBackroom EOF ;
    public final EObject entryRuleBackroom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackroom = null;


        try {
            // InternalGrocery.g:663:49: (iv_ruleBackroom= ruleBackroom EOF )
            // InternalGrocery.g:664:2: iv_ruleBackroom= ruleBackroom EOF
            {
             newCompositeNode(grammarAccess.getBackroomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackroom=ruleBackroom();

            state._fsp--;

             current =iv_ruleBackroom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackroom"


    // $ANTLR start "ruleBackroom"
    // InternalGrocery.g:670:1: ruleBackroom returns [EObject current=null] : (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleBackroom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:676:2: ( (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:677:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:677:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGrocery.g:678:3: otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackroomAccess().getBackroomKeyword_0());
            		
            // InternalGrocery.g:682:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:683:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:683:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:684:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBackroomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackroomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:704:3: ( (otherlv_3= RULE_ID ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGrocery.g:705:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGrocery.g:705:4: (otherlv_3= RULE_ID )
            	    // InternalGrocery.g:706:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBackroomRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getBackroomAccess().getItemsItemCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBackroomAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackroom"


    // $ANTLR start "entryRuleNonPerishableItem"
    // InternalGrocery.g:725:1: entryRuleNonPerishableItem returns [EObject current=null] : iv_ruleNonPerishableItem= ruleNonPerishableItem EOF ;
    public final EObject entryRuleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonPerishableItem = null;


        try {
            // InternalGrocery.g:725:58: (iv_ruleNonPerishableItem= ruleNonPerishableItem EOF )
            // InternalGrocery.g:726:2: iv_ruleNonPerishableItem= ruleNonPerishableItem EOF
            {
             newCompositeNode(grammarAccess.getNonPerishableItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonPerishableItem=ruleNonPerishableItem();

            state._fsp--;

             current =iv_ruleNonPerishableItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonPerishableItem"


    // $ANTLR start "ruleNonPerishableItem"
    // InternalGrocery.g:732:1: ruleNonPerishableItem returns [EObject current=null] : (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
    public final EObject ruleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_quantity_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_price_5_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:738:2: ( (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalGrocery.g:739:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalGrocery.g:739:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalGrocery.g:740:3: otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0());
            		
            // InternalGrocery.g:744:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:745:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:745:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:746:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonPerishableItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNonPerishableItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getNonPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:774:3: ( (lv_price_5_0= ruleDECIMAL ) )
            // InternalGrocery.g:775:4: (lv_price_5_0= ruleDECIMAL )
            {
            // InternalGrocery.g:775:4: (lv_price_5_0= ruleDECIMAL )
            // InternalGrocery.g:776:5: lv_price_5_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_price_5_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonPerishableItemRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_5_0,
            						"org.xtext.project439.Grocery.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getNonPerishableItemAccess().getQuantityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getNonPerishableItemAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:801:3: ( (lv_quantity_8_0= RULE_INT ) )
            // InternalGrocery.g:802:4: (lv_quantity_8_0= RULE_INT )
            {
            // InternalGrocery.g:802:4: (lv_quantity_8_0= RULE_INT )
            // InternalGrocery.g:803:5: lv_quantity_8_0= RULE_INT
            {
            lv_quantity_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_quantity_8_0, grammarAccess.getNonPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonPerishableItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonPerishableItem"


    // $ANTLR start "entryRulePerishableItem"
    // InternalGrocery.g:827:1: entryRulePerishableItem returns [EObject current=null] : iv_rulePerishableItem= rulePerishableItem EOF ;
    public final EObject entryRulePerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerishableItem = null;


        try {
            // InternalGrocery.g:827:55: (iv_rulePerishableItem= rulePerishableItem EOF )
            // InternalGrocery.g:828:2: iv_rulePerishableItem= rulePerishableItem EOF
            {
             newCompositeNode(grammarAccess.getPerishableItemRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerishableItem=rulePerishableItem();

            state._fsp--;

             current =iv_rulePerishableItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerishableItem"


    // $ANTLR start "rulePerishableItem"
    // InternalGrocery.g:834:1: rulePerishableItem returns [EObject current=null] : (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' ) ;
    public final EObject rulePerishableItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_quantity_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_price_5_0 = null;

        AntlrDatatypeRuleToken lv_experationDate_11_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:840:2: ( (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' ) )
            // InternalGrocery.g:841:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' )
            {
            // InternalGrocery.g:841:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' )
            // InternalGrocery.g:842:3: otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0());
            		
            // InternalGrocery.g:846:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:847:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:847:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:848:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPerishableItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerishableItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:876:3: ( (lv_price_5_0= ruleDECIMAL ) )
            // InternalGrocery.g:877:4: (lv_price_5_0= ruleDECIMAL )
            {
            // InternalGrocery.g:877:4: (lv_price_5_0= ruleDECIMAL )
            // InternalGrocery.g:878:5: lv_price_5_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_price_5_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPerishableItemRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_5_0,
            						"org.xtext.project439.Grocery.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPerishableItemAccess().getQuantityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getPerishableItemAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:903:3: ( (lv_quantity_8_0= RULE_INT ) )
            // InternalGrocery.g:904:4: (lv_quantity_8_0= RULE_INT )
            {
            // InternalGrocery.g:904:4: (lv_quantity_8_0= RULE_INT )
            // InternalGrocery.g:905:5: lv_quantity_8_0= RULE_INT
            {
            lv_quantity_8_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_quantity_8_0, grammarAccess.getPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerishableItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getPerishableItemAccess().getExperationDateKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getPerishableItemAccess().getColonKeyword_10());
            		
            // InternalGrocery.g:929:3: ( (lv_experationDate_11_0= ruleDATE ) )
            // InternalGrocery.g:930:4: (lv_experationDate_11_0= ruleDATE )
            {
            // InternalGrocery.g:930:4: (lv_experationDate_11_0= ruleDATE )
            // InternalGrocery.g:931:5: lv_experationDate_11_0= ruleDATE
            {

            					newCompositeNode(grammarAccess.getPerishableItemAccess().getExperationDateDATEParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_experationDate_11_0=ruleDATE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPerishableItemRule());
            					}
            					set(
            						current,
            						"experationDate",
            						lv_experationDate_11_0,
            						"org.xtext.project439.Grocery.DATE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerishableItem"


    // $ANTLR start "entryRuleNonFoodItem"
    // InternalGrocery.g:956:1: entryRuleNonFoodItem returns [EObject current=null] : iv_ruleNonFoodItem= ruleNonFoodItem EOF ;
    public final EObject entryRuleNonFoodItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFoodItem = null;


        try {
            // InternalGrocery.g:956:52: (iv_ruleNonFoodItem= ruleNonFoodItem EOF )
            // InternalGrocery.g:957:2: iv_ruleNonFoodItem= ruleNonFoodItem EOF
            {
             newCompositeNode(grammarAccess.getNonFoodItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonFoodItem=ruleNonFoodItem();

            state._fsp--;

             current =iv_ruleNonFoodItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonFoodItem"


    // $ANTLR start "ruleNonFoodItem"
    // InternalGrocery.g:963:1: ruleNonFoodItem returns [EObject current=null] : (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
    public final EObject ruleNonFoodItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_quantity_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_price_5_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:969:2: ( (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalGrocery.g:970:2: (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalGrocery.g:970:2: (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalGrocery.g:971:3: otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNonFoodItemAccess().getNonFoodItemKeyword_0());
            		
            // InternalGrocery.g:975:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:976:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:976:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:977:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNonFoodItemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonFoodItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNonFoodItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getNonFoodItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getNonFoodItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1005:3: ( (lv_price_5_0= ruleDECIMAL ) )
            // InternalGrocery.g:1006:4: (lv_price_5_0= ruleDECIMAL )
            {
            // InternalGrocery.g:1006:4: (lv_price_5_0= ruleDECIMAL )
            // InternalGrocery.g:1007:5: lv_price_5_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getNonFoodItemAccess().getPriceDECIMALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_13);
            lv_price_5_0=ruleDECIMAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonFoodItemRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_5_0,
            						"org.xtext.project439.Grocery.DECIMAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getNonFoodItemAccess().getQuantityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getNonFoodItemAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:1032:3: ( (lv_quantity_8_0= RULE_INT ) )
            // InternalGrocery.g:1033:4: (lv_quantity_8_0= RULE_INT )
            {
            // InternalGrocery.g:1033:4: (lv_quantity_8_0= RULE_INT )
            // InternalGrocery.g:1034:5: lv_quantity_8_0= RULE_INT
            {
            lv_quantity_8_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_quantity_8_0, grammarAccess.getNonFoodItemAccess().getQuantityINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonFoodItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getNonFoodItemAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonFoodItem"


    // $ANTLR start "entryRuleDriver"
    // InternalGrocery.g:1058:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // InternalGrocery.g:1058:47: (iv_ruleDriver= ruleDriver EOF )
            // InternalGrocery.g:1059:2: iv_ruleDriver= ruleDriver EOF
            {
             newCompositeNode(grammarAccess.getDriverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDriver=ruleDriver();

            state._fsp--;

             current =iv_ruleDriver; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDriver"


    // $ANTLR start "ruleDriver"
    // InternalGrocery.g:1065:1: ruleDriver returns [EObject current=null] : (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_driverName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGrocery.g:1071:2: ( (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1072:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1072:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1073:3: otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDriverAccess().getDriverKeyword_0());
            		
            // InternalGrocery.g:1077:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1078:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1078:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1079:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDriverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getDriverAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1107:3: ( (lv_driverName_5_0= RULE_STRING ) )
            // InternalGrocery.g:1108:4: (lv_driverName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1108:4: (lv_driverName_5_0= RULE_STRING )
            // InternalGrocery.g:1109:5: lv_driverName_5_0= RULE_STRING
            {
            lv_driverName_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_driverName_5_0, grammarAccess.getDriverAccess().getDriverNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDriverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"driverName",
            						lv_driverName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGrocery.g:1125:3: ( (otherlv_6= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGrocery.g:1126:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1126:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1127:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDriverRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getDriverAccess().getVehicleVehicleCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDriver"


    // $ANTLR start "entryRuleEmployee"
    // InternalGrocery.g:1146:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalGrocery.g:1146:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalGrocery.g:1147:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalGrocery.g:1153:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_employeeName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGrocery.g:1159:2: ( (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1160:2: (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1160:2: (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1161:3: otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalGrocery.g:1165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1166:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1167:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEmployeeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1195:3: ( (lv_employeeName_5_0= RULE_STRING ) )
            // InternalGrocery.g:1196:4: (lv_employeeName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1196:4: (lv_employeeName_5_0= RULE_STRING )
            // InternalGrocery.g:1197:5: lv_employeeName_5_0= RULE_STRING
            {
            lv_employeeName_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_employeeName_5_0, grammarAccess.getEmployeeAccess().getEmployeeNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"employeeName",
            						lv_employeeName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGrocery.g:1213:3: ( (otherlv_6= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGrocery.g:1214:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1214:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1215:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEmployeeRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getEmployeeAccess().getStockMovementStockMovementCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleCustomer"
    // InternalGrocery.g:1234:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalGrocery.g:1234:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalGrocery.g:1235:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalGrocery.g:1241:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_customerName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGrocery.g:1247:2: ( (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1248:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1248:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1249:3: otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalGrocery.g:1253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1254:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1283:3: ( (lv_customerName_5_0= RULE_STRING ) )
            // InternalGrocery.g:1284:4: (lv_customerName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1284:4: (lv_customerName_5_0= RULE_STRING )
            // InternalGrocery.g:1285:5: lv_customerName_5_0= RULE_STRING
            {
            lv_customerName_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_customerName_5_0, grammarAccess.getCustomerAccess().getCustomerNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customerName",
            						lv_customerName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGrocery.g:1301:3: ( (otherlv_6= RULE_ID ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGrocery.g:1302:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1302:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1303:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCustomerRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getCustomerAccess().getSaleSaleCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleSupplier"
    // InternalGrocery.g:1322:1: entryRuleSupplier returns [EObject current=null] : iv_ruleSupplier= ruleSupplier EOF ;
    public final EObject entryRuleSupplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplier = null;


        try {
            // InternalGrocery.g:1322:49: (iv_ruleSupplier= ruleSupplier EOF )
            // InternalGrocery.g:1323:2: iv_ruleSupplier= ruleSupplier EOF
            {
             newCompositeNode(grammarAccess.getSupplierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupplier=ruleSupplier();

            state._fsp--;

             current =iv_ruleSupplier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSupplier"


    // $ANTLR start "ruleSupplier"
    // InternalGrocery.g:1329:1: ruleSupplier returns [EObject current=null] : (otherlv_0= 'supplier' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleSupplier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:1335:2: ( (otherlv_0= 'supplier' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:1336:2: (otherlv_0= 'supplier' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:1336:2: (otherlv_0= 'supplier' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGrocery.g:1337:3: otherlv_0= 'supplier' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSupplierAccess().getSupplierKeyword_0());
            		
            // InternalGrocery.g:1341:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1342:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1342:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1343:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSupplierAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSupplierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSupplierAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:1363:3: ( (otherlv_3= RULE_ID ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGrocery.g:1364:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGrocery.g:1364:4: (otherlv_3= RULE_ID )
            	    // InternalGrocery.g:1365:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSupplierRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSupplierAccess().getItemsItemCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSupplierAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupplier"


    // $ANTLR start "entryRuleVehicle"
    // InternalGrocery.g:1384:1: entryRuleVehicle returns [EObject current=null] : iv_ruleVehicle= ruleVehicle EOF ;
    public final EObject entryRuleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicle = null;


        try {
            // InternalGrocery.g:1384:48: (iv_ruleVehicle= ruleVehicle EOF )
            // InternalGrocery.g:1385:2: iv_ruleVehicle= ruleVehicle EOF
            {
             newCompositeNode(grammarAccess.getVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVehicle=ruleVehicle();

            state._fsp--;

             current =iv_ruleVehicle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVehicle"


    // $ANTLR start "ruleVehicle"
    // InternalGrocery.g:1391:1: ruleVehicle returns [EObject current=null] : (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_plateNumber_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGrocery.g:1397:2: ( (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1398:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1398:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1399:3: otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVehicleAccess().getVehicleKeyword_0());
            		
            // InternalGrocery.g:1403:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1404:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1404:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1405:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVehicleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getVehicleAccess().getPlateNumberKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getVehicleAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1433:3: ( (lv_plateNumber_5_0= RULE_STRING ) )
            // InternalGrocery.g:1434:4: (lv_plateNumber_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1434:4: (lv_plateNumber_5_0= RULE_STRING )
            // InternalGrocery.g:1435:5: lv_plateNumber_5_0= RULE_STRING
            {
            lv_plateNumber_5_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_plateNumber_5_0, grammarAccess.getVehicleAccess().getPlateNumberSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVehicleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"plateNumber",
            						lv_plateNumber_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGrocery.g:1451:3: ( (otherlv_6= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGrocery.g:1452:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1452:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1453:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVehicleRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getVehicleAccess().getItemsItemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVehicle"


    // $ANTLR start "entryRuleDelivery"
    // InternalGrocery.g:1472:1: entryRuleDelivery returns [EObject current=null] : iv_ruleDelivery= ruleDelivery EOF ;
    public final EObject entryRuleDelivery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelivery = null;


        try {
            // InternalGrocery.g:1472:49: (iv_ruleDelivery= ruleDelivery EOF )
            // InternalGrocery.g:1473:2: iv_ruleDelivery= ruleDelivery EOF
            {
             newCompositeNode(grammarAccess.getDeliveryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelivery=ruleDelivery();

            state._fsp--;

             current =iv_ruleDelivery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelivery"


    // $ANTLR start "ruleDelivery"
    // InternalGrocery.g:1479:1: ruleDelivery returns [EObject current=null] : (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ;
    public final EObject ruleDelivery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGrocery.g:1485:2: ( (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) )
            // InternalGrocery.g:1486:2: (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            {
            // InternalGrocery.g:1486:2: (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalGrocery.g:1487:3: otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeliveryAccess().getDeliveryKeyword_0());
            		
            // InternalGrocery.g:1491:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1492:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1492:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1493:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeliveryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDeliveryAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDeliveryAccess().getWarehouseKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDeliveryAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1521:3: ( (otherlv_5= RULE_ID ) )
            // InternalGrocery.g:1522:4: (otherlv_5= RULE_ID )
            {
            // InternalGrocery.g:1522:4: (otherlv_5= RULE_ID )
            // InternalGrocery.g:1523:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_5, grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getDeliveryAccess().getStoreKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getDeliveryAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:1542:3: ( (otherlv_8= RULE_ID ) )
            // InternalGrocery.g:1543:4: (otherlv_8= RULE_ID )
            {
            // InternalGrocery.g:1543:4: (otherlv_8= RULE_ID )
            // InternalGrocery.g:1544:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_8, grammarAccess.getDeliveryAccess().getToStoreStoreCrossReference_8_0());
            				

            }


            }

            // InternalGrocery.g:1555:3: ( (otherlv_9= RULE_ID ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGrocery.g:1556:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGrocery.g:1556:4: (otherlv_9= RULE_ID )
            	    // InternalGrocery.g:1557:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_9, grammarAccess.getDeliveryAccess().getItemsItemCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDeliveryAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelivery"


    // $ANTLR start "entryRuleSale"
    // InternalGrocery.g:1576:1: entryRuleSale returns [EObject current=null] : iv_ruleSale= ruleSale EOF ;
    public final EObject entryRuleSale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSale = null;


        try {
            // InternalGrocery.g:1576:45: (iv_ruleSale= ruleSale EOF )
            // InternalGrocery.g:1577:2: iv_ruleSale= ruleSale EOF
            {
             newCompositeNode(grammarAccess.getSaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSale=ruleSale();

            state._fsp--;

             current =iv_ruleSale; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSale"


    // $ANTLR start "ruleSale"
    // InternalGrocery.g:1583:1: ruleSale returns [EObject current=null] : (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleSale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGrocery.g:1589:2: ( (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1590:2: (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1590:2: (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1591:3: otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSaleAccess().getSaleKeyword_0());
            		
            // InternalGrocery.g:1595:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1596:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1596:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1597:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSaleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getSaleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSaleAccess().getShelfKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSaleAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1625:3: ( (otherlv_5= RULE_ID ) )
            // InternalGrocery.g:1626:4: (otherlv_5= RULE_ID )
            {
            // InternalGrocery.g:1626:4: (otherlv_5= RULE_ID )
            // InternalGrocery.g:1627:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_5, grammarAccess.getSaleAccess().getFromShelfShelfCrossReference_5_0());
            				

            }


            }

            // InternalGrocery.g:1638:3: ( (otherlv_6= RULE_ID ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGrocery.g:1639:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1639:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1640:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSaleRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSaleAccess().getItemsItemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSaleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSale"


    // $ANTLR start "entryRuleStockMovement"
    // InternalGrocery.g:1659:1: entryRuleStockMovement returns [EObject current=null] : iv_ruleStockMovement= ruleStockMovement EOF ;
    public final EObject entryRuleStockMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStockMovement = null;


        try {
            // InternalGrocery.g:1659:54: (iv_ruleStockMovement= ruleStockMovement EOF )
            // InternalGrocery.g:1660:2: iv_ruleStockMovement= ruleStockMovement EOF
            {
             newCompositeNode(grammarAccess.getStockMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStockMovement=ruleStockMovement();

            state._fsp--;

             current =iv_ruleStockMovement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStockMovement"


    // $ANTLR start "ruleStockMovement"
    // InternalGrocery.g:1666:1: ruleStockMovement returns [EObject current=null] : (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ;
    public final EObject ruleStockMovement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGrocery.g:1672:2: ( (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) )
            // InternalGrocery.g:1673:2: (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            {
            // InternalGrocery.g:1673:2: (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalGrocery.g:1674:3: otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStockMovementAccess().getStockKeyword_0());
            		
            // InternalGrocery.g:1678:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1679:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1679:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1680:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStockMovementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStockMovementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getStockMovementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getStockMovementAccess().getBackroomKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getStockMovementAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1708:3: ( (otherlv_5= RULE_ID ) )
            // InternalGrocery.g:1709:4: (otherlv_5= RULE_ID )
            {
            // InternalGrocery.g:1709:4: (otherlv_5= RULE_ID )
            // InternalGrocery.g:1710:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStockMovementRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_5, grammarAccess.getStockMovementAccess().getFromBackroomBackroomCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getStockMovementAccess().getShelfKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getStockMovementAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:1729:3: ( (otherlv_8= RULE_ID ) )
            // InternalGrocery.g:1730:4: (otherlv_8= RULE_ID )
            {
            // InternalGrocery.g:1730:4: (otherlv_8= RULE_ID )
            // InternalGrocery.g:1731:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStockMovementRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_8, grammarAccess.getStockMovementAccess().getToShelfShelfCrossReference_8_0());
            				

            }


            }

            // InternalGrocery.g:1742:3: ( (otherlv_9= RULE_ID ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGrocery.g:1743:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGrocery.g:1743:4: (otherlv_9= RULE_ID )
            	    // InternalGrocery.g:1744:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStockMovementRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(otherlv_9, grammarAccess.getStockMovementAccess().getItemsItemCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStockMovementAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStockMovement"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGrocery.g:1763:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalGrocery.g:1763:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalGrocery.g:1764:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalGrocery.g:1770:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGrocery.g:1776:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalGrocery.g:1777:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGrocery.g:1777:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalGrocery.g:1778:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,35,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleDATE"
    // InternalGrocery.g:1801:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalGrocery.g:1801:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalGrocery.g:1802:2: iv_ruleDATE= ruleDATE EOF
            {
             newCompositeNode(grammarAccess.getDATERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDATE=ruleDATE();

            state._fsp--;

             current =iv_ruleDATE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalGrocery.g:1808:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:1814:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalGrocery.g:1815:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalGrocery.g:1815:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalGrocery.g:1816:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,36,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_23); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,36,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDATEAccess().getINTTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleADDRESS"
    // InternalGrocery.g:1851:1: entryRuleADDRESS returns [String current=null] : iv_ruleADDRESS= ruleADDRESS EOF ;
    public final String entryRuleADDRESS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDRESS = null;


        try {
            // InternalGrocery.g:1851:47: (iv_ruleADDRESS= ruleADDRESS EOF )
            // InternalGrocery.g:1852:2: iv_ruleADDRESS= ruleADDRESS EOF
            {
             newCompositeNode(grammarAccess.getADDRESSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADDRESS=ruleADDRESS();

            state._fsp--;

             current =iv_ruleADDRESS.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADDRESS"


    // $ANTLR start "ruleADDRESS"
    // InternalGrocery.g:1858:1: ruleADDRESS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleADDRESS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token kw=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalGrocery.g:1864:2: ( (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) )
            // InternalGrocery.g:1865:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            {
            // InternalGrocery.g:1865:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            // InternalGrocery.g:1866:3: this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_24); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1());
            		
            kw=(Token)match(input,37,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getADDRESSAccess().getCommaKeyword_2());
            		
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			current.merge(this_STRING_3);
            		

            			newLeafNode(this_STRING_3, grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADDRESS"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000007769E4802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});

}
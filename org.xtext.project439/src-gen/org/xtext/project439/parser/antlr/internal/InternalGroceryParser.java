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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'warehouse'", "'address'", "':'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'price'", "'quantity'", "'perishableItem'", "'experationDate'", "'nonFoodItem'", "'driver'", "'name'", "'employee'", "'customer'", "'vehicle'", "'plateNumber'", "'delivery'", "'sale'", "'stock'", "'.'", "'/'", "','"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
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
    // InternalGrocery.g:71:1: ruleGrocery returns [EObject current=null] : ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleMovementElement ) )* ( (lv_elements_2_0= ruleMovement ) )* ( (lv_elements_3_0= ruleItem ) )* ( (lv_elements_4_0= ruleStoreElements ) )* ) ;
    public final EObject ruleGrocery() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:77:2: ( ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleMovementElement ) )* ( (lv_elements_2_0= ruleMovement ) )* ( (lv_elements_3_0= ruleItem ) )* ( (lv_elements_4_0= ruleStoreElements ) )* ) )
            // InternalGrocery.g:78:2: ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleMovementElement ) )* ( (lv_elements_2_0= ruleMovement ) )* ( (lv_elements_3_0= ruleItem ) )* ( (lv_elements_4_0= ruleStoreElements ) )* )
            {
            // InternalGrocery.g:78:2: ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleMovementElement ) )* ( (lv_elements_2_0= ruleMovement ) )* ( (lv_elements_3_0= ruleItem ) )* ( (lv_elements_4_0= ruleStoreElements ) )* )
            // InternalGrocery.g:79:3: ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleMovementElement ) )* ( (lv_elements_2_0= ruleMovement ) )* ( (lv_elements_3_0= ruleItem ) )* ( (lv_elements_4_0= ruleStoreElements ) )*
            {
            // InternalGrocery.g:79:3: ( (lv_elements_0_0= ruleBuilding ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGrocery.g:80:4: (lv_elements_0_0= ruleBuilding )
            	    {
            	    // InternalGrocery.g:80:4: (lv_elements_0_0= ruleBuilding )
            	    // InternalGrocery.g:81:5: lv_elements_0_0= ruleBuilding
            	    {

            	    					newCompositeNode(grammarAccess.getGroceryAccess().getElementsBuildingParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleBuilding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroceryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_0_0,
            	    						"org.xtext.project439.Grocery.Building");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGrocery.g:98:3: ( (lv_elements_1_0= ruleMovementElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25||(LA2_0>=27 && LA2_0<=29)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGrocery.g:99:4: (lv_elements_1_0= ruleMovementElement )
            	    {
            	    // InternalGrocery.g:99:4: (lv_elements_1_0= ruleMovementElement )
            	    // InternalGrocery.g:100:5: lv_elements_1_0= ruleMovementElement
            	    {

            	    					newCompositeNode(grammarAccess.getGroceryAccess().getElementsMovementElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_1_0=ruleMovementElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroceryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"org.xtext.project439.Grocery.MovementElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGrocery.g:117:3: ( (lv_elements_2_0= ruleMovement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=31 && LA3_0<=33)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGrocery.g:118:4: (lv_elements_2_0= ruleMovement )
            	    {
            	    // InternalGrocery.g:118:4: (lv_elements_2_0= ruleMovement )
            	    // InternalGrocery.g:119:5: lv_elements_2_0= ruleMovement
            	    {

            	    					newCompositeNode(grammarAccess.getGroceryAccess().getElementsMovementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_2_0=ruleMovement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroceryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.project439.Grocery.Movement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalGrocery.g:136:3: ( (lv_elements_3_0= ruleItem ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==22||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGrocery.g:137:4: (lv_elements_3_0= ruleItem )
            	    {
            	    // InternalGrocery.g:137:4: (lv_elements_3_0= ruleItem )
            	    // InternalGrocery.g:138:5: lv_elements_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getGroceryAccess().getElementsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroceryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.project439.Grocery.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGrocery.g:155:3: ( (lv_elements_4_0= ruleStoreElements ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrocery.g:156:4: (lv_elements_4_0= ruleStoreElements )
            	    {
            	    // InternalGrocery.g:156:4: (lv_elements_4_0= ruleStoreElements )
            	    // InternalGrocery.g:157:5: lv_elements_4_0= ruleStoreElements
            	    {

            	    					newCompositeNode(grammarAccess.getGroceryAccess().getElementsStoreElementsParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_4_0=ruleStoreElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroceryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.project439.Grocery.StoreElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleGrocery"


    // $ANTLR start "entryRuleBuilding"
    // InternalGrocery.g:178:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // InternalGrocery.g:178:49: (iv_ruleBuilding= ruleBuilding EOF )
            // InternalGrocery.g:179:2: iv_ruleBuilding= ruleBuilding EOF
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
    // InternalGrocery.g:185:1: ruleBuilding returns [EObject current=null] : (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse ) ;
    public final EObject ruleBuilding() throws RecognitionException {
        EObject current = null;

        EObject this_Store_0 = null;

        EObject this_Warehouse_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:191:2: ( (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse ) )
            // InternalGrocery.g:192:2: (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse )
            {
            // InternalGrocery.g:192:2: (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGrocery.g:193:3: this_Store_0= ruleStore
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
                    // InternalGrocery.g:202:3: this_Warehouse_1= ruleWarehouse
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
    // InternalGrocery.g:214:1: entryRuleStoreElements returns [EObject current=null] : iv_ruleStoreElements= ruleStoreElements EOF ;
    public final EObject entryRuleStoreElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreElements = null;


        try {
            // InternalGrocery.g:214:54: (iv_ruleStoreElements= ruleStoreElements EOF )
            // InternalGrocery.g:215:2: iv_ruleStoreElements= ruleStoreElements EOF
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
    // InternalGrocery.g:221:1: ruleStoreElements returns [EObject current=null] : (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf ) ;
    public final EObject ruleStoreElements() throws RecognitionException {
        EObject current = null;

        EObject this_Backroom_0 = null;

        EObject this_Shelf_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:227:2: ( (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf ) )
            // InternalGrocery.g:228:2: (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf )
            {
            // InternalGrocery.g:228:2: (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGrocery.g:229:3: this_Backroom_0= ruleBackroom
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
                    // InternalGrocery.g:238:3: this_Shelf_1= ruleShelf
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
    // InternalGrocery.g:250:1: entryRuleMovementElement returns [EObject current=null] : iv_ruleMovementElement= ruleMovementElement EOF ;
    public final EObject entryRuleMovementElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovementElement = null;


        try {
            // InternalGrocery.g:250:56: (iv_ruleMovementElement= ruleMovementElement EOF )
            // InternalGrocery.g:251:2: iv_ruleMovementElement= ruleMovementElement EOF
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
    // InternalGrocery.g:257:1: ruleMovementElement returns [EObject current=null] : (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle ) ;
    public final EObject ruleMovementElement() throws RecognitionException {
        EObject current = null;

        EObject this_Person_0 = null;

        EObject this_Vehicle_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:263:2: ( (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle ) )
            // InternalGrocery.g:264:2: (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle )
            {
            // InternalGrocery.g:264:2: (this_Person_0= rulePerson | this_Vehicle_1= ruleVehicle )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25||(LA8_0>=27 && LA8_0<=28)) ) {
                alt8=1;
            }
            else if ( (LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGrocery.g:265:3: this_Person_0= rulePerson
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
                    // InternalGrocery.g:274:3: this_Vehicle_1= ruleVehicle
                    {

                    			newCompositeNode(grammarAccess.getMovementElementAccess().getVehicleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vehicle_1=ruleVehicle();

                    state._fsp--;


                    			current = this_Vehicle_1;
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
    // InternalGrocery.g:286:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalGrocery.g:286:47: (iv_rulePerson= rulePerson EOF )
            // InternalGrocery.g:287:2: iv_rulePerson= rulePerson EOF
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
    // InternalGrocery.g:293:1: rulePerson returns [EObject current=null] : (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Driver_0 = null;

        EObject this_Employee_1 = null;

        EObject this_Customer_2 = null;



        	enterRule();

        try {
            // InternalGrocery.g:299:2: ( (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer ) )
            // InternalGrocery.g:300:2: (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer )
            {
            // InternalGrocery.g:300:2: (this_Driver_0= ruleDriver | this_Employee_1= ruleEmployee | this_Customer_2= ruleCustomer )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
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
                    // InternalGrocery.g:301:3: this_Driver_0= ruleDriver
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
                    // InternalGrocery.g:310:3: this_Employee_1= ruleEmployee
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
                    // InternalGrocery.g:319:3: this_Customer_2= ruleCustomer
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
    // InternalGrocery.g:331:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalGrocery.g:331:45: (iv_ruleItem= ruleItem EOF )
            // InternalGrocery.g:332:2: iv_ruleItem= ruleItem EOF
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
    // InternalGrocery.g:338:1: ruleItem returns [EObject current=null] : (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_FoodItem_0 = null;

        EObject this_NonFoodItem_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:344:2: ( (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem ) )
            // InternalGrocery.g:345:2: (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem )
            {
            // InternalGrocery.g:345:2: (this_FoodItem_0= ruleFoodItem | this_NonFoodItem_1= ruleNonFoodItem )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19||LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGrocery.g:346:3: this_FoodItem_0= ruleFoodItem
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
                    // InternalGrocery.g:355:3: this_NonFoodItem_1= ruleNonFoodItem
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
    // InternalGrocery.g:367:1: entryRuleFoodItem returns [EObject current=null] : iv_ruleFoodItem= ruleFoodItem EOF ;
    public final EObject entryRuleFoodItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodItem = null;


        try {
            // InternalGrocery.g:367:49: (iv_ruleFoodItem= ruleFoodItem EOF )
            // InternalGrocery.g:368:2: iv_ruleFoodItem= ruleFoodItem EOF
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
    // InternalGrocery.g:374:1: ruleFoodItem returns [EObject current=null] : (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) ;
    public final EObject ruleFoodItem() throws RecognitionException {
        EObject current = null;

        EObject this_PerishableItem_0 = null;

        EObject this_NonPerishableItem_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:380:2: ( (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) )
            // InternalGrocery.g:381:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            {
            // InternalGrocery.g:381:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalGrocery.g:382:3: this_PerishableItem_0= rulePerishableItem
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
                    // InternalGrocery.g:391:3: this_NonPerishableItem_1= ruleNonPerishableItem
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
    // InternalGrocery.g:403:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;


        try {
            // InternalGrocery.g:403:49: (iv_ruleMovement= ruleMovement EOF )
            // InternalGrocery.g:404:2: iv_ruleMovement= ruleMovement EOF
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
    // InternalGrocery.g:410:1: ruleMovement returns [EObject current=null] : (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        EObject this_Delivery_0 = null;

        EObject this_Sale_1 = null;

        EObject this_StockMovement_2 = null;



        	enterRule();

        try {
            // InternalGrocery.g:416:2: ( (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement ) )
            // InternalGrocery.g:417:2: (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement )
            {
            // InternalGrocery.g:417:2: (this_Delivery_0= ruleDelivery | this_Sale_1= ruleSale | this_StockMovement_2= ruleStockMovement )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalGrocery.g:418:3: this_Delivery_0= ruleDelivery
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
                    // InternalGrocery.g:427:3: this_Sale_1= ruleSale
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
                    // InternalGrocery.g:436:3: this_StockMovement_2= ruleStockMovement
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
    // InternalGrocery.g:448:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalGrocery.g:448:46: (iv_ruleStore= ruleStore EOF )
            // InternalGrocery.g:449:2: iv_ruleStore= ruleStore EOF
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
    // InternalGrocery.g:455:1: ruleStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:461:2: ( (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:462:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:462:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGrocery.g:463:3: otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalGrocery.g:467:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:468:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:468:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:469:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:489:3: ( (otherlv_3= RULE_ID ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGrocery.g:490:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGrocery.g:490:4: (otherlv_3= RULE_ID )
            	    // InternalGrocery.g:491:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStoreRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getElementsStoreElementsCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalGrocery.g:510:1: entryRuleWarehouse returns [EObject current=null] : iv_ruleWarehouse= ruleWarehouse EOF ;
    public final EObject entryRuleWarehouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouse = null;


        try {
            // InternalGrocery.g:510:50: (iv_ruleWarehouse= ruleWarehouse EOF )
            // InternalGrocery.g:511:2: iv_ruleWarehouse= ruleWarehouse EOF
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
    // InternalGrocery.g:517:1: ruleWarehouse returns [EObject current=null] : (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
    public final EObject ruleWarehouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_address_5_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:523:2: ( (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:524:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:524:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:525:3: otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWarehouseAccess().getWarehouseKeyword_0());
            		
            // InternalGrocery.g:529:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:530:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:530:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:531:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getWarehouseAccess().getAddressKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getWarehouseAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:559:3: ( (lv_address_5_0= ruleADDRESS ) )
            // InternalGrocery.g:560:4: (lv_address_5_0= ruleADDRESS )
            {
            // InternalGrocery.g:560:4: (lv_address_5_0= ruleADDRESS )
            // InternalGrocery.g:561:5: lv_address_5_0= ruleADDRESS
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

            // InternalGrocery.g:578:3: ( (otherlv_6= RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGrocery.g:579:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:579:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:580:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getWarehouseRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_6, grammarAccess.getWarehouseAccess().getItemsItemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGrocery.g:599:1: entryRuleShelf returns [EObject current=null] : iv_ruleShelf= ruleShelf EOF ;
    public final EObject entryRuleShelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShelf = null;


        try {
            // InternalGrocery.g:599:46: (iv_ruleShelf= ruleShelf EOF )
            // InternalGrocery.g:600:2: iv_ruleShelf= ruleShelf EOF
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
    // InternalGrocery.g:606:1: ruleShelf returns [EObject current=null] : (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleShelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:612:2: ( (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:613:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:613:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGrocery.g:614:3: otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getShelfAccess().getShelfKeyword_0());
            		
            // InternalGrocery.g:618:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:619:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:619:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:620:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:640:3: ( (otherlv_3= RULE_ID ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGrocery.g:641:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGrocery.g:641:4: (otherlv_3= RULE_ID )
            	    // InternalGrocery.g:642:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getShelfRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getShelfAccess().getItemsItemCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalGrocery.g:661:1: entryRuleBackroom returns [EObject current=null] : iv_ruleBackroom= ruleBackroom EOF ;
    public final EObject entryRuleBackroom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackroom = null;


        try {
            // InternalGrocery.g:661:49: (iv_ruleBackroom= ruleBackroom EOF )
            // InternalGrocery.g:662:2: iv_ruleBackroom= ruleBackroom EOF
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
    // InternalGrocery.g:668:1: ruleBackroom returns [EObject current=null] : (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleBackroom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:674:2: ( (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:675:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:675:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )
            // InternalGrocery.g:676:3: otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBackroomAccess().getBackroomKeyword_0());
            		
            // InternalGrocery.g:680:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:681:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:681:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:682:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:702:3: ( (otherlv_3= RULE_ID ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGrocery.g:703:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalGrocery.g:703:4: (otherlv_3= RULE_ID )
            	    // InternalGrocery.g:704:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getBackroomRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_3, grammarAccess.getBackroomAccess().getItemsItemCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalGrocery.g:723:1: entryRuleNonPerishableItem returns [EObject current=null] : iv_ruleNonPerishableItem= ruleNonPerishableItem EOF ;
    public final EObject entryRuleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonPerishableItem = null;


        try {
            // InternalGrocery.g:723:58: (iv_ruleNonPerishableItem= ruleNonPerishableItem EOF )
            // InternalGrocery.g:724:2: iv_ruleNonPerishableItem= ruleNonPerishableItem EOF
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
    // InternalGrocery.g:730:1: ruleNonPerishableItem returns [EObject current=null] : (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
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
            // InternalGrocery.g:736:2: ( (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalGrocery.g:737:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalGrocery.g:737:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalGrocery.g:738:3: otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0());
            		
            // InternalGrocery.g:742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:743:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getNonPerishableItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getNonPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:772:3: ( (lv_price_5_0= ruleDECIMAL ) )
            // InternalGrocery.g:773:4: (lv_price_5_0= ruleDECIMAL )
            {
            // InternalGrocery.g:773:4: (lv_price_5_0= ruleDECIMAL )
            // InternalGrocery.g:774:5: lv_price_5_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getNonPerishableItemAccess().getQuantityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getNonPerishableItemAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:799:3: ( (lv_quantity_8_0= RULE_INT ) )
            // InternalGrocery.g:800:4: (lv_quantity_8_0= RULE_INT )
            {
            // InternalGrocery.g:800:4: (lv_quantity_8_0= RULE_INT )
            // InternalGrocery.g:801:5: lv_quantity_8_0= RULE_INT
            {
            lv_quantity_8_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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
    // InternalGrocery.g:825:1: entryRulePerishableItem returns [EObject current=null] : iv_rulePerishableItem= rulePerishableItem EOF ;
    public final EObject entryRulePerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerishableItem = null;


        try {
            // InternalGrocery.g:825:55: (iv_rulePerishableItem= rulePerishableItem EOF )
            // InternalGrocery.g:826:2: iv_rulePerishableItem= rulePerishableItem EOF
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
    // InternalGrocery.g:832:1: rulePerishableItem returns [EObject current=null] : (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' ) ;
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
            // InternalGrocery.g:838:2: ( (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' ) )
            // InternalGrocery.g:839:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' )
            {
            // InternalGrocery.g:839:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}' )
            // InternalGrocery.g:840:3: otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= 'experationDate' otherlv_10= ':' ( (lv_experationDate_11_0= ruleDATE ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0());
            		
            // InternalGrocery.g:844:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:845:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:845:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:846:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:874:3: ( (lv_price_5_0= ruleDECIMAL ) )
            // InternalGrocery.g:875:4: (lv_price_5_0= ruleDECIMAL )
            {
            // InternalGrocery.g:875:4: (lv_price_5_0= ruleDECIMAL )
            // InternalGrocery.g:876:5: lv_price_5_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getPerishableItemAccess().getQuantityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPerishableItemAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:901:3: ( (lv_quantity_8_0= RULE_INT ) )
            // InternalGrocery.g:902:4: (lv_quantity_8_0= RULE_INT )
            {
            // InternalGrocery.g:902:4: (lv_quantity_8_0= RULE_INT )
            // InternalGrocery.g:903:5: lv_quantity_8_0= RULE_INT
            {
            lv_quantity_8_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            otherlv_9=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getPerishableItemAccess().getExperationDateKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getPerishableItemAccess().getColonKeyword_10());
            		
            // InternalGrocery.g:927:3: ( (lv_experationDate_11_0= ruleDATE ) )
            // InternalGrocery.g:928:4: (lv_experationDate_11_0= ruleDATE )
            {
            // InternalGrocery.g:928:4: (lv_experationDate_11_0= ruleDATE )
            // InternalGrocery.g:929:5: lv_experationDate_11_0= ruleDATE
            {

            					newCompositeNode(grammarAccess.getPerishableItemAccess().getExperationDateDATEParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:954:1: entryRuleNonFoodItem returns [EObject current=null] : iv_ruleNonFoodItem= ruleNonFoodItem EOF ;
    public final EObject entryRuleNonFoodItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonFoodItem = null;


        try {
            // InternalGrocery.g:954:52: (iv_ruleNonFoodItem= ruleNonFoodItem EOF )
            // InternalGrocery.g:955:2: iv_ruleNonFoodItem= ruleNonFoodItem EOF
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
    // InternalGrocery.g:961:1: ruleNonFoodItem returns [EObject current=null] : (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
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
            // InternalGrocery.g:967:2: ( (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalGrocery.g:968:2: (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalGrocery.g:968:2: (otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalGrocery.g:969:3: otherlv_0= 'nonFoodItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNonFoodItemAccess().getNonFoodItemKeyword_0());
            		
            // InternalGrocery.g:973:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:974:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:974:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:975:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getNonFoodItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNonFoodItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getNonFoodItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1003:3: ( (lv_price_5_0= ruleDECIMAL ) )
            // InternalGrocery.g:1004:4: (lv_price_5_0= ruleDECIMAL )
            {
            // InternalGrocery.g:1004:4: (lv_price_5_0= ruleDECIMAL )
            // InternalGrocery.g:1005:5: lv_price_5_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getNonFoodItemAccess().getPriceDECIMALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_6=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getNonFoodItemAccess().getQuantityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getNonFoodItemAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:1030:3: ( (lv_quantity_8_0= RULE_INT ) )
            // InternalGrocery.g:1031:4: (lv_quantity_8_0= RULE_INT )
            {
            // InternalGrocery.g:1031:4: (lv_quantity_8_0= RULE_INT )
            // InternalGrocery.g:1032:5: lv_quantity_8_0= RULE_INT
            {
            lv_quantity_8_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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
    // InternalGrocery.g:1056:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // InternalGrocery.g:1056:47: (iv_ruleDriver= ruleDriver EOF )
            // InternalGrocery.g:1057:2: iv_ruleDriver= ruleDriver EOF
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
    // InternalGrocery.g:1063:1: ruleDriver returns [EObject current=null] : (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
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
            // InternalGrocery.g:1069:2: ( (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1070:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1070:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1071:3: otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDriverAccess().getDriverKeyword_0());
            		
            // InternalGrocery.g:1075:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1076:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1076:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1077:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getDriverAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1105:3: ( (lv_driverName_5_0= RULE_STRING ) )
            // InternalGrocery.g:1106:4: (lv_driverName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1106:4: (lv_driverName_5_0= RULE_STRING )
            // InternalGrocery.g:1107:5: lv_driverName_5_0= RULE_STRING
            {
            lv_driverName_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            // InternalGrocery.g:1123:3: ( (otherlv_6= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGrocery.g:1124:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1124:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1125:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDriverRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_6, grammarAccess.getDriverAccess().getVehicleVehicleCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalGrocery.g:1144:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalGrocery.g:1144:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalGrocery.g:1145:2: iv_ruleEmployee= ruleEmployee EOF
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
    // InternalGrocery.g:1151:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
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
            // InternalGrocery.g:1157:2: ( (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1158:2: (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1158:2: (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1159:3: otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_employeeName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalGrocery.g:1163:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1164:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1164:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1165:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEmployeeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1193:3: ( (lv_employeeName_5_0= RULE_STRING ) )
            // InternalGrocery.g:1194:4: (lv_employeeName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1194:4: (lv_employeeName_5_0= RULE_STRING )
            // InternalGrocery.g:1195:5: lv_employeeName_5_0= RULE_STRING
            {
            lv_employeeName_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            // InternalGrocery.g:1211:3: ( (otherlv_6= RULE_ID ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGrocery.g:1212:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1212:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1213:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEmployeeRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_6, grammarAccess.getEmployeeAccess().getStockMovementStockMovementCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalGrocery.g:1232:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalGrocery.g:1232:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalGrocery.g:1233:2: iv_ruleCustomer= ruleCustomer EOF
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
    // InternalGrocery.g:1239:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
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
            // InternalGrocery.g:1245:2: ( (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1246:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1246:2: (otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1247:3: otherlv_0= 'customer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_customerName_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalGrocery.g:1251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1252:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1253:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1281:3: ( (lv_customerName_5_0= RULE_STRING ) )
            // InternalGrocery.g:1282:4: (lv_customerName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1282:4: (lv_customerName_5_0= RULE_STRING )
            // InternalGrocery.g:1283:5: lv_customerName_5_0= RULE_STRING
            {
            lv_customerName_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            // InternalGrocery.g:1299:3: ( (otherlv_6= RULE_ID ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGrocery.g:1300:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1300:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1301:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCustomerRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_6, grammarAccess.getCustomerAccess().getSaleSaleCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "entryRuleVehicle"
    // InternalGrocery.g:1320:1: entryRuleVehicle returns [EObject current=null] : iv_ruleVehicle= ruleVehicle EOF ;
    public final EObject entryRuleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicle = null;


        try {
            // InternalGrocery.g:1320:48: (iv_ruleVehicle= ruleVehicle EOF )
            // InternalGrocery.g:1321:2: iv_ruleVehicle= ruleVehicle EOF
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
    // InternalGrocery.g:1327:1: ruleVehicle returns [EObject current=null] : (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
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
            // InternalGrocery.g:1333:2: ( (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1334:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1334:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1335:3: otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVehicleAccess().getVehicleKeyword_0());
            		
            // InternalGrocery.g:1339:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1340:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1340:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1341:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getVehicleAccess().getPlateNumberKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getVehicleAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1369:3: ( (lv_plateNumber_5_0= RULE_STRING ) )
            // InternalGrocery.g:1370:4: (lv_plateNumber_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1370:4: (lv_plateNumber_5_0= RULE_STRING )
            // InternalGrocery.g:1371:5: lv_plateNumber_5_0= RULE_STRING
            {
            lv_plateNumber_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            // InternalGrocery.g:1387:3: ( (otherlv_6= RULE_ID ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGrocery.g:1388:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1388:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1389:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVehicleRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_6, grammarAccess.getVehicleAccess().getItemsItemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalGrocery.g:1408:1: entryRuleDelivery returns [EObject current=null] : iv_ruleDelivery= ruleDelivery EOF ;
    public final EObject entryRuleDelivery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelivery = null;


        try {
            // InternalGrocery.g:1408:49: (iv_ruleDelivery= ruleDelivery EOF )
            // InternalGrocery.g:1409:2: iv_ruleDelivery= ruleDelivery EOF
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
    // InternalGrocery.g:1415:1: ruleDelivery returns [EObject current=null] : (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ;
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
            // InternalGrocery.g:1421:2: ( (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) )
            // InternalGrocery.g:1422:2: (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            {
            // InternalGrocery.g:1422:2: (otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalGrocery.g:1423:3: otherlv_0= 'delivery' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'warehouse' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDeliveryAccess().getDeliveryKeyword_0());
            		
            // InternalGrocery.g:1427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1428:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDeliveryAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDeliveryAccess().getWarehouseKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getDeliveryAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1457:3: ( (otherlv_5= RULE_ID ) )
            // InternalGrocery.g:1458:4: (otherlv_5= RULE_ID )
            {
            // InternalGrocery.g:1458:4: (otherlv_5= RULE_ID )
            // InternalGrocery.g:1459:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_5, grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getDeliveryAccess().getStoreKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getDeliveryAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:1478:3: ( (otherlv_8= RULE_ID ) )
            // InternalGrocery.g:1479:4: (otherlv_8= RULE_ID )
            {
            // InternalGrocery.g:1479:4: (otherlv_8= RULE_ID )
            // InternalGrocery.g:1480:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_8, grammarAccess.getDeliveryAccess().getToStoreStoreCrossReference_8_0());
            				

            }


            }

            // InternalGrocery.g:1491:3: ( (otherlv_9= RULE_ID ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGrocery.g:1492:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGrocery.g:1492:4: (otherlv_9= RULE_ID )
            	    // InternalGrocery.g:1493:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_9, grammarAccess.getDeliveryAccess().getItemsItemCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalGrocery.g:1512:1: entryRuleSale returns [EObject current=null] : iv_ruleSale= ruleSale EOF ;
    public final EObject entryRuleSale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSale = null;


        try {
            // InternalGrocery.g:1512:45: (iv_ruleSale= ruleSale EOF )
            // InternalGrocery.g:1513:2: iv_ruleSale= ruleSale EOF
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
    // InternalGrocery.g:1519:1: ruleSale returns [EObject current=null] : (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) ;
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
            // InternalGrocery.g:1525:2: ( (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:1526:2: (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:1526:2: (otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' )
            // InternalGrocery.g:1527:3: otherlv_0= 'sale' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'shelf' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ( (otherlv_6= RULE_ID ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSaleAccess().getSaleKeyword_0());
            		
            // InternalGrocery.g:1531:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1532:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1532:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1533:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getSaleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getSaleAccess().getShelfKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSaleAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1561:3: ( (otherlv_5= RULE_ID ) )
            // InternalGrocery.g:1562:4: (otherlv_5= RULE_ID )
            {
            // InternalGrocery.g:1562:4: (otherlv_5= RULE_ID )
            // InternalGrocery.g:1563:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_5, grammarAccess.getSaleAccess().getFromShelfShelfCrossReference_5_0());
            				

            }


            }

            // InternalGrocery.g:1574:3: ( (otherlv_6= RULE_ID ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGrocery.g:1575:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalGrocery.g:1575:4: (otherlv_6= RULE_ID )
            	    // InternalGrocery.g:1576:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSaleRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSaleAccess().getItemsItemCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalGrocery.g:1595:1: entryRuleStockMovement returns [EObject current=null] : iv_ruleStockMovement= ruleStockMovement EOF ;
    public final EObject entryRuleStockMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStockMovement = null;


        try {
            // InternalGrocery.g:1595:54: (iv_ruleStockMovement= ruleStockMovement EOF )
            // InternalGrocery.g:1596:2: iv_ruleStockMovement= ruleStockMovement EOF
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
    // InternalGrocery.g:1602:1: ruleStockMovement returns [EObject current=null] : (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) ;
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
            // InternalGrocery.g:1608:2: ( (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' ) )
            // InternalGrocery.g:1609:2: (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            {
            // InternalGrocery.g:1609:2: (otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' )
            // InternalGrocery.g:1610:3: otherlv_0= 'stock' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'backroom' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'shelf' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStockMovementAccess().getStockKeyword_0());
            		
            // InternalGrocery.g:1614:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1615:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1615:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1616:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getStockMovementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getStockMovementAccess().getBackroomKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getStockMovementAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1644:3: ( (otherlv_5= RULE_ID ) )
            // InternalGrocery.g:1645:4: (otherlv_5= RULE_ID )
            {
            // InternalGrocery.g:1645:4: (otherlv_5= RULE_ID )
            // InternalGrocery.g:1646:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStockMovementRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_5, grammarAccess.getStockMovementAccess().getFromBackroomBackroomCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getStockMovementAccess().getShelfKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getStockMovementAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:1665:3: ( (otherlv_8= RULE_ID ) )
            // InternalGrocery.g:1666:4: (otherlv_8= RULE_ID )
            {
            // InternalGrocery.g:1666:4: (otherlv_8= RULE_ID )
            // InternalGrocery.g:1667:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStockMovementRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_8, grammarAccess.getStockMovementAccess().getToShelfShelfCrossReference_8_0());
            				

            }


            }

            // InternalGrocery.g:1678:3: ( (otherlv_9= RULE_ID ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGrocery.g:1679:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalGrocery.g:1679:4: (otherlv_9= RULE_ID )
            	    // InternalGrocery.g:1680:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStockMovementRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(otherlv_9, grammarAccess.getStockMovementAccess().getItemsItemCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalGrocery.g:1699:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalGrocery.g:1699:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalGrocery.g:1700:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalGrocery.g:1706:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGrocery.g:1712:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalGrocery.g:1713:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGrocery.g:1713:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalGrocery.g:1714:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,34,FOLLOW_13); 

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
    // InternalGrocery.g:1737:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalGrocery.g:1737:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalGrocery.g:1738:2: iv_ruleDATE= ruleDATE EOF
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
    // InternalGrocery.g:1744:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:1750:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalGrocery.g:1751:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalGrocery.g:1751:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalGrocery.g:1752:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,35,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,35,FOLLOW_13); 

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
    // InternalGrocery.g:1787:1: entryRuleADDRESS returns [String current=null] : iv_ruleADDRESS= ruleADDRESS EOF ;
    public final String entryRuleADDRESS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDRESS = null;


        try {
            // InternalGrocery.g:1787:47: (iv_ruleADDRESS= ruleADDRESS EOF )
            // InternalGrocery.g:1788:2: iv_ruleADDRESS= ruleADDRESS EOF
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
    // InternalGrocery.g:1794:1: ruleADDRESS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleADDRESS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token kw=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalGrocery.g:1800:2: ( (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING ) )
            // InternalGrocery.g:1801:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            {
            // InternalGrocery.g:1801:2: (this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING )
            // InternalGrocery.g:1802:3: this_INT_0= RULE_INT this_STRING_1= RULE_STRING kw= ',' this_STRING_3= RULE_STRING
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0());
            		
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_27); 

            			current.merge(this_STRING_1);
            		

            			newLeafNode(this_STRING_1, grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1());
            		
            kw=(Token)match(input,36,FOLLOW_19); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003BB4E4802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000003BB4E0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000003814E0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000014E0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});

}
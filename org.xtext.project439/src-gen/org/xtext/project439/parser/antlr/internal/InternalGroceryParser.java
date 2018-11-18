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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'warehouse'", "'address'", "':'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'price'", "'quantity'", "'perishableItem'", "'ExpirationDate'", "'date'", "'driver'", "'name'", "'vehicle'", "'plateNumber'", "'.'", "'/'", "','"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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
    // InternalGrocery.g:71:1: ruleGrocery returns [EObject current=null] : ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleDeliveryElement ) )* ) ;
    public final EObject ruleGrocery() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:77:2: ( ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleDeliveryElement ) )* ) )
            // InternalGrocery.g:78:2: ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleDeliveryElement ) )* )
            {
            // InternalGrocery.g:78:2: ( ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleDeliveryElement ) )* )
            // InternalGrocery.g:79:3: ( (lv_elements_0_0= ruleBuilding ) )* ( (lv_elements_1_0= ruleDeliveryElement ) )*
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

            // InternalGrocery.g:98:3: ( (lv_elements_1_0= ruleDeliveryElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25||LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGrocery.g:99:4: (lv_elements_1_0= ruleDeliveryElement )
            	    {
            	    // InternalGrocery.g:99:4: (lv_elements_1_0= ruleDeliveryElement )
            	    // InternalGrocery.g:100:5: lv_elements_1_0= ruleDeliveryElement
            	    {

            	    					newCompositeNode(grammarAccess.getGroceryAccess().getElementsDeliveryElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_1_0=ruleDeliveryElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroceryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"org.xtext.project439.Grocery.DeliveryElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalGrocery.g:121:1: entryRuleBuilding returns [EObject current=null] : iv_ruleBuilding= ruleBuilding EOF ;
    public final EObject entryRuleBuilding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuilding = null;


        try {
            // InternalGrocery.g:121:49: (iv_ruleBuilding= ruleBuilding EOF )
            // InternalGrocery.g:122:2: iv_ruleBuilding= ruleBuilding EOF
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
    // InternalGrocery.g:128:1: ruleBuilding returns [EObject current=null] : (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse ) ;
    public final EObject ruleBuilding() throws RecognitionException {
        EObject current = null;

        EObject this_Store_0 = null;

        EObject this_Warehouse_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:134:2: ( (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse ) )
            // InternalGrocery.g:135:2: (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse )
            {
            // InternalGrocery.g:135:2: (this_Store_0= ruleStore | this_Warehouse_1= ruleWarehouse )
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
                    // InternalGrocery.g:136:3: this_Store_0= ruleStore
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
                    // InternalGrocery.g:145:3: this_Warehouse_1= ruleWarehouse
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
    // InternalGrocery.g:157:1: entryRuleStoreElements returns [EObject current=null] : iv_ruleStoreElements= ruleStoreElements EOF ;
    public final EObject entryRuleStoreElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreElements = null;


        try {
            // InternalGrocery.g:157:54: (iv_ruleStoreElements= ruleStoreElements EOF )
            // InternalGrocery.g:158:2: iv_ruleStoreElements= ruleStoreElements EOF
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
    // InternalGrocery.g:164:1: ruleStoreElements returns [EObject current=null] : (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf ) ;
    public final EObject ruleStoreElements() throws RecognitionException {
        EObject current = null;

        EObject this_Backroom_0 = null;

        EObject this_Shelf_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:170:2: ( (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf ) )
            // InternalGrocery.g:171:2: (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf )
            {
            // InternalGrocery.g:171:2: (this_Backroom_0= ruleBackroom | this_Shelf_1= ruleShelf )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGrocery.g:172:3: this_Backroom_0= ruleBackroom
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
                    // InternalGrocery.g:181:3: this_Shelf_1= ruleShelf
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


    // $ANTLR start "entryRuleDeliveryElement"
    // InternalGrocery.g:193:1: entryRuleDeliveryElement returns [EObject current=null] : iv_ruleDeliveryElement= ruleDeliveryElement EOF ;
    public final EObject entryRuleDeliveryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryElement = null;


        try {
            // InternalGrocery.g:193:56: (iv_ruleDeliveryElement= ruleDeliveryElement EOF )
            // InternalGrocery.g:194:2: iv_ruleDeliveryElement= ruleDeliveryElement EOF
            {
             newCompositeNode(grammarAccess.getDeliveryElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeliveryElement=ruleDeliveryElement();

            state._fsp--;

             current =iv_ruleDeliveryElement; 
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
    // $ANTLR end "entryRuleDeliveryElement"


    // $ANTLR start "ruleDeliveryElement"
    // InternalGrocery.g:200:1: ruleDeliveryElement returns [EObject current=null] : (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle ) ;
    public final EObject ruleDeliveryElement() throws RecognitionException {
        EObject current = null;

        EObject this_Driver_0 = null;

        EObject this_Vehicle_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:206:2: ( (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle ) )
            // InternalGrocery.g:207:2: (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle )
            {
            // InternalGrocery.g:207:2: (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGrocery.g:208:3: this_Driver_0= ruleDriver
                    {

                    			newCompositeNode(grammarAccess.getDeliveryElementAccess().getDriverParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Driver_0=ruleDriver();

                    state._fsp--;


                    			current = this_Driver_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:217:3: this_Vehicle_1= ruleVehicle
                    {

                    			newCompositeNode(grammarAccess.getDeliveryElementAccess().getVehicleParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleDeliveryElement"


    // $ANTLR start "entryRuleStore"
    // InternalGrocery.g:229:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalGrocery.g:229:46: (iv_ruleStore= ruleStore EOF )
            // InternalGrocery.g:230:2: iv_ruleStore= ruleStore EOF
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
    // InternalGrocery.g:236:1: ruleStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStoreElements ) )* otherlv_4= '}' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:242:2: ( (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStoreElements ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:243:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStoreElements ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:243:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStoreElements ) )* otherlv_4= '}' )
            // InternalGrocery.g:244:3: otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleStoreElements ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalGrocery.g:248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:249:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:250:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:270:3: ( (lv_elements_3_0= ruleStoreElements ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGrocery.g:271:4: (lv_elements_3_0= ruleStoreElements )
            	    {
            	    // InternalGrocery.g:271:4: (lv_elements_3_0= ruleStoreElements )
            	    // InternalGrocery.g:272:5: lv_elements_3_0= ruleStoreElements
            	    {

            	    					newCompositeNode(grammarAccess.getStoreAccess().getElementsStoreElementsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_3_0=ruleStoreElements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.project439.Grocery.StoreElements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalGrocery.g:297:1: entryRuleWarehouse returns [EObject current=null] : iv_ruleWarehouse= ruleWarehouse EOF ;
    public final EObject entryRuleWarehouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouse = null;


        try {
            // InternalGrocery.g:297:50: (iv_ruleWarehouse= ruleWarehouse EOF )
            // InternalGrocery.g:298:2: iv_ruleWarehouse= ruleWarehouse EOF
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
    // InternalGrocery.g:304:1: ruleWarehouse returns [EObject current=null] : (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (lv_elements_6_0= ruleItem ) )* otherlv_7= '}' ) ;
    public final EObject ruleWarehouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_address_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:310:2: ( (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (lv_elements_6_0= ruleItem ) )* otherlv_7= '}' ) )
            // InternalGrocery.g:311:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (lv_elements_6_0= ruleItem ) )* otherlv_7= '}' )
            {
            // InternalGrocery.g:311:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (lv_elements_6_0= ruleItem ) )* otherlv_7= '}' )
            // InternalGrocery.g:312:3: otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'address' otherlv_4= ':' ( (lv_address_5_0= ruleADDRESS ) ) ( (lv_elements_6_0= ruleItem ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWarehouseAccess().getWarehouseKeyword_0());
            		
            // InternalGrocery.g:316:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:317:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:317:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:318:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getWarehouseAccess().getAddressKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getWarehouseAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:346:3: ( (lv_address_5_0= ruleADDRESS ) )
            // InternalGrocery.g:347:4: (lv_address_5_0= ruleADDRESS )
            {
            // InternalGrocery.g:347:4: (lv_address_5_0= ruleADDRESS )
            // InternalGrocery.g:348:5: lv_address_5_0= ruleADDRESS
            {

            					newCompositeNode(grammarAccess.getWarehouseAccess().getAddressADDRESSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalGrocery.g:365:3: ( (lv_elements_6_0= ruleItem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrocery.g:366:4: (lv_elements_6_0= ruleItem )
            	    {
            	    // InternalGrocery.g:366:4: (lv_elements_6_0= ruleItem )
            	    // InternalGrocery.g:367:5: lv_elements_6_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_6_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWarehouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"org.xtext.project439.Grocery.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalGrocery.g:392:1: entryRuleShelf returns [EObject current=null] : iv_ruleShelf= ruleShelf EOF ;
    public final EObject entryRuleShelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShelf = null;


        try {
            // InternalGrocery.g:392:46: (iv_ruleShelf= ruleShelf EOF )
            // InternalGrocery.g:393:2: iv_ruleShelf= ruleShelf EOF
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
    // InternalGrocery.g:399:1: ruleShelf returns [EObject current=null] : (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleShelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:405:2: ( (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:406:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:406:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            // InternalGrocery.g:407:3: otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getShelfAccess().getShelfKeyword_0());
            		
            // InternalGrocery.g:411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:412:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:413:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:433:3: ( (lv_elements_3_0= ruleItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrocery.g:434:4: (lv_elements_3_0= ruleItem )
            	    {
            	    // InternalGrocery.g:434:4: (lv_elements_3_0= ruleItem )
            	    // InternalGrocery.g:435:5: lv_elements_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_3_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShelfRule());
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
            	    break loop8;
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
    // InternalGrocery.g:460:1: entryRuleBackroom returns [EObject current=null] : iv_ruleBackroom= ruleBackroom EOF ;
    public final EObject entryRuleBackroom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackroom = null;


        try {
            // InternalGrocery.g:460:49: (iv_ruleBackroom= ruleBackroom EOF )
            // InternalGrocery.g:461:2: iv_ruleBackroom= ruleBackroom EOF
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
    // InternalGrocery.g:467:1: ruleBackroom returns [EObject current=null] : (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleBackroom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:473:2: ( (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:474:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:474:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            // InternalGrocery.g:475:3: otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackroomAccess().getBackroomKeyword_0());
            		
            // InternalGrocery.g:479:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:480:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:480:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:481:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:501:3: ( (lv_elements_3_0= ruleItem ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrocery.g:502:4: (lv_elements_3_0= ruleItem )
            	    {
            	    // InternalGrocery.g:502:4: (lv_elements_3_0= ruleItem )
            	    // InternalGrocery.g:503:5: lv_elements_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_3_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackroomRule());
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
            	    break loop9;
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


    // $ANTLR start "entryRuleItem"
    // InternalGrocery.g:528:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalGrocery.g:528:45: (iv_ruleItem= ruleItem EOF )
            // InternalGrocery.g:529:2: iv_ruleItem= ruleItem EOF
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
    // InternalGrocery.g:535:1: ruleItem returns [EObject current=null] : (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_PerishableItem_0 = null;

        EObject this_NonPerishableItem_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:541:2: ( (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) )
            // InternalGrocery.g:542:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            {
            // InternalGrocery.g:542:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGrocery.g:543:3: this_PerishableItem_0= rulePerishableItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getPerishableItemParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PerishableItem_0=rulePerishableItem();

                    state._fsp--;


                    			current = this_PerishableItem_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGrocery.g:552:3: this_NonPerishableItem_1= ruleNonPerishableItem
                    {

                    			newCompositeNode(grammarAccess.getItemAccess().getNonPerishableItemParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleNonPerishableItem"
    // InternalGrocery.g:564:1: entryRuleNonPerishableItem returns [EObject current=null] : iv_ruleNonPerishableItem= ruleNonPerishableItem EOF ;
    public final EObject entryRuleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonPerishableItem = null;


        try {
            // InternalGrocery.g:564:58: (iv_ruleNonPerishableItem= ruleNonPerishableItem EOF )
            // InternalGrocery.g:565:2: iv_ruleNonPerishableItem= ruleNonPerishableItem EOF
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
    // InternalGrocery.g:571:1: ruleNonPerishableItem returns [EObject current=null] : (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) ;
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
            // InternalGrocery.g:577:2: ( (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' ) )
            // InternalGrocery.g:578:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            {
            // InternalGrocery.g:578:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}' )
            // InternalGrocery.g:579:3: otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= ruleDECIMAL ) ) otherlv_6= 'quantity' otherlv_7= ':' ( (lv_quantity_8_0= RULE_INT ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0());
            		
            // InternalGrocery.g:583:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:584:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:584:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:585:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getNonPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:613:3: ( (lv_price_5_0= ruleDECIMAL ) )
            // InternalGrocery.g:614:4: (lv_price_5_0= ruleDECIMAL )
            {
            // InternalGrocery.g:614:4: (lv_price_5_0= ruleDECIMAL )
            // InternalGrocery.g:615:5: lv_price_5_0= ruleDECIMAL
            {

            					newCompositeNode(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_6=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getNonPerishableItemAccess().getQuantityKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getNonPerishableItemAccess().getColonKeyword_7());
            		
            // InternalGrocery.g:640:3: ( (lv_quantity_8_0= RULE_INT ) )
            // InternalGrocery.g:641:4: (lv_quantity_8_0= RULE_INT )
            {
            // InternalGrocery.g:641:4: (lv_quantity_8_0= RULE_INT )
            // InternalGrocery.g:642:5: lv_quantity_8_0= RULE_INT
            {
            lv_quantity_8_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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
    // InternalGrocery.g:666:1: entryRulePerishableItem returns [EObject current=null] : iv_rulePerishableItem= rulePerishableItem EOF ;
    public final EObject entryRulePerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerishableItem = null;


        try {
            // InternalGrocery.g:666:55: (iv_rulePerishableItem= rulePerishableItem EOF )
            // InternalGrocery.g:667:2: iv_rulePerishableItem= rulePerishableItem EOF
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
    // InternalGrocery.g:673:1: rulePerishableItem returns [EObject current=null] : (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' ) ;
    public final EObject rulePerishableItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_price_5_0=null;
        Token otherlv_7=null;
        EObject lv_experationDate_6_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:679:2: ( (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' ) )
            // InternalGrocery.g:680:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' )
            {
            // InternalGrocery.g:680:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' )
            // InternalGrocery.g:681:3: otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0());
            		
            // InternalGrocery.g:685:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:686:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:686:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:687:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:715:3: ( (lv_price_5_0= RULE_INT ) )
            // InternalGrocery.g:716:4: (lv_price_5_0= RULE_INT )
            {
            // InternalGrocery.g:716:4: (lv_price_5_0= RULE_INT )
            // InternalGrocery.g:717:5: lv_price_5_0= RULE_INT
            {
            lv_price_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_price_5_0, grammarAccess.getPerishableItemAccess().getPriceINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPerishableItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGrocery.g:733:3: ( (lv_experationDate_6_0= ruleExperationDate ) )
            // InternalGrocery.g:734:4: (lv_experationDate_6_0= ruleExperationDate )
            {
            // InternalGrocery.g:734:4: (lv_experationDate_6_0= ruleExperationDate )
            // InternalGrocery.g:735:5: lv_experationDate_6_0= ruleExperationDate
            {

            					newCompositeNode(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_experationDate_6_0=ruleExperationDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPerishableItemRule());
            					}
            					add(
            						current,
            						"experationDate",
            						lv_experationDate_6_0,
            						"org.xtext.project439.Grocery.ExperationDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleExperationDate"
    // InternalGrocery.g:760:1: entryRuleExperationDate returns [EObject current=null] : iv_ruleExperationDate= ruleExperationDate EOF ;
    public final EObject entryRuleExperationDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperationDate = null;


        try {
            // InternalGrocery.g:760:55: (iv_ruleExperationDate= ruleExperationDate EOF )
            // InternalGrocery.g:761:2: iv_ruleExperationDate= ruleExperationDate EOF
            {
             newCompositeNode(grammarAccess.getExperationDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperationDate=ruleExperationDate();

            state._fsp--;

             current =iv_ruleExperationDate; 
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
    // $ANTLR end "entryRuleExperationDate"


    // $ANTLR start "ruleExperationDate"
    // InternalGrocery.g:767:1: ruleExperationDate returns [EObject current=null] : (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'date' otherlv_3= ':' ( (lv_date_4_0= ruleDATE ) ) otherlv_5= '}' ) ;
    public final EObject ruleExperationDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_date_4_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:773:2: ( (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'date' otherlv_3= ':' ( (lv_date_4_0= ruleDATE ) ) otherlv_5= '}' ) )
            // InternalGrocery.g:774:2: (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'date' otherlv_3= ':' ( (lv_date_4_0= ruleDATE ) ) otherlv_5= '}' )
            {
            // InternalGrocery.g:774:2: (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'date' otherlv_3= ':' ( (lv_date_4_0= ruleDATE ) ) otherlv_5= '}' )
            // InternalGrocery.g:775:3: otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'date' otherlv_3= ':' ( (lv_date_4_0= ruleDATE ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExperationDateAccess().getExpirationDateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getExperationDateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExperationDateAccess().getDateKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getExperationDateAccess().getColonKeyword_3());
            		
            // InternalGrocery.g:791:3: ( (lv_date_4_0= ruleDATE ) )
            // InternalGrocery.g:792:4: (lv_date_4_0= ruleDATE )
            {
            // InternalGrocery.g:792:4: (lv_date_4_0= ruleDATE )
            // InternalGrocery.g:793:5: lv_date_4_0= ruleDATE
            {

            					newCompositeNode(grammarAccess.getExperationDateAccess().getDateDATEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_date_4_0=ruleDATE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperationDateRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_4_0,
            						"org.xtext.project439.Grocery.DATE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExperationDateAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExperationDate"


    // $ANTLR start "entryRuleDriver"
    // InternalGrocery.g:818:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // InternalGrocery.g:818:47: (iv_ruleDriver= ruleDriver EOF )
            // InternalGrocery.g:819:2: iv_ruleDriver= ruleDriver EOF
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
    // InternalGrocery.g:825:1: ruleDriver returns [EObject current=null] : (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_driverName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGrocery.g:831:2: ( (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalGrocery.g:832:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalGrocery.g:832:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalGrocery.g:833:3: otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDriverAccess().getDriverKeyword_0());
            		
            // InternalGrocery.g:837:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:838:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:838:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:839:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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
            		
            otherlv_3=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDriverAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:867:3: ( (lv_driverName_5_0= RULE_STRING ) )
            // InternalGrocery.g:868:4: (lv_driverName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:868:4: (lv_driverName_5_0= RULE_STRING )
            // InternalGrocery.g:869:5: lv_driverName_5_0= RULE_STRING
            {
            lv_driverName_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleVehicle"
    // InternalGrocery.g:893:1: entryRuleVehicle returns [EObject current=null] : iv_ruleVehicle= ruleVehicle EOF ;
    public final EObject entryRuleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicle = null;


        try {
            // InternalGrocery.g:893:48: (iv_ruleVehicle= ruleVehicle EOF )
            // InternalGrocery.g:894:2: iv_ruleVehicle= ruleVehicle EOF
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
    // InternalGrocery.g:900:1: ruleVehicle returns [EObject current=null] : (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_plateNumber_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGrocery.g:906:2: ( (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalGrocery.g:907:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalGrocery.g:907:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalGrocery.g:908:3: otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVehicleAccess().getVehicleKeyword_0());
            		
            // InternalGrocery.g:912:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:913:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:913:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:914:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getVehicleAccess().getPlateNumberKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getVehicleAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:942:3: ( (lv_plateNumber_5_0= RULE_STRING ) )
            // InternalGrocery.g:943:4: (lv_plateNumber_5_0= RULE_STRING )
            {
            // InternalGrocery.g:943:4: (lv_plateNumber_5_0= RULE_STRING )
            // InternalGrocery.g:944:5: lv_plateNumber_5_0= RULE_STRING
            {
            lv_plateNumber_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGrocery.g:968:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // InternalGrocery.g:968:47: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // InternalGrocery.g:969:2: iv_ruleDECIMAL= ruleDECIMAL EOF
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
    // InternalGrocery.g:975:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalGrocery.g:981:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalGrocery.g:982:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalGrocery.g:982:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalGrocery.g:983:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,29,FOLLOW_13); 

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
    // InternalGrocery.g:1006:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalGrocery.g:1006:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalGrocery.g:1007:2: iv_ruleDATE= ruleDATE EOF
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
    // InternalGrocery.g:1013:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalGrocery.g:1019:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalGrocery.g:1020:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalGrocery.g:1020:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalGrocery.g:1021:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,30,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,30,FOLLOW_13); 

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
    // InternalGrocery.g:1056:1: entryRuleADDRESS returns [String current=null] : iv_ruleADDRESS= ruleADDRESS EOF ;
    public final String entryRuleADDRESS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleADDRESS = null;


        try {
            // InternalGrocery.g:1056:47: (iv_ruleADDRESS= ruleADDRESS EOF )
            // InternalGrocery.g:1057:2: iv_ruleADDRESS= ruleADDRESS EOF
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
    // InternalGrocery.g:1063:1: ruleADDRESS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING this_INT_1= RULE_INT kw= ',' this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleADDRESS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token kw=null;
        Token this_STRING_3=null;


        	enterRule();

        try {
            // InternalGrocery.g:1069:2: ( (this_STRING_0= RULE_STRING this_INT_1= RULE_INT kw= ',' this_STRING_3= RULE_STRING ) )
            // InternalGrocery.g:1070:2: (this_STRING_0= RULE_STRING this_INT_1= RULE_INT kw= ',' this_STRING_3= RULE_STRING )
            {
            // InternalGrocery.g:1070:2: (this_STRING_0= RULE_STRING this_INT_1= RULE_INT kw= ',' this_STRING_3= RULE_STRING )
            // InternalGrocery.g:1071:3: this_STRING_0= RULE_STRING this_INT_1= RULE_INT kw= ',' this_STRING_3= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,31,FOLLOW_10); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000A004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000482000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});

}
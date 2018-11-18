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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'perishableItem'", "'street'", "'number'", "'city'", "'month'", "'day'", "'year'", "'driver'", "'vehicle'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
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

                if ( ((LA2_0>=24 && LA2_0<=25)) ) {
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
            else if ( (LA3_0==RULE_ID) ) {
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


    // $ANTLR start "entryRuleDeliveryElement"
    // InternalGrocery.g:157:1: entryRuleDeliveryElement returns [EObject current=null] : iv_ruleDeliveryElement= ruleDeliveryElement EOF ;
    public final EObject entryRuleDeliveryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryElement = null;


        try {
            // InternalGrocery.g:157:56: (iv_ruleDeliveryElement= ruleDeliveryElement EOF )
            // InternalGrocery.g:158:2: iv_ruleDeliveryElement= ruleDeliveryElement EOF
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
    // InternalGrocery.g:164:1: ruleDeliveryElement returns [EObject current=null] : (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle ) ;
    public final EObject ruleDeliveryElement() throws RecognitionException {
        EObject current = null;

        EObject this_Driver_0 = null;

        EObject this_Vehicle_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:170:2: ( (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle ) )
            // InternalGrocery.g:171:2: (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle )
            {
            // InternalGrocery.g:171:2: (this_Driver_0= ruleDriver | this_Vehicle_1= ruleVehicle )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGrocery.g:172:3: this_Driver_0= ruleDriver
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
                    // InternalGrocery.g:181:3: this_Vehicle_1= ruleVehicle
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
    // InternalGrocery.g:193:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalGrocery.g:193:46: (iv_ruleStore= ruleStore EOF )
            // InternalGrocery.g:194:2: iv_ruleStore= ruleStore EOF
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
    // InternalGrocery.g:200:1: ruleStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleShelf ) )* ( (lv_elements_4_0= ruleBackroom ) ) otherlv_5= '}' ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:206:2: ( (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleShelf ) )* ( (lv_elements_4_0= ruleBackroom ) ) otherlv_5= '}' ) )
            // InternalGrocery.g:207:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleShelf ) )* ( (lv_elements_4_0= ruleBackroom ) ) otherlv_5= '}' )
            {
            // InternalGrocery.g:207:2: (otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleShelf ) )* ( (lv_elements_4_0= ruleBackroom ) ) otherlv_5= '}' )
            // InternalGrocery.g:208:3: otherlv_0= 'store' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleShelf ) )* ( (lv_elements_4_0= ruleBackroom ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalGrocery.g:212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:213:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:214:5: lv_name_1_0= RULE_ID
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
            		
            // InternalGrocery.g:234:3: ( (lv_elements_3_0= ruleShelf ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrocery.g:235:4: (lv_elements_3_0= ruleShelf )
            	    {
            	    // InternalGrocery.g:235:4: (lv_elements_3_0= ruleShelf )
            	    // InternalGrocery.g:236:5: lv_elements_3_0= ruleShelf
            	    {

            	    					newCompositeNode(grammarAccess.getStoreAccess().getElementsShelfParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_3_0=ruleShelf();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStoreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.xtext.project439.Grocery.Shelf");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGrocery.g:253:3: ( (lv_elements_4_0= ruleBackroom ) )
            // InternalGrocery.g:254:4: (lv_elements_4_0= ruleBackroom )
            {
            // InternalGrocery.g:254:4: (lv_elements_4_0= ruleBackroom )
            // InternalGrocery.g:255:5: lv_elements_4_0= ruleBackroom
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getElementsBackroomParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_elements_4_0=ruleBackroom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_4_0,
            						"org.xtext.project439.Grocery.Backroom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalGrocery.g:280:1: entryRuleWarehouse returns [EObject current=null] : iv_ruleWarehouse= ruleWarehouse EOF ;
    public final EObject entryRuleWarehouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWarehouse = null;


        try {
            // InternalGrocery.g:280:50: (iv_ruleWarehouse= ruleWarehouse EOF )
            // InternalGrocery.g:281:2: iv_ruleWarehouse= ruleWarehouse EOF
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
    // InternalGrocery.g:287:1: ruleWarehouse returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_address_1_0= ruleAddress ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleWarehouse() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_address_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:293:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_address_1_0= ruleAddress ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:294:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_address_1_0= ruleAddress ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:294:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_address_1_0= ruleAddress ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            // InternalGrocery.g:295:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_address_1_0= ruleAddress ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}'
            {
            // InternalGrocery.g:295:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGrocery.g:296:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGrocery.g:296:4: (lv_name_0_0= RULE_ID )
            // InternalGrocery.g:297:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWarehouseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGrocery.g:313:3: ( (lv_address_1_0= ruleAddress ) )
            // InternalGrocery.g:314:4: (lv_address_1_0= ruleAddress )
            {
            // InternalGrocery.g:314:4: (lv_address_1_0= ruleAddress )
            // InternalGrocery.g:315:5: lv_address_1_0= ruleAddress
            {

            					newCompositeNode(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_address_1_0=ruleAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWarehouseRule());
            					}
            					add(
            						current,
            						"address",
            						lv_address_1_0,
            						"org.xtext.project439.Grocery.Address");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:336:3: ( (lv_elements_3_0= ruleItem ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGrocery.g:337:4: (lv_elements_3_0= ruleItem )
            	    {
            	    // InternalGrocery.g:337:4: (lv_elements_3_0= ruleItem )
            	    // InternalGrocery.g:338:5: lv_elements_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_3_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWarehouseRule());
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalGrocery.g:363:1: entryRuleShelf returns [EObject current=null] : iv_ruleShelf= ruleShelf EOF ;
    public final EObject entryRuleShelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShelf = null;


        try {
            // InternalGrocery.g:363:46: (iv_ruleShelf= ruleShelf EOF )
            // InternalGrocery.g:364:2: iv_ruleShelf= ruleShelf EOF
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
    // InternalGrocery.g:370:1: ruleShelf returns [EObject current=null] : (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* ) ;
    public final EObject ruleShelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:376:2: ( (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* ) )
            // InternalGrocery.g:377:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* )
            {
            // InternalGrocery.g:377:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* )
            // InternalGrocery.g:378:3: otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getShelfAccess().getShelfKeyword_0());
            		
            // InternalGrocery.g:382:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:383:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:383:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:384:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalGrocery.g:400:3: ( (lv_elements_2_0= ruleItem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrocery.g:401:4: (lv_elements_2_0= ruleItem )
            	    {
            	    // InternalGrocery.g:401:4: (lv_elements_2_0= ruleItem )
            	    // InternalGrocery.g:402:5: lv_elements_2_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_2_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShelfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.project439.Grocery.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleShelf"


    // $ANTLR start "entryRuleBackroom"
    // InternalGrocery.g:423:1: entryRuleBackroom returns [EObject current=null] : iv_ruleBackroom= ruleBackroom EOF ;
    public final EObject entryRuleBackroom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackroom = null;


        try {
            // InternalGrocery.g:423:49: (iv_ruleBackroom= ruleBackroom EOF )
            // InternalGrocery.g:424:2: iv_ruleBackroom= ruleBackroom EOF
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
    // InternalGrocery.g:430:1: ruleBackroom returns [EObject current=null] : (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* ) ;
    public final EObject ruleBackroom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:436:2: ( (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* ) )
            // InternalGrocery.g:437:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* )
            {
            // InternalGrocery.g:437:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )* )
            // InternalGrocery.g:438:3: otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleItem ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackroomAccess().getBackroomKeyword_0());
            		
            // InternalGrocery.g:442:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:443:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:443:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:444:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalGrocery.g:460:3: ( (lv_elements_2_0= ruleItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrocery.g:461:4: (lv_elements_2_0= ruleItem )
            	    {
            	    // InternalGrocery.g:461:4: (lv_elements_2_0= ruleItem )
            	    // InternalGrocery.g:462:5: lv_elements_2_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_elements_2_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBackroomRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.project439.Grocery.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleBackroom"


    // $ANTLR start "entryRuleItem"
    // InternalGrocery.g:483:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalGrocery.g:483:45: (iv_ruleItem= ruleItem EOF )
            // InternalGrocery.g:484:2: iv_ruleItem= ruleItem EOF
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
    // InternalGrocery.g:490:1: ruleItem returns [EObject current=null] : (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_PerishableItem_0 = null;

        EObject this_NonPerishableItem_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:496:2: ( (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) )
            // InternalGrocery.g:497:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            {
            // InternalGrocery.g:497:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalGrocery.g:498:3: this_PerishableItem_0= rulePerishableItem
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
                    // InternalGrocery.g:507:3: this_NonPerishableItem_1= ruleNonPerishableItem
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
    // InternalGrocery.g:519:1: entryRuleNonPerishableItem returns [EObject current=null] : iv_ruleNonPerishableItem= ruleNonPerishableItem EOF ;
    public final EObject entryRuleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonPerishableItem = null;


        try {
            // InternalGrocery.g:519:58: (iv_ruleNonPerishableItem= ruleNonPerishableItem EOF )
            // InternalGrocery.g:520:2: iv_ruleNonPerishableItem= ruleNonPerishableItem EOF
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
    // InternalGrocery.g:526:1: ruleNonPerishableItem returns [EObject current=null] : (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_price_2_0= RULE_INT ) ) ) ;
    public final EObject ruleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_price_2_0=null;


        	enterRule();

        try {
            // InternalGrocery.g:532:2: ( (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_price_2_0= RULE_INT ) ) ) )
            // InternalGrocery.g:533:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_price_2_0= RULE_INT ) ) )
            {
            // InternalGrocery.g:533:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_price_2_0= RULE_INT ) ) )
            // InternalGrocery.g:534:3: otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_price_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0());
            		
            // InternalGrocery.g:538:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:539:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:539:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:540:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalGrocery.g:556:3: ( (lv_price_2_0= RULE_INT ) )
            // InternalGrocery.g:557:4: (lv_price_2_0= RULE_INT )
            {
            // InternalGrocery.g:557:4: (lv_price_2_0= RULE_INT )
            // InternalGrocery.g:558:5: lv_price_2_0= RULE_INT
            {
            lv_price_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_price_2_0, grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonPerishableItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // InternalGrocery.g:578:1: entryRulePerishableItem returns [EObject current=null] : iv_rulePerishableItem= rulePerishableItem EOF ;
    public final EObject entryRulePerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerishableItem = null;


        try {
            // InternalGrocery.g:578:55: (iv_rulePerishableItem= rulePerishableItem EOF )
            // InternalGrocery.g:579:2: iv_rulePerishableItem= rulePerishableItem EOF
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
    // InternalGrocery.g:585:1: rulePerishableItem returns [EObject current=null] : (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_experationDate_2_0= ruleExperationDate ) ) ) ;
    public final EObject rulePerishableItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_experationDate_2_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:591:2: ( (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_experationDate_2_0= ruleExperationDate ) ) ) )
            // InternalGrocery.g:592:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_experationDate_2_0= ruleExperationDate ) ) )
            {
            // InternalGrocery.g:592:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_experationDate_2_0= ruleExperationDate ) ) )
            // InternalGrocery.g:593:3: otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_experationDate_2_0= ruleExperationDate ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0());
            		
            // InternalGrocery.g:597:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:598:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:598:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:599:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalGrocery.g:615:3: ( (lv_experationDate_2_0= ruleExperationDate ) )
            // InternalGrocery.g:616:4: (lv_experationDate_2_0= ruleExperationDate )
            {
            // InternalGrocery.g:616:4: (lv_experationDate_2_0= ruleExperationDate )
            // InternalGrocery.g:617:5: lv_experationDate_2_0= ruleExperationDate
            {

            					newCompositeNode(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_experationDate_2_0=ruleExperationDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPerishableItemRule());
            					}
            					add(
            						current,
            						"experationDate",
            						lv_experationDate_2_0,
            						"org.xtext.project439.Grocery.ExperationDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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


    // $ANTLR start "entryRuleAddress"
    // InternalGrocery.g:638:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalGrocery.g:638:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalGrocery.g:639:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalGrocery.g:645:1: ruleAddress returns [EObject current=null] : (otherlv_0= 'street' ( (lv_street_1_0= RULE_STRING ) ) otherlv_2= 'number' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= 'city' ( (lv_city_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_street_1_0=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;
        Token lv_city_5_0=null;


        	enterRule();

        try {
            // InternalGrocery.g:651:2: ( (otherlv_0= 'street' ( (lv_street_1_0= RULE_STRING ) ) otherlv_2= 'number' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= 'city' ( (lv_city_5_0= RULE_STRING ) ) ) )
            // InternalGrocery.g:652:2: (otherlv_0= 'street' ( (lv_street_1_0= RULE_STRING ) ) otherlv_2= 'number' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= 'city' ( (lv_city_5_0= RULE_STRING ) ) )
            {
            // InternalGrocery.g:652:2: (otherlv_0= 'street' ( (lv_street_1_0= RULE_STRING ) ) otherlv_2= 'number' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= 'city' ( (lv_city_5_0= RULE_STRING ) ) )
            // InternalGrocery.g:653:3: otherlv_0= 'street' ( (lv_street_1_0= RULE_STRING ) ) otherlv_2= 'number' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= 'city' ( (lv_city_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getStreetKeyword_0());
            		
            // InternalGrocery.g:657:3: ( (lv_street_1_0= RULE_STRING ) )
            // InternalGrocery.g:658:4: (lv_street_1_0= RULE_STRING )
            {
            // InternalGrocery.g:658:4: (lv_street_1_0= RULE_STRING )
            // InternalGrocery.g:659:5: lv_street_1_0= RULE_STRING
            {
            lv_street_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_street_1_0, grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"street",
            						lv_street_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getNumberKeyword_2());
            		
            // InternalGrocery.g:679:3: ( (lv_number_3_0= RULE_INT ) )
            // InternalGrocery.g:680:4: (lv_number_3_0= RULE_INT )
            {
            // InternalGrocery.g:680:4: (lv_number_3_0= RULE_INT )
            // InternalGrocery.g:681:5: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_number_3_0, grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getAddressAccess().getCityKeyword_4());
            		
            // InternalGrocery.g:701:3: ( (lv_city_5_0= RULE_STRING ) )
            // InternalGrocery.g:702:4: (lv_city_5_0= RULE_STRING )
            {
            // InternalGrocery.g:702:4: (lv_city_5_0= RULE_STRING )
            // InternalGrocery.g:703:5: lv_city_5_0= RULE_STRING
            {
            lv_city_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_city_5_0, grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"city",
            						lv_city_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleExperationDate"
    // InternalGrocery.g:723:1: entryRuleExperationDate returns [EObject current=null] : iv_ruleExperationDate= ruleExperationDate EOF ;
    public final EObject entryRuleExperationDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperationDate = null;


        try {
            // InternalGrocery.g:723:55: (iv_ruleExperationDate= ruleExperationDate EOF )
            // InternalGrocery.g:724:2: iv_ruleExperationDate= ruleExperationDate EOF
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
    // InternalGrocery.g:730:1: ruleExperationDate returns [EObject current=null] : (otherlv_0= 'month' ( (lv_month_1_0= RULE_INT ) ) otherlv_2= 'day' ( (lv_day_3_0= RULE_INT ) ) otherlv_4= 'year' ( (lv_year_5_0= RULE_INT ) ) ) ;
    public final EObject ruleExperationDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_month_1_0=null;
        Token otherlv_2=null;
        Token lv_day_3_0=null;
        Token otherlv_4=null;
        Token lv_year_5_0=null;


        	enterRule();

        try {
            // InternalGrocery.g:736:2: ( (otherlv_0= 'month' ( (lv_month_1_0= RULE_INT ) ) otherlv_2= 'day' ( (lv_day_3_0= RULE_INT ) ) otherlv_4= 'year' ( (lv_year_5_0= RULE_INT ) ) ) )
            // InternalGrocery.g:737:2: (otherlv_0= 'month' ( (lv_month_1_0= RULE_INT ) ) otherlv_2= 'day' ( (lv_day_3_0= RULE_INT ) ) otherlv_4= 'year' ( (lv_year_5_0= RULE_INT ) ) )
            {
            // InternalGrocery.g:737:2: (otherlv_0= 'month' ( (lv_month_1_0= RULE_INT ) ) otherlv_2= 'day' ( (lv_day_3_0= RULE_INT ) ) otherlv_4= 'year' ( (lv_year_5_0= RULE_INT ) ) )
            // InternalGrocery.g:738:3: otherlv_0= 'month' ( (lv_month_1_0= RULE_INT ) ) otherlv_2= 'day' ( (lv_day_3_0= RULE_INT ) ) otherlv_4= 'year' ( (lv_year_5_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getExperationDateAccess().getMonthKeyword_0());
            		
            // InternalGrocery.g:742:3: ( (lv_month_1_0= RULE_INT ) )
            // InternalGrocery.g:743:4: (lv_month_1_0= RULE_INT )
            {
            // InternalGrocery.g:743:4: (lv_month_1_0= RULE_INT )
            // InternalGrocery.g:744:5: lv_month_1_0= RULE_INT
            {
            lv_month_1_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_month_1_0, grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperationDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"month",
            						lv_month_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getExperationDateAccess().getDayKeyword_2());
            		
            // InternalGrocery.g:764:3: ( (lv_day_3_0= RULE_INT ) )
            // InternalGrocery.g:765:4: (lv_day_3_0= RULE_INT )
            {
            // InternalGrocery.g:765:4: (lv_day_3_0= RULE_INT )
            // InternalGrocery.g:766:5: lv_day_3_0= RULE_INT
            {
            lv_day_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_day_3_0, grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperationDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"day",
            						lv_day_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getExperationDateAccess().getYearKeyword_4());
            		
            // InternalGrocery.g:786:3: ( (lv_year_5_0= RULE_INT ) )
            // InternalGrocery.g:787:4: (lv_year_5_0= RULE_INT )
            {
            // InternalGrocery.g:787:4: (lv_year_5_0= RULE_INT )
            // InternalGrocery.g:788:5: lv_year_5_0= RULE_INT
            {
            lv_year_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_year_5_0, grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperationDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


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
    // InternalGrocery.g:808:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // InternalGrocery.g:808:47: (iv_ruleDriver= ruleDriver EOF )
            // InternalGrocery.g:809:2: iv_ruleDriver= ruleDriver EOF
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
    // InternalGrocery.g:815:1: ruleDriver returns [EObject current=null] : (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrocery.g:821:2: ( (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrocery.g:822:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrocery.g:822:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrocery.g:823:3: otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDriverAccess().getDriverKeyword_0());
            		
            // InternalGrocery.g:827:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:828:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:828:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:829:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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
    // InternalGrocery.g:849:1: entryRuleVehicle returns [EObject current=null] : iv_ruleVehicle= ruleVehicle EOF ;
    public final EObject entryRuleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicle = null;


        try {
            // InternalGrocery.g:849:48: (iv_ruleVehicle= ruleVehicle EOF )
            // InternalGrocery.g:850:2: iv_ruleVehicle= ruleVehicle EOF
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
    // InternalGrocery.g:856:1: ruleVehicle returns [EObject current=null] : (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGrocery.g:862:2: ( (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGrocery.g:863:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGrocery.g:863:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGrocery.g:864:3: otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVehicleAccess().getVehicleKeyword_0());
            		
            // InternalGrocery.g:868:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:869:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:869:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:870:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003000812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});

}
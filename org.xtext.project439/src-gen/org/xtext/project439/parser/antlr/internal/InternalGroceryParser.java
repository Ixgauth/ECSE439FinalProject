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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'warehouse'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'price'", "':'", "'perishableItem'", "'address'", "'street'", "'number'", "'city'", "'ExpirationDate'", "'month'", "'day'", "'year'", "'driver'", "'name'", "'vehicle'", "'plateNumber'"
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

                if ( (LA2_0==29||LA2_0==31) ) {
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

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
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

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
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

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
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
    // InternalGrocery.g:304:1: ruleWarehouse returns [EObject current=null] : (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) ) ( (lv_elements_4_0= ruleItem ) )* otherlv_5= '}' ) ;
    public final EObject ruleWarehouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_address_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:310:2: ( (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) ) ( (lv_elements_4_0= ruleItem ) )* otherlv_5= '}' ) )
            // InternalGrocery.g:311:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) ) ( (lv_elements_4_0= ruleItem ) )* otherlv_5= '}' )
            {
            // InternalGrocery.g:311:2: (otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) ) ( (lv_elements_4_0= ruleItem ) )* otherlv_5= '}' )
            // InternalGrocery.g:312:3: otherlv_0= 'warehouse' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) ) ( (lv_elements_4_0= ruleItem ) )* otherlv_5= '}'
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
            		
            // InternalGrocery.g:338:3: ( (lv_address_3_0= ruleAddress ) )
            // InternalGrocery.g:339:4: (lv_address_3_0= ruleAddress )
            {
            // InternalGrocery.g:339:4: (lv_address_3_0= ruleAddress )
            // InternalGrocery.g:340:5: lv_address_3_0= ruleAddress
            {

            					newCompositeNode(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_address_3_0=ruleAddress();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWarehouseRule());
            					}
            					add(
            						current,
            						"address",
            						lv_address_3_0,
            						"org.xtext.project439.Grocery.Address");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGrocery.g:357:3: ( (lv_elements_4_0= ruleItem ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrocery.g:358:4: (lv_elements_4_0= ruleItem )
            	    {
            	    // InternalGrocery.g:358:4: (lv_elements_4_0= ruleItem )
            	    // InternalGrocery.g:359:5: lv_elements_4_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_4_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWarehouseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.project439.Grocery.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalGrocery.g:384:1: entryRuleShelf returns [EObject current=null] : iv_ruleShelf= ruleShelf EOF ;
    public final EObject entryRuleShelf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShelf = null;


        try {
            // InternalGrocery.g:384:46: (iv_ruleShelf= ruleShelf EOF )
            // InternalGrocery.g:385:2: iv_ruleShelf= ruleShelf EOF
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
    // InternalGrocery.g:391:1: ruleShelf returns [EObject current=null] : (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleShelf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:397:2: ( (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:398:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:398:2: (otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            // InternalGrocery.g:399:3: otherlv_0= 'shelf' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getShelfAccess().getShelfKeyword_0());
            		
            // InternalGrocery.g:403:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:404:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:404:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:405:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:425:3: ( (lv_elements_3_0= ruleItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrocery.g:426:4: (lv_elements_3_0= ruleItem )
            	    {
            	    // InternalGrocery.g:426:4: (lv_elements_3_0= ruleItem )
            	    // InternalGrocery.g:427:5: lv_elements_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:452:1: entryRuleBackroom returns [EObject current=null] : iv_ruleBackroom= ruleBackroom EOF ;
    public final EObject entryRuleBackroom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackroom = null;


        try {
            // InternalGrocery.g:452:49: (iv_ruleBackroom= ruleBackroom EOF )
            // InternalGrocery.g:453:2: iv_ruleBackroom= ruleBackroom EOF
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
    // InternalGrocery.g:459:1: ruleBackroom returns [EObject current=null] : (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) ;
    public final EObject ruleBackroom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalGrocery.g:465:2: ( (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' ) )
            // InternalGrocery.g:466:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            {
            // InternalGrocery.g:466:2: (otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}' )
            // InternalGrocery.g:467:3: otherlv_0= 'backroom' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleItem ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBackroomAccess().getBackroomKeyword_0());
            		
            // InternalGrocery.g:471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:472:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:473:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGrocery.g:493:3: ( (lv_elements_3_0= ruleItem ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrocery.g:494:4: (lv_elements_3_0= ruleItem )
            	    {
            	    // InternalGrocery.g:494:4: (lv_elements_3_0= ruleItem )
            	    // InternalGrocery.g:495:5: lv_elements_3_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:520:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalGrocery.g:520:45: (iv_ruleItem= ruleItem EOF )
            // InternalGrocery.g:521:2: iv_ruleItem= ruleItem EOF
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
    // InternalGrocery.g:527:1: ruleItem returns [EObject current=null] : (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_PerishableItem_0 = null;

        EObject this_NonPerishableItem_1 = null;



        	enterRule();

        try {
            // InternalGrocery.g:533:2: ( (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem ) )
            // InternalGrocery.g:534:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            {
            // InternalGrocery.g:534:2: (this_PerishableItem_0= rulePerishableItem | this_NonPerishableItem_1= ruleNonPerishableItem )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGrocery.g:535:3: this_PerishableItem_0= rulePerishableItem
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
                    // InternalGrocery.g:544:3: this_NonPerishableItem_1= ruleNonPerishableItem
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
    // InternalGrocery.g:556:1: entryRuleNonPerishableItem returns [EObject current=null] : iv_ruleNonPerishableItem= ruleNonPerishableItem EOF ;
    public final EObject entryRuleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonPerishableItem = null;


        try {
            // InternalGrocery.g:556:58: (iv_ruleNonPerishableItem= ruleNonPerishableItem EOF )
            // InternalGrocery.g:557:2: iv_ruleNonPerishableItem= ruleNonPerishableItem EOF
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
    // InternalGrocery.g:563:1: ruleNonPerishableItem returns [EObject current=null] : (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) otherlv_6= '}' ) ;
    public final EObject ruleNonPerishableItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_price_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGrocery.g:569:2: ( (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) otherlv_6= '}' ) )
            // InternalGrocery.g:570:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) otherlv_6= '}' )
            {
            // InternalGrocery.g:570:2: (otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) otherlv_6= '}' )
            // InternalGrocery.g:571:3: otherlv_0= 'nonPerishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0());
            		
            // InternalGrocery.g:575:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:576:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:576:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:577:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNonPerishableItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getNonPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:605:3: ( (lv_price_5_0= RULE_INT ) )
            // InternalGrocery.g:606:4: (lv_price_5_0= RULE_INT )
            {
            // InternalGrocery.g:606:4: (lv_price_5_0= RULE_INT )
            // InternalGrocery.g:607:5: lv_price_5_0= RULE_INT
            {
            lv_price_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_price_5_0, grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonPerishableItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalGrocery.g:631:1: entryRulePerishableItem returns [EObject current=null] : iv_rulePerishableItem= rulePerishableItem EOF ;
    public final EObject entryRulePerishableItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerishableItem = null;


        try {
            // InternalGrocery.g:631:55: (iv_rulePerishableItem= rulePerishableItem EOF )
            // InternalGrocery.g:632:2: iv_rulePerishableItem= rulePerishableItem EOF
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
    // InternalGrocery.g:638:1: rulePerishableItem returns [EObject current=null] : (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' ) ;
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
            // InternalGrocery.g:644:2: ( (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' ) )
            // InternalGrocery.g:645:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' )
            {
            // InternalGrocery.g:645:2: (otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}' )
            // InternalGrocery.g:646:3: otherlv_0= 'perishableItem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'price' otherlv_4= ':' ( (lv_price_5_0= RULE_INT ) ) ( (lv_experationDate_6_0= ruleExperationDate ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0());
            		
            // InternalGrocery.g:650:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:651:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:651:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:652:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getPerishableItemAccess().getPriceKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getPerishableItemAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:680:3: ( (lv_price_5_0= RULE_INT ) )
            // InternalGrocery.g:681:4: (lv_price_5_0= RULE_INT )
            {
            // InternalGrocery.g:681:4: (lv_price_5_0= RULE_INT )
            // InternalGrocery.g:682:5: lv_price_5_0= RULE_INT
            {
            lv_price_5_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            // InternalGrocery.g:698:3: ( (lv_experationDate_6_0= ruleExperationDate ) )
            // InternalGrocery.g:699:4: (lv_experationDate_6_0= ruleExperationDate )
            {
            // InternalGrocery.g:699:4: (lv_experationDate_6_0= ruleExperationDate )
            // InternalGrocery.g:700:5: lv_experationDate_6_0= ruleExperationDate
            {

            					newCompositeNode(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
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


    // $ANTLR start "entryRuleAddress"
    // InternalGrocery.g:725:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalGrocery.g:725:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalGrocery.g:726:2: iv_ruleAddress= ruleAddress EOF
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
    // InternalGrocery.g:732:1: ruleAddress returns [EObject current=null] : (otherlv_0= 'address' otherlv_1= '{' otherlv_2= 'street' otherlv_3= ':' ( (lv_street_4_0= RULE_STRING ) ) otherlv_5= 'number' otherlv_6= ':' ( (lv_number_7_0= RULE_INT ) ) otherlv_8= 'city' otherlv_9= ':' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_street_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_number_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_city_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalGrocery.g:738:2: ( (otherlv_0= 'address' otherlv_1= '{' otherlv_2= 'street' otherlv_3= ':' ( (lv_street_4_0= RULE_STRING ) ) otherlv_5= 'number' otherlv_6= ':' ( (lv_number_7_0= RULE_INT ) ) otherlv_8= 'city' otherlv_9= ':' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalGrocery.g:739:2: (otherlv_0= 'address' otherlv_1= '{' otherlv_2= 'street' otherlv_3= ':' ( (lv_street_4_0= RULE_STRING ) ) otherlv_5= 'number' otherlv_6= ':' ( (lv_number_7_0= RULE_INT ) ) otherlv_8= 'city' otherlv_9= ':' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalGrocery.g:739:2: (otherlv_0= 'address' otherlv_1= '{' otherlv_2= 'street' otherlv_3= ':' ( (lv_street_4_0= RULE_STRING ) ) otherlv_5= 'number' otherlv_6= ':' ( (lv_number_7_0= RULE_INT ) ) otherlv_8= 'city' otherlv_9= ':' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalGrocery.g:740:3: otherlv_0= 'address' otherlv_1= '{' otherlv_2= 'street' otherlv_3= ':' ( (lv_street_4_0= RULE_STRING ) ) otherlv_5= 'number' otherlv_6= ':' ( (lv_number_7_0= RULE_INT ) ) otherlv_8= 'city' otherlv_9= ':' ( (lv_city_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getAddressKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getStreetKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAddressAccess().getColonKeyword_3());
            		
            // InternalGrocery.g:756:3: ( (lv_street_4_0= RULE_STRING ) )
            // InternalGrocery.g:757:4: (lv_street_4_0= RULE_STRING )
            {
            // InternalGrocery.g:757:4: (lv_street_4_0= RULE_STRING )
            // InternalGrocery.g:758:5: lv_street_4_0= RULE_STRING
            {
            lv_street_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_street_4_0, grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"street",
            						lv_street_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getNumberKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getAddressAccess().getColonKeyword_6());
            		
            // InternalGrocery.g:782:3: ( (lv_number_7_0= RULE_INT ) )
            // InternalGrocery.g:783:4: (lv_number_7_0= RULE_INT )
            {
            // InternalGrocery.g:783:4: (lv_number_7_0= RULE_INT )
            // InternalGrocery.g:784:5: lv_number_7_0= RULE_INT
            {
            lv_number_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_number_7_0, grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getAddressAccess().getCityKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getAddressAccess().getColonKeyword_9());
            		
            // InternalGrocery.g:808:3: ( (lv_city_10_0= RULE_STRING ) )
            // InternalGrocery.g:809:4: (lv_city_10_0= RULE_STRING )
            {
            // InternalGrocery.g:809:4: (lv_city_10_0= RULE_STRING )
            // InternalGrocery.g:810:5: lv_city_10_0= RULE_STRING
            {
            lv_city_10_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_city_10_0, grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"city",
            						lv_city_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalGrocery.g:834:1: entryRuleExperationDate returns [EObject current=null] : iv_ruleExperationDate= ruleExperationDate EOF ;
    public final EObject entryRuleExperationDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperationDate = null;


        try {
            // InternalGrocery.g:834:55: (iv_ruleExperationDate= ruleExperationDate EOF )
            // InternalGrocery.g:835:2: iv_ruleExperationDate= ruleExperationDate EOF
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
    // InternalGrocery.g:841:1: ruleExperationDate returns [EObject current=null] : (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'month' otherlv_3= ':' ( (lv_month_4_0= RULE_INT ) ) otherlv_5= 'day' otherlv_6= ':' ( (lv_day_7_0= RULE_INT ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' ) ;
    public final EObject ruleExperationDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_month_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_day_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_year_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalGrocery.g:847:2: ( (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'month' otherlv_3= ':' ( (lv_month_4_0= RULE_INT ) ) otherlv_5= 'day' otherlv_6= ':' ( (lv_day_7_0= RULE_INT ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' ) )
            // InternalGrocery.g:848:2: (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'month' otherlv_3= ':' ( (lv_month_4_0= RULE_INT ) ) otherlv_5= 'day' otherlv_6= ':' ( (lv_day_7_0= RULE_INT ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' )
            {
            // InternalGrocery.g:848:2: (otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'month' otherlv_3= ':' ( (lv_month_4_0= RULE_INT ) ) otherlv_5= 'day' otherlv_6= ':' ( (lv_day_7_0= RULE_INT ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}' )
            // InternalGrocery.g:849:3: otherlv_0= 'ExpirationDate' otherlv_1= '{' otherlv_2= 'month' otherlv_3= ':' ( (lv_month_4_0= RULE_INT ) ) otherlv_5= 'day' otherlv_6= ':' ( (lv_day_7_0= RULE_INT ) ) otherlv_8= 'year' otherlv_9= ':' ( (lv_year_10_0= RULE_INT ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExperationDateAccess().getExpirationDateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getExperationDateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getExperationDateAccess().getMonthKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getExperationDateAccess().getColonKeyword_3());
            		
            // InternalGrocery.g:865:3: ( (lv_month_4_0= RULE_INT ) )
            // InternalGrocery.g:866:4: (lv_month_4_0= RULE_INT )
            {
            // InternalGrocery.g:866:4: (lv_month_4_0= RULE_INT )
            // InternalGrocery.g:867:5: lv_month_4_0= RULE_INT
            {
            lv_month_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_month_4_0, grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperationDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"month",
            						lv_month_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getExperationDateAccess().getDayKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getExperationDateAccess().getColonKeyword_6());
            		
            // InternalGrocery.g:891:3: ( (lv_day_7_0= RULE_INT ) )
            // InternalGrocery.g:892:4: (lv_day_7_0= RULE_INT )
            {
            // InternalGrocery.g:892:4: (lv_day_7_0= RULE_INT )
            // InternalGrocery.g:893:5: lv_day_7_0= RULE_INT
            {
            lv_day_7_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_day_7_0, grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperationDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"day",
            						lv_day_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getExperationDateAccess().getYearKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getExperationDateAccess().getColonKeyword_9());
            		
            // InternalGrocery.g:917:3: ( (lv_year_10_0= RULE_INT ) )
            // InternalGrocery.g:918:4: (lv_year_10_0= RULE_INT )
            {
            // InternalGrocery.g:918:4: (lv_year_10_0= RULE_INT )
            // InternalGrocery.g:919:5: lv_year_10_0= RULE_INT
            {
            lv_year_10_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_year_10_0, grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperationDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_10_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getExperationDateAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalGrocery.g:943:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // InternalGrocery.g:943:47: (iv_ruleDriver= ruleDriver EOF )
            // InternalGrocery.g:944:2: iv_ruleDriver= ruleDriver EOF
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
    // InternalGrocery.g:950:1: ruleDriver returns [EObject current=null] : (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalGrocery.g:956:2: ( (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalGrocery.g:957:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalGrocery.g:957:2: (otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalGrocery.g:958:3: otherlv_0= 'driver' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_driverName_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDriverAccess().getDriverKeyword_0());
            		
            // InternalGrocery.g:962:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:963:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:963:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:964:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getDriverAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:992:3: ( (lv_driverName_5_0= RULE_STRING ) )
            // InternalGrocery.g:993:4: (lv_driverName_5_0= RULE_STRING )
            {
            // InternalGrocery.g:993:4: (lv_driverName_5_0= RULE_STRING )
            // InternalGrocery.g:994:5: lv_driverName_5_0= RULE_STRING
            {
            lv_driverName_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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
    // InternalGrocery.g:1018:1: entryRuleVehicle returns [EObject current=null] : iv_ruleVehicle= ruleVehicle EOF ;
    public final EObject entryRuleVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicle = null;


        try {
            // InternalGrocery.g:1018:48: (iv_ruleVehicle= ruleVehicle EOF )
            // InternalGrocery.g:1019:2: iv_ruleVehicle= ruleVehicle EOF
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
    // InternalGrocery.g:1025:1: ruleVehicle returns [EObject current=null] : (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalGrocery.g:1031:2: ( (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalGrocery.g:1032:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalGrocery.g:1032:2: (otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalGrocery.g:1033:3: otherlv_0= 'vehicle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'plateNumber' otherlv_4= ':' ( (lv_plateNumber_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVehicleAccess().getVehicleKeyword_0());
            		
            // InternalGrocery.g:1037:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGrocery.g:1038:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGrocery.g:1038:4: (lv_name_1_0= RULE_ID )
            // InternalGrocery.g:1039:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getVehicleAccess().getPlateNumberKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getVehicleAccess().getColonKeyword_4());
            		
            // InternalGrocery.g:1067:3: ( (lv_plateNumber_5_0= RULE_STRING ) )
            // InternalGrocery.g:1068:4: (lv_plateNumber_5_0= RULE_STRING )
            {
            // InternalGrocery.g:1068:4: (lv_plateNumber_5_0= RULE_STRING )
            // InternalGrocery.g:1069:5: lv_plateNumber_5_0= RULE_STRING
            {
            lv_plateNumber_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000A0004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000122000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});

}
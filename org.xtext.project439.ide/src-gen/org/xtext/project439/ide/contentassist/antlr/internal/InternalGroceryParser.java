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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGroceryParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleGrocery"
    // InternalGrocery.g:53:1: entryRuleGrocery : ruleGrocery EOF ;
    public final void entryRuleGrocery() throws RecognitionException {
        try {
            // InternalGrocery.g:54:1: ( ruleGrocery EOF )
            // InternalGrocery.g:55:1: ruleGrocery EOF
            {
             before(grammarAccess.getGroceryRule()); 
            pushFollow(FOLLOW_1);
            ruleGrocery();

            state._fsp--;

             after(grammarAccess.getGroceryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrocery"


    // $ANTLR start "ruleGrocery"
    // InternalGrocery.g:62:1: ruleGrocery : ( ( rule__Grocery__Group__0 ) ) ;
    public final void ruleGrocery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:66:2: ( ( ( rule__Grocery__Group__0 ) ) )
            // InternalGrocery.g:67:2: ( ( rule__Grocery__Group__0 ) )
            {
            // InternalGrocery.g:67:2: ( ( rule__Grocery__Group__0 ) )
            // InternalGrocery.g:68:3: ( rule__Grocery__Group__0 )
            {
             before(grammarAccess.getGroceryAccess().getGroup()); 
            // InternalGrocery.g:69:3: ( rule__Grocery__Group__0 )
            // InternalGrocery.g:69:4: rule__Grocery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grocery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroceryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrocery"


    // $ANTLR start "entryRuleBuilding"
    // InternalGrocery.g:78:1: entryRuleBuilding : ruleBuilding EOF ;
    public final void entryRuleBuilding() throws RecognitionException {
        try {
            // InternalGrocery.g:79:1: ( ruleBuilding EOF )
            // InternalGrocery.g:80:1: ruleBuilding EOF
            {
             before(grammarAccess.getBuildingRule()); 
            pushFollow(FOLLOW_1);
            ruleBuilding();

            state._fsp--;

             after(grammarAccess.getBuildingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuilding"


    // $ANTLR start "ruleBuilding"
    // InternalGrocery.g:87:1: ruleBuilding : ( ( rule__Building__Alternatives ) ) ;
    public final void ruleBuilding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:91:2: ( ( ( rule__Building__Alternatives ) ) )
            // InternalGrocery.g:92:2: ( ( rule__Building__Alternatives ) )
            {
            // InternalGrocery.g:92:2: ( ( rule__Building__Alternatives ) )
            // InternalGrocery.g:93:3: ( rule__Building__Alternatives )
            {
             before(grammarAccess.getBuildingAccess().getAlternatives()); 
            // InternalGrocery.g:94:3: ( rule__Building__Alternatives )
            // InternalGrocery.g:94:4: rule__Building__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Building__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuildingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuilding"


    // $ANTLR start "entryRuleStoreElements"
    // InternalGrocery.g:103:1: entryRuleStoreElements : ruleStoreElements EOF ;
    public final void entryRuleStoreElements() throws RecognitionException {
        try {
            // InternalGrocery.g:104:1: ( ruleStoreElements EOF )
            // InternalGrocery.g:105:1: ruleStoreElements EOF
            {
             before(grammarAccess.getStoreElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStoreElements();

            state._fsp--;

             after(grammarAccess.getStoreElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStoreElements"


    // $ANTLR start "ruleStoreElements"
    // InternalGrocery.g:112:1: ruleStoreElements : ( ( rule__StoreElements__Alternatives ) ) ;
    public final void ruleStoreElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:116:2: ( ( ( rule__StoreElements__Alternatives ) ) )
            // InternalGrocery.g:117:2: ( ( rule__StoreElements__Alternatives ) )
            {
            // InternalGrocery.g:117:2: ( ( rule__StoreElements__Alternatives ) )
            // InternalGrocery.g:118:3: ( rule__StoreElements__Alternatives )
            {
             before(grammarAccess.getStoreElementsAccess().getAlternatives()); 
            // InternalGrocery.g:119:3: ( rule__StoreElements__Alternatives )
            // InternalGrocery.g:119:4: rule__StoreElements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StoreElements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoreElements"


    // $ANTLR start "entryRuleDeliveryElement"
    // InternalGrocery.g:128:1: entryRuleDeliveryElement : ruleDeliveryElement EOF ;
    public final void entryRuleDeliveryElement() throws RecognitionException {
        try {
            // InternalGrocery.g:129:1: ( ruleDeliveryElement EOF )
            // InternalGrocery.g:130:1: ruleDeliveryElement EOF
            {
             before(grammarAccess.getDeliveryElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDeliveryElement();

            state._fsp--;

             after(grammarAccess.getDeliveryElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeliveryElement"


    // $ANTLR start "ruleDeliveryElement"
    // InternalGrocery.g:137:1: ruleDeliveryElement : ( ( rule__DeliveryElement__Alternatives ) ) ;
    public final void ruleDeliveryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:141:2: ( ( ( rule__DeliveryElement__Alternatives ) ) )
            // InternalGrocery.g:142:2: ( ( rule__DeliveryElement__Alternatives ) )
            {
            // InternalGrocery.g:142:2: ( ( rule__DeliveryElement__Alternatives ) )
            // InternalGrocery.g:143:3: ( rule__DeliveryElement__Alternatives )
            {
             before(grammarAccess.getDeliveryElementAccess().getAlternatives()); 
            // InternalGrocery.g:144:3: ( rule__DeliveryElement__Alternatives )
            // InternalGrocery.g:144:4: rule__DeliveryElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeliveryElement"


    // $ANTLR start "entryRuleStore"
    // InternalGrocery.g:153:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalGrocery.g:154:1: ( ruleStore EOF )
            // InternalGrocery.g:155:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalGrocery.g:162:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:166:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalGrocery.g:167:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalGrocery.g:167:2: ( ( rule__Store__Group__0 ) )
            // InternalGrocery.g:168:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalGrocery.g:169:3: ( rule__Store__Group__0 )
            // InternalGrocery.g:169:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleWarehouse"
    // InternalGrocery.g:178:1: entryRuleWarehouse : ruleWarehouse EOF ;
    public final void entryRuleWarehouse() throws RecognitionException {
        try {
            // InternalGrocery.g:179:1: ( ruleWarehouse EOF )
            // InternalGrocery.g:180:1: ruleWarehouse EOF
            {
             before(grammarAccess.getWarehouseRule()); 
            pushFollow(FOLLOW_1);
            ruleWarehouse();

            state._fsp--;

             after(grammarAccess.getWarehouseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWarehouse"


    // $ANTLR start "ruleWarehouse"
    // InternalGrocery.g:187:1: ruleWarehouse : ( ( rule__Warehouse__Group__0 ) ) ;
    public final void ruleWarehouse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:191:2: ( ( ( rule__Warehouse__Group__0 ) ) )
            // InternalGrocery.g:192:2: ( ( rule__Warehouse__Group__0 ) )
            {
            // InternalGrocery.g:192:2: ( ( rule__Warehouse__Group__0 ) )
            // InternalGrocery.g:193:3: ( rule__Warehouse__Group__0 )
            {
             before(grammarAccess.getWarehouseAccess().getGroup()); 
            // InternalGrocery.g:194:3: ( rule__Warehouse__Group__0 )
            // InternalGrocery.g:194:4: rule__Warehouse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWarehouse"


    // $ANTLR start "entryRuleShelf"
    // InternalGrocery.g:203:1: entryRuleShelf : ruleShelf EOF ;
    public final void entryRuleShelf() throws RecognitionException {
        try {
            // InternalGrocery.g:204:1: ( ruleShelf EOF )
            // InternalGrocery.g:205:1: ruleShelf EOF
            {
             before(grammarAccess.getShelfRule()); 
            pushFollow(FOLLOW_1);
            ruleShelf();

            state._fsp--;

             after(grammarAccess.getShelfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShelf"


    // $ANTLR start "ruleShelf"
    // InternalGrocery.g:212:1: ruleShelf : ( ( rule__Shelf__Group__0 ) ) ;
    public final void ruleShelf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:216:2: ( ( ( rule__Shelf__Group__0 ) ) )
            // InternalGrocery.g:217:2: ( ( rule__Shelf__Group__0 ) )
            {
            // InternalGrocery.g:217:2: ( ( rule__Shelf__Group__0 ) )
            // InternalGrocery.g:218:3: ( rule__Shelf__Group__0 )
            {
             before(grammarAccess.getShelfAccess().getGroup()); 
            // InternalGrocery.g:219:3: ( rule__Shelf__Group__0 )
            // InternalGrocery.g:219:4: rule__Shelf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shelf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShelfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShelf"


    // $ANTLR start "entryRuleBackroom"
    // InternalGrocery.g:228:1: entryRuleBackroom : ruleBackroom EOF ;
    public final void entryRuleBackroom() throws RecognitionException {
        try {
            // InternalGrocery.g:229:1: ( ruleBackroom EOF )
            // InternalGrocery.g:230:1: ruleBackroom EOF
            {
             before(grammarAccess.getBackroomRule()); 
            pushFollow(FOLLOW_1);
            ruleBackroom();

            state._fsp--;

             after(grammarAccess.getBackroomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackroom"


    // $ANTLR start "ruleBackroom"
    // InternalGrocery.g:237:1: ruleBackroom : ( ( rule__Backroom__Group__0 ) ) ;
    public final void ruleBackroom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:241:2: ( ( ( rule__Backroom__Group__0 ) ) )
            // InternalGrocery.g:242:2: ( ( rule__Backroom__Group__0 ) )
            {
            // InternalGrocery.g:242:2: ( ( rule__Backroom__Group__0 ) )
            // InternalGrocery.g:243:3: ( rule__Backroom__Group__0 )
            {
             before(grammarAccess.getBackroomAccess().getGroup()); 
            // InternalGrocery.g:244:3: ( rule__Backroom__Group__0 )
            // InternalGrocery.g:244:4: rule__Backroom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Backroom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackroomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackroom"


    // $ANTLR start "entryRuleItem"
    // InternalGrocery.g:253:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalGrocery.g:254:1: ( ruleItem EOF )
            // InternalGrocery.g:255:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalGrocery.g:262:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:266:2: ( ( ( rule__Item__Alternatives ) ) )
            // InternalGrocery.g:267:2: ( ( rule__Item__Alternatives ) )
            {
            // InternalGrocery.g:267:2: ( ( rule__Item__Alternatives ) )
            // InternalGrocery.g:268:3: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // InternalGrocery.g:269:3: ( rule__Item__Alternatives )
            // InternalGrocery.g:269:4: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Item__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleNonPerishableItem"
    // InternalGrocery.g:278:1: entryRuleNonPerishableItem : ruleNonPerishableItem EOF ;
    public final void entryRuleNonPerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:279:1: ( ruleNonPerishableItem EOF )
            // InternalGrocery.g:280:1: ruleNonPerishableItem EOF
            {
             before(grammarAccess.getNonPerishableItemRule()); 
            pushFollow(FOLLOW_1);
            ruleNonPerishableItem();

            state._fsp--;

             after(grammarAccess.getNonPerishableItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonPerishableItem"


    // $ANTLR start "ruleNonPerishableItem"
    // InternalGrocery.g:287:1: ruleNonPerishableItem : ( ( rule__NonPerishableItem__Group__0 ) ) ;
    public final void ruleNonPerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:291:2: ( ( ( rule__NonPerishableItem__Group__0 ) ) )
            // InternalGrocery.g:292:2: ( ( rule__NonPerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:292:2: ( ( rule__NonPerishableItem__Group__0 ) )
            // InternalGrocery.g:293:3: ( rule__NonPerishableItem__Group__0 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:294:3: ( rule__NonPerishableItem__Group__0 )
            // InternalGrocery.g:294:4: rule__NonPerishableItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonPerishableItem"


    // $ANTLR start "entryRulePerishableItem"
    // InternalGrocery.g:303:1: entryRulePerishableItem : rulePerishableItem EOF ;
    public final void entryRulePerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:304:1: ( rulePerishableItem EOF )
            // InternalGrocery.g:305:1: rulePerishableItem EOF
            {
             before(grammarAccess.getPerishableItemRule()); 
            pushFollow(FOLLOW_1);
            rulePerishableItem();

            state._fsp--;

             after(grammarAccess.getPerishableItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerishableItem"


    // $ANTLR start "rulePerishableItem"
    // InternalGrocery.g:312:1: rulePerishableItem : ( ( rule__PerishableItem__Group__0 ) ) ;
    public final void rulePerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:316:2: ( ( ( rule__PerishableItem__Group__0 ) ) )
            // InternalGrocery.g:317:2: ( ( rule__PerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:317:2: ( ( rule__PerishableItem__Group__0 ) )
            // InternalGrocery.g:318:3: ( rule__PerishableItem__Group__0 )
            {
             before(grammarAccess.getPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:319:3: ( rule__PerishableItem__Group__0 )
            // InternalGrocery.g:319:4: rule__PerishableItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerishableItem"


    // $ANTLR start "entryRuleAddress"
    // InternalGrocery.g:328:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalGrocery.g:329:1: ( ruleAddress EOF )
            // InternalGrocery.g:330:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalGrocery.g:337:1: ruleAddress : ( ( rule__Address__Group__0 ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:341:2: ( ( ( rule__Address__Group__0 ) ) )
            // InternalGrocery.g:342:2: ( ( rule__Address__Group__0 ) )
            {
            // InternalGrocery.g:342:2: ( ( rule__Address__Group__0 ) )
            // InternalGrocery.g:343:3: ( rule__Address__Group__0 )
            {
             before(grammarAccess.getAddressAccess().getGroup()); 
            // InternalGrocery.g:344:3: ( rule__Address__Group__0 )
            // InternalGrocery.g:344:4: rule__Address__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleExperationDate"
    // InternalGrocery.g:353:1: entryRuleExperationDate : ruleExperationDate EOF ;
    public final void entryRuleExperationDate() throws RecognitionException {
        try {
            // InternalGrocery.g:354:1: ( ruleExperationDate EOF )
            // InternalGrocery.g:355:1: ruleExperationDate EOF
            {
             before(grammarAccess.getExperationDateRule()); 
            pushFollow(FOLLOW_1);
            ruleExperationDate();

            state._fsp--;

             after(grammarAccess.getExperationDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperationDate"


    // $ANTLR start "ruleExperationDate"
    // InternalGrocery.g:362:1: ruleExperationDate : ( ( rule__ExperationDate__Group__0 ) ) ;
    public final void ruleExperationDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:366:2: ( ( ( rule__ExperationDate__Group__0 ) ) )
            // InternalGrocery.g:367:2: ( ( rule__ExperationDate__Group__0 ) )
            {
            // InternalGrocery.g:367:2: ( ( rule__ExperationDate__Group__0 ) )
            // InternalGrocery.g:368:3: ( rule__ExperationDate__Group__0 )
            {
             before(grammarAccess.getExperationDateAccess().getGroup()); 
            // InternalGrocery.g:369:3: ( rule__ExperationDate__Group__0 )
            // InternalGrocery.g:369:4: rule__ExperationDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperationDate"


    // $ANTLR start "entryRuleDriver"
    // InternalGrocery.g:378:1: entryRuleDriver : ruleDriver EOF ;
    public final void entryRuleDriver() throws RecognitionException {
        try {
            // InternalGrocery.g:379:1: ( ruleDriver EOF )
            // InternalGrocery.g:380:1: ruleDriver EOF
            {
             before(grammarAccess.getDriverRule()); 
            pushFollow(FOLLOW_1);
            ruleDriver();

            state._fsp--;

             after(grammarAccess.getDriverRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDriver"


    // $ANTLR start "ruleDriver"
    // InternalGrocery.g:387:1: ruleDriver : ( ( rule__Driver__Group__0 ) ) ;
    public final void ruleDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:391:2: ( ( ( rule__Driver__Group__0 ) ) )
            // InternalGrocery.g:392:2: ( ( rule__Driver__Group__0 ) )
            {
            // InternalGrocery.g:392:2: ( ( rule__Driver__Group__0 ) )
            // InternalGrocery.g:393:3: ( rule__Driver__Group__0 )
            {
             before(grammarAccess.getDriverAccess().getGroup()); 
            // InternalGrocery.g:394:3: ( rule__Driver__Group__0 )
            // InternalGrocery.g:394:4: rule__Driver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDriver"


    // $ANTLR start "entryRuleVehicle"
    // InternalGrocery.g:403:1: entryRuleVehicle : ruleVehicle EOF ;
    public final void entryRuleVehicle() throws RecognitionException {
        try {
            // InternalGrocery.g:404:1: ( ruleVehicle EOF )
            // InternalGrocery.g:405:1: ruleVehicle EOF
            {
             before(grammarAccess.getVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleVehicle();

            state._fsp--;

             after(grammarAccess.getVehicleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVehicle"


    // $ANTLR start "ruleVehicle"
    // InternalGrocery.g:412:1: ruleVehicle : ( ( rule__Vehicle__Group__0 ) ) ;
    public final void ruleVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:416:2: ( ( ( rule__Vehicle__Group__0 ) ) )
            // InternalGrocery.g:417:2: ( ( rule__Vehicle__Group__0 ) )
            {
            // InternalGrocery.g:417:2: ( ( rule__Vehicle__Group__0 ) )
            // InternalGrocery.g:418:3: ( rule__Vehicle__Group__0 )
            {
             before(grammarAccess.getVehicleAccess().getGroup()); 
            // InternalGrocery.g:419:3: ( rule__Vehicle__Group__0 )
            // InternalGrocery.g:419:4: rule__Vehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVehicleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVehicle"


    // $ANTLR start "rule__Building__Alternatives"
    // InternalGrocery.g:427:1: rule__Building__Alternatives : ( ( ruleStore ) | ( ruleWarehouse ) );
    public final void rule__Building__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:431:1: ( ( ruleStore ) | ( ruleWarehouse ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGrocery.g:432:2: ( ruleStore )
                    {
                    // InternalGrocery.g:432:2: ( ruleStore )
                    // InternalGrocery.g:433:3: ruleStore
                    {
                     before(grammarAccess.getBuildingAccess().getStoreParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getBuildingAccess().getStoreParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:438:2: ( ruleWarehouse )
                    {
                    // InternalGrocery.g:438:2: ( ruleWarehouse )
                    // InternalGrocery.g:439:3: ruleWarehouse
                    {
                     before(grammarAccess.getBuildingAccess().getWarehouseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWarehouse();

                    state._fsp--;

                     after(grammarAccess.getBuildingAccess().getWarehouseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Building__Alternatives"


    // $ANTLR start "rule__StoreElements__Alternatives"
    // InternalGrocery.g:448:1: rule__StoreElements__Alternatives : ( ( ruleBackroom ) | ( ruleShelf ) );
    public final void rule__StoreElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:452:1: ( ( ruleBackroom ) | ( ruleShelf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGrocery.g:453:2: ( ruleBackroom )
                    {
                    // InternalGrocery.g:453:2: ( ruleBackroom )
                    // InternalGrocery.g:454:3: ruleBackroom
                    {
                     before(grammarAccess.getStoreElementsAccess().getBackroomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBackroom();

                    state._fsp--;

                     after(grammarAccess.getStoreElementsAccess().getBackroomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:459:2: ( ruleShelf )
                    {
                    // InternalGrocery.g:459:2: ( ruleShelf )
                    // InternalGrocery.g:460:3: ruleShelf
                    {
                     before(grammarAccess.getStoreElementsAccess().getShelfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleShelf();

                    state._fsp--;

                     after(grammarAccess.getStoreElementsAccess().getShelfParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElements__Alternatives"


    // $ANTLR start "rule__DeliveryElement__Alternatives"
    // InternalGrocery.g:469:1: rule__DeliveryElement__Alternatives : ( ( ruleDriver ) | ( ruleVehicle ) );
    public final void rule__DeliveryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:473:1: ( ( ruleDriver ) | ( ruleVehicle ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGrocery.g:474:2: ( ruleDriver )
                    {
                    // InternalGrocery.g:474:2: ( ruleDriver )
                    // InternalGrocery.g:475:3: ruleDriver
                    {
                     before(grammarAccess.getDeliveryElementAccess().getDriverParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDriver();

                    state._fsp--;

                     after(grammarAccess.getDeliveryElementAccess().getDriverParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:480:2: ( ruleVehicle )
                    {
                    // InternalGrocery.g:480:2: ( ruleVehicle )
                    // InternalGrocery.g:481:3: ruleVehicle
                    {
                     before(grammarAccess.getDeliveryElementAccess().getVehicleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVehicle();

                    state._fsp--;

                     after(grammarAccess.getDeliveryElementAccess().getVehicleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryElement__Alternatives"


    // $ANTLR start "rule__Item__Alternatives"
    // InternalGrocery.g:490:1: rule__Item__Alternatives : ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:494:1: ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
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
                    // InternalGrocery.g:495:2: ( rulePerishableItem )
                    {
                    // InternalGrocery.g:495:2: ( rulePerishableItem )
                    // InternalGrocery.g:496:3: rulePerishableItem
                    {
                     before(grammarAccess.getItemAccess().getPerishableItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePerishableItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getPerishableItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:501:2: ( ruleNonPerishableItem )
                    {
                    // InternalGrocery.g:501:2: ( ruleNonPerishableItem )
                    // InternalGrocery.g:502:3: ruleNonPerishableItem
                    {
                     before(grammarAccess.getItemAccess().getNonPerishableItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonPerishableItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getNonPerishableItemParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__Grocery__Group__0"
    // InternalGrocery.g:511:1: rule__Grocery__Group__0 : rule__Grocery__Group__0__Impl rule__Grocery__Group__1 ;
    public final void rule__Grocery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:515:1: ( rule__Grocery__Group__0__Impl rule__Grocery__Group__1 )
            // InternalGrocery.g:516:2: rule__Grocery__Group__0__Impl rule__Grocery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Grocery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grocery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__Group__0"


    // $ANTLR start "rule__Grocery__Group__0__Impl"
    // InternalGrocery.g:523:1: rule__Grocery__Group__0__Impl : ( ( rule__Grocery__ElementsAssignment_0 )* ) ;
    public final void rule__Grocery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:527:1: ( ( ( rule__Grocery__ElementsAssignment_0 )* ) )
            // InternalGrocery.g:528:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            {
            // InternalGrocery.g:528:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            // InternalGrocery.g:529:2: ( rule__Grocery__ElementsAssignment_0 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_0()); 
            // InternalGrocery.g:530:2: ( rule__Grocery__ElementsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrocery.g:530:3: rule__Grocery__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Grocery__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGroceryAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__Group__0__Impl"


    // $ANTLR start "rule__Grocery__Group__1"
    // InternalGrocery.g:538:1: rule__Grocery__Group__1 : rule__Grocery__Group__1__Impl ;
    public final void rule__Grocery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:542:1: ( rule__Grocery__Group__1__Impl )
            // InternalGrocery.g:543:2: rule__Grocery__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grocery__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__Group__1"


    // $ANTLR start "rule__Grocery__Group__1__Impl"
    // InternalGrocery.g:549:1: rule__Grocery__Group__1__Impl : ( ( rule__Grocery__ElementsAssignment_1 )* ) ;
    public final void rule__Grocery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:553:1: ( ( ( rule__Grocery__ElementsAssignment_1 )* ) )
            // InternalGrocery.g:554:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            {
            // InternalGrocery.g:554:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            // InternalGrocery.g:555:2: ( rule__Grocery__ElementsAssignment_1 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_1()); 
            // InternalGrocery.g:556:2: ( rule__Grocery__ElementsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29||LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGrocery.g:556:3: rule__Grocery__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Grocery__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGroceryAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalGrocery.g:565:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:569:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalGrocery.g:570:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalGrocery.g:577:1: rule__Store__Group__0__Impl : ( 'store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:581:1: ( ( 'store' ) )
            // InternalGrocery.g:582:1: ( 'store' )
            {
            // InternalGrocery.g:582:1: ( 'store' )
            // InternalGrocery.g:583:2: 'store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalGrocery.g:592:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:596:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalGrocery.g:597:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Store__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalGrocery.g:604:1: rule__Store__Group__1__Impl : ( ( rule__Store__NameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:608:1: ( ( ( rule__Store__NameAssignment_1 ) ) )
            // InternalGrocery.g:609:1: ( ( rule__Store__NameAssignment_1 ) )
            {
            // InternalGrocery.g:609:1: ( ( rule__Store__NameAssignment_1 ) )
            // InternalGrocery.g:610:2: ( rule__Store__NameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getNameAssignment_1()); 
            // InternalGrocery.g:611:2: ( rule__Store__NameAssignment_1 )
            // InternalGrocery.g:611:3: rule__Store__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Store__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__2"
    // InternalGrocery.g:619:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:623:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalGrocery.g:624:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Store__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2"


    // $ANTLR start "rule__Store__Group__2__Impl"
    // InternalGrocery.g:631:1: rule__Store__Group__2__Impl : ( '{' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:635:1: ( ( '{' ) )
            // InternalGrocery.g:636:1: ( '{' )
            {
            // InternalGrocery.g:636:1: ( '{' )
            // InternalGrocery.g:637:2: '{'
            {
             before(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2__Impl"


    // $ANTLR start "rule__Store__Group__3"
    // InternalGrocery.g:646:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:650:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalGrocery.g:651:2: rule__Store__Group__3__Impl rule__Store__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Store__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3"


    // $ANTLR start "rule__Store__Group__3__Impl"
    // InternalGrocery.g:658:1: rule__Store__Group__3__Impl : ( ( rule__Store__ElementsAssignment_3 )* ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:662:1: ( ( ( rule__Store__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:663:1: ( ( rule__Store__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:663:1: ( ( rule__Store__ElementsAssignment_3 )* )
            // InternalGrocery.g:664:2: ( rule__Store__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStoreAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:665:2: ( rule__Store__ElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=15 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrocery.g:665:3: rule__Store__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Store__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStoreAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3__Impl"


    // $ANTLR start "rule__Store__Group__4"
    // InternalGrocery.g:673:1: rule__Store__Group__4 : rule__Store__Group__4__Impl ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:677:1: ( rule__Store__Group__4__Impl )
            // InternalGrocery.g:678:2: rule__Store__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4"


    // $ANTLR start "rule__Store__Group__4__Impl"
    // InternalGrocery.g:684:1: rule__Store__Group__4__Impl : ( '}' ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:688:1: ( ( '}' ) )
            // InternalGrocery.g:689:1: ( '}' )
            {
            // InternalGrocery.g:689:1: ( '}' )
            // InternalGrocery.g:690:2: '}'
            {
             before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4__Impl"


    // $ANTLR start "rule__Warehouse__Group__0"
    // InternalGrocery.g:700:1: rule__Warehouse__Group__0 : rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 ;
    public final void rule__Warehouse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:704:1: ( rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 )
            // InternalGrocery.g:705:2: rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Warehouse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__0"


    // $ANTLR start "rule__Warehouse__Group__0__Impl"
    // InternalGrocery.g:712:1: rule__Warehouse__Group__0__Impl : ( 'warehouse' ) ;
    public final void rule__Warehouse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:716:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:717:1: ( 'warehouse' )
            {
            // InternalGrocery.g:717:1: ( 'warehouse' )
            // InternalGrocery.g:718:2: 'warehouse'
            {
             before(grammarAccess.getWarehouseAccess().getWarehouseKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getWarehouseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__0__Impl"


    // $ANTLR start "rule__Warehouse__Group__1"
    // InternalGrocery.g:727:1: rule__Warehouse__Group__1 : rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 ;
    public final void rule__Warehouse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:731:1: ( rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 )
            // InternalGrocery.g:732:2: rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Warehouse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__1"


    // $ANTLR start "rule__Warehouse__Group__1__Impl"
    // InternalGrocery.g:739:1: rule__Warehouse__Group__1__Impl : ( ( rule__Warehouse__NameAssignment_1 ) ) ;
    public final void rule__Warehouse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:743:1: ( ( ( rule__Warehouse__NameAssignment_1 ) ) )
            // InternalGrocery.g:744:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            {
            // InternalGrocery.g:744:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            // InternalGrocery.g:745:2: ( rule__Warehouse__NameAssignment_1 )
            {
             before(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 
            // InternalGrocery.g:746:2: ( rule__Warehouse__NameAssignment_1 )
            // InternalGrocery.g:746:3: rule__Warehouse__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__1__Impl"


    // $ANTLR start "rule__Warehouse__Group__2"
    // InternalGrocery.g:754:1: rule__Warehouse__Group__2 : rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 ;
    public final void rule__Warehouse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:758:1: ( rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 )
            // InternalGrocery.g:759:2: rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Warehouse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__2"


    // $ANTLR start "rule__Warehouse__Group__2__Impl"
    // InternalGrocery.g:766:1: rule__Warehouse__Group__2__Impl : ( '{' ) ;
    public final void rule__Warehouse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:770:1: ( ( '{' ) )
            // InternalGrocery.g:771:1: ( '{' )
            {
            // InternalGrocery.g:771:1: ( '{' )
            // InternalGrocery.g:772:2: '{'
            {
             before(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__2__Impl"


    // $ANTLR start "rule__Warehouse__Group__3"
    // InternalGrocery.g:781:1: rule__Warehouse__Group__3 : rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 ;
    public final void rule__Warehouse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:785:1: ( rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 )
            // InternalGrocery.g:786:2: rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Warehouse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__3"


    // $ANTLR start "rule__Warehouse__Group__3__Impl"
    // InternalGrocery.g:793:1: rule__Warehouse__Group__3__Impl : ( ( rule__Warehouse__AddressAssignment_3 ) ) ;
    public final void rule__Warehouse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:797:1: ( ( ( rule__Warehouse__AddressAssignment_3 ) ) )
            // InternalGrocery.g:798:1: ( ( rule__Warehouse__AddressAssignment_3 ) )
            {
            // InternalGrocery.g:798:1: ( ( rule__Warehouse__AddressAssignment_3 ) )
            // InternalGrocery.g:799:2: ( rule__Warehouse__AddressAssignment_3 )
            {
             before(grammarAccess.getWarehouseAccess().getAddressAssignment_3()); 
            // InternalGrocery.g:800:2: ( rule__Warehouse__AddressAssignment_3 )
            // InternalGrocery.g:800:3: rule__Warehouse__AddressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__AddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getAddressAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__3__Impl"


    // $ANTLR start "rule__Warehouse__Group__4"
    // InternalGrocery.g:808:1: rule__Warehouse__Group__4 : rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 ;
    public final void rule__Warehouse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:812:1: ( rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 )
            // InternalGrocery.g:813:2: rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Warehouse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__4"


    // $ANTLR start "rule__Warehouse__Group__4__Impl"
    // InternalGrocery.g:820:1: rule__Warehouse__Group__4__Impl : ( ( rule__Warehouse__ElementsAssignment_4 )* ) ;
    public final void rule__Warehouse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:824:1: ( ( ( rule__Warehouse__ElementsAssignment_4 )* ) )
            // InternalGrocery.g:825:1: ( ( rule__Warehouse__ElementsAssignment_4 )* )
            {
            // InternalGrocery.g:825:1: ( ( rule__Warehouse__ElementsAssignment_4 )* )
            // InternalGrocery.g:826:2: ( rule__Warehouse__ElementsAssignment_4 )*
            {
             before(grammarAccess.getWarehouseAccess().getElementsAssignment_4()); 
            // InternalGrocery.g:827:2: ( rule__Warehouse__ElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrocery.g:827:3: rule__Warehouse__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Warehouse__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWarehouseAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__4__Impl"


    // $ANTLR start "rule__Warehouse__Group__5"
    // InternalGrocery.g:835:1: rule__Warehouse__Group__5 : rule__Warehouse__Group__5__Impl ;
    public final void rule__Warehouse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:839:1: ( rule__Warehouse__Group__5__Impl )
            // InternalGrocery.g:840:2: rule__Warehouse__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__5"


    // $ANTLR start "rule__Warehouse__Group__5__Impl"
    // InternalGrocery.g:846:1: rule__Warehouse__Group__5__Impl : ( '}' ) ;
    public final void rule__Warehouse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:850:1: ( ( '}' ) )
            // InternalGrocery.g:851:1: ( '}' )
            {
            // InternalGrocery.g:851:1: ( '}' )
            // InternalGrocery.g:852:2: '}'
            {
             before(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__Group__5__Impl"


    // $ANTLR start "rule__Shelf__Group__0"
    // InternalGrocery.g:862:1: rule__Shelf__Group__0 : rule__Shelf__Group__0__Impl rule__Shelf__Group__1 ;
    public final void rule__Shelf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:866:1: ( rule__Shelf__Group__0__Impl rule__Shelf__Group__1 )
            // InternalGrocery.g:867:2: rule__Shelf__Group__0__Impl rule__Shelf__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Shelf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__0"


    // $ANTLR start "rule__Shelf__Group__0__Impl"
    // InternalGrocery.g:874:1: rule__Shelf__Group__0__Impl : ( 'shelf' ) ;
    public final void rule__Shelf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:878:1: ( ( 'shelf' ) )
            // InternalGrocery.g:879:1: ( 'shelf' )
            {
            // InternalGrocery.g:879:1: ( 'shelf' )
            // InternalGrocery.g:880:2: 'shelf'
            {
             before(grammarAccess.getShelfAccess().getShelfKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getShelfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__0__Impl"


    // $ANTLR start "rule__Shelf__Group__1"
    // InternalGrocery.g:889:1: rule__Shelf__Group__1 : rule__Shelf__Group__1__Impl rule__Shelf__Group__2 ;
    public final void rule__Shelf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:893:1: ( rule__Shelf__Group__1__Impl rule__Shelf__Group__2 )
            // InternalGrocery.g:894:2: rule__Shelf__Group__1__Impl rule__Shelf__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Shelf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__1"


    // $ANTLR start "rule__Shelf__Group__1__Impl"
    // InternalGrocery.g:901:1: rule__Shelf__Group__1__Impl : ( ( rule__Shelf__NameAssignment_1 ) ) ;
    public final void rule__Shelf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:905:1: ( ( ( rule__Shelf__NameAssignment_1 ) ) )
            // InternalGrocery.g:906:1: ( ( rule__Shelf__NameAssignment_1 ) )
            {
            // InternalGrocery.g:906:1: ( ( rule__Shelf__NameAssignment_1 ) )
            // InternalGrocery.g:907:2: ( rule__Shelf__NameAssignment_1 )
            {
             before(grammarAccess.getShelfAccess().getNameAssignment_1()); 
            // InternalGrocery.g:908:2: ( rule__Shelf__NameAssignment_1 )
            // InternalGrocery.g:908:3: rule__Shelf__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Shelf__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShelfAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__1__Impl"


    // $ANTLR start "rule__Shelf__Group__2"
    // InternalGrocery.g:916:1: rule__Shelf__Group__2 : rule__Shelf__Group__2__Impl rule__Shelf__Group__3 ;
    public final void rule__Shelf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:920:1: ( rule__Shelf__Group__2__Impl rule__Shelf__Group__3 )
            // InternalGrocery.g:921:2: rule__Shelf__Group__2__Impl rule__Shelf__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Shelf__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__2"


    // $ANTLR start "rule__Shelf__Group__2__Impl"
    // InternalGrocery.g:928:1: rule__Shelf__Group__2__Impl : ( '{' ) ;
    public final void rule__Shelf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:932:1: ( ( '{' ) )
            // InternalGrocery.g:933:1: ( '{' )
            {
            // InternalGrocery.g:933:1: ( '{' )
            // InternalGrocery.g:934:2: '{'
            {
             before(grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__2__Impl"


    // $ANTLR start "rule__Shelf__Group__3"
    // InternalGrocery.g:943:1: rule__Shelf__Group__3 : rule__Shelf__Group__3__Impl rule__Shelf__Group__4 ;
    public final void rule__Shelf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:947:1: ( rule__Shelf__Group__3__Impl rule__Shelf__Group__4 )
            // InternalGrocery.g:948:2: rule__Shelf__Group__3__Impl rule__Shelf__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Shelf__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shelf__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__3"


    // $ANTLR start "rule__Shelf__Group__3__Impl"
    // InternalGrocery.g:955:1: rule__Shelf__Group__3__Impl : ( ( rule__Shelf__ElementsAssignment_3 )* ) ;
    public final void rule__Shelf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:959:1: ( ( ( rule__Shelf__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:960:1: ( ( rule__Shelf__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:960:1: ( ( rule__Shelf__ElementsAssignment_3 )* )
            // InternalGrocery.g:961:2: ( rule__Shelf__ElementsAssignment_3 )*
            {
             before(grammarAccess.getShelfAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:962:2: ( rule__Shelf__ElementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrocery.g:962:3: rule__Shelf__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Shelf__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getShelfAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__3__Impl"


    // $ANTLR start "rule__Shelf__Group__4"
    // InternalGrocery.g:970:1: rule__Shelf__Group__4 : rule__Shelf__Group__4__Impl ;
    public final void rule__Shelf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:974:1: ( rule__Shelf__Group__4__Impl )
            // InternalGrocery.g:975:2: rule__Shelf__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shelf__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__4"


    // $ANTLR start "rule__Shelf__Group__4__Impl"
    // InternalGrocery.g:981:1: rule__Shelf__Group__4__Impl : ( '}' ) ;
    public final void rule__Shelf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:985:1: ( ( '}' ) )
            // InternalGrocery.g:986:1: ( '}' )
            {
            // InternalGrocery.g:986:1: ( '}' )
            // InternalGrocery.g:987:2: '}'
            {
             before(grammarAccess.getShelfAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__Group__4__Impl"


    // $ANTLR start "rule__Backroom__Group__0"
    // InternalGrocery.g:997:1: rule__Backroom__Group__0 : rule__Backroom__Group__0__Impl rule__Backroom__Group__1 ;
    public final void rule__Backroom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1001:1: ( rule__Backroom__Group__0__Impl rule__Backroom__Group__1 )
            // InternalGrocery.g:1002:2: rule__Backroom__Group__0__Impl rule__Backroom__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Backroom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__0"


    // $ANTLR start "rule__Backroom__Group__0__Impl"
    // InternalGrocery.g:1009:1: rule__Backroom__Group__0__Impl : ( 'backroom' ) ;
    public final void rule__Backroom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1013:1: ( ( 'backroom' ) )
            // InternalGrocery.g:1014:1: ( 'backroom' )
            {
            // InternalGrocery.g:1014:1: ( 'backroom' )
            // InternalGrocery.g:1015:2: 'backroom'
            {
             before(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__0__Impl"


    // $ANTLR start "rule__Backroom__Group__1"
    // InternalGrocery.g:1024:1: rule__Backroom__Group__1 : rule__Backroom__Group__1__Impl rule__Backroom__Group__2 ;
    public final void rule__Backroom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1028:1: ( rule__Backroom__Group__1__Impl rule__Backroom__Group__2 )
            // InternalGrocery.g:1029:2: rule__Backroom__Group__1__Impl rule__Backroom__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Backroom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__1"


    // $ANTLR start "rule__Backroom__Group__1__Impl"
    // InternalGrocery.g:1036:1: rule__Backroom__Group__1__Impl : ( ( rule__Backroom__NameAssignment_1 ) ) ;
    public final void rule__Backroom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1040:1: ( ( ( rule__Backroom__NameAssignment_1 ) ) )
            // InternalGrocery.g:1041:1: ( ( rule__Backroom__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1041:1: ( ( rule__Backroom__NameAssignment_1 ) )
            // InternalGrocery.g:1042:2: ( rule__Backroom__NameAssignment_1 )
            {
             before(grammarAccess.getBackroomAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1043:2: ( rule__Backroom__NameAssignment_1 )
            // InternalGrocery.g:1043:3: rule__Backroom__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Backroom__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackroomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__1__Impl"


    // $ANTLR start "rule__Backroom__Group__2"
    // InternalGrocery.g:1051:1: rule__Backroom__Group__2 : rule__Backroom__Group__2__Impl rule__Backroom__Group__3 ;
    public final void rule__Backroom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1055:1: ( rule__Backroom__Group__2__Impl rule__Backroom__Group__3 )
            // InternalGrocery.g:1056:2: rule__Backroom__Group__2__Impl rule__Backroom__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Backroom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__2"


    // $ANTLR start "rule__Backroom__Group__2__Impl"
    // InternalGrocery.g:1063:1: rule__Backroom__Group__2__Impl : ( '{' ) ;
    public final void rule__Backroom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1067:1: ( ( '{' ) )
            // InternalGrocery.g:1068:1: ( '{' )
            {
            // InternalGrocery.g:1068:1: ( '{' )
            // InternalGrocery.g:1069:2: '{'
            {
             before(grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__2__Impl"


    // $ANTLR start "rule__Backroom__Group__3"
    // InternalGrocery.g:1078:1: rule__Backroom__Group__3 : rule__Backroom__Group__3__Impl rule__Backroom__Group__4 ;
    public final void rule__Backroom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1082:1: ( rule__Backroom__Group__3__Impl rule__Backroom__Group__4 )
            // InternalGrocery.g:1083:2: rule__Backroom__Group__3__Impl rule__Backroom__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Backroom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backroom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__3"


    // $ANTLR start "rule__Backroom__Group__3__Impl"
    // InternalGrocery.g:1090:1: rule__Backroom__Group__3__Impl : ( ( rule__Backroom__ElementsAssignment_3 )* ) ;
    public final void rule__Backroom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1094:1: ( ( ( rule__Backroom__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:1095:1: ( ( rule__Backroom__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:1095:1: ( ( rule__Backroom__ElementsAssignment_3 )* )
            // InternalGrocery.g:1096:2: ( rule__Backroom__ElementsAssignment_3 )*
            {
             before(grammarAccess.getBackroomAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:1097:2: ( rule__Backroom__ElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17||LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrocery.g:1097:3: rule__Backroom__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Backroom__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBackroomAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__3__Impl"


    // $ANTLR start "rule__Backroom__Group__4"
    // InternalGrocery.g:1105:1: rule__Backroom__Group__4 : rule__Backroom__Group__4__Impl ;
    public final void rule__Backroom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1109:1: ( rule__Backroom__Group__4__Impl )
            // InternalGrocery.g:1110:2: rule__Backroom__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Backroom__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__4"


    // $ANTLR start "rule__Backroom__Group__4__Impl"
    // InternalGrocery.g:1116:1: rule__Backroom__Group__4__Impl : ( '}' ) ;
    public final void rule__Backroom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1120:1: ( ( '}' ) )
            // InternalGrocery.g:1121:1: ( '}' )
            {
            // InternalGrocery.g:1121:1: ( '}' )
            // InternalGrocery.g:1122:2: '}'
            {
             before(grammarAccess.getBackroomAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__Group__4__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__0"
    // InternalGrocery.g:1132:1: rule__NonPerishableItem__Group__0 : rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 ;
    public final void rule__NonPerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1136:1: ( rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 )
            // InternalGrocery.g:1137:2: rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NonPerishableItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__0"


    // $ANTLR start "rule__NonPerishableItem__Group__0__Impl"
    // InternalGrocery.g:1144:1: rule__NonPerishableItem__Group__0__Impl : ( 'nonPerishableItem' ) ;
    public final void rule__NonPerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1148:1: ( ( 'nonPerishableItem' ) )
            // InternalGrocery.g:1149:1: ( 'nonPerishableItem' )
            {
            // InternalGrocery.g:1149:1: ( 'nonPerishableItem' )
            // InternalGrocery.g:1150:2: 'nonPerishableItem'
            {
             before(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__0__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__1"
    // InternalGrocery.g:1159:1: rule__NonPerishableItem__Group__1 : rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 ;
    public final void rule__NonPerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1163:1: ( rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 )
            // InternalGrocery.g:1164:2: rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__NonPerishableItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__1"


    // $ANTLR start "rule__NonPerishableItem__Group__1__Impl"
    // InternalGrocery.g:1171:1: rule__NonPerishableItem__Group__1__Impl : ( ( rule__NonPerishableItem__NameAssignment_1 ) ) ;
    public final void rule__NonPerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1175:1: ( ( ( rule__NonPerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1176:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1176:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1177:2: ( rule__NonPerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1178:2: ( rule__NonPerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1178:3: rule__NonPerishableItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__1__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__2"
    // InternalGrocery.g:1186:1: rule__NonPerishableItem__Group__2 : rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 ;
    public final void rule__NonPerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1190:1: ( rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 )
            // InternalGrocery.g:1191:2: rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__NonPerishableItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__2"


    // $ANTLR start "rule__NonPerishableItem__Group__2__Impl"
    // InternalGrocery.g:1198:1: rule__NonPerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__NonPerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1202:1: ( ( '{' ) )
            // InternalGrocery.g:1203:1: ( '{' )
            {
            // InternalGrocery.g:1203:1: ( '{' )
            // InternalGrocery.g:1204:2: '{'
            {
             before(grammarAccess.getNonPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__2__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__3"
    // InternalGrocery.g:1213:1: rule__NonPerishableItem__Group__3 : rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 ;
    public final void rule__NonPerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1217:1: ( rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 )
            // InternalGrocery.g:1218:2: rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__NonPerishableItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__3"


    // $ANTLR start "rule__NonPerishableItem__Group__3__Impl"
    // InternalGrocery.g:1225:1: rule__NonPerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__NonPerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1229:1: ( ( 'price' ) )
            // InternalGrocery.g:1230:1: ( 'price' )
            {
            // InternalGrocery.g:1230:1: ( 'price' )
            // InternalGrocery.g:1231:2: 'price'
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__3__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__4"
    // InternalGrocery.g:1240:1: rule__NonPerishableItem__Group__4 : rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 ;
    public final void rule__NonPerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1244:1: ( rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 )
            // InternalGrocery.g:1245:2: rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__NonPerishableItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__4"


    // $ANTLR start "rule__NonPerishableItem__Group__4__Impl"
    // InternalGrocery.g:1252:1: rule__NonPerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__NonPerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1256:1: ( ( ':' ) )
            // InternalGrocery.g:1257:1: ( ':' )
            {
            // InternalGrocery.g:1257:1: ( ':' )
            // InternalGrocery.g:1258:2: ':'
            {
             before(grammarAccess.getNonPerishableItemAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__4__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__5"
    // InternalGrocery.g:1267:1: rule__NonPerishableItem__Group__5 : rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 ;
    public final void rule__NonPerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1271:1: ( rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 )
            // InternalGrocery.g:1272:2: rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__NonPerishableItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__5"


    // $ANTLR start "rule__NonPerishableItem__Group__5__Impl"
    // InternalGrocery.g:1279:1: rule__NonPerishableItem__Group__5__Impl : ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__NonPerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1283:1: ( ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:1284:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:1284:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:1285:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:1286:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:1286:3: rule__NonPerishableItem__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__5__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__6"
    // InternalGrocery.g:1294:1: rule__NonPerishableItem__Group__6 : rule__NonPerishableItem__Group__6__Impl ;
    public final void rule__NonPerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1298:1: ( rule__NonPerishableItem__Group__6__Impl )
            // InternalGrocery.g:1299:2: rule__NonPerishableItem__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__6"


    // $ANTLR start "rule__NonPerishableItem__Group__6__Impl"
    // InternalGrocery.g:1305:1: rule__NonPerishableItem__Group__6__Impl : ( '}' ) ;
    public final void rule__NonPerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1309:1: ( ( '}' ) )
            // InternalGrocery.g:1310:1: ( '}' )
            {
            // InternalGrocery.g:1310:1: ( '}' )
            // InternalGrocery.g:1311:2: '}'
            {
             before(grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__Group__6__Impl"


    // $ANTLR start "rule__PerishableItem__Group__0"
    // InternalGrocery.g:1321:1: rule__PerishableItem__Group__0 : rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 ;
    public final void rule__PerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1325:1: ( rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 )
            // InternalGrocery.g:1326:2: rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PerishableItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__0"


    // $ANTLR start "rule__PerishableItem__Group__0__Impl"
    // InternalGrocery.g:1333:1: rule__PerishableItem__Group__0__Impl : ( 'perishableItem' ) ;
    public final void rule__PerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1337:1: ( ( 'perishableItem' ) )
            // InternalGrocery.g:1338:1: ( 'perishableItem' )
            {
            // InternalGrocery.g:1338:1: ( 'perishableItem' )
            // InternalGrocery.g:1339:2: 'perishableItem'
            {
             before(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__0__Impl"


    // $ANTLR start "rule__PerishableItem__Group__1"
    // InternalGrocery.g:1348:1: rule__PerishableItem__Group__1 : rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 ;
    public final void rule__PerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1352:1: ( rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 )
            // InternalGrocery.g:1353:2: rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__PerishableItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__1"


    // $ANTLR start "rule__PerishableItem__Group__1__Impl"
    // InternalGrocery.g:1360:1: rule__PerishableItem__Group__1__Impl : ( ( rule__PerishableItem__NameAssignment_1 ) ) ;
    public final void rule__PerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1364:1: ( ( ( rule__PerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1365:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1365:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1366:2: ( rule__PerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1367:2: ( rule__PerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1367:3: rule__PerishableItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__1__Impl"


    // $ANTLR start "rule__PerishableItem__Group__2"
    // InternalGrocery.g:1375:1: rule__PerishableItem__Group__2 : rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 ;
    public final void rule__PerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1379:1: ( rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 )
            // InternalGrocery.g:1380:2: rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__PerishableItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__2"


    // $ANTLR start "rule__PerishableItem__Group__2__Impl"
    // InternalGrocery.g:1387:1: rule__PerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__PerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1391:1: ( ( '{' ) )
            // InternalGrocery.g:1392:1: ( '{' )
            {
            // InternalGrocery.g:1392:1: ( '{' )
            // InternalGrocery.g:1393:2: '{'
            {
             before(grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__2__Impl"


    // $ANTLR start "rule__PerishableItem__Group__3"
    // InternalGrocery.g:1402:1: rule__PerishableItem__Group__3 : rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 ;
    public final void rule__PerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1406:1: ( rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 )
            // InternalGrocery.g:1407:2: rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__PerishableItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__3"


    // $ANTLR start "rule__PerishableItem__Group__3__Impl"
    // InternalGrocery.g:1414:1: rule__PerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__PerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1418:1: ( ( 'price' ) )
            // InternalGrocery.g:1419:1: ( 'price' )
            {
            // InternalGrocery.g:1419:1: ( 'price' )
            // InternalGrocery.g:1420:2: 'price'
            {
             before(grammarAccess.getPerishableItemAccess().getPriceKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getPriceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__3__Impl"


    // $ANTLR start "rule__PerishableItem__Group__4"
    // InternalGrocery.g:1429:1: rule__PerishableItem__Group__4 : rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 ;
    public final void rule__PerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1433:1: ( rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 )
            // InternalGrocery.g:1434:2: rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__PerishableItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__4"


    // $ANTLR start "rule__PerishableItem__Group__4__Impl"
    // InternalGrocery.g:1441:1: rule__PerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1445:1: ( ( ':' ) )
            // InternalGrocery.g:1446:1: ( ':' )
            {
            // InternalGrocery.g:1446:1: ( ':' )
            // InternalGrocery.g:1447:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__4__Impl"


    // $ANTLR start "rule__PerishableItem__Group__5"
    // InternalGrocery.g:1456:1: rule__PerishableItem__Group__5 : rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 ;
    public final void rule__PerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1460:1: ( rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 )
            // InternalGrocery.g:1461:2: rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__PerishableItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__5"


    // $ANTLR start "rule__PerishableItem__Group__5__Impl"
    // InternalGrocery.g:1468:1: rule__PerishableItem__Group__5__Impl : ( ( rule__PerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__PerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1472:1: ( ( ( rule__PerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:1473:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:1473:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:1474:2: ( rule__PerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:1475:2: ( rule__PerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:1475:3: rule__PerishableItem__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__5__Impl"


    // $ANTLR start "rule__PerishableItem__Group__6"
    // InternalGrocery.g:1483:1: rule__PerishableItem__Group__6 : rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 ;
    public final void rule__PerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1487:1: ( rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 )
            // InternalGrocery.g:1488:2: rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__PerishableItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__6"


    // $ANTLR start "rule__PerishableItem__Group__6__Impl"
    // InternalGrocery.g:1495:1: rule__PerishableItem__Group__6__Impl : ( ( rule__PerishableItem__ExperationDateAssignment_6 ) ) ;
    public final void rule__PerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1499:1: ( ( ( rule__PerishableItem__ExperationDateAssignment_6 ) ) )
            // InternalGrocery.g:1500:1: ( ( rule__PerishableItem__ExperationDateAssignment_6 ) )
            {
            // InternalGrocery.g:1500:1: ( ( rule__PerishableItem__ExperationDateAssignment_6 ) )
            // InternalGrocery.g:1501:2: ( rule__PerishableItem__ExperationDateAssignment_6 )
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_6()); 
            // InternalGrocery.g:1502:2: ( rule__PerishableItem__ExperationDateAssignment_6 )
            // InternalGrocery.g:1502:3: rule__PerishableItem__ExperationDateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__ExperationDateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__6__Impl"


    // $ANTLR start "rule__PerishableItem__Group__7"
    // InternalGrocery.g:1510:1: rule__PerishableItem__Group__7 : rule__PerishableItem__Group__7__Impl ;
    public final void rule__PerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1514:1: ( rule__PerishableItem__Group__7__Impl )
            // InternalGrocery.g:1515:2: rule__PerishableItem__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__7"


    // $ANTLR start "rule__PerishableItem__Group__7__Impl"
    // InternalGrocery.g:1521:1: rule__PerishableItem__Group__7__Impl : ( '}' ) ;
    public final void rule__PerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1525:1: ( ( '}' ) )
            // InternalGrocery.g:1526:1: ( '}' )
            {
            // InternalGrocery.g:1526:1: ( '}' )
            // InternalGrocery.g:1527:2: '}'
            {
             before(grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__7__Impl"


    // $ANTLR start "rule__Address__Group__0"
    // InternalGrocery.g:1537:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1541:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalGrocery.g:1542:2: rule__Address__Group__0__Impl rule__Address__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Address__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0"


    // $ANTLR start "rule__Address__Group__0__Impl"
    // InternalGrocery.g:1549:1: rule__Address__Group__0__Impl : ( 'address' ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1553:1: ( ( 'address' ) )
            // InternalGrocery.g:1554:1: ( 'address' )
            {
            // InternalGrocery.g:1554:1: ( 'address' )
            // InternalGrocery.g:1555:2: 'address'
            {
             before(grammarAccess.getAddressAccess().getAddressKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0__Impl"


    // $ANTLR start "rule__Address__Group__1"
    // InternalGrocery.g:1564:1: rule__Address__Group__1 : rule__Address__Group__1__Impl rule__Address__Group__2 ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1568:1: ( rule__Address__Group__1__Impl rule__Address__Group__2 )
            // InternalGrocery.g:1569:2: rule__Address__Group__1__Impl rule__Address__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Address__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1"


    // $ANTLR start "rule__Address__Group__1__Impl"
    // InternalGrocery.g:1576:1: rule__Address__Group__1__Impl : ( '{' ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1580:1: ( ( '{' ) )
            // InternalGrocery.g:1581:1: ( '{' )
            {
            // InternalGrocery.g:1581:1: ( '{' )
            // InternalGrocery.g:1582:2: '{'
            {
             before(grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1__Impl"


    // $ANTLR start "rule__Address__Group__2"
    // InternalGrocery.g:1591:1: rule__Address__Group__2 : rule__Address__Group__2__Impl rule__Address__Group__3 ;
    public final void rule__Address__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1595:1: ( rule__Address__Group__2__Impl rule__Address__Group__3 )
            // InternalGrocery.g:1596:2: rule__Address__Group__2__Impl rule__Address__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Address__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__2"


    // $ANTLR start "rule__Address__Group__2__Impl"
    // InternalGrocery.g:1603:1: rule__Address__Group__2__Impl : ( 'street' ) ;
    public final void rule__Address__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1607:1: ( ( 'street' ) )
            // InternalGrocery.g:1608:1: ( 'street' )
            {
            // InternalGrocery.g:1608:1: ( 'street' )
            // InternalGrocery.g:1609:2: 'street'
            {
             before(grammarAccess.getAddressAccess().getStreetKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getStreetKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__2__Impl"


    // $ANTLR start "rule__Address__Group__3"
    // InternalGrocery.g:1618:1: rule__Address__Group__3 : rule__Address__Group__3__Impl rule__Address__Group__4 ;
    public final void rule__Address__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1622:1: ( rule__Address__Group__3__Impl rule__Address__Group__4 )
            // InternalGrocery.g:1623:2: rule__Address__Group__3__Impl rule__Address__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Address__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__3"


    // $ANTLR start "rule__Address__Group__3__Impl"
    // InternalGrocery.g:1630:1: rule__Address__Group__3__Impl : ( ':' ) ;
    public final void rule__Address__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1634:1: ( ( ':' ) )
            // InternalGrocery.g:1635:1: ( ':' )
            {
            // InternalGrocery.g:1635:1: ( ':' )
            // InternalGrocery.g:1636:2: ':'
            {
             before(grammarAccess.getAddressAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__3__Impl"


    // $ANTLR start "rule__Address__Group__4"
    // InternalGrocery.g:1645:1: rule__Address__Group__4 : rule__Address__Group__4__Impl rule__Address__Group__5 ;
    public final void rule__Address__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1649:1: ( rule__Address__Group__4__Impl rule__Address__Group__5 )
            // InternalGrocery.g:1650:2: rule__Address__Group__4__Impl rule__Address__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Address__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__4"


    // $ANTLR start "rule__Address__Group__4__Impl"
    // InternalGrocery.g:1657:1: rule__Address__Group__4__Impl : ( ( rule__Address__StreetAssignment_4 ) ) ;
    public final void rule__Address__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1661:1: ( ( ( rule__Address__StreetAssignment_4 ) ) )
            // InternalGrocery.g:1662:1: ( ( rule__Address__StreetAssignment_4 ) )
            {
            // InternalGrocery.g:1662:1: ( ( rule__Address__StreetAssignment_4 ) )
            // InternalGrocery.g:1663:2: ( rule__Address__StreetAssignment_4 )
            {
             before(grammarAccess.getAddressAccess().getStreetAssignment_4()); 
            // InternalGrocery.g:1664:2: ( rule__Address__StreetAssignment_4 )
            // InternalGrocery.g:1664:3: rule__Address__StreetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Address__StreetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getStreetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__4__Impl"


    // $ANTLR start "rule__Address__Group__5"
    // InternalGrocery.g:1672:1: rule__Address__Group__5 : rule__Address__Group__5__Impl rule__Address__Group__6 ;
    public final void rule__Address__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1676:1: ( rule__Address__Group__5__Impl rule__Address__Group__6 )
            // InternalGrocery.g:1677:2: rule__Address__Group__5__Impl rule__Address__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Address__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__5"


    // $ANTLR start "rule__Address__Group__5__Impl"
    // InternalGrocery.g:1684:1: rule__Address__Group__5__Impl : ( 'number' ) ;
    public final void rule__Address__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1688:1: ( ( 'number' ) )
            // InternalGrocery.g:1689:1: ( 'number' )
            {
            // InternalGrocery.g:1689:1: ( 'number' )
            // InternalGrocery.g:1690:2: 'number'
            {
             before(grammarAccess.getAddressAccess().getNumberKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getNumberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__5__Impl"


    // $ANTLR start "rule__Address__Group__6"
    // InternalGrocery.g:1699:1: rule__Address__Group__6 : rule__Address__Group__6__Impl rule__Address__Group__7 ;
    public final void rule__Address__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1703:1: ( rule__Address__Group__6__Impl rule__Address__Group__7 )
            // InternalGrocery.g:1704:2: rule__Address__Group__6__Impl rule__Address__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Address__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__6"


    // $ANTLR start "rule__Address__Group__6__Impl"
    // InternalGrocery.g:1711:1: rule__Address__Group__6__Impl : ( ':' ) ;
    public final void rule__Address__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1715:1: ( ( ':' ) )
            // InternalGrocery.g:1716:1: ( ':' )
            {
            // InternalGrocery.g:1716:1: ( ':' )
            // InternalGrocery.g:1717:2: ':'
            {
             before(grammarAccess.getAddressAccess().getColonKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__6__Impl"


    // $ANTLR start "rule__Address__Group__7"
    // InternalGrocery.g:1726:1: rule__Address__Group__7 : rule__Address__Group__7__Impl rule__Address__Group__8 ;
    public final void rule__Address__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1730:1: ( rule__Address__Group__7__Impl rule__Address__Group__8 )
            // InternalGrocery.g:1731:2: rule__Address__Group__7__Impl rule__Address__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Address__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__7"


    // $ANTLR start "rule__Address__Group__7__Impl"
    // InternalGrocery.g:1738:1: rule__Address__Group__7__Impl : ( ( rule__Address__NumberAssignment_7 ) ) ;
    public final void rule__Address__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1742:1: ( ( ( rule__Address__NumberAssignment_7 ) ) )
            // InternalGrocery.g:1743:1: ( ( rule__Address__NumberAssignment_7 ) )
            {
            // InternalGrocery.g:1743:1: ( ( rule__Address__NumberAssignment_7 ) )
            // InternalGrocery.g:1744:2: ( rule__Address__NumberAssignment_7 )
            {
             before(grammarAccess.getAddressAccess().getNumberAssignment_7()); 
            // InternalGrocery.g:1745:2: ( rule__Address__NumberAssignment_7 )
            // InternalGrocery.g:1745:3: rule__Address__NumberAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Address__NumberAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getNumberAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__7__Impl"


    // $ANTLR start "rule__Address__Group__8"
    // InternalGrocery.g:1753:1: rule__Address__Group__8 : rule__Address__Group__8__Impl rule__Address__Group__9 ;
    public final void rule__Address__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1757:1: ( rule__Address__Group__8__Impl rule__Address__Group__9 )
            // InternalGrocery.g:1758:2: rule__Address__Group__8__Impl rule__Address__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Address__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__8"


    // $ANTLR start "rule__Address__Group__8__Impl"
    // InternalGrocery.g:1765:1: rule__Address__Group__8__Impl : ( 'city' ) ;
    public final void rule__Address__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1769:1: ( ( 'city' ) )
            // InternalGrocery.g:1770:1: ( 'city' )
            {
            // InternalGrocery.g:1770:1: ( 'city' )
            // InternalGrocery.g:1771:2: 'city'
            {
             before(grammarAccess.getAddressAccess().getCityKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCityKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__8__Impl"


    // $ANTLR start "rule__Address__Group__9"
    // InternalGrocery.g:1780:1: rule__Address__Group__9 : rule__Address__Group__9__Impl rule__Address__Group__10 ;
    public final void rule__Address__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1784:1: ( rule__Address__Group__9__Impl rule__Address__Group__10 )
            // InternalGrocery.g:1785:2: rule__Address__Group__9__Impl rule__Address__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Address__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__9"


    // $ANTLR start "rule__Address__Group__9__Impl"
    // InternalGrocery.g:1792:1: rule__Address__Group__9__Impl : ( ':' ) ;
    public final void rule__Address__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1796:1: ( ( ':' ) )
            // InternalGrocery.g:1797:1: ( ':' )
            {
            // InternalGrocery.g:1797:1: ( ':' )
            // InternalGrocery.g:1798:2: ':'
            {
             before(grammarAccess.getAddressAccess().getColonKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__9__Impl"


    // $ANTLR start "rule__Address__Group__10"
    // InternalGrocery.g:1807:1: rule__Address__Group__10 : rule__Address__Group__10__Impl rule__Address__Group__11 ;
    public final void rule__Address__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1811:1: ( rule__Address__Group__10__Impl rule__Address__Group__11 )
            // InternalGrocery.g:1812:2: rule__Address__Group__10__Impl rule__Address__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Address__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__10"


    // $ANTLR start "rule__Address__Group__10__Impl"
    // InternalGrocery.g:1819:1: rule__Address__Group__10__Impl : ( ( rule__Address__CityAssignment_10 ) ) ;
    public final void rule__Address__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1823:1: ( ( ( rule__Address__CityAssignment_10 ) ) )
            // InternalGrocery.g:1824:1: ( ( rule__Address__CityAssignment_10 ) )
            {
            // InternalGrocery.g:1824:1: ( ( rule__Address__CityAssignment_10 ) )
            // InternalGrocery.g:1825:2: ( rule__Address__CityAssignment_10 )
            {
             before(grammarAccess.getAddressAccess().getCityAssignment_10()); 
            // InternalGrocery.g:1826:2: ( rule__Address__CityAssignment_10 )
            // InternalGrocery.g:1826:3: rule__Address__CityAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Address__CityAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getCityAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__10__Impl"


    // $ANTLR start "rule__Address__Group__11"
    // InternalGrocery.g:1834:1: rule__Address__Group__11 : rule__Address__Group__11__Impl ;
    public final void rule__Address__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1838:1: ( rule__Address__Group__11__Impl )
            // InternalGrocery.g:1839:2: rule__Address__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__11"


    // $ANTLR start "rule__Address__Group__11__Impl"
    // InternalGrocery.g:1845:1: rule__Address__Group__11__Impl : ( '}' ) ;
    public final void rule__Address__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1849:1: ( ( '}' ) )
            // InternalGrocery.g:1850:1: ( '}' )
            {
            // InternalGrocery.g:1850:1: ( '}' )
            // InternalGrocery.g:1851:2: '}'
            {
             before(grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__11__Impl"


    // $ANTLR start "rule__ExperationDate__Group__0"
    // InternalGrocery.g:1861:1: rule__ExperationDate__Group__0 : rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1 ;
    public final void rule__ExperationDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1865:1: ( rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1 )
            // InternalGrocery.g:1866:2: rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExperationDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__0"


    // $ANTLR start "rule__ExperationDate__Group__0__Impl"
    // InternalGrocery.g:1873:1: rule__ExperationDate__Group__0__Impl : ( 'ExpirationDate' ) ;
    public final void rule__ExperationDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1877:1: ( ( 'ExpirationDate' ) )
            // InternalGrocery.g:1878:1: ( 'ExpirationDate' )
            {
            // InternalGrocery.g:1878:1: ( 'ExpirationDate' )
            // InternalGrocery.g:1879:2: 'ExpirationDate'
            {
             before(grammarAccess.getExperationDateAccess().getExpirationDateKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getExpirationDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__0__Impl"


    // $ANTLR start "rule__ExperationDate__Group__1"
    // InternalGrocery.g:1888:1: rule__ExperationDate__Group__1 : rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2 ;
    public final void rule__ExperationDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1892:1: ( rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2 )
            // InternalGrocery.g:1893:2: rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ExperationDate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__1"


    // $ANTLR start "rule__ExperationDate__Group__1__Impl"
    // InternalGrocery.g:1900:1: rule__ExperationDate__Group__1__Impl : ( '{' ) ;
    public final void rule__ExperationDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1904:1: ( ( '{' ) )
            // InternalGrocery.g:1905:1: ( '{' )
            {
            // InternalGrocery.g:1905:1: ( '{' )
            // InternalGrocery.g:1906:2: '{'
            {
             before(grammarAccess.getExperationDateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__1__Impl"


    // $ANTLR start "rule__ExperationDate__Group__2"
    // InternalGrocery.g:1915:1: rule__ExperationDate__Group__2 : rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3 ;
    public final void rule__ExperationDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1919:1: ( rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3 )
            // InternalGrocery.g:1920:2: rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ExperationDate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__2"


    // $ANTLR start "rule__ExperationDate__Group__2__Impl"
    // InternalGrocery.g:1927:1: rule__ExperationDate__Group__2__Impl : ( 'month' ) ;
    public final void rule__ExperationDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1931:1: ( ( 'month' ) )
            // InternalGrocery.g:1932:1: ( 'month' )
            {
            // InternalGrocery.g:1932:1: ( 'month' )
            // InternalGrocery.g:1933:2: 'month'
            {
             before(grammarAccess.getExperationDateAccess().getMonthKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getMonthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__2__Impl"


    // $ANTLR start "rule__ExperationDate__Group__3"
    // InternalGrocery.g:1942:1: rule__ExperationDate__Group__3 : rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4 ;
    public final void rule__ExperationDate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1946:1: ( rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4 )
            // InternalGrocery.g:1947:2: rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ExperationDate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__3"


    // $ANTLR start "rule__ExperationDate__Group__3__Impl"
    // InternalGrocery.g:1954:1: rule__ExperationDate__Group__3__Impl : ( ':' ) ;
    public final void rule__ExperationDate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1958:1: ( ( ':' ) )
            // InternalGrocery.g:1959:1: ( ':' )
            {
            // InternalGrocery.g:1959:1: ( ':' )
            // InternalGrocery.g:1960:2: ':'
            {
             before(grammarAccess.getExperationDateAccess().getColonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__3__Impl"


    // $ANTLR start "rule__ExperationDate__Group__4"
    // InternalGrocery.g:1969:1: rule__ExperationDate__Group__4 : rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5 ;
    public final void rule__ExperationDate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1973:1: ( rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5 )
            // InternalGrocery.g:1974:2: rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ExperationDate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__4"


    // $ANTLR start "rule__ExperationDate__Group__4__Impl"
    // InternalGrocery.g:1981:1: rule__ExperationDate__Group__4__Impl : ( ( rule__ExperationDate__MonthAssignment_4 ) ) ;
    public final void rule__ExperationDate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1985:1: ( ( ( rule__ExperationDate__MonthAssignment_4 ) ) )
            // InternalGrocery.g:1986:1: ( ( rule__ExperationDate__MonthAssignment_4 ) )
            {
            // InternalGrocery.g:1986:1: ( ( rule__ExperationDate__MonthAssignment_4 ) )
            // InternalGrocery.g:1987:2: ( rule__ExperationDate__MonthAssignment_4 )
            {
             before(grammarAccess.getExperationDateAccess().getMonthAssignment_4()); 
            // InternalGrocery.g:1988:2: ( rule__ExperationDate__MonthAssignment_4 )
            // InternalGrocery.g:1988:3: rule__ExperationDate__MonthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__MonthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getMonthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__4__Impl"


    // $ANTLR start "rule__ExperationDate__Group__5"
    // InternalGrocery.g:1996:1: rule__ExperationDate__Group__5 : rule__ExperationDate__Group__5__Impl rule__ExperationDate__Group__6 ;
    public final void rule__ExperationDate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2000:1: ( rule__ExperationDate__Group__5__Impl rule__ExperationDate__Group__6 )
            // InternalGrocery.g:2001:2: rule__ExperationDate__Group__5__Impl rule__ExperationDate__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ExperationDate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__5"


    // $ANTLR start "rule__ExperationDate__Group__5__Impl"
    // InternalGrocery.g:2008:1: rule__ExperationDate__Group__5__Impl : ( 'day' ) ;
    public final void rule__ExperationDate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2012:1: ( ( 'day' ) )
            // InternalGrocery.g:2013:1: ( 'day' )
            {
            // InternalGrocery.g:2013:1: ( 'day' )
            // InternalGrocery.g:2014:2: 'day'
            {
             before(grammarAccess.getExperationDateAccess().getDayKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getDayKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__5__Impl"


    // $ANTLR start "rule__ExperationDate__Group__6"
    // InternalGrocery.g:2023:1: rule__ExperationDate__Group__6 : rule__ExperationDate__Group__6__Impl rule__ExperationDate__Group__7 ;
    public final void rule__ExperationDate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2027:1: ( rule__ExperationDate__Group__6__Impl rule__ExperationDate__Group__7 )
            // InternalGrocery.g:2028:2: rule__ExperationDate__Group__6__Impl rule__ExperationDate__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__ExperationDate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__6"


    // $ANTLR start "rule__ExperationDate__Group__6__Impl"
    // InternalGrocery.g:2035:1: rule__ExperationDate__Group__6__Impl : ( ':' ) ;
    public final void rule__ExperationDate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2039:1: ( ( ':' ) )
            // InternalGrocery.g:2040:1: ( ':' )
            {
            // InternalGrocery.g:2040:1: ( ':' )
            // InternalGrocery.g:2041:2: ':'
            {
             before(grammarAccess.getExperationDateAccess().getColonKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__6__Impl"


    // $ANTLR start "rule__ExperationDate__Group__7"
    // InternalGrocery.g:2050:1: rule__ExperationDate__Group__7 : rule__ExperationDate__Group__7__Impl rule__ExperationDate__Group__8 ;
    public final void rule__ExperationDate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2054:1: ( rule__ExperationDate__Group__7__Impl rule__ExperationDate__Group__8 )
            // InternalGrocery.g:2055:2: rule__ExperationDate__Group__7__Impl rule__ExperationDate__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__ExperationDate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__7"


    // $ANTLR start "rule__ExperationDate__Group__7__Impl"
    // InternalGrocery.g:2062:1: rule__ExperationDate__Group__7__Impl : ( ( rule__ExperationDate__DayAssignment_7 ) ) ;
    public final void rule__ExperationDate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2066:1: ( ( ( rule__ExperationDate__DayAssignment_7 ) ) )
            // InternalGrocery.g:2067:1: ( ( rule__ExperationDate__DayAssignment_7 ) )
            {
            // InternalGrocery.g:2067:1: ( ( rule__ExperationDate__DayAssignment_7 ) )
            // InternalGrocery.g:2068:2: ( rule__ExperationDate__DayAssignment_7 )
            {
             before(grammarAccess.getExperationDateAccess().getDayAssignment_7()); 
            // InternalGrocery.g:2069:2: ( rule__ExperationDate__DayAssignment_7 )
            // InternalGrocery.g:2069:3: rule__ExperationDate__DayAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__DayAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getDayAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__7__Impl"


    // $ANTLR start "rule__ExperationDate__Group__8"
    // InternalGrocery.g:2077:1: rule__ExperationDate__Group__8 : rule__ExperationDate__Group__8__Impl rule__ExperationDate__Group__9 ;
    public final void rule__ExperationDate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2081:1: ( rule__ExperationDate__Group__8__Impl rule__ExperationDate__Group__9 )
            // InternalGrocery.g:2082:2: rule__ExperationDate__Group__8__Impl rule__ExperationDate__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__ExperationDate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__8"


    // $ANTLR start "rule__ExperationDate__Group__8__Impl"
    // InternalGrocery.g:2089:1: rule__ExperationDate__Group__8__Impl : ( 'year' ) ;
    public final void rule__ExperationDate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2093:1: ( ( 'year' ) )
            // InternalGrocery.g:2094:1: ( 'year' )
            {
            // InternalGrocery.g:2094:1: ( 'year' )
            // InternalGrocery.g:2095:2: 'year'
            {
             before(grammarAccess.getExperationDateAccess().getYearKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getYearKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__8__Impl"


    // $ANTLR start "rule__ExperationDate__Group__9"
    // InternalGrocery.g:2104:1: rule__ExperationDate__Group__9 : rule__ExperationDate__Group__9__Impl rule__ExperationDate__Group__10 ;
    public final void rule__ExperationDate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2108:1: ( rule__ExperationDate__Group__9__Impl rule__ExperationDate__Group__10 )
            // InternalGrocery.g:2109:2: rule__ExperationDate__Group__9__Impl rule__ExperationDate__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__ExperationDate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__9"


    // $ANTLR start "rule__ExperationDate__Group__9__Impl"
    // InternalGrocery.g:2116:1: rule__ExperationDate__Group__9__Impl : ( ':' ) ;
    public final void rule__ExperationDate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2120:1: ( ( ':' ) )
            // InternalGrocery.g:2121:1: ( ':' )
            {
            // InternalGrocery.g:2121:1: ( ':' )
            // InternalGrocery.g:2122:2: ':'
            {
             before(grammarAccess.getExperationDateAccess().getColonKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__9__Impl"


    // $ANTLR start "rule__ExperationDate__Group__10"
    // InternalGrocery.g:2131:1: rule__ExperationDate__Group__10 : rule__ExperationDate__Group__10__Impl rule__ExperationDate__Group__11 ;
    public final void rule__ExperationDate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2135:1: ( rule__ExperationDate__Group__10__Impl rule__ExperationDate__Group__11 )
            // InternalGrocery.g:2136:2: rule__ExperationDate__Group__10__Impl rule__ExperationDate__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__ExperationDate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__10"


    // $ANTLR start "rule__ExperationDate__Group__10__Impl"
    // InternalGrocery.g:2143:1: rule__ExperationDate__Group__10__Impl : ( ( rule__ExperationDate__YearAssignment_10 ) ) ;
    public final void rule__ExperationDate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2147:1: ( ( ( rule__ExperationDate__YearAssignment_10 ) ) )
            // InternalGrocery.g:2148:1: ( ( rule__ExperationDate__YearAssignment_10 ) )
            {
            // InternalGrocery.g:2148:1: ( ( rule__ExperationDate__YearAssignment_10 ) )
            // InternalGrocery.g:2149:2: ( rule__ExperationDate__YearAssignment_10 )
            {
             before(grammarAccess.getExperationDateAccess().getYearAssignment_10()); 
            // InternalGrocery.g:2150:2: ( rule__ExperationDate__YearAssignment_10 )
            // InternalGrocery.g:2150:3: rule__ExperationDate__YearAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__YearAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getYearAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__10__Impl"


    // $ANTLR start "rule__ExperationDate__Group__11"
    // InternalGrocery.g:2158:1: rule__ExperationDate__Group__11 : rule__ExperationDate__Group__11__Impl ;
    public final void rule__ExperationDate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2162:1: ( rule__ExperationDate__Group__11__Impl )
            // InternalGrocery.g:2163:2: rule__ExperationDate__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__11"


    // $ANTLR start "rule__ExperationDate__Group__11__Impl"
    // InternalGrocery.g:2169:1: rule__ExperationDate__Group__11__Impl : ( '}' ) ;
    public final void rule__ExperationDate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2173:1: ( ( '}' ) )
            // InternalGrocery.g:2174:1: ( '}' )
            {
            // InternalGrocery.g:2174:1: ( '}' )
            // InternalGrocery.g:2175:2: '}'
            {
             before(grammarAccess.getExperationDateAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__Group__11__Impl"


    // $ANTLR start "rule__Driver__Group__0"
    // InternalGrocery.g:2185:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2189:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalGrocery.g:2190:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Driver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__0"


    // $ANTLR start "rule__Driver__Group__0__Impl"
    // InternalGrocery.g:2197:1: rule__Driver__Group__0__Impl : ( 'driver' ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2201:1: ( ( 'driver' ) )
            // InternalGrocery.g:2202:1: ( 'driver' )
            {
            // InternalGrocery.g:2202:1: ( 'driver' )
            // InternalGrocery.g:2203:2: 'driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__0__Impl"


    // $ANTLR start "rule__Driver__Group__1"
    // InternalGrocery.g:2212:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2216:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalGrocery.g:2217:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Driver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__1"


    // $ANTLR start "rule__Driver__Group__1__Impl"
    // InternalGrocery.g:2224:1: rule__Driver__Group__1__Impl : ( ( rule__Driver__NameAssignment_1 ) ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2228:1: ( ( ( rule__Driver__NameAssignment_1 ) ) )
            // InternalGrocery.g:2229:1: ( ( rule__Driver__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2229:1: ( ( rule__Driver__NameAssignment_1 ) )
            // InternalGrocery.g:2230:2: ( rule__Driver__NameAssignment_1 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2231:2: ( rule__Driver__NameAssignment_1 )
            // InternalGrocery.g:2231:3: rule__Driver__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Driver__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__1__Impl"


    // $ANTLR start "rule__Driver__Group__2"
    // InternalGrocery.g:2239:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2243:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalGrocery.g:2244:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Driver__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__2"


    // $ANTLR start "rule__Driver__Group__2__Impl"
    // InternalGrocery.g:2251:1: rule__Driver__Group__2__Impl : ( '{' ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2255:1: ( ( '{' ) )
            // InternalGrocery.g:2256:1: ( '{' )
            {
            // InternalGrocery.g:2256:1: ( '{' )
            // InternalGrocery.g:2257:2: '{'
            {
             before(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__2__Impl"


    // $ANTLR start "rule__Driver__Group__3"
    // InternalGrocery.g:2266:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2270:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalGrocery.g:2271:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Driver__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__3"


    // $ANTLR start "rule__Driver__Group__3__Impl"
    // InternalGrocery.g:2278:1: rule__Driver__Group__3__Impl : ( 'name' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2282:1: ( ( 'name' ) )
            // InternalGrocery.g:2283:1: ( 'name' )
            {
            // InternalGrocery.g:2283:1: ( 'name' )
            // InternalGrocery.g:2284:2: 'name'
            {
             before(grammarAccess.getDriverAccess().getNameKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__3__Impl"


    // $ANTLR start "rule__Driver__Group__4"
    // InternalGrocery.g:2293:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2297:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalGrocery.g:2298:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Driver__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__4"


    // $ANTLR start "rule__Driver__Group__4__Impl"
    // InternalGrocery.g:2305:1: rule__Driver__Group__4__Impl : ( ':' ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2309:1: ( ( ':' ) )
            // InternalGrocery.g:2310:1: ( ':' )
            {
            // InternalGrocery.g:2310:1: ( ':' )
            // InternalGrocery.g:2311:2: ':'
            {
             before(grammarAccess.getDriverAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__4__Impl"


    // $ANTLR start "rule__Driver__Group__5"
    // InternalGrocery.g:2320:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2324:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalGrocery.g:2325:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Driver__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__5"


    // $ANTLR start "rule__Driver__Group__5__Impl"
    // InternalGrocery.g:2332:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__DriverNameAssignment_5 ) ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2336:1: ( ( ( rule__Driver__DriverNameAssignment_5 ) ) )
            // InternalGrocery.g:2337:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            {
            // InternalGrocery.g:2337:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            // InternalGrocery.g:2338:2: ( rule__Driver__DriverNameAssignment_5 )
            {
             before(grammarAccess.getDriverAccess().getDriverNameAssignment_5()); 
            // InternalGrocery.g:2339:2: ( rule__Driver__DriverNameAssignment_5 )
            // InternalGrocery.g:2339:3: rule__Driver__DriverNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Driver__DriverNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDriverAccess().getDriverNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__5__Impl"


    // $ANTLR start "rule__Driver__Group__6"
    // InternalGrocery.g:2347:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2351:1: ( rule__Driver__Group__6__Impl )
            // InternalGrocery.g:2352:2: rule__Driver__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__6"


    // $ANTLR start "rule__Driver__Group__6__Impl"
    // InternalGrocery.g:2358:1: rule__Driver__Group__6__Impl : ( '}' ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2362:1: ( ( '}' ) )
            // InternalGrocery.g:2363:1: ( '}' )
            {
            // InternalGrocery.g:2363:1: ( '}' )
            // InternalGrocery.g:2364:2: '}'
            {
             before(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__6__Impl"


    // $ANTLR start "rule__Vehicle__Group__0"
    // InternalGrocery.g:2374:1: rule__Vehicle__Group__0 : rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 ;
    public final void rule__Vehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2378:1: ( rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 )
            // InternalGrocery.g:2379:2: rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Vehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__0"


    // $ANTLR start "rule__Vehicle__Group__0__Impl"
    // InternalGrocery.g:2386:1: rule__Vehicle__Group__0__Impl : ( 'vehicle' ) ;
    public final void rule__Vehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2390:1: ( ( 'vehicle' ) )
            // InternalGrocery.g:2391:1: ( 'vehicle' )
            {
            // InternalGrocery.g:2391:1: ( 'vehicle' )
            // InternalGrocery.g:2392:2: 'vehicle'
            {
             before(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__0__Impl"


    // $ANTLR start "rule__Vehicle__Group__1"
    // InternalGrocery.g:2401:1: rule__Vehicle__Group__1 : rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 ;
    public final void rule__Vehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2405:1: ( rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 )
            // InternalGrocery.g:2406:2: rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Vehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__1"


    // $ANTLR start "rule__Vehicle__Group__1__Impl"
    // InternalGrocery.g:2413:1: rule__Vehicle__Group__1__Impl : ( ( rule__Vehicle__NameAssignment_1 ) ) ;
    public final void rule__Vehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2417:1: ( ( ( rule__Vehicle__NameAssignment_1 ) ) )
            // InternalGrocery.g:2418:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2418:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            // InternalGrocery.g:2419:2: ( rule__Vehicle__NameAssignment_1 )
            {
             before(grammarAccess.getVehicleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2420:2: ( rule__Vehicle__NameAssignment_1 )
            // InternalGrocery.g:2420:3: rule__Vehicle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVehicleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__1__Impl"


    // $ANTLR start "rule__Vehicle__Group__2"
    // InternalGrocery.g:2428:1: rule__Vehicle__Group__2 : rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 ;
    public final void rule__Vehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2432:1: ( rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 )
            // InternalGrocery.g:2433:2: rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Vehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__2"


    // $ANTLR start "rule__Vehicle__Group__2__Impl"
    // InternalGrocery.g:2440:1: rule__Vehicle__Group__2__Impl : ( '{' ) ;
    public final void rule__Vehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2444:1: ( ( '{' ) )
            // InternalGrocery.g:2445:1: ( '{' )
            {
            // InternalGrocery.g:2445:1: ( '{' )
            // InternalGrocery.g:2446:2: '{'
            {
             before(grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__2__Impl"


    // $ANTLR start "rule__Vehicle__Group__3"
    // InternalGrocery.g:2455:1: rule__Vehicle__Group__3 : rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 ;
    public final void rule__Vehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2459:1: ( rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 )
            // InternalGrocery.g:2460:2: rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Vehicle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__3"


    // $ANTLR start "rule__Vehicle__Group__3__Impl"
    // InternalGrocery.g:2467:1: rule__Vehicle__Group__3__Impl : ( 'plateNumber' ) ;
    public final void rule__Vehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2471:1: ( ( 'plateNumber' ) )
            // InternalGrocery.g:2472:1: ( 'plateNumber' )
            {
            // InternalGrocery.g:2472:1: ( 'plateNumber' )
            // InternalGrocery.g:2473:2: 'plateNumber'
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getPlateNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__3__Impl"


    // $ANTLR start "rule__Vehicle__Group__4"
    // InternalGrocery.g:2482:1: rule__Vehicle__Group__4 : rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 ;
    public final void rule__Vehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2486:1: ( rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 )
            // InternalGrocery.g:2487:2: rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Vehicle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__4"


    // $ANTLR start "rule__Vehicle__Group__4__Impl"
    // InternalGrocery.g:2494:1: rule__Vehicle__Group__4__Impl : ( ':' ) ;
    public final void rule__Vehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2498:1: ( ( ':' ) )
            // InternalGrocery.g:2499:1: ( ':' )
            {
            // InternalGrocery.g:2499:1: ( ':' )
            // InternalGrocery.g:2500:2: ':'
            {
             before(grammarAccess.getVehicleAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__4__Impl"


    // $ANTLR start "rule__Vehicle__Group__5"
    // InternalGrocery.g:2509:1: rule__Vehicle__Group__5 : rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 ;
    public final void rule__Vehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2513:1: ( rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 )
            // InternalGrocery.g:2514:2: rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Vehicle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__5"


    // $ANTLR start "rule__Vehicle__Group__5__Impl"
    // InternalGrocery.g:2521:1: rule__Vehicle__Group__5__Impl : ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) ;
    public final void rule__Vehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2525:1: ( ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) )
            // InternalGrocery.g:2526:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            {
            // InternalGrocery.g:2526:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            // InternalGrocery.g:2527:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberAssignment_5()); 
            // InternalGrocery.g:2528:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            // InternalGrocery.g:2528:3: rule__Vehicle__PlateNumberAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__PlateNumberAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVehicleAccess().getPlateNumberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__5__Impl"


    // $ANTLR start "rule__Vehicle__Group__6"
    // InternalGrocery.g:2536:1: rule__Vehicle__Group__6 : rule__Vehicle__Group__6__Impl ;
    public final void rule__Vehicle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2540:1: ( rule__Vehicle__Group__6__Impl )
            // InternalGrocery.g:2541:2: rule__Vehicle__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__6"


    // $ANTLR start "rule__Vehicle__Group__6__Impl"
    // InternalGrocery.g:2547:1: rule__Vehicle__Group__6__Impl : ( '}' ) ;
    public final void rule__Vehicle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2551:1: ( ( '}' ) )
            // InternalGrocery.g:2552:1: ( '}' )
            {
            // InternalGrocery.g:2552:1: ( '}' )
            // InternalGrocery.g:2553:2: '}'
            {
             before(grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__6__Impl"


    // $ANTLR start "rule__Grocery__ElementsAssignment_0"
    // InternalGrocery.g:2563:1: rule__Grocery__ElementsAssignment_0 : ( ruleBuilding ) ;
    public final void rule__Grocery__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2567:1: ( ( ruleBuilding ) )
            // InternalGrocery.g:2568:2: ( ruleBuilding )
            {
            // InternalGrocery.g:2568:2: ( ruleBuilding )
            // InternalGrocery.g:2569:3: ruleBuilding
            {
             before(grammarAccess.getGroceryAccess().getElementsBuildingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBuilding();

            state._fsp--;

             after(grammarAccess.getGroceryAccess().getElementsBuildingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__ElementsAssignment_0"


    // $ANTLR start "rule__Grocery__ElementsAssignment_1"
    // InternalGrocery.g:2578:1: rule__Grocery__ElementsAssignment_1 : ( ruleDeliveryElement ) ;
    public final void rule__Grocery__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2582:1: ( ( ruleDeliveryElement ) )
            // InternalGrocery.g:2583:2: ( ruleDeliveryElement )
            {
            // InternalGrocery.g:2583:2: ( ruleDeliveryElement )
            // InternalGrocery.g:2584:3: ruleDeliveryElement
            {
             before(grammarAccess.getGroceryAccess().getElementsDeliveryElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeliveryElement();

            state._fsp--;

             after(grammarAccess.getGroceryAccess().getElementsDeliveryElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__ElementsAssignment_1"


    // $ANTLR start "rule__Store__NameAssignment_1"
    // InternalGrocery.g:2593:1: rule__Store__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2597:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2598:2: ( RULE_ID )
            {
            // InternalGrocery.g:2598:2: ( RULE_ID )
            // InternalGrocery.g:2599:3: RULE_ID
            {
             before(grammarAccess.getStoreAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__NameAssignment_1"


    // $ANTLR start "rule__Store__ElementsAssignment_3"
    // InternalGrocery.g:2608:1: rule__Store__ElementsAssignment_3 : ( ruleStoreElements ) ;
    public final void rule__Store__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2612:1: ( ( ruleStoreElements ) )
            // InternalGrocery.g:2613:2: ( ruleStoreElements )
            {
            // InternalGrocery.g:2613:2: ( ruleStoreElements )
            // InternalGrocery.g:2614:3: ruleStoreElements
            {
             before(grammarAccess.getStoreAccess().getElementsStoreElementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStoreElements();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getElementsStoreElementsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__ElementsAssignment_3"


    // $ANTLR start "rule__Warehouse__NameAssignment_1"
    // InternalGrocery.g:2623:1: rule__Warehouse__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Warehouse__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2627:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2628:2: ( RULE_ID )
            {
            // InternalGrocery.g:2628:2: ( RULE_ID )
            // InternalGrocery.g:2629:3: RULE_ID
            {
             before(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__NameAssignment_1"


    // $ANTLR start "rule__Warehouse__AddressAssignment_3"
    // InternalGrocery.g:2638:1: rule__Warehouse__AddressAssignment_3 : ( ruleAddress ) ;
    public final void rule__Warehouse__AddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2642:1: ( ( ruleAddress ) )
            // InternalGrocery.g:2643:2: ( ruleAddress )
            {
            // InternalGrocery.g:2643:2: ( ruleAddress )
            // InternalGrocery.g:2644:3: ruleAddress
            {
             before(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__AddressAssignment_3"


    // $ANTLR start "rule__Warehouse__ElementsAssignment_4"
    // InternalGrocery.g:2653:1: rule__Warehouse__ElementsAssignment_4 : ( ruleItem ) ;
    public final void rule__Warehouse__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2657:1: ( ( ruleItem ) )
            // InternalGrocery.g:2658:2: ( ruleItem )
            {
            // InternalGrocery.g:2658:2: ( ruleItem )
            // InternalGrocery.g:2659:3: ruleItem
            {
             before(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__ElementsAssignment_4"


    // $ANTLR start "rule__Shelf__NameAssignment_1"
    // InternalGrocery.g:2668:1: rule__Shelf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Shelf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2672:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2673:2: ( RULE_ID )
            {
            // InternalGrocery.g:2673:2: ( RULE_ID )
            // InternalGrocery.g:2674:3: RULE_ID
            {
             before(grammarAccess.getShelfAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__NameAssignment_1"


    // $ANTLR start "rule__Shelf__ElementsAssignment_3"
    // InternalGrocery.g:2683:1: rule__Shelf__ElementsAssignment_3 : ( ruleItem ) ;
    public final void rule__Shelf__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2687:1: ( ( ruleItem ) )
            // InternalGrocery.g:2688:2: ( ruleItem )
            {
            // InternalGrocery.g:2688:2: ( ruleItem )
            // InternalGrocery.g:2689:3: ruleItem
            {
             before(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__ElementsAssignment_3"


    // $ANTLR start "rule__Backroom__NameAssignment_1"
    // InternalGrocery.g:2698:1: rule__Backroom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Backroom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2702:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2703:2: ( RULE_ID )
            {
            // InternalGrocery.g:2703:2: ( RULE_ID )
            // InternalGrocery.g:2704:3: RULE_ID
            {
             before(grammarAccess.getBackroomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__NameAssignment_1"


    // $ANTLR start "rule__Backroom__ElementsAssignment_3"
    // InternalGrocery.g:2713:1: rule__Backroom__ElementsAssignment_3 : ( ruleItem ) ;
    public final void rule__Backroom__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2717:1: ( ( ruleItem ) )
            // InternalGrocery.g:2718:2: ( ruleItem )
            {
            // InternalGrocery.g:2718:2: ( ruleItem )
            // InternalGrocery.g:2719:3: ruleItem
            {
             before(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__ElementsAssignment_3"


    // $ANTLR start "rule__NonPerishableItem__NameAssignment_1"
    // InternalGrocery.g:2728:1: rule__NonPerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonPerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2732:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2733:2: ( RULE_ID )
            {
            // InternalGrocery.g:2733:2: ( RULE_ID )
            // InternalGrocery.g:2734:3: RULE_ID
            {
             before(grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__NameAssignment_1"


    // $ANTLR start "rule__NonPerishableItem__PriceAssignment_5"
    // InternalGrocery.g:2743:1: rule__NonPerishableItem__PriceAssignment_5 : ( RULE_INT ) ;
    public final void rule__NonPerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2747:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2748:2: ( RULE_INT )
            {
            // InternalGrocery.g:2748:2: ( RULE_INT )
            // InternalGrocery.g:2749:3: RULE_INT
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonPerishableItem__PriceAssignment_5"


    // $ANTLR start "rule__PerishableItem__NameAssignment_1"
    // InternalGrocery.g:2758:1: rule__PerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2762:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2763:2: ( RULE_ID )
            {
            // InternalGrocery.g:2763:2: ( RULE_ID )
            // InternalGrocery.g:2764:3: RULE_ID
            {
             before(grammarAccess.getPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__NameAssignment_1"


    // $ANTLR start "rule__PerishableItem__PriceAssignment_5"
    // InternalGrocery.g:2773:1: rule__PerishableItem__PriceAssignment_5 : ( RULE_INT ) ;
    public final void rule__PerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2777:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2778:2: ( RULE_INT )
            {
            // InternalGrocery.g:2778:2: ( RULE_INT )
            // InternalGrocery.g:2779:3: RULE_INT
            {
             before(grammarAccess.getPerishableItemAccess().getPriceINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getPriceINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__PriceAssignment_5"


    // $ANTLR start "rule__PerishableItem__ExperationDateAssignment_6"
    // InternalGrocery.g:2788:1: rule__PerishableItem__ExperationDateAssignment_6 : ( ruleExperationDate ) ;
    public final void rule__PerishableItem__ExperationDateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2792:1: ( ( ruleExperationDate ) )
            // InternalGrocery.g:2793:2: ( ruleExperationDate )
            {
            // InternalGrocery.g:2793:2: ( ruleExperationDate )
            // InternalGrocery.g:2794:3: ruleExperationDate
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExperationDate();

            state._fsp--;

             after(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__ExperationDateAssignment_6"


    // $ANTLR start "rule__Address__StreetAssignment_4"
    // InternalGrocery.g:2803:1: rule__Address__StreetAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Address__StreetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2807:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2808:2: ( RULE_STRING )
            {
            // InternalGrocery.g:2808:2: ( RULE_STRING )
            // InternalGrocery.g:2809:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__StreetAssignment_4"


    // $ANTLR start "rule__Address__NumberAssignment_7"
    // InternalGrocery.g:2818:1: rule__Address__NumberAssignment_7 : ( RULE_INT ) ;
    public final void rule__Address__NumberAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2822:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2823:2: ( RULE_INT )
            {
            // InternalGrocery.g:2823:2: ( RULE_INT )
            // InternalGrocery.g:2824:3: RULE_INT
            {
             before(grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__NumberAssignment_7"


    // $ANTLR start "rule__Address__CityAssignment_10"
    // InternalGrocery.g:2833:1: rule__Address__CityAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Address__CityAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2837:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2838:2: ( RULE_STRING )
            {
            // InternalGrocery.g:2838:2: ( RULE_STRING )
            // InternalGrocery.g:2839:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__CityAssignment_10"


    // $ANTLR start "rule__ExperationDate__MonthAssignment_4"
    // InternalGrocery.g:2848:1: rule__ExperationDate__MonthAssignment_4 : ( RULE_INT ) ;
    public final void rule__ExperationDate__MonthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2852:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2853:2: ( RULE_INT )
            {
            // InternalGrocery.g:2853:2: ( RULE_INT )
            // InternalGrocery.g:2854:3: RULE_INT
            {
             before(grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__MonthAssignment_4"


    // $ANTLR start "rule__ExperationDate__DayAssignment_7"
    // InternalGrocery.g:2863:1: rule__ExperationDate__DayAssignment_7 : ( RULE_INT ) ;
    public final void rule__ExperationDate__DayAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2867:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2868:2: ( RULE_INT )
            {
            // InternalGrocery.g:2868:2: ( RULE_INT )
            // InternalGrocery.g:2869:3: RULE_INT
            {
             before(grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__DayAssignment_7"


    // $ANTLR start "rule__ExperationDate__YearAssignment_10"
    // InternalGrocery.g:2878:1: rule__ExperationDate__YearAssignment_10 : ( RULE_INT ) ;
    public final void rule__ExperationDate__YearAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2882:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2883:2: ( RULE_INT )
            {
            // InternalGrocery.g:2883:2: ( RULE_INT )
            // InternalGrocery.g:2884:3: RULE_INT
            {
             before(grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperationDate__YearAssignment_10"


    // $ANTLR start "rule__Driver__NameAssignment_1"
    // InternalGrocery.g:2893:1: rule__Driver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Driver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2897:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2898:2: ( RULE_ID )
            {
            // InternalGrocery.g:2898:2: ( RULE_ID )
            // InternalGrocery.g:2899:3: RULE_ID
            {
             before(grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__NameAssignment_1"


    // $ANTLR start "rule__Driver__DriverNameAssignment_5"
    // InternalGrocery.g:2908:1: rule__Driver__DriverNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Driver__DriverNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2912:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2913:2: ( RULE_STRING )
            {
            // InternalGrocery.g:2913:2: ( RULE_STRING )
            // InternalGrocery.g:2914:3: RULE_STRING
            {
             before(grammarAccess.getDriverAccess().getDriverNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getDriverNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__DriverNameAssignment_5"


    // $ANTLR start "rule__Vehicle__NameAssignment_1"
    // InternalGrocery.g:2923:1: rule__Vehicle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2927:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2928:2: ( RULE_ID )
            {
            // InternalGrocery.g:2928:2: ( RULE_ID )
            // InternalGrocery.g:2929:3: RULE_ID
            {
             before(grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__NameAssignment_1"


    // $ANTLR start "rule__Vehicle__PlateNumberAssignment_5"
    // InternalGrocery.g:2938:1: rule__Vehicle__PlateNumberAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Vehicle__PlateNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2942:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2943:2: ( RULE_STRING )
            {
            // InternalGrocery.g:2943:2: ( RULE_STRING )
            // InternalGrocery.g:2944:3: RULE_STRING
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getPlateNumberSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__PlateNumberAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000122000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'warehouse'", "'address'", "':'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'price'", "'quantity'", "'perishableItem'", "'ExpirationDate'", "'date'", "'driver'", "'name'", "'vehicle'", "'plateNumber'", "'.'", "'/'", "','"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


    // $ANTLR start "entryRuleExperationDate"
    // InternalGrocery.g:328:1: entryRuleExperationDate : ruleExperationDate EOF ;
    public final void entryRuleExperationDate() throws RecognitionException {
        try {
            // InternalGrocery.g:329:1: ( ruleExperationDate EOF )
            // InternalGrocery.g:330:1: ruleExperationDate EOF
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
    // InternalGrocery.g:337:1: ruleExperationDate : ( ( rule__ExperationDate__Group__0 ) ) ;
    public final void ruleExperationDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:341:2: ( ( ( rule__ExperationDate__Group__0 ) ) )
            // InternalGrocery.g:342:2: ( ( rule__ExperationDate__Group__0 ) )
            {
            // InternalGrocery.g:342:2: ( ( rule__ExperationDate__Group__0 ) )
            // InternalGrocery.g:343:3: ( rule__ExperationDate__Group__0 )
            {
             before(grammarAccess.getExperationDateAccess().getGroup()); 
            // InternalGrocery.g:344:3: ( rule__ExperationDate__Group__0 )
            // InternalGrocery.g:344:4: rule__ExperationDate__Group__0
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
    // InternalGrocery.g:353:1: entryRuleDriver : ruleDriver EOF ;
    public final void entryRuleDriver() throws RecognitionException {
        try {
            // InternalGrocery.g:354:1: ( ruleDriver EOF )
            // InternalGrocery.g:355:1: ruleDriver EOF
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
    // InternalGrocery.g:362:1: ruleDriver : ( ( rule__Driver__Group__0 ) ) ;
    public final void ruleDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:366:2: ( ( ( rule__Driver__Group__0 ) ) )
            // InternalGrocery.g:367:2: ( ( rule__Driver__Group__0 ) )
            {
            // InternalGrocery.g:367:2: ( ( rule__Driver__Group__0 ) )
            // InternalGrocery.g:368:3: ( rule__Driver__Group__0 )
            {
             before(grammarAccess.getDriverAccess().getGroup()); 
            // InternalGrocery.g:369:3: ( rule__Driver__Group__0 )
            // InternalGrocery.g:369:4: rule__Driver__Group__0
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
    // InternalGrocery.g:378:1: entryRuleVehicle : ruleVehicle EOF ;
    public final void entryRuleVehicle() throws RecognitionException {
        try {
            // InternalGrocery.g:379:1: ( ruleVehicle EOF )
            // InternalGrocery.g:380:1: ruleVehicle EOF
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
    // InternalGrocery.g:387:1: ruleVehicle : ( ( rule__Vehicle__Group__0 ) ) ;
    public final void ruleVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:391:2: ( ( ( rule__Vehicle__Group__0 ) ) )
            // InternalGrocery.g:392:2: ( ( rule__Vehicle__Group__0 ) )
            {
            // InternalGrocery.g:392:2: ( ( rule__Vehicle__Group__0 ) )
            // InternalGrocery.g:393:3: ( rule__Vehicle__Group__0 )
            {
             before(grammarAccess.getVehicleAccess().getGroup()); 
            // InternalGrocery.g:394:3: ( rule__Vehicle__Group__0 )
            // InternalGrocery.g:394:4: rule__Vehicle__Group__0
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


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGrocery.g:403:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalGrocery.g:404:1: ( ruleDECIMAL EOF )
            // InternalGrocery.g:405:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_1);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // InternalGrocery.g:412:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:416:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalGrocery.g:417:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalGrocery.g:417:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalGrocery.g:418:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalGrocery.g:419:3: ( rule__DECIMAL__Group__0 )
            // InternalGrocery.g:419:4: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

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
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "entryRuleDATE"
    // InternalGrocery.g:428:1: entryRuleDATE : ruleDATE EOF ;
    public final void entryRuleDATE() throws RecognitionException {
        try {
            // InternalGrocery.g:429:1: ( ruleDATE EOF )
            // InternalGrocery.g:430:1: ruleDATE EOF
            {
             before(grammarAccess.getDATERule()); 
            pushFollow(FOLLOW_1);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getDATERule()); 
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
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalGrocery.g:437:1: ruleDATE : ( ( rule__DATE__Group__0 ) ) ;
    public final void ruleDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:441:2: ( ( ( rule__DATE__Group__0 ) ) )
            // InternalGrocery.g:442:2: ( ( rule__DATE__Group__0 ) )
            {
            // InternalGrocery.g:442:2: ( ( rule__DATE__Group__0 ) )
            // InternalGrocery.g:443:3: ( rule__DATE__Group__0 )
            {
             before(grammarAccess.getDATEAccess().getGroup()); 
            // InternalGrocery.g:444:3: ( rule__DATE__Group__0 )
            // InternalGrocery.g:444:4: rule__DATE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DATE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDATEAccess().getGroup()); 

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
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleADDRESS"
    // InternalGrocery.g:453:1: entryRuleADDRESS : ruleADDRESS EOF ;
    public final void entryRuleADDRESS() throws RecognitionException {
        try {
            // InternalGrocery.g:454:1: ( ruleADDRESS EOF )
            // InternalGrocery.g:455:1: ruleADDRESS EOF
            {
             before(grammarAccess.getADDRESSRule()); 
            pushFollow(FOLLOW_1);
            ruleADDRESS();

            state._fsp--;

             after(grammarAccess.getADDRESSRule()); 
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
    // $ANTLR end "entryRuleADDRESS"


    // $ANTLR start "ruleADDRESS"
    // InternalGrocery.g:462:1: ruleADDRESS : ( ( rule__ADDRESS__Group__0 ) ) ;
    public final void ruleADDRESS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:466:2: ( ( ( rule__ADDRESS__Group__0 ) ) )
            // InternalGrocery.g:467:2: ( ( rule__ADDRESS__Group__0 ) )
            {
            // InternalGrocery.g:467:2: ( ( rule__ADDRESS__Group__0 ) )
            // InternalGrocery.g:468:3: ( rule__ADDRESS__Group__0 )
            {
             before(grammarAccess.getADDRESSAccess().getGroup()); 
            // InternalGrocery.g:469:3: ( rule__ADDRESS__Group__0 )
            // InternalGrocery.g:469:4: rule__ADDRESS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getADDRESSAccess().getGroup()); 

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
    // $ANTLR end "ruleADDRESS"


    // $ANTLR start "rule__Building__Alternatives"
    // InternalGrocery.g:477:1: rule__Building__Alternatives : ( ( ruleStore ) | ( ruleWarehouse ) );
    public final void rule__Building__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:481:1: ( ( ruleStore ) | ( ruleWarehouse ) )
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
                    // InternalGrocery.g:482:2: ( ruleStore )
                    {
                    // InternalGrocery.g:482:2: ( ruleStore )
                    // InternalGrocery.g:483:3: ruleStore
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
                    // InternalGrocery.g:488:2: ( ruleWarehouse )
                    {
                    // InternalGrocery.g:488:2: ( ruleWarehouse )
                    // InternalGrocery.g:489:3: ruleWarehouse
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
    // InternalGrocery.g:498:1: rule__StoreElements__Alternatives : ( ( ruleBackroom ) | ( ruleShelf ) );
    public final void rule__StoreElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:502:1: ( ( ruleBackroom ) | ( ruleShelf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGrocery.g:503:2: ( ruleBackroom )
                    {
                    // InternalGrocery.g:503:2: ( ruleBackroom )
                    // InternalGrocery.g:504:3: ruleBackroom
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
                    // InternalGrocery.g:509:2: ( ruleShelf )
                    {
                    // InternalGrocery.g:509:2: ( ruleShelf )
                    // InternalGrocery.g:510:3: ruleShelf
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
    // InternalGrocery.g:519:1: rule__DeliveryElement__Alternatives : ( ( ruleDriver ) | ( ruleVehicle ) );
    public final void rule__DeliveryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:523:1: ( ( ruleDriver ) | ( ruleVehicle ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGrocery.g:524:2: ( ruleDriver )
                    {
                    // InternalGrocery.g:524:2: ( ruleDriver )
                    // InternalGrocery.g:525:3: ruleDriver
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
                    // InternalGrocery.g:530:2: ( ruleVehicle )
                    {
                    // InternalGrocery.g:530:2: ( ruleVehicle )
                    // InternalGrocery.g:531:3: ruleVehicle
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
    // InternalGrocery.g:540:1: rule__Item__Alternatives : ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:544:1: ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGrocery.g:545:2: ( rulePerishableItem )
                    {
                    // InternalGrocery.g:545:2: ( rulePerishableItem )
                    // InternalGrocery.g:546:3: rulePerishableItem
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
                    // InternalGrocery.g:551:2: ( ruleNonPerishableItem )
                    {
                    // InternalGrocery.g:551:2: ( ruleNonPerishableItem )
                    // InternalGrocery.g:552:3: ruleNonPerishableItem
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
    // InternalGrocery.g:561:1: rule__Grocery__Group__0 : rule__Grocery__Group__0__Impl rule__Grocery__Group__1 ;
    public final void rule__Grocery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:565:1: ( rule__Grocery__Group__0__Impl rule__Grocery__Group__1 )
            // InternalGrocery.g:566:2: rule__Grocery__Group__0__Impl rule__Grocery__Group__1
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
    // InternalGrocery.g:573:1: rule__Grocery__Group__0__Impl : ( ( rule__Grocery__ElementsAssignment_0 )* ) ;
    public final void rule__Grocery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:577:1: ( ( ( rule__Grocery__ElementsAssignment_0 )* ) )
            // InternalGrocery.g:578:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            {
            // InternalGrocery.g:578:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            // InternalGrocery.g:579:2: ( rule__Grocery__ElementsAssignment_0 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_0()); 
            // InternalGrocery.g:580:2: ( rule__Grocery__ElementsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrocery.g:580:3: rule__Grocery__ElementsAssignment_0
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
    // InternalGrocery.g:588:1: rule__Grocery__Group__1 : rule__Grocery__Group__1__Impl ;
    public final void rule__Grocery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:592:1: ( rule__Grocery__Group__1__Impl )
            // InternalGrocery.g:593:2: rule__Grocery__Group__1__Impl
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
    // InternalGrocery.g:599:1: rule__Grocery__Group__1__Impl : ( ( rule__Grocery__ElementsAssignment_1 )* ) ;
    public final void rule__Grocery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:603:1: ( ( ( rule__Grocery__ElementsAssignment_1 )* ) )
            // InternalGrocery.g:604:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            {
            // InternalGrocery.g:604:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            // InternalGrocery.g:605:2: ( rule__Grocery__ElementsAssignment_1 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_1()); 
            // InternalGrocery.g:606:2: ( rule__Grocery__ElementsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGrocery.g:606:3: rule__Grocery__ElementsAssignment_1
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
    // InternalGrocery.g:615:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:619:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalGrocery.g:620:2: rule__Store__Group__0__Impl rule__Store__Group__1
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
    // InternalGrocery.g:627:1: rule__Store__Group__0__Impl : ( 'store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:631:1: ( ( 'store' ) )
            // InternalGrocery.g:632:1: ( 'store' )
            {
            // InternalGrocery.g:632:1: ( 'store' )
            // InternalGrocery.g:633:2: 'store'
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
    // InternalGrocery.g:642:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:646:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalGrocery.g:647:2: rule__Store__Group__1__Impl rule__Store__Group__2
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
    // InternalGrocery.g:654:1: rule__Store__Group__1__Impl : ( ( rule__Store__NameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:658:1: ( ( ( rule__Store__NameAssignment_1 ) ) )
            // InternalGrocery.g:659:1: ( ( rule__Store__NameAssignment_1 ) )
            {
            // InternalGrocery.g:659:1: ( ( rule__Store__NameAssignment_1 ) )
            // InternalGrocery.g:660:2: ( rule__Store__NameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getNameAssignment_1()); 
            // InternalGrocery.g:661:2: ( rule__Store__NameAssignment_1 )
            // InternalGrocery.g:661:3: rule__Store__NameAssignment_1
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
    // InternalGrocery.g:669:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:673:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalGrocery.g:674:2: rule__Store__Group__2__Impl rule__Store__Group__3
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
    // InternalGrocery.g:681:1: rule__Store__Group__2__Impl : ( '{' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:685:1: ( ( '{' ) )
            // InternalGrocery.g:686:1: ( '{' )
            {
            // InternalGrocery.g:686:1: ( '{' )
            // InternalGrocery.g:687:2: '{'
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
    // InternalGrocery.g:696:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:700:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalGrocery.g:701:2: rule__Store__Group__3__Impl rule__Store__Group__4
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
    // InternalGrocery.g:708:1: rule__Store__Group__3__Impl : ( ( rule__Store__ElementsAssignment_3 )* ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:712:1: ( ( ( rule__Store__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:713:1: ( ( rule__Store__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:713:1: ( ( rule__Store__ElementsAssignment_3 )* )
            // InternalGrocery.g:714:2: ( rule__Store__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStoreAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:715:2: ( rule__Store__ElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrocery.g:715:3: rule__Store__ElementsAssignment_3
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
    // InternalGrocery.g:723:1: rule__Store__Group__4 : rule__Store__Group__4__Impl ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:727:1: ( rule__Store__Group__4__Impl )
            // InternalGrocery.g:728:2: rule__Store__Group__4__Impl
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
    // InternalGrocery.g:734:1: rule__Store__Group__4__Impl : ( '}' ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:738:1: ( ( '}' ) )
            // InternalGrocery.g:739:1: ( '}' )
            {
            // InternalGrocery.g:739:1: ( '}' )
            // InternalGrocery.g:740:2: '}'
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
    // InternalGrocery.g:750:1: rule__Warehouse__Group__0 : rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 ;
    public final void rule__Warehouse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:754:1: ( rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 )
            // InternalGrocery.g:755:2: rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1
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
    // InternalGrocery.g:762:1: rule__Warehouse__Group__0__Impl : ( 'warehouse' ) ;
    public final void rule__Warehouse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:766:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:767:1: ( 'warehouse' )
            {
            // InternalGrocery.g:767:1: ( 'warehouse' )
            // InternalGrocery.g:768:2: 'warehouse'
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
    // InternalGrocery.g:777:1: rule__Warehouse__Group__1 : rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 ;
    public final void rule__Warehouse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:781:1: ( rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 )
            // InternalGrocery.g:782:2: rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2
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
    // InternalGrocery.g:789:1: rule__Warehouse__Group__1__Impl : ( ( rule__Warehouse__NameAssignment_1 ) ) ;
    public final void rule__Warehouse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:793:1: ( ( ( rule__Warehouse__NameAssignment_1 ) ) )
            // InternalGrocery.g:794:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            {
            // InternalGrocery.g:794:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            // InternalGrocery.g:795:2: ( rule__Warehouse__NameAssignment_1 )
            {
             before(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 
            // InternalGrocery.g:796:2: ( rule__Warehouse__NameAssignment_1 )
            // InternalGrocery.g:796:3: rule__Warehouse__NameAssignment_1
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
    // InternalGrocery.g:804:1: rule__Warehouse__Group__2 : rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 ;
    public final void rule__Warehouse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:808:1: ( rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 )
            // InternalGrocery.g:809:2: rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3
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
    // InternalGrocery.g:816:1: rule__Warehouse__Group__2__Impl : ( '{' ) ;
    public final void rule__Warehouse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:820:1: ( ( '{' ) )
            // InternalGrocery.g:821:1: ( '{' )
            {
            // InternalGrocery.g:821:1: ( '{' )
            // InternalGrocery.g:822:2: '{'
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
    // InternalGrocery.g:831:1: rule__Warehouse__Group__3 : rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 ;
    public final void rule__Warehouse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:835:1: ( rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 )
            // InternalGrocery.g:836:2: rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4
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
    // InternalGrocery.g:843:1: rule__Warehouse__Group__3__Impl : ( 'address' ) ;
    public final void rule__Warehouse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:847:1: ( ( 'address' ) )
            // InternalGrocery.g:848:1: ( 'address' )
            {
            // InternalGrocery.g:848:1: ( 'address' )
            // InternalGrocery.g:849:2: 'address'
            {
             before(grammarAccess.getWarehouseAccess().getAddressKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getAddressKeyword_3()); 

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
    // InternalGrocery.g:858:1: rule__Warehouse__Group__4 : rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 ;
    public final void rule__Warehouse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:862:1: ( rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 )
            // InternalGrocery.g:863:2: rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalGrocery.g:870:1: rule__Warehouse__Group__4__Impl : ( ':' ) ;
    public final void rule__Warehouse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:874:1: ( ( ':' ) )
            // InternalGrocery.g:875:1: ( ':' )
            {
            // InternalGrocery.g:875:1: ( ':' )
            // InternalGrocery.g:876:2: ':'
            {
             before(grammarAccess.getWarehouseAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getColonKeyword_4()); 

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
    // InternalGrocery.g:885:1: rule__Warehouse__Group__5 : rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 ;
    public final void rule__Warehouse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:889:1: ( rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 )
            // InternalGrocery.g:890:2: rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Warehouse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__6();

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
    // InternalGrocery.g:897:1: rule__Warehouse__Group__5__Impl : ( ( rule__Warehouse__AddressAssignment_5 ) ) ;
    public final void rule__Warehouse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:901:1: ( ( ( rule__Warehouse__AddressAssignment_5 ) ) )
            // InternalGrocery.g:902:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            {
            // InternalGrocery.g:902:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            // InternalGrocery.g:903:2: ( rule__Warehouse__AddressAssignment_5 )
            {
             before(grammarAccess.getWarehouseAccess().getAddressAssignment_5()); 
            // InternalGrocery.g:904:2: ( rule__Warehouse__AddressAssignment_5 )
            // InternalGrocery.g:904:3: rule__Warehouse__AddressAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__AddressAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getAddressAssignment_5()); 

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


    // $ANTLR start "rule__Warehouse__Group__6"
    // InternalGrocery.g:912:1: rule__Warehouse__Group__6 : rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 ;
    public final void rule__Warehouse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:916:1: ( rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 )
            // InternalGrocery.g:917:2: rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Warehouse__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__7();

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
    // $ANTLR end "rule__Warehouse__Group__6"


    // $ANTLR start "rule__Warehouse__Group__6__Impl"
    // InternalGrocery.g:924:1: rule__Warehouse__Group__6__Impl : ( ( rule__Warehouse__ElementsAssignment_6 )* ) ;
    public final void rule__Warehouse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:928:1: ( ( ( rule__Warehouse__ElementsAssignment_6 )* ) )
            // InternalGrocery.g:929:1: ( ( rule__Warehouse__ElementsAssignment_6 )* )
            {
            // InternalGrocery.g:929:1: ( ( rule__Warehouse__ElementsAssignment_6 )* )
            // InternalGrocery.g:930:2: ( rule__Warehouse__ElementsAssignment_6 )*
            {
             before(grammarAccess.getWarehouseAccess().getElementsAssignment_6()); 
            // InternalGrocery.g:931:2: ( rule__Warehouse__ElementsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrocery.g:931:3: rule__Warehouse__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Warehouse__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWarehouseAccess().getElementsAssignment_6()); 

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
    // $ANTLR end "rule__Warehouse__Group__6__Impl"


    // $ANTLR start "rule__Warehouse__Group__7"
    // InternalGrocery.g:939:1: rule__Warehouse__Group__7 : rule__Warehouse__Group__7__Impl ;
    public final void rule__Warehouse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:943:1: ( rule__Warehouse__Group__7__Impl )
            // InternalGrocery.g:944:2: rule__Warehouse__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__7__Impl();

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
    // $ANTLR end "rule__Warehouse__Group__7"


    // $ANTLR start "rule__Warehouse__Group__7__Impl"
    // InternalGrocery.g:950:1: rule__Warehouse__Group__7__Impl : ( '}' ) ;
    public final void rule__Warehouse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:954:1: ( ( '}' ) )
            // InternalGrocery.g:955:1: ( '}' )
            {
            // InternalGrocery.g:955:1: ( '}' )
            // InternalGrocery.g:956:2: '}'
            {
             before(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Warehouse__Group__7__Impl"


    // $ANTLR start "rule__Shelf__Group__0"
    // InternalGrocery.g:966:1: rule__Shelf__Group__0 : rule__Shelf__Group__0__Impl rule__Shelf__Group__1 ;
    public final void rule__Shelf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:970:1: ( rule__Shelf__Group__0__Impl rule__Shelf__Group__1 )
            // InternalGrocery.g:971:2: rule__Shelf__Group__0__Impl rule__Shelf__Group__1
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
    // InternalGrocery.g:978:1: rule__Shelf__Group__0__Impl : ( 'shelf' ) ;
    public final void rule__Shelf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:982:1: ( ( 'shelf' ) )
            // InternalGrocery.g:983:1: ( 'shelf' )
            {
            // InternalGrocery.g:983:1: ( 'shelf' )
            // InternalGrocery.g:984:2: 'shelf'
            {
             before(grammarAccess.getShelfAccess().getShelfKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGrocery.g:993:1: rule__Shelf__Group__1 : rule__Shelf__Group__1__Impl rule__Shelf__Group__2 ;
    public final void rule__Shelf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:997:1: ( rule__Shelf__Group__1__Impl rule__Shelf__Group__2 )
            // InternalGrocery.g:998:2: rule__Shelf__Group__1__Impl rule__Shelf__Group__2
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
    // InternalGrocery.g:1005:1: rule__Shelf__Group__1__Impl : ( ( rule__Shelf__NameAssignment_1 ) ) ;
    public final void rule__Shelf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1009:1: ( ( ( rule__Shelf__NameAssignment_1 ) ) )
            // InternalGrocery.g:1010:1: ( ( rule__Shelf__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1010:1: ( ( rule__Shelf__NameAssignment_1 ) )
            // InternalGrocery.g:1011:2: ( rule__Shelf__NameAssignment_1 )
            {
             before(grammarAccess.getShelfAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1012:2: ( rule__Shelf__NameAssignment_1 )
            // InternalGrocery.g:1012:3: rule__Shelf__NameAssignment_1
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
    // InternalGrocery.g:1020:1: rule__Shelf__Group__2 : rule__Shelf__Group__2__Impl rule__Shelf__Group__3 ;
    public final void rule__Shelf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1024:1: ( rule__Shelf__Group__2__Impl rule__Shelf__Group__3 )
            // InternalGrocery.g:1025:2: rule__Shelf__Group__2__Impl rule__Shelf__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGrocery.g:1032:1: rule__Shelf__Group__2__Impl : ( '{' ) ;
    public final void rule__Shelf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1036:1: ( ( '{' ) )
            // InternalGrocery.g:1037:1: ( '{' )
            {
            // InternalGrocery.g:1037:1: ( '{' )
            // InternalGrocery.g:1038:2: '{'
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
    // InternalGrocery.g:1047:1: rule__Shelf__Group__3 : rule__Shelf__Group__3__Impl rule__Shelf__Group__4 ;
    public final void rule__Shelf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1051:1: ( rule__Shelf__Group__3__Impl rule__Shelf__Group__4 )
            // InternalGrocery.g:1052:2: rule__Shelf__Group__3__Impl rule__Shelf__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalGrocery.g:1059:1: rule__Shelf__Group__3__Impl : ( ( rule__Shelf__ElementsAssignment_3 )* ) ;
    public final void rule__Shelf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1063:1: ( ( ( rule__Shelf__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:1064:1: ( ( rule__Shelf__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:1064:1: ( ( rule__Shelf__ElementsAssignment_3 )* )
            // InternalGrocery.g:1065:2: ( rule__Shelf__ElementsAssignment_3 )*
            {
             before(grammarAccess.getShelfAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:1066:2: ( rule__Shelf__ElementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrocery.g:1066:3: rule__Shelf__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalGrocery.g:1074:1: rule__Shelf__Group__4 : rule__Shelf__Group__4__Impl ;
    public final void rule__Shelf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1078:1: ( rule__Shelf__Group__4__Impl )
            // InternalGrocery.g:1079:2: rule__Shelf__Group__4__Impl
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
    // InternalGrocery.g:1085:1: rule__Shelf__Group__4__Impl : ( '}' ) ;
    public final void rule__Shelf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1089:1: ( ( '}' ) )
            // InternalGrocery.g:1090:1: ( '}' )
            {
            // InternalGrocery.g:1090:1: ( '}' )
            // InternalGrocery.g:1091:2: '}'
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
    // InternalGrocery.g:1101:1: rule__Backroom__Group__0 : rule__Backroom__Group__0__Impl rule__Backroom__Group__1 ;
    public final void rule__Backroom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1105:1: ( rule__Backroom__Group__0__Impl rule__Backroom__Group__1 )
            // InternalGrocery.g:1106:2: rule__Backroom__Group__0__Impl rule__Backroom__Group__1
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
    // InternalGrocery.g:1113:1: rule__Backroom__Group__0__Impl : ( 'backroom' ) ;
    public final void rule__Backroom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1117:1: ( ( 'backroom' ) )
            // InternalGrocery.g:1118:1: ( 'backroom' )
            {
            // InternalGrocery.g:1118:1: ( 'backroom' )
            // InternalGrocery.g:1119:2: 'backroom'
            {
             before(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGrocery.g:1128:1: rule__Backroom__Group__1 : rule__Backroom__Group__1__Impl rule__Backroom__Group__2 ;
    public final void rule__Backroom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1132:1: ( rule__Backroom__Group__1__Impl rule__Backroom__Group__2 )
            // InternalGrocery.g:1133:2: rule__Backroom__Group__1__Impl rule__Backroom__Group__2
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
    // InternalGrocery.g:1140:1: rule__Backroom__Group__1__Impl : ( ( rule__Backroom__NameAssignment_1 ) ) ;
    public final void rule__Backroom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1144:1: ( ( ( rule__Backroom__NameAssignment_1 ) ) )
            // InternalGrocery.g:1145:1: ( ( rule__Backroom__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1145:1: ( ( rule__Backroom__NameAssignment_1 ) )
            // InternalGrocery.g:1146:2: ( rule__Backroom__NameAssignment_1 )
            {
             before(grammarAccess.getBackroomAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1147:2: ( rule__Backroom__NameAssignment_1 )
            // InternalGrocery.g:1147:3: rule__Backroom__NameAssignment_1
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
    // InternalGrocery.g:1155:1: rule__Backroom__Group__2 : rule__Backroom__Group__2__Impl rule__Backroom__Group__3 ;
    public final void rule__Backroom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1159:1: ( rule__Backroom__Group__2__Impl rule__Backroom__Group__3 )
            // InternalGrocery.g:1160:2: rule__Backroom__Group__2__Impl rule__Backroom__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGrocery.g:1167:1: rule__Backroom__Group__2__Impl : ( '{' ) ;
    public final void rule__Backroom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1171:1: ( ( '{' ) )
            // InternalGrocery.g:1172:1: ( '{' )
            {
            // InternalGrocery.g:1172:1: ( '{' )
            // InternalGrocery.g:1173:2: '{'
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
    // InternalGrocery.g:1182:1: rule__Backroom__Group__3 : rule__Backroom__Group__3__Impl rule__Backroom__Group__4 ;
    public final void rule__Backroom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1186:1: ( rule__Backroom__Group__3__Impl rule__Backroom__Group__4 )
            // InternalGrocery.g:1187:2: rule__Backroom__Group__3__Impl rule__Backroom__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalGrocery.g:1194:1: rule__Backroom__Group__3__Impl : ( ( rule__Backroom__ElementsAssignment_3 )* ) ;
    public final void rule__Backroom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1198:1: ( ( ( rule__Backroom__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:1199:1: ( ( rule__Backroom__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:1199:1: ( ( rule__Backroom__ElementsAssignment_3 )* )
            // InternalGrocery.g:1200:2: ( rule__Backroom__ElementsAssignment_3 )*
            {
             before(grammarAccess.getBackroomAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:1201:2: ( rule__Backroom__ElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19||LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrocery.g:1201:3: rule__Backroom__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalGrocery.g:1209:1: rule__Backroom__Group__4 : rule__Backroom__Group__4__Impl ;
    public final void rule__Backroom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1213:1: ( rule__Backroom__Group__4__Impl )
            // InternalGrocery.g:1214:2: rule__Backroom__Group__4__Impl
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
    // InternalGrocery.g:1220:1: rule__Backroom__Group__4__Impl : ( '}' ) ;
    public final void rule__Backroom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1224:1: ( ( '}' ) )
            // InternalGrocery.g:1225:1: ( '}' )
            {
            // InternalGrocery.g:1225:1: ( '}' )
            // InternalGrocery.g:1226:2: '}'
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
    // InternalGrocery.g:1236:1: rule__NonPerishableItem__Group__0 : rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 ;
    public final void rule__NonPerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1240:1: ( rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 )
            // InternalGrocery.g:1241:2: rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1
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
    // InternalGrocery.g:1248:1: rule__NonPerishableItem__Group__0__Impl : ( 'nonPerishableItem' ) ;
    public final void rule__NonPerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1252:1: ( ( 'nonPerishableItem' ) )
            // InternalGrocery.g:1253:1: ( 'nonPerishableItem' )
            {
            // InternalGrocery.g:1253:1: ( 'nonPerishableItem' )
            // InternalGrocery.g:1254:2: 'nonPerishableItem'
            {
             before(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGrocery.g:1263:1: rule__NonPerishableItem__Group__1 : rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 ;
    public final void rule__NonPerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1267:1: ( rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 )
            // InternalGrocery.g:1268:2: rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2
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
    // InternalGrocery.g:1275:1: rule__NonPerishableItem__Group__1__Impl : ( ( rule__NonPerishableItem__NameAssignment_1 ) ) ;
    public final void rule__NonPerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1279:1: ( ( ( rule__NonPerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1280:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1280:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1281:2: ( rule__NonPerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1282:2: ( rule__NonPerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1282:3: rule__NonPerishableItem__NameAssignment_1
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
    // InternalGrocery.g:1290:1: rule__NonPerishableItem__Group__2 : rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 ;
    public final void rule__NonPerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1294:1: ( rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 )
            // InternalGrocery.g:1295:2: rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1302:1: rule__NonPerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__NonPerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1306:1: ( ( '{' ) )
            // InternalGrocery.g:1307:1: ( '{' )
            {
            // InternalGrocery.g:1307:1: ( '{' )
            // InternalGrocery.g:1308:2: '{'
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
    // InternalGrocery.g:1317:1: rule__NonPerishableItem__Group__3 : rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 ;
    public final void rule__NonPerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1321:1: ( rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 )
            // InternalGrocery.g:1322:2: rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1329:1: rule__NonPerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__NonPerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1333:1: ( ( 'price' ) )
            // InternalGrocery.g:1334:1: ( 'price' )
            {
            // InternalGrocery.g:1334:1: ( 'price' )
            // InternalGrocery.g:1335:2: 'price'
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGrocery.g:1344:1: rule__NonPerishableItem__Group__4 : rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 ;
    public final void rule__NonPerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1348:1: ( rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 )
            // InternalGrocery.g:1349:2: rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:1356:1: rule__NonPerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__NonPerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1360:1: ( ( ':' ) )
            // InternalGrocery.g:1361:1: ( ':' )
            {
            // InternalGrocery.g:1361:1: ( ':' )
            // InternalGrocery.g:1362:2: ':'
            {
             before(grammarAccess.getNonPerishableItemAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:1371:1: rule__NonPerishableItem__Group__5 : rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 ;
    public final void rule__NonPerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1375:1: ( rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 )
            // InternalGrocery.g:1376:2: rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:1383:1: rule__NonPerishableItem__Group__5__Impl : ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__NonPerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1387:1: ( ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:1388:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:1388:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:1389:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:1390:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:1390:3: rule__NonPerishableItem__PriceAssignment_5
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
    // InternalGrocery.g:1398:1: rule__NonPerishableItem__Group__6 : rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7 ;
    public final void rule__NonPerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1402:1: ( rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7 )
            // InternalGrocery.g:1403:2: rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__NonPerishableItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__7();

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
    // InternalGrocery.g:1410:1: rule__NonPerishableItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__NonPerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1414:1: ( ( 'quantity' ) )
            // InternalGrocery.g:1415:1: ( 'quantity' )
            {
            // InternalGrocery.g:1415:1: ( 'quantity' )
            // InternalGrocery.g:1416:2: 'quantity'
            {
             before(grammarAccess.getNonPerishableItemAccess().getQuantityKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getQuantityKeyword_6()); 

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


    // $ANTLR start "rule__NonPerishableItem__Group__7"
    // InternalGrocery.g:1425:1: rule__NonPerishableItem__Group__7 : rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8 ;
    public final void rule__NonPerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1429:1: ( rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8 )
            // InternalGrocery.g:1430:2: rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__NonPerishableItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__8();

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
    // $ANTLR end "rule__NonPerishableItem__Group__7"


    // $ANTLR start "rule__NonPerishableItem__Group__7__Impl"
    // InternalGrocery.g:1437:1: rule__NonPerishableItem__Group__7__Impl : ( ':' ) ;
    public final void rule__NonPerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1441:1: ( ( ':' ) )
            // InternalGrocery.g:1442:1: ( ':' )
            {
            // InternalGrocery.g:1442:1: ( ':' )
            // InternalGrocery.g:1443:2: ':'
            {
             before(grammarAccess.getNonPerishableItemAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__7__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__8"
    // InternalGrocery.g:1452:1: rule__NonPerishableItem__Group__8 : rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9 ;
    public final void rule__NonPerishableItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1456:1: ( rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9 )
            // InternalGrocery.g:1457:2: rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__NonPerishableItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__9();

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
    // $ANTLR end "rule__NonPerishableItem__Group__8"


    // $ANTLR start "rule__NonPerishableItem__Group__8__Impl"
    // InternalGrocery.g:1464:1: rule__NonPerishableItem__Group__8__Impl : ( ( rule__NonPerishableItem__QuantityAssignment_8 ) ) ;
    public final void rule__NonPerishableItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1468:1: ( ( ( rule__NonPerishableItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:1469:1: ( ( rule__NonPerishableItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:1469:1: ( ( rule__NonPerishableItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:1470:2: ( rule__NonPerishableItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:1471:2: ( rule__NonPerishableItem__QuantityAssignment_8 )
            // InternalGrocery.g:1471:3: rule__NonPerishableItem__QuantityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__QuantityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getQuantityAssignment_8()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__8__Impl"


    // $ANTLR start "rule__NonPerishableItem__Group__9"
    // InternalGrocery.g:1479:1: rule__NonPerishableItem__Group__9 : rule__NonPerishableItem__Group__9__Impl ;
    public final void rule__NonPerishableItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1483:1: ( rule__NonPerishableItem__Group__9__Impl )
            // InternalGrocery.g:1484:2: rule__NonPerishableItem__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__9__Impl();

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
    // $ANTLR end "rule__NonPerishableItem__Group__9"


    // $ANTLR start "rule__NonPerishableItem__Group__9__Impl"
    // InternalGrocery.g:1490:1: rule__NonPerishableItem__Group__9__Impl : ( '}' ) ;
    public final void rule__NonPerishableItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1494:1: ( ( '}' ) )
            // InternalGrocery.g:1495:1: ( '}' )
            {
            // InternalGrocery.g:1495:1: ( '}' )
            // InternalGrocery.g:1496:2: '}'
            {
             before(grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__NonPerishableItem__Group__9__Impl"


    // $ANTLR start "rule__PerishableItem__Group__0"
    // InternalGrocery.g:1506:1: rule__PerishableItem__Group__0 : rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 ;
    public final void rule__PerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1510:1: ( rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 )
            // InternalGrocery.g:1511:2: rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1
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
    // InternalGrocery.g:1518:1: rule__PerishableItem__Group__0__Impl : ( 'perishableItem' ) ;
    public final void rule__PerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1522:1: ( ( 'perishableItem' ) )
            // InternalGrocery.g:1523:1: ( 'perishableItem' )
            {
            // InternalGrocery.g:1523:1: ( 'perishableItem' )
            // InternalGrocery.g:1524:2: 'perishableItem'
            {
             before(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGrocery.g:1533:1: rule__PerishableItem__Group__1 : rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 ;
    public final void rule__PerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1537:1: ( rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 )
            // InternalGrocery.g:1538:2: rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2
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
    // InternalGrocery.g:1545:1: rule__PerishableItem__Group__1__Impl : ( ( rule__PerishableItem__NameAssignment_1 ) ) ;
    public final void rule__PerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1549:1: ( ( ( rule__PerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1550:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1550:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1551:2: ( rule__PerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1552:2: ( rule__PerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1552:3: rule__PerishableItem__NameAssignment_1
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
    // InternalGrocery.g:1560:1: rule__PerishableItem__Group__2 : rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 ;
    public final void rule__PerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1564:1: ( rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 )
            // InternalGrocery.g:1565:2: rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1572:1: rule__PerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__PerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1576:1: ( ( '{' ) )
            // InternalGrocery.g:1577:1: ( '{' )
            {
            // InternalGrocery.g:1577:1: ( '{' )
            // InternalGrocery.g:1578:2: '{'
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
    // InternalGrocery.g:1587:1: rule__PerishableItem__Group__3 : rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 ;
    public final void rule__PerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1591:1: ( rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 )
            // InternalGrocery.g:1592:2: rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1599:1: rule__PerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__PerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1603:1: ( ( 'price' ) )
            // InternalGrocery.g:1604:1: ( 'price' )
            {
            // InternalGrocery.g:1604:1: ( 'price' )
            // InternalGrocery.g:1605:2: 'price'
            {
             before(grammarAccess.getPerishableItemAccess().getPriceKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGrocery.g:1614:1: rule__PerishableItem__Group__4 : rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 ;
    public final void rule__PerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1618:1: ( rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 )
            // InternalGrocery.g:1619:2: rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:1626:1: rule__PerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1630:1: ( ( ':' ) )
            // InternalGrocery.g:1631:1: ( ':' )
            {
            // InternalGrocery.g:1631:1: ( ':' )
            // InternalGrocery.g:1632:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:1641:1: rule__PerishableItem__Group__5 : rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 ;
    public final void rule__PerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1645:1: ( rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 )
            // InternalGrocery.g:1646:2: rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalGrocery.g:1653:1: rule__PerishableItem__Group__5__Impl : ( ( rule__PerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__PerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1657:1: ( ( ( rule__PerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:1658:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:1658:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:1659:2: ( rule__PerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:1660:2: ( rule__PerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:1660:3: rule__PerishableItem__PriceAssignment_5
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
    // InternalGrocery.g:1668:1: rule__PerishableItem__Group__6 : rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 ;
    public final void rule__PerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1672:1: ( rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 )
            // InternalGrocery.g:1673:2: rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalGrocery.g:1680:1: rule__PerishableItem__Group__6__Impl : ( ( rule__PerishableItem__ExperationDateAssignment_6 ) ) ;
    public final void rule__PerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1684:1: ( ( ( rule__PerishableItem__ExperationDateAssignment_6 ) ) )
            // InternalGrocery.g:1685:1: ( ( rule__PerishableItem__ExperationDateAssignment_6 ) )
            {
            // InternalGrocery.g:1685:1: ( ( rule__PerishableItem__ExperationDateAssignment_6 ) )
            // InternalGrocery.g:1686:2: ( rule__PerishableItem__ExperationDateAssignment_6 )
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_6()); 
            // InternalGrocery.g:1687:2: ( rule__PerishableItem__ExperationDateAssignment_6 )
            // InternalGrocery.g:1687:3: rule__PerishableItem__ExperationDateAssignment_6
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
    // InternalGrocery.g:1695:1: rule__PerishableItem__Group__7 : rule__PerishableItem__Group__7__Impl ;
    public final void rule__PerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1699:1: ( rule__PerishableItem__Group__7__Impl )
            // InternalGrocery.g:1700:2: rule__PerishableItem__Group__7__Impl
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
    // InternalGrocery.g:1706:1: rule__PerishableItem__Group__7__Impl : ( '}' ) ;
    public final void rule__PerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1710:1: ( ( '}' ) )
            // InternalGrocery.g:1711:1: ( '}' )
            {
            // InternalGrocery.g:1711:1: ( '}' )
            // InternalGrocery.g:1712:2: '}'
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


    // $ANTLR start "rule__ExperationDate__Group__0"
    // InternalGrocery.g:1722:1: rule__ExperationDate__Group__0 : rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1 ;
    public final void rule__ExperationDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1726:1: ( rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1 )
            // InternalGrocery.g:1727:2: rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1
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
    // InternalGrocery.g:1734:1: rule__ExperationDate__Group__0__Impl : ( 'ExpirationDate' ) ;
    public final void rule__ExperationDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1738:1: ( ( 'ExpirationDate' ) )
            // InternalGrocery.g:1739:1: ( 'ExpirationDate' )
            {
            // InternalGrocery.g:1739:1: ( 'ExpirationDate' )
            // InternalGrocery.g:1740:2: 'ExpirationDate'
            {
             before(grammarAccess.getExperationDateAccess().getExpirationDateKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGrocery.g:1749:1: rule__ExperationDate__Group__1 : rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2 ;
    public final void rule__ExperationDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1753:1: ( rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2 )
            // InternalGrocery.g:1754:2: rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalGrocery.g:1761:1: rule__ExperationDate__Group__1__Impl : ( '{' ) ;
    public final void rule__ExperationDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1765:1: ( ( '{' ) )
            // InternalGrocery.g:1766:1: ( '{' )
            {
            // InternalGrocery.g:1766:1: ( '{' )
            // InternalGrocery.g:1767:2: '{'
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
    // InternalGrocery.g:1776:1: rule__ExperationDate__Group__2 : rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3 ;
    public final void rule__ExperationDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1780:1: ( rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3 )
            // InternalGrocery.g:1781:2: rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1788:1: rule__ExperationDate__Group__2__Impl : ( 'date' ) ;
    public final void rule__ExperationDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1792:1: ( ( 'date' ) )
            // InternalGrocery.g:1793:1: ( 'date' )
            {
            // InternalGrocery.g:1793:1: ( 'date' )
            // InternalGrocery.g:1794:2: 'date'
            {
             before(grammarAccess.getExperationDateAccess().getDateKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getDateKeyword_2()); 

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
    // InternalGrocery.g:1803:1: rule__ExperationDate__Group__3 : rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4 ;
    public final void rule__ExperationDate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1807:1: ( rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4 )
            // InternalGrocery.g:1808:2: rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:1815:1: rule__ExperationDate__Group__3__Impl : ( ':' ) ;
    public final void rule__ExperationDate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1819:1: ( ( ':' ) )
            // InternalGrocery.g:1820:1: ( ':' )
            {
            // InternalGrocery.g:1820:1: ( ':' )
            // InternalGrocery.g:1821:2: ':'
            {
             before(grammarAccess.getExperationDateAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:1830:1: rule__ExperationDate__Group__4 : rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5 ;
    public final void rule__ExperationDate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1834:1: ( rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5 )
            // InternalGrocery.g:1835:2: rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalGrocery.g:1842:1: rule__ExperationDate__Group__4__Impl : ( ( rule__ExperationDate__DateAssignment_4 ) ) ;
    public final void rule__ExperationDate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1846:1: ( ( ( rule__ExperationDate__DateAssignment_4 ) ) )
            // InternalGrocery.g:1847:1: ( ( rule__ExperationDate__DateAssignment_4 ) )
            {
            // InternalGrocery.g:1847:1: ( ( rule__ExperationDate__DateAssignment_4 ) )
            // InternalGrocery.g:1848:2: ( rule__ExperationDate__DateAssignment_4 )
            {
             before(grammarAccess.getExperationDateAccess().getDateAssignment_4()); 
            // InternalGrocery.g:1849:2: ( rule__ExperationDate__DateAssignment_4 )
            // InternalGrocery.g:1849:3: rule__ExperationDate__DateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__DateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getDateAssignment_4()); 

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
    // InternalGrocery.g:1857:1: rule__ExperationDate__Group__5 : rule__ExperationDate__Group__5__Impl ;
    public final void rule__ExperationDate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1861:1: ( rule__ExperationDate__Group__5__Impl )
            // InternalGrocery.g:1862:2: rule__ExperationDate__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__Group__5__Impl();

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
    // InternalGrocery.g:1868:1: rule__ExperationDate__Group__5__Impl : ( '}' ) ;
    public final void rule__ExperationDate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1872:1: ( ( '}' ) )
            // InternalGrocery.g:1873:1: ( '}' )
            {
            // InternalGrocery.g:1873:1: ( '}' )
            // InternalGrocery.g:1874:2: '}'
            {
             before(grammarAccess.getExperationDateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Driver__Group__0"
    // InternalGrocery.g:1884:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1888:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalGrocery.g:1889:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
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
    // InternalGrocery.g:1896:1: rule__Driver__Group__0__Impl : ( 'driver' ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1900:1: ( ( 'driver' ) )
            // InternalGrocery.g:1901:1: ( 'driver' )
            {
            // InternalGrocery.g:1901:1: ( 'driver' )
            // InternalGrocery.g:1902:2: 'driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGrocery.g:1911:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1915:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalGrocery.g:1916:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
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
    // InternalGrocery.g:1923:1: rule__Driver__Group__1__Impl : ( ( rule__Driver__NameAssignment_1 ) ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1927:1: ( ( ( rule__Driver__NameAssignment_1 ) ) )
            // InternalGrocery.g:1928:1: ( ( rule__Driver__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1928:1: ( ( rule__Driver__NameAssignment_1 ) )
            // InternalGrocery.g:1929:2: ( rule__Driver__NameAssignment_1 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1930:2: ( rule__Driver__NameAssignment_1 )
            // InternalGrocery.g:1930:3: rule__Driver__NameAssignment_1
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
    // InternalGrocery.g:1938:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1942:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalGrocery.g:1943:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:1950:1: rule__Driver__Group__2__Impl : ( '{' ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1954:1: ( ( '{' ) )
            // InternalGrocery.g:1955:1: ( '{' )
            {
            // InternalGrocery.g:1955:1: ( '{' )
            // InternalGrocery.g:1956:2: '{'
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
    // InternalGrocery.g:1965:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1969:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalGrocery.g:1970:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1977:1: rule__Driver__Group__3__Impl : ( 'name' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1981:1: ( ( 'name' ) )
            // InternalGrocery.g:1982:1: ( 'name' )
            {
            // InternalGrocery.g:1982:1: ( 'name' )
            // InternalGrocery.g:1983:2: 'name'
            {
             before(grammarAccess.getDriverAccess().getNameKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGrocery.g:1992:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1996:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalGrocery.g:1997:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalGrocery.g:2004:1: rule__Driver__Group__4__Impl : ( ':' ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2008:1: ( ( ':' ) )
            // InternalGrocery.g:2009:1: ( ':' )
            {
            // InternalGrocery.g:2009:1: ( ':' )
            // InternalGrocery.g:2010:2: ':'
            {
             before(grammarAccess.getDriverAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2019:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2023:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalGrocery.g:2024:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalGrocery.g:2031:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__DriverNameAssignment_5 ) ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2035:1: ( ( ( rule__Driver__DriverNameAssignment_5 ) ) )
            // InternalGrocery.g:2036:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            {
            // InternalGrocery.g:2036:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            // InternalGrocery.g:2037:2: ( rule__Driver__DriverNameAssignment_5 )
            {
             before(grammarAccess.getDriverAccess().getDriverNameAssignment_5()); 
            // InternalGrocery.g:2038:2: ( rule__Driver__DriverNameAssignment_5 )
            // InternalGrocery.g:2038:3: rule__Driver__DriverNameAssignment_5
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
    // InternalGrocery.g:2046:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2050:1: ( rule__Driver__Group__6__Impl )
            // InternalGrocery.g:2051:2: rule__Driver__Group__6__Impl
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
    // InternalGrocery.g:2057:1: rule__Driver__Group__6__Impl : ( '}' ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2061:1: ( ( '}' ) )
            // InternalGrocery.g:2062:1: ( '}' )
            {
            // InternalGrocery.g:2062:1: ( '}' )
            // InternalGrocery.g:2063:2: '}'
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
    // InternalGrocery.g:2073:1: rule__Vehicle__Group__0 : rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 ;
    public final void rule__Vehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2077:1: ( rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 )
            // InternalGrocery.g:2078:2: rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1
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
    // InternalGrocery.g:2085:1: rule__Vehicle__Group__0__Impl : ( 'vehicle' ) ;
    public final void rule__Vehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2089:1: ( ( 'vehicle' ) )
            // InternalGrocery.g:2090:1: ( 'vehicle' )
            {
            // InternalGrocery.g:2090:1: ( 'vehicle' )
            // InternalGrocery.g:2091:2: 'vehicle'
            {
             before(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGrocery.g:2100:1: rule__Vehicle__Group__1 : rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 ;
    public final void rule__Vehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2104:1: ( rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 )
            // InternalGrocery.g:2105:2: rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2
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
    // InternalGrocery.g:2112:1: rule__Vehicle__Group__1__Impl : ( ( rule__Vehicle__NameAssignment_1 ) ) ;
    public final void rule__Vehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2116:1: ( ( ( rule__Vehicle__NameAssignment_1 ) ) )
            // InternalGrocery.g:2117:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2117:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            // InternalGrocery.g:2118:2: ( rule__Vehicle__NameAssignment_1 )
            {
             before(grammarAccess.getVehicleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2119:2: ( rule__Vehicle__NameAssignment_1 )
            // InternalGrocery.g:2119:3: rule__Vehicle__NameAssignment_1
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
    // InternalGrocery.g:2127:1: rule__Vehicle__Group__2 : rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 ;
    public final void rule__Vehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2131:1: ( rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 )
            // InternalGrocery.g:2132:2: rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalGrocery.g:2139:1: rule__Vehicle__Group__2__Impl : ( '{' ) ;
    public final void rule__Vehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2143:1: ( ( '{' ) )
            // InternalGrocery.g:2144:1: ( '{' )
            {
            // InternalGrocery.g:2144:1: ( '{' )
            // InternalGrocery.g:2145:2: '{'
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
    // InternalGrocery.g:2154:1: rule__Vehicle__Group__3 : rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 ;
    public final void rule__Vehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2158:1: ( rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 )
            // InternalGrocery.g:2159:2: rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:2166:1: rule__Vehicle__Group__3__Impl : ( 'plateNumber' ) ;
    public final void rule__Vehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2170:1: ( ( 'plateNumber' ) )
            // InternalGrocery.g:2171:1: ( 'plateNumber' )
            {
            // InternalGrocery.g:2171:1: ( 'plateNumber' )
            // InternalGrocery.g:2172:2: 'plateNumber'
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGrocery.g:2181:1: rule__Vehicle__Group__4 : rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 ;
    public final void rule__Vehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2185:1: ( rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 )
            // InternalGrocery.g:2186:2: rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalGrocery.g:2193:1: rule__Vehicle__Group__4__Impl : ( ':' ) ;
    public final void rule__Vehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2197:1: ( ( ':' ) )
            // InternalGrocery.g:2198:1: ( ':' )
            {
            // InternalGrocery.g:2198:1: ( ':' )
            // InternalGrocery.g:2199:2: ':'
            {
             before(grammarAccess.getVehicleAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:2208:1: rule__Vehicle__Group__5 : rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 ;
    public final void rule__Vehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2212:1: ( rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 )
            // InternalGrocery.g:2213:2: rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalGrocery.g:2220:1: rule__Vehicle__Group__5__Impl : ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) ;
    public final void rule__Vehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2224:1: ( ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) )
            // InternalGrocery.g:2225:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            {
            // InternalGrocery.g:2225:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            // InternalGrocery.g:2226:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberAssignment_5()); 
            // InternalGrocery.g:2227:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            // InternalGrocery.g:2227:3: rule__Vehicle__PlateNumberAssignment_5
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
    // InternalGrocery.g:2235:1: rule__Vehicle__Group__6 : rule__Vehicle__Group__6__Impl ;
    public final void rule__Vehicle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2239:1: ( rule__Vehicle__Group__6__Impl )
            // InternalGrocery.g:2240:2: rule__Vehicle__Group__6__Impl
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
    // InternalGrocery.g:2246:1: rule__Vehicle__Group__6__Impl : ( '}' ) ;
    public final void rule__Vehicle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2250:1: ( ( '}' ) )
            // InternalGrocery.g:2251:1: ( '}' )
            {
            // InternalGrocery.g:2251:1: ( '}' )
            // InternalGrocery.g:2252:2: '}'
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


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalGrocery.g:2262:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2266:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalGrocery.g:2267:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__1();

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
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // InternalGrocery.g:2274:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2278:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2279:1: ( RULE_INT )
            {
            // InternalGrocery.g:2279:1: ( RULE_INT )
            // InternalGrocery.g:2280:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // InternalGrocery.g:2289:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2293:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalGrocery.g:2294:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2();

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
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // InternalGrocery.g:2301:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2305:1: ( ( '.' ) )
            // InternalGrocery.g:2306:1: ( '.' )
            {
            // InternalGrocery.g:2306:1: ( '.' )
            // InternalGrocery.g:2307:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group__2"
    // InternalGrocery.g:2316:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2320:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalGrocery.g:2321:2: rule__DECIMAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DECIMAL__Group__2__Impl();

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
    // $ANTLR end "rule__DECIMAL__Group__2"


    // $ANTLR start "rule__DECIMAL__Group__2__Impl"
    // InternalGrocery.g:2327:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2331:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2332:1: ( RULE_INT )
            {
            // InternalGrocery.g:2332:1: ( RULE_INT )
            // InternalGrocery.g:2333:2: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DECIMAL__Group__2__Impl"


    // $ANTLR start "rule__DATE__Group__0"
    // InternalGrocery.g:2343:1: rule__DATE__Group__0 : rule__DATE__Group__0__Impl rule__DATE__Group__1 ;
    public final void rule__DATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2347:1: ( rule__DATE__Group__0__Impl rule__DATE__Group__1 )
            // InternalGrocery.g:2348:2: rule__DATE__Group__0__Impl rule__DATE__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DATE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__1();

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
    // $ANTLR end "rule__DATE__Group__0"


    // $ANTLR start "rule__DATE__Group__0__Impl"
    // InternalGrocery.g:2355:1: rule__DATE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2359:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2360:1: ( RULE_INT )
            {
            // InternalGrocery.g:2360:1: ( RULE_INT )
            // InternalGrocery.g:2361:2: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DATE__Group__0__Impl"


    // $ANTLR start "rule__DATE__Group__1"
    // InternalGrocery.g:2370:1: rule__DATE__Group__1 : rule__DATE__Group__1__Impl rule__DATE__Group__2 ;
    public final void rule__DATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2374:1: ( rule__DATE__Group__1__Impl rule__DATE__Group__2 )
            // InternalGrocery.g:2375:2: rule__DATE__Group__1__Impl rule__DATE__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__DATE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__2();

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
    // $ANTLR end "rule__DATE__Group__1"


    // $ANTLR start "rule__DATE__Group__1__Impl"
    // InternalGrocery.g:2382:1: rule__DATE__Group__1__Impl : ( '/' ) ;
    public final void rule__DATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2386:1: ( ( '/' ) )
            // InternalGrocery.g:2387:1: ( '/' )
            {
            // InternalGrocery.g:2387:1: ( '/' )
            // InternalGrocery.g:2388:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getSolidusKeyword_1()); 

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
    // $ANTLR end "rule__DATE__Group__1__Impl"


    // $ANTLR start "rule__DATE__Group__2"
    // InternalGrocery.g:2397:1: rule__DATE__Group__2 : rule__DATE__Group__2__Impl rule__DATE__Group__3 ;
    public final void rule__DATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2401:1: ( rule__DATE__Group__2__Impl rule__DATE__Group__3 )
            // InternalGrocery.g:2402:2: rule__DATE__Group__2__Impl rule__DATE__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__DATE__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__3();

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
    // $ANTLR end "rule__DATE__Group__2"


    // $ANTLR start "rule__DATE__Group__2__Impl"
    // InternalGrocery.g:2409:1: rule__DATE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2413:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2414:1: ( RULE_INT )
            {
            // InternalGrocery.g:2414:1: ( RULE_INT )
            // InternalGrocery.g:2415:2: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__DATE__Group__2__Impl"


    // $ANTLR start "rule__DATE__Group__3"
    // InternalGrocery.g:2424:1: rule__DATE__Group__3 : rule__DATE__Group__3__Impl rule__DATE__Group__4 ;
    public final void rule__DATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2428:1: ( rule__DATE__Group__3__Impl rule__DATE__Group__4 )
            // InternalGrocery.g:2429:2: rule__DATE__Group__3__Impl rule__DATE__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DATE__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DATE__Group__4();

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
    // $ANTLR end "rule__DATE__Group__3"


    // $ANTLR start "rule__DATE__Group__3__Impl"
    // InternalGrocery.g:2436:1: rule__DATE__Group__3__Impl : ( '/' ) ;
    public final void rule__DATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2440:1: ( ( '/' ) )
            // InternalGrocery.g:2441:1: ( '/' )
            {
            // InternalGrocery.g:2441:1: ( '/' )
            // InternalGrocery.g:2442:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getSolidusKeyword_3()); 

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
    // $ANTLR end "rule__DATE__Group__3__Impl"


    // $ANTLR start "rule__DATE__Group__4"
    // InternalGrocery.g:2451:1: rule__DATE__Group__4 : rule__DATE__Group__4__Impl ;
    public final void rule__DATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2455:1: ( rule__DATE__Group__4__Impl )
            // InternalGrocery.g:2456:2: rule__DATE__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DATE__Group__4__Impl();

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
    // $ANTLR end "rule__DATE__Group__4"


    // $ANTLR start "rule__DATE__Group__4__Impl"
    // InternalGrocery.g:2462:1: rule__DATE__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2466:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2467:1: ( RULE_INT )
            {
            // InternalGrocery.g:2467:1: ( RULE_INT )
            // InternalGrocery.g:2468:2: RULE_INT
            {
             before(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDATEAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__DATE__Group__4__Impl"


    // $ANTLR start "rule__ADDRESS__Group__0"
    // InternalGrocery.g:2478:1: rule__ADDRESS__Group__0 : rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 ;
    public final void rule__ADDRESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2482:1: ( rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 )
            // InternalGrocery.g:2483:2: rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ADDRESS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__1();

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
    // $ANTLR end "rule__ADDRESS__Group__0"


    // $ANTLR start "rule__ADDRESS__Group__0__Impl"
    // InternalGrocery.g:2490:1: rule__ADDRESS__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2494:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2495:1: ( RULE_STRING )
            {
            // InternalGrocery.g:2495:1: ( RULE_STRING )
            // InternalGrocery.g:2496:2: RULE_STRING
            {
             before(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ADDRESS__Group__0__Impl"


    // $ANTLR start "rule__ADDRESS__Group__1"
    // InternalGrocery.g:2505:1: rule__ADDRESS__Group__1 : rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 ;
    public final void rule__ADDRESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2509:1: ( rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 )
            // InternalGrocery.g:2510:2: rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ADDRESS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__2();

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
    // $ANTLR end "rule__ADDRESS__Group__1"


    // $ANTLR start "rule__ADDRESS__Group__1__Impl"
    // InternalGrocery.g:2517:1: rule__ADDRESS__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ADDRESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2521:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2522:1: ( RULE_INT )
            {
            // InternalGrocery.g:2522:1: ( RULE_INT )
            // InternalGrocery.g:2523:2: RULE_INT
            {
             before(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ADDRESS__Group__1__Impl"


    // $ANTLR start "rule__ADDRESS__Group__2"
    // InternalGrocery.g:2532:1: rule__ADDRESS__Group__2 : rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 ;
    public final void rule__ADDRESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2536:1: ( rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 )
            // InternalGrocery.g:2537:2: rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ADDRESS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__3();

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
    // $ANTLR end "rule__ADDRESS__Group__2"


    // $ANTLR start "rule__ADDRESS__Group__2__Impl"
    // InternalGrocery.g:2544:1: rule__ADDRESS__Group__2__Impl : ( ',' ) ;
    public final void rule__ADDRESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2548:1: ( ( ',' ) )
            // InternalGrocery.g:2549:1: ( ',' )
            {
            // InternalGrocery.g:2549:1: ( ',' )
            // InternalGrocery.g:2550:2: ','
            {
             before(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__ADDRESS__Group__2__Impl"


    // $ANTLR start "rule__ADDRESS__Group__3"
    // InternalGrocery.g:2559:1: rule__ADDRESS__Group__3 : rule__ADDRESS__Group__3__Impl ;
    public final void rule__ADDRESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2563:1: ( rule__ADDRESS__Group__3__Impl )
            // InternalGrocery.g:2564:2: rule__ADDRESS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ADDRESS__Group__3__Impl();

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
    // $ANTLR end "rule__ADDRESS__Group__3"


    // $ANTLR start "rule__ADDRESS__Group__3__Impl"
    // InternalGrocery.g:2570:1: rule__ADDRESS__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2574:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2575:1: ( RULE_STRING )
            {
            // InternalGrocery.g:2575:1: ( RULE_STRING )
            // InternalGrocery.g:2576:2: RULE_STRING
            {
             before(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__ADDRESS__Group__3__Impl"


    // $ANTLR start "rule__Grocery__ElementsAssignment_0"
    // InternalGrocery.g:2586:1: rule__Grocery__ElementsAssignment_0 : ( ruleBuilding ) ;
    public final void rule__Grocery__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2590:1: ( ( ruleBuilding ) )
            // InternalGrocery.g:2591:2: ( ruleBuilding )
            {
            // InternalGrocery.g:2591:2: ( ruleBuilding )
            // InternalGrocery.g:2592:3: ruleBuilding
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
    // InternalGrocery.g:2601:1: rule__Grocery__ElementsAssignment_1 : ( ruleDeliveryElement ) ;
    public final void rule__Grocery__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2605:1: ( ( ruleDeliveryElement ) )
            // InternalGrocery.g:2606:2: ( ruleDeliveryElement )
            {
            // InternalGrocery.g:2606:2: ( ruleDeliveryElement )
            // InternalGrocery.g:2607:3: ruleDeliveryElement
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
    // InternalGrocery.g:2616:1: rule__Store__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2620:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2621:2: ( RULE_ID )
            {
            // InternalGrocery.g:2621:2: ( RULE_ID )
            // InternalGrocery.g:2622:3: RULE_ID
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
    // InternalGrocery.g:2631:1: rule__Store__ElementsAssignment_3 : ( ruleStoreElements ) ;
    public final void rule__Store__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2635:1: ( ( ruleStoreElements ) )
            // InternalGrocery.g:2636:2: ( ruleStoreElements )
            {
            // InternalGrocery.g:2636:2: ( ruleStoreElements )
            // InternalGrocery.g:2637:3: ruleStoreElements
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
    // InternalGrocery.g:2646:1: rule__Warehouse__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Warehouse__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2650:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2651:2: ( RULE_ID )
            {
            // InternalGrocery.g:2651:2: ( RULE_ID )
            // InternalGrocery.g:2652:3: RULE_ID
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


    // $ANTLR start "rule__Warehouse__AddressAssignment_5"
    // InternalGrocery.g:2661:1: rule__Warehouse__AddressAssignment_5 : ( ruleADDRESS ) ;
    public final void rule__Warehouse__AddressAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2665:1: ( ( ruleADDRESS ) )
            // InternalGrocery.g:2666:2: ( ruleADDRESS )
            {
            // InternalGrocery.g:2666:2: ( ruleADDRESS )
            // InternalGrocery.g:2667:3: ruleADDRESS
            {
             before(grammarAccess.getWarehouseAccess().getAddressADDRESSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleADDRESS();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getAddressADDRESSParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Warehouse__AddressAssignment_5"


    // $ANTLR start "rule__Warehouse__ElementsAssignment_6"
    // InternalGrocery.g:2676:1: rule__Warehouse__ElementsAssignment_6 : ( ruleItem ) ;
    public final void rule__Warehouse__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2680:1: ( ( ruleItem ) )
            // InternalGrocery.g:2681:2: ( ruleItem )
            {
            // InternalGrocery.g:2681:2: ( ruleItem )
            // InternalGrocery.g:2682:3: ruleItem
            {
             before(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Warehouse__ElementsAssignment_6"


    // $ANTLR start "rule__Shelf__NameAssignment_1"
    // InternalGrocery.g:2691:1: rule__Shelf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Shelf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2695:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2696:2: ( RULE_ID )
            {
            // InternalGrocery.g:2696:2: ( RULE_ID )
            // InternalGrocery.g:2697:3: RULE_ID
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
    // InternalGrocery.g:2706:1: rule__Shelf__ElementsAssignment_3 : ( ruleItem ) ;
    public final void rule__Shelf__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2710:1: ( ( ruleItem ) )
            // InternalGrocery.g:2711:2: ( ruleItem )
            {
            // InternalGrocery.g:2711:2: ( ruleItem )
            // InternalGrocery.g:2712:3: ruleItem
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
    // InternalGrocery.g:2721:1: rule__Backroom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Backroom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2725:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2726:2: ( RULE_ID )
            {
            // InternalGrocery.g:2726:2: ( RULE_ID )
            // InternalGrocery.g:2727:3: RULE_ID
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
    // InternalGrocery.g:2736:1: rule__Backroom__ElementsAssignment_3 : ( ruleItem ) ;
    public final void rule__Backroom__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2740:1: ( ( ruleItem ) )
            // InternalGrocery.g:2741:2: ( ruleItem )
            {
            // InternalGrocery.g:2741:2: ( ruleItem )
            // InternalGrocery.g:2742:3: ruleItem
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
    // InternalGrocery.g:2751:1: rule__NonPerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonPerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2755:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2756:2: ( RULE_ID )
            {
            // InternalGrocery.g:2756:2: ( RULE_ID )
            // InternalGrocery.g:2757:3: RULE_ID
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
    // InternalGrocery.g:2766:1: rule__NonPerishableItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__NonPerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2770:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:2771:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:2771:2: ( ruleDECIMAL )
            // InternalGrocery.g:2772:3: ruleDECIMAL
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getNonPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 

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


    // $ANTLR start "rule__NonPerishableItem__QuantityAssignment_8"
    // InternalGrocery.g:2781:1: rule__NonPerishableItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__NonPerishableItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2785:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2786:2: ( RULE_INT )
            {
            // InternalGrocery.g:2786:2: ( RULE_INT )
            // InternalGrocery.g:2787:3: RULE_INT
            {
             before(grammarAccess.getNonPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__NonPerishableItem__QuantityAssignment_8"


    // $ANTLR start "rule__PerishableItem__NameAssignment_1"
    // InternalGrocery.g:2796:1: rule__PerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2800:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2801:2: ( RULE_ID )
            {
            // InternalGrocery.g:2801:2: ( RULE_ID )
            // InternalGrocery.g:2802:3: RULE_ID
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
    // InternalGrocery.g:2811:1: rule__PerishableItem__PriceAssignment_5 : ( RULE_INT ) ;
    public final void rule__PerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2815:1: ( ( RULE_INT ) )
            // InternalGrocery.g:2816:2: ( RULE_INT )
            {
            // InternalGrocery.g:2816:2: ( RULE_INT )
            // InternalGrocery.g:2817:3: RULE_INT
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
    // InternalGrocery.g:2826:1: rule__PerishableItem__ExperationDateAssignment_6 : ( ruleExperationDate ) ;
    public final void rule__PerishableItem__ExperationDateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2830:1: ( ( ruleExperationDate ) )
            // InternalGrocery.g:2831:2: ( ruleExperationDate )
            {
            // InternalGrocery.g:2831:2: ( ruleExperationDate )
            // InternalGrocery.g:2832:3: ruleExperationDate
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


    // $ANTLR start "rule__ExperationDate__DateAssignment_4"
    // InternalGrocery.g:2841:1: rule__ExperationDate__DateAssignment_4 : ( ruleDATE ) ;
    public final void rule__ExperationDate__DateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2845:1: ( ( ruleDATE ) )
            // InternalGrocery.g:2846:2: ( ruleDATE )
            {
            // InternalGrocery.g:2846:2: ( ruleDATE )
            // InternalGrocery.g:2847:3: ruleDATE
            {
             before(grammarAccess.getExperationDateAccess().getDateDATEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getExperationDateAccess().getDateDATEParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ExperationDate__DateAssignment_4"


    // $ANTLR start "rule__Driver__NameAssignment_1"
    // InternalGrocery.g:2856:1: rule__Driver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Driver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2860:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2861:2: ( RULE_ID )
            {
            // InternalGrocery.g:2861:2: ( RULE_ID )
            // InternalGrocery.g:2862:3: RULE_ID
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
    // InternalGrocery.g:2871:1: rule__Driver__DriverNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Driver__DriverNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2875:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2876:2: ( RULE_STRING )
            {
            // InternalGrocery.g:2876:2: ( RULE_STRING )
            // InternalGrocery.g:2877:3: RULE_STRING
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
    // InternalGrocery.g:2886:1: rule__Vehicle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2890:1: ( ( RULE_ID ) )
            // InternalGrocery.g:2891:2: ( RULE_ID )
            {
            // InternalGrocery.g:2891:2: ( RULE_ID )
            // InternalGrocery.g:2892:3: RULE_ID
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
    // InternalGrocery.g:2901:1: rule__Vehicle__PlateNumberAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Vehicle__PlateNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2905:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:2906:2: ( RULE_STRING )
            {
            // InternalGrocery.g:2906:2: ( RULE_STRING )
            // InternalGrocery.g:2907:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000482000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});

}
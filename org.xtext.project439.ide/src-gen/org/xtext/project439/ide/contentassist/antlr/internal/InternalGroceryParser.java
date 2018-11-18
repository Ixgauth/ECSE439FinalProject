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


    // $ANTLR start "entryRuleDeliveryElement"
    // InternalGrocery.g:103:1: entryRuleDeliveryElement : ruleDeliveryElement EOF ;
    public final void entryRuleDeliveryElement() throws RecognitionException {
        try {
            // InternalGrocery.g:104:1: ( ruleDeliveryElement EOF )
            // InternalGrocery.g:105:1: ruleDeliveryElement EOF
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
    // InternalGrocery.g:112:1: ruleDeliveryElement : ( ( rule__DeliveryElement__Alternatives ) ) ;
    public final void ruleDeliveryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:116:2: ( ( ( rule__DeliveryElement__Alternatives ) ) )
            // InternalGrocery.g:117:2: ( ( rule__DeliveryElement__Alternatives ) )
            {
            // InternalGrocery.g:117:2: ( ( rule__DeliveryElement__Alternatives ) )
            // InternalGrocery.g:118:3: ( rule__DeliveryElement__Alternatives )
            {
             before(grammarAccess.getDeliveryElementAccess().getAlternatives()); 
            // InternalGrocery.g:119:3: ( rule__DeliveryElement__Alternatives )
            // InternalGrocery.g:119:4: rule__DeliveryElement__Alternatives
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
    // InternalGrocery.g:128:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalGrocery.g:129:1: ( ruleStore EOF )
            // InternalGrocery.g:130:1: ruleStore EOF
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
    // InternalGrocery.g:137:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:141:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalGrocery.g:142:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalGrocery.g:142:2: ( ( rule__Store__Group__0 ) )
            // InternalGrocery.g:143:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalGrocery.g:144:3: ( rule__Store__Group__0 )
            // InternalGrocery.g:144:4: rule__Store__Group__0
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
    // InternalGrocery.g:153:1: entryRuleWarehouse : ruleWarehouse EOF ;
    public final void entryRuleWarehouse() throws RecognitionException {
        try {
            // InternalGrocery.g:154:1: ( ruleWarehouse EOF )
            // InternalGrocery.g:155:1: ruleWarehouse EOF
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
    // InternalGrocery.g:162:1: ruleWarehouse : ( ( rule__Warehouse__Group__0 ) ) ;
    public final void ruleWarehouse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:166:2: ( ( ( rule__Warehouse__Group__0 ) ) )
            // InternalGrocery.g:167:2: ( ( rule__Warehouse__Group__0 ) )
            {
            // InternalGrocery.g:167:2: ( ( rule__Warehouse__Group__0 ) )
            // InternalGrocery.g:168:3: ( rule__Warehouse__Group__0 )
            {
             before(grammarAccess.getWarehouseAccess().getGroup()); 
            // InternalGrocery.g:169:3: ( rule__Warehouse__Group__0 )
            // InternalGrocery.g:169:4: rule__Warehouse__Group__0
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
    // InternalGrocery.g:178:1: entryRuleShelf : ruleShelf EOF ;
    public final void entryRuleShelf() throws RecognitionException {
        try {
            // InternalGrocery.g:179:1: ( ruleShelf EOF )
            // InternalGrocery.g:180:1: ruleShelf EOF
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
    // InternalGrocery.g:187:1: ruleShelf : ( ( rule__Shelf__Group__0 ) ) ;
    public final void ruleShelf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:191:2: ( ( ( rule__Shelf__Group__0 ) ) )
            // InternalGrocery.g:192:2: ( ( rule__Shelf__Group__0 ) )
            {
            // InternalGrocery.g:192:2: ( ( rule__Shelf__Group__0 ) )
            // InternalGrocery.g:193:3: ( rule__Shelf__Group__0 )
            {
             before(grammarAccess.getShelfAccess().getGroup()); 
            // InternalGrocery.g:194:3: ( rule__Shelf__Group__0 )
            // InternalGrocery.g:194:4: rule__Shelf__Group__0
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
    // InternalGrocery.g:203:1: entryRuleBackroom : ruleBackroom EOF ;
    public final void entryRuleBackroom() throws RecognitionException {
        try {
            // InternalGrocery.g:204:1: ( ruleBackroom EOF )
            // InternalGrocery.g:205:1: ruleBackroom EOF
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
    // InternalGrocery.g:212:1: ruleBackroom : ( ( rule__Backroom__Group__0 ) ) ;
    public final void ruleBackroom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:216:2: ( ( ( rule__Backroom__Group__0 ) ) )
            // InternalGrocery.g:217:2: ( ( rule__Backroom__Group__0 ) )
            {
            // InternalGrocery.g:217:2: ( ( rule__Backroom__Group__0 ) )
            // InternalGrocery.g:218:3: ( rule__Backroom__Group__0 )
            {
             before(grammarAccess.getBackroomAccess().getGroup()); 
            // InternalGrocery.g:219:3: ( rule__Backroom__Group__0 )
            // InternalGrocery.g:219:4: rule__Backroom__Group__0
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
    // InternalGrocery.g:228:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalGrocery.g:229:1: ( ruleItem EOF )
            // InternalGrocery.g:230:1: ruleItem EOF
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
    // InternalGrocery.g:237:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:241:2: ( ( ( rule__Item__Alternatives ) ) )
            // InternalGrocery.g:242:2: ( ( rule__Item__Alternatives ) )
            {
            // InternalGrocery.g:242:2: ( ( rule__Item__Alternatives ) )
            // InternalGrocery.g:243:3: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // InternalGrocery.g:244:3: ( rule__Item__Alternatives )
            // InternalGrocery.g:244:4: rule__Item__Alternatives
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
    // InternalGrocery.g:253:1: entryRuleNonPerishableItem : ruleNonPerishableItem EOF ;
    public final void entryRuleNonPerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:254:1: ( ruleNonPerishableItem EOF )
            // InternalGrocery.g:255:1: ruleNonPerishableItem EOF
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
    // InternalGrocery.g:262:1: ruleNonPerishableItem : ( ( rule__NonPerishableItem__Group__0 ) ) ;
    public final void ruleNonPerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:266:2: ( ( ( rule__NonPerishableItem__Group__0 ) ) )
            // InternalGrocery.g:267:2: ( ( rule__NonPerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:267:2: ( ( rule__NonPerishableItem__Group__0 ) )
            // InternalGrocery.g:268:3: ( rule__NonPerishableItem__Group__0 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:269:3: ( rule__NonPerishableItem__Group__0 )
            // InternalGrocery.g:269:4: rule__NonPerishableItem__Group__0
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
    // InternalGrocery.g:278:1: entryRulePerishableItem : rulePerishableItem EOF ;
    public final void entryRulePerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:279:1: ( rulePerishableItem EOF )
            // InternalGrocery.g:280:1: rulePerishableItem EOF
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
    // InternalGrocery.g:287:1: rulePerishableItem : ( ( rule__PerishableItem__Group__0 ) ) ;
    public final void rulePerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:291:2: ( ( ( rule__PerishableItem__Group__0 ) ) )
            // InternalGrocery.g:292:2: ( ( rule__PerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:292:2: ( ( rule__PerishableItem__Group__0 ) )
            // InternalGrocery.g:293:3: ( rule__PerishableItem__Group__0 )
            {
             before(grammarAccess.getPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:294:3: ( rule__PerishableItem__Group__0 )
            // InternalGrocery.g:294:4: rule__PerishableItem__Group__0
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
    // InternalGrocery.g:303:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalGrocery.g:304:1: ( ruleAddress EOF )
            // InternalGrocery.g:305:1: ruleAddress EOF
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
    // InternalGrocery.g:312:1: ruleAddress : ( ( rule__Address__Group__0 ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:316:2: ( ( ( rule__Address__Group__0 ) ) )
            // InternalGrocery.g:317:2: ( ( rule__Address__Group__0 ) )
            {
            // InternalGrocery.g:317:2: ( ( rule__Address__Group__0 ) )
            // InternalGrocery.g:318:3: ( rule__Address__Group__0 )
            {
             before(grammarAccess.getAddressAccess().getGroup()); 
            // InternalGrocery.g:319:3: ( rule__Address__Group__0 )
            // InternalGrocery.g:319:4: rule__Address__Group__0
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


    // $ANTLR start "rule__Building__Alternatives"
    // InternalGrocery.g:402:1: rule__Building__Alternatives : ( ( ruleStore ) | ( ruleWarehouse ) );
    public final void rule__Building__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:406:1: ( ( ruleStore ) | ( ruleWarehouse ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGrocery.g:407:2: ( ruleStore )
                    {
                    // InternalGrocery.g:407:2: ( ruleStore )
                    // InternalGrocery.g:408:3: ruleStore
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
                    // InternalGrocery.g:413:2: ( ruleWarehouse )
                    {
                    // InternalGrocery.g:413:2: ( ruleWarehouse )
                    // InternalGrocery.g:414:3: ruleWarehouse
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


    // $ANTLR start "rule__DeliveryElement__Alternatives"
    // InternalGrocery.g:423:1: rule__DeliveryElement__Alternatives : ( ( ruleDriver ) | ( ruleVehicle ) );
    public final void rule__DeliveryElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:427:1: ( ( ruleDriver ) | ( ruleVehicle ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGrocery.g:428:2: ( ruleDriver )
                    {
                    // InternalGrocery.g:428:2: ( ruleDriver )
                    // InternalGrocery.g:429:3: ruleDriver
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
                    // InternalGrocery.g:434:2: ( ruleVehicle )
                    {
                    // InternalGrocery.g:434:2: ( ruleVehicle )
                    // InternalGrocery.g:435:3: ruleVehicle
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
    // InternalGrocery.g:444:1: rule__Item__Alternatives : ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:448:1: ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGrocery.g:449:2: ( rulePerishableItem )
                    {
                    // InternalGrocery.g:449:2: ( rulePerishableItem )
                    // InternalGrocery.g:450:3: rulePerishableItem
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
                    // InternalGrocery.g:455:2: ( ruleNonPerishableItem )
                    {
                    // InternalGrocery.g:455:2: ( ruleNonPerishableItem )
                    // InternalGrocery.g:456:3: ruleNonPerishableItem
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
    // InternalGrocery.g:465:1: rule__Grocery__Group__0 : rule__Grocery__Group__0__Impl rule__Grocery__Group__1 ;
    public final void rule__Grocery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:469:1: ( rule__Grocery__Group__0__Impl rule__Grocery__Group__1 )
            // InternalGrocery.g:470:2: rule__Grocery__Group__0__Impl rule__Grocery__Group__1
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
    // InternalGrocery.g:477:1: rule__Grocery__Group__0__Impl : ( ( rule__Grocery__ElementsAssignment_0 )* ) ;
    public final void rule__Grocery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:481:1: ( ( ( rule__Grocery__ElementsAssignment_0 )* ) )
            // InternalGrocery.g:482:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            {
            // InternalGrocery.g:482:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            // InternalGrocery.g:483:2: ( rule__Grocery__ElementsAssignment_0 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_0()); 
            // InternalGrocery.g:484:2: ( rule__Grocery__ElementsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGrocery.g:484:3: rule__Grocery__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Grocery__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalGrocery.g:492:1: rule__Grocery__Group__1 : rule__Grocery__Group__1__Impl ;
    public final void rule__Grocery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:496:1: ( rule__Grocery__Group__1__Impl )
            // InternalGrocery.g:497:2: rule__Grocery__Group__1__Impl
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
    // InternalGrocery.g:503:1: rule__Grocery__Group__1__Impl : ( ( rule__Grocery__ElementsAssignment_1 )* ) ;
    public final void rule__Grocery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:507:1: ( ( ( rule__Grocery__ElementsAssignment_1 )* ) )
            // InternalGrocery.g:508:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            {
            // InternalGrocery.g:508:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            // InternalGrocery.g:509:2: ( rule__Grocery__ElementsAssignment_1 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_1()); 
            // InternalGrocery.g:510:2: ( rule__Grocery__ElementsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=24 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGrocery.g:510:3: rule__Grocery__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Grocery__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalGrocery.g:519:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:523:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalGrocery.g:524:2: rule__Store__Group__0__Impl rule__Store__Group__1
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
    // InternalGrocery.g:531:1: rule__Store__Group__0__Impl : ( 'store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:535:1: ( ( 'store' ) )
            // InternalGrocery.g:536:1: ( 'store' )
            {
            // InternalGrocery.g:536:1: ( 'store' )
            // InternalGrocery.g:537:2: 'store'
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
    // InternalGrocery.g:546:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:550:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalGrocery.g:551:2: rule__Store__Group__1__Impl rule__Store__Group__2
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
    // InternalGrocery.g:558:1: rule__Store__Group__1__Impl : ( ( rule__Store__NameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:562:1: ( ( ( rule__Store__NameAssignment_1 ) ) )
            // InternalGrocery.g:563:1: ( ( rule__Store__NameAssignment_1 ) )
            {
            // InternalGrocery.g:563:1: ( ( rule__Store__NameAssignment_1 ) )
            // InternalGrocery.g:564:2: ( rule__Store__NameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getNameAssignment_1()); 
            // InternalGrocery.g:565:2: ( rule__Store__NameAssignment_1 )
            // InternalGrocery.g:565:3: rule__Store__NameAssignment_1
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
    // InternalGrocery.g:573:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:577:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalGrocery.g:578:2: rule__Store__Group__2__Impl rule__Store__Group__3
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
    // InternalGrocery.g:585:1: rule__Store__Group__2__Impl : ( '{' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:589:1: ( ( '{' ) )
            // InternalGrocery.g:590:1: ( '{' )
            {
            // InternalGrocery.g:590:1: ( '{' )
            // InternalGrocery.g:591:2: '{'
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
    // InternalGrocery.g:600:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:604:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalGrocery.g:605:2: rule__Store__Group__3__Impl rule__Store__Group__4
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
    // InternalGrocery.g:612:1: rule__Store__Group__3__Impl : ( ( rule__Store__ElementsAssignment_3 )* ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:616:1: ( ( ( rule__Store__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:617:1: ( ( rule__Store__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:617:1: ( ( rule__Store__ElementsAssignment_3 )* )
            // InternalGrocery.g:618:2: ( rule__Store__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStoreAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:619:2: ( rule__Store__ElementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGrocery.g:619:3: rule__Store__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Store__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalGrocery.g:627:1: rule__Store__Group__4 : rule__Store__Group__4__Impl rule__Store__Group__5 ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:631:1: ( rule__Store__Group__4__Impl rule__Store__Group__5 )
            // InternalGrocery.g:632:2: rule__Store__Group__4__Impl rule__Store__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Store__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__5();

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
    // InternalGrocery.g:639:1: rule__Store__Group__4__Impl : ( ( rule__Store__ElementsAssignment_4 ) ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:643:1: ( ( ( rule__Store__ElementsAssignment_4 ) ) )
            // InternalGrocery.g:644:1: ( ( rule__Store__ElementsAssignment_4 ) )
            {
            // InternalGrocery.g:644:1: ( ( rule__Store__ElementsAssignment_4 ) )
            // InternalGrocery.g:645:2: ( rule__Store__ElementsAssignment_4 )
            {
             before(grammarAccess.getStoreAccess().getElementsAssignment_4()); 
            // InternalGrocery.g:646:2: ( rule__Store__ElementsAssignment_4 )
            // InternalGrocery.g:646:3: rule__Store__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Store__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getElementsAssignment_4()); 

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


    // $ANTLR start "rule__Store__Group__5"
    // InternalGrocery.g:654:1: rule__Store__Group__5 : rule__Store__Group__5__Impl ;
    public final void rule__Store__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:658:1: ( rule__Store__Group__5__Impl )
            // InternalGrocery.g:659:2: rule__Store__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__5__Impl();

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
    // $ANTLR end "rule__Store__Group__5"


    // $ANTLR start "rule__Store__Group__5__Impl"
    // InternalGrocery.g:665:1: rule__Store__Group__5__Impl : ( '}' ) ;
    public final void rule__Store__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:669:1: ( ( '}' ) )
            // InternalGrocery.g:670:1: ( '}' )
            {
            // InternalGrocery.g:670:1: ( '}' )
            // InternalGrocery.g:671:2: '}'
            {
             before(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Store__Group__5__Impl"


    // $ANTLR start "rule__Warehouse__Group__0"
    // InternalGrocery.g:681:1: rule__Warehouse__Group__0 : rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 ;
    public final void rule__Warehouse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:685:1: ( rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 )
            // InternalGrocery.g:686:2: rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:693:1: rule__Warehouse__Group__0__Impl : ( ( rule__Warehouse__NameAssignment_0 ) ) ;
    public final void rule__Warehouse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:697:1: ( ( ( rule__Warehouse__NameAssignment_0 ) ) )
            // InternalGrocery.g:698:1: ( ( rule__Warehouse__NameAssignment_0 ) )
            {
            // InternalGrocery.g:698:1: ( ( rule__Warehouse__NameAssignment_0 ) )
            // InternalGrocery.g:699:2: ( rule__Warehouse__NameAssignment_0 )
            {
             before(grammarAccess.getWarehouseAccess().getNameAssignment_0()); 
            // InternalGrocery.g:700:2: ( rule__Warehouse__NameAssignment_0 )
            // InternalGrocery.g:700:3: rule__Warehouse__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getNameAssignment_0()); 

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
    // InternalGrocery.g:708:1: rule__Warehouse__Group__1 : rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 ;
    public final void rule__Warehouse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:712:1: ( rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 )
            // InternalGrocery.g:713:2: rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2
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
    // InternalGrocery.g:720:1: rule__Warehouse__Group__1__Impl : ( ( rule__Warehouse__AddressAssignment_1 ) ) ;
    public final void rule__Warehouse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:724:1: ( ( ( rule__Warehouse__AddressAssignment_1 ) ) )
            // InternalGrocery.g:725:1: ( ( rule__Warehouse__AddressAssignment_1 ) )
            {
            // InternalGrocery.g:725:1: ( ( rule__Warehouse__AddressAssignment_1 ) )
            // InternalGrocery.g:726:2: ( rule__Warehouse__AddressAssignment_1 )
            {
             before(grammarAccess.getWarehouseAccess().getAddressAssignment_1()); 
            // InternalGrocery.g:727:2: ( rule__Warehouse__AddressAssignment_1 )
            // InternalGrocery.g:727:3: rule__Warehouse__AddressAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__AddressAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWarehouseAccess().getAddressAssignment_1()); 

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
    // InternalGrocery.g:735:1: rule__Warehouse__Group__2 : rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 ;
    public final void rule__Warehouse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:739:1: ( rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 )
            // InternalGrocery.g:740:2: rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalGrocery.g:747:1: rule__Warehouse__Group__2__Impl : ( '{' ) ;
    public final void rule__Warehouse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:751:1: ( ( '{' ) )
            // InternalGrocery.g:752:1: ( '{' )
            {
            // InternalGrocery.g:752:1: ( '{' )
            // InternalGrocery.g:753:2: '{'
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
    // InternalGrocery.g:762:1: rule__Warehouse__Group__3 : rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 ;
    public final void rule__Warehouse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:766:1: ( rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 )
            // InternalGrocery.g:767:2: rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalGrocery.g:774:1: rule__Warehouse__Group__3__Impl : ( ( rule__Warehouse__ElementsAssignment_3 )* ) ;
    public final void rule__Warehouse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:778:1: ( ( ( rule__Warehouse__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:779:1: ( ( rule__Warehouse__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:779:1: ( ( rule__Warehouse__ElementsAssignment_3 )* )
            // InternalGrocery.g:780:2: ( rule__Warehouse__ElementsAssignment_3 )*
            {
             before(grammarAccess.getWarehouseAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:781:2: ( rule__Warehouse__ElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGrocery.g:781:3: rule__Warehouse__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Warehouse__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWarehouseAccess().getElementsAssignment_3()); 

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
    // InternalGrocery.g:789:1: rule__Warehouse__Group__4 : rule__Warehouse__Group__4__Impl ;
    public final void rule__Warehouse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:793:1: ( rule__Warehouse__Group__4__Impl )
            // InternalGrocery.g:794:2: rule__Warehouse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Warehouse__Group__4__Impl();

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
    // InternalGrocery.g:800:1: rule__Warehouse__Group__4__Impl : ( '}' ) ;
    public final void rule__Warehouse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:804:1: ( ( '}' ) )
            // InternalGrocery.g:805:1: ( '}' )
            {
            // InternalGrocery.g:805:1: ( '}' )
            // InternalGrocery.g:806:2: '}'
            {
             before(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Shelf__Group__0"
    // InternalGrocery.g:816:1: rule__Shelf__Group__0 : rule__Shelf__Group__0__Impl rule__Shelf__Group__1 ;
    public final void rule__Shelf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:820:1: ( rule__Shelf__Group__0__Impl rule__Shelf__Group__1 )
            // InternalGrocery.g:821:2: rule__Shelf__Group__0__Impl rule__Shelf__Group__1
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
    // InternalGrocery.g:828:1: rule__Shelf__Group__0__Impl : ( 'shelf' ) ;
    public final void rule__Shelf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:832:1: ( ( 'shelf' ) )
            // InternalGrocery.g:833:1: ( 'shelf' )
            {
            // InternalGrocery.g:833:1: ( 'shelf' )
            // InternalGrocery.g:834:2: 'shelf'
            {
             before(grammarAccess.getShelfAccess().getShelfKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGrocery.g:843:1: rule__Shelf__Group__1 : rule__Shelf__Group__1__Impl rule__Shelf__Group__2 ;
    public final void rule__Shelf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:847:1: ( rule__Shelf__Group__1__Impl rule__Shelf__Group__2 )
            // InternalGrocery.g:848:2: rule__Shelf__Group__1__Impl rule__Shelf__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalGrocery.g:855:1: rule__Shelf__Group__1__Impl : ( ( rule__Shelf__NameAssignment_1 ) ) ;
    public final void rule__Shelf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:859:1: ( ( ( rule__Shelf__NameAssignment_1 ) ) )
            // InternalGrocery.g:860:1: ( ( rule__Shelf__NameAssignment_1 ) )
            {
            // InternalGrocery.g:860:1: ( ( rule__Shelf__NameAssignment_1 ) )
            // InternalGrocery.g:861:2: ( rule__Shelf__NameAssignment_1 )
            {
             before(grammarAccess.getShelfAccess().getNameAssignment_1()); 
            // InternalGrocery.g:862:2: ( rule__Shelf__NameAssignment_1 )
            // InternalGrocery.g:862:3: rule__Shelf__NameAssignment_1
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
    // InternalGrocery.g:870:1: rule__Shelf__Group__2 : rule__Shelf__Group__2__Impl ;
    public final void rule__Shelf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:874:1: ( rule__Shelf__Group__2__Impl )
            // InternalGrocery.g:875:2: rule__Shelf__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shelf__Group__2__Impl();

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
    // InternalGrocery.g:881:1: rule__Shelf__Group__2__Impl : ( ( rule__Shelf__ElementsAssignment_2 )* ) ;
    public final void rule__Shelf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:885:1: ( ( ( rule__Shelf__ElementsAssignment_2 )* ) )
            // InternalGrocery.g:886:1: ( ( rule__Shelf__ElementsAssignment_2 )* )
            {
            // InternalGrocery.g:886:1: ( ( rule__Shelf__ElementsAssignment_2 )* )
            // InternalGrocery.g:887:2: ( rule__Shelf__ElementsAssignment_2 )*
            {
             before(grammarAccess.getShelfAccess().getElementsAssignment_2()); 
            // InternalGrocery.g:888:2: ( rule__Shelf__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrocery.g:888:3: rule__Shelf__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Shelf__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getShelfAccess().getElementsAssignment_2()); 

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


    // $ANTLR start "rule__Backroom__Group__0"
    // InternalGrocery.g:897:1: rule__Backroom__Group__0 : rule__Backroom__Group__0__Impl rule__Backroom__Group__1 ;
    public final void rule__Backroom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:901:1: ( rule__Backroom__Group__0__Impl rule__Backroom__Group__1 )
            // InternalGrocery.g:902:2: rule__Backroom__Group__0__Impl rule__Backroom__Group__1
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
    // InternalGrocery.g:909:1: rule__Backroom__Group__0__Impl : ( 'backroom' ) ;
    public final void rule__Backroom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:913:1: ( ( 'backroom' ) )
            // InternalGrocery.g:914:1: ( 'backroom' )
            {
            // InternalGrocery.g:914:1: ( 'backroom' )
            // InternalGrocery.g:915:2: 'backroom'
            {
             before(grammarAccess.getBackroomAccess().getBackroomKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGrocery.g:924:1: rule__Backroom__Group__1 : rule__Backroom__Group__1__Impl rule__Backroom__Group__2 ;
    public final void rule__Backroom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:928:1: ( rule__Backroom__Group__1__Impl rule__Backroom__Group__2 )
            // InternalGrocery.g:929:2: rule__Backroom__Group__1__Impl rule__Backroom__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalGrocery.g:936:1: rule__Backroom__Group__1__Impl : ( ( rule__Backroom__NameAssignment_1 ) ) ;
    public final void rule__Backroom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:940:1: ( ( ( rule__Backroom__NameAssignment_1 ) ) )
            // InternalGrocery.g:941:1: ( ( rule__Backroom__NameAssignment_1 ) )
            {
            // InternalGrocery.g:941:1: ( ( rule__Backroom__NameAssignment_1 ) )
            // InternalGrocery.g:942:2: ( rule__Backroom__NameAssignment_1 )
            {
             before(grammarAccess.getBackroomAccess().getNameAssignment_1()); 
            // InternalGrocery.g:943:2: ( rule__Backroom__NameAssignment_1 )
            // InternalGrocery.g:943:3: rule__Backroom__NameAssignment_1
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
    // InternalGrocery.g:951:1: rule__Backroom__Group__2 : rule__Backroom__Group__2__Impl ;
    public final void rule__Backroom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:955:1: ( rule__Backroom__Group__2__Impl )
            // InternalGrocery.g:956:2: rule__Backroom__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Backroom__Group__2__Impl();

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
    // InternalGrocery.g:962:1: rule__Backroom__Group__2__Impl : ( ( rule__Backroom__ElementsAssignment_2 )* ) ;
    public final void rule__Backroom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:966:1: ( ( ( rule__Backroom__ElementsAssignment_2 )* ) )
            // InternalGrocery.g:967:1: ( ( rule__Backroom__ElementsAssignment_2 )* )
            {
            // InternalGrocery.g:967:1: ( ( rule__Backroom__ElementsAssignment_2 )* )
            // InternalGrocery.g:968:2: ( rule__Backroom__ElementsAssignment_2 )*
            {
             before(grammarAccess.getBackroomAccess().getElementsAssignment_2()); 
            // InternalGrocery.g:969:2: ( rule__Backroom__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=16 && LA9_0<=17)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrocery.g:969:3: rule__Backroom__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Backroom__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBackroomAccess().getElementsAssignment_2()); 

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


    // $ANTLR start "rule__NonPerishableItem__Group__0"
    // InternalGrocery.g:978:1: rule__NonPerishableItem__Group__0 : rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 ;
    public final void rule__NonPerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:982:1: ( rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 )
            // InternalGrocery.g:983:2: rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1
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
    // InternalGrocery.g:990:1: rule__NonPerishableItem__Group__0__Impl : ( 'nonPerishableItem' ) ;
    public final void rule__NonPerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:994:1: ( ( 'nonPerishableItem' ) )
            // InternalGrocery.g:995:1: ( 'nonPerishableItem' )
            {
            // InternalGrocery.g:995:1: ( 'nonPerishableItem' )
            // InternalGrocery.g:996:2: 'nonPerishableItem'
            {
             before(grammarAccess.getNonPerishableItemAccess().getNonPerishableItemKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGrocery.g:1005:1: rule__NonPerishableItem__Group__1 : rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 ;
    public final void rule__NonPerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1009:1: ( rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 )
            // InternalGrocery.g:1010:2: rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1017:1: rule__NonPerishableItem__Group__1__Impl : ( ( rule__NonPerishableItem__NameAssignment_1 ) ) ;
    public final void rule__NonPerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1021:1: ( ( ( rule__NonPerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1022:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1022:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1023:2: ( rule__NonPerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1024:2: ( rule__NonPerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1024:3: rule__NonPerishableItem__NameAssignment_1
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
    // InternalGrocery.g:1032:1: rule__NonPerishableItem__Group__2 : rule__NonPerishableItem__Group__2__Impl ;
    public final void rule__NonPerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1036:1: ( rule__NonPerishableItem__Group__2__Impl )
            // InternalGrocery.g:1037:2: rule__NonPerishableItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__Group__2__Impl();

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
    // InternalGrocery.g:1043:1: rule__NonPerishableItem__Group__2__Impl : ( ( rule__NonPerishableItem__PriceAssignment_2 ) ) ;
    public final void rule__NonPerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1047:1: ( ( ( rule__NonPerishableItem__PriceAssignment_2 ) ) )
            // InternalGrocery.g:1048:1: ( ( rule__NonPerishableItem__PriceAssignment_2 ) )
            {
            // InternalGrocery.g:1048:1: ( ( rule__NonPerishableItem__PriceAssignment_2 ) )
            // InternalGrocery.g:1049:2: ( rule__NonPerishableItem__PriceAssignment_2 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_2()); 
            // InternalGrocery.g:1050:2: ( rule__NonPerishableItem__PriceAssignment_2 )
            // InternalGrocery.g:1050:3: rule__NonPerishableItem__PriceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NonPerishableItem__PriceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_2()); 

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


    // $ANTLR start "rule__PerishableItem__Group__0"
    // InternalGrocery.g:1059:1: rule__PerishableItem__Group__0 : rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 ;
    public final void rule__PerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1063:1: ( rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 )
            // InternalGrocery.g:1064:2: rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1
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
    // InternalGrocery.g:1071:1: rule__PerishableItem__Group__0__Impl : ( 'perishableItem' ) ;
    public final void rule__PerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1075:1: ( ( 'perishableItem' ) )
            // InternalGrocery.g:1076:1: ( 'perishableItem' )
            {
            // InternalGrocery.g:1076:1: ( 'perishableItem' )
            // InternalGrocery.g:1077:2: 'perishableItem'
            {
             before(grammarAccess.getPerishableItemAccess().getPerishableItemKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGrocery.g:1086:1: rule__PerishableItem__Group__1 : rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 ;
    public final void rule__PerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1090:1: ( rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 )
            // InternalGrocery.g:1091:2: rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:1098:1: rule__PerishableItem__Group__1__Impl : ( ( rule__PerishableItem__NameAssignment_1 ) ) ;
    public final void rule__PerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1102:1: ( ( ( rule__PerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1103:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1103:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1104:2: ( rule__PerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1105:2: ( rule__PerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1105:3: rule__PerishableItem__NameAssignment_1
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
    // InternalGrocery.g:1113:1: rule__PerishableItem__Group__2 : rule__PerishableItem__Group__2__Impl ;
    public final void rule__PerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1117:1: ( rule__PerishableItem__Group__2__Impl )
            // InternalGrocery.g:1118:2: rule__PerishableItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__2__Impl();

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
    // InternalGrocery.g:1124:1: rule__PerishableItem__Group__2__Impl : ( ( rule__PerishableItem__ExperationDateAssignment_2 ) ) ;
    public final void rule__PerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1128:1: ( ( ( rule__PerishableItem__ExperationDateAssignment_2 ) ) )
            // InternalGrocery.g:1129:1: ( ( rule__PerishableItem__ExperationDateAssignment_2 ) )
            {
            // InternalGrocery.g:1129:1: ( ( rule__PerishableItem__ExperationDateAssignment_2 ) )
            // InternalGrocery.g:1130:2: ( rule__PerishableItem__ExperationDateAssignment_2 )
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_2()); 
            // InternalGrocery.g:1131:2: ( rule__PerishableItem__ExperationDateAssignment_2 )
            // InternalGrocery.g:1131:3: rule__PerishableItem__ExperationDateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__ExperationDateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_2()); 

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


    // $ANTLR start "rule__Address__Group__0"
    // InternalGrocery.g:1140:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1144:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalGrocery.g:1145:2: rule__Address__Group__0__Impl rule__Address__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:1152:1: rule__Address__Group__0__Impl : ( 'street' ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1156:1: ( ( 'street' ) )
            // InternalGrocery.g:1157:1: ( 'street' )
            {
            // InternalGrocery.g:1157:1: ( 'street' )
            // InternalGrocery.g:1158:2: 'street'
            {
             before(grammarAccess.getAddressAccess().getStreetKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getStreetKeyword_0()); 

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
    // InternalGrocery.g:1167:1: rule__Address__Group__1 : rule__Address__Group__1__Impl rule__Address__Group__2 ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1171:1: ( rule__Address__Group__1__Impl rule__Address__Group__2 )
            // InternalGrocery.g:1172:2: rule__Address__Group__1__Impl rule__Address__Group__2
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
    // InternalGrocery.g:1179:1: rule__Address__Group__1__Impl : ( ( rule__Address__StreetAssignment_1 ) ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1183:1: ( ( ( rule__Address__StreetAssignment_1 ) ) )
            // InternalGrocery.g:1184:1: ( ( rule__Address__StreetAssignment_1 ) )
            {
            // InternalGrocery.g:1184:1: ( ( rule__Address__StreetAssignment_1 ) )
            // InternalGrocery.g:1185:2: ( rule__Address__StreetAssignment_1 )
            {
             before(grammarAccess.getAddressAccess().getStreetAssignment_1()); 
            // InternalGrocery.g:1186:2: ( rule__Address__StreetAssignment_1 )
            // InternalGrocery.g:1186:3: rule__Address__StreetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__StreetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getStreetAssignment_1()); 

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
    // InternalGrocery.g:1194:1: rule__Address__Group__2 : rule__Address__Group__2__Impl rule__Address__Group__3 ;
    public final void rule__Address__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1198:1: ( rule__Address__Group__2__Impl rule__Address__Group__3 )
            // InternalGrocery.g:1199:2: rule__Address__Group__2__Impl rule__Address__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1206:1: rule__Address__Group__2__Impl : ( 'number' ) ;
    public final void rule__Address__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1210:1: ( ( 'number' ) )
            // InternalGrocery.g:1211:1: ( 'number' )
            {
            // InternalGrocery.g:1211:1: ( 'number' )
            // InternalGrocery.g:1212:2: 'number'
            {
             before(grammarAccess.getAddressAccess().getNumberKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getNumberKeyword_2()); 

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
    // InternalGrocery.g:1221:1: rule__Address__Group__3 : rule__Address__Group__3__Impl rule__Address__Group__4 ;
    public final void rule__Address__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1225:1: ( rule__Address__Group__3__Impl rule__Address__Group__4 )
            // InternalGrocery.g:1226:2: rule__Address__Group__3__Impl rule__Address__Group__4
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
    // InternalGrocery.g:1233:1: rule__Address__Group__3__Impl : ( ( rule__Address__NumberAssignment_3 ) ) ;
    public final void rule__Address__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1237:1: ( ( ( rule__Address__NumberAssignment_3 ) ) )
            // InternalGrocery.g:1238:1: ( ( rule__Address__NumberAssignment_3 ) )
            {
            // InternalGrocery.g:1238:1: ( ( rule__Address__NumberAssignment_3 ) )
            // InternalGrocery.g:1239:2: ( rule__Address__NumberAssignment_3 )
            {
             before(grammarAccess.getAddressAccess().getNumberAssignment_3()); 
            // InternalGrocery.g:1240:2: ( rule__Address__NumberAssignment_3 )
            // InternalGrocery.g:1240:3: rule__Address__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Address__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getNumberAssignment_3()); 

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
    // InternalGrocery.g:1248:1: rule__Address__Group__4 : rule__Address__Group__4__Impl rule__Address__Group__5 ;
    public final void rule__Address__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1252:1: ( rule__Address__Group__4__Impl rule__Address__Group__5 )
            // InternalGrocery.g:1253:2: rule__Address__Group__4__Impl rule__Address__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalGrocery.g:1260:1: rule__Address__Group__4__Impl : ( 'city' ) ;
    public final void rule__Address__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1264:1: ( ( 'city' ) )
            // InternalGrocery.g:1265:1: ( 'city' )
            {
            // InternalGrocery.g:1265:1: ( 'city' )
            // InternalGrocery.g:1266:2: 'city'
            {
             before(grammarAccess.getAddressAccess().getCityKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCityKeyword_4()); 

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
    // InternalGrocery.g:1275:1: rule__Address__Group__5 : rule__Address__Group__5__Impl ;
    public final void rule__Address__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1279:1: ( rule__Address__Group__5__Impl )
            // InternalGrocery.g:1280:2: rule__Address__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__5__Impl();

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
    // InternalGrocery.g:1286:1: rule__Address__Group__5__Impl : ( ( rule__Address__CityAssignment_5 ) ) ;
    public final void rule__Address__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1290:1: ( ( ( rule__Address__CityAssignment_5 ) ) )
            // InternalGrocery.g:1291:1: ( ( rule__Address__CityAssignment_5 ) )
            {
            // InternalGrocery.g:1291:1: ( ( rule__Address__CityAssignment_5 ) )
            // InternalGrocery.g:1292:2: ( rule__Address__CityAssignment_5 )
            {
             before(grammarAccess.getAddressAccess().getCityAssignment_5()); 
            // InternalGrocery.g:1293:2: ( rule__Address__CityAssignment_5 )
            // InternalGrocery.g:1293:3: rule__Address__CityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Address__CityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getCityAssignment_5()); 

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


    // $ANTLR start "rule__ExperationDate__Group__0"
    // InternalGrocery.g:1302:1: rule__ExperationDate__Group__0 : rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1 ;
    public final void rule__ExperationDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1306:1: ( rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1 )
            // InternalGrocery.g:1307:2: rule__ExperationDate__Group__0__Impl rule__ExperationDate__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1314:1: rule__ExperationDate__Group__0__Impl : ( 'month' ) ;
    public final void rule__ExperationDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1318:1: ( ( 'month' ) )
            // InternalGrocery.g:1319:1: ( 'month' )
            {
            // InternalGrocery.g:1319:1: ( 'month' )
            // InternalGrocery.g:1320:2: 'month'
            {
             before(grammarAccess.getExperationDateAccess().getMonthKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getMonthKeyword_0()); 

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
    // InternalGrocery.g:1329:1: rule__ExperationDate__Group__1 : rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2 ;
    public final void rule__ExperationDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1333:1: ( rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2 )
            // InternalGrocery.g:1334:2: rule__ExperationDate__Group__1__Impl rule__ExperationDate__Group__2
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
    // InternalGrocery.g:1341:1: rule__ExperationDate__Group__1__Impl : ( ( rule__ExperationDate__MonthAssignment_1 ) ) ;
    public final void rule__ExperationDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1345:1: ( ( ( rule__ExperationDate__MonthAssignment_1 ) ) )
            // InternalGrocery.g:1346:1: ( ( rule__ExperationDate__MonthAssignment_1 ) )
            {
            // InternalGrocery.g:1346:1: ( ( rule__ExperationDate__MonthAssignment_1 ) )
            // InternalGrocery.g:1347:2: ( rule__ExperationDate__MonthAssignment_1 )
            {
             before(grammarAccess.getExperationDateAccess().getMonthAssignment_1()); 
            // InternalGrocery.g:1348:2: ( rule__ExperationDate__MonthAssignment_1 )
            // InternalGrocery.g:1348:3: rule__ExperationDate__MonthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__MonthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getMonthAssignment_1()); 

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
    // InternalGrocery.g:1356:1: rule__ExperationDate__Group__2 : rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3 ;
    public final void rule__ExperationDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1360:1: ( rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3 )
            // InternalGrocery.g:1361:2: rule__ExperationDate__Group__2__Impl rule__ExperationDate__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1368:1: rule__ExperationDate__Group__2__Impl : ( 'day' ) ;
    public final void rule__ExperationDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1372:1: ( ( 'day' ) )
            // InternalGrocery.g:1373:1: ( 'day' )
            {
            // InternalGrocery.g:1373:1: ( 'day' )
            // InternalGrocery.g:1374:2: 'day'
            {
             before(grammarAccess.getExperationDateAccess().getDayKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getDayKeyword_2()); 

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
    // InternalGrocery.g:1383:1: rule__ExperationDate__Group__3 : rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4 ;
    public final void rule__ExperationDate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1387:1: ( rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4 )
            // InternalGrocery.g:1388:2: rule__ExperationDate__Group__3__Impl rule__ExperationDate__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:1395:1: rule__ExperationDate__Group__3__Impl : ( ( rule__ExperationDate__DayAssignment_3 ) ) ;
    public final void rule__ExperationDate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1399:1: ( ( ( rule__ExperationDate__DayAssignment_3 ) ) )
            // InternalGrocery.g:1400:1: ( ( rule__ExperationDate__DayAssignment_3 ) )
            {
            // InternalGrocery.g:1400:1: ( ( rule__ExperationDate__DayAssignment_3 ) )
            // InternalGrocery.g:1401:2: ( rule__ExperationDate__DayAssignment_3 )
            {
             before(grammarAccess.getExperationDateAccess().getDayAssignment_3()); 
            // InternalGrocery.g:1402:2: ( rule__ExperationDate__DayAssignment_3 )
            // InternalGrocery.g:1402:3: rule__ExperationDate__DayAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__DayAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getDayAssignment_3()); 

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
    // InternalGrocery.g:1410:1: rule__ExperationDate__Group__4 : rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5 ;
    public final void rule__ExperationDate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1414:1: ( rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5 )
            // InternalGrocery.g:1415:2: rule__ExperationDate__Group__4__Impl rule__ExperationDate__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1422:1: rule__ExperationDate__Group__4__Impl : ( 'year' ) ;
    public final void rule__ExperationDate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1426:1: ( ( 'year' ) )
            // InternalGrocery.g:1427:1: ( 'year' )
            {
            // InternalGrocery.g:1427:1: ( 'year' )
            // InternalGrocery.g:1428:2: 'year'
            {
             before(grammarAccess.getExperationDateAccess().getYearKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getYearKeyword_4()); 

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
    // InternalGrocery.g:1437:1: rule__ExperationDate__Group__5 : rule__ExperationDate__Group__5__Impl ;
    public final void rule__ExperationDate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1441:1: ( rule__ExperationDate__Group__5__Impl )
            // InternalGrocery.g:1442:2: rule__ExperationDate__Group__5__Impl
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
    // InternalGrocery.g:1448:1: rule__ExperationDate__Group__5__Impl : ( ( rule__ExperationDate__YearAssignment_5 ) ) ;
    public final void rule__ExperationDate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1452:1: ( ( ( rule__ExperationDate__YearAssignment_5 ) ) )
            // InternalGrocery.g:1453:1: ( ( rule__ExperationDate__YearAssignment_5 ) )
            {
            // InternalGrocery.g:1453:1: ( ( rule__ExperationDate__YearAssignment_5 ) )
            // InternalGrocery.g:1454:2: ( rule__ExperationDate__YearAssignment_5 )
            {
             before(grammarAccess.getExperationDateAccess().getYearAssignment_5()); 
            // InternalGrocery.g:1455:2: ( rule__ExperationDate__YearAssignment_5 )
            // InternalGrocery.g:1455:3: rule__ExperationDate__YearAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ExperationDate__YearAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExperationDateAccess().getYearAssignment_5()); 

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
    // InternalGrocery.g:1464:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1468:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalGrocery.g:1469:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
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
    // InternalGrocery.g:1476:1: rule__Driver__Group__0__Impl : ( 'driver' ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1480:1: ( ( 'driver' ) )
            // InternalGrocery.g:1481:1: ( 'driver' )
            {
            // InternalGrocery.g:1481:1: ( 'driver' )
            // InternalGrocery.g:1482:2: 'driver'
            {
             before(grammarAccess.getDriverAccess().getDriverKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGrocery.g:1491:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1495:1: ( rule__Driver__Group__1__Impl )
            // InternalGrocery.g:1496:2: rule__Driver__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__1__Impl();

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
    // InternalGrocery.g:1502:1: rule__Driver__Group__1__Impl : ( ( rule__Driver__NameAssignment_1 ) ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1506:1: ( ( ( rule__Driver__NameAssignment_1 ) ) )
            // InternalGrocery.g:1507:1: ( ( rule__Driver__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1507:1: ( ( rule__Driver__NameAssignment_1 ) )
            // InternalGrocery.g:1508:2: ( rule__Driver__NameAssignment_1 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1509:2: ( rule__Driver__NameAssignment_1 )
            // InternalGrocery.g:1509:3: rule__Driver__NameAssignment_1
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


    // $ANTLR start "rule__Vehicle__Group__0"
    // InternalGrocery.g:1518:1: rule__Vehicle__Group__0 : rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 ;
    public final void rule__Vehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1522:1: ( rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 )
            // InternalGrocery.g:1523:2: rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1
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
    // InternalGrocery.g:1530:1: rule__Vehicle__Group__0__Impl : ( 'vehicle' ) ;
    public final void rule__Vehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1534:1: ( ( 'vehicle' ) )
            // InternalGrocery.g:1535:1: ( 'vehicle' )
            {
            // InternalGrocery.g:1535:1: ( 'vehicle' )
            // InternalGrocery.g:1536:2: 'vehicle'
            {
             before(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGrocery.g:1545:1: rule__Vehicle__Group__1 : rule__Vehicle__Group__1__Impl ;
    public final void rule__Vehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1549:1: ( rule__Vehicle__Group__1__Impl )
            // InternalGrocery.g:1550:2: rule__Vehicle__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__1__Impl();

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
    // InternalGrocery.g:1556:1: rule__Vehicle__Group__1__Impl : ( ( rule__Vehicle__NameAssignment_1 ) ) ;
    public final void rule__Vehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1560:1: ( ( ( rule__Vehicle__NameAssignment_1 ) ) )
            // InternalGrocery.g:1561:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1561:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            // InternalGrocery.g:1562:2: ( rule__Vehicle__NameAssignment_1 )
            {
             before(grammarAccess.getVehicleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1563:2: ( rule__Vehicle__NameAssignment_1 )
            // InternalGrocery.g:1563:3: rule__Vehicle__NameAssignment_1
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


    // $ANTLR start "rule__Grocery__ElementsAssignment_0"
    // InternalGrocery.g:1572:1: rule__Grocery__ElementsAssignment_0 : ( ruleBuilding ) ;
    public final void rule__Grocery__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1576:1: ( ( ruleBuilding ) )
            // InternalGrocery.g:1577:2: ( ruleBuilding )
            {
            // InternalGrocery.g:1577:2: ( ruleBuilding )
            // InternalGrocery.g:1578:3: ruleBuilding
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
    // InternalGrocery.g:1587:1: rule__Grocery__ElementsAssignment_1 : ( ruleDeliveryElement ) ;
    public final void rule__Grocery__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1591:1: ( ( ruleDeliveryElement ) )
            // InternalGrocery.g:1592:2: ( ruleDeliveryElement )
            {
            // InternalGrocery.g:1592:2: ( ruleDeliveryElement )
            // InternalGrocery.g:1593:3: ruleDeliveryElement
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
    // InternalGrocery.g:1602:1: rule__Store__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1606:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1607:2: ( RULE_ID )
            {
            // InternalGrocery.g:1607:2: ( RULE_ID )
            // InternalGrocery.g:1608:3: RULE_ID
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
    // InternalGrocery.g:1617:1: rule__Store__ElementsAssignment_3 : ( ruleShelf ) ;
    public final void rule__Store__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1621:1: ( ( ruleShelf ) )
            // InternalGrocery.g:1622:2: ( ruleShelf )
            {
            // InternalGrocery.g:1622:2: ( ruleShelf )
            // InternalGrocery.g:1623:3: ruleShelf
            {
             before(grammarAccess.getStoreAccess().getElementsShelfParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleShelf();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getElementsShelfParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Store__ElementsAssignment_4"
    // InternalGrocery.g:1632:1: rule__Store__ElementsAssignment_4 : ( ruleBackroom ) ;
    public final void rule__Store__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1636:1: ( ( ruleBackroom ) )
            // InternalGrocery.g:1637:2: ( ruleBackroom )
            {
            // InternalGrocery.g:1637:2: ( ruleBackroom )
            // InternalGrocery.g:1638:3: ruleBackroom
            {
             before(grammarAccess.getStoreAccess().getElementsBackroomParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBackroom();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getElementsBackroomParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Store__ElementsAssignment_4"


    // $ANTLR start "rule__Warehouse__NameAssignment_0"
    // InternalGrocery.g:1647:1: rule__Warehouse__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Warehouse__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1651:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1652:2: ( RULE_ID )
            {
            // InternalGrocery.g:1652:2: ( RULE_ID )
            // InternalGrocery.g:1653:3: RULE_ID
            {
             before(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Warehouse__NameAssignment_0"


    // $ANTLR start "rule__Warehouse__AddressAssignment_1"
    // InternalGrocery.g:1662:1: rule__Warehouse__AddressAssignment_1 : ( ruleAddress ) ;
    public final void rule__Warehouse__AddressAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1666:1: ( ( ruleAddress ) )
            // InternalGrocery.g:1667:2: ( ruleAddress )
            {
            // InternalGrocery.g:1667:2: ( ruleAddress )
            // InternalGrocery.g:1668:3: ruleAddress
            {
             before(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getAddressAddressParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Warehouse__AddressAssignment_1"


    // $ANTLR start "rule__Warehouse__ElementsAssignment_3"
    // InternalGrocery.g:1677:1: rule__Warehouse__ElementsAssignment_3 : ( ruleItem ) ;
    public final void rule__Warehouse__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1681:1: ( ( ruleItem ) )
            // InternalGrocery.g:1682:2: ( ruleItem )
            {
            // InternalGrocery.g:1682:2: ( ruleItem )
            // InternalGrocery.g:1683:3: ruleItem
            {
             before(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getWarehouseAccess().getElementsItemParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Warehouse__ElementsAssignment_3"


    // $ANTLR start "rule__Shelf__NameAssignment_1"
    // InternalGrocery.g:1692:1: rule__Shelf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Shelf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1696:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1697:2: ( RULE_ID )
            {
            // InternalGrocery.g:1697:2: ( RULE_ID )
            // InternalGrocery.g:1698:3: RULE_ID
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


    // $ANTLR start "rule__Shelf__ElementsAssignment_2"
    // InternalGrocery.g:1707:1: rule__Shelf__ElementsAssignment_2 : ( ruleItem ) ;
    public final void rule__Shelf__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1711:1: ( ( ruleItem ) )
            // InternalGrocery.g:1712:2: ( ruleItem )
            {
            // InternalGrocery.g:1712:2: ( ruleItem )
            // InternalGrocery.g:1713:3: ruleItem
            {
             before(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getShelfAccess().getElementsItemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Shelf__ElementsAssignment_2"


    // $ANTLR start "rule__Backroom__NameAssignment_1"
    // InternalGrocery.g:1722:1: rule__Backroom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Backroom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1726:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1727:2: ( RULE_ID )
            {
            // InternalGrocery.g:1727:2: ( RULE_ID )
            // InternalGrocery.g:1728:3: RULE_ID
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


    // $ANTLR start "rule__Backroom__ElementsAssignment_2"
    // InternalGrocery.g:1737:1: rule__Backroom__ElementsAssignment_2 : ( ruleItem ) ;
    public final void rule__Backroom__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1741:1: ( ( ruleItem ) )
            // InternalGrocery.g:1742:2: ( ruleItem )
            {
            // InternalGrocery.g:1742:2: ( ruleItem )
            // InternalGrocery.g:1743:3: ruleItem
            {
             before(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getBackroomAccess().getElementsItemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Backroom__ElementsAssignment_2"


    // $ANTLR start "rule__NonPerishableItem__NameAssignment_1"
    // InternalGrocery.g:1752:1: rule__NonPerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonPerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1756:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1757:2: ( RULE_ID )
            {
            // InternalGrocery.g:1757:2: ( RULE_ID )
            // InternalGrocery.g:1758:3: RULE_ID
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


    // $ANTLR start "rule__NonPerishableItem__PriceAssignment_2"
    // InternalGrocery.g:1767:1: rule__NonPerishableItem__PriceAssignment_2 : ( RULE_INT ) ;
    public final void rule__NonPerishableItem__PriceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1771:1: ( ( RULE_INT ) )
            // InternalGrocery.g:1772:2: ( RULE_INT )
            {
            // InternalGrocery.g:1772:2: ( RULE_INT )
            // InternalGrocery.g:1773:3: RULE_INT
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNonPerishableItemAccess().getPriceINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__NonPerishableItem__PriceAssignment_2"


    // $ANTLR start "rule__PerishableItem__NameAssignment_1"
    // InternalGrocery.g:1782:1: rule__PerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1786:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1787:2: ( RULE_ID )
            {
            // InternalGrocery.g:1787:2: ( RULE_ID )
            // InternalGrocery.g:1788:3: RULE_ID
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


    // $ANTLR start "rule__PerishableItem__ExperationDateAssignment_2"
    // InternalGrocery.g:1797:1: rule__PerishableItem__ExperationDateAssignment_2 : ( ruleExperationDate ) ;
    public final void rule__PerishableItem__ExperationDateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1801:1: ( ( ruleExperationDate ) )
            // InternalGrocery.g:1802:2: ( ruleExperationDate )
            {
            // InternalGrocery.g:1802:2: ( ruleExperationDate )
            // InternalGrocery.g:1803:3: ruleExperationDate
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExperationDate();

            state._fsp--;

             after(grammarAccess.getPerishableItemAccess().getExperationDateExperationDateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PerishableItem__ExperationDateAssignment_2"


    // $ANTLR start "rule__Address__StreetAssignment_1"
    // InternalGrocery.g:1812:1: rule__Address__StreetAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Address__StreetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1816:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:1817:2: ( RULE_STRING )
            {
            // InternalGrocery.g:1817:2: ( RULE_STRING )
            // InternalGrocery.g:1818:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getStreetSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Address__StreetAssignment_1"


    // $ANTLR start "rule__Address__NumberAssignment_3"
    // InternalGrocery.g:1827:1: rule__Address__NumberAssignment_3 : ( RULE_INT ) ;
    public final void rule__Address__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1831:1: ( ( RULE_INT ) )
            // InternalGrocery.g:1832:2: ( RULE_INT )
            {
            // InternalGrocery.g:1832:2: ( RULE_INT )
            // InternalGrocery.g:1833:3: RULE_INT
            {
             before(grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getNumberINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Address__NumberAssignment_3"


    // $ANTLR start "rule__Address__CityAssignment_5"
    // InternalGrocery.g:1842:1: rule__Address__CityAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Address__CityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1846:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:1847:2: ( RULE_STRING )
            {
            // InternalGrocery.g:1847:2: ( RULE_STRING )
            // InternalGrocery.g:1848:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getCitySTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Address__CityAssignment_5"


    // $ANTLR start "rule__ExperationDate__MonthAssignment_1"
    // InternalGrocery.g:1857:1: rule__ExperationDate__MonthAssignment_1 : ( RULE_INT ) ;
    public final void rule__ExperationDate__MonthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1861:1: ( ( RULE_INT ) )
            // InternalGrocery.g:1862:2: ( RULE_INT )
            {
            // InternalGrocery.g:1862:2: ( RULE_INT )
            // InternalGrocery.g:1863:3: RULE_INT
            {
             before(grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getMonthINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExperationDate__MonthAssignment_1"


    // $ANTLR start "rule__ExperationDate__DayAssignment_3"
    // InternalGrocery.g:1872:1: rule__ExperationDate__DayAssignment_3 : ( RULE_INT ) ;
    public final void rule__ExperationDate__DayAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1876:1: ( ( RULE_INT ) )
            // InternalGrocery.g:1877:2: ( RULE_INT )
            {
            // InternalGrocery.g:1877:2: ( RULE_INT )
            // InternalGrocery.g:1878:3: RULE_INT
            {
             before(grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getDayINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExperationDate__DayAssignment_3"


    // $ANTLR start "rule__ExperationDate__YearAssignment_5"
    // InternalGrocery.g:1887:1: rule__ExperationDate__YearAssignment_5 : ( RULE_INT ) ;
    public final void rule__ExperationDate__YearAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1891:1: ( ( RULE_INT ) )
            // InternalGrocery.g:1892:2: ( RULE_INT )
            {
            // InternalGrocery.g:1892:2: ( RULE_INT )
            // InternalGrocery.g:1893:3: RULE_INT
            {
             before(grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExperationDateAccess().getYearINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ExperationDate__YearAssignment_5"


    // $ANTLR start "rule__Driver__NameAssignment_1"
    // InternalGrocery.g:1902:1: rule__Driver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Driver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1906:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1907:2: ( RULE_ID )
            {
            // InternalGrocery.g:1907:2: ( RULE_ID )
            // InternalGrocery.g:1908:3: RULE_ID
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


    // $ANTLR start "rule__Vehicle__NameAssignment_1"
    // InternalGrocery.g:1917:1: rule__Vehicle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1921:1: ( ( RULE_ID ) )
            // InternalGrocery.g:1922:2: ( RULE_ID )
            {
            // InternalGrocery.g:1922:2: ( RULE_ID )
            // InternalGrocery.g:1923:3: RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});

}
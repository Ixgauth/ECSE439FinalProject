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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'store'", "'{'", "'}'", "'warehouse'", "'address'", "':'", "'shelf'", "'backroom'", "'nonPerishableItem'", "'price'", "'quantity'", "'perishableItem'", "'experationDate'", "'nonFoodItem'", "'driver'", "'name'", "'employee'", "'customer'", "'vehicle'", "'plateNumber'", "'delivery'", "'sale'", "'stock'", "'.'", "'/'", "','"
    };
    public static final int RULE_STRING=5;
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


    // $ANTLR start "entryRuleMovementElement"
    // InternalGrocery.g:128:1: entryRuleMovementElement : ruleMovementElement EOF ;
    public final void entryRuleMovementElement() throws RecognitionException {
        try {
            // InternalGrocery.g:129:1: ( ruleMovementElement EOF )
            // InternalGrocery.g:130:1: ruleMovementElement EOF
            {
             before(grammarAccess.getMovementElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMovementElement();

            state._fsp--;

             after(grammarAccess.getMovementElementRule()); 
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
    // $ANTLR end "entryRuleMovementElement"


    // $ANTLR start "ruleMovementElement"
    // InternalGrocery.g:137:1: ruleMovementElement : ( ( rule__MovementElement__Alternatives ) ) ;
    public final void ruleMovementElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:141:2: ( ( ( rule__MovementElement__Alternatives ) ) )
            // InternalGrocery.g:142:2: ( ( rule__MovementElement__Alternatives ) )
            {
            // InternalGrocery.g:142:2: ( ( rule__MovementElement__Alternatives ) )
            // InternalGrocery.g:143:3: ( rule__MovementElement__Alternatives )
            {
             before(grammarAccess.getMovementElementAccess().getAlternatives()); 
            // InternalGrocery.g:144:3: ( rule__MovementElement__Alternatives )
            // InternalGrocery.g:144:4: rule__MovementElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MovementElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMovementElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovementElement"


    // $ANTLR start "entryRulePerson"
    // InternalGrocery.g:153:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalGrocery.g:154:1: ( rulePerson EOF )
            // InternalGrocery.g:155:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalGrocery.g:162:1: rulePerson : ( ( rule__Person__Alternatives ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:166:2: ( ( ( rule__Person__Alternatives ) ) )
            // InternalGrocery.g:167:2: ( ( rule__Person__Alternatives ) )
            {
            // InternalGrocery.g:167:2: ( ( rule__Person__Alternatives ) )
            // InternalGrocery.g:168:3: ( rule__Person__Alternatives )
            {
             before(grammarAccess.getPersonAccess().getAlternatives()); 
            // InternalGrocery.g:169:3: ( rule__Person__Alternatives )
            // InternalGrocery.g:169:4: rule__Person__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Person__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleItem"
    // InternalGrocery.g:178:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalGrocery.g:179:1: ( ruleItem EOF )
            // InternalGrocery.g:180:1: ruleItem EOF
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
    // InternalGrocery.g:187:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:191:2: ( ( ( rule__Item__Alternatives ) ) )
            // InternalGrocery.g:192:2: ( ( rule__Item__Alternatives ) )
            {
            // InternalGrocery.g:192:2: ( ( rule__Item__Alternatives ) )
            // InternalGrocery.g:193:3: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // InternalGrocery.g:194:3: ( rule__Item__Alternatives )
            // InternalGrocery.g:194:4: rule__Item__Alternatives
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


    // $ANTLR start "entryRuleFoodItem"
    // InternalGrocery.g:203:1: entryRuleFoodItem : ruleFoodItem EOF ;
    public final void entryRuleFoodItem() throws RecognitionException {
        try {
            // InternalGrocery.g:204:1: ( ruleFoodItem EOF )
            // InternalGrocery.g:205:1: ruleFoodItem EOF
            {
             before(grammarAccess.getFoodItemRule()); 
            pushFollow(FOLLOW_1);
            ruleFoodItem();

            state._fsp--;

             after(grammarAccess.getFoodItemRule()); 
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
    // $ANTLR end "entryRuleFoodItem"


    // $ANTLR start "ruleFoodItem"
    // InternalGrocery.g:212:1: ruleFoodItem : ( ( rule__FoodItem__Alternatives ) ) ;
    public final void ruleFoodItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:216:2: ( ( ( rule__FoodItem__Alternatives ) ) )
            // InternalGrocery.g:217:2: ( ( rule__FoodItem__Alternatives ) )
            {
            // InternalGrocery.g:217:2: ( ( rule__FoodItem__Alternatives ) )
            // InternalGrocery.g:218:3: ( rule__FoodItem__Alternatives )
            {
             before(grammarAccess.getFoodItemAccess().getAlternatives()); 
            // InternalGrocery.g:219:3: ( rule__FoodItem__Alternatives )
            // InternalGrocery.g:219:4: rule__FoodItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FoodItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFoodItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFoodItem"


    // $ANTLR start "entryRuleMovement"
    // InternalGrocery.g:228:1: entryRuleMovement : ruleMovement EOF ;
    public final void entryRuleMovement() throws RecognitionException {
        try {
            // InternalGrocery.g:229:1: ( ruleMovement EOF )
            // InternalGrocery.g:230:1: ruleMovement EOF
            {
             before(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getMovementRule()); 
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
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalGrocery.g:237:1: ruleMovement : ( ( rule__Movement__Alternatives ) ) ;
    public final void ruleMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:241:2: ( ( ( rule__Movement__Alternatives ) ) )
            // InternalGrocery.g:242:2: ( ( rule__Movement__Alternatives ) )
            {
            // InternalGrocery.g:242:2: ( ( rule__Movement__Alternatives ) )
            // InternalGrocery.g:243:3: ( rule__Movement__Alternatives )
            {
             before(grammarAccess.getMovementAccess().getAlternatives()); 
            // InternalGrocery.g:244:3: ( rule__Movement__Alternatives )
            // InternalGrocery.g:244:4: rule__Movement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleStore"
    // InternalGrocery.g:253:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalGrocery.g:254:1: ( ruleStore EOF )
            // InternalGrocery.g:255:1: ruleStore EOF
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
    // InternalGrocery.g:262:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:266:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalGrocery.g:267:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalGrocery.g:267:2: ( ( rule__Store__Group__0 ) )
            // InternalGrocery.g:268:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalGrocery.g:269:3: ( rule__Store__Group__0 )
            // InternalGrocery.g:269:4: rule__Store__Group__0
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
    // InternalGrocery.g:278:1: entryRuleWarehouse : ruleWarehouse EOF ;
    public final void entryRuleWarehouse() throws RecognitionException {
        try {
            // InternalGrocery.g:279:1: ( ruleWarehouse EOF )
            // InternalGrocery.g:280:1: ruleWarehouse EOF
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
    // InternalGrocery.g:287:1: ruleWarehouse : ( ( rule__Warehouse__Group__0 ) ) ;
    public final void ruleWarehouse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:291:2: ( ( ( rule__Warehouse__Group__0 ) ) )
            // InternalGrocery.g:292:2: ( ( rule__Warehouse__Group__0 ) )
            {
            // InternalGrocery.g:292:2: ( ( rule__Warehouse__Group__0 ) )
            // InternalGrocery.g:293:3: ( rule__Warehouse__Group__0 )
            {
             before(grammarAccess.getWarehouseAccess().getGroup()); 
            // InternalGrocery.g:294:3: ( rule__Warehouse__Group__0 )
            // InternalGrocery.g:294:4: rule__Warehouse__Group__0
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
    // InternalGrocery.g:303:1: entryRuleShelf : ruleShelf EOF ;
    public final void entryRuleShelf() throws RecognitionException {
        try {
            // InternalGrocery.g:304:1: ( ruleShelf EOF )
            // InternalGrocery.g:305:1: ruleShelf EOF
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
    // InternalGrocery.g:312:1: ruleShelf : ( ( rule__Shelf__Group__0 ) ) ;
    public final void ruleShelf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:316:2: ( ( ( rule__Shelf__Group__0 ) ) )
            // InternalGrocery.g:317:2: ( ( rule__Shelf__Group__0 ) )
            {
            // InternalGrocery.g:317:2: ( ( rule__Shelf__Group__0 ) )
            // InternalGrocery.g:318:3: ( rule__Shelf__Group__0 )
            {
             before(grammarAccess.getShelfAccess().getGroup()); 
            // InternalGrocery.g:319:3: ( rule__Shelf__Group__0 )
            // InternalGrocery.g:319:4: rule__Shelf__Group__0
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
    // InternalGrocery.g:328:1: entryRuleBackroom : ruleBackroom EOF ;
    public final void entryRuleBackroom() throws RecognitionException {
        try {
            // InternalGrocery.g:329:1: ( ruleBackroom EOF )
            // InternalGrocery.g:330:1: ruleBackroom EOF
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
    // InternalGrocery.g:337:1: ruleBackroom : ( ( rule__Backroom__Group__0 ) ) ;
    public final void ruleBackroom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:341:2: ( ( ( rule__Backroom__Group__0 ) ) )
            // InternalGrocery.g:342:2: ( ( rule__Backroom__Group__0 ) )
            {
            // InternalGrocery.g:342:2: ( ( rule__Backroom__Group__0 ) )
            // InternalGrocery.g:343:3: ( rule__Backroom__Group__0 )
            {
             before(grammarAccess.getBackroomAccess().getGroup()); 
            // InternalGrocery.g:344:3: ( rule__Backroom__Group__0 )
            // InternalGrocery.g:344:4: rule__Backroom__Group__0
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


    // $ANTLR start "entryRuleNonPerishableItem"
    // InternalGrocery.g:353:1: entryRuleNonPerishableItem : ruleNonPerishableItem EOF ;
    public final void entryRuleNonPerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:354:1: ( ruleNonPerishableItem EOF )
            // InternalGrocery.g:355:1: ruleNonPerishableItem EOF
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
    // InternalGrocery.g:362:1: ruleNonPerishableItem : ( ( rule__NonPerishableItem__Group__0 ) ) ;
    public final void ruleNonPerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:366:2: ( ( ( rule__NonPerishableItem__Group__0 ) ) )
            // InternalGrocery.g:367:2: ( ( rule__NonPerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:367:2: ( ( rule__NonPerishableItem__Group__0 ) )
            // InternalGrocery.g:368:3: ( rule__NonPerishableItem__Group__0 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:369:3: ( rule__NonPerishableItem__Group__0 )
            // InternalGrocery.g:369:4: rule__NonPerishableItem__Group__0
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
    // InternalGrocery.g:378:1: entryRulePerishableItem : rulePerishableItem EOF ;
    public final void entryRulePerishableItem() throws RecognitionException {
        try {
            // InternalGrocery.g:379:1: ( rulePerishableItem EOF )
            // InternalGrocery.g:380:1: rulePerishableItem EOF
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
    // InternalGrocery.g:387:1: rulePerishableItem : ( ( rule__PerishableItem__Group__0 ) ) ;
    public final void rulePerishableItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:391:2: ( ( ( rule__PerishableItem__Group__0 ) ) )
            // InternalGrocery.g:392:2: ( ( rule__PerishableItem__Group__0 ) )
            {
            // InternalGrocery.g:392:2: ( ( rule__PerishableItem__Group__0 ) )
            // InternalGrocery.g:393:3: ( rule__PerishableItem__Group__0 )
            {
             before(grammarAccess.getPerishableItemAccess().getGroup()); 
            // InternalGrocery.g:394:3: ( rule__PerishableItem__Group__0 )
            // InternalGrocery.g:394:4: rule__PerishableItem__Group__0
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


    // $ANTLR start "entryRuleNonFoodItem"
    // InternalGrocery.g:403:1: entryRuleNonFoodItem : ruleNonFoodItem EOF ;
    public final void entryRuleNonFoodItem() throws RecognitionException {
        try {
            // InternalGrocery.g:404:1: ( ruleNonFoodItem EOF )
            // InternalGrocery.g:405:1: ruleNonFoodItem EOF
            {
             before(grammarAccess.getNonFoodItemRule()); 
            pushFollow(FOLLOW_1);
            ruleNonFoodItem();

            state._fsp--;

             after(grammarAccess.getNonFoodItemRule()); 
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
    // $ANTLR end "entryRuleNonFoodItem"


    // $ANTLR start "ruleNonFoodItem"
    // InternalGrocery.g:412:1: ruleNonFoodItem : ( ( rule__NonFoodItem__Group__0 ) ) ;
    public final void ruleNonFoodItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:416:2: ( ( ( rule__NonFoodItem__Group__0 ) ) )
            // InternalGrocery.g:417:2: ( ( rule__NonFoodItem__Group__0 ) )
            {
            // InternalGrocery.g:417:2: ( ( rule__NonFoodItem__Group__0 ) )
            // InternalGrocery.g:418:3: ( rule__NonFoodItem__Group__0 )
            {
             before(grammarAccess.getNonFoodItemAccess().getGroup()); 
            // InternalGrocery.g:419:3: ( rule__NonFoodItem__Group__0 )
            // InternalGrocery.g:419:4: rule__NonFoodItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonFoodItem"


    // $ANTLR start "entryRuleDriver"
    // InternalGrocery.g:428:1: entryRuleDriver : ruleDriver EOF ;
    public final void entryRuleDriver() throws RecognitionException {
        try {
            // InternalGrocery.g:429:1: ( ruleDriver EOF )
            // InternalGrocery.g:430:1: ruleDriver EOF
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
    // InternalGrocery.g:437:1: ruleDriver : ( ( rule__Driver__Group__0 ) ) ;
    public final void ruleDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:441:2: ( ( ( rule__Driver__Group__0 ) ) )
            // InternalGrocery.g:442:2: ( ( rule__Driver__Group__0 ) )
            {
            // InternalGrocery.g:442:2: ( ( rule__Driver__Group__0 ) )
            // InternalGrocery.g:443:3: ( rule__Driver__Group__0 )
            {
             before(grammarAccess.getDriverAccess().getGroup()); 
            // InternalGrocery.g:444:3: ( rule__Driver__Group__0 )
            // InternalGrocery.g:444:4: rule__Driver__Group__0
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


    // $ANTLR start "entryRuleEmployee"
    // InternalGrocery.g:453:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // InternalGrocery.g:454:1: ( ruleEmployee EOF )
            // InternalGrocery.g:455:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
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
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalGrocery.g:462:1: ruleEmployee : ( ( rule__Employee__Group__0 ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:466:2: ( ( ( rule__Employee__Group__0 ) ) )
            // InternalGrocery.g:467:2: ( ( rule__Employee__Group__0 ) )
            {
            // InternalGrocery.g:467:2: ( ( rule__Employee__Group__0 ) )
            // InternalGrocery.g:468:3: ( rule__Employee__Group__0 )
            {
             before(grammarAccess.getEmployeeAccess().getGroup()); 
            // InternalGrocery.g:469:3: ( rule__Employee__Group__0 )
            // InternalGrocery.g:469:4: rule__Employee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleCustomer"
    // InternalGrocery.g:478:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // InternalGrocery.g:479:1: ( ruleCustomer EOF )
            // InternalGrocery.g:480:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
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
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalGrocery.g:487:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:491:2: ( ( ( rule__Customer__Group__0 ) ) )
            // InternalGrocery.g:492:2: ( ( rule__Customer__Group__0 ) )
            {
            // InternalGrocery.g:492:2: ( ( rule__Customer__Group__0 ) )
            // InternalGrocery.g:493:3: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // InternalGrocery.g:494:3: ( rule__Customer__Group__0 )
            // InternalGrocery.g:494:4: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleVehicle"
    // InternalGrocery.g:503:1: entryRuleVehicle : ruleVehicle EOF ;
    public final void entryRuleVehicle() throws RecognitionException {
        try {
            // InternalGrocery.g:504:1: ( ruleVehicle EOF )
            // InternalGrocery.g:505:1: ruleVehicle EOF
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
    // InternalGrocery.g:512:1: ruleVehicle : ( ( rule__Vehicle__Group__0 ) ) ;
    public final void ruleVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:516:2: ( ( ( rule__Vehicle__Group__0 ) ) )
            // InternalGrocery.g:517:2: ( ( rule__Vehicle__Group__0 ) )
            {
            // InternalGrocery.g:517:2: ( ( rule__Vehicle__Group__0 ) )
            // InternalGrocery.g:518:3: ( rule__Vehicle__Group__0 )
            {
             before(grammarAccess.getVehicleAccess().getGroup()); 
            // InternalGrocery.g:519:3: ( rule__Vehicle__Group__0 )
            // InternalGrocery.g:519:4: rule__Vehicle__Group__0
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


    // $ANTLR start "entryRuleDelivery"
    // InternalGrocery.g:528:1: entryRuleDelivery : ruleDelivery EOF ;
    public final void entryRuleDelivery() throws RecognitionException {
        try {
            // InternalGrocery.g:529:1: ( ruleDelivery EOF )
            // InternalGrocery.g:530:1: ruleDelivery EOF
            {
             before(grammarAccess.getDeliveryRule()); 
            pushFollow(FOLLOW_1);
            ruleDelivery();

            state._fsp--;

             after(grammarAccess.getDeliveryRule()); 
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
    // $ANTLR end "entryRuleDelivery"


    // $ANTLR start "ruleDelivery"
    // InternalGrocery.g:537:1: ruleDelivery : ( ( rule__Delivery__Group__0 ) ) ;
    public final void ruleDelivery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:541:2: ( ( ( rule__Delivery__Group__0 ) ) )
            // InternalGrocery.g:542:2: ( ( rule__Delivery__Group__0 ) )
            {
            // InternalGrocery.g:542:2: ( ( rule__Delivery__Group__0 ) )
            // InternalGrocery.g:543:3: ( rule__Delivery__Group__0 )
            {
             before(grammarAccess.getDeliveryAccess().getGroup()); 
            // InternalGrocery.g:544:3: ( rule__Delivery__Group__0 )
            // InternalGrocery.g:544:4: rule__Delivery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelivery"


    // $ANTLR start "entryRuleSale"
    // InternalGrocery.g:553:1: entryRuleSale : ruleSale EOF ;
    public final void entryRuleSale() throws RecognitionException {
        try {
            // InternalGrocery.g:554:1: ( ruleSale EOF )
            // InternalGrocery.g:555:1: ruleSale EOF
            {
             before(grammarAccess.getSaleRule()); 
            pushFollow(FOLLOW_1);
            ruleSale();

            state._fsp--;

             after(grammarAccess.getSaleRule()); 
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
    // $ANTLR end "entryRuleSale"


    // $ANTLR start "ruleSale"
    // InternalGrocery.g:562:1: ruleSale : ( ( rule__Sale__Group__0 ) ) ;
    public final void ruleSale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:566:2: ( ( ( rule__Sale__Group__0 ) ) )
            // InternalGrocery.g:567:2: ( ( rule__Sale__Group__0 ) )
            {
            // InternalGrocery.g:567:2: ( ( rule__Sale__Group__0 ) )
            // InternalGrocery.g:568:3: ( rule__Sale__Group__0 )
            {
             before(grammarAccess.getSaleAccess().getGroup()); 
            // InternalGrocery.g:569:3: ( rule__Sale__Group__0 )
            // InternalGrocery.g:569:4: rule__Sale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSale"


    // $ANTLR start "entryRuleStockMovement"
    // InternalGrocery.g:578:1: entryRuleStockMovement : ruleStockMovement EOF ;
    public final void entryRuleStockMovement() throws RecognitionException {
        try {
            // InternalGrocery.g:579:1: ( ruleStockMovement EOF )
            // InternalGrocery.g:580:1: ruleStockMovement EOF
            {
             before(grammarAccess.getStockMovementRule()); 
            pushFollow(FOLLOW_1);
            ruleStockMovement();

            state._fsp--;

             after(grammarAccess.getStockMovementRule()); 
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
    // $ANTLR end "entryRuleStockMovement"


    // $ANTLR start "ruleStockMovement"
    // InternalGrocery.g:587:1: ruleStockMovement : ( ( rule__StockMovement__Group__0 ) ) ;
    public final void ruleStockMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:591:2: ( ( ( rule__StockMovement__Group__0 ) ) )
            // InternalGrocery.g:592:2: ( ( rule__StockMovement__Group__0 ) )
            {
            // InternalGrocery.g:592:2: ( ( rule__StockMovement__Group__0 ) )
            // InternalGrocery.g:593:3: ( rule__StockMovement__Group__0 )
            {
             before(grammarAccess.getStockMovementAccess().getGroup()); 
            // InternalGrocery.g:594:3: ( rule__StockMovement__Group__0 )
            // InternalGrocery.g:594:4: rule__StockMovement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStockMovement"


    // $ANTLR start "entryRuleDECIMAL"
    // InternalGrocery.g:603:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // InternalGrocery.g:604:1: ( ruleDECIMAL EOF )
            // InternalGrocery.g:605:1: ruleDECIMAL EOF
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
    // InternalGrocery.g:612:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:616:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // InternalGrocery.g:617:2: ( ( rule__DECIMAL__Group__0 ) )
            {
            // InternalGrocery.g:617:2: ( ( rule__DECIMAL__Group__0 ) )
            // InternalGrocery.g:618:3: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // InternalGrocery.g:619:3: ( rule__DECIMAL__Group__0 )
            // InternalGrocery.g:619:4: rule__DECIMAL__Group__0
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
    // InternalGrocery.g:628:1: entryRuleDATE : ruleDATE EOF ;
    public final void entryRuleDATE() throws RecognitionException {
        try {
            // InternalGrocery.g:629:1: ( ruleDATE EOF )
            // InternalGrocery.g:630:1: ruleDATE EOF
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
    // InternalGrocery.g:637:1: ruleDATE : ( ( rule__DATE__Group__0 ) ) ;
    public final void ruleDATE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:641:2: ( ( ( rule__DATE__Group__0 ) ) )
            // InternalGrocery.g:642:2: ( ( rule__DATE__Group__0 ) )
            {
            // InternalGrocery.g:642:2: ( ( rule__DATE__Group__0 ) )
            // InternalGrocery.g:643:3: ( rule__DATE__Group__0 )
            {
             before(grammarAccess.getDATEAccess().getGroup()); 
            // InternalGrocery.g:644:3: ( rule__DATE__Group__0 )
            // InternalGrocery.g:644:4: rule__DATE__Group__0
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
    // InternalGrocery.g:653:1: entryRuleADDRESS : ruleADDRESS EOF ;
    public final void entryRuleADDRESS() throws RecognitionException {
        try {
            // InternalGrocery.g:654:1: ( ruleADDRESS EOF )
            // InternalGrocery.g:655:1: ruleADDRESS EOF
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
    // InternalGrocery.g:662:1: ruleADDRESS : ( ( rule__ADDRESS__Group__0 ) ) ;
    public final void ruleADDRESS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:666:2: ( ( ( rule__ADDRESS__Group__0 ) ) )
            // InternalGrocery.g:667:2: ( ( rule__ADDRESS__Group__0 ) )
            {
            // InternalGrocery.g:667:2: ( ( rule__ADDRESS__Group__0 ) )
            // InternalGrocery.g:668:3: ( rule__ADDRESS__Group__0 )
            {
             before(grammarAccess.getADDRESSAccess().getGroup()); 
            // InternalGrocery.g:669:3: ( rule__ADDRESS__Group__0 )
            // InternalGrocery.g:669:4: rule__ADDRESS__Group__0
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
    // InternalGrocery.g:677:1: rule__Building__Alternatives : ( ( ruleStore ) | ( ruleWarehouse ) );
    public final void rule__Building__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:681:1: ( ( ruleStore ) | ( ruleWarehouse ) )
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
                    // InternalGrocery.g:682:2: ( ruleStore )
                    {
                    // InternalGrocery.g:682:2: ( ruleStore )
                    // InternalGrocery.g:683:3: ruleStore
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
                    // InternalGrocery.g:688:2: ( ruleWarehouse )
                    {
                    // InternalGrocery.g:688:2: ( ruleWarehouse )
                    // InternalGrocery.g:689:3: ruleWarehouse
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
    // InternalGrocery.g:698:1: rule__StoreElements__Alternatives : ( ( ruleBackroom ) | ( ruleShelf ) );
    public final void rule__StoreElements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:702:1: ( ( ruleBackroom ) | ( ruleShelf ) )
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
                    // InternalGrocery.g:703:2: ( ruleBackroom )
                    {
                    // InternalGrocery.g:703:2: ( ruleBackroom )
                    // InternalGrocery.g:704:3: ruleBackroom
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
                    // InternalGrocery.g:709:2: ( ruleShelf )
                    {
                    // InternalGrocery.g:709:2: ( ruleShelf )
                    // InternalGrocery.g:710:3: ruleShelf
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


    // $ANTLR start "rule__MovementElement__Alternatives"
    // InternalGrocery.g:719:1: rule__MovementElement__Alternatives : ( ( rulePerson ) | ( ruleVehicle ) );
    public final void rule__MovementElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:723:1: ( ( rulePerson ) | ( ruleVehicle ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25||(LA3_0>=27 && LA3_0<=28)) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGrocery.g:724:2: ( rulePerson )
                    {
                    // InternalGrocery.g:724:2: ( rulePerson )
                    // InternalGrocery.g:725:3: rulePerson
                    {
                     before(grammarAccess.getMovementElementAccess().getPersonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePerson();

                    state._fsp--;

                     after(grammarAccess.getMovementElementAccess().getPersonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:730:2: ( ruleVehicle )
                    {
                    // InternalGrocery.g:730:2: ( ruleVehicle )
                    // InternalGrocery.g:731:3: ruleVehicle
                    {
                     before(grammarAccess.getMovementElementAccess().getVehicleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVehicle();

                    state._fsp--;

                     after(grammarAccess.getMovementElementAccess().getVehicleParserRuleCall_1()); 

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
    // $ANTLR end "rule__MovementElement__Alternatives"


    // $ANTLR start "rule__Person__Alternatives"
    // InternalGrocery.g:740:1: rule__Person__Alternatives : ( ( ruleDriver ) | ( ruleEmployee ) | ( ruleCustomer ) );
    public final void rule__Person__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:744:1: ( ( ruleDriver ) | ( ruleEmployee ) | ( ruleCustomer ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalGrocery.g:745:2: ( ruleDriver )
                    {
                    // InternalGrocery.g:745:2: ( ruleDriver )
                    // InternalGrocery.g:746:3: ruleDriver
                    {
                     before(grammarAccess.getPersonAccess().getDriverParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDriver();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getDriverParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:751:2: ( ruleEmployee )
                    {
                    // InternalGrocery.g:751:2: ( ruleEmployee )
                    // InternalGrocery.g:752:3: ruleEmployee
                    {
                     before(grammarAccess.getPersonAccess().getEmployeeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEmployee();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getEmployeeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrocery.g:757:2: ( ruleCustomer )
                    {
                    // InternalGrocery.g:757:2: ( ruleCustomer )
                    // InternalGrocery.g:758:3: ruleCustomer
                    {
                     before(grammarAccess.getPersonAccess().getCustomerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomer();

                    state._fsp--;

                     after(grammarAccess.getPersonAccess().getCustomerParserRuleCall_2()); 

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
    // $ANTLR end "rule__Person__Alternatives"


    // $ANTLR start "rule__Item__Alternatives"
    // InternalGrocery.g:767:1: rule__Item__Alternatives : ( ( ruleFoodItem ) | ( ruleNonFoodItem ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:771:1: ( ( ruleFoodItem ) | ( ruleNonFoodItem ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19||LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGrocery.g:772:2: ( ruleFoodItem )
                    {
                    // InternalGrocery.g:772:2: ( ruleFoodItem )
                    // InternalGrocery.g:773:3: ruleFoodItem
                    {
                     before(grammarAccess.getItemAccess().getFoodItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFoodItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getFoodItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:778:2: ( ruleNonFoodItem )
                    {
                    // InternalGrocery.g:778:2: ( ruleNonFoodItem )
                    // InternalGrocery.g:779:3: ruleNonFoodItem
                    {
                     before(grammarAccess.getItemAccess().getNonFoodItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonFoodItem();

                    state._fsp--;

                     after(grammarAccess.getItemAccess().getNonFoodItemParserRuleCall_1()); 

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


    // $ANTLR start "rule__FoodItem__Alternatives"
    // InternalGrocery.g:788:1: rule__FoodItem__Alternatives : ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) );
    public final void rule__FoodItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:792:1: ( ( rulePerishableItem ) | ( ruleNonPerishableItem ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGrocery.g:793:2: ( rulePerishableItem )
                    {
                    // InternalGrocery.g:793:2: ( rulePerishableItem )
                    // InternalGrocery.g:794:3: rulePerishableItem
                    {
                     before(grammarAccess.getFoodItemAccess().getPerishableItemParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePerishableItem();

                    state._fsp--;

                     after(grammarAccess.getFoodItemAccess().getPerishableItemParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:799:2: ( ruleNonPerishableItem )
                    {
                    // InternalGrocery.g:799:2: ( ruleNonPerishableItem )
                    // InternalGrocery.g:800:3: ruleNonPerishableItem
                    {
                     before(grammarAccess.getFoodItemAccess().getNonPerishableItemParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNonPerishableItem();

                    state._fsp--;

                     after(grammarAccess.getFoodItemAccess().getNonPerishableItemParserRuleCall_1()); 

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
    // $ANTLR end "rule__FoodItem__Alternatives"


    // $ANTLR start "rule__Movement__Alternatives"
    // InternalGrocery.g:809:1: rule__Movement__Alternatives : ( ( ruleDelivery ) | ( ruleSale ) | ( ruleStockMovement ) );
    public final void rule__Movement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:813:1: ( ( ruleDelivery ) | ( ruleSale ) | ( ruleStockMovement ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGrocery.g:814:2: ( ruleDelivery )
                    {
                    // InternalGrocery.g:814:2: ( ruleDelivery )
                    // InternalGrocery.g:815:3: ruleDelivery
                    {
                     before(grammarAccess.getMovementAccess().getDeliveryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDelivery();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getDeliveryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGrocery.g:820:2: ( ruleSale )
                    {
                    // InternalGrocery.g:820:2: ( ruleSale )
                    // InternalGrocery.g:821:3: ruleSale
                    {
                     before(grammarAccess.getMovementAccess().getSaleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSale();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getSaleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGrocery.g:826:2: ( ruleStockMovement )
                    {
                    // InternalGrocery.g:826:2: ( ruleStockMovement )
                    // InternalGrocery.g:827:3: ruleStockMovement
                    {
                     before(grammarAccess.getMovementAccess().getStockMovementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStockMovement();

                    state._fsp--;

                     after(grammarAccess.getMovementAccess().getStockMovementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Movement__Alternatives"


    // $ANTLR start "rule__Grocery__Group__0"
    // InternalGrocery.g:836:1: rule__Grocery__Group__0 : rule__Grocery__Group__0__Impl rule__Grocery__Group__1 ;
    public final void rule__Grocery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:840:1: ( rule__Grocery__Group__0__Impl rule__Grocery__Group__1 )
            // InternalGrocery.g:841:2: rule__Grocery__Group__0__Impl rule__Grocery__Group__1
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
    // InternalGrocery.g:848:1: rule__Grocery__Group__0__Impl : ( ( rule__Grocery__ElementsAssignment_0 )* ) ;
    public final void rule__Grocery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:852:1: ( ( ( rule__Grocery__ElementsAssignment_0 )* ) )
            // InternalGrocery.g:853:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            {
            // InternalGrocery.g:853:1: ( ( rule__Grocery__ElementsAssignment_0 )* )
            // InternalGrocery.g:854:2: ( rule__Grocery__ElementsAssignment_0 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_0()); 
            // InternalGrocery.g:855:2: ( rule__Grocery__ElementsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11||LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGrocery.g:855:3: rule__Grocery__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Grocery__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalGrocery.g:863:1: rule__Grocery__Group__1 : rule__Grocery__Group__1__Impl rule__Grocery__Group__2 ;
    public final void rule__Grocery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:867:1: ( rule__Grocery__Group__1__Impl rule__Grocery__Group__2 )
            // InternalGrocery.g:868:2: rule__Grocery__Group__1__Impl rule__Grocery__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Grocery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grocery__Group__2();

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
    // InternalGrocery.g:875:1: rule__Grocery__Group__1__Impl : ( ( rule__Grocery__ElementsAssignment_1 )* ) ;
    public final void rule__Grocery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:879:1: ( ( ( rule__Grocery__ElementsAssignment_1 )* ) )
            // InternalGrocery.g:880:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            {
            // InternalGrocery.g:880:1: ( ( rule__Grocery__ElementsAssignment_1 )* )
            // InternalGrocery.g:881:2: ( rule__Grocery__ElementsAssignment_1 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_1()); 
            // InternalGrocery.g:882:2: ( rule__Grocery__ElementsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25||(LA9_0>=27 && LA9_0<=29)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGrocery.g:882:3: rule__Grocery__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Grocery__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "rule__Grocery__Group__2"
    // InternalGrocery.g:890:1: rule__Grocery__Group__2 : rule__Grocery__Group__2__Impl rule__Grocery__Group__3 ;
    public final void rule__Grocery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:894:1: ( rule__Grocery__Group__2__Impl rule__Grocery__Group__3 )
            // InternalGrocery.g:895:2: rule__Grocery__Group__2__Impl rule__Grocery__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Grocery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grocery__Group__3();

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
    // $ANTLR end "rule__Grocery__Group__2"


    // $ANTLR start "rule__Grocery__Group__2__Impl"
    // InternalGrocery.g:902:1: rule__Grocery__Group__2__Impl : ( ( rule__Grocery__ElementsAssignment_2 )* ) ;
    public final void rule__Grocery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:906:1: ( ( ( rule__Grocery__ElementsAssignment_2 )* ) )
            // InternalGrocery.g:907:1: ( ( rule__Grocery__ElementsAssignment_2 )* )
            {
            // InternalGrocery.g:907:1: ( ( rule__Grocery__ElementsAssignment_2 )* )
            // InternalGrocery.g:908:2: ( rule__Grocery__ElementsAssignment_2 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_2()); 
            // InternalGrocery.g:909:2: ( rule__Grocery__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=31 && LA10_0<=33)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGrocery.g:909:3: rule__Grocery__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Grocery__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGroceryAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__Group__2__Impl"


    // $ANTLR start "rule__Grocery__Group__3"
    // InternalGrocery.g:917:1: rule__Grocery__Group__3 : rule__Grocery__Group__3__Impl rule__Grocery__Group__4 ;
    public final void rule__Grocery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:921:1: ( rule__Grocery__Group__3__Impl rule__Grocery__Group__4 )
            // InternalGrocery.g:922:2: rule__Grocery__Group__3__Impl rule__Grocery__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Grocery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grocery__Group__4();

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
    // $ANTLR end "rule__Grocery__Group__3"


    // $ANTLR start "rule__Grocery__Group__3__Impl"
    // InternalGrocery.g:929:1: rule__Grocery__Group__3__Impl : ( ( rule__Grocery__ElementsAssignment_3 )* ) ;
    public final void rule__Grocery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:933:1: ( ( ( rule__Grocery__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:934:1: ( ( rule__Grocery__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:934:1: ( ( rule__Grocery__ElementsAssignment_3 )* )
            // InternalGrocery.g:935:2: ( rule__Grocery__ElementsAssignment_3 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:936:2: ( rule__Grocery__ElementsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||LA11_0==22||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGrocery.g:936:3: rule__Grocery__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Grocery__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGroceryAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__Group__3__Impl"


    // $ANTLR start "rule__Grocery__Group__4"
    // InternalGrocery.g:944:1: rule__Grocery__Group__4 : rule__Grocery__Group__4__Impl ;
    public final void rule__Grocery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:948:1: ( rule__Grocery__Group__4__Impl )
            // InternalGrocery.g:949:2: rule__Grocery__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grocery__Group__4__Impl();

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
    // $ANTLR end "rule__Grocery__Group__4"


    // $ANTLR start "rule__Grocery__Group__4__Impl"
    // InternalGrocery.g:955:1: rule__Grocery__Group__4__Impl : ( ( rule__Grocery__ElementsAssignment_4 )* ) ;
    public final void rule__Grocery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:959:1: ( ( ( rule__Grocery__ElementsAssignment_4 )* ) )
            // InternalGrocery.g:960:1: ( ( rule__Grocery__ElementsAssignment_4 )* )
            {
            // InternalGrocery.g:960:1: ( ( rule__Grocery__ElementsAssignment_4 )* )
            // InternalGrocery.g:961:2: ( rule__Grocery__ElementsAssignment_4 )*
            {
             before(grammarAccess.getGroceryAccess().getElementsAssignment_4()); 
            // InternalGrocery.g:962:2: ( rule__Grocery__ElementsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=17 && LA12_0<=18)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGrocery.g:962:3: rule__Grocery__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Grocery__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGroceryAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__Group__4__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalGrocery.g:971:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:975:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalGrocery.g:976:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:983:1: rule__Store__Group__0__Impl : ( 'store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:987:1: ( ( 'store' ) )
            // InternalGrocery.g:988:1: ( 'store' )
            {
            // InternalGrocery.g:988:1: ( 'store' )
            // InternalGrocery.g:989:2: 'store'
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
    // InternalGrocery.g:998:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1002:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalGrocery.g:1003:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:1010:1: rule__Store__Group__1__Impl : ( ( rule__Store__NameAssignment_1 ) ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1014:1: ( ( ( rule__Store__NameAssignment_1 ) ) )
            // InternalGrocery.g:1015:1: ( ( rule__Store__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1015:1: ( ( rule__Store__NameAssignment_1 ) )
            // InternalGrocery.g:1016:2: ( rule__Store__NameAssignment_1 )
            {
             before(grammarAccess.getStoreAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1017:2: ( rule__Store__NameAssignment_1 )
            // InternalGrocery.g:1017:3: rule__Store__NameAssignment_1
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
    // InternalGrocery.g:1025:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1029:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalGrocery.g:1030:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1037:1: rule__Store__Group__2__Impl : ( '{' ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1041:1: ( ( '{' ) )
            // InternalGrocery.g:1042:1: ( '{' )
            {
            // InternalGrocery.g:1042:1: ( '{' )
            // InternalGrocery.g:1043:2: '{'
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
    // InternalGrocery.g:1052:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1056:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalGrocery.g:1057:2: rule__Store__Group__3__Impl rule__Store__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1064:1: rule__Store__Group__3__Impl : ( ( rule__Store__ElementsAssignment_3 )* ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1068:1: ( ( ( rule__Store__ElementsAssignment_3 )* ) )
            // InternalGrocery.g:1069:1: ( ( rule__Store__ElementsAssignment_3 )* )
            {
            // InternalGrocery.g:1069:1: ( ( rule__Store__ElementsAssignment_3 )* )
            // InternalGrocery.g:1070:2: ( rule__Store__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStoreAccess().getElementsAssignment_3()); 
            // InternalGrocery.g:1071:2: ( rule__Store__ElementsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalGrocery.g:1071:3: rule__Store__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Store__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalGrocery.g:1079:1: rule__Store__Group__4 : rule__Store__Group__4__Impl ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1083:1: ( rule__Store__Group__4__Impl )
            // InternalGrocery.g:1084:2: rule__Store__Group__4__Impl
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
    // InternalGrocery.g:1090:1: rule__Store__Group__4__Impl : ( '}' ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1094:1: ( ( '}' ) )
            // InternalGrocery.g:1095:1: ( '}' )
            {
            // InternalGrocery.g:1095:1: ( '}' )
            // InternalGrocery.g:1096:2: '}'
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
    // InternalGrocery.g:1106:1: rule__Warehouse__Group__0 : rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 ;
    public final void rule__Warehouse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1110:1: ( rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1 )
            // InternalGrocery.g:1111:2: rule__Warehouse__Group__0__Impl rule__Warehouse__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:1118:1: rule__Warehouse__Group__0__Impl : ( 'warehouse' ) ;
    public final void rule__Warehouse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1122:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:1123:1: ( 'warehouse' )
            {
            // InternalGrocery.g:1123:1: ( 'warehouse' )
            // InternalGrocery.g:1124:2: 'warehouse'
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
    // InternalGrocery.g:1133:1: rule__Warehouse__Group__1 : rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 ;
    public final void rule__Warehouse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1137:1: ( rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2 )
            // InternalGrocery.g:1138:2: rule__Warehouse__Group__1__Impl rule__Warehouse__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:1145:1: rule__Warehouse__Group__1__Impl : ( ( rule__Warehouse__NameAssignment_1 ) ) ;
    public final void rule__Warehouse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1149:1: ( ( ( rule__Warehouse__NameAssignment_1 ) ) )
            // InternalGrocery.g:1150:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1150:1: ( ( rule__Warehouse__NameAssignment_1 ) )
            // InternalGrocery.g:1151:2: ( rule__Warehouse__NameAssignment_1 )
            {
             before(grammarAccess.getWarehouseAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1152:2: ( rule__Warehouse__NameAssignment_1 )
            // InternalGrocery.g:1152:3: rule__Warehouse__NameAssignment_1
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
    // InternalGrocery.g:1160:1: rule__Warehouse__Group__2 : rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 ;
    public final void rule__Warehouse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1164:1: ( rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3 )
            // InternalGrocery.g:1165:2: rule__Warehouse__Group__2__Impl rule__Warehouse__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalGrocery.g:1172:1: rule__Warehouse__Group__2__Impl : ( '{' ) ;
    public final void rule__Warehouse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1176:1: ( ( '{' ) )
            // InternalGrocery.g:1177:1: ( '{' )
            {
            // InternalGrocery.g:1177:1: ( '{' )
            // InternalGrocery.g:1178:2: '{'
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
    // InternalGrocery.g:1187:1: rule__Warehouse__Group__3 : rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 ;
    public final void rule__Warehouse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1191:1: ( rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4 )
            // InternalGrocery.g:1192:2: rule__Warehouse__Group__3__Impl rule__Warehouse__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalGrocery.g:1199:1: rule__Warehouse__Group__3__Impl : ( 'address' ) ;
    public final void rule__Warehouse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1203:1: ( ( 'address' ) )
            // InternalGrocery.g:1204:1: ( 'address' )
            {
            // InternalGrocery.g:1204:1: ( 'address' )
            // InternalGrocery.g:1205:2: 'address'
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
    // InternalGrocery.g:1214:1: rule__Warehouse__Group__4 : rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 ;
    public final void rule__Warehouse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1218:1: ( rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5 )
            // InternalGrocery.g:1219:2: rule__Warehouse__Group__4__Impl rule__Warehouse__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1226:1: rule__Warehouse__Group__4__Impl : ( ':' ) ;
    public final void rule__Warehouse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1230:1: ( ( ':' ) )
            // InternalGrocery.g:1231:1: ( ':' )
            {
            // InternalGrocery.g:1231:1: ( ':' )
            // InternalGrocery.g:1232:2: ':'
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
    // InternalGrocery.g:1241:1: rule__Warehouse__Group__5 : rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 ;
    public final void rule__Warehouse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1245:1: ( rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6 )
            // InternalGrocery.g:1246:2: rule__Warehouse__Group__5__Impl rule__Warehouse__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1253:1: rule__Warehouse__Group__5__Impl : ( ( rule__Warehouse__AddressAssignment_5 ) ) ;
    public final void rule__Warehouse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1257:1: ( ( ( rule__Warehouse__AddressAssignment_5 ) ) )
            // InternalGrocery.g:1258:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            {
            // InternalGrocery.g:1258:1: ( ( rule__Warehouse__AddressAssignment_5 ) )
            // InternalGrocery.g:1259:2: ( rule__Warehouse__AddressAssignment_5 )
            {
             before(grammarAccess.getWarehouseAccess().getAddressAssignment_5()); 
            // InternalGrocery.g:1260:2: ( rule__Warehouse__AddressAssignment_5 )
            // InternalGrocery.g:1260:3: rule__Warehouse__AddressAssignment_5
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
    // InternalGrocery.g:1268:1: rule__Warehouse__Group__6 : rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 ;
    public final void rule__Warehouse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1272:1: ( rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7 )
            // InternalGrocery.g:1273:2: rule__Warehouse__Group__6__Impl rule__Warehouse__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:1280:1: rule__Warehouse__Group__6__Impl : ( ( rule__Warehouse__ItemsAssignment_6 )* ) ;
    public final void rule__Warehouse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1284:1: ( ( ( rule__Warehouse__ItemsAssignment_6 )* ) )
            // InternalGrocery.g:1285:1: ( ( rule__Warehouse__ItemsAssignment_6 )* )
            {
            // InternalGrocery.g:1285:1: ( ( rule__Warehouse__ItemsAssignment_6 )* )
            // InternalGrocery.g:1286:2: ( rule__Warehouse__ItemsAssignment_6 )*
            {
             before(grammarAccess.getWarehouseAccess().getItemsAssignment_6()); 
            // InternalGrocery.g:1287:2: ( rule__Warehouse__ItemsAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGrocery.g:1287:3: rule__Warehouse__ItemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Warehouse__ItemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWarehouseAccess().getItemsAssignment_6()); 

            }


            }

        }
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
    // InternalGrocery.g:1295:1: rule__Warehouse__Group__7 : rule__Warehouse__Group__7__Impl ;
    public final void rule__Warehouse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1299:1: ( rule__Warehouse__Group__7__Impl )
            // InternalGrocery.g:1300:2: rule__Warehouse__Group__7__Impl
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
    // InternalGrocery.g:1306:1: rule__Warehouse__Group__7__Impl : ( '}' ) ;
    public final void rule__Warehouse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1310:1: ( ( '}' ) )
            // InternalGrocery.g:1311:1: ( '}' )
            {
            // InternalGrocery.g:1311:1: ( '}' )
            // InternalGrocery.g:1312:2: '}'
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
    // InternalGrocery.g:1322:1: rule__Shelf__Group__0 : rule__Shelf__Group__0__Impl rule__Shelf__Group__1 ;
    public final void rule__Shelf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1326:1: ( rule__Shelf__Group__0__Impl rule__Shelf__Group__1 )
            // InternalGrocery.g:1327:2: rule__Shelf__Group__0__Impl rule__Shelf__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:1334:1: rule__Shelf__Group__0__Impl : ( 'shelf' ) ;
    public final void rule__Shelf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1338:1: ( ( 'shelf' ) )
            // InternalGrocery.g:1339:1: ( 'shelf' )
            {
            // InternalGrocery.g:1339:1: ( 'shelf' )
            // InternalGrocery.g:1340:2: 'shelf'
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
    // InternalGrocery.g:1349:1: rule__Shelf__Group__1 : rule__Shelf__Group__1__Impl rule__Shelf__Group__2 ;
    public final void rule__Shelf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1353:1: ( rule__Shelf__Group__1__Impl rule__Shelf__Group__2 )
            // InternalGrocery.g:1354:2: rule__Shelf__Group__1__Impl rule__Shelf__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:1361:1: rule__Shelf__Group__1__Impl : ( ( rule__Shelf__NameAssignment_1 ) ) ;
    public final void rule__Shelf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1365:1: ( ( ( rule__Shelf__NameAssignment_1 ) ) )
            // InternalGrocery.g:1366:1: ( ( rule__Shelf__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1366:1: ( ( rule__Shelf__NameAssignment_1 ) )
            // InternalGrocery.g:1367:2: ( rule__Shelf__NameAssignment_1 )
            {
             before(grammarAccess.getShelfAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1368:2: ( rule__Shelf__NameAssignment_1 )
            // InternalGrocery.g:1368:3: rule__Shelf__NameAssignment_1
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
    // InternalGrocery.g:1376:1: rule__Shelf__Group__2 : rule__Shelf__Group__2__Impl rule__Shelf__Group__3 ;
    public final void rule__Shelf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1380:1: ( rule__Shelf__Group__2__Impl rule__Shelf__Group__3 )
            // InternalGrocery.g:1381:2: rule__Shelf__Group__2__Impl rule__Shelf__Group__3
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
    // InternalGrocery.g:1388:1: rule__Shelf__Group__2__Impl : ( '{' ) ;
    public final void rule__Shelf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1392:1: ( ( '{' ) )
            // InternalGrocery.g:1393:1: ( '{' )
            {
            // InternalGrocery.g:1393:1: ( '{' )
            // InternalGrocery.g:1394:2: '{'
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
    // InternalGrocery.g:1403:1: rule__Shelf__Group__3 : rule__Shelf__Group__3__Impl rule__Shelf__Group__4 ;
    public final void rule__Shelf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1407:1: ( rule__Shelf__Group__3__Impl rule__Shelf__Group__4 )
            // InternalGrocery.g:1408:2: rule__Shelf__Group__3__Impl rule__Shelf__Group__4
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
    // InternalGrocery.g:1415:1: rule__Shelf__Group__3__Impl : ( ( rule__Shelf__ItemsAssignment_3 )* ) ;
    public final void rule__Shelf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1419:1: ( ( ( rule__Shelf__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:1420:1: ( ( rule__Shelf__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:1420:1: ( ( rule__Shelf__ItemsAssignment_3 )* )
            // InternalGrocery.g:1421:2: ( rule__Shelf__ItemsAssignment_3 )*
            {
             before(grammarAccess.getShelfAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:1422:2: ( rule__Shelf__ItemsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGrocery.g:1422:3: rule__Shelf__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Shelf__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getShelfAccess().getItemsAssignment_3()); 

            }


            }

        }
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
    // InternalGrocery.g:1430:1: rule__Shelf__Group__4 : rule__Shelf__Group__4__Impl ;
    public final void rule__Shelf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1434:1: ( rule__Shelf__Group__4__Impl )
            // InternalGrocery.g:1435:2: rule__Shelf__Group__4__Impl
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
    // InternalGrocery.g:1441:1: rule__Shelf__Group__4__Impl : ( '}' ) ;
    public final void rule__Shelf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1445:1: ( ( '}' ) )
            // InternalGrocery.g:1446:1: ( '}' )
            {
            // InternalGrocery.g:1446:1: ( '}' )
            // InternalGrocery.g:1447:2: '}'
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
    // InternalGrocery.g:1457:1: rule__Backroom__Group__0 : rule__Backroom__Group__0__Impl rule__Backroom__Group__1 ;
    public final void rule__Backroom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1461:1: ( rule__Backroom__Group__0__Impl rule__Backroom__Group__1 )
            // InternalGrocery.g:1462:2: rule__Backroom__Group__0__Impl rule__Backroom__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:1469:1: rule__Backroom__Group__0__Impl : ( 'backroom' ) ;
    public final void rule__Backroom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1473:1: ( ( 'backroom' ) )
            // InternalGrocery.g:1474:1: ( 'backroom' )
            {
            // InternalGrocery.g:1474:1: ( 'backroom' )
            // InternalGrocery.g:1475:2: 'backroom'
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
    // InternalGrocery.g:1484:1: rule__Backroom__Group__1 : rule__Backroom__Group__1__Impl rule__Backroom__Group__2 ;
    public final void rule__Backroom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1488:1: ( rule__Backroom__Group__1__Impl rule__Backroom__Group__2 )
            // InternalGrocery.g:1489:2: rule__Backroom__Group__1__Impl rule__Backroom__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:1496:1: rule__Backroom__Group__1__Impl : ( ( rule__Backroom__NameAssignment_1 ) ) ;
    public final void rule__Backroom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1500:1: ( ( ( rule__Backroom__NameAssignment_1 ) ) )
            // InternalGrocery.g:1501:1: ( ( rule__Backroom__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1501:1: ( ( rule__Backroom__NameAssignment_1 ) )
            // InternalGrocery.g:1502:2: ( rule__Backroom__NameAssignment_1 )
            {
             before(grammarAccess.getBackroomAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1503:2: ( rule__Backroom__NameAssignment_1 )
            // InternalGrocery.g:1503:3: rule__Backroom__NameAssignment_1
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
    // InternalGrocery.g:1511:1: rule__Backroom__Group__2 : rule__Backroom__Group__2__Impl rule__Backroom__Group__3 ;
    public final void rule__Backroom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1515:1: ( rule__Backroom__Group__2__Impl rule__Backroom__Group__3 )
            // InternalGrocery.g:1516:2: rule__Backroom__Group__2__Impl rule__Backroom__Group__3
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
    // InternalGrocery.g:1523:1: rule__Backroom__Group__2__Impl : ( '{' ) ;
    public final void rule__Backroom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1527:1: ( ( '{' ) )
            // InternalGrocery.g:1528:1: ( '{' )
            {
            // InternalGrocery.g:1528:1: ( '{' )
            // InternalGrocery.g:1529:2: '{'
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
    // InternalGrocery.g:1538:1: rule__Backroom__Group__3 : rule__Backroom__Group__3__Impl rule__Backroom__Group__4 ;
    public final void rule__Backroom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1542:1: ( rule__Backroom__Group__3__Impl rule__Backroom__Group__4 )
            // InternalGrocery.g:1543:2: rule__Backroom__Group__3__Impl rule__Backroom__Group__4
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
    // InternalGrocery.g:1550:1: rule__Backroom__Group__3__Impl : ( ( rule__Backroom__ItemsAssignment_3 )* ) ;
    public final void rule__Backroom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1554:1: ( ( ( rule__Backroom__ItemsAssignment_3 )* ) )
            // InternalGrocery.g:1555:1: ( ( rule__Backroom__ItemsAssignment_3 )* )
            {
            // InternalGrocery.g:1555:1: ( ( rule__Backroom__ItemsAssignment_3 )* )
            // InternalGrocery.g:1556:2: ( rule__Backroom__ItemsAssignment_3 )*
            {
             before(grammarAccess.getBackroomAccess().getItemsAssignment_3()); 
            // InternalGrocery.g:1557:2: ( rule__Backroom__ItemsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGrocery.g:1557:3: rule__Backroom__ItemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Backroom__ItemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBackroomAccess().getItemsAssignment_3()); 

            }


            }

        }
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
    // InternalGrocery.g:1565:1: rule__Backroom__Group__4 : rule__Backroom__Group__4__Impl ;
    public final void rule__Backroom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1569:1: ( rule__Backroom__Group__4__Impl )
            // InternalGrocery.g:1570:2: rule__Backroom__Group__4__Impl
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
    // InternalGrocery.g:1576:1: rule__Backroom__Group__4__Impl : ( '}' ) ;
    public final void rule__Backroom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1580:1: ( ( '}' ) )
            // InternalGrocery.g:1581:1: ( '}' )
            {
            // InternalGrocery.g:1581:1: ( '}' )
            // InternalGrocery.g:1582:2: '}'
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
    // InternalGrocery.g:1592:1: rule__NonPerishableItem__Group__0 : rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 ;
    public final void rule__NonPerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1596:1: ( rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1 )
            // InternalGrocery.g:1597:2: rule__NonPerishableItem__Group__0__Impl rule__NonPerishableItem__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:1604:1: rule__NonPerishableItem__Group__0__Impl : ( 'nonPerishableItem' ) ;
    public final void rule__NonPerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1608:1: ( ( 'nonPerishableItem' ) )
            // InternalGrocery.g:1609:1: ( 'nonPerishableItem' )
            {
            // InternalGrocery.g:1609:1: ( 'nonPerishableItem' )
            // InternalGrocery.g:1610:2: 'nonPerishableItem'
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
    // InternalGrocery.g:1619:1: rule__NonPerishableItem__Group__1 : rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 ;
    public final void rule__NonPerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1623:1: ( rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2 )
            // InternalGrocery.g:1624:2: rule__NonPerishableItem__Group__1__Impl rule__NonPerishableItem__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:1631:1: rule__NonPerishableItem__Group__1__Impl : ( ( rule__NonPerishableItem__NameAssignment_1 ) ) ;
    public final void rule__NonPerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1635:1: ( ( ( rule__NonPerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1636:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1636:1: ( ( rule__NonPerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1637:2: ( rule__NonPerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1638:2: ( rule__NonPerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1638:3: rule__NonPerishableItem__NameAssignment_1
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
    // InternalGrocery.g:1646:1: rule__NonPerishableItem__Group__2 : rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 ;
    public final void rule__NonPerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1650:1: ( rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3 )
            // InternalGrocery.g:1651:2: rule__NonPerishableItem__Group__2__Impl rule__NonPerishableItem__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:1658:1: rule__NonPerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__NonPerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1662:1: ( ( '{' ) )
            // InternalGrocery.g:1663:1: ( '{' )
            {
            // InternalGrocery.g:1663:1: ( '{' )
            // InternalGrocery.g:1664:2: '{'
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
    // InternalGrocery.g:1673:1: rule__NonPerishableItem__Group__3 : rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 ;
    public final void rule__NonPerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1677:1: ( rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4 )
            // InternalGrocery.g:1678:2: rule__NonPerishableItem__Group__3__Impl rule__NonPerishableItem__Group__4
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
    // InternalGrocery.g:1685:1: rule__NonPerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__NonPerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1689:1: ( ( 'price' ) )
            // InternalGrocery.g:1690:1: ( 'price' )
            {
            // InternalGrocery.g:1690:1: ( 'price' )
            // InternalGrocery.g:1691:2: 'price'
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
    // InternalGrocery.g:1700:1: rule__NonPerishableItem__Group__4 : rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 ;
    public final void rule__NonPerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1704:1: ( rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5 )
            // InternalGrocery.g:1705:2: rule__NonPerishableItem__Group__4__Impl rule__NonPerishableItem__Group__5
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
    // InternalGrocery.g:1712:1: rule__NonPerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__NonPerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1716:1: ( ( ':' ) )
            // InternalGrocery.g:1717:1: ( ':' )
            {
            // InternalGrocery.g:1717:1: ( ':' )
            // InternalGrocery.g:1718:2: ':'
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
    // InternalGrocery.g:1727:1: rule__NonPerishableItem__Group__5 : rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 ;
    public final void rule__NonPerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1731:1: ( rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6 )
            // InternalGrocery.g:1732:2: rule__NonPerishableItem__Group__5__Impl rule__NonPerishableItem__Group__6
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
    // InternalGrocery.g:1739:1: rule__NonPerishableItem__Group__5__Impl : ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__NonPerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1743:1: ( ( ( rule__NonPerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:1744:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:1744:1: ( ( rule__NonPerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:1745:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:1746:2: ( rule__NonPerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:1746:3: rule__NonPerishableItem__PriceAssignment_5
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
    // InternalGrocery.g:1754:1: rule__NonPerishableItem__Group__6 : rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7 ;
    public final void rule__NonPerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1758:1: ( rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7 )
            // InternalGrocery.g:1759:2: rule__NonPerishableItem__Group__6__Impl rule__NonPerishableItem__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalGrocery.g:1766:1: rule__NonPerishableItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__NonPerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1770:1: ( ( 'quantity' ) )
            // InternalGrocery.g:1771:1: ( 'quantity' )
            {
            // InternalGrocery.g:1771:1: ( 'quantity' )
            // InternalGrocery.g:1772:2: 'quantity'
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
    // InternalGrocery.g:1781:1: rule__NonPerishableItem__Group__7 : rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8 ;
    public final void rule__NonPerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1785:1: ( rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8 )
            // InternalGrocery.g:1786:2: rule__NonPerishableItem__Group__7__Impl rule__NonPerishableItem__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:1793:1: rule__NonPerishableItem__Group__7__Impl : ( ':' ) ;
    public final void rule__NonPerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1797:1: ( ( ':' ) )
            // InternalGrocery.g:1798:1: ( ':' )
            {
            // InternalGrocery.g:1798:1: ( ':' )
            // InternalGrocery.g:1799:2: ':'
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
    // InternalGrocery.g:1808:1: rule__NonPerishableItem__Group__8 : rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9 ;
    public final void rule__NonPerishableItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1812:1: ( rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9 )
            // InternalGrocery.g:1813:2: rule__NonPerishableItem__Group__8__Impl rule__NonPerishableItem__Group__9
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
    // InternalGrocery.g:1820:1: rule__NonPerishableItem__Group__8__Impl : ( ( rule__NonPerishableItem__QuantityAssignment_8 ) ) ;
    public final void rule__NonPerishableItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1824:1: ( ( ( rule__NonPerishableItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:1825:1: ( ( rule__NonPerishableItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:1825:1: ( ( rule__NonPerishableItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:1826:2: ( rule__NonPerishableItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getNonPerishableItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:1827:2: ( rule__NonPerishableItem__QuantityAssignment_8 )
            // InternalGrocery.g:1827:3: rule__NonPerishableItem__QuantityAssignment_8
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
    // InternalGrocery.g:1835:1: rule__NonPerishableItem__Group__9 : rule__NonPerishableItem__Group__9__Impl ;
    public final void rule__NonPerishableItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1839:1: ( rule__NonPerishableItem__Group__9__Impl )
            // InternalGrocery.g:1840:2: rule__NonPerishableItem__Group__9__Impl
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
    // InternalGrocery.g:1846:1: rule__NonPerishableItem__Group__9__Impl : ( '}' ) ;
    public final void rule__NonPerishableItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1850:1: ( ( '}' ) )
            // InternalGrocery.g:1851:1: ( '}' )
            {
            // InternalGrocery.g:1851:1: ( '}' )
            // InternalGrocery.g:1852:2: '}'
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
    // InternalGrocery.g:1862:1: rule__PerishableItem__Group__0 : rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 ;
    public final void rule__PerishableItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1866:1: ( rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1 )
            // InternalGrocery.g:1867:2: rule__PerishableItem__Group__0__Impl rule__PerishableItem__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:1874:1: rule__PerishableItem__Group__0__Impl : ( 'perishableItem' ) ;
    public final void rule__PerishableItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1878:1: ( ( 'perishableItem' ) )
            // InternalGrocery.g:1879:1: ( 'perishableItem' )
            {
            // InternalGrocery.g:1879:1: ( 'perishableItem' )
            // InternalGrocery.g:1880:2: 'perishableItem'
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
    // InternalGrocery.g:1889:1: rule__PerishableItem__Group__1 : rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 ;
    public final void rule__PerishableItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1893:1: ( rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2 )
            // InternalGrocery.g:1894:2: rule__PerishableItem__Group__1__Impl rule__PerishableItem__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:1901:1: rule__PerishableItem__Group__1__Impl : ( ( rule__PerishableItem__NameAssignment_1 ) ) ;
    public final void rule__PerishableItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1905:1: ( ( ( rule__PerishableItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:1906:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:1906:1: ( ( rule__PerishableItem__NameAssignment_1 ) )
            // InternalGrocery.g:1907:2: ( rule__PerishableItem__NameAssignment_1 )
            {
             before(grammarAccess.getPerishableItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:1908:2: ( rule__PerishableItem__NameAssignment_1 )
            // InternalGrocery.g:1908:3: rule__PerishableItem__NameAssignment_1
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
    // InternalGrocery.g:1916:1: rule__PerishableItem__Group__2 : rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 ;
    public final void rule__PerishableItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1920:1: ( rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3 )
            // InternalGrocery.g:1921:2: rule__PerishableItem__Group__2__Impl rule__PerishableItem__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalGrocery.g:1928:1: rule__PerishableItem__Group__2__Impl : ( '{' ) ;
    public final void rule__PerishableItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1932:1: ( ( '{' ) )
            // InternalGrocery.g:1933:1: ( '{' )
            {
            // InternalGrocery.g:1933:1: ( '{' )
            // InternalGrocery.g:1934:2: '{'
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
    // InternalGrocery.g:1943:1: rule__PerishableItem__Group__3 : rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 ;
    public final void rule__PerishableItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1947:1: ( rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4 )
            // InternalGrocery.g:1948:2: rule__PerishableItem__Group__3__Impl rule__PerishableItem__Group__4
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
    // InternalGrocery.g:1955:1: rule__PerishableItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__PerishableItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1959:1: ( ( 'price' ) )
            // InternalGrocery.g:1960:1: ( 'price' )
            {
            // InternalGrocery.g:1960:1: ( 'price' )
            // InternalGrocery.g:1961:2: 'price'
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
    // InternalGrocery.g:1970:1: rule__PerishableItem__Group__4 : rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 ;
    public final void rule__PerishableItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1974:1: ( rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5 )
            // InternalGrocery.g:1975:2: rule__PerishableItem__Group__4__Impl rule__PerishableItem__Group__5
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
    // InternalGrocery.g:1982:1: rule__PerishableItem__Group__4__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:1986:1: ( ( ':' ) )
            // InternalGrocery.g:1987:1: ( ':' )
            {
            // InternalGrocery.g:1987:1: ( ':' )
            // InternalGrocery.g:1988:2: ':'
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
    // InternalGrocery.g:1997:1: rule__PerishableItem__Group__5 : rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 ;
    public final void rule__PerishableItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2001:1: ( rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6 )
            // InternalGrocery.g:2002:2: rule__PerishableItem__Group__5__Impl rule__PerishableItem__Group__6
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
    // InternalGrocery.g:2009:1: rule__PerishableItem__Group__5__Impl : ( ( rule__PerishableItem__PriceAssignment_5 ) ) ;
    public final void rule__PerishableItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2013:1: ( ( ( rule__PerishableItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:2014:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:2014:1: ( ( rule__PerishableItem__PriceAssignment_5 ) )
            // InternalGrocery.g:2015:2: ( rule__PerishableItem__PriceAssignment_5 )
            {
             before(grammarAccess.getPerishableItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:2016:2: ( rule__PerishableItem__PriceAssignment_5 )
            // InternalGrocery.g:2016:3: rule__PerishableItem__PriceAssignment_5
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
    // InternalGrocery.g:2024:1: rule__PerishableItem__Group__6 : rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 ;
    public final void rule__PerishableItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2028:1: ( rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7 )
            // InternalGrocery.g:2029:2: rule__PerishableItem__Group__6__Impl rule__PerishableItem__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalGrocery.g:2036:1: rule__PerishableItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__PerishableItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2040:1: ( ( 'quantity' ) )
            // InternalGrocery.g:2041:1: ( 'quantity' )
            {
            // InternalGrocery.g:2041:1: ( 'quantity' )
            // InternalGrocery.g:2042:2: 'quantity'
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getQuantityKeyword_6()); 

            }


            }

        }
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
    // InternalGrocery.g:2051:1: rule__PerishableItem__Group__7 : rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8 ;
    public final void rule__PerishableItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2055:1: ( rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8 )
            // InternalGrocery.g:2056:2: rule__PerishableItem__Group__7__Impl rule__PerishableItem__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__PerishableItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__8();

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
    // InternalGrocery.g:2063:1: rule__PerishableItem__Group__7__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2067:1: ( ( ':' ) )
            // InternalGrocery.g:2068:1: ( ':' )
            {
            // InternalGrocery.g:2068:1: ( ':' )
            // InternalGrocery.g:2069:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getColonKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__PerishableItem__Group__8"
    // InternalGrocery.g:2078:1: rule__PerishableItem__Group__8 : rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9 ;
    public final void rule__PerishableItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2082:1: ( rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9 )
            // InternalGrocery.g:2083:2: rule__PerishableItem__Group__8__Impl rule__PerishableItem__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__PerishableItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__9();

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
    // $ANTLR end "rule__PerishableItem__Group__8"


    // $ANTLR start "rule__PerishableItem__Group__8__Impl"
    // InternalGrocery.g:2090:1: rule__PerishableItem__Group__8__Impl : ( ( rule__PerishableItem__QuantityAssignment_8 ) ) ;
    public final void rule__PerishableItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2094:1: ( ( ( rule__PerishableItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:2095:1: ( ( rule__PerishableItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:2095:1: ( ( rule__PerishableItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:2096:2: ( rule__PerishableItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:2097:2: ( rule__PerishableItem__QuantityAssignment_8 )
            // InternalGrocery.g:2097:3: rule__PerishableItem__QuantityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__QuantityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getQuantityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__8__Impl"


    // $ANTLR start "rule__PerishableItem__Group__9"
    // InternalGrocery.g:2105:1: rule__PerishableItem__Group__9 : rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10 ;
    public final void rule__PerishableItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2109:1: ( rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10 )
            // InternalGrocery.g:2110:2: rule__PerishableItem__Group__9__Impl rule__PerishableItem__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__PerishableItem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__10();

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
    // $ANTLR end "rule__PerishableItem__Group__9"


    // $ANTLR start "rule__PerishableItem__Group__9__Impl"
    // InternalGrocery.g:2117:1: rule__PerishableItem__Group__9__Impl : ( 'experationDate' ) ;
    public final void rule__PerishableItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2121:1: ( ( 'experationDate' ) )
            // InternalGrocery.g:2122:1: ( 'experationDate' )
            {
            // InternalGrocery.g:2122:1: ( 'experationDate' )
            // InternalGrocery.g:2123:2: 'experationDate'
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getExperationDateKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__9__Impl"


    // $ANTLR start "rule__PerishableItem__Group__10"
    // InternalGrocery.g:2132:1: rule__PerishableItem__Group__10 : rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11 ;
    public final void rule__PerishableItem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2136:1: ( rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11 )
            // InternalGrocery.g:2137:2: rule__PerishableItem__Group__10__Impl rule__PerishableItem__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__PerishableItem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__11();

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
    // $ANTLR end "rule__PerishableItem__Group__10"


    // $ANTLR start "rule__PerishableItem__Group__10__Impl"
    // InternalGrocery.g:2144:1: rule__PerishableItem__Group__10__Impl : ( ':' ) ;
    public final void rule__PerishableItem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2148:1: ( ( ':' ) )
            // InternalGrocery.g:2149:1: ( ':' )
            {
            // InternalGrocery.g:2149:1: ( ':' )
            // InternalGrocery.g:2150:2: ':'
            {
             before(grammarAccess.getPerishableItemAccess().getColonKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__10__Impl"


    // $ANTLR start "rule__PerishableItem__Group__11"
    // InternalGrocery.g:2159:1: rule__PerishableItem__Group__11 : rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12 ;
    public final void rule__PerishableItem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2163:1: ( rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12 )
            // InternalGrocery.g:2164:2: rule__PerishableItem__Group__11__Impl rule__PerishableItem__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__PerishableItem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__12();

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
    // $ANTLR end "rule__PerishableItem__Group__11"


    // $ANTLR start "rule__PerishableItem__Group__11__Impl"
    // InternalGrocery.g:2171:1: rule__PerishableItem__Group__11__Impl : ( ( rule__PerishableItem__ExperationDateAssignment_11 ) ) ;
    public final void rule__PerishableItem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2175:1: ( ( ( rule__PerishableItem__ExperationDateAssignment_11 ) ) )
            // InternalGrocery.g:2176:1: ( ( rule__PerishableItem__ExperationDateAssignment_11 ) )
            {
            // InternalGrocery.g:2176:1: ( ( rule__PerishableItem__ExperationDateAssignment_11 ) )
            // InternalGrocery.g:2177:2: ( rule__PerishableItem__ExperationDateAssignment_11 )
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_11()); 
            // InternalGrocery.g:2178:2: ( rule__PerishableItem__ExperationDateAssignment_11 )
            // InternalGrocery.g:2178:3: rule__PerishableItem__ExperationDateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__ExperationDateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPerishableItemAccess().getExperationDateAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__11__Impl"


    // $ANTLR start "rule__PerishableItem__Group__12"
    // InternalGrocery.g:2186:1: rule__PerishableItem__Group__12 : rule__PerishableItem__Group__12__Impl ;
    public final void rule__PerishableItem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2190:1: ( rule__PerishableItem__Group__12__Impl )
            // InternalGrocery.g:2191:2: rule__PerishableItem__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PerishableItem__Group__12__Impl();

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
    // $ANTLR end "rule__PerishableItem__Group__12"


    // $ANTLR start "rule__PerishableItem__Group__12__Impl"
    // InternalGrocery.g:2197:1: rule__PerishableItem__Group__12__Impl : ( '}' ) ;
    public final void rule__PerishableItem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2201:1: ( ( '}' ) )
            // InternalGrocery.g:2202:1: ( '}' )
            {
            // InternalGrocery.g:2202:1: ( '}' )
            // InternalGrocery.g:2203:2: '}'
            {
             before(grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__Group__12__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__0"
    // InternalGrocery.g:2213:1: rule__NonFoodItem__Group__0 : rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1 ;
    public final void rule__NonFoodItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2217:1: ( rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1 )
            // InternalGrocery.g:2218:2: rule__NonFoodItem__Group__0__Impl rule__NonFoodItem__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NonFoodItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__1();

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
    // $ANTLR end "rule__NonFoodItem__Group__0"


    // $ANTLR start "rule__NonFoodItem__Group__0__Impl"
    // InternalGrocery.g:2225:1: rule__NonFoodItem__Group__0__Impl : ( 'nonFoodItem' ) ;
    public final void rule__NonFoodItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2229:1: ( ( 'nonFoodItem' ) )
            // InternalGrocery.g:2230:1: ( 'nonFoodItem' )
            {
            // InternalGrocery.g:2230:1: ( 'nonFoodItem' )
            // InternalGrocery.g:2231:2: 'nonFoodItem'
            {
             before(grammarAccess.getNonFoodItemAccess().getNonFoodItemKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getNonFoodItemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__0__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__1"
    // InternalGrocery.g:2240:1: rule__NonFoodItem__Group__1 : rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2 ;
    public final void rule__NonFoodItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2244:1: ( rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2 )
            // InternalGrocery.g:2245:2: rule__NonFoodItem__Group__1__Impl rule__NonFoodItem__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__NonFoodItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__2();

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
    // $ANTLR end "rule__NonFoodItem__Group__1"


    // $ANTLR start "rule__NonFoodItem__Group__1__Impl"
    // InternalGrocery.g:2252:1: rule__NonFoodItem__Group__1__Impl : ( ( rule__NonFoodItem__NameAssignment_1 ) ) ;
    public final void rule__NonFoodItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2256:1: ( ( ( rule__NonFoodItem__NameAssignment_1 ) ) )
            // InternalGrocery.g:2257:1: ( ( rule__NonFoodItem__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2257:1: ( ( rule__NonFoodItem__NameAssignment_1 ) )
            // InternalGrocery.g:2258:2: ( rule__NonFoodItem__NameAssignment_1 )
            {
             before(grammarAccess.getNonFoodItemAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2259:2: ( rule__NonFoodItem__NameAssignment_1 )
            // InternalGrocery.g:2259:3: rule__NonFoodItem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__1__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__2"
    // InternalGrocery.g:2267:1: rule__NonFoodItem__Group__2 : rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3 ;
    public final void rule__NonFoodItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2271:1: ( rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3 )
            // InternalGrocery.g:2272:2: rule__NonFoodItem__Group__2__Impl rule__NonFoodItem__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__NonFoodItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__3();

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
    // $ANTLR end "rule__NonFoodItem__Group__2"


    // $ANTLR start "rule__NonFoodItem__Group__2__Impl"
    // InternalGrocery.g:2279:1: rule__NonFoodItem__Group__2__Impl : ( '{' ) ;
    public final void rule__NonFoodItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2283:1: ( ( '{' ) )
            // InternalGrocery.g:2284:1: ( '{' )
            {
            // InternalGrocery.g:2284:1: ( '{' )
            // InternalGrocery.g:2285:2: '{'
            {
             before(grammarAccess.getNonFoodItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__2__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__3"
    // InternalGrocery.g:2294:1: rule__NonFoodItem__Group__3 : rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4 ;
    public final void rule__NonFoodItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2298:1: ( rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4 )
            // InternalGrocery.g:2299:2: rule__NonFoodItem__Group__3__Impl rule__NonFoodItem__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__NonFoodItem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__4();

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
    // $ANTLR end "rule__NonFoodItem__Group__3"


    // $ANTLR start "rule__NonFoodItem__Group__3__Impl"
    // InternalGrocery.g:2306:1: rule__NonFoodItem__Group__3__Impl : ( 'price' ) ;
    public final void rule__NonFoodItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2310:1: ( ( 'price' ) )
            // InternalGrocery.g:2311:1: ( 'price' )
            {
            // InternalGrocery.g:2311:1: ( 'price' )
            // InternalGrocery.g:2312:2: 'price'
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getPriceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__3__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__4"
    // InternalGrocery.g:2321:1: rule__NonFoodItem__Group__4 : rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5 ;
    public final void rule__NonFoodItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2325:1: ( rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5 )
            // InternalGrocery.g:2326:2: rule__NonFoodItem__Group__4__Impl rule__NonFoodItem__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__NonFoodItem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__5();

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
    // $ANTLR end "rule__NonFoodItem__Group__4"


    // $ANTLR start "rule__NonFoodItem__Group__4__Impl"
    // InternalGrocery.g:2333:1: rule__NonFoodItem__Group__4__Impl : ( ':' ) ;
    public final void rule__NonFoodItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2337:1: ( ( ':' ) )
            // InternalGrocery.g:2338:1: ( ':' )
            {
            // InternalGrocery.g:2338:1: ( ':' )
            // InternalGrocery.g:2339:2: ':'
            {
             before(grammarAccess.getNonFoodItemAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__4__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__5"
    // InternalGrocery.g:2348:1: rule__NonFoodItem__Group__5 : rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6 ;
    public final void rule__NonFoodItem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2352:1: ( rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6 )
            // InternalGrocery.g:2353:2: rule__NonFoodItem__Group__5__Impl rule__NonFoodItem__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__NonFoodItem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__6();

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
    // $ANTLR end "rule__NonFoodItem__Group__5"


    // $ANTLR start "rule__NonFoodItem__Group__5__Impl"
    // InternalGrocery.g:2360:1: rule__NonFoodItem__Group__5__Impl : ( ( rule__NonFoodItem__PriceAssignment_5 ) ) ;
    public final void rule__NonFoodItem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2364:1: ( ( ( rule__NonFoodItem__PriceAssignment_5 ) ) )
            // InternalGrocery.g:2365:1: ( ( rule__NonFoodItem__PriceAssignment_5 ) )
            {
            // InternalGrocery.g:2365:1: ( ( rule__NonFoodItem__PriceAssignment_5 ) )
            // InternalGrocery.g:2366:2: ( rule__NonFoodItem__PriceAssignment_5 )
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceAssignment_5()); 
            // InternalGrocery.g:2367:2: ( rule__NonFoodItem__PriceAssignment_5 )
            // InternalGrocery.g:2367:3: rule__NonFoodItem__PriceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__PriceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getPriceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__5__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__6"
    // InternalGrocery.g:2375:1: rule__NonFoodItem__Group__6 : rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7 ;
    public final void rule__NonFoodItem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2379:1: ( rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7 )
            // InternalGrocery.g:2380:2: rule__NonFoodItem__Group__6__Impl rule__NonFoodItem__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__NonFoodItem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__7();

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
    // $ANTLR end "rule__NonFoodItem__Group__6"


    // $ANTLR start "rule__NonFoodItem__Group__6__Impl"
    // InternalGrocery.g:2387:1: rule__NonFoodItem__Group__6__Impl : ( 'quantity' ) ;
    public final void rule__NonFoodItem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2391:1: ( ( 'quantity' ) )
            // InternalGrocery.g:2392:1: ( 'quantity' )
            {
            // InternalGrocery.g:2392:1: ( 'quantity' )
            // InternalGrocery.g:2393:2: 'quantity'
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getQuantityKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__6__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__7"
    // InternalGrocery.g:2402:1: rule__NonFoodItem__Group__7 : rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8 ;
    public final void rule__NonFoodItem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2406:1: ( rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8 )
            // InternalGrocery.g:2407:2: rule__NonFoodItem__Group__7__Impl rule__NonFoodItem__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__NonFoodItem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__8();

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
    // $ANTLR end "rule__NonFoodItem__Group__7"


    // $ANTLR start "rule__NonFoodItem__Group__7__Impl"
    // InternalGrocery.g:2414:1: rule__NonFoodItem__Group__7__Impl : ( ':' ) ;
    public final void rule__NonFoodItem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2418:1: ( ( ':' ) )
            // InternalGrocery.g:2419:1: ( ':' )
            {
            // InternalGrocery.g:2419:1: ( ':' )
            // InternalGrocery.g:2420:2: ':'
            {
             before(grammarAccess.getNonFoodItemAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__7__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__8"
    // InternalGrocery.g:2429:1: rule__NonFoodItem__Group__8 : rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9 ;
    public final void rule__NonFoodItem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2433:1: ( rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9 )
            // InternalGrocery.g:2434:2: rule__NonFoodItem__Group__8__Impl rule__NonFoodItem__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__NonFoodItem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__9();

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
    // $ANTLR end "rule__NonFoodItem__Group__8"


    // $ANTLR start "rule__NonFoodItem__Group__8__Impl"
    // InternalGrocery.g:2441:1: rule__NonFoodItem__Group__8__Impl : ( ( rule__NonFoodItem__QuantityAssignment_8 ) ) ;
    public final void rule__NonFoodItem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2445:1: ( ( ( rule__NonFoodItem__QuantityAssignment_8 ) ) )
            // InternalGrocery.g:2446:1: ( ( rule__NonFoodItem__QuantityAssignment_8 ) )
            {
            // InternalGrocery.g:2446:1: ( ( rule__NonFoodItem__QuantityAssignment_8 ) )
            // InternalGrocery.g:2447:2: ( rule__NonFoodItem__QuantityAssignment_8 )
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityAssignment_8()); 
            // InternalGrocery.g:2448:2: ( rule__NonFoodItem__QuantityAssignment_8 )
            // InternalGrocery.g:2448:3: rule__NonFoodItem__QuantityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__QuantityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNonFoodItemAccess().getQuantityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__8__Impl"


    // $ANTLR start "rule__NonFoodItem__Group__9"
    // InternalGrocery.g:2456:1: rule__NonFoodItem__Group__9 : rule__NonFoodItem__Group__9__Impl ;
    public final void rule__NonFoodItem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2460:1: ( rule__NonFoodItem__Group__9__Impl )
            // InternalGrocery.g:2461:2: rule__NonFoodItem__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonFoodItem__Group__9__Impl();

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
    // $ANTLR end "rule__NonFoodItem__Group__9"


    // $ANTLR start "rule__NonFoodItem__Group__9__Impl"
    // InternalGrocery.g:2467:1: rule__NonFoodItem__Group__9__Impl : ( '}' ) ;
    public final void rule__NonFoodItem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2471:1: ( ( '}' ) )
            // InternalGrocery.g:2472:1: ( '}' )
            {
            // InternalGrocery.g:2472:1: ( '}' )
            // InternalGrocery.g:2473:2: '}'
            {
             before(grammarAccess.getNonFoodItemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__Group__9__Impl"


    // $ANTLR start "rule__Driver__Group__0"
    // InternalGrocery.g:2483:1: rule__Driver__Group__0 : rule__Driver__Group__0__Impl rule__Driver__Group__1 ;
    public final void rule__Driver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2487:1: ( rule__Driver__Group__0__Impl rule__Driver__Group__1 )
            // InternalGrocery.g:2488:2: rule__Driver__Group__0__Impl rule__Driver__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:2495:1: rule__Driver__Group__0__Impl : ( 'driver' ) ;
    public final void rule__Driver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2499:1: ( ( 'driver' ) )
            // InternalGrocery.g:2500:1: ( 'driver' )
            {
            // InternalGrocery.g:2500:1: ( 'driver' )
            // InternalGrocery.g:2501:2: 'driver'
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
    // InternalGrocery.g:2510:1: rule__Driver__Group__1 : rule__Driver__Group__1__Impl rule__Driver__Group__2 ;
    public final void rule__Driver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2514:1: ( rule__Driver__Group__1__Impl rule__Driver__Group__2 )
            // InternalGrocery.g:2515:2: rule__Driver__Group__1__Impl rule__Driver__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:2522:1: rule__Driver__Group__1__Impl : ( ( rule__Driver__NameAssignment_1 ) ) ;
    public final void rule__Driver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2526:1: ( ( ( rule__Driver__NameAssignment_1 ) ) )
            // InternalGrocery.g:2527:1: ( ( rule__Driver__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2527:1: ( ( rule__Driver__NameAssignment_1 ) )
            // InternalGrocery.g:2528:2: ( rule__Driver__NameAssignment_1 )
            {
             before(grammarAccess.getDriverAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2529:2: ( rule__Driver__NameAssignment_1 )
            // InternalGrocery.g:2529:3: rule__Driver__NameAssignment_1
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
    // InternalGrocery.g:2537:1: rule__Driver__Group__2 : rule__Driver__Group__2__Impl rule__Driver__Group__3 ;
    public final void rule__Driver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2541:1: ( rule__Driver__Group__2__Impl rule__Driver__Group__3 )
            // InternalGrocery.g:2542:2: rule__Driver__Group__2__Impl rule__Driver__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalGrocery.g:2549:1: rule__Driver__Group__2__Impl : ( '{' ) ;
    public final void rule__Driver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2553:1: ( ( '{' ) )
            // InternalGrocery.g:2554:1: ( '{' )
            {
            // InternalGrocery.g:2554:1: ( '{' )
            // InternalGrocery.g:2555:2: '{'
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
    // InternalGrocery.g:2564:1: rule__Driver__Group__3 : rule__Driver__Group__3__Impl rule__Driver__Group__4 ;
    public final void rule__Driver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2568:1: ( rule__Driver__Group__3__Impl rule__Driver__Group__4 )
            // InternalGrocery.g:2569:2: rule__Driver__Group__3__Impl rule__Driver__Group__4
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
    // InternalGrocery.g:2576:1: rule__Driver__Group__3__Impl : ( 'name' ) ;
    public final void rule__Driver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2580:1: ( ( 'name' ) )
            // InternalGrocery.g:2581:1: ( 'name' )
            {
            // InternalGrocery.g:2581:1: ( 'name' )
            // InternalGrocery.g:2582:2: 'name'
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
    // InternalGrocery.g:2591:1: rule__Driver__Group__4 : rule__Driver__Group__4__Impl rule__Driver__Group__5 ;
    public final void rule__Driver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2595:1: ( rule__Driver__Group__4__Impl rule__Driver__Group__5 )
            // InternalGrocery.g:2596:2: rule__Driver__Group__4__Impl rule__Driver__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:2603:1: rule__Driver__Group__4__Impl : ( ':' ) ;
    public final void rule__Driver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2607:1: ( ( ':' ) )
            // InternalGrocery.g:2608:1: ( ':' )
            {
            // InternalGrocery.g:2608:1: ( ':' )
            // InternalGrocery.g:2609:2: ':'
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
    // InternalGrocery.g:2618:1: rule__Driver__Group__5 : rule__Driver__Group__5__Impl rule__Driver__Group__6 ;
    public final void rule__Driver__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2622:1: ( rule__Driver__Group__5__Impl rule__Driver__Group__6 )
            // InternalGrocery.g:2623:2: rule__Driver__Group__5__Impl rule__Driver__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:2630:1: rule__Driver__Group__5__Impl : ( ( rule__Driver__DriverNameAssignment_5 ) ) ;
    public final void rule__Driver__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2634:1: ( ( ( rule__Driver__DriverNameAssignment_5 ) ) )
            // InternalGrocery.g:2635:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            {
            // InternalGrocery.g:2635:1: ( ( rule__Driver__DriverNameAssignment_5 ) )
            // InternalGrocery.g:2636:2: ( rule__Driver__DriverNameAssignment_5 )
            {
             before(grammarAccess.getDriverAccess().getDriverNameAssignment_5()); 
            // InternalGrocery.g:2637:2: ( rule__Driver__DriverNameAssignment_5 )
            // InternalGrocery.g:2637:3: rule__Driver__DriverNameAssignment_5
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
    // InternalGrocery.g:2645:1: rule__Driver__Group__6 : rule__Driver__Group__6__Impl rule__Driver__Group__7 ;
    public final void rule__Driver__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2649:1: ( rule__Driver__Group__6__Impl rule__Driver__Group__7 )
            // InternalGrocery.g:2650:2: rule__Driver__Group__6__Impl rule__Driver__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Driver__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Driver__Group__7();

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
    // InternalGrocery.g:2657:1: rule__Driver__Group__6__Impl : ( ( rule__Driver__VehicleAssignment_6 )* ) ;
    public final void rule__Driver__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2661:1: ( ( ( rule__Driver__VehicleAssignment_6 )* ) )
            // InternalGrocery.g:2662:1: ( ( rule__Driver__VehicleAssignment_6 )* )
            {
            // InternalGrocery.g:2662:1: ( ( rule__Driver__VehicleAssignment_6 )* )
            // InternalGrocery.g:2663:2: ( rule__Driver__VehicleAssignment_6 )*
            {
             before(grammarAccess.getDriverAccess().getVehicleAssignment_6()); 
            // InternalGrocery.g:2664:2: ( rule__Driver__VehicleAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGrocery.g:2664:3: rule__Driver__VehicleAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Driver__VehicleAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDriverAccess().getVehicleAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Driver__Group__7"
    // InternalGrocery.g:2672:1: rule__Driver__Group__7 : rule__Driver__Group__7__Impl ;
    public final void rule__Driver__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2676:1: ( rule__Driver__Group__7__Impl )
            // InternalGrocery.g:2677:2: rule__Driver__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Driver__Group__7__Impl();

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
    // $ANTLR end "rule__Driver__Group__7"


    // $ANTLR start "rule__Driver__Group__7__Impl"
    // InternalGrocery.g:2683:1: rule__Driver__Group__7__Impl : ( '}' ) ;
    public final void rule__Driver__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2687:1: ( ( '}' ) )
            // InternalGrocery.g:2688:1: ( '}' )
            {
            // InternalGrocery.g:2688:1: ( '}' )
            // InternalGrocery.g:2689:2: '}'
            {
             before(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__Group__7__Impl"


    // $ANTLR start "rule__Employee__Group__0"
    // InternalGrocery.g:2699:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2703:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalGrocery.g:2704:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Employee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__1();

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
    // $ANTLR end "rule__Employee__Group__0"


    // $ANTLR start "rule__Employee__Group__0__Impl"
    // InternalGrocery.g:2711:1: rule__Employee__Group__0__Impl : ( 'employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2715:1: ( ( 'employee' ) )
            // InternalGrocery.g:2716:1: ( 'employee' )
            {
            // InternalGrocery.g:2716:1: ( 'employee' )
            // InternalGrocery.g:2717:2: 'employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0__Impl"


    // $ANTLR start "rule__Employee__Group__1"
    // InternalGrocery.g:2726:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2730:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalGrocery.g:2731:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Employee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__2();

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
    // $ANTLR end "rule__Employee__Group__1"


    // $ANTLR start "rule__Employee__Group__1__Impl"
    // InternalGrocery.g:2738:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2742:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalGrocery.g:2743:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2743:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalGrocery.g:2744:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2745:2: ( rule__Employee__NameAssignment_1 )
            // InternalGrocery.g:2745:3: rule__Employee__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1__Impl"


    // $ANTLR start "rule__Employee__Group__2"
    // InternalGrocery.g:2753:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2757:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalGrocery.g:2758:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Employee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__3();

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
    // $ANTLR end "rule__Employee__Group__2"


    // $ANTLR start "rule__Employee__Group__2__Impl"
    // InternalGrocery.g:2765:1: rule__Employee__Group__2__Impl : ( '{' ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2769:1: ( ( '{' ) )
            // InternalGrocery.g:2770:1: ( '{' )
            {
            // InternalGrocery.g:2770:1: ( '{' )
            // InternalGrocery.g:2771:2: '{'
            {
             before(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2__Impl"


    // $ANTLR start "rule__Employee__Group__3"
    // InternalGrocery.g:2780:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl rule__Employee__Group__4 ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2784:1: ( rule__Employee__Group__3__Impl rule__Employee__Group__4 )
            // InternalGrocery.g:2785:2: rule__Employee__Group__3__Impl rule__Employee__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Employee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__4();

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
    // $ANTLR end "rule__Employee__Group__3"


    // $ANTLR start "rule__Employee__Group__3__Impl"
    // InternalGrocery.g:2792:1: rule__Employee__Group__3__Impl : ( 'name' ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2796:1: ( ( 'name' ) )
            // InternalGrocery.g:2797:1: ( 'name' )
            {
            // InternalGrocery.g:2797:1: ( 'name' )
            // InternalGrocery.g:2798:2: 'name'
            {
             before(grammarAccess.getEmployeeAccess().getNameKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group__4"
    // InternalGrocery.g:2807:1: rule__Employee__Group__4 : rule__Employee__Group__4__Impl rule__Employee__Group__5 ;
    public final void rule__Employee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2811:1: ( rule__Employee__Group__4__Impl rule__Employee__Group__5 )
            // InternalGrocery.g:2812:2: rule__Employee__Group__4__Impl rule__Employee__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Employee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__5();

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
    // $ANTLR end "rule__Employee__Group__4"


    // $ANTLR start "rule__Employee__Group__4__Impl"
    // InternalGrocery.g:2819:1: rule__Employee__Group__4__Impl : ( ':' ) ;
    public final void rule__Employee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2823:1: ( ( ':' ) )
            // InternalGrocery.g:2824:1: ( ':' )
            {
            // InternalGrocery.g:2824:1: ( ':' )
            // InternalGrocery.g:2825:2: ':'
            {
             before(grammarAccess.getEmployeeAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4__Impl"


    // $ANTLR start "rule__Employee__Group__5"
    // InternalGrocery.g:2834:1: rule__Employee__Group__5 : rule__Employee__Group__5__Impl rule__Employee__Group__6 ;
    public final void rule__Employee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2838:1: ( rule__Employee__Group__5__Impl rule__Employee__Group__6 )
            // InternalGrocery.g:2839:2: rule__Employee__Group__5__Impl rule__Employee__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Employee__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__6();

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
    // $ANTLR end "rule__Employee__Group__5"


    // $ANTLR start "rule__Employee__Group__5__Impl"
    // InternalGrocery.g:2846:1: rule__Employee__Group__5__Impl : ( ( rule__Employee__EmployeeNameAssignment_5 ) ) ;
    public final void rule__Employee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2850:1: ( ( ( rule__Employee__EmployeeNameAssignment_5 ) ) )
            // InternalGrocery.g:2851:1: ( ( rule__Employee__EmployeeNameAssignment_5 ) )
            {
            // InternalGrocery.g:2851:1: ( ( rule__Employee__EmployeeNameAssignment_5 ) )
            // InternalGrocery.g:2852:2: ( rule__Employee__EmployeeNameAssignment_5 )
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeNameAssignment_5()); 
            // InternalGrocery.g:2853:2: ( rule__Employee__EmployeeNameAssignment_5 )
            // InternalGrocery.g:2853:3: rule__Employee__EmployeeNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Employee__EmployeeNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getEmployeeNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5__Impl"


    // $ANTLR start "rule__Employee__Group__6"
    // InternalGrocery.g:2861:1: rule__Employee__Group__6 : rule__Employee__Group__6__Impl rule__Employee__Group__7 ;
    public final void rule__Employee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2865:1: ( rule__Employee__Group__6__Impl rule__Employee__Group__7 )
            // InternalGrocery.g:2866:2: rule__Employee__Group__6__Impl rule__Employee__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Employee__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__7();

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
    // $ANTLR end "rule__Employee__Group__6"


    // $ANTLR start "rule__Employee__Group__6__Impl"
    // InternalGrocery.g:2873:1: rule__Employee__Group__6__Impl : ( ( rule__Employee__StockMovementAssignment_6 )* ) ;
    public final void rule__Employee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2877:1: ( ( ( rule__Employee__StockMovementAssignment_6 )* ) )
            // InternalGrocery.g:2878:1: ( ( rule__Employee__StockMovementAssignment_6 )* )
            {
            // InternalGrocery.g:2878:1: ( ( rule__Employee__StockMovementAssignment_6 )* )
            // InternalGrocery.g:2879:2: ( rule__Employee__StockMovementAssignment_6 )*
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementAssignment_6()); 
            // InternalGrocery.g:2880:2: ( rule__Employee__StockMovementAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGrocery.g:2880:3: rule__Employee__StockMovementAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Employee__StockMovementAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEmployeeAccess().getStockMovementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6__Impl"


    // $ANTLR start "rule__Employee__Group__7"
    // InternalGrocery.g:2888:1: rule__Employee__Group__7 : rule__Employee__Group__7__Impl ;
    public final void rule__Employee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2892:1: ( rule__Employee__Group__7__Impl )
            // InternalGrocery.g:2893:2: rule__Employee__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__7__Impl();

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
    // $ANTLR end "rule__Employee__Group__7"


    // $ANTLR start "rule__Employee__Group__7__Impl"
    // InternalGrocery.g:2899:1: rule__Employee__Group__7__Impl : ( '}' ) ;
    public final void rule__Employee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2903:1: ( ( '}' ) )
            // InternalGrocery.g:2904:1: ( '}' )
            {
            // InternalGrocery.g:2904:1: ( '}' )
            // InternalGrocery.g:2905:2: '}'
            {
             before(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__7__Impl"


    // $ANTLR start "rule__Customer__Group__0"
    // InternalGrocery.g:2915:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2919:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalGrocery.g:2920:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__1();

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
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // InternalGrocery.g:2927:1: rule__Customer__Group__0__Impl : ( 'customer' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2931:1: ( ( 'customer' ) )
            // InternalGrocery.g:2932:1: ( 'customer' )
            {
            // InternalGrocery.g:2932:1: ( 'customer' )
            // InternalGrocery.g:2933:2: 'customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // InternalGrocery.g:2942:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2946:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalGrocery.g:2947:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__2();

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
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // InternalGrocery.g:2954:1: rule__Customer__Group__1__Impl : ( ( rule__Customer__NameAssignment_1 ) ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2958:1: ( ( ( rule__Customer__NameAssignment_1 ) ) )
            // InternalGrocery.g:2959:1: ( ( rule__Customer__NameAssignment_1 ) )
            {
            // InternalGrocery.g:2959:1: ( ( rule__Customer__NameAssignment_1 ) )
            // InternalGrocery.g:2960:2: ( rule__Customer__NameAssignment_1 )
            {
             before(grammarAccess.getCustomerAccess().getNameAssignment_1()); 
            // InternalGrocery.g:2961:2: ( rule__Customer__NameAssignment_1 )
            // InternalGrocery.g:2961:3: rule__Customer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // InternalGrocery.g:2969:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2973:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // InternalGrocery.g:2974:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Customer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__3();

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
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // InternalGrocery.g:2981:1: rule__Customer__Group__2__Impl : ( '{' ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:2985:1: ( ( '{' ) )
            // InternalGrocery.g:2986:1: ( '{' )
            {
            // InternalGrocery.g:2986:1: ( '{' )
            // InternalGrocery.g:2987:2: '{'
            {
             before(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__3"
    // InternalGrocery.g:2996:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3000:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // InternalGrocery.g:3001:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Customer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__4();

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
    // $ANTLR end "rule__Customer__Group__3"


    // $ANTLR start "rule__Customer__Group__3__Impl"
    // InternalGrocery.g:3008:1: rule__Customer__Group__3__Impl : ( 'name' ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3012:1: ( ( 'name' ) )
            // InternalGrocery.g:3013:1: ( 'name' )
            {
            // InternalGrocery.g:3013:1: ( 'name' )
            // InternalGrocery.g:3014:2: 'name'
            {
             before(grammarAccess.getCustomerAccess().getNameKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3__Impl"


    // $ANTLR start "rule__Customer__Group__4"
    // InternalGrocery.g:3023:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl rule__Customer__Group__5 ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3027:1: ( rule__Customer__Group__4__Impl rule__Customer__Group__5 )
            // InternalGrocery.g:3028:2: rule__Customer__Group__4__Impl rule__Customer__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Customer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__5();

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
    // $ANTLR end "rule__Customer__Group__4"


    // $ANTLR start "rule__Customer__Group__4__Impl"
    // InternalGrocery.g:3035:1: rule__Customer__Group__4__Impl : ( ':' ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3039:1: ( ( ':' ) )
            // InternalGrocery.g:3040:1: ( ':' )
            {
            // InternalGrocery.g:3040:1: ( ':' )
            // InternalGrocery.g:3041:2: ':'
            {
             before(grammarAccess.getCustomerAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4__Impl"


    // $ANTLR start "rule__Customer__Group__5"
    // InternalGrocery.g:3050:1: rule__Customer__Group__5 : rule__Customer__Group__5__Impl rule__Customer__Group__6 ;
    public final void rule__Customer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3054:1: ( rule__Customer__Group__5__Impl rule__Customer__Group__6 )
            // InternalGrocery.g:3055:2: rule__Customer__Group__5__Impl rule__Customer__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Customer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__6();

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
    // $ANTLR end "rule__Customer__Group__5"


    // $ANTLR start "rule__Customer__Group__5__Impl"
    // InternalGrocery.g:3062:1: rule__Customer__Group__5__Impl : ( ( rule__Customer__CustomerNameAssignment_5 ) ) ;
    public final void rule__Customer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3066:1: ( ( ( rule__Customer__CustomerNameAssignment_5 ) ) )
            // InternalGrocery.g:3067:1: ( ( rule__Customer__CustomerNameAssignment_5 ) )
            {
            // InternalGrocery.g:3067:1: ( ( rule__Customer__CustomerNameAssignment_5 ) )
            // InternalGrocery.g:3068:2: ( rule__Customer__CustomerNameAssignment_5 )
            {
             before(grammarAccess.getCustomerAccess().getCustomerNameAssignment_5()); 
            // InternalGrocery.g:3069:2: ( rule__Customer__CustomerNameAssignment_5 )
            // InternalGrocery.g:3069:3: rule__Customer__CustomerNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Customer__CustomerNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getCustomerNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5__Impl"


    // $ANTLR start "rule__Customer__Group__6"
    // InternalGrocery.g:3077:1: rule__Customer__Group__6 : rule__Customer__Group__6__Impl rule__Customer__Group__7 ;
    public final void rule__Customer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3081:1: ( rule__Customer__Group__6__Impl rule__Customer__Group__7 )
            // InternalGrocery.g:3082:2: rule__Customer__Group__6__Impl rule__Customer__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Customer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__7();

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
    // $ANTLR end "rule__Customer__Group__6"


    // $ANTLR start "rule__Customer__Group__6__Impl"
    // InternalGrocery.g:3089:1: rule__Customer__Group__6__Impl : ( ( rule__Customer__SaleAssignment_6 )* ) ;
    public final void rule__Customer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3093:1: ( ( ( rule__Customer__SaleAssignment_6 )* ) )
            // InternalGrocery.g:3094:1: ( ( rule__Customer__SaleAssignment_6 )* )
            {
            // InternalGrocery.g:3094:1: ( ( rule__Customer__SaleAssignment_6 )* )
            // InternalGrocery.g:3095:2: ( rule__Customer__SaleAssignment_6 )*
            {
             before(grammarAccess.getCustomerAccess().getSaleAssignment_6()); 
            // InternalGrocery.g:3096:2: ( rule__Customer__SaleAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGrocery.g:3096:3: rule__Customer__SaleAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Customer__SaleAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCustomerAccess().getSaleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6__Impl"


    // $ANTLR start "rule__Customer__Group__7"
    // InternalGrocery.g:3104:1: rule__Customer__Group__7 : rule__Customer__Group__7__Impl ;
    public final void rule__Customer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3108:1: ( rule__Customer__Group__7__Impl )
            // InternalGrocery.g:3109:2: rule__Customer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__7__Impl();

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
    // $ANTLR end "rule__Customer__Group__7"


    // $ANTLR start "rule__Customer__Group__7__Impl"
    // InternalGrocery.g:3115:1: rule__Customer__Group__7__Impl : ( '}' ) ;
    public final void rule__Customer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3119:1: ( ( '}' ) )
            // InternalGrocery.g:3120:1: ( '}' )
            {
            // InternalGrocery.g:3120:1: ( '}' )
            // InternalGrocery.g:3121:2: '}'
            {
             before(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__7__Impl"


    // $ANTLR start "rule__Vehicle__Group__0"
    // InternalGrocery.g:3131:1: rule__Vehicle__Group__0 : rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 ;
    public final void rule__Vehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3135:1: ( rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1 )
            // InternalGrocery.g:3136:2: rule__Vehicle__Group__0__Impl rule__Vehicle__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGrocery.g:3143:1: rule__Vehicle__Group__0__Impl : ( 'vehicle' ) ;
    public final void rule__Vehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3147:1: ( ( 'vehicle' ) )
            // InternalGrocery.g:3148:1: ( 'vehicle' )
            {
            // InternalGrocery.g:3148:1: ( 'vehicle' )
            // InternalGrocery.g:3149:2: 'vehicle'
            {
             before(grammarAccess.getVehicleAccess().getVehicleKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGrocery.g:3158:1: rule__Vehicle__Group__1 : rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 ;
    public final void rule__Vehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3162:1: ( rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2 )
            // InternalGrocery.g:3163:2: rule__Vehicle__Group__1__Impl rule__Vehicle__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGrocery.g:3170:1: rule__Vehicle__Group__1__Impl : ( ( rule__Vehicle__NameAssignment_1 ) ) ;
    public final void rule__Vehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3174:1: ( ( ( rule__Vehicle__NameAssignment_1 ) ) )
            // InternalGrocery.g:3175:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3175:1: ( ( rule__Vehicle__NameAssignment_1 ) )
            // InternalGrocery.g:3176:2: ( rule__Vehicle__NameAssignment_1 )
            {
             before(grammarAccess.getVehicleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3177:2: ( rule__Vehicle__NameAssignment_1 )
            // InternalGrocery.g:3177:3: rule__Vehicle__NameAssignment_1
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
    // InternalGrocery.g:3185:1: rule__Vehicle__Group__2 : rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 ;
    public final void rule__Vehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3189:1: ( rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3 )
            // InternalGrocery.g:3190:2: rule__Vehicle__Group__2__Impl rule__Vehicle__Group__3
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
    // InternalGrocery.g:3197:1: rule__Vehicle__Group__2__Impl : ( '{' ) ;
    public final void rule__Vehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3201:1: ( ( '{' ) )
            // InternalGrocery.g:3202:1: ( '{' )
            {
            // InternalGrocery.g:3202:1: ( '{' )
            // InternalGrocery.g:3203:2: '{'
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
    // InternalGrocery.g:3212:1: rule__Vehicle__Group__3 : rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 ;
    public final void rule__Vehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3216:1: ( rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4 )
            // InternalGrocery.g:3217:2: rule__Vehicle__Group__3__Impl rule__Vehicle__Group__4
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
    // InternalGrocery.g:3224:1: rule__Vehicle__Group__3__Impl : ( 'plateNumber' ) ;
    public final void rule__Vehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3228:1: ( ( 'plateNumber' ) )
            // InternalGrocery.g:3229:1: ( 'plateNumber' )
            {
            // InternalGrocery.g:3229:1: ( 'plateNumber' )
            // InternalGrocery.g:3230:2: 'plateNumber'
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGrocery.g:3239:1: rule__Vehicle__Group__4 : rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 ;
    public final void rule__Vehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3243:1: ( rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5 )
            // InternalGrocery.g:3244:2: rule__Vehicle__Group__4__Impl rule__Vehicle__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:3251:1: rule__Vehicle__Group__4__Impl : ( ':' ) ;
    public final void rule__Vehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3255:1: ( ( ':' ) )
            // InternalGrocery.g:3256:1: ( ':' )
            {
            // InternalGrocery.g:3256:1: ( ':' )
            // InternalGrocery.g:3257:2: ':'
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
    // InternalGrocery.g:3266:1: rule__Vehicle__Group__5 : rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 ;
    public final void rule__Vehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3270:1: ( rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6 )
            // InternalGrocery.g:3271:2: rule__Vehicle__Group__5__Impl rule__Vehicle__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalGrocery.g:3278:1: rule__Vehicle__Group__5__Impl : ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) ;
    public final void rule__Vehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3282:1: ( ( ( rule__Vehicle__PlateNumberAssignment_5 ) ) )
            // InternalGrocery.g:3283:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            {
            // InternalGrocery.g:3283:1: ( ( rule__Vehicle__PlateNumberAssignment_5 ) )
            // InternalGrocery.g:3284:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            {
             before(grammarAccess.getVehicleAccess().getPlateNumberAssignment_5()); 
            // InternalGrocery.g:3285:2: ( rule__Vehicle__PlateNumberAssignment_5 )
            // InternalGrocery.g:3285:3: rule__Vehicle__PlateNumberAssignment_5
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
    // InternalGrocery.g:3293:1: rule__Vehicle__Group__6 : rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7 ;
    public final void rule__Vehicle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3297:1: ( rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7 )
            // InternalGrocery.g:3298:2: rule__Vehicle__Group__6__Impl rule__Vehicle__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Vehicle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__7();

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
    // InternalGrocery.g:3305:1: rule__Vehicle__Group__6__Impl : ( ( rule__Vehicle__ItemsAssignment_6 )* ) ;
    public final void rule__Vehicle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3309:1: ( ( ( rule__Vehicle__ItemsAssignment_6 )* ) )
            // InternalGrocery.g:3310:1: ( ( rule__Vehicle__ItemsAssignment_6 )* )
            {
            // InternalGrocery.g:3310:1: ( ( rule__Vehicle__ItemsAssignment_6 )* )
            // InternalGrocery.g:3311:2: ( rule__Vehicle__ItemsAssignment_6 )*
            {
             before(grammarAccess.getVehicleAccess().getItemsAssignment_6()); 
            // InternalGrocery.g:3312:2: ( rule__Vehicle__ItemsAssignment_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGrocery.g:3312:3: rule__Vehicle__ItemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Vehicle__ItemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getVehicleAccess().getItemsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Vehicle__Group__7"
    // InternalGrocery.g:3320:1: rule__Vehicle__Group__7 : rule__Vehicle__Group__7__Impl ;
    public final void rule__Vehicle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3324:1: ( rule__Vehicle__Group__7__Impl )
            // InternalGrocery.g:3325:2: rule__Vehicle__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle__Group__7__Impl();

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
    // $ANTLR end "rule__Vehicle__Group__7"


    // $ANTLR start "rule__Vehicle__Group__7__Impl"
    // InternalGrocery.g:3331:1: rule__Vehicle__Group__7__Impl : ( '}' ) ;
    public final void rule__Vehicle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3335:1: ( ( '}' ) )
            // InternalGrocery.g:3336:1: ( '}' )
            {
            // InternalGrocery.g:3336:1: ( '}' )
            // InternalGrocery.g:3337:2: '}'
            {
             before(grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__Group__7__Impl"


    // $ANTLR start "rule__Delivery__Group__0"
    // InternalGrocery.g:3347:1: rule__Delivery__Group__0 : rule__Delivery__Group__0__Impl rule__Delivery__Group__1 ;
    public final void rule__Delivery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3351:1: ( rule__Delivery__Group__0__Impl rule__Delivery__Group__1 )
            // InternalGrocery.g:3352:2: rule__Delivery__Group__0__Impl rule__Delivery__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Delivery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__1();

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
    // $ANTLR end "rule__Delivery__Group__0"


    // $ANTLR start "rule__Delivery__Group__0__Impl"
    // InternalGrocery.g:3359:1: rule__Delivery__Group__0__Impl : ( 'delivery' ) ;
    public final void rule__Delivery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3363:1: ( ( 'delivery' ) )
            // InternalGrocery.g:3364:1: ( 'delivery' )
            {
            // InternalGrocery.g:3364:1: ( 'delivery' )
            // InternalGrocery.g:3365:2: 'delivery'
            {
             before(grammarAccess.getDeliveryAccess().getDeliveryKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getDeliveryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__0__Impl"


    // $ANTLR start "rule__Delivery__Group__1"
    // InternalGrocery.g:3374:1: rule__Delivery__Group__1 : rule__Delivery__Group__1__Impl rule__Delivery__Group__2 ;
    public final void rule__Delivery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3378:1: ( rule__Delivery__Group__1__Impl rule__Delivery__Group__2 )
            // InternalGrocery.g:3379:2: rule__Delivery__Group__1__Impl rule__Delivery__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Delivery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__2();

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
    // $ANTLR end "rule__Delivery__Group__1"


    // $ANTLR start "rule__Delivery__Group__1__Impl"
    // InternalGrocery.g:3386:1: rule__Delivery__Group__1__Impl : ( ( rule__Delivery__NameAssignment_1 ) ) ;
    public final void rule__Delivery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3390:1: ( ( ( rule__Delivery__NameAssignment_1 ) ) )
            // InternalGrocery.g:3391:1: ( ( rule__Delivery__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3391:1: ( ( rule__Delivery__NameAssignment_1 ) )
            // InternalGrocery.g:3392:2: ( rule__Delivery__NameAssignment_1 )
            {
             before(grammarAccess.getDeliveryAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3393:2: ( rule__Delivery__NameAssignment_1 )
            // InternalGrocery.g:3393:3: rule__Delivery__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__1__Impl"


    // $ANTLR start "rule__Delivery__Group__2"
    // InternalGrocery.g:3401:1: rule__Delivery__Group__2 : rule__Delivery__Group__2__Impl rule__Delivery__Group__3 ;
    public final void rule__Delivery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3405:1: ( rule__Delivery__Group__2__Impl rule__Delivery__Group__3 )
            // InternalGrocery.g:3406:2: rule__Delivery__Group__2__Impl rule__Delivery__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Delivery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__3();

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
    // $ANTLR end "rule__Delivery__Group__2"


    // $ANTLR start "rule__Delivery__Group__2__Impl"
    // InternalGrocery.g:3413:1: rule__Delivery__Group__2__Impl : ( '{' ) ;
    public final void rule__Delivery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3417:1: ( ( '{' ) )
            // InternalGrocery.g:3418:1: ( '{' )
            {
            // InternalGrocery.g:3418:1: ( '{' )
            // InternalGrocery.g:3419:2: '{'
            {
             before(grammarAccess.getDeliveryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__2__Impl"


    // $ANTLR start "rule__Delivery__Group__3"
    // InternalGrocery.g:3428:1: rule__Delivery__Group__3 : rule__Delivery__Group__3__Impl rule__Delivery__Group__4 ;
    public final void rule__Delivery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3432:1: ( rule__Delivery__Group__3__Impl rule__Delivery__Group__4 )
            // InternalGrocery.g:3433:2: rule__Delivery__Group__3__Impl rule__Delivery__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Delivery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__4();

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
    // $ANTLR end "rule__Delivery__Group__3"


    // $ANTLR start "rule__Delivery__Group__3__Impl"
    // InternalGrocery.g:3440:1: rule__Delivery__Group__3__Impl : ( 'warehouse' ) ;
    public final void rule__Delivery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3444:1: ( ( 'warehouse' ) )
            // InternalGrocery.g:3445:1: ( 'warehouse' )
            {
            // InternalGrocery.g:3445:1: ( 'warehouse' )
            // InternalGrocery.g:3446:2: 'warehouse'
            {
             before(grammarAccess.getDeliveryAccess().getWarehouseKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getWarehouseKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__3__Impl"


    // $ANTLR start "rule__Delivery__Group__4"
    // InternalGrocery.g:3455:1: rule__Delivery__Group__4 : rule__Delivery__Group__4__Impl rule__Delivery__Group__5 ;
    public final void rule__Delivery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3459:1: ( rule__Delivery__Group__4__Impl rule__Delivery__Group__5 )
            // InternalGrocery.g:3460:2: rule__Delivery__Group__4__Impl rule__Delivery__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Delivery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__5();

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
    // $ANTLR end "rule__Delivery__Group__4"


    // $ANTLR start "rule__Delivery__Group__4__Impl"
    // InternalGrocery.g:3467:1: rule__Delivery__Group__4__Impl : ( ':' ) ;
    public final void rule__Delivery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3471:1: ( ( ':' ) )
            // InternalGrocery.g:3472:1: ( ':' )
            {
            // InternalGrocery.g:3472:1: ( ':' )
            // InternalGrocery.g:3473:2: ':'
            {
             before(grammarAccess.getDeliveryAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__4__Impl"


    // $ANTLR start "rule__Delivery__Group__5"
    // InternalGrocery.g:3482:1: rule__Delivery__Group__5 : rule__Delivery__Group__5__Impl rule__Delivery__Group__6 ;
    public final void rule__Delivery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3486:1: ( rule__Delivery__Group__5__Impl rule__Delivery__Group__6 )
            // InternalGrocery.g:3487:2: rule__Delivery__Group__5__Impl rule__Delivery__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Delivery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__6();

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
    // $ANTLR end "rule__Delivery__Group__5"


    // $ANTLR start "rule__Delivery__Group__5__Impl"
    // InternalGrocery.g:3494:1: rule__Delivery__Group__5__Impl : ( ( rule__Delivery__FromWarehouseAssignment_5 ) ) ;
    public final void rule__Delivery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3498:1: ( ( ( rule__Delivery__FromWarehouseAssignment_5 ) ) )
            // InternalGrocery.g:3499:1: ( ( rule__Delivery__FromWarehouseAssignment_5 ) )
            {
            // InternalGrocery.g:3499:1: ( ( rule__Delivery__FromWarehouseAssignment_5 ) )
            // InternalGrocery.g:3500:2: ( rule__Delivery__FromWarehouseAssignment_5 )
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseAssignment_5()); 
            // InternalGrocery.g:3501:2: ( rule__Delivery__FromWarehouseAssignment_5 )
            // InternalGrocery.g:3501:3: rule__Delivery__FromWarehouseAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__FromWarehouseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getFromWarehouseAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__5__Impl"


    // $ANTLR start "rule__Delivery__Group__6"
    // InternalGrocery.g:3509:1: rule__Delivery__Group__6 : rule__Delivery__Group__6__Impl rule__Delivery__Group__7 ;
    public final void rule__Delivery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3513:1: ( rule__Delivery__Group__6__Impl rule__Delivery__Group__7 )
            // InternalGrocery.g:3514:2: rule__Delivery__Group__6__Impl rule__Delivery__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Delivery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__7();

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
    // $ANTLR end "rule__Delivery__Group__6"


    // $ANTLR start "rule__Delivery__Group__6__Impl"
    // InternalGrocery.g:3521:1: rule__Delivery__Group__6__Impl : ( 'store' ) ;
    public final void rule__Delivery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3525:1: ( ( 'store' ) )
            // InternalGrocery.g:3526:1: ( 'store' )
            {
            // InternalGrocery.g:3526:1: ( 'store' )
            // InternalGrocery.g:3527:2: 'store'
            {
             before(grammarAccess.getDeliveryAccess().getStoreKeyword_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getStoreKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__6__Impl"


    // $ANTLR start "rule__Delivery__Group__7"
    // InternalGrocery.g:3536:1: rule__Delivery__Group__7 : rule__Delivery__Group__7__Impl rule__Delivery__Group__8 ;
    public final void rule__Delivery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3540:1: ( rule__Delivery__Group__7__Impl rule__Delivery__Group__8 )
            // InternalGrocery.g:3541:2: rule__Delivery__Group__7__Impl rule__Delivery__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Delivery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__8();

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
    // $ANTLR end "rule__Delivery__Group__7"


    // $ANTLR start "rule__Delivery__Group__7__Impl"
    // InternalGrocery.g:3548:1: rule__Delivery__Group__7__Impl : ( ':' ) ;
    public final void rule__Delivery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3552:1: ( ( ':' ) )
            // InternalGrocery.g:3553:1: ( ':' )
            {
            // InternalGrocery.g:3553:1: ( ':' )
            // InternalGrocery.g:3554:2: ':'
            {
             before(grammarAccess.getDeliveryAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__7__Impl"


    // $ANTLR start "rule__Delivery__Group__8"
    // InternalGrocery.g:3563:1: rule__Delivery__Group__8 : rule__Delivery__Group__8__Impl rule__Delivery__Group__9 ;
    public final void rule__Delivery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3567:1: ( rule__Delivery__Group__8__Impl rule__Delivery__Group__9 )
            // InternalGrocery.g:3568:2: rule__Delivery__Group__8__Impl rule__Delivery__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Delivery__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__9();

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
    // $ANTLR end "rule__Delivery__Group__8"


    // $ANTLR start "rule__Delivery__Group__8__Impl"
    // InternalGrocery.g:3575:1: rule__Delivery__Group__8__Impl : ( ( rule__Delivery__ToStoreAssignment_8 ) ) ;
    public final void rule__Delivery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3579:1: ( ( ( rule__Delivery__ToStoreAssignment_8 ) ) )
            // InternalGrocery.g:3580:1: ( ( rule__Delivery__ToStoreAssignment_8 ) )
            {
            // InternalGrocery.g:3580:1: ( ( rule__Delivery__ToStoreAssignment_8 ) )
            // InternalGrocery.g:3581:2: ( rule__Delivery__ToStoreAssignment_8 )
            {
             before(grammarAccess.getDeliveryAccess().getToStoreAssignment_8()); 
            // InternalGrocery.g:3582:2: ( rule__Delivery__ToStoreAssignment_8 )
            // InternalGrocery.g:3582:3: rule__Delivery__ToStoreAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__ToStoreAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryAccess().getToStoreAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__8__Impl"


    // $ANTLR start "rule__Delivery__Group__9"
    // InternalGrocery.g:3590:1: rule__Delivery__Group__9 : rule__Delivery__Group__9__Impl rule__Delivery__Group__10 ;
    public final void rule__Delivery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3594:1: ( rule__Delivery__Group__9__Impl rule__Delivery__Group__10 )
            // InternalGrocery.g:3595:2: rule__Delivery__Group__9__Impl rule__Delivery__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Delivery__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delivery__Group__10();

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
    // $ANTLR end "rule__Delivery__Group__9"


    // $ANTLR start "rule__Delivery__Group__9__Impl"
    // InternalGrocery.g:3602:1: rule__Delivery__Group__9__Impl : ( ( rule__Delivery__ItemsAssignment_9 )* ) ;
    public final void rule__Delivery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3606:1: ( ( ( rule__Delivery__ItemsAssignment_9 )* ) )
            // InternalGrocery.g:3607:1: ( ( rule__Delivery__ItemsAssignment_9 )* )
            {
            // InternalGrocery.g:3607:1: ( ( rule__Delivery__ItemsAssignment_9 )* )
            // InternalGrocery.g:3608:2: ( rule__Delivery__ItemsAssignment_9 )*
            {
             before(grammarAccess.getDeliveryAccess().getItemsAssignment_9()); 
            // InternalGrocery.g:3609:2: ( rule__Delivery__ItemsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalGrocery.g:3609:3: rule__Delivery__ItemsAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Delivery__ItemsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDeliveryAccess().getItemsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__9__Impl"


    // $ANTLR start "rule__Delivery__Group__10"
    // InternalGrocery.g:3617:1: rule__Delivery__Group__10 : rule__Delivery__Group__10__Impl ;
    public final void rule__Delivery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3621:1: ( rule__Delivery__Group__10__Impl )
            // InternalGrocery.g:3622:2: rule__Delivery__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delivery__Group__10__Impl();

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
    // $ANTLR end "rule__Delivery__Group__10"


    // $ANTLR start "rule__Delivery__Group__10__Impl"
    // InternalGrocery.g:3628:1: rule__Delivery__Group__10__Impl : ( '}' ) ;
    public final void rule__Delivery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3632:1: ( ( '}' ) )
            // InternalGrocery.g:3633:1: ( '}' )
            {
            // InternalGrocery.g:3633:1: ( '}' )
            // InternalGrocery.g:3634:2: '}'
            {
             before(grammarAccess.getDeliveryAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__Group__10__Impl"


    // $ANTLR start "rule__Sale__Group__0"
    // InternalGrocery.g:3644:1: rule__Sale__Group__0 : rule__Sale__Group__0__Impl rule__Sale__Group__1 ;
    public final void rule__Sale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3648:1: ( rule__Sale__Group__0__Impl rule__Sale__Group__1 )
            // InternalGrocery.g:3649:2: rule__Sale__Group__0__Impl rule__Sale__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Sale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__1();

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
    // $ANTLR end "rule__Sale__Group__0"


    // $ANTLR start "rule__Sale__Group__0__Impl"
    // InternalGrocery.g:3656:1: rule__Sale__Group__0__Impl : ( 'sale' ) ;
    public final void rule__Sale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3660:1: ( ( 'sale' ) )
            // InternalGrocery.g:3661:1: ( 'sale' )
            {
            // InternalGrocery.g:3661:1: ( 'sale' )
            // InternalGrocery.g:3662:2: 'sale'
            {
             before(grammarAccess.getSaleAccess().getSaleKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getSaleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__0__Impl"


    // $ANTLR start "rule__Sale__Group__1"
    // InternalGrocery.g:3671:1: rule__Sale__Group__1 : rule__Sale__Group__1__Impl rule__Sale__Group__2 ;
    public final void rule__Sale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3675:1: ( rule__Sale__Group__1__Impl rule__Sale__Group__2 )
            // InternalGrocery.g:3676:2: rule__Sale__Group__1__Impl rule__Sale__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Sale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__2();

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
    // $ANTLR end "rule__Sale__Group__1"


    // $ANTLR start "rule__Sale__Group__1__Impl"
    // InternalGrocery.g:3683:1: rule__Sale__Group__1__Impl : ( ( rule__Sale__NameAssignment_1 ) ) ;
    public final void rule__Sale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3687:1: ( ( ( rule__Sale__NameAssignment_1 ) ) )
            // InternalGrocery.g:3688:1: ( ( rule__Sale__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3688:1: ( ( rule__Sale__NameAssignment_1 ) )
            // InternalGrocery.g:3689:2: ( rule__Sale__NameAssignment_1 )
            {
             before(grammarAccess.getSaleAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3690:2: ( rule__Sale__NameAssignment_1 )
            // InternalGrocery.g:3690:3: rule__Sale__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sale__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSaleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__1__Impl"


    // $ANTLR start "rule__Sale__Group__2"
    // InternalGrocery.g:3698:1: rule__Sale__Group__2 : rule__Sale__Group__2__Impl rule__Sale__Group__3 ;
    public final void rule__Sale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3702:1: ( rule__Sale__Group__2__Impl rule__Sale__Group__3 )
            // InternalGrocery.g:3703:2: rule__Sale__Group__2__Impl rule__Sale__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Sale__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__3();

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
    // $ANTLR end "rule__Sale__Group__2"


    // $ANTLR start "rule__Sale__Group__2__Impl"
    // InternalGrocery.g:3710:1: rule__Sale__Group__2__Impl : ( '{' ) ;
    public final void rule__Sale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3714:1: ( ( '{' ) )
            // InternalGrocery.g:3715:1: ( '{' )
            {
            // InternalGrocery.g:3715:1: ( '{' )
            // InternalGrocery.g:3716:2: '{'
            {
             before(grammarAccess.getSaleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__2__Impl"


    // $ANTLR start "rule__Sale__Group__3"
    // InternalGrocery.g:3725:1: rule__Sale__Group__3 : rule__Sale__Group__3__Impl rule__Sale__Group__4 ;
    public final void rule__Sale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3729:1: ( rule__Sale__Group__3__Impl rule__Sale__Group__4 )
            // InternalGrocery.g:3730:2: rule__Sale__Group__3__Impl rule__Sale__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Sale__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__4();

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
    // $ANTLR end "rule__Sale__Group__3"


    // $ANTLR start "rule__Sale__Group__3__Impl"
    // InternalGrocery.g:3737:1: rule__Sale__Group__3__Impl : ( 'shelf' ) ;
    public final void rule__Sale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3741:1: ( ( 'shelf' ) )
            // InternalGrocery.g:3742:1: ( 'shelf' )
            {
            // InternalGrocery.g:3742:1: ( 'shelf' )
            // InternalGrocery.g:3743:2: 'shelf'
            {
             before(grammarAccess.getSaleAccess().getShelfKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getShelfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__3__Impl"


    // $ANTLR start "rule__Sale__Group__4"
    // InternalGrocery.g:3752:1: rule__Sale__Group__4 : rule__Sale__Group__4__Impl rule__Sale__Group__5 ;
    public final void rule__Sale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3756:1: ( rule__Sale__Group__4__Impl rule__Sale__Group__5 )
            // InternalGrocery.g:3757:2: rule__Sale__Group__4__Impl rule__Sale__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Sale__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__5();

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
    // $ANTLR end "rule__Sale__Group__4"


    // $ANTLR start "rule__Sale__Group__4__Impl"
    // InternalGrocery.g:3764:1: rule__Sale__Group__4__Impl : ( ':' ) ;
    public final void rule__Sale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3768:1: ( ( ':' ) )
            // InternalGrocery.g:3769:1: ( ':' )
            {
            // InternalGrocery.g:3769:1: ( ':' )
            // InternalGrocery.g:3770:2: ':'
            {
             before(grammarAccess.getSaleAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__4__Impl"


    // $ANTLR start "rule__Sale__Group__5"
    // InternalGrocery.g:3779:1: rule__Sale__Group__5 : rule__Sale__Group__5__Impl rule__Sale__Group__6 ;
    public final void rule__Sale__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3783:1: ( rule__Sale__Group__5__Impl rule__Sale__Group__6 )
            // InternalGrocery.g:3784:2: rule__Sale__Group__5__Impl rule__Sale__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Sale__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__6();

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
    // $ANTLR end "rule__Sale__Group__5"


    // $ANTLR start "rule__Sale__Group__5__Impl"
    // InternalGrocery.g:3791:1: rule__Sale__Group__5__Impl : ( ( rule__Sale__FromShelfAssignment_5 ) ) ;
    public final void rule__Sale__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3795:1: ( ( ( rule__Sale__FromShelfAssignment_5 ) ) )
            // InternalGrocery.g:3796:1: ( ( rule__Sale__FromShelfAssignment_5 ) )
            {
            // InternalGrocery.g:3796:1: ( ( rule__Sale__FromShelfAssignment_5 ) )
            // InternalGrocery.g:3797:2: ( rule__Sale__FromShelfAssignment_5 )
            {
             before(grammarAccess.getSaleAccess().getFromShelfAssignment_5()); 
            // InternalGrocery.g:3798:2: ( rule__Sale__FromShelfAssignment_5 )
            // InternalGrocery.g:3798:3: rule__Sale__FromShelfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Sale__FromShelfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSaleAccess().getFromShelfAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__5__Impl"


    // $ANTLR start "rule__Sale__Group__6"
    // InternalGrocery.g:3806:1: rule__Sale__Group__6 : rule__Sale__Group__6__Impl rule__Sale__Group__7 ;
    public final void rule__Sale__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3810:1: ( rule__Sale__Group__6__Impl rule__Sale__Group__7 )
            // InternalGrocery.g:3811:2: rule__Sale__Group__6__Impl rule__Sale__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Sale__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sale__Group__7();

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
    // $ANTLR end "rule__Sale__Group__6"


    // $ANTLR start "rule__Sale__Group__6__Impl"
    // InternalGrocery.g:3818:1: rule__Sale__Group__6__Impl : ( ( rule__Sale__ItemsAssignment_6 )* ) ;
    public final void rule__Sale__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3822:1: ( ( ( rule__Sale__ItemsAssignment_6 )* ) )
            // InternalGrocery.g:3823:1: ( ( rule__Sale__ItemsAssignment_6 )* )
            {
            // InternalGrocery.g:3823:1: ( ( rule__Sale__ItemsAssignment_6 )* )
            // InternalGrocery.g:3824:2: ( rule__Sale__ItemsAssignment_6 )*
            {
             before(grammarAccess.getSaleAccess().getItemsAssignment_6()); 
            // InternalGrocery.g:3825:2: ( rule__Sale__ItemsAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalGrocery.g:3825:3: rule__Sale__ItemsAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Sale__ItemsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSaleAccess().getItemsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__6__Impl"


    // $ANTLR start "rule__Sale__Group__7"
    // InternalGrocery.g:3833:1: rule__Sale__Group__7 : rule__Sale__Group__7__Impl ;
    public final void rule__Sale__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3837:1: ( rule__Sale__Group__7__Impl )
            // InternalGrocery.g:3838:2: rule__Sale__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sale__Group__7__Impl();

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
    // $ANTLR end "rule__Sale__Group__7"


    // $ANTLR start "rule__Sale__Group__7__Impl"
    // InternalGrocery.g:3844:1: rule__Sale__Group__7__Impl : ( '}' ) ;
    public final void rule__Sale__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3848:1: ( ( '}' ) )
            // InternalGrocery.g:3849:1: ( '}' )
            {
            // InternalGrocery.g:3849:1: ( '}' )
            // InternalGrocery.g:3850:2: '}'
            {
             before(grammarAccess.getSaleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__Group__7__Impl"


    // $ANTLR start "rule__StockMovement__Group__0"
    // InternalGrocery.g:3860:1: rule__StockMovement__Group__0 : rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1 ;
    public final void rule__StockMovement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3864:1: ( rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1 )
            // InternalGrocery.g:3865:2: rule__StockMovement__Group__0__Impl rule__StockMovement__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StockMovement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__1();

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
    // $ANTLR end "rule__StockMovement__Group__0"


    // $ANTLR start "rule__StockMovement__Group__0__Impl"
    // InternalGrocery.g:3872:1: rule__StockMovement__Group__0__Impl : ( 'stock' ) ;
    public final void rule__StockMovement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3876:1: ( ( 'stock' ) )
            // InternalGrocery.g:3877:1: ( 'stock' )
            {
            // InternalGrocery.g:3877:1: ( 'stock' )
            // InternalGrocery.g:3878:2: 'stock'
            {
             before(grammarAccess.getStockMovementAccess().getStockKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getStockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__0__Impl"


    // $ANTLR start "rule__StockMovement__Group__1"
    // InternalGrocery.g:3887:1: rule__StockMovement__Group__1 : rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2 ;
    public final void rule__StockMovement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3891:1: ( rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2 )
            // InternalGrocery.g:3892:2: rule__StockMovement__Group__1__Impl rule__StockMovement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__StockMovement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__2();

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
    // $ANTLR end "rule__StockMovement__Group__1"


    // $ANTLR start "rule__StockMovement__Group__1__Impl"
    // InternalGrocery.g:3899:1: rule__StockMovement__Group__1__Impl : ( ( rule__StockMovement__NameAssignment_1 ) ) ;
    public final void rule__StockMovement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3903:1: ( ( ( rule__StockMovement__NameAssignment_1 ) ) )
            // InternalGrocery.g:3904:1: ( ( rule__StockMovement__NameAssignment_1 ) )
            {
            // InternalGrocery.g:3904:1: ( ( rule__StockMovement__NameAssignment_1 ) )
            // InternalGrocery.g:3905:2: ( rule__StockMovement__NameAssignment_1 )
            {
             before(grammarAccess.getStockMovementAccess().getNameAssignment_1()); 
            // InternalGrocery.g:3906:2: ( rule__StockMovement__NameAssignment_1 )
            // InternalGrocery.g:3906:3: rule__StockMovement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__1__Impl"


    // $ANTLR start "rule__StockMovement__Group__2"
    // InternalGrocery.g:3914:1: rule__StockMovement__Group__2 : rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3 ;
    public final void rule__StockMovement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3918:1: ( rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3 )
            // InternalGrocery.g:3919:2: rule__StockMovement__Group__2__Impl rule__StockMovement__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__StockMovement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__3();

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
    // $ANTLR end "rule__StockMovement__Group__2"


    // $ANTLR start "rule__StockMovement__Group__2__Impl"
    // InternalGrocery.g:3926:1: rule__StockMovement__Group__2__Impl : ( '{' ) ;
    public final void rule__StockMovement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3930:1: ( ( '{' ) )
            // InternalGrocery.g:3931:1: ( '{' )
            {
            // InternalGrocery.g:3931:1: ( '{' )
            // InternalGrocery.g:3932:2: '{'
            {
             before(grammarAccess.getStockMovementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__2__Impl"


    // $ANTLR start "rule__StockMovement__Group__3"
    // InternalGrocery.g:3941:1: rule__StockMovement__Group__3 : rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4 ;
    public final void rule__StockMovement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3945:1: ( rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4 )
            // InternalGrocery.g:3946:2: rule__StockMovement__Group__3__Impl rule__StockMovement__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__StockMovement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__4();

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
    // $ANTLR end "rule__StockMovement__Group__3"


    // $ANTLR start "rule__StockMovement__Group__3__Impl"
    // InternalGrocery.g:3953:1: rule__StockMovement__Group__3__Impl : ( 'backroom' ) ;
    public final void rule__StockMovement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3957:1: ( ( 'backroom' ) )
            // InternalGrocery.g:3958:1: ( 'backroom' )
            {
            // InternalGrocery.g:3958:1: ( 'backroom' )
            // InternalGrocery.g:3959:2: 'backroom'
            {
             before(grammarAccess.getStockMovementAccess().getBackroomKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getBackroomKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__3__Impl"


    // $ANTLR start "rule__StockMovement__Group__4"
    // InternalGrocery.g:3968:1: rule__StockMovement__Group__4 : rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5 ;
    public final void rule__StockMovement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3972:1: ( rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5 )
            // InternalGrocery.g:3973:2: rule__StockMovement__Group__4__Impl rule__StockMovement__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__StockMovement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__5();

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
    // $ANTLR end "rule__StockMovement__Group__4"


    // $ANTLR start "rule__StockMovement__Group__4__Impl"
    // InternalGrocery.g:3980:1: rule__StockMovement__Group__4__Impl : ( ':' ) ;
    public final void rule__StockMovement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3984:1: ( ( ':' ) )
            // InternalGrocery.g:3985:1: ( ':' )
            {
            // InternalGrocery.g:3985:1: ( ':' )
            // InternalGrocery.g:3986:2: ':'
            {
             before(grammarAccess.getStockMovementAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__4__Impl"


    // $ANTLR start "rule__StockMovement__Group__5"
    // InternalGrocery.g:3995:1: rule__StockMovement__Group__5 : rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6 ;
    public final void rule__StockMovement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:3999:1: ( rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6 )
            // InternalGrocery.g:4000:2: rule__StockMovement__Group__5__Impl rule__StockMovement__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__StockMovement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__6();

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
    // $ANTLR end "rule__StockMovement__Group__5"


    // $ANTLR start "rule__StockMovement__Group__5__Impl"
    // InternalGrocery.g:4007:1: rule__StockMovement__Group__5__Impl : ( ( rule__StockMovement__FromBackroomAssignment_5 ) ) ;
    public final void rule__StockMovement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4011:1: ( ( ( rule__StockMovement__FromBackroomAssignment_5 ) ) )
            // InternalGrocery.g:4012:1: ( ( rule__StockMovement__FromBackroomAssignment_5 ) )
            {
            // InternalGrocery.g:4012:1: ( ( rule__StockMovement__FromBackroomAssignment_5 ) )
            // InternalGrocery.g:4013:2: ( rule__StockMovement__FromBackroomAssignment_5 )
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomAssignment_5()); 
            // InternalGrocery.g:4014:2: ( rule__StockMovement__FromBackroomAssignment_5 )
            // InternalGrocery.g:4014:3: rule__StockMovement__FromBackroomAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__FromBackroomAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getFromBackroomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__5__Impl"


    // $ANTLR start "rule__StockMovement__Group__6"
    // InternalGrocery.g:4022:1: rule__StockMovement__Group__6 : rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7 ;
    public final void rule__StockMovement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4026:1: ( rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7 )
            // InternalGrocery.g:4027:2: rule__StockMovement__Group__6__Impl rule__StockMovement__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__StockMovement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__7();

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
    // $ANTLR end "rule__StockMovement__Group__6"


    // $ANTLR start "rule__StockMovement__Group__6__Impl"
    // InternalGrocery.g:4034:1: rule__StockMovement__Group__6__Impl : ( 'shelf' ) ;
    public final void rule__StockMovement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4038:1: ( ( 'shelf' ) )
            // InternalGrocery.g:4039:1: ( 'shelf' )
            {
            // InternalGrocery.g:4039:1: ( 'shelf' )
            // InternalGrocery.g:4040:2: 'shelf'
            {
             before(grammarAccess.getStockMovementAccess().getShelfKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getShelfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__6__Impl"


    // $ANTLR start "rule__StockMovement__Group__7"
    // InternalGrocery.g:4049:1: rule__StockMovement__Group__7 : rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8 ;
    public final void rule__StockMovement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4053:1: ( rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8 )
            // InternalGrocery.g:4054:2: rule__StockMovement__Group__7__Impl rule__StockMovement__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__StockMovement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__8();

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
    // $ANTLR end "rule__StockMovement__Group__7"


    // $ANTLR start "rule__StockMovement__Group__7__Impl"
    // InternalGrocery.g:4061:1: rule__StockMovement__Group__7__Impl : ( ':' ) ;
    public final void rule__StockMovement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4065:1: ( ( ':' ) )
            // InternalGrocery.g:4066:1: ( ':' )
            {
            // InternalGrocery.g:4066:1: ( ':' )
            // InternalGrocery.g:4067:2: ':'
            {
             before(grammarAccess.getStockMovementAccess().getColonKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__7__Impl"


    // $ANTLR start "rule__StockMovement__Group__8"
    // InternalGrocery.g:4076:1: rule__StockMovement__Group__8 : rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9 ;
    public final void rule__StockMovement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4080:1: ( rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9 )
            // InternalGrocery.g:4081:2: rule__StockMovement__Group__8__Impl rule__StockMovement__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__StockMovement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__9();

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
    // $ANTLR end "rule__StockMovement__Group__8"


    // $ANTLR start "rule__StockMovement__Group__8__Impl"
    // InternalGrocery.g:4088:1: rule__StockMovement__Group__8__Impl : ( ( rule__StockMovement__ToShelfAssignment_8 ) ) ;
    public final void rule__StockMovement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4092:1: ( ( ( rule__StockMovement__ToShelfAssignment_8 ) ) )
            // InternalGrocery.g:4093:1: ( ( rule__StockMovement__ToShelfAssignment_8 ) )
            {
            // InternalGrocery.g:4093:1: ( ( rule__StockMovement__ToShelfAssignment_8 ) )
            // InternalGrocery.g:4094:2: ( rule__StockMovement__ToShelfAssignment_8 )
            {
             before(grammarAccess.getStockMovementAccess().getToShelfAssignment_8()); 
            // InternalGrocery.g:4095:2: ( rule__StockMovement__ToShelfAssignment_8 )
            // InternalGrocery.g:4095:3: rule__StockMovement__ToShelfAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__ToShelfAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStockMovementAccess().getToShelfAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__8__Impl"


    // $ANTLR start "rule__StockMovement__Group__9"
    // InternalGrocery.g:4103:1: rule__StockMovement__Group__9 : rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10 ;
    public final void rule__StockMovement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4107:1: ( rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10 )
            // InternalGrocery.g:4108:2: rule__StockMovement__Group__9__Impl rule__StockMovement__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__StockMovement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__10();

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
    // $ANTLR end "rule__StockMovement__Group__9"


    // $ANTLR start "rule__StockMovement__Group__9__Impl"
    // InternalGrocery.g:4115:1: rule__StockMovement__Group__9__Impl : ( ( rule__StockMovement__ItemsAssignment_9 )* ) ;
    public final void rule__StockMovement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4119:1: ( ( ( rule__StockMovement__ItemsAssignment_9 )* ) )
            // InternalGrocery.g:4120:1: ( ( rule__StockMovement__ItemsAssignment_9 )* )
            {
            // InternalGrocery.g:4120:1: ( ( rule__StockMovement__ItemsAssignment_9 )* )
            // InternalGrocery.g:4121:2: ( rule__StockMovement__ItemsAssignment_9 )*
            {
             before(grammarAccess.getStockMovementAccess().getItemsAssignment_9()); 
            // InternalGrocery.g:4122:2: ( rule__StockMovement__ItemsAssignment_9 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalGrocery.g:4122:3: rule__StockMovement__ItemsAssignment_9
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__StockMovement__ItemsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getStockMovementAccess().getItemsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__9__Impl"


    // $ANTLR start "rule__StockMovement__Group__10"
    // InternalGrocery.g:4130:1: rule__StockMovement__Group__10 : rule__StockMovement__Group__10__Impl ;
    public final void rule__StockMovement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4134:1: ( rule__StockMovement__Group__10__Impl )
            // InternalGrocery.g:4135:2: rule__StockMovement__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StockMovement__Group__10__Impl();

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
    // $ANTLR end "rule__StockMovement__Group__10"


    // $ANTLR start "rule__StockMovement__Group__10__Impl"
    // InternalGrocery.g:4141:1: rule__StockMovement__Group__10__Impl : ( '}' ) ;
    public final void rule__StockMovement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4145:1: ( ( '}' ) )
            // InternalGrocery.g:4146:1: ( '}' )
            {
            // InternalGrocery.g:4146:1: ( '}' )
            // InternalGrocery.g:4147:2: '}'
            {
             before(grammarAccess.getStockMovementAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__Group__10__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // InternalGrocery.g:4157:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4161:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // InternalGrocery.g:4162:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalGrocery.g:4169:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4173:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4174:1: ( RULE_INT )
            {
            // InternalGrocery.g:4174:1: ( RULE_INT )
            // InternalGrocery.g:4175:2: RULE_INT
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
    // InternalGrocery.g:4184:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4188:1: ( rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2 )
            // InternalGrocery.g:4189:2: rule__DECIMAL__Group__1__Impl rule__DECIMAL__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:4196:1: rule__DECIMAL__Group__1__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4200:1: ( ( '.' ) )
            // InternalGrocery.g:4201:1: ( '.' )
            {
            // InternalGrocery.g:4201:1: ( '.' )
            // InternalGrocery.g:4202:2: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalGrocery.g:4211:1: rule__DECIMAL__Group__2 : rule__DECIMAL__Group__2__Impl ;
    public final void rule__DECIMAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4215:1: ( rule__DECIMAL__Group__2__Impl )
            // InternalGrocery.g:4216:2: rule__DECIMAL__Group__2__Impl
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
    // InternalGrocery.g:4222:1: rule__DECIMAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4226:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4227:1: ( RULE_INT )
            {
            // InternalGrocery.g:4227:1: ( RULE_INT )
            // InternalGrocery.g:4228:2: RULE_INT
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
    // InternalGrocery.g:4238:1: rule__DATE__Group__0 : rule__DATE__Group__0__Impl rule__DATE__Group__1 ;
    public final void rule__DATE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4242:1: ( rule__DATE__Group__0__Impl rule__DATE__Group__1 )
            // InternalGrocery.g:4243:2: rule__DATE__Group__0__Impl rule__DATE__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalGrocery.g:4250:1: rule__DATE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4254:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4255:1: ( RULE_INT )
            {
            // InternalGrocery.g:4255:1: ( RULE_INT )
            // InternalGrocery.g:4256:2: RULE_INT
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
    // InternalGrocery.g:4265:1: rule__DATE__Group__1 : rule__DATE__Group__1__Impl rule__DATE__Group__2 ;
    public final void rule__DATE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4269:1: ( rule__DATE__Group__1__Impl rule__DATE__Group__2 )
            // InternalGrocery.g:4270:2: rule__DATE__Group__1__Impl rule__DATE__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:4277:1: rule__DATE__Group__1__Impl : ( '/' ) ;
    public final void rule__DATE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4281:1: ( ( '/' ) )
            // InternalGrocery.g:4282:1: ( '/' )
            {
            // InternalGrocery.g:4282:1: ( '/' )
            // InternalGrocery.g:4283:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGrocery.g:4292:1: rule__DATE__Group__2 : rule__DATE__Group__2__Impl rule__DATE__Group__3 ;
    public final void rule__DATE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4296:1: ( rule__DATE__Group__2__Impl rule__DATE__Group__3 )
            // InternalGrocery.g:4297:2: rule__DATE__Group__2__Impl rule__DATE__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalGrocery.g:4304:1: rule__DATE__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4308:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4309:1: ( RULE_INT )
            {
            // InternalGrocery.g:4309:1: ( RULE_INT )
            // InternalGrocery.g:4310:2: RULE_INT
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
    // InternalGrocery.g:4319:1: rule__DATE__Group__3 : rule__DATE__Group__3__Impl rule__DATE__Group__4 ;
    public final void rule__DATE__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4323:1: ( rule__DATE__Group__3__Impl rule__DATE__Group__4 )
            // InternalGrocery.g:4324:2: rule__DATE__Group__3__Impl rule__DATE__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalGrocery.g:4331:1: rule__DATE__Group__3__Impl : ( '/' ) ;
    public final void rule__DATE__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4335:1: ( ( '/' ) )
            // InternalGrocery.g:4336:1: ( '/' )
            {
            // InternalGrocery.g:4336:1: ( '/' )
            // InternalGrocery.g:4337:2: '/'
            {
             before(grammarAccess.getDATEAccess().getSolidusKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalGrocery.g:4346:1: rule__DATE__Group__4 : rule__DATE__Group__4__Impl ;
    public final void rule__DATE__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4350:1: ( rule__DATE__Group__4__Impl )
            // InternalGrocery.g:4351:2: rule__DATE__Group__4__Impl
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
    // InternalGrocery.g:4357:1: rule__DATE__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DATE__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4361:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4362:1: ( RULE_INT )
            {
            // InternalGrocery.g:4362:1: ( RULE_INT )
            // InternalGrocery.g:4363:2: RULE_INT
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
    // InternalGrocery.g:4373:1: rule__ADDRESS__Group__0 : rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 ;
    public final void rule__ADDRESS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4377:1: ( rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1 )
            // InternalGrocery.g:4378:2: rule__ADDRESS__Group__0__Impl rule__ADDRESS__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:4385:1: rule__ADDRESS__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__ADDRESS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4389:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4390:1: ( RULE_INT )
            {
            // InternalGrocery.g:4390:1: ( RULE_INT )
            // InternalGrocery.g:4391:2: RULE_INT
            {
             before(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalGrocery.g:4400:1: rule__ADDRESS__Group__1 : rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 ;
    public final void rule__ADDRESS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4404:1: ( rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2 )
            // InternalGrocery.g:4405:2: rule__ADDRESS__Group__1__Impl rule__ADDRESS__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalGrocery.g:4412:1: rule__ADDRESS__Group__1__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4416:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4417:1: ( RULE_STRING )
            {
            // InternalGrocery.g:4417:1: ( RULE_STRING )
            // InternalGrocery.g:4418:2: RULE_STRING
            {
             before(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getADDRESSAccess().getSTRINGTerminalRuleCall_1()); 

            }


            }

        }
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
    // InternalGrocery.g:4427:1: rule__ADDRESS__Group__2 : rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 ;
    public final void rule__ADDRESS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4431:1: ( rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3 )
            // InternalGrocery.g:4432:2: rule__ADDRESS__Group__2__Impl rule__ADDRESS__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalGrocery.g:4439:1: rule__ADDRESS__Group__2__Impl : ( ',' ) ;
    public final void rule__ADDRESS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4443:1: ( ( ',' ) )
            // InternalGrocery.g:4444:1: ( ',' )
            {
            // InternalGrocery.g:4444:1: ( ',' )
            // InternalGrocery.g:4445:2: ','
            {
             before(grammarAccess.getADDRESSAccess().getCommaKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalGrocery.g:4454:1: rule__ADDRESS__Group__3 : rule__ADDRESS__Group__3__Impl ;
    public final void rule__ADDRESS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4458:1: ( rule__ADDRESS__Group__3__Impl )
            // InternalGrocery.g:4459:2: rule__ADDRESS__Group__3__Impl
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
    // InternalGrocery.g:4465:1: rule__ADDRESS__Group__3__Impl : ( RULE_STRING ) ;
    public final void rule__ADDRESS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4469:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4470:1: ( RULE_STRING )
            {
            // InternalGrocery.g:4470:1: ( RULE_STRING )
            // InternalGrocery.g:4471:2: RULE_STRING
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
    // InternalGrocery.g:4481:1: rule__Grocery__ElementsAssignment_0 : ( ruleBuilding ) ;
    public final void rule__Grocery__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4485:1: ( ( ruleBuilding ) )
            // InternalGrocery.g:4486:2: ( ruleBuilding )
            {
            // InternalGrocery.g:4486:2: ( ruleBuilding )
            // InternalGrocery.g:4487:3: ruleBuilding
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
    // InternalGrocery.g:4496:1: rule__Grocery__ElementsAssignment_1 : ( ruleMovementElement ) ;
    public final void rule__Grocery__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4500:1: ( ( ruleMovementElement ) )
            // InternalGrocery.g:4501:2: ( ruleMovementElement )
            {
            // InternalGrocery.g:4501:2: ( ruleMovementElement )
            // InternalGrocery.g:4502:3: ruleMovementElement
            {
             before(grammarAccess.getGroceryAccess().getElementsMovementElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMovementElement();

            state._fsp--;

             after(grammarAccess.getGroceryAccess().getElementsMovementElementParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Grocery__ElementsAssignment_2"
    // InternalGrocery.g:4511:1: rule__Grocery__ElementsAssignment_2 : ( ruleMovement ) ;
    public final void rule__Grocery__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4515:1: ( ( ruleMovement ) )
            // InternalGrocery.g:4516:2: ( ruleMovement )
            {
            // InternalGrocery.g:4516:2: ( ruleMovement )
            // InternalGrocery.g:4517:3: ruleMovement
            {
             before(grammarAccess.getGroceryAccess().getElementsMovementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getGroceryAccess().getElementsMovementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__ElementsAssignment_2"


    // $ANTLR start "rule__Grocery__ElementsAssignment_3"
    // InternalGrocery.g:4526:1: rule__Grocery__ElementsAssignment_3 : ( ruleItem ) ;
    public final void rule__Grocery__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4530:1: ( ( ruleItem ) )
            // InternalGrocery.g:4531:2: ( ruleItem )
            {
            // InternalGrocery.g:4531:2: ( ruleItem )
            // InternalGrocery.g:4532:3: ruleItem
            {
             before(grammarAccess.getGroceryAccess().getElementsItemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getGroceryAccess().getElementsItemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__ElementsAssignment_3"


    // $ANTLR start "rule__Grocery__ElementsAssignment_4"
    // InternalGrocery.g:4541:1: rule__Grocery__ElementsAssignment_4 : ( ruleStoreElements ) ;
    public final void rule__Grocery__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4545:1: ( ( ruleStoreElements ) )
            // InternalGrocery.g:4546:2: ( ruleStoreElements )
            {
            // InternalGrocery.g:4546:2: ( ruleStoreElements )
            // InternalGrocery.g:4547:3: ruleStoreElements
            {
             before(grammarAccess.getGroceryAccess().getElementsStoreElementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStoreElements();

            state._fsp--;

             after(grammarAccess.getGroceryAccess().getElementsStoreElementsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grocery__ElementsAssignment_4"


    // $ANTLR start "rule__Store__NameAssignment_1"
    // InternalGrocery.g:4556:1: rule__Store__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Store__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4560:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4561:2: ( RULE_ID )
            {
            // InternalGrocery.g:4561:2: ( RULE_ID )
            // InternalGrocery.g:4562:3: RULE_ID
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
    // InternalGrocery.g:4571:1: rule__Store__ElementsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Store__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4575:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4576:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4576:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4577:3: ( RULE_ID )
            {
             before(grammarAccess.getStoreAccess().getElementsStoreElementsCrossReference_3_0()); 
            // InternalGrocery.g:4578:3: ( RULE_ID )
            // InternalGrocery.g:4579:4: RULE_ID
            {
             before(grammarAccess.getStoreAccess().getElementsStoreElementsIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getElementsStoreElementsIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStoreAccess().getElementsStoreElementsCrossReference_3_0()); 

            }


            }

        }
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
    // InternalGrocery.g:4590:1: rule__Warehouse__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Warehouse__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4594:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4595:2: ( RULE_ID )
            {
            // InternalGrocery.g:4595:2: ( RULE_ID )
            // InternalGrocery.g:4596:3: RULE_ID
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
    // InternalGrocery.g:4605:1: rule__Warehouse__AddressAssignment_5 : ( ruleADDRESS ) ;
    public final void rule__Warehouse__AddressAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4609:1: ( ( ruleADDRESS ) )
            // InternalGrocery.g:4610:2: ( ruleADDRESS )
            {
            // InternalGrocery.g:4610:2: ( ruleADDRESS )
            // InternalGrocery.g:4611:3: ruleADDRESS
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


    // $ANTLR start "rule__Warehouse__ItemsAssignment_6"
    // InternalGrocery.g:4620:1: rule__Warehouse__ItemsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Warehouse__ItemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4624:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4625:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4625:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4626:3: ( RULE_ID )
            {
             before(grammarAccess.getWarehouseAccess().getItemsItemCrossReference_6_0()); 
            // InternalGrocery.g:4627:3: ( RULE_ID )
            // InternalGrocery.g:4628:4: RULE_ID
            {
             before(grammarAccess.getWarehouseAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWarehouseAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getWarehouseAccess().getItemsItemCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Warehouse__ItemsAssignment_6"


    // $ANTLR start "rule__Shelf__NameAssignment_1"
    // InternalGrocery.g:4639:1: rule__Shelf__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Shelf__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4643:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4644:2: ( RULE_ID )
            {
            // InternalGrocery.g:4644:2: ( RULE_ID )
            // InternalGrocery.g:4645:3: RULE_ID
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


    // $ANTLR start "rule__Shelf__ItemsAssignment_3"
    // InternalGrocery.g:4654:1: rule__Shelf__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Shelf__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4658:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4659:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4659:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4660:3: ( RULE_ID )
            {
             before(grammarAccess.getShelfAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:4661:3: ( RULE_ID )
            // InternalGrocery.g:4662:4: RULE_ID
            {
             before(grammarAccess.getShelfAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShelfAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getShelfAccess().getItemsItemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shelf__ItemsAssignment_3"


    // $ANTLR start "rule__Backroom__NameAssignment_1"
    // InternalGrocery.g:4673:1: rule__Backroom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Backroom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4677:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4678:2: ( RULE_ID )
            {
            // InternalGrocery.g:4678:2: ( RULE_ID )
            // InternalGrocery.g:4679:3: RULE_ID
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


    // $ANTLR start "rule__Backroom__ItemsAssignment_3"
    // InternalGrocery.g:4688:1: rule__Backroom__ItemsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Backroom__ItemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4692:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4693:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4693:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4694:3: ( RULE_ID )
            {
             before(grammarAccess.getBackroomAccess().getItemsItemCrossReference_3_0()); 
            // InternalGrocery.g:4695:3: ( RULE_ID )
            // InternalGrocery.g:4696:4: RULE_ID
            {
             before(grammarAccess.getBackroomAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBackroomAccess().getItemsItemIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBackroomAccess().getItemsItemCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backroom__ItemsAssignment_3"


    // $ANTLR start "rule__NonPerishableItem__NameAssignment_1"
    // InternalGrocery.g:4707:1: rule__NonPerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonPerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4711:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4712:2: ( RULE_ID )
            {
            // InternalGrocery.g:4712:2: ( RULE_ID )
            // InternalGrocery.g:4713:3: RULE_ID
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
    // InternalGrocery.g:4722:1: rule__NonPerishableItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__NonPerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4726:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:4727:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:4727:2: ( ruleDECIMAL )
            // InternalGrocery.g:4728:3: ruleDECIMAL
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
    // InternalGrocery.g:4737:1: rule__NonPerishableItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__NonPerishableItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4741:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4742:2: ( RULE_INT )
            {
            // InternalGrocery.g:4742:2: ( RULE_INT )
            // InternalGrocery.g:4743:3: RULE_INT
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
    // InternalGrocery.g:4752:1: rule__PerishableItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PerishableItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4756:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4757:2: ( RULE_ID )
            {
            // InternalGrocery.g:4757:2: ( RULE_ID )
            // InternalGrocery.g:4758:3: RULE_ID
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
    // InternalGrocery.g:4767:1: rule__PerishableItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__PerishableItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4771:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:4772:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:4772:2: ( ruleDECIMAL )
            // InternalGrocery.g:4773:3: ruleDECIMAL
            {
             before(grammarAccess.getPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getPerishableItemAccess().getPriceDECIMALParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__PerishableItem__QuantityAssignment_8"
    // InternalGrocery.g:4782:1: rule__PerishableItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__PerishableItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4786:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4787:2: ( RULE_INT )
            {
            // InternalGrocery.g:4787:2: ( RULE_INT )
            // InternalGrocery.g:4788:3: RULE_INT
            {
             before(grammarAccess.getPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPerishableItemAccess().getQuantityINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__QuantityAssignment_8"


    // $ANTLR start "rule__PerishableItem__ExperationDateAssignment_11"
    // InternalGrocery.g:4797:1: rule__PerishableItem__ExperationDateAssignment_11 : ( ruleDATE ) ;
    public final void rule__PerishableItem__ExperationDateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4801:1: ( ( ruleDATE ) )
            // InternalGrocery.g:4802:2: ( ruleDATE )
            {
            // InternalGrocery.g:4802:2: ( ruleDATE )
            // InternalGrocery.g:4803:3: ruleDATE
            {
             before(grammarAccess.getPerishableItemAccess().getExperationDateDATEParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleDATE();

            state._fsp--;

             after(grammarAccess.getPerishableItemAccess().getExperationDateDATEParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PerishableItem__ExperationDateAssignment_11"


    // $ANTLR start "rule__NonFoodItem__NameAssignment_1"
    // InternalGrocery.g:4812:1: rule__NonFoodItem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NonFoodItem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4816:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4817:2: ( RULE_ID )
            {
            // InternalGrocery.g:4817:2: ( RULE_ID )
            // InternalGrocery.g:4818:3: RULE_ID
            {
             before(grammarAccess.getNonFoodItemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__NameAssignment_1"


    // $ANTLR start "rule__NonFoodItem__PriceAssignment_5"
    // InternalGrocery.g:4827:1: rule__NonFoodItem__PriceAssignment_5 : ( ruleDECIMAL ) ;
    public final void rule__NonFoodItem__PriceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4831:1: ( ( ruleDECIMAL ) )
            // InternalGrocery.g:4832:2: ( ruleDECIMAL )
            {
            // InternalGrocery.g:4832:2: ( ruleDECIMAL )
            // InternalGrocery.g:4833:3: ruleDECIMAL
            {
             before(grammarAccess.getNonFoodItemAccess().getPriceDECIMALParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getNonFoodItemAccess().getPriceDECIMALParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__PriceAssignment_5"


    // $ANTLR start "rule__NonFoodItem__QuantityAssignment_8"
    // InternalGrocery.g:4842:1: rule__NonFoodItem__QuantityAssignment_8 : ( RULE_INT ) ;
    public final void rule__NonFoodItem__QuantityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4846:1: ( ( RULE_INT ) )
            // InternalGrocery.g:4847:2: ( RULE_INT )
            {
            // InternalGrocery.g:4847:2: ( RULE_INT )
            // InternalGrocery.g:4848:3: RULE_INT
            {
             before(grammarAccess.getNonFoodItemAccess().getQuantityINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNonFoodItemAccess().getQuantityINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonFoodItem__QuantityAssignment_8"


    // $ANTLR start "rule__Driver__NameAssignment_1"
    // InternalGrocery.g:4857:1: rule__Driver__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Driver__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4861:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4862:2: ( RULE_ID )
            {
            // InternalGrocery.g:4862:2: ( RULE_ID )
            // InternalGrocery.g:4863:3: RULE_ID
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
    // InternalGrocery.g:4872:1: rule__Driver__DriverNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Driver__DriverNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4876:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4877:2: ( RULE_STRING )
            {
            // InternalGrocery.g:4877:2: ( RULE_STRING )
            // InternalGrocery.g:4878:3: RULE_STRING
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


    // $ANTLR start "rule__Driver__VehicleAssignment_6"
    // InternalGrocery.g:4887:1: rule__Driver__VehicleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Driver__VehicleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4891:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4892:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4892:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4893:3: ( RULE_ID )
            {
             before(grammarAccess.getDriverAccess().getVehicleVehicleCrossReference_6_0()); 
            // InternalGrocery.g:4894:3: ( RULE_ID )
            // InternalGrocery.g:4895:4: RULE_ID
            {
             before(grammarAccess.getDriverAccess().getVehicleVehicleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDriverAccess().getVehicleVehicleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDriverAccess().getVehicleVehicleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Driver__VehicleAssignment_6"


    // $ANTLR start "rule__Employee__NameAssignment_1"
    // InternalGrocery.g:4906:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4910:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4911:2: ( RULE_ID )
            {
            // InternalGrocery.g:4911:2: ( RULE_ID )
            // InternalGrocery.g:4912:3: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__NameAssignment_1"


    // $ANTLR start "rule__Employee__EmployeeNameAssignment_5"
    // InternalGrocery.g:4921:1: rule__Employee__EmployeeNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Employee__EmployeeNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4925:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4926:2: ( RULE_STRING )
            {
            // InternalGrocery.g:4926:2: ( RULE_STRING )
            // InternalGrocery.g:4927:3: RULE_STRING
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__EmployeeNameAssignment_5"


    // $ANTLR start "rule__Employee__StockMovementAssignment_6"
    // InternalGrocery.g:4936:1: rule__Employee__StockMovementAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Employee__StockMovementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4940:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4941:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4941:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4942:3: ( RULE_ID )
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementStockMovementCrossReference_6_0()); 
            // InternalGrocery.g:4943:3: ( RULE_ID )
            // InternalGrocery.g:4944:4: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getStockMovementStockMovementIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getStockMovementStockMovementIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getEmployeeAccess().getStockMovementStockMovementCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__StockMovementAssignment_6"


    // $ANTLR start "rule__Customer__NameAssignment_1"
    // InternalGrocery.g:4955:1: rule__Customer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Customer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4959:1: ( ( RULE_ID ) )
            // InternalGrocery.g:4960:2: ( RULE_ID )
            {
            // InternalGrocery.g:4960:2: ( RULE_ID )
            // InternalGrocery.g:4961:3: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__NameAssignment_1"


    // $ANTLR start "rule__Customer__CustomerNameAssignment_5"
    // InternalGrocery.g:4970:1: rule__Customer__CustomerNameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Customer__CustomerNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4974:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:4975:2: ( RULE_STRING )
            {
            // InternalGrocery.g:4975:2: ( RULE_STRING )
            // InternalGrocery.g:4976:3: RULE_STRING
            {
             before(grammarAccess.getCustomerAccess().getCustomerNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__CustomerNameAssignment_5"


    // $ANTLR start "rule__Customer__SaleAssignment_6"
    // InternalGrocery.g:4985:1: rule__Customer__SaleAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Customer__SaleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:4989:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:4990:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:4990:2: ( ( RULE_ID ) )
            // InternalGrocery.g:4991:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomerAccess().getSaleSaleCrossReference_6_0()); 
            // InternalGrocery.g:4992:3: ( RULE_ID )
            // InternalGrocery.g:4993:4: RULE_ID
            {
             before(grammarAccess.getCustomerAccess().getSaleSaleIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getSaleSaleIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCustomerAccess().getSaleSaleCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__SaleAssignment_6"


    // $ANTLR start "rule__Vehicle__NameAssignment_1"
    // InternalGrocery.g:5004:1: rule__Vehicle__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Vehicle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5008:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5009:2: ( RULE_ID )
            {
            // InternalGrocery.g:5009:2: ( RULE_ID )
            // InternalGrocery.g:5010:3: RULE_ID
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
    // InternalGrocery.g:5019:1: rule__Vehicle__PlateNumberAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Vehicle__PlateNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5023:1: ( ( RULE_STRING ) )
            // InternalGrocery.g:5024:2: ( RULE_STRING )
            {
            // InternalGrocery.g:5024:2: ( RULE_STRING )
            // InternalGrocery.g:5025:3: RULE_STRING
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


    // $ANTLR start "rule__Vehicle__ItemsAssignment_6"
    // InternalGrocery.g:5034:1: rule__Vehicle__ItemsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Vehicle__ItemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5038:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5039:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5039:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5040:3: ( RULE_ID )
            {
             before(grammarAccess.getVehicleAccess().getItemsItemCrossReference_6_0()); 
            // InternalGrocery.g:5041:3: ( RULE_ID )
            // InternalGrocery.g:5042:4: RULE_ID
            {
             before(grammarAccess.getVehicleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVehicleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getVehicleAccess().getItemsItemCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle__ItemsAssignment_6"


    // $ANTLR start "rule__Delivery__NameAssignment_1"
    // InternalGrocery.g:5053:1: rule__Delivery__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Delivery__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5057:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5058:2: ( RULE_ID )
            {
            // InternalGrocery.g:5058:2: ( RULE_ID )
            // InternalGrocery.g:5059:3: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__NameAssignment_1"


    // $ANTLR start "rule__Delivery__FromWarehouseAssignment_5"
    // InternalGrocery.g:5068:1: rule__Delivery__FromWarehouseAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__FromWarehouseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5072:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5073:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5073:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5074:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseCrossReference_5_0()); 
            // InternalGrocery.g:5075:3: ( RULE_ID )
            // InternalGrocery.g:5076:4: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDeliveryAccess().getFromWarehouseWarehouseCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__FromWarehouseAssignment_5"


    // $ANTLR start "rule__Delivery__ToStoreAssignment_8"
    // InternalGrocery.g:5087:1: rule__Delivery__ToStoreAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__ToStoreAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5091:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5092:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5092:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5093:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getToStoreStoreCrossReference_8_0()); 
            // InternalGrocery.g:5094:3: ( RULE_ID )
            // InternalGrocery.g:5095:4: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getToStoreStoreIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getToStoreStoreIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getDeliveryAccess().getToStoreStoreCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__ToStoreAssignment_8"


    // $ANTLR start "rule__Delivery__ItemsAssignment_9"
    // InternalGrocery.g:5106:1: rule__Delivery__ItemsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Delivery__ItemsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5110:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5111:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5111:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5112:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryAccess().getItemsItemCrossReference_9_0()); 
            // InternalGrocery.g:5113:3: ( RULE_ID )
            // InternalGrocery.g:5114:4: RULE_ID
            {
             before(grammarAccess.getDeliveryAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getDeliveryAccess().getItemsItemCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delivery__ItemsAssignment_9"


    // $ANTLR start "rule__Sale__NameAssignment_1"
    // InternalGrocery.g:5125:1: rule__Sale__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sale__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5129:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5130:2: ( RULE_ID )
            {
            // InternalGrocery.g:5130:2: ( RULE_ID )
            // InternalGrocery.g:5131:3: RULE_ID
            {
             before(grammarAccess.getSaleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__NameAssignment_1"


    // $ANTLR start "rule__Sale__FromShelfAssignment_5"
    // InternalGrocery.g:5140:1: rule__Sale__FromShelfAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Sale__FromShelfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5144:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5145:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5145:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5146:3: ( RULE_ID )
            {
             before(grammarAccess.getSaleAccess().getFromShelfShelfCrossReference_5_0()); 
            // InternalGrocery.g:5147:3: ( RULE_ID )
            // InternalGrocery.g:5148:4: RULE_ID
            {
             before(grammarAccess.getSaleAccess().getFromShelfShelfIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getFromShelfShelfIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSaleAccess().getFromShelfShelfCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__FromShelfAssignment_5"


    // $ANTLR start "rule__Sale__ItemsAssignment_6"
    // InternalGrocery.g:5159:1: rule__Sale__ItemsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Sale__ItemsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5163:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5164:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5164:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5165:3: ( RULE_ID )
            {
             before(grammarAccess.getSaleAccess().getItemsItemCrossReference_6_0()); 
            // InternalGrocery.g:5166:3: ( RULE_ID )
            // InternalGrocery.g:5167:4: RULE_ID
            {
             before(grammarAccess.getSaleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSaleAccess().getItemsItemIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSaleAccess().getItemsItemCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sale__ItemsAssignment_6"


    // $ANTLR start "rule__StockMovement__NameAssignment_1"
    // InternalGrocery.g:5178:1: rule__StockMovement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StockMovement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5182:1: ( ( RULE_ID ) )
            // InternalGrocery.g:5183:2: ( RULE_ID )
            {
            // InternalGrocery.g:5183:2: ( RULE_ID )
            // InternalGrocery.g:5184:3: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__NameAssignment_1"


    // $ANTLR start "rule__StockMovement__FromBackroomAssignment_5"
    // InternalGrocery.g:5193:1: rule__StockMovement__FromBackroomAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__FromBackroomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5197:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5198:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5198:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5199:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomBackroomCrossReference_5_0()); 
            // InternalGrocery.g:5200:3: ( RULE_ID )
            // InternalGrocery.g:5201:4: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getFromBackroomBackroomIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getFromBackroomBackroomIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getStockMovementAccess().getFromBackroomBackroomCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__FromBackroomAssignment_5"


    // $ANTLR start "rule__StockMovement__ToShelfAssignment_8"
    // InternalGrocery.g:5212:1: rule__StockMovement__ToShelfAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__ToShelfAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5216:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5217:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5217:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5218:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getToShelfShelfCrossReference_8_0()); 
            // InternalGrocery.g:5219:3: ( RULE_ID )
            // InternalGrocery.g:5220:4: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getToShelfShelfIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getToShelfShelfIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getStockMovementAccess().getToShelfShelfCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__ToShelfAssignment_8"


    // $ANTLR start "rule__StockMovement__ItemsAssignment_9"
    // InternalGrocery.g:5231:1: rule__StockMovement__ItemsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__StockMovement__ItemsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGrocery.g:5235:1: ( ( ( RULE_ID ) ) )
            // InternalGrocery.g:5236:2: ( ( RULE_ID ) )
            {
            // InternalGrocery.g:5236:2: ( ( RULE_ID ) )
            // InternalGrocery.g:5237:3: ( RULE_ID )
            {
             before(grammarAccess.getStockMovementAccess().getItemsItemCrossReference_9_0()); 
            // InternalGrocery.g:5238:3: ( RULE_ID )
            // InternalGrocery.g:5239:4: RULE_ID
            {
             before(grammarAccess.getStockMovementAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStockMovementAccess().getItemsItemIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getStockMovementAccess().getItemsItemCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StockMovement__ItemsAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003BB4E0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000003A000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001480002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});

}